package basemag.service;

import java.util.List;

import beans.Bank;
import beans.Page;

public interface IBankService {
	
	/**
	 * 查看所有银行信息
	 * @return PageBean 分页Bean对象
	 */
	public Page findAllBank();
	
	/**
	 * 新添银行
	 * @param bank
	 */
	public void addBank(Bank bank);
	
	/**
	 * 修改银行
	 * @param bank 
	 */
	public void updateBank(Bank bank);
	
	/**
	 * 删除银行
	 * @param id
	 */
	public void deleteBank(Long id);

}
