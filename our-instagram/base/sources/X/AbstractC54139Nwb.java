package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Nwb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54139Nwb {
    public static final void A00(Context context, UserSession userSession, List list) {
        C14360o3.A0B(userSession, 1);
        C9GR.A07(context, 2131957681);
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            A0i.A00 = 1;
            A0i.A4L(C05F.A0C);
            A0i.AEH(userSession);
            List BE4 = A0i.A0C.BE4();
            if (BE4 == null) {
                BE4 = C16930sl.A00;
            }
            A1H.addAll(BE4);
        }
        Iterator it2 = A1H.iterator();
        while (it2.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it2);
            Reel A0M = ReelStore.A03(userSession).A0M(A1B);
            if (A0M != null) {
                A0M.A1q = true;
                if (A0M.A15(userSession)) {
                    ReelStore.A03(userSession).A0c(A1B);
                }
            }
        }
    }
}
