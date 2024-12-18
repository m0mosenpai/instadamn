package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: X.50i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1114450i implements C2M4 {
    public final AbstractC29571bY A00;
    public final C1YP A01;

    @Override // X.C2M4
    public final ArrayList Awm(final String id) {
        String string;
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (id == null) {
            A00.ADj(1);
        } else {
            A00.ADp(1, id);
        }
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

    public C1114450i(final C1YP __db) {
        this.A01 = __db;
        this.A00 = new AbstractC29571bY(__db) { // from class: X.50j
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot stmt, Object value) {
                C72709Xlh c72709Xlh = (C72709Xlh) value;
                stmt.ADp(1, c72709Xlh.A01);
                stmt.ADp(2, c72709Xlh.A00);
            }
        };
    }
}
