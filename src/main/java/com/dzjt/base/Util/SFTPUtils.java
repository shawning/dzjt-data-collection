package com.dzjt.base.Util;

import com.jcraft.jsch.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class SFTPUtils {
	private Logger log = LoggerFactory.getLogger(SFTPUtils.class);

	Session session = null;
	Channel channel = null;

	public static final String SFTP_REQ_HOST = "host";
	public static final String SFTP_REQ_PORT = "port";
	public static final String SFTP_REQ_USERNAME = "username";
	public static final String SFTP_REQ_PASSWORD = "password";
	public static final int SFTP_DEFAULT_PORT = 22;
	public static final String SFTP_REQ_LOC = "location";

	public static void downloadFile(String src, String dst, Map<String, String> sftpDetails) throws Exception {
		SFTPUtils sftpUtil = new SFTPUtils();
		ChannelSftp chSftp = sftpUtil.getChannel(sftpDetails, 160000);
		try {
			// 下载文件
			dst.replace("\\", "/");
			int lastFirst = dst.lastIndexOf("/");
			String path = dst.substring(0, lastFirst);
			File localPath = new File(path);
			if (!localPath.exists()) {// 路径不存在则创建本地目录
				localPath.mkdirs();
			}
			chSftp.get(src, dst);
		} catch (Exception e) {
			throw e;
		} finally {
			chSftp.quit();
			sftpUtil.closeChannel();
		}
	}

	public static void uploadFile(String src, String dst, Map<String, String> sftpDetails) throws Exception {
		SFTPUtils sftpUtil = new SFTPUtils();
		ChannelSftp chSftp = sftpUtil.getChannel(sftpDetails, 60000);
		try {
			// 上传文件
			chSftp.put(src, dst);
		} catch (Exception e) {
			throw e;
		} finally {
			chSftp.quit();
			sftpUtil.closeChannel();
		}
	}

	/**
	 * 根据ip，用户名及密码得到一个SFTP channel对象，即ChannelSftp的实例对象，在应用程序中就可以使用该对象来调用SFTP的各种操作方法
	 * 
	 * @param sftpDetails
	 * @param timeout
	 * @return
	 * @throws JSchException
	 */
	public ChannelSftp getChannel(Map<String, String> sftpDetails, int timeout) throws JSchException {
		String ftpHost = sftpDetails.get("SFTP_REQ_HOST");
		String port = sftpDetails.get("SFTP_REQ_PORT");
		String ftpUserName = sftpDetails.get("SFTP_REQ_USERNAME");
		String ftpPassword = sftpDetails.get("SFTP_REQ_PASSWORD");
		String ftpPrivateKey = sftpDetails.get("SFTP_REQ_PRIVATE_KEY");

		int ftpPort = SFTP_DEFAULT_PORT;
		if (port != null && !port.equals("")) {
			ftpPort = Integer.valueOf(port);
		}

//		// 获取容器资源解析器
//		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		// 获取所有匹配的文件
//		String privateKeyPath = "";
//		try {
//			Resource[] resources = resolver.getResources(ftpPrivateKey);
//			for (Resource resource : resources) {
//				// 获得文件流，因为在jar文件中，不能直接通过文件资源路径拿到文件，但是可以在jar包中拿到文件流
//				privateKeyPath = resource.getURI().getPath();
//				break;
//			}
//		} catch (IOException e) {
//			if (log.isWarnEnabled()) {
//                log.warn("读取dzjt_ftp_server_key失败！ " + e);
//            }
//		}

		JSch jsch = new JSch(); // 创建JSch对象

		if (ftpPrivateKey != null) {
			jsch.addIdentity(ftpPrivateKey);// 设置私钥
			log.info("sftp connect,path of private key file：{}", ftpPrivateKey);
		}else {
			log.info("sftp connect,path of private key file：{}", ftpPrivateKey);
		}
		
		log.info("sftp connect by host:{} username:{}", ftpHost, ftpUserName);

		session = jsch.getSession(ftpUserName, ftpHost, ftpPort); // 根据用户名，主机ip，端口获取一个Session对象

		log.info("Session is build");
		if (ftpPassword != null) {
			session.setPassword(ftpPassword); // 设置密码
		}
		Properties config = new Properties();
		config.put("StrictHostKeyChecking", "no");
		session.setConfig(config); // 为Session对象设置properties
		session.setTimeout(timeout); // 设置timeout时间
		session.connect(5000); // 通过Session建立链接
		log.info("Session is connected");
		channel = session.openChannel("sftp"); // 打开SFTP通道
		channel.connect(); // 建立SFTP通道的连接
		log.info("channel is connected");
		log.info(String.format("sftp server host:[%s] port:[%s] is connect successfull", ftpHost, ftpPort));
		return (ChannelSftp) channel;
	}

	public void closeChannel() throws Exception {
		if (channel != null) {
			channel.disconnect();
			log.info("sftp is closed already");
		}
		if (session != null) {
			session.disconnect();
			log.info("sshSession is closed already");
		}
	}

	public static void main(String[] arg) throws Exception {
		// 获取容器资源解析器
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		// 获取所有匹配的文件
		try {
			Resource[] resources = resolver.getResources("dzjt_ftp_server_key");
			for (Resource resource : resources) {
				// 获得文件流，因为在jar文件中，不能直接通过文件资源路径拿到文件，但是可以在jar包中拿到文件流
				System.out.println(resource.getFilename());
				System.out.println(resource.getURL());
				System.out.println(resource.getURI().getPath());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 设置主机ip，端口，用户名，密码
		/*
		 * Map<String, String> sftpDetails = new HashMap<String, String>();
		 * sftpDetails.put(SFTP_REQ_HOST, "192.168.12.182");
		 * sftpDetails.put(SFTP_REQ_USERNAME, "abc"); sftpDetails.put(SFTP_REQ_PASSWORD,
		 * "abc@1"); sftpDetails.put(SFTP_REQ_PORT, "2222");
		 */

		/*
		 * // 测试文件下载 String srcFilename = "/FlashFXP绿色版.rar"; String dstFilename =
		 * "F:/ftp-test/FlashFXP绿色版.rar"; downloadFile(srcFilename, dstFilename,
		 * sftpDetails);
		 */
	}
}