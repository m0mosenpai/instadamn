package X;

import java.util.List;

/* renamed from: X.Mid, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51134Mid extends C2UU {
    public final OTJ A02 = new OTJ(0);
    public final List A03 = AbstractC166987dD.A1E();
    public boolean A01 = true;
    public int A00 = -1;

    public final void A03(int i) {
        int i2;
        C52408NHe c52408NHe = (C52408NHe) this;
        int i3 = c52408NHe.A01;
        if (i >= 0 && i < ((AbstractC51134Mid) c52408NHe).A03.size()) {
            i2 = (i * 2) + 1;
        } else {
            i2 = -2;
        }
        c52408NHe.A01 = i2;
        c52408NHe.notifyItemRangeChanged(Math.max(0, i3 - 2), 5);
        int i4 = c52408NHe.A01;
        if (i4 != -2) {
            c52408NHe.notifyItemRangeChanged(Math.max(0, i4 - 2), 5);
        }
    }

    public final void A04(int i) {
        int i2 = this.A00;
        this.A00 = i;
        if (this.A01) {
            notifyItemChanged(i2);
            notifyItemChanged(this.A00);
        }
    }

    public void A05(int i, int i2) {
        List list = this.A03;
        list.add(i2, list.remove(i));
    }
}
