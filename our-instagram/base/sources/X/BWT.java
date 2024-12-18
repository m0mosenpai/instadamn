package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: classes5.dex */
public final class BWT {
    public long A00;
    public ReboundViewPager A01;
    public BWQ A02;
    public final AbstractC25398BLp A03;

    public final void A00() {
        BWQ bwq = this.A02;
        if (bwq != null) {
            bwq.cancel();
            this.A02 = null;
        }
    }

    public final void A01() {
        if (this.A02 == null) {
            BWQ bwq = new BWQ(this, ((float) this.A00) * (1.0f - AbstractC166987dD.A09(this.A03.A08.A00)));
            bwq.start();
            this.A02 = bwq;
        }
    }

    public BWT(AbstractC25398BLp abstractC25398BLp, long j) {
        this.A03 = abstractC25398BLp;
        this.A00 = j;
    }
}
