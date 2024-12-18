package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.2aL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52202aL implements C2M5 {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;

    @Override // X.C2M5
    public final ArrayList C55(final String id) {
        String string;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        A00.ADp(1, id);
        C1YP c1yp = this.A01;
        c1yp.assertNotSuspendingTransaction();
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            A00.A00();
        }
    }

    public C52202aL(final C1YP __db) {
        this.A01 = __db;
        this.A00 = new AbstractC29571bY(__db) { // from class: X.2aM
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot stmt, Object value) {
                C52472am c52472am = (C52472am) value;
                stmt.ADp(1, c52472am.A00);
                stmt.ADp(2, c52472am.A01);
            }
        };
        this.A02 = new AbstractC29601bb(__db) { // from class: X.2aN
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM worktag WHERE work_spec_id=?";
            }
        };
    }

    @Override // X.C2M5
    public final void COi(final String id, final java.util.Set tags) {
        Iterator it = tags.iterator();
        while (it.hasNext()) {
            C52472am c52472am = new C52472am((String) it.next(), id);
            C1YP c1yp = this.A01;
            c1yp.assertNotSuspendingTransaction();
            c1yp.beginTransaction();
            try {
                this.A00.insert(c52472am);
                c1yp.setTransactionSuccessful();
            } finally {
                c1yp.endTransaction();
            }
        }
    }
}
