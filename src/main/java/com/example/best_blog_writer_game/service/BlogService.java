package com.example.best_blog_writer_game.service;


import com.example.best_blog_writer_game.model.BlogEntry;
import com.example.best_blog_writer_game.repository.BlogEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    @Autowired
    private BlogEntryRepository blogEntryRepository;

    public void submitBlog(BlogEntry blogEntry) {
        // Validate blog entry (e.g., length, title inclusion)
        if (blogEntry.getText().length() > 0 && blogEntry.getAuthor() != null) {
            blogEntryRepository.save(blogEntry);
        }
    }

}
