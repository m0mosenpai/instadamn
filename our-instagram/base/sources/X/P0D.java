package X;

/* loaded from: classes9.dex */
public final class P0D implements XCX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NKN A02;
    public final /* synthetic */ C47Z A03;
    public final /* synthetic */ String A04;

    public P0D(NKN nkn, C47Z c47z, String str, int i, int i2) {
        this.A02 = nkn;
        this.A03 = c47z;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.XCX
    public final void D7w() {
        NKN nkn = this.A02;
        nkn.A05.A01(nkn.A04, this.A03, this.A04, this.A01, this.A00, 0L, false);
    }

    @Override // X.XCX
    public final void D9V(String str) {
        NKN.A01(this.A02, str);
    }
}
