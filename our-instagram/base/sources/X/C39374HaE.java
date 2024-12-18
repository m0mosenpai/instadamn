package X;

/* renamed from: X.HaE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39374HaE extends AbstractC140746Yc {
    public final C1PY A00;

    public C39374HaE(InterfaceC670931a interfaceC670931a, C1PY c1py, InterfaceC672031l interfaceC672031l) {
        super(interfaceC670931a, interfaceC672031l, true);
        this.A00 = c1py;
    }

    @Override // X.AbstractC672431p
    public final int A01(int i, int i2) {
        return i + i2;
    }

    @Override // X.AbstractC672431p
    public final int A03(C40861ut c40861ut, int i, int i2, int i3) {
        C14360o3.A0B(c40861ut, 0);
        int A03 = c40861ut.A03();
        if (i3 >= A03) {
            A03 += i3;
        }
        return A02(i, i2, i3, A03, c40861ut.A01(), c40861ut.A02());
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0I(InterfaceC57162jr interfaceC57162jr, C40861ut c40861ut, Object obj, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(c40861ut, 5);
        if (this.A00.A02.isEmpty() || i4 < c40861ut.A01() || i5 < c40861ut.A02()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC672431p
    public final boolean A0K(C40861ut c40861ut) {
        return false;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        throw AbstractC166987dD.A15("discoveryChainPosition");
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        throw AbstractC166987dD.A15("discoveryChainingViewModel");
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ C40861ut A09(Object obj) {
        return C37469Gen.A00(obj);
    }

    @Override // X.AbstractC672431p
    public final boolean A0H(InterfaceC57162jr interfaceC57162jr, C1PZ c1pz, C40861ut c40861ut, int i, int i2, int i3) {
        AbstractC37302Gc3.A1U(c40861ut, c1pz);
        if (this.A00.A02.isEmpty() || this.A0D.size() < c40861ut.A01() || this.A0E.size() < c40861ut.A02()) {
            return false;
        }
        c1pz.A01("consumed_media_gap_did_meet");
        return true;
    }
}
