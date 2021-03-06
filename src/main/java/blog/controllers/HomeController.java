package blog.controllers;

import blog.models.Post;
import blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by UmarHussain on 9/18/2016.
 */
@Controller
public class HomeController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public String index(Model model){
        List<Post> latest5Posts = postService.findLatest5();
        List<Post> latest3Posts = latest5Posts.stream()
                .limit(3).collect(Collectors.toList());
        model.addAttribute("latest3posts", latest3Posts);
        model.addAttribute("latest5posts",latest5Posts);
        return "index-new";
    }
}
