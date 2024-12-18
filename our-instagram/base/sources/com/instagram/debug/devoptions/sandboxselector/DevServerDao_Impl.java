package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC167007dF;
import X.AbstractC29571bY;
import X.AbstractC29601bb;
import X.AbstractC37591ow;
import X.AbstractC37601ox;
import X.AbstractC43593JPy;
import X.C0eB;
import X.C1YP;
import X.C2Q9;
import X.C37581ov;
import X.C3EP;
import X.C4HQ;
import X.InterfaceC16660sJ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC37561ot;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class DevServerDao_Impl extends DevServerDao {
    public final C1YP __db;
    public final AbstractC29571bY __insertionAdapterOfDevServerEntity;
    public final AbstractC29601bb __preparedStmtOfDeleteAll;

    @Override // com.instagram.debug.devoptions.sandboxselector.DevServerDao
    public Object deleteAll(InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.__db, new Callable() { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDao_Impl.4
            @Override // java.util.concurrent.Callable
            public C0eB call() {
                InterfaceC37561ot acquire = DevServerDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    DevServerDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.ATb();
                        DevServerDao_Impl.this.__db.setTransactionSuccessful();
                        return C0eB.A00;
                    } finally {
                        DevServerDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    DevServerDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                }
            }
        }, interfaceC23621Ds);
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevServerDao
    public InterfaceC19390xP getAll(long j) {
        TreeMap treeMap = C37581ov.A08;
        final C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM internal_dev_servers WHERE cache_timestamp > ?", 1);
        A00.ADi(1, j);
        return C2Q9.A02(this.__db, new Callable() { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDao_Impl.5
            @Override // java.util.concurrent.Callable
            public List call() {
                Cursor A002 = C3EP.A00(DevServerDao_Impl.this.__db, A00, false);
                try {
                    int A01 = AbstractC37601ox.A01(A002, "url");
                    int A012 = AbstractC37601ox.A01(A002, DevServerEntity.COLUMN_HOST_TYPE);
                    int A013 = AbstractC37601ox.A01(A002, DevServerEntity.COLUMN_DESCRIPTION);
                    int A014 = AbstractC37601ox.A01(A002, DevServerEntity.COLUMN_SUPPORTS_VPNLESS);
                    int A015 = AbstractC37601ox.A01(A002, DevServerEntity.COLUMN_CACHE_TIMESTAMP);
                    ArrayList A11 = AbstractC43593JPy.A11(A002);
                    while (A002.moveToNext()) {
                        A11.add(new DevServerEntity(A002.getString(A01), A002.getString(A012), A002.getString(A013), AbstractC167007dF.A1M(A002.getInt(A014)), A002.getLong(A015)));
                    }
                    return A11;
                } finally {
                    A002.close();
                }
            }

            public void finalize() {
                A00.A00();
            }
        }, new String[]{DevServerEntity.TABLE_NAME}, false);
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevServerDao
    public Object insertAll(final List list, InterfaceC23621Ds interfaceC23621Ds) {
        return C2Q9.A01(this.__db, new Callable() { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDao_Impl.3
            @Override // java.util.concurrent.Callable
            public C0eB call() {
                DevServerDao_Impl.this.__db.beginTransaction();
                try {
                    DevServerDao_Impl.this.__insertionAdapterOfDevServerEntity.insert((Iterable) list);
                    DevServerDao_Impl.this.__db.setTransactionSuccessful();
                    return C0eB.A00;
                } finally {
                    DevServerDao_Impl.this.__db.endTransaction();
                }
            }
        }, interfaceC23621Ds);
    }

    @Override // com.instagram.debug.devoptions.sandboxselector.DevServerDao
    public Object replaceAll(final List list, InterfaceC23621Ds interfaceC23621Ds) {
        return C4HQ.A00(this.__db, interfaceC23621Ds, new InterfaceC16660sJ() { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDao_Impl$$ExternalSyntheticLambda0
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                return DevServerDao.replaceAll$suspendImpl(DevServerDao_Impl.this, list, (InterfaceC23621Ds) obj);
            }
        });
    }

    public DevServerDao_Impl(C1YP c1yp) {
        this.__db = c1yp;
        this.__insertionAdapterOfDevServerEntity = new AbstractC29571bY(c1yp) { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDao_Impl.1
            @Override // X.AbstractC29601bb
            public String createQuery() {
                return "INSERT OR REPLACE INTO `internal_dev_servers` (`url`,`host_type`,`description`,`supports_vpnless`,`cache_timestamp`) VALUES (?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public void bind(InterfaceC37561ot interfaceC37561ot, DevServerEntity devServerEntity) {
                interfaceC37561ot.ADp(1, devServerEntity.url);
                interfaceC37561ot.ADp(2, devServerEntity.hostType);
                interfaceC37561ot.ADp(3, devServerEntity.description);
                interfaceC37561ot.ADi(4, devServerEntity.supportsVpnless ? 1L : 0L);
                interfaceC37561ot.ADi(5, devServerEntity.cacheTimestamp);
            }
        };
        this.__preparedStmtOfDeleteAll = new AbstractC29601bb(c1yp) { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerDao_Impl.2
            @Override // X.AbstractC29601bb
            public String createQuery() {
                return "DELETE FROM internal_dev_servers";
            }
        };
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    /* renamed from: lambda$replaceAll$0$com-instagram-debug-devoptions-sandboxselector-DevServerDao_Impl, reason: not valid java name */
    public /* synthetic */ Object m79xe35cf1c9(List list, InterfaceC23621Ds interfaceC23621Ds) {
        return DevServerDao.replaceAll$suspendImpl(this, list, interfaceC23621Ds);
    }
}
