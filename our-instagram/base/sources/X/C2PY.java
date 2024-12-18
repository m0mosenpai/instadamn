package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: X.2PY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2PY {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;
    public final AbstractC29601bb A03;

    public final ArrayList A00() {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT file_path FROM audio_tracks", 0);
        C1YP c1yp = this.A01;
        c1yp.assertNotSuspendingTransaction();
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            A00.A00();
        }
    }

    public C2PY(final C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.9Ob
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `audio_tracks` (`audio_track_id`,`start_time_ms`,`duration_ms`,`file_path`,`last_used_time_ms`) VALUES (?,?,?,?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                A9U a9u = (A9U) obj;
                interfaceC37561ot.ADp(1, a9u.A03);
                interfaceC37561ot.ADi(2, a9u.A01);
                interfaceC37561ot.ADi(3, a9u.A00);
                interfaceC37561ot.ADp(4, a9u.A04);
                interfaceC37561ot.ADi(5, a9u.A02);
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.9Oc
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM audio_tracks WHERE audio_track_id = ?";
            }
        };
        this.A03 = new AbstractC29601bb(c1yp) { // from class: X.9Od
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM audio_tracks WHERE audio_track_id IN (SELECT audio_track_id FROM (SELECT audio_track_id, MAX(last_used_time_ms) AS last_used_time_ms FROM audio_tracks GROUP BY audio_track_id ORDER BY last_used_time_ms) LIMIT (MAX(((SELECT COUNT(DISTINCT audio_track_id) FROM audio_tracks) - ?), 0)))";
            }
        };
    }

    public C2PY() {
    }
}
