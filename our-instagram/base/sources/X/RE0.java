package X;

import android.view.View;

/* loaded from: classes10.dex */
public final class RE0 extends SWN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final View.OnClickListener A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public static RE0 A00(RDr rDr, Integer num) {
        SE4 se4 = new SE4();
        se4.A00 = num;
        ((AbstractC61568Rpr) rDr).A02 = new SW2(se4);
        return new RE0(rDr);
    }

    public RE0(RDr rDr) {
        super(rDr);
        this.A05 = rDr.A05;
        this.A02 = rDr.A02;
        this.A01 = rDr.A01;
        this.A04 = rDr.A04;
        this.A00 = rDr.A00;
        this.A06 = rDr.A06;
        this.A07 = rDr.A07;
        this.A08 = rDr.A08;
        this.A03 = rDr.A03;
    }
}
