package com.facebook.msys.mcd;

import X.C137306Jk;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes3.dex */
public class DatabaseOpenCallback extends Database.OpenCallback {
    private native boolean onConfigNative(SqliteHolder sqliteHolder, int i, boolean z, long j);

    static {
        C137306Jk.A00();
    }

    @Override // com.facebook.msys.mci.Database.OpenCallback
    public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
        onConfig(sqliteHolder, i, databaseConnectionSettings);
        if (!onConfigNative(sqliteHolder, i, z, j)) {
            return false;
        }
        return true;
    }
}
