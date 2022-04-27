package com.hand.ssm.dao;

import java.util.List;

import com.hand.ssm.dto.Goods;

public interface GoodsDao {

	public Goods getGoodByPrimaryKey(long goodId);
	
	public List<Goods> getGoodsAll();
	
	public void deleteGoodById(long goodId);
	
	public void addgoods(Goods goods);
	
	
}
