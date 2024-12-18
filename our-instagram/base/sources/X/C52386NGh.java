package X;

import com.facebook.R;

/* renamed from: X.NGh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52386NGh extends AbstractRunnableC14200nk {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C50641MXd A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52386NGh(C50641MXd c50641MXd, Integer num, long j, boolean z) {
        super(591);
        this.A01 = c50641MXd;
        this.A00 = j;
        this.A02 = num;
        this.A03 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        C50641MXd c50641MXd;
        int i;
        long j2 = this.A00;
        Integer num = this.A02;
        int intValue = num.intValue();
        if (intValue != 0) {
            j = Long.MAX_VALUE;
        } else {
            j = 1000;
        }
        boolean A1S = AbstractC31175DnJ.A1S((j2 > j ? 1 : (j2 == j ? 0 : -1)));
        if (!this.A03 && A1S) {
            c50641MXd = this.A01;
            if (num.intValue() != 0) {
                i = R.raw.poses_shutter;
            } else {
                i = R.raw.poses_shutter_final_interval;
            }
        } else {
            c50641MXd = this.A01;
            if (intValue != 0) {
                i = -1;
            } else {
                i = R.raw.poses_countdown;
            }
        }
        C50641MXd.A02(c50641MXd, i);
    }
}
