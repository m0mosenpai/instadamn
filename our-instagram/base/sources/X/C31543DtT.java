package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DtT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31543DtT extends C1I2 implements InterfaceC62602sz, InterfaceC62612t0 {
    public String A00;
    public boolean A01;
    public boolean A02;
    public int A03;
    public int A04;
    public final C07X A05;
    public final UserSession A06;
    public final C65953Twy A07;
    public final InterfaceC37188GZz A08;

    @Override // X.InterfaceC62602sz
    public final boolean CXf() {
        return true;
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        if (this.A05.getLifecycle().A07().A00(C07S.RESUMED) && !this.A02 && !this.A01 && AbstractC167007dF.A1W(this.A00)) {
            Chd();
        }
    }

    @Override // X.InterfaceC62602sz
    public final boolean CL7() {
        return this.A08.CL7();
    }

    @Override // X.InterfaceC62602sz
    public final boolean CLJ() {
        return AbstractC167007dF.A1W(this.A00);
    }

    @Override // X.InterfaceC62602sz
    public final void Chd() {
        this.A08.Chd();
    }

    @Override // X.InterfaceC62602sz
    public final boolean isLoading() {
        if (!this.A02) {
            if (AbstractC167007dF.A1W(this.A00) && !this.A01) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C31543DtT(C07X c07x, UserSession userSession, InterfaceC37188GZz interfaceC37188GZz) {
        AbstractC167027dH.A13(c07x, interfaceC37188GZz, userSession);
        this.A05 = c07x;
        this.A08 = interfaceC37188GZz;
        this.A06 = userSession;
        this.A07 = new C65953Twy(userSession, this, C05F.A01, 4);
    }

    @Override // X.InterfaceC62602sz
    public final boolean CUG() {
        return this.A01;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-1172376703);
        C14360o3.A0B(c3fq, 0);
        this.A03 = i5;
        this.A07.onScroll(c3fq, i, i2, i3, i4, i5);
        C0f9.A0A(1312467857, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A0N = AbstractC167017dG.A0N(c3fq, -82591321);
        if (c3fq.CQ6() && this.A03 <= 0 && i == 0 && this.A04 == 1) {
            this.A08.Dit();
        }
        this.A04 = i;
        this.A07.onScrollStateChanged(c3fq, i);
        C0f9.A0A(2049895578, A0N);
    }
}
