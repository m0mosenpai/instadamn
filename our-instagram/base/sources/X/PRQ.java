package X;

import android.widget.ProgressBar;

/* loaded from: classes9.dex */
public final class PRQ implements Runnable {
    public final /* synthetic */ PCS A00;
    public final /* synthetic */ C51901Mwj A01;

    public PRQ(PCS pcs, C51901Mwj c51901Mwj) {
        this.A01 = c51901Mwj;
        this.A00 = pcs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Integer num = this.A01.A03;
        if (num != null) {
            PCS pcs = this.A00;
            ((ProgressBar) pcs.A0A.getValue()).setProgress(num.intValue());
        }
    }
}
