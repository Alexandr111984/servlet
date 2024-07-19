package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    List<Post> all();

    Optional<Post> getById(long id);

    Post save(Post post);

    void removeById(long id);
}