package courses.dao;

import java.util.List;
import courses.exc.DaoException;
import courses.model.Course;

/**
 * Created by chenxi on 2017-03-04.
 */
public interface CourseDao {
  void add(Course course) throws DaoException;

  List<Course> findAll();

  Course findById(int id);
}
