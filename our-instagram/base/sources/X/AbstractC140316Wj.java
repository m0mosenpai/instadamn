package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC140316Wj {
    public static final void A01(UserSession userSession, C1GL c1gl, C41160IJz c41160IJz) {
        C14360o3.A0B(userSession, 0);
        C57722kl A00 = C57722kl.A00(userSession);
        String str = c41160IJz.A05;
        str.getClass();
        A00.A0H(str, c41160IJz);
        C1ON A002 = I5Y.A00(userSession, c41160IJz);
        A002.A00 = new C39009HFl(c41160IJz, A00);
        c1gl.schedule(A002);
        InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
        ARD.E77("has_ever_voted_on_story_slider", true);
        ARD.apply();
    }

    public static final Wm2 A00(C38321qM c38321qM) {
        List A3w;
        C84823qW c84823qW;
        if (c38321qM != null && (A3w = c38321qM.A3w(EnumC75383a5.A1C)) != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(A3w)) != null) {
            return c84823qW.A0F();
        }
        return null;
    }
}
