package youthcon.blog.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import youthcon.blog.service.PostService;
import youthcon.blog.web.dto.PostSaveRequestDto;

@RestController
public class PostApiController {
    private PostService postservice;

    public PostApiController(PostService postservice) {
        this.postservice = postservice;
    }
    @PostMapping("/api/posts")
    public ResponseEntity save(@RequestBody PostSaveRequestDto requestDto) {
        postservice.save(requestDto);
        return ResponseEntity.ok().build();
    }
}
