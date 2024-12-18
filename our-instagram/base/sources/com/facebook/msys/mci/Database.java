package com.facebook.msys.mci;

import X.C6ED;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes3.dex */
public class Database {
    public NativeHolder mNativeHolder;
    public volatile DatabaseConnection mReadWriteConnection;

    /* loaded from: classes8.dex */
    public class InitializedCallback {
        public void onInit(SqliteHolder sqliteHolder) {
        }
    }

    /* loaded from: classes3.dex */
    public class OpenCallback {
        public void onConfig(SqliteHolder sqliteHolder, int i, DatabaseConnectionSettings databaseConnectionSettings) {
        }

        public void onOpen(boolean z, Throwable th) {
            if (th == null) {
            } else {
                throw new RuntimeException(th);
            }
        }

        public boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, long j, DatabaseConnectionSettings databaseConnectionSettings) {
            onConfig(sqliteHolder, i, databaseConnectionSettings);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public interface SchemaDeployer {
        int upgrade(SqliteHolder sqliteHolder);
    }

    /* loaded from: classes3.dex */
    public interface VirtualTableModuleRegistrator {
        int register(SqliteHolder sqliteHolder);
    }

    static {
        C6ED.A00();
    }

    public Database(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
