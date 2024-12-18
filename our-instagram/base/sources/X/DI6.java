package X;

/* loaded from: classes5.dex */
public final class DI6 extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C5Hb A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DI6(C5Hb c5Hb, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(1);
        this.A05 = c5Hb;
        this.A03 = i;
        this.A06 = z;
        this.A04 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A02 = i5;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C5AW c5aw = (C5AW) obj;
        C14360o3.A0B(c5aw, 0);
        C5Hb c5Hb = this.A05;
        int i2 = this.A03;
        boolean z = this.A06;
        int i3 = this.A04;
        int i4 = this.A01;
        int i5 = this.A00;
        int i6 = this.A02;
        int i7 = 0;
        for (Object obj2 : c5Hb) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C59W c59w = (C59W) obj2;
            int i9 = c59w.A00;
            int i10 = c59w.A01;
            int i11 = (i2 - i9) / 2;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        i = i3 - i10;
                    }
                } else if (z) {
                    i = (i3 - i4) / 2;
                } else {
                    i = ((i5 - i4) / 2) + i6;
                }
                c5aw.A05(c59w, 0.0f, i, i11);
            } else {
                c5aw.A05(c59w, 0.0f, 0, i11);
            }
            i7 = i8;
        }
        return C0eB.A00;
    }
}
