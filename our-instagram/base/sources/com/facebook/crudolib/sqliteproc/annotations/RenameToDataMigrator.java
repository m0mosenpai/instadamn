package com.facebook.crudolib.sqliteproc.annotations;

import X.C72677Xkx;
import X.InterfaceC73602YNe;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes12.dex */
public class RenameToDataMigrator implements InterfaceC73602YNe {
    @Override // X.InterfaceC73602YNe
    public final void Cpc(SQLiteDatabase sQLiteDatabase, C72677Xkx c72677Xkx) {
        throw new SQLException("Cannot rename to a null column name.");
    }
}
