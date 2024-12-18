package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LEH {
    public final UserSession A00;
    public final InterfaceC19390xP A01;

    public LEH(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C43818JZg(12, AnonymousClass111.A04(new C16440rp(true), JQ0.A0K(userSession).A00(C2Q5.class), JQ0.A0K(userSession).A00(C70083Cs.class)), this);
    }

    public static final String A00(LEH leh, String str) {
        C47Z A0h = AbstractC43593JPy.A0h(leh.A00, str);
        if (A0h == null) {
            return null;
        }
        if (A0h.A10()) {
            return A0h.A35;
        }
        String str2 = A0h.A3O;
        if (str2 != null) {
            return A00(leh, str2);
        }
        return A0h.A3Q;
    }
}
