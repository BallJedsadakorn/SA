package ku.cs.crwseal.controller;


import ku.cs.crwseal.entity.Menu;
import ku.cs.crwseal.model.MenuRequest;
import ku.cs.crwseal.service.CategoryService;
import ku.cs.crwseal.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@Controller
@RequestMapping("/menus")
public class MenuController {


    @Autowired
    private MenuService menuService;


    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public String getAllMenus(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        model.addAttribute("menus", menuService.getAllMenus());
        return "menu-all";
    }


    @GetMapping("/add")
    public String getMenuForm(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "menu-add";
    }
    @GetMapping("/{id}")
    public String getOneMenu(@PathVariable UUID id, Model model) {
        Menu menu = menuService.getOneById(id);
        model.addAttribute("menu", menu);
        return "menu-view";
    }


    @PostMapping("/add")
    public String createMenu(@ModelAttribute MenuRequest menu, Model model) {
        menuService.createMenu(menu);
        return "redirect:/menus";
    }
}
