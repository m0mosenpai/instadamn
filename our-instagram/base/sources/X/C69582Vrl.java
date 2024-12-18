package X;

/* renamed from: X.Vrl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69582Vrl {
    public boolean A00;
    public final C69371VmH A01;
    public final boolean[] A02;
    public final /* synthetic */ C71183WpV A03;

    public C69582Vrl(C69371VmH c69371VmH, C71183WpV c71183WpV) {
        boolean[] zArr;
        this.A03 = c71183WpV;
        this.A01 = c69371VmH;
        if (c69371VmH.A01) {
            zArr = null;
        } else {
            zArr = new boolean[c71183WpV.A06];
        }
        this.A02 = zArr;
    }

    public final void A00() {
        C71183WpV.A00(this, this.A03, false);
    }
}
