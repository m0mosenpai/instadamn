package X;

/* loaded from: classes12.dex */
public final class XNF extends AbstractC99974eJ {
    public static boolean A01 = true;
    public static boolean A02;
    public final C84193pB A00;

    @Override // X.AbstractC219814y
    public final void A04() {
        this.A00.A03();
    }

    @Override // X.AbstractC219814y
    public final boolean A05() {
        int i;
        if (!A01) {
            return false;
        }
        try {
            if (A02) {
                i = 500;
            } else {
                i = this.A05;
            }
            if (this.A00.A02(i, ((AbstractC99974eJ) this).A00) < 0) {
                A02 = true;
                return false;
            }
            A02 = false;
            return true;
        } catch (Error unused) {
            A01 = false;
            return false;
        }
    }

    public XNF(C84193pB c84193pB, int[] iArr, int i) {
        super(i, iArr);
        this.A00 = c84193pB;
    }
}
