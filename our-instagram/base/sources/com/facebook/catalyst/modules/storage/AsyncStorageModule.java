package com.facebook.catalyst.modules.storage;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AbstractC61749Rt4;
import X.AbstractC62774SQq;
import X.AnonymousClass001;
import X.C0I2;
import X.C0fW;
import X.ExecutorC64797TUl;
import X.InterfaceC65352Tig;
import X.Q27;
import X.R3M;
import X.T06;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.intent.IntentModule;
import java.util.Arrays;
import java.util.concurrent.Executor;
import org.json.JSONObject;

@ReactModule(name = NativeAsyncSQLiteDBStorageSpec.NAME)
/* loaded from: classes10.dex */
public class AsyncStorageModule extends NativeAsyncSQLiteDBStorageSpec {
    public static final int MAX_SQL_KEYS = 999;
    public final ExecutorC64797TUl mExecutor;
    public Q27 mReactDatabaseSupplier;
    public boolean mShuttingDown;

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mShuttingDown = true;
    }

    private boolean ensureDatabase() {
        if (!this.mShuttingDown) {
            this.mReactDatabaseSupplier.A03();
            return true;
        }
        return false;
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void clear(final Callback callback) {
        this.mExecutor.execute(new Runnable() { // from class: X.TNP
            @Override // java.lang.Runnable
            public final void run() {
                AsyncStorageModule.this.m49x326ecee0(callback);
            }
        });
    }

    public void clearSensitiveData() {
        Q27 q27 = this.mReactDatabaseSupplier;
        synchronized (q27) {
            try {
                q27.A03();
                q27.A01.delete("catalystLocalStorage", null, null);
                Q27.A01(q27);
            } catch (Exception unused) {
                if (!Q27.A02(q27)) {
                    throw AbstractC166987dD.A18("Clearing and deleting database RKStorage failed");
                }
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void getAllKeys(final Callback callback) {
        this.mExecutor.execute(new Runnable() { // from class: X.TNQ
            @Override // java.lang.Runnable
            public final void run() {
                AsyncStorageModule.this.m50x4df5a9b3(callback);
            }
        });
    }

    /* renamed from: lambda$clear$4$com-facebook-catalyst-modules-storage-AsyncStorageModule, reason: not valid java name */
    public /* synthetic */ void m49x326ecee0(Callback callback) {
        this.mReactDatabaseSupplier.A03();
        try {
            Q27 q27 = this.mReactDatabaseSupplier;
            synchronized (q27) {
                q27.A03();
                q27.A01.delete("catalystLocalStorage", null, null);
            }
            callback.invoke(new Object[0]);
        } catch (Exception e) {
            C0I2.A06("ReactNative", e.getMessage(), e);
            AbstractC58321PtD.A1K(callback, AbstractC62774SQq.A00(e.getMessage()));
        }
    }

    /* renamed from: lambda$multiMerge$3$com-facebook-catalyst-modules-storage-AsyncStorageModule, reason: not valid java name */
    public /* synthetic */ void m52x8897aff5(Callback callback, ReadableArray readableArray) {
        WritableNativeMap A01;
        Object[] objArr;
        SQLiteDatabase A00;
        int i;
        try {
            if (!ensureDatabase()) {
                objArr = new Object[1];
                A01 = AbstractC62774SQq.A00("Database Error");
            } else {
                try {
                    C0fW.A01(Q27.A00(this), -1319712794);
                    for (int i2 = 0; i2 < readableArray.size(); i2++) {
                        try {
                            if (readableArray.getArray(i2).size() != 2) {
                                AbstractC62774SQq.A00("Invalid Value");
                                A00 = Q27.A00(this);
                                i = 344804555;
                            } else if (readableArray.getArray(i2).getString(0) == null) {
                                AbstractC62774SQq.A00("Invalid key");
                                A00 = Q27.A00(this);
                                i = -1519686114;
                            } else if (readableArray.getArray(i2).getString(1) == null) {
                                AbstractC62774SQq.A00("Invalid Value");
                                A00 = Q27.A00(this);
                                i = -1918849126;
                            } else {
                                SQLiteDatabase A002 = Q27.A00(this);
                                String string = readableArray.getArray(i2).getString(0);
                                String string2 = readableArray.getArray(i2).getString(1);
                                String str = null;
                                Cursor query = A002.query("catalystLocalStorage", new String[]{IntentModule.EXTRA_MAP_KEY_FOR_VALUE}, "key=?", new String[]{string}, null, null, null);
                                try {
                                    if (query.moveToFirst()) {
                                        str = query.getString(0);
                                    }
                                    if (str != null) {
                                        JSONObject A17 = AbstractC58318PtA.A17(str);
                                        AbstractC61749Rt4.A00(A17, AbstractC58318PtA.A17(string2));
                                        string2 = A17.toString();
                                    }
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("key", string);
                                    contentValues.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, string2);
                                    C0fW.A00(1742503061);
                                    long insertWithOnConflict = A002.insertWithOnConflict("catalystLocalStorage", null, contentValues, 5);
                                    C0fW.A00(336032825);
                                    if (-1 == insertWithOnConflict) {
                                        AbstractC62774SQq.A00("Database Error");
                                        A00 = Q27.A00(this);
                                        i = 1769009068;
                                    }
                                } finally {
                                    query.close();
                                }
                            }
                            C0fW.A03(A00, i);
                            return;
                        } catch (Exception e) {
                            C0I2.A06("ReactNative", e.getMessage(), e);
                            return;
                        }
                    }
                    Q27.A00(this).setTransactionSuccessful();
                } catch (Exception e2) {
                    A01 = AbstractC62774SQq.A01(e2);
                    try {
                        C0fW.A03(Q27.A00(this), 972034491);
                    } catch (Exception e3) {
                        C0I2.A06("ReactNative", e3.getMessage(), e3);
                    }
                }
                try {
                    C0fW.A03(Q27.A00(this), -1792006843);
                    objArr = new Object[0];
                } catch (Exception e4) {
                    A01 = AbstractC62774SQq.A01(e4);
                    objArr = new Object[1];
                    objArr[0] = A01;
                    callback.invoke(objArr);
                }
                callback.invoke(objArr);
            }
            objArr[0] = A01;
            callback.invoke(objArr);
        } catch (Throwable th) {
            try {
                C0fW.A03(Q27.A00(this), 1535260569);
                throw th;
            } catch (Exception e5) {
                C0I2.A06("ReactNative", e5.getMessage(), e5);
                AbstractC62774SQq.A00(e5.getMessage());
                throw th;
            }
        }
    }

    /* renamed from: lambda$multiRemove$2$com-facebook-catalyst-modules-storage-AsyncStorageModule, reason: not valid java name */
    public /* synthetic */ void m53xe51b4812(Callback callback, ReadableArray readableArray) {
        WritableNativeMap A01;
        Object[] objArr;
        if (!ensureDatabase()) {
            objArr = new Object[1];
            A01 = AbstractC62774SQq.A00("Database Error");
        } else {
            try {
                try {
                    C0fW.A01(Q27.A00(this), -1407854361);
                    for (int i = 0; i < readableArray.size(); i += 999) {
                        int min = Math.min(readableArray.size() - i, 999);
                        SQLiteDatabase A00 = Q27.A00(this);
                        String[] strArr = new String[min];
                        Arrays.fill(strArr, "?");
                        String A0g = AnonymousClass001.A0g("key IN (", TextUtils.join(", ", strArr), ")");
                        String[] strArr2 = new String[min];
                        for (int i2 = 0; i2 < min; i2++) {
                            strArr2[i2] = readableArray.getString(i + i2);
                        }
                        A00.delete("catalystLocalStorage", A0g, strArr2);
                    }
                    Q27.A00(this).setTransactionSuccessful();
                } catch (Exception e) {
                    A01 = AbstractC62774SQq.A01(e);
                    try {
                        C0fW.A03(Q27.A00(this), 1752303544);
                    } catch (Exception e2) {
                        C0I2.A06("ReactNative", e2.getMessage(), e2);
                    }
                    objArr = new Object[1];
                    objArr[0] = A01;
                    callback.invoke(objArr);
                }
                try {
                    C0fW.A03(Q27.A00(this), -972876014);
                    objArr = new Object[0];
                } catch (Exception e3) {
                    A01 = AbstractC62774SQq.A01(e3);
                    objArr = new Object[1];
                    objArr[0] = A01;
                    callback.invoke(objArr);
                }
                callback.invoke(objArr);
            } catch (Throwable th) {
                try {
                    C0fW.A03(Q27.A00(this), -1599465599);
                    throw th;
                } catch (Exception e4) {
                    C0I2.A06("ReactNative", e4.getMessage(), e4);
                    AbstractC62774SQq.A00(e4.getMessage());
                    throw th;
                }
            }
        }
        objArr[0] = A01;
        callback.invoke(objArr);
    }

    /* renamed from: lambda$multiSet$1$com-facebook-catalyst-modules-storage-AsyncStorageModule, reason: not valid java name */
    public /* synthetic */ void m54x27b3264d(Callback callback, ReadableArray readableArray) {
        WritableNativeMap A01;
        Object[] objArr;
        SQLiteDatabase A00;
        int i;
        if (!ensureDatabase()) {
            objArr = new Object[1];
            A01 = AbstractC62774SQq.A00("Database Error");
        } else {
            SQLiteStatement compileStatement = Q27.A00(this).compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    C0fW.A01(Q27.A00(this), -824699907);
                    for (int i2 = 0; i2 < readableArray.size(); i2++) {
                        try {
                            if (readableArray.getArray(i2).size() != 2) {
                                AbstractC62774SQq.A00("Invalid Value");
                                A00 = Q27.A00(this);
                                i = 1016877367;
                            } else if (readableArray.getArray(i2).getString(0) == null) {
                                AbstractC62774SQq.A00("Invalid key");
                                A00 = Q27.A00(this);
                                i = 1248867808;
                            } else if (readableArray.getArray(i2).getString(1) == null) {
                                AbstractC62774SQq.A00("Invalid Value");
                                A00 = Q27.A00(this);
                                i = -724467645;
                            } else {
                                compileStatement.clearBindings();
                                compileStatement.bindString(1, readableArray.getArray(i2).getString(0));
                                compileStatement.bindString(2, readableArray.getArray(i2).getString(1));
                                C0fW.A00(-2080068103);
                                compileStatement.execute();
                                C0fW.A00(1103680520);
                            }
                            C0fW.A03(A00, i);
                            return;
                        } catch (Exception e) {
                            C0I2.A06("ReactNative", e.getMessage(), e);
                            return;
                        }
                    }
                    Q27.A00(this).setTransactionSuccessful();
                } catch (Exception e2) {
                    A01 = AbstractC62774SQq.A01(e2);
                    try {
                        C0fW.A03(Q27.A00(this), 965872284);
                    } catch (Exception e3) {
                        C0I2.A06("ReactNative", e3.getMessage(), e3);
                    }
                }
                try {
                    C0fW.A03(Q27.A00(this), -793606700);
                    objArr = new Object[0];
                } catch (Exception e4) {
                    A01 = AbstractC62774SQq.A01(e4);
                    objArr = new Object[1];
                    objArr[0] = A01;
                    callback.invoke(objArr);
                }
                callback.invoke(objArr);
            } catch (Throwable th) {
                try {
                    C0fW.A03(Q27.A00(this), -992102922);
                    throw th;
                } catch (Exception e5) {
                    C0I2.A06("ReactNative", e5.getMessage(), e5);
                    AbstractC62774SQq.A00(e5.getMessage());
                    throw th;
                }
            }
        }
        objArr[0] = A01;
        callback.invoke(objArr);
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiGet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray == null) {
            callback.invoke(AbstractC62774SQq.A00("Invalid key"), null);
        } else {
            this.mExecutor.execute(new Runnable() { // from class: X.TPm
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncStorageModule.this.m51xa7d8d3ba(callback, readableArray);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiMerge(final ReadableArray readableArray, final Callback callback) {
        this.mExecutor.execute(new Runnable() { // from class: X.TPk
            @Override // java.lang.Runnable
            public final void run() {
                AsyncStorageModule.this.m52x8897aff5(callback, readableArray);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.sqlite.SQLiteOpenHelper, X.Q27] */
    public AsyncStorageModule(R3M r3m, Executor executor) {
        super(r3m);
        this.mShuttingDown = false;
        InterfaceC65352Tig interfaceC65352Tig = r3m.A00;
        if (interfaceC65352Tig == null) {
            interfaceC65352Tig = new T06(r3m);
            r3m.A00 = interfaceC65352Tig;
        }
        this.mExecutor = new ExecutorC64797TUl(interfaceC65352Tig, executor);
        Q27 q27 = Q27.A02;
        Q27 q272 = q27;
        if (q27 == null) {
            Context applicationContext = r3m.getApplicationContext();
            ?? sQLiteOpenHelper = new SQLiteOpenHelper(applicationContext, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
            sQLiteOpenHelper.A00 = applicationContext;
            Q27.A02 = sQLiteOpenHelper;
            q272 = sQLiteOpenHelper;
        }
        this.mReactDatabaseSupplier = q272;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r1.moveToFirst() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r2.pushString(r1.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r1.moveToNext() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r1.close();
        r0 = new java.lang.Object[]{null, r2};
     */
    /* renamed from: lambda$getAllKeys$5$com-facebook-catalyst-modules-storage-AsyncStorageModule, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m50x4df5a9b3(com.facebook.react.bridge.Callback r13) {
        /*
            r12 = this;
            boolean r0 = r12.ensureDatabase()
            r7 = 0
            r3 = 0
            if (r0 != 0) goto L16
            java.lang.String r0 = "Database Error"
            com.facebook.react.bridge.WritableNativeMap r0 = X.AbstractC62774SQq.A00(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}
        L12:
            r13.invoke(r0)
            return
        L16:
            com.facebook.react.bridge.WritableNativeArray r2 = new com.facebook.react.bridge.WritableNativeArray
            r2.<init>()
            java.lang.String r0 = "key"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            android.database.sqlite.SQLiteDatabase r4 = X.Q27.A00(r12)
            java.lang.String r5 = "catalystLocalStorage"
            r8 = r7
            r9 = r7
            r10 = r7
            r11 = r7
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5a
            if (r0 == 0) goto L42
        L35:
            java.lang.String r0 = r1.getString(r3)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5a
            r2.pushString(r0)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5a
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L5a
            if (r0 != 0) goto L35
        L42:
            r1.close()
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r2}
            goto L12
        L4a:
            r0 = move-exception
            com.facebook.react.bridge.WritableNativeMap r0 = X.AbstractC62774SQq.A01(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}     // Catch: java.lang.Throwable -> L5a
            r13.invoke(r0)     // Catch: java.lang.Throwable -> L5a
            r1.close()
            return
        L5a:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.modules.storage.AsyncStorageModule.m50x4df5a9b3(com.facebook.react.bridge.Callback):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        if (r1.moveToFirst() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r2 = new com.facebook.react.bridge.WritableNativeArray();
        r2.pushString(r1.getString(0));
        r2.pushString(r1.getString(1));
        r4.pushArray(r2);
        r5.remove(r1.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if (r1.moveToNext() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        r1.close();
        r2 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        if (r2.hasNext() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        r1 = X.AbstractC166987dD.A1B(r2);
        r0 = new com.facebook.react.bridge.WritableNativeArray();
        r0.pushString(r1);
        r0.pushNull();
        r4.pushArray(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        r5.clear();
        r10 = r3 + 999;
     */
    /* renamed from: lambda$multiGet$0$com-facebook-catalyst-modules-storage-AsyncStorageModule, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m51xa7d8d3ba(com.facebook.react.bridge.Callback r22, com.facebook.react.bridge.ReadableArray r23) {
        /*
            r21 = this;
            boolean r0 = r21.ensureDatabase()
            r7 = 0
            r9 = 1
            r8 = 0
            r6 = r22
            if (r0 != 0) goto L19
            java.lang.String r0 = "Database Error"
            com.facebook.react.bridge.WritableNativeMap r0 = X.AbstractC62774SQq.A00(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}
        L15:
            r6.invoke(r0)
            return
        L19:
            java.lang.String r1 = "key"
            java.lang.String r0 = "value"
            java.lang.String[] r15 = new java.lang.String[]{r1, r0}
            java.util.HashSet r5 = X.AbstractC166987dD.A1H()
            com.facebook.react.bridge.WritableNativeArray r4 = new com.facebook.react.bridge.WritableNativeArray
            r4.<init>()
            r10 = 0
        L2c:
            r11 = r23
            int r0 = r11.size()
            if (r10 >= r0) goto Le2
            int r1 = r11.size()
            int r1 = r1 - r10
            r0 = 999(0x3e7, float:1.4E-42)
            int r2 = java.lang.Math.min(r1, r0)
            android.database.sqlite.SQLiteDatabase r13 = X.Q27.A00(r21)
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r0 = "?"
            java.util.Arrays.fill(r1, r0)
            java.lang.String r3 = "key IN ("
            java.lang.String r0 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r0, r1)
            java.lang.String r0 = ")"
            java.lang.String r16 = X.AnonymousClass001.A0g(r3, r1, r0)
            r3 = r10
            java.lang.String[] r1 = new java.lang.String[r2]
            r12 = 0
        L5c:
            if (r12 >= r2) goto L69
            int r0 = r10 + r12
            java.lang.String r0 = r11.getString(r0)
            r1[r12] = r0
            int r12 = r12 + 1
            goto L5c
        L69:
            java.lang.String r14 = "catalystLocalStorage"
            r19 = r7
            r20 = r7
            r18 = r7
            r17 = r1
            android.database.Cursor r1 = r13.query(r14, r15, r16, r17, r18, r19, r20)
            r5.clear()
            int r12 = r1.getCount()     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            int r0 = r11.size()     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            if (r12 == r0) goto L92
        L84:
            int r0 = r3 + r2
            if (r10 >= r0) goto L92
            java.lang.String r0 = r11.getString(r10)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            r5.add(r0)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            int r10 = r10 + 1
            goto L84
        L92:
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            if (r0 == 0) goto Lbb
        L98:
            com.facebook.react.bridge.WritableNativeArray r2 = new com.facebook.react.bridge.WritableNativeArray     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            r2.<init>()     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            java.lang.String r0 = r1.getString(r8)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            r2.pushString(r0)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            java.lang.String r0 = r1.getString(r9)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            r2.pushString(r0)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            r4.pushArray(r2)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            java.lang.String r0 = r1.getString(r8)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            r5.remove(r0)     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Exception -> Le8 java.lang.Throwable -> Lf8
            if (r0 != 0) goto L98
        Lbb:
            r1.close()
            java.util.Iterator r2 = r5.iterator()
        Lc2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ldb
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            com.facebook.react.bridge.WritableNativeArray r0 = new com.facebook.react.bridge.WritableNativeArray
            r0.<init>()
            r0.pushString(r1)
            r0.pushNull()
            r4.pushArray(r0)
            goto Lc2
        Ldb:
            r5.clear()
            int r10 = r3 + 999
            goto L2c
        Le2:
            java.lang.Object[] r0 = new java.lang.Object[]{r7, r4}
            goto L15
        Le8:
            r0 = move-exception
            com.facebook.react.bridge.WritableNativeMap r0 = X.AbstractC62774SQq.A01(r0)     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}     // Catch: java.lang.Throwable -> Lf8
            r6.invoke(r0)     // Catch: java.lang.Throwable -> Lf8
            r1.close()
            return
        Lf8:
            r0 = move-exception
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.catalyst.modules.storage.AsyncStorageModule.m51xa7d8d3ba(com.facebook.react.bridge.Callback, com.facebook.react.bridge.ReadableArray):void");
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiRemove(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            AbstractC58321PtD.A1K(callback, AbstractC62774SQq.A00("Invalid key"));
        } else {
            this.mExecutor.execute(new Runnable() { // from class: X.TPl
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncStorageModule.this.m53xe51b4812(callback, readableArray);
                }
            });
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec
    public void multiSet(final ReadableArray readableArray, final Callback callback) {
        if (readableArray.size() == 0) {
            AbstractC58321PtD.A1K(callback, AbstractC62774SQq.A00("Invalid key"));
        } else {
            this.mExecutor.execute(new Runnable() { // from class: X.TPj
                @Override // java.lang.Runnable
                public final void run() {
                    AsyncStorageModule.this.m54x27b3264d(callback, readableArray);
                }
            });
        }
    }

    public AsyncStorageModule(R3M r3m) {
        this(r3m, AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
