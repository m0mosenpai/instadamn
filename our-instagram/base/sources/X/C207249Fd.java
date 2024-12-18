package X;

/* renamed from: X.9Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207249Fd extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207249Fd(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = obj4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C119135aV c119135aV;
        int AB8;
        AbstractC119735bX abstractC119735bX;
        C5AW c5aw = (C5AW) obj;
        if (this.A00 != 0) {
            C59W[] c59wArr = (C59W[]) this.A05;
            C119605bI c119605bI = (C119605bI) this.A06;
            int i = this.A02;
            int i2 = this.A01;
            InterfaceC1131259a interfaceC1131259a = (InterfaceC1131259a) this.A04;
            int[] iArr = (int[]) this.A03;
            int length = c59wArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                C59W c59w = c59wArr[i3];
                int i5 = i4 + 1;
                C14360o3.A0A(c59w);
                Object BbJ = c59w.BbJ();
                if (BbJ instanceof C119135aV) {
                    c119135aV = (C119135aV) BbJ;
                } else {
                    c119135aV = null;
                }
                AnonymousClass583 layoutDirection = interfaceC1131259a.getLayoutDirection();
                if (c119135aV != null && (abstractC119735bX = c119135aV.A01) != null) {
                    AB8 = abstractC119735bX.A00(c59w, layoutDirection, i - c59w.A01, i2);
                } else {
                    AB8 = c119605bI.A00.AB8(layoutDirection, 0, i - c59w.A01);
                }
                c5aw.A05(c59w, 0.0f, AB8, iArr[i4]);
                i3++;
                i4 = i5;
            }
        } else {
            C5XX.A03(((C5XY) this.A06).A00, (InterfaceC1131559d) this.A03, c5aw, (C59W) this.A04, ((InterfaceC1131259a) this.A05).getLayoutDirection(), this.A02, this.A01);
        }
        return C0eB.A00;
    }
}
