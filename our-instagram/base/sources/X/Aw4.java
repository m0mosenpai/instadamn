package X;

import android.widget.ProgressBar;

/* loaded from: classes4.dex */
public final class Aw4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C86Q A01;

    public Aw4(C86Q c86q, int i) {
        this.A01 = c86q;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressBar progressBar = this.A01.A02;
        if (progressBar != null) {
            progressBar.setProgress(this.A00);
        }
    }
}
