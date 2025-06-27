package ksmybatis.admin.vendors.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksmybatis.admin.vendors.domain.Vendors;
import ksmybatis.admin.vendors.service.VendorsService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value="/admin/vendors")
@RequiredArgsConstructor
public class VendorsController {
	
	private final VendorsService vendorsService;
	
	@GetMapping("/vendorList")
	public String vendorListView(Model model) {
		
		List<Vendors> vendorList = vendorsService.getVendorList();
		
		model.addAttribute("title", "판매자목록조회");
		model.addAttribute("vendorList", vendorList);
		
		return "admin/vendors/vendorListView";
	}
	
}
