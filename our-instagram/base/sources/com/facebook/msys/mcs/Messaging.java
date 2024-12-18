package com.facebook.msys.mcs;

import X.C137306Jk;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

@Deprecated
/* loaded from: classes3.dex */
public class Messaging {
    public static native boolean setContactSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2);

    public static native boolean setMailboxSyncParamsNative(SqliteHolder sqliteHolder, Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, Integer num6, String str, String str2, Integer num7);

    static {
        C137306Jk.A00();
    }
}
