package com.entity.vo;

import com.entity.ChangdiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 场地预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-16 11:17:23
 */
public class ChangdiyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 场地类型
	 */
	
	private String changdileixing;
		
	/**
	 * 场地大小
	 */
	
	private String changdidaxiao;
		
	/**
	 * 场地地址
	 */
	
	private String changdidizhi;
		
	/**
	 * 预约时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yuyueshijian;
		
	/**
	 * 预约备注
	 */
	
	private String yuyuebeizhu;
		
	/**
	 * 使用状态
	 */
	
	private String shiyongzhuangtai;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：场地类型
	 */
	 
	public void setChangdileixing(String changdileixing) {
		this.changdileixing = changdileixing;
	}
	
	/**
	 * 获取：场地类型
	 */
	public String getChangdileixing() {
		return changdileixing;
	}
				
	
	/**
	 * 设置：场地大小
	 */
	 
	public void setChangdidaxiao(String changdidaxiao) {
		this.changdidaxiao = changdidaxiao;
	}
	
	/**
	 * 获取：场地大小
	 */
	public String getChangdidaxiao() {
		return changdidaxiao;
	}
				
	
	/**
	 * 设置：场地地址
	 */
	 
	public void setChangdidizhi(String changdidizhi) {
		this.changdidizhi = changdidizhi;
	}
	
	/**
	 * 获取：场地地址
	 */
	public String getChangdidizhi() {
		return changdidizhi;
	}
				
	
	/**
	 * 设置：预约时间
	 */
	 
	public void setYuyueshijian(Date yuyueshijian) {
		this.yuyueshijian = yuyueshijian;
	}
	
	/**
	 * 获取：预约时间
	 */
	public Date getYuyueshijian() {
		return yuyueshijian;
	}
				
	
	/**
	 * 设置：预约备注
	 */
	 
	public void setYuyuebeizhu(String yuyuebeizhu) {
		this.yuyuebeizhu = yuyuebeizhu;
	}
	
	/**
	 * 获取：预约备注
	 */
	public String getYuyuebeizhu() {
		return yuyuebeizhu;
	}
				
	
	/**
	 * 设置：使用状态
	 */
	 
	public void setShiyongzhuangtai(String shiyongzhuangtai) {
		this.shiyongzhuangtai = shiyongzhuangtai;
	}
	
	/**
	 * 获取：使用状态
	 */
	public String getShiyongzhuangtai() {
		return shiyongzhuangtai;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
