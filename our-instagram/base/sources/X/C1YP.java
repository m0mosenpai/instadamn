package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.1YP, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1YP {
    public static final C1YU Companion = new Object();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    public boolean allowMainThreadQueries;
    public AbstractC72458Xe4 autoCloser;
    public final Map backingFieldMap;
    public InterfaceC29101an internalOpenHelper;
    public Executor internalQueryExecutor;
    public Executor internalTransactionExecutor;
    public List mCallbacks;
    public volatile InterfaceC37481ol mDatabase;
    public final Map typeConverters;
    public boolean writeAheadLoggingEnabled;
    public final C28621Zy invalidationTracker = createInvalidationTracker();
    public Map autoMigrationSpecs = new LinkedHashMap();
    public final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public final ThreadLocal suspendingTransactionId = new ThreadLocal();

    public abstract void clearAllTables();

    public InterfaceC37561ot compileStatement(String str) {
        C14360o3.A0B(str, 0);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().CHx().AIj(str);
    }

    public abstract C28621Zy createInvalidationTracker();

    public abstract InterfaceC29101an createOpenHelper(C28381Yz c28381Yz);

    public abstract List getAutoMigrations(Map map);

    public abstract java.util.Set getRequiredAutoMigrationSpecs();

    public abstract Map getRequiredTypeConverters();

    public Object getTypeConverter(Class cls) {
        C14360o3.A0B(cls, 0);
        return this.typeConverters.get(cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r3.set(r2);
        r9.autoMigrationSpecs.put(r5, r4.get(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        r4.set(r2);
        r9.typeConverters.put(r6, r3.get(r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(X.C28381Yz r10) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1YP.init(X.1Yz):void");
    }

    public void internalInitInvalidationTracker(InterfaceC37481ol interfaceC37481ol) {
        C14360o3.A0B(interfaceC37481ol, 0);
        C28621Zy c28621Zy = this.invalidationTracker;
        synchronized (c28621Zy.A02) {
            if (c28621Zy.A0D) {
                android.util.Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
            } else {
                interfaceC37481ol.ATG("PRAGMA temp_store = MEMORY;");
                interfaceC37481ol.ATG("PRAGMA recursive_triggers='ON';");
                interfaceC37481ol.ATG("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                c28621Zy.A02(interfaceC37481ol);
                c28621Zy.A0C = interfaceC37481ol.AIj("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                c28621Zy.A0D = true;
            }
        }
    }

    public final Cursor query(InterfaceC37501on interfaceC37501on) {
        C14360o3.A0B(interfaceC37501on, 0);
        return query(interfaceC37501on, (CancellationSignal) null);
    }

    public Object runInTransaction(Callable callable) {
        C14360o3.A0B(callable, 0);
        beginTransaction();
        try {
            Object call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            internalEndTransaction();
        }
    }

    public final void setAutoMigrationSpecs(Map map) {
        C14360o3.A0B(map, 0);
        this.autoMigrationSpecs = map;
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && !(!isMainThread$room_runtime_release())) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final Map getAutoMigrationSpecs() {
        return this.autoMigrationSpecs;
    }

    public final Map getBackingFieldMap() {
        return this.backingFieldMap;
    }

    public final Lock getCloseLock$room_runtime_release() {
        ReentrantReadWriteLock.ReadLock readLock = this.readWriteLock.readLock();
        C14360o3.A07(readLock);
        return readLock;
    }

    public C28621Zy getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public InterfaceC29101an getOpenHelper() {
        InterfaceC29101an interfaceC29101an = this.internalOpenHelper;
        if (interfaceC29101an == null) {
            C14360o3.A0F("internalOpenHelper");
            throw C00O.createAndThrow();
        }
        return interfaceC29101an;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor == null) {
            C14360o3.A0F("internalQueryExecutor");
            throw C00O.createAndThrow();
        }
        return executor;
    }

    public final ThreadLocal getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor == null) {
            C14360o3.A0F("internalTransactionExecutor");
            throw C00O.createAndThrow();
        }
        return executor;
    }

    public boolean isOpen() {
        Boolean bool;
        InterfaceC37481ol interfaceC37481ol = this.mDatabase;
        if (interfaceC37481ol != null) {
            bool = Boolean.valueOf(((C37471ok) interfaceC37481ol).A00.isOpen());
        } else {
            bool = null;
        }
        return C14360o3.A0K(bool, true);
    }

    public final boolean isOpenInternal() {
        InterfaceC37481ol interfaceC37481ol = this.mDatabase;
        if (interfaceC37481ol != null && ((C37471ok) interfaceC37481ol).A00.isOpen()) {
            return true;
        }
        return false;
    }

    public C1YP() {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        C14360o3.A07(synchronizedMap);
        this.backingFieldMap = synchronizedMap;
        this.typeConverters = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalBeginTransaction() {
        assertNotMainThread();
        InterfaceC37481ol CHx = getOpenHelper().CHx();
        this.invalidationTracker.A02(CHx);
        SQLiteDatabase sQLiteDatabase = ((C37471ok) CHx).A00;
        if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
            C0fW.A02(sQLiteDatabase, 532084787);
        } else {
            CHx.ADS();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalEndTransaction() {
        getOpenHelper().CHx().ASe();
        if (!inTransaction()) {
            C28621Zy c28621Zy = this.invalidationTracker;
            if (c28621Zy.A06.compareAndSet(false, true)) {
                c28621Zy.A01.getQueryExecutor().execute(c28621Zy.A03);
            }
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    public void close() {
        if (isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.readWriteLock.writeLock();
            C14360o3.A07(writeLock);
            writeLock.lock();
            try {
                getOpenHelper().close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        internalEndTransaction();
    }

    public boolean inTransaction() {
        return ((C37471ok) getOpenHelper().CHx()).A00.inTransaction();
    }

    public final boolean isMainThread$room_runtime_release() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        ((C37471ok) getOpenHelper().CHx()).A00.setTransactionSuccessful();
    }

    public Cursor query(final InterfaceC37501on interfaceC37501on, CancellationSignal cancellationSignal) {
        C14360o3.A0B(interfaceC37501on, 0);
        assertNotMainThread();
        assertNotSuspendingTransaction();
        InterfaceC37481ol CHx = getOpenHelper().CHx();
        if (cancellationSignal != null) {
            SQLiteDatabase sQLiteDatabase = ((C37471ok) CHx).A00;
            String BzS = interfaceC37501on.BzS();
            String[] strArr = C37471ok.A02;
            SQLiteDatabase.CursorFactory cursorFactory = new SQLiteDatabase.CursorFactory() { // from class: X.APA
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    InterfaceC37501on interfaceC37501on2 = InterfaceC37501on.this;
                    C14360o3.A0A(sQLiteQuery);
                    interfaceC37501on2.ADs(new C37531oq(sQLiteQuery));
                    return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
                }
            };
            C14360o3.A0B(strArr, 2);
            Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, BzS, strArr, null, cancellationSignal);
            C14360o3.A07(rawQueryWithFactory);
            return rawQueryWithFactory;
        }
        return CHx.E7N(interfaceC37501on);
    }

    public void runInTransaction(Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            internalEndTransaction();
        }
    }

    public Cursor query(String str, Object[] objArr) {
        C14360o3.A0B(str, 0);
        return getOpenHelper().CHx().E7N(new C37491om(str, objArr));
    }
}
