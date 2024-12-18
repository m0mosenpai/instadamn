package com.facebook.msys.mci;

import X.C6ED;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;

/* loaded from: classes3.dex */
public class PrivacyContextCoding {
    public static final PrivacyContextCoding $redex_init_class = null;

    public static native PrivacyContext newPrivacyContextAllTransportNative(SqliteHolder sqliteHolder);

    public static native PrivacyContext newPrivacyContextNative(SqliteHolder sqliteHolder, String str, String str2);

    public static native PrivacyContext newPrivacyContextWithTransportKeyNative(SqliteHolder sqliteHolder, String str);

    static {
        C6ED.A00();
    }
}
