package io.github.glascode.estateagency.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import io.github.glascode.estateagency.model.Comment;

import java.util.List;

@Dao
public interface CommentDao {

	@Query("SELECT * FROM Comment WHERE id = :commentId")
	Comment getProperty(String commentId);

	@Query("SELECT * FROM Comment WHERE property_id = :propertyId")
	List<Comment> getCommentsFromPropertyId(String propertyId);

	@Insert
	void insertComment(Comment comment);

	@Update
	void updateComment(Comment comment);

	@Delete
	void deleteComment(Comment comment);

}
