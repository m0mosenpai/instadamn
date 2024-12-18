package X;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2t1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C62622t1 {
    public C62862tP A00;
    public final UserSession A01;
    public final C60662pp A02;
    public final C61222qk A03;

    public final C62862tP A00() {
        C62862tP c62862tP = this.A00;
        if (c62862tP == null) {
            UserSession userSession = this.A01;
            C60662pp c60662pp = this.A02;
            InterfaceC60442pS interfaceC60442pS = AbstractC60942qI.A00;
            C62632t2 c62632t2 = C62632t2.A00;
            C61222qk c61222qk = this.A03;
            C57112jm A05 = c61222qk.A05();
            Pair[] pairArr = {Pair.create(Integer.valueOf(R.id.clips_netego_thumbnail_viewpoint_helper), c61222qk.A0N()), Pair.create(Integer.valueOf(R.id.main_feed_session_id_provider), c61222qk.A1z), Pair.create(Integer.valueOf(R.id.clips_netego_controller), c61222qk.A0M()), Pair.create(Integer.valueOf(R.id.main_feed_state_store), c61222qk.A0K())};
            SparseArray sparseArray = new SparseArray();
            int i = 0;
            do {
                Pair pair = pairArr[i];
                sparseArray.put(((Number) pair.first).intValue(), pair.second);
                i++;
            } while (i < 4);
            C62862tP c62862tP2 = new C62862tP(sparseArray, c60662pp, c62632t2, interfaceC60442pS, userSession, A05);
            this.A00 = c62862tP2;
            return c62862tP2;
        }
        return c62862tP;
    }

    public C62622t1(UserSession userSession, C60662pp c60662pp, C61222qk c61222qk) {
        this.A01 = userSession;
        this.A02 = c60662pp;
        this.A03 = c61222qk;
    }
}
