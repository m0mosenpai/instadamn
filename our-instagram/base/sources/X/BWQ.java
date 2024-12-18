package X;

import android.os.CountDownTimer;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: classes5.dex */
public final class BWQ extends CountDownTimer {
    public final /* synthetic */ BWT A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BWQ(BWT bwt, long j) {
        super(j, 35L);
        this.A00 = bwt;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C3VZ c3vz;
        BWT bwt = this.A00;
        AbstractC25398BLp abstractC25398BLp = bwt.A03;
        C2XI c2xi = abstractC25398BLp.A08;
        AbstractC25227BEk.A1D(c2xi, 1.0f);
        C2XI c2xi2 = abstractC25398BLp.A0A;
        int A0B = AbstractC25230BEn.A0B(c2xi2) + 1;
        int A03 = abstractC25398BLp.A03();
        ReboundViewPager reboundViewPager = bwt.A01;
        if (reboundViewPager != null) {
            c3vz = reboundViewPager.A0O;
        } else {
            c3vz = null;
        }
        if (c3vz == C3VZ.A03) {
            if (A0B >= A03 && !abstractC25398BLp.A0E()) {
                abstractC25398BLp.A08();
                return;
            }
            abstractC25398BLp.A04().Cm1(C05F.A00, AbstractC25230BEn.A0B(c2xi2), A0B % abstractC25398BLp.A03());
            if (abstractC25398BLp.A0E()) {
                ReboundViewPager reboundViewPager2 = abstractC25398BLp.A03;
                if (reboundViewPager2 != null) {
                    reboundViewPager2.A0B(0.0f);
                }
            } else {
                ReboundViewPager reboundViewPager3 = abstractC25398BLp.A03;
                if (reboundViewPager3 != null) {
                    reboundViewPager3.A0L(A0B, 0.0f);
                }
            }
            BWQ bwq = new BWQ(bwt, bwt.A00);
            bwq.start();
            AbstractC25227BEk.A1D(c2xi, 0.0f);
            AbstractC25227BEk.A1E(c2xi2, A0B);
            bwt.A02 = bwq;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        BWT bwt = this.A00;
        C2XI c2xi = bwt.A03.A08;
        long j2 = bwt.A00;
        AbstractC25227BEk.A1D(c2xi, ((float) (j2 - j)) / ((float) j2));
    }
}
