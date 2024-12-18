package X;

import com.facebook.R;

/* loaded from: classes9.dex */
public final class NGQ extends AbstractRunnableC14200nk {
    public final /* synthetic */ C50641MXd A00;
    public final /* synthetic */ Integer A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGQ(C50641MXd c50641MXd, Integer num) {
        super(592);
        this.A00 = c50641MXd;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C50641MXd c50641MXd = this.A00;
        if (this.A01.intValue() != 0) {
            i = R.raw.poses_shutter;
        } else {
            i = R.raw.poses_shutter_final_interval;
        }
        C50641MXd.A02(c50641MXd, i);
    }
}
