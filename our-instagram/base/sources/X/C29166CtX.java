package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.CtX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29166CtX implements InterfaceC13000lm {
    public long A00;
    public final UserSession A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C50157MDk(this, 15));

    public static final void A00(C29166CtX c29166CtX, String str, String str2) {
        DH6 dh6 = new DH6(c29166CtX, str, str2, 16);
        if (0 != c29166CtX.A00) {
            dh6.invoke();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C50157MDk c50157MDk = new C50157MDk(this, 13);
        if (0 != this.A00) {
            c50157MDk.invoke();
        }
    }

    public C29166CtX(UserSession userSession) {
        this.A01 = userSession;
    }
}
