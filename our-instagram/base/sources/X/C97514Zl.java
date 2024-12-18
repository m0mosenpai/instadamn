package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4Zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97514Zl {
    public final UserSession A00;

    public final C9CG A00(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id != null) {
            return new C9CG(new C9BH(new C207169Ev(18, c38321qM, this), 25), id, AbstractC86623ta.A00(c38321qM.A2P()), c38321qM.A3w(EnumC75383a5.A1C));
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C97514Zl(UserSession userSession) {
        this.A00 = userSession;
    }
}
