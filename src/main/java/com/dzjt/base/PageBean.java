package com.dzjt.base;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * table翻页实现
 * @author xiaoning
 *
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public final class PageBean<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	//当前页
	private int pageNum;
	//每页的数量
	private int pageSize;
	//总记录数
	private long total;
	//总页数
	private int pages;
	//结果集
	private List<T> list;
	//是否为第一页
	private boolean isFirstPage = false;
	//是否为最后一页
	private boolean isLastPage = false;

	//返回rows和total之类的翻页数据，如easyUI dataGrid数据格式
	private Map<String, Object> pageData = new HashMap<String, Object>();

	public PageBean() {
	}

	/**
	 * 包装Page对象
	 *
	 * @param list
	 */
	public PageBean(List<T> list) {
		if (list instanceof Page) {
			Page page = (Page) list;
			this.pageNum = page.getPageNum();
			this.pageSize = page.getPageSize();

			this.pages = page.getPages();
			this.list = page;
			this.total = page.getTotal();
		} else if (list instanceof Collection) {
			this.pageNum = 1;
			this.pageSize = list.size();

			this.pages = 1;
			this.list = list;
			this.total = list.size();
		}
		if (list instanceof Collection) {
			//判断页面边界
			judgePageBoudary();
		}
		this.pageData.put("total", 0);
		this.pageData.put("rows", null);
		if (this.list != null) {
			if (this.list != null && this.list.size() > 0) {
				this.pageData.put("rows", this.list);
				this.pageData.put("total", this.getTotal());
			}
		}
	}

	/**
	 * 判定页面边界
	 */
	private void judgePageBoudary() {
		isFirstPage = pageNum == 1;
		isLastPage = pageNum == pages;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public boolean isIsFirstPage() {
		return isFirstPage;
	}

	public void setIsFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public boolean isIsLastPage() {
		return isLastPage;
	}

	public void setIsLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

	public Map<String, Object> getPageData() {
		return pageData;
	}

	public void setPageData(Map<String, Object> pageData) {
		this.pageData = pageData;
	}

	public String toString() {
		final StringBuffer sb = new StringBuffer("PageBean{");
		sb.append("pageNum=").append(pageNum);
		sb.append(", pageSize=").append(pageSize);
		sb.append(", total=").append(total);
		sb.append(", pages=").append(pages);
		sb.append(", list=").append(list);
		sb.append(", isFirstPage=").append(isFirstPage);
		sb.append(", isLastPage=").append(isLastPage);
		sb.append(", navigatepageNums=");
		sb.append('}');
		return sb.toString();
	}
	
}
