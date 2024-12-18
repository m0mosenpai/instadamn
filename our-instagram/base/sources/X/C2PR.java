package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.TreeMap;

/* renamed from: X.2PR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2PR implements C2M6 {
    public final C1YP A00;
    public final AbstractC29601bb A01;
    public final AbstractC29601bb A02;
    public final AbstractC29571bY A03;

    @Override // X.C2M6
    public final C2WT C4j(C2WP c2wp) {
        String str = c2wp.A01;
        int i = c2wp.A00;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        A00.ADp(1, str);
        A00.ADi(2, i);
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        C2WT c2wt = null;
        String str2 = null;
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            int A01 = AbstractC37601ox.A01(query, "work_spec_id");
            int A012 = AbstractC37601ox.A01(query, "generation");
            int A013 = AbstractC37601ox.A01(query, "system_id");
            if (query.moveToFirst()) {
                if (!query.isNull(A01)) {
                    str2 = query.getString(A01);
                }
                c2wt = new C2WT(str2, query.getInt(A012), query.getInt(A013));
            }
            return c2wt;
        } finally {
            query.close();
            A00.A00();
        }
    }

    @Override // X.C2M6
    public final void COh(final C2WT systemIdInfo) {
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            this.A03.insert(systemIdInfo);
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
        }
    }

    public C2PR(final C1YP __db) {
        this.A00 = __db;
        this.A03 = new AbstractC29571bY(__db) { // from class: X.2PT
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot stmt, Object value) {
                stmt.ADp(1, ((C2WT) value).A02);
                stmt.ADi(2, r5.A00);
                stmt.ADi(3, r5.A01);
            }
        };
        this.A01 = new AbstractC29601bb(__db) { // from class: X.2PW
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.A02 = new AbstractC29601bb(__db) { // from class: X.2Pd
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }
}
