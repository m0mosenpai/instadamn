package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IsZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42555IsZ implements InterfaceC38371qR, InterfaceC38381qS {
    public final C38634Gyb A00;

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

    public static C38321qM A00(C42555IsZ c42555IsZ) {
        return ((C45150Jyq) AbstractC001800i.A0I(c42555IsZ.A00.A05)).A02;
    }

    @Override // X.InterfaceC38381qS
    public final C1XV B5n() {
        return C1XV.A0y;
    }

    @Override // X.InterfaceC38381qS
    public final Integer CCj() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38371qR, X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        C38634Gyb c38634Gyb = this.A00;
        String str = c38634Gyb.A04;
        if (str == null && (str = ((C45150Jyq) AbstractC001800i.A0I(c38634Gyb.A05)).A02.getId()) == null) {
            throw AbstractC166997dE.A0g();
        }
        return str;
    }

    public C42555IsZ(C38634Gyb c38634Gyb) {
        this.A00 = c38634Gyb;
    }

    @Override // X.InterfaceC38381qS
    public final Integer BA3() {
        return A00(this).BA3();
    }

    @Override // X.InterfaceC38381qS
    public final InterfaceC39571se BK1() {
        return A00(this).BK1();
    }

    @Override // X.InterfaceC38371qR
    public final C38321qM BQN() {
        return A00(this);
    }

    @Override // X.InterfaceC38381qS
    public final String CAR() {
        return A00(this).CAR();
    }

    @Override // X.InterfaceC38381qS
    public final Integer CFr() {
        return A00(this).CFr();
    }

    @Override // X.InterfaceC38371qR, X.C1NI
    public final /* synthetic */ boolean CdW() {
        return A00(this).CdW();
    }
}
