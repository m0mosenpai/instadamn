package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.NwN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54125NwN {
    public static final void A00(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41551w4 c41551w4, String str, String str2) {
        long size;
        C4SX c4sx;
        C14360o3.A0B(userSession, 0);
        boolean A1V = AbstractC167007dF.A1V(interfaceC60442pS);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        Reel reel = c41551w4.A0H;
        if (reel.A0o()) {
            size = 0;
        } else {
            size = C41551w4.A00(userSession, c41551w4).size();
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "ig_story_locked_impression");
        A0f.A7v("first_view", Boolean.valueOf(A1V));
        A0f.AAP("reel_id", AbstractC37301Gc2.A0i(reel));
        A0f.AAP(AbstractC111324zv.A00(5171), reel.A0H(userSession));
        A0f.A9K("reel_size", Long.valueOf(size));
        if (str != null) {
            c4sx = C4SX.A00(str);
        } else {
            c4sx = null;
        }
        A0f.AAK(c4sx, "a_pk");
        AbstractC37300Gc1.A0l(A0f, str2);
        A0f.Cht();
    }
}
