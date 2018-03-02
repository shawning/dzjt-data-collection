package com.dzjt.base.Util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * file 工具类
 * 
 *
 *
 */
public class FileUtils {

	private static Logger logger = LoggerFactory.getLogger(FileUtils.class);
	/**
	 * 创建一个txt文件,如果创建成功返回true,失败 true
	 * 
	 * @return
	 */
	public static boolean createFile(String filePath) {
		logger.info("创建文件" + filePath);
		boolean flag = false;
		File newFile = new File(filePath);// 给文件初始化一个地址
		if (!newFile.exists())// 判断文件是否存在 避免重复
		{
			try {
				//检查文件夹路径是否存在
				String tempFolder = filePath.substring(0, filePath.lastIndexOf(File.separator));
				
				if(!findByFilepath(new File(tempFolder))) {
					//如果不存在则创建文件夹
					createDir(tempFolder);
				}
				
				newFile.createNewFile();// 创建
			} catch (IOException e) {
				logger.info("创建失败" + filePath);
			}
			flag = true;
		}
		return flag;
	}

	/*
	 * public static String readTxtFile(String filePath) { String result = "";
	 * String thisLine = null; File file = new File(filePath); if(file.exists() &&
	 * file.isFile()) { try { BufferedReader br = new BufferedReader(new
	 * InputStreamReader(in, filePath)); while ((thisLine = br.readLine()) != null)
	 * { result += thisLine + "\n";//逐行读取内容 } br.close();//释放资源 }catch
	 * (FileNotFoundException e) { e.printStackTrace(); } } return result; }
	 */

	/**
	 * 向txt 写入内容， 并且可以选择原来的基础上追加新内容，也可以覆盖内容
	 * 
	 * @param content
	 * @param filePath
	 * @return
	 */
	public static boolean writeTxtFile(String content, String filePath) {
		logger.info("写入文件时间:" + DateUtils.getCurrentDateTime());

		String fileEncode = System.getProperty("file.encoding");

		boolean flag = false;
		File thisFile = new File(filePath);
		try {
			if (!thisFile.exists()) {
				thisFile.createNewFile();
			}

			OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream(thisFile), fileEncode);
			ow.write(content);
			ow.flush();
			ow.close();
			flag = true;
		} catch (IOException e) {
			logger.info("写入失败,文件路径" + filePath + "/r/n失败信息：" + e);
			flag = false;
		}

		return flag;
	}

	/**
	 * 创建文件夹
	 * 
	 * @param destDirName
	 * @return
	 */
	public static boolean createDir(String destDirName) {
		logger.info("创建文件夹" + destDirName);
		File dir = new File(destDirName);
		if (dir.exists()) {
			logger.info("创建目录" + destDirName + "失败，目标目录已经存在");
			return false;
		}
		if (!destDirName.endsWith(File.separator)) {
			destDirName = destDirName + File.separator;
		}
		// 创建目录
		if (dir.mkdirs()) {

			logger.info("创建目录" + destDirName + "成功！");
			return true;
		} else {

			logger.info("创建目录" + destDirName + "失败！");
			return false;
		}
	}

	/**
	 * 判断文件里面是否有文件
	 * 
	 * @param file
	 * @return
	 */
	public static boolean findByFilepath(File file) {
		boolean flag = false;
		if (file.exists()) {
			if (file.isDirectory()) {
				flag = true;
				logger.info("文件夹存在");
			} else {
				flag = true;
				logger.info("文件存在");
			}
		} else {
			flag = false;
			logger.info("文件或文件夹不存在");
		}
		return flag;
	}

	/**
	 * 删除文件夹下所有路径
	 * 
	 * @param path
	 *            文件夹完整绝对路径
	 * @return
	 */
	public static boolean delAllFile(String path) {
		boolean flag = false;
		File file = new File(path);
		if (!file.exists()) {
			return flag;
		}
		if (!file.isDirectory()) {
			return flag;
		}
		String[] tempList = file.list();
		File temp = null;
		for (int i = 0; i < tempList.length; i++) {
			if (path.endsWith(File.separator)) {
				temp = new File(path + tempList[i]);
			} else {
				temp = new File(path + File.separator + tempList[i]);
			}
			if (temp.isFile()) {
				temp.delete();
			}
			
			if (temp.isDirectory()) {
				delAllFile(path + File.separator + tempList[i]);// 先删除文件夹里面的文件
				delFolder(path + File.separator + tempList[i]);// 再删除空文件夹
				flag = true;
			}
		}
		
		if(flag) {
			delFolder(path);
		}
		return flag;
	}
	

	private static void delFolder(String folderPath) {
		try {
			delAllFile(folderPath); // 删除完里面所有内容
			String filePath = folderPath;
			filePath = filePath.toString();
			java.io.File myFilePath = new java.io.File(filePath);
			myFilePath.delete(); // 删除空文件夹
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}