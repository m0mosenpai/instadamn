package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.facebook.catalyst.modules.storage.AsyncStorageModule;

/* loaded from: classes10.dex */
public final class Q27 extends SQLiteOpenHelper {
    public static Q27 A02;
    public Context A00;
    public SQLiteDatabase A01;

    public static synchronized void A01(Q27 q27) {
        synchronized (q27) {
            SQLiteDatabase sQLiteDatabase = q27.A01;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                q27.A01.close();
                q27.A01 = null;
            }
        }
    }

    public static synchronized boolean A02(Q27 q27) {
        boolean deleteDatabase;
        synchronized (q27) {
            A01(q27);
            deleteDatabase = q27.A00.deleteDatabase("RKStorage");
        }
        return deleteDatabase;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:34)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:24)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:209)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:50)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final synchronized void A03() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r0 = r4.A01     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto Lc
            goto L35
        Lc:
            r3 = 0
            r2 = 0
            goto L12
        Lf:
            A02(r4)     // Catch: android.database.sqlite.SQLiteException -> L19 java.lang.Throwable -> L38
        L12:
            android.database.sqlite.SQLiteDatabase r0 = r4.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L19 java.lang.Throwable -> L38
            r4.A01 = r0     // Catch: android.database.sqlite.SQLiteException -> L19 java.lang.Throwable -> L38
            goto L2b
        L19:
            r3 = move-exception
            r0 = 30
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L20 java.lang.Throwable -> L38
            goto L23
        L20:
            X.AbstractC58318PtA.A18()     // Catch: java.lang.Throwable -> L38
        L23:
            int r2 = r2 + 1
            r0 = 2
            if (r2 >= r0) goto L2b
            if (r2 <= 0) goto L12
            goto Lf
        L2b:
            android.database.sqlite.SQLiteDatabase r2 = r4.A01     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L37
            r0 = 6291456(0x600000, double:3.1083923E-317)
            r2.setMaximumSize(r0)     // Catch: java.lang.Throwable -> L38
        L35:
            monitor-exit(r4)
            return
        L37:
            throw r3     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q27.A03():void");
    }

    public static SQLiteDatabase A00(AsyncStorageModule asyncStorageModule) {
        SQLiteDatabase sQLiteDatabase;
        Q27 q27 = asyncStorageModule.mReactDatabaseSupplier;
        synchronized (q27) {
            q27.A03();
            sQLiteDatabase = q27.A01;
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            A02(this);
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C0fW.A00(-1817878435);
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
        C0fW.A00(1097570610);
    }
}
