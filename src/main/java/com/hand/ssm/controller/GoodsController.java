package com.hand.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hand.ssm.dao.GoodsDao;
import com.hand.ssm.dto.Goods;

@Controller
public class GoodsController {
	
	@Autowired
	GoodsDao goodsDao;

	@RequestMapping("/SessionTest")
	public String SessionTest( HttpServletRequest request, HttpServletResponse response, HttpSession session){

		session.setAttribute("SESSION_USERID","123456");
		String Lid = session.getAttribute("SESSION_USERID").toString();
		System.out.println("Lid ="+Lid );
		return "addgoods";

	}

	@RequestMapping("/good")
	public String getGood(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		long id = Long.valueOf(request.getParameter("id"));
		
		Goods goods = goodsDao.getGoodByPrimaryKey(id);
//		System.out.println(goods.getName()  );

		request.setAttribute("good", goods);
		
//		modelAndView.addObject("oldWebsite", goods);
//		modelAndView.setViewName("success");
//		return modelAndView ;


		return "success";

	}

    @RequestMapping("/listall")
    public String listallGood(Model model, HttpServletRequest request, HttpServletResponse response){
        long id = Long.valueOf(request.getParameter("id"));
        System.out.println("id ="+id );
        List<Goods> goods = goodsDao.getGoodsAll();
		model.addAttribute("good", goods);
		return "listall";

    }

	@ResponseBody
	@RequestMapping("/listalljson")
	public List<Goods> listallGood_json(Model model, HttpServletRequest request, HttpServletResponse response){
		List<Goods> goods = goodsDao.getGoodsAll();
	    return goods;
	}


	@RequestMapping("/goodslist")
	public String goodslist(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		return "goods_list";
	}

	@RequestMapping("/goodsinfo")
	public String goodsinfo(Model model, HttpServletRequest request, HttpServletResponse response){
		long id = Long.valueOf(request.getParameter("id"));
		model.addAttribute("goodid", id);
		return "goods_info";
	}

    @ResponseBody
    @RequestMapping("/getgoodsinfojson")
    public String  getgoodsinfojson(HttpServletRequest request) {
		long id = Long.valueOf(request.getParameter("id"));
		System.out.println("id ="+id );
		Goods goods = goodsDao.getGoodByPrimaryKey(id);
        JSONObject Jsonresult = new JSONObject();
        Jsonresult.put("goodmingcheng", goods.getName());
        Jsonresult.put("goodjiage", "2000");
        Jsonresult.put("goodkuchun", "800");
        return Jsonresult.toString();
    }
	
	@RequestMapping("/deletebyid")
	public String deletebyid(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		long id = Long.valueOf(request.getParameter("id"));
		goodsDao.deleteGoodById(id);
		return "listall";

	}
	
	@RequestMapping("/addgoods")
	public String addgoods(ModelAndView modelAndView, HttpServletRequest request, HttpServletResponse response){
		
		return "addgoods";

	}
	@RequestMapping("/addgoodsok")
	public String addgoodsok(Model  model, HttpServletRequest request, HttpServletResponse response){
		float goodsprice = Float.parseFloat(request.getParameter("goodsprice"));
		String goodname=request.getParameter("goodsname");
		Goods goods = new Goods();
		goods.setName(goodname);
		goods.setPrice(goodsprice);
		
		goodsDao.addgoods(goods);
		
		List<Goods> goods2 = goodsDao.getGoodsAll();
		model.addAttribute("good", goods2);
		
		return "listall";

	}

}
