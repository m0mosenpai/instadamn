package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class Wk3 implements InterfaceC60162oy {
    public String A00;
    public final UserSession A01;

    @Override // X.InterfaceC60162oy
    public final Integer BRW() {
        return C05F.A00;
    }

    @Override // X.InterfaceC60162oy
    public final String BkH() {
        C38321qM A02;
        if (this.A00 == null || (A02 = C1DW.A00(this.A01).A02(this.A00)) == null) {
            return null;
        }
        return A02.A0C.getLoggingInfoToken();
    }

    @Override // X.InterfaceC60162oy
    public final String getMediaId() {
        return this.A00;
    }

    public Wk3(UserSession userSession) {
        this.A01 = userSession;
    }
}
