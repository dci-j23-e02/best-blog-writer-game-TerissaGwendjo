package com.example.best_blog_writer_game.controller;

import com.example.best_blog_writer_game.model.BlogEntry;
import com.example.best_blog_writer_game.repository.BlogEntryRepository;
import com.example.best_blog_writer_game.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private BlogEntryRepository blogEntryRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<BlogEntry> blogEntries = blogEntryRepository.findAll();
        model.addAttribute("blogEntries", blogEntries);
        return "index"; // Thymeleaf template name
    }

    @GetMapping("/submit")
    public String submitForm(Model model) {
        model.addAttribute("blogEntry", new BlogEntry());
        return "submit"; // Thymeleaf template name
    }

    @PostMapping("/submit")
    public String submitBlog(BlogEntry blogEntry) {
        blogService.submitBlog(blogEntry);
        return "redirect:/";
    }

    @GetMapping("/top")
    public String topEntries(Model model) {
        // Logic to fetch and display top blog entries
        // Assuming some logic here to fetch top entries
        List<BlogEntry> topEntries = blogEntryRepository.findTopEntries();
        model.addAttribute("topEntries", topEntries);
        return "top"; // Thymeleaf template name
    }

}
