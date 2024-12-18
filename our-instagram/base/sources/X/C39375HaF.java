package X;

/* renamed from: X.HaF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39375HaF extends AbstractC140746Yc {
    public final int A00;
    public final InterfaceC671231d A01;
    public final C1PY A02;

    @Override // X.AbstractC672431p
    public final int A03(C40861ut c40861ut, int i, int i2, int i3) {
        C14360o3.A0B(c40861ut, 0);
        return A02(i, i2, i3, A01(i3, c40861ut.A03()), c40861ut.A07(), c40861ut.A08());
    }

    @Override // X.AbstractC672431p
    public final boolean A0K(C40861ut c40861ut) {
        return false;
    }

    public /* synthetic */ C39375HaF(InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C1PY c1py, int i) {
        super(new AnonymousClass326(), new C671931k(interfaceC62242sP), true);
        this.A02 = c1py;
        this.A00 = i;
        this.A01 = interfaceC671231d;
    }

    @Override // X.AbstractC672431p
    public final int A01(int i, int i2) {
        return Math.max(this.A00 + i2, i + 1);
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        C37644Ghd c37644Ghd = (C37644Ghd) obj;
        C14360o3.A0B(c37644Ghd, 0);
        return c37644Ghd.A06();
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ C40861ut A09(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        return (C40861ut) c206239Bg.A04;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        C37644Ghd c37644Ghd = (C37644Ghd) obj;
        C14360o3.A0B(c37644Ghd, 0);
        return this.A01.BUP(c37644Ghd.A06());
    }

    @Override // X.AbstractC672431p
    public final boolean A0H(InterfaceC57162jr interfaceC57162jr, C1PZ c1pz, C40861ut c40861ut, int i, int i2, int i3) {
        AbstractC37302Gc3.A1U(c40861ut, c1pz);
        if (this.A02.A02.isEmpty() || this.A0D.size() < c40861ut.A07()) {
            return false;
        }
        c1pz.A01("consumed_media_gap_did_meet");
        return true;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0I(InterfaceC57162jr interfaceC57162jr, C40861ut c40861ut, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
