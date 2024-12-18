package X;

/* loaded from: classes6.dex */
public final class GFL implements GYG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GFL(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.GYG
    public final void D04(boolean z) {
        Object obj;
        switch (this.A00) {
            case 0:
                EO1 eo1 = (EO1) this.A02;
                eo1.A06 = z;
                EO1.A00(eo1);
                obj = this.A01;
                break;
            case 1:
                EO2 eo2 = (EO2) this.A01;
                eo2.A07 = z;
                EO2.A02(eo2);
                obj = this.A02;
                break;
            default:
                ELY ely = (ELY) this.A02;
                if (ely.A04 != z) {
                    ely.A05 = true;
                }
                ely.A04 = z;
                ELY.A03(ely);
                obj = this.A01;
                break;
        }
        ((C189478aR) obj).A0L(null);
    }
}
