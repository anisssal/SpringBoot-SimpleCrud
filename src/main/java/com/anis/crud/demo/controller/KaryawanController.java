package com.anis.crud.demo.controller;

import com.anis.crud.demo.model.Karyawan;
import com.anis.crud.demo.service.KaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created By Anis
 * created on 3/25/2020 - 9:02 AM on demo
 */
@Controller
public class KaryawanController {

    private KaryawanService karyawanService;

    @Autowired
    public KaryawanController(KaryawanService karyawanService) {
        this.karyawanService = karyawanService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List listKaryawan = karyawanService.getAllKaryawan();
        model.addAttribute("karyawans", listKaryawan);
        return "index";
    }

    @RequestMapping(value = "addkaryawan" , method = RequestMethod.GET)
    public String addKaryawan(Model model ) {
        model.addAttribute("karyawan", new Karyawan());
        return "addkaryawan";
    }

    @RequestMapping(value = "addkaryawan", method = RequestMethod.POST)
    public String insertKaryawan(Karyawan karyawan) {
        karyawanService.saveOrUpdate(karyawan);
        return "redirect:/";

    }


}
