package X;

import java.util.Iterator;

/* loaded from: classes7.dex */
public final class IMQ {
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final java.util.Set A08 = AbstractC166987dD.A1H();

    public final void A00(int i) {
        if (i != this.A01) {
            this.A01 = i;
            if (i > this.A00) {
                this.A00 = i;
            }
            Iterator it = this.A08.iterator();
            while (it.hasNext()) {
                ((JGF) it.next()).Dcl(this, 1);
            }
        }
    }
}
