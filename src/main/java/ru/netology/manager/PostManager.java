package ru.netology.manager;

import ru.netology.post.Post;

public class PostManager {
    private Post[] posts;

    public Post[] search(
            int authorId,
            String authorUrl,
            String query,
            boolean isOwnersOnly,
            int count,
            int offset) {
        for (Post post:posts) {
            // ... поиск записей в posts
        }

        return null;
    }

    public void delete(int postId, int authorId) {
        // ... удаление поста
    }
}
