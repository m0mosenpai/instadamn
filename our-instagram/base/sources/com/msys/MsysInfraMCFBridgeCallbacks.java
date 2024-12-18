package com.msys;

import X.C00O;
import X.C6EU;
import X.C6EW;
import com.facebook.msys.mcf.MsysError;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.simplejni.NativeHolder;
import com.mcftypeholder.McfTypeHolder;

/* loaded from: classes12.dex */
public class MsysInfraMCFBridgeCallbacks {

    /* loaded from: classes3.dex */
    public abstract class MCIDatabaseSchemaDeployer {
        private NativeHolder callbackJNI(SqliteHolder sqliteHolder) {
            int upgrade = ((C6EU) this).A00.upgrade(sqliteHolder);
            NativeHolder MCIDatabaseSchemaDeployerResultCreateDefaultNative = msysInfraMCFBridgejniDispatcher.MCIDatabaseSchemaDeployerResultCreateDefaultNative();
            McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
            msysInfraMCFBridgejniDispatcher.MCIDatabaseSchemaDeployerResultSetSqliteErrorCodeNative(MCIDatabaseSchemaDeployerResultCreateDefaultNative, upgrade);
            return MCIDatabaseSchemaDeployerResultCreateDefaultNative;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class MCIDatabaseVirtualTableModuleRegistrator {
        private int callbackJNI(SqliteHolder sqliteHolder) {
            return ((C6EW) this).A00.register(sqliteHolder);
        }
    }

    /* loaded from: classes8.dex */
    public abstract class MCIDatabaseConfigureCallback {
        public MCIDatabaseConfigureCallback() {
            throw C00O.createAndThrow();
        }

        private boolean callbackJNI(SqliteHolder sqliteHolder, int i, boolean z, NativeHolder nativeHolder) {
            throw C00O.createAndThrow();
        }
    }

    /* loaded from: classes8.dex */
    public abstract class MCIDatabaseFatalErrorHandler {
        public MCIDatabaseFatalErrorHandler() {
            throw C00O.createAndThrow();
        }

        private void callbackJNI(MsysError msysError) {
            throw C00O.createAndThrow();
        }
    }

    /* loaded from: classes8.dex */
    public abstract class MCIDatabaseInitializedCallback {
        public MCIDatabaseInitializedCallback() {
            throw C00O.createAndThrow();
        }

        private void callbackJNI(SqliteHolder sqliteHolder) {
            throw C00O.createAndThrow();
        }
    }

    /* loaded from: classes8.dex */
    public abstract class MCIMailboxDatabaseOpenCallback {
        public MCIMailboxDatabaseOpenCallback() {
            throw C00O.createAndThrow();
        }

        private void callbackJNI(boolean z, AccountSession accountSession, MsysError msysError) {
            throw C00O.createAndThrow();
        }
    }
}
