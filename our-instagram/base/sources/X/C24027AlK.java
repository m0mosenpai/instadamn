package X;

/* renamed from: X.AlK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24027AlK implements InterfaceC189998bI {
    public final /* synthetic */ C190018bK A00;

    public C24027AlK(C190018bK c190018bK) {
        this.A00 = c190018bK;
    }

    @Override // X.InterfaceC189998bI
    public final void Dj5(BE3 be3) {
        C190018bK c190018bK = this.A00;
        if (be3 == c190018bK.A00) {
            c190018bK.A01.Dj5(be3);
            c190018bK.A00 = null;
        }
    }

    @Override // X.InterfaceC189998bI
    public final void Dj6(BE3 be3) {
        C190018bK c190018bK = this.A00;
        c190018bK.A00 = be3;
        c190018bK.A01.Dj6(be3);
    }

    @Override // X.InterfaceC189998bI
    public final void Dj7(BE3 be3, int i) {
        C190018bK c190018bK = this.A00;
        if (be3 == c190018bK.A00) {
            for (BE3 be32 : c190018bK.A02) {
                if (be32 != c190018bK.A00) {
                    be32.DnC(i);
                }
            }
            c190018bK.A01.Dj7(be3, i);
        }
    }
}
