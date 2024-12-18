package com.facebook.instagram.msys;

import X.C09170dP;
import com.facebook.msys.mci.MsysDatabaseRedactor;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes10.dex */
public class InstagramDatabaseRedactor implements MsysDatabaseRedactor {
    public static native int copyAndRedactDatabaseNative(SqliteHolder sqliteHolder, String str, MsysDatabaseRedactor.ProgressCallback progressCallback);

    @Override // com.facebook.msys.mci.MsysDatabaseRedactor
    public int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str) {
        return copyAndRedactDatabaseNative(sqliteHolder, str, null);
    }

    static {
        C09170dP.A0C("instagramDatabaseRedactor-jni");
    }

    @Override // com.facebook.msys.mci.MsysDatabaseRedactor
    public int copyAndRedactDatabase(SqliteHolder sqliteHolder, String str, MsysDatabaseRedactor.ProgressCallback progressCallback) {
        return copyAndRedactDatabaseNative(sqliteHolder, str, progressCallback);
    }
}
