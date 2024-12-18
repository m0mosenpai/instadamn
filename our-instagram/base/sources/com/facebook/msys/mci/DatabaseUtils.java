package com.facebook.msys.mci;

import X.C6ED;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes3.dex */
public class DatabaseUtils {
    public static native int restoreFromExistingDatabase(SqliteHolder sqliteHolder, String str);

    static {
        C6ED.A00();
    }
}
