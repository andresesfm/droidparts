package org.droidparts.test.manager;

import org.droidparts.manager.json.AbstractDBOpenHelper2;
import org.droidparts.model.Entity;
import org.droidparts.test.model.Phone;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBOpenHelper extends AbstractDBOpenHelper2 {

	public DBOpenHelper(Context ctx) {
		super(ctx, "dpt.sqlite", 1);
	}

	@Override
	@SuppressWarnings("unchecked")
	protected Class<? extends Entity>[] getModelClasses() {
		return new Class[] { Phone.class, };
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		dropAll(db, true, true);
	}

}