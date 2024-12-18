package X;

import android.widget.ProgressBar;

/* loaded from: classes10.dex */
public final class TO9 implements Runnable {
    public final /* synthetic */ K5D A00;
    public final /* synthetic */ boolean A01;

    public TO9(K5D k5d, boolean z) {
        this.A01 = z;
        this.A00 = k5d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressBar progressBar;
        boolean z = this.A01;
        K5D k5d = this.A00;
        if (z) {
            ProgressBar progressBar2 = k5d.A06;
            C14360o3.A0A(progressBar2);
            progressBar2.setVisibility(0);
            progressBar = k5d.A07;
        } else {
            progressBar = k5d.A06;
        }
        C14360o3.A0A(progressBar);
        progressBar.setVisibility(8);
    }
}
