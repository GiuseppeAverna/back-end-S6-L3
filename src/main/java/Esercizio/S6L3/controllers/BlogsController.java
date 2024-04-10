package Esercizio.S6L3.controllers;

import Esercizio.S6L3.entities.Blog;
import Esercizio.S6L3.services.BlogsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/blogs")
public class BlogsController {
    @Autowired
    private BlogsServices blogsService;
    @GetMapping
    public List<Blog> getallBlogs(){
        return this.blogsService.getBlogsList();
    }
    @PostMapping
    public Blog saveBlog(@RequestBody Blog body){
        return this.blogsService.saveBlog(body);
    }
   @GetMapping("/{blogId}")
  public Blog findBlogById(@PathVariable UUID blogId){
        return this.blogsService.findById(blogId);
   }
//    @PutMapping("/{blogId}")
//   private Blog findBlogByIdAndUpdate (@PathVariable UUID blogId, @RequestBody Blog body) {}
//   @DeleteMapping("/{blogId}")
//    private void findBlogByIdAndDelete (@PathVariable UUID blogI) {}
}
