package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;

/* renamed from: X.FeA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35108FeA {
    public static final C35108FeA A00 = new Object();

    public static final void A00(UserSession userSession, Reel reel, boolean z) {
        if (reel.A0o()) {
            AbstractC70833Fv.A00(userSession).A02 = z;
            return;
        }
        C1NB c1nb = reel.A0W;
        if (c1nb != null) {
            for (Reel reel2 : ReelStore.A03(userSession).A0U(false)) {
                C1NB c1nb2 = reel2.A0W;
                if (c1nb2 != null && C14360o3.A0K(c1nb2.getId(), c1nb.getId())) {
                    reel2.A1Y = z;
                }
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
