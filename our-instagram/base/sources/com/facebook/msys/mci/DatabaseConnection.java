package com.facebook.msys.mci;

import X.C6ED;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class DatabaseConnection {
    public final NativeHolder mNativeHolder;

    /* loaded from: classes8.dex */
    public interface DatabaseRunnable {
        void run(SqliteHolder sqliteHolder);
    }

    public native void execute(DatabaseRunnable databaseRunnable);

    public native int getMode();

    static {
        C6ED.A00();
    }

    public DatabaseConnection(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
