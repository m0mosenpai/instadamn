package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.JcE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43965JcE {
    public final C4SX A00;
    public final C18920wW A01;

    public final void A00(String str) {
        HashMap A11 = AbstractC31174DnI.A11(str, 0);
        A11.put("inbox_throttle_state", str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A01, "direct_inbox_banner_impression");
        if (A0f.isSampled()) {
            A0f.AAK(this.A00, AbstractC111324zv.A00(3277));
            AbstractC43593JPy.A1K(A0f, A11);
        }
    }

    public C43965JcE(UserSession userSession) {
        C4SX c4sx;
        this.A01 = AbstractC12220kQ.A02(userSession);
        try {
            c4sx = C4SX.A00(userSession.userId);
        } catch (NumberFormatException unused) {
            c4sx = new C4SX(AbstractC167007dF.A0d());
        }
        this.A00 = c4sx;
    }
}
