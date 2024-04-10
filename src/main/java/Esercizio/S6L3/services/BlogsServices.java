package Esercizio.S6L3.services;

import Esercizio.S6L3.entities.Blog;
import Esercizio.S6L3.exceptions.NotFoundException;
import Esercizio.S6L3.repositories.BlogsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class BlogsServices {
    @Autowired
    private BlogsDAO blogsDAO;
    private List<Blog> blogsList = new ArrayList<>();
    public List<Blog> getBlogsList(){
        return  this.blogsDAO.findAll();
    }
    public Blog saveBlog (Blog body){
        UUID uuid = UUID.randomUUID();
        body.setId(uuid);
        this.blogsList.add(body);
        return body;
    }
    public Blog findById(UUID blogId) {
        Blog found = null;
        for (Blog blog : this.blogsList) {
            if (blog.getId().equals(id)) {
                found = blog;
                break;
            }
        }
        if (found == null) {
            throw new NotFoundException(id.toString());
        } else {
            return found;
        }
    }
//    public Blog findByIdAndUpdate(UUID blogId, Blog modifiedBlog) {}
//    public void findByIdAndDelete(UUID blogId) {}




}
