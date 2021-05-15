package pl.RK.PAIEVENTREST.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.RK.PAIEVENTREST.models.Comment;
import pl.RK.PAIEVENTREST.models.EventPAI;
import pl.RK.PAIEVENTREST.models.UserPAI;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {

    public List<Comment> findByEventPAI(EventPAI eventPAI);


    public List<Comment> findByUserPai (UserPAI userPAI);
}
