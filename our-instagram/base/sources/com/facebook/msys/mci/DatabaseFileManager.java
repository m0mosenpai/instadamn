package com.facebook.msys.mci;

import X.C6ED;

/* loaded from: classes3.dex */
public class DatabaseFileManager {
    public static native void deleteDatabaseFilesForPathNative(String str);

    public static native void encryptAndDeleteDatabaseNative(long j, String str);

    static {
        C6ED.A00();
    }
}
