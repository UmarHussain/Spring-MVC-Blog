package blog.services;

import blog.models.Post;

import java.util.List;

/**
 * Created by UmarHussain on 9/18/2016.
 * this  service will be implemente to create
 * PostServiceImpl class and all the bussnicess logic will be there
 */
public interface PostService {

    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
