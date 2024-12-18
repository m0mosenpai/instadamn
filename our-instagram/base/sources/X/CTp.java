package X;

/* loaded from: classes5.dex */
public abstract class CTp {
    public final int A00;
    public final boolean A01;

    public final String A00() {
        CWM cwm;
        if (this instanceof C3R) {
            C29509CzN c29509CzN = ((C3R) this).A01;
            if (c29509CzN == null) {
                return null;
            }
            return c29509CzN.A04;
        }
        if (!(this instanceof C3S) || (cwm = ((C3S) this).A01.A01) == null) {
            return null;
        }
        return cwm.A0A;
    }

    public CTp(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}
