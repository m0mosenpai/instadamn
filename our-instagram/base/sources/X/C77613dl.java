package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3dl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77613dl {
    public final C76683cG A00;

    public final void A00(Context context, C76743cM c76743cM) {
        C76683cG c76683cG = this.A00;
        C38321qM c38321qM = c76743cM.A02.A01;
        UserSession userSession = c76683cG.A00;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            String CAl = A2E.A03.CAl();
            if (CAl != null) {
                AbstractC76693cH.A02(context, Rie.FEED, userSession, A2E.getId(), CAl);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C77613dl(C76683cG c76683cG) {
        this.A00 = c76683cG;
    }
}
