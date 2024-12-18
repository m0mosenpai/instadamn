package com.facebook.msys.mci;

import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes10.dex */
public interface MsysDatabaseRedactor {

    /* loaded from: classes10.dex */
    public interface ProgressCallback {
    }

    int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str);

    int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str, ProgressCallback progressCallback);
}
