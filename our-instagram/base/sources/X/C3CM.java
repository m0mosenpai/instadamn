package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3CM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CM implements InterfaceC38371qR, InterfaceC38381qS {
    public final C38633Gya A00;

    @Override // X.InterfaceC38371qR, X.C1NI
    public final /* synthetic */ String BzL(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        return BQN().A33();
    }

    @Override // X.C1NI
    public final /* synthetic */ boolean CW9() {
        return IQT.A00(this);
    }

    @Override // X.C1NI
    public final /* synthetic */ boolean CZq() {
        return IQT.A01(this);
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0w;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return this.A00.A02;
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC38371qR
    public final C38321qM BQN() {
        C38321qM c38321qM = this.A00.A01;
        if (c38321qM != null) {
            return c38321qM;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return this.A00.A06;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return this.A00.A03;
    }

    @Override // X.InterfaceC38371qR, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A00.A04;
    }

    public C3CM(C38633Gya c38633Gya) {
        this.A00 = c38633Gya;
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final /* synthetic */ boolean CdW() {
        return BQN().CdW();
    }
}
