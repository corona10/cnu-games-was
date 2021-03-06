package kr.ac.cnu.repository;

import kr.ac.cnu.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by rokim on 2017. 5. 31..
 */
public interface CommentRepository extends JpaRepository<Comment, Integer>{
    Comment findByIdx(int idx);
}
