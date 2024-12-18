package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public final class L8y {
    public final C1YP A00;
    public final AbstractC29601bb A01;
    public final AbstractC29601bb A02;
    public final AbstractC29571bY A03;

    public final C45027JwI A00(String str) {
        TreeMap treeMap = C37581ov.A08;
        C37581ov A00 = AbstractC37591ow.A00("SELECT * FROM suggested_users WHERE user_id = ?", 1);
        A00.ADp(1, str);
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        C45027JwI c45027JwI = null;
        Cursor query = c1yp.query(A00, (CancellationSignal) null);
        try {
            int A01 = AbstractC37601ox.A01(query, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
            int A012 = AbstractC37601ox.A01(query, "impression_timestamps");
            int A013 = AbstractC37601ox.A01(query, "last_timestamp");
            if (query.moveToFirst()) {
                String string = query.getString(A01);
                String string2 = query.getString(A012);
                C14360o3.A0B(string2, 0);
                c45027JwI = new C45027JwI(string, query.getString(A013), AbstractC001800i.A0U(AbstractC001900j.A0R(string2, new String[]{"␞"}, 0)));
            }
            return c45027JwI;
        } finally {
            query.close();
            A00.A00();
        }
    }

    public final void A01(C45027JwI c45027JwI) {
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            this.A03.insert(c45027JwI);
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
        }
    }

    public L8y(C1YP c1yp) {
        this.A00 = c1yp;
        this.A03 = new C43906JbH(c1yp, this, 9);
        this.A01 = new C44083Je8(c1yp, this, 22);
        this.A02 = new C44083Je8(c1yp, this, 23);
    }
}
