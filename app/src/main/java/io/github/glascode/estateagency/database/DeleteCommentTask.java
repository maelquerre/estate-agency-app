package io.github.glascode.estateagency.database;

import android.content.Context;
import android.os.AsyncTask;
import io.github.glascode.estateagency.model.Comment;

public class DeleteCommentTask extends AsyncTask<Void, Void, Void> {

	private Context context;
	private Comment comment;

	public DeleteCommentTask(Context context, Comment comment) {
		this.context = context;
		this.comment = comment;
	}

	@Override
	protected Void doInBackground(Void... voids) {
		Database.getInstance(context).commentDao().deleteComment(comment);

		return null;
	}
}
