package X;

/* loaded from: classes9.dex */
public final class P0C implements XCX {
    public final /* synthetic */ NKN A00;

    public P0C(NKN nkn) {
        this.A00 = nkn;
    }

    @Override // X.XCX
    public final void D7w() {
        NKN nkn = this.A00;
        Runnable runnable = nkn.A02;
        if (runnable != null) {
            runnable.run();
        }
        C05A c05a = nkn.A08;
        if (((C51721Msy) c05a.getValue()).A01 == null) {
            C51721Msy c51721Msy = (C51721Msy) c05a.getValue();
            c05a.Egh(new C51721Msy(c51721Msy.A01, 2, c51721Msy.A03, true, c51721Msy.A04));
        }
    }

    @Override // X.XCX
    public final void D9V(String str) {
        NKN.A01(this.A00, str);
    }
}
