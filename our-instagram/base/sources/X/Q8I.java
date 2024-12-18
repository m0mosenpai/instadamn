package X;

/* loaded from: classes10.dex */
public final class Q8I extends C58252li {
    public SJG A00;
    public Throwable A01;

    public static void A00(Q8I q8i) {
        SJG sjg = q8i.A00;
        if (sjg != null) {
            sjg.A02 = null;
            if (q8i.A01 != null) {
                int i = 0;
                if (sjg.A08.isEmpty()) {
                    i = Integer.MAX_VALUE;
                }
                Throwable th = q8i.A01;
                if (th instanceof C64865TXq) {
                    int A05 = AbstractC25226BEj.A05(q8i.A00.A08);
                    int i2 = ((C64865TXq) th).A00;
                    if (A05 > i2) {
                        i = i2;
                    } else if (!q8i.A00.A08.isEmpty()) {
                        i = AbstractC25226BEj.A05(q8i.A00.A08);
                    }
                }
                if (q8i.A00.A08.size() > i) {
                    SJG sjg2 = q8i.A00;
                    sjg2.A02 = AbstractC25226BEj.A1I(sjg2.A08, i);
                }
            }
            q8i.A0A(q8i.A00);
        }
    }
}
