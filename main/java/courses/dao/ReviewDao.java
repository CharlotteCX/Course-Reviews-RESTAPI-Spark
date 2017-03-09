package courses.dao;

import java.util.List;
import courses.exc.DaoException;
import courses.model.Review;

/**
 * Created by chenxi on 2017-03-04.
 */
public interface ReviewDao {
  void add(Review review) throws DaoException;

  List<Review> findAll();


  List<Review> findByCourseId(int courseId);
}
