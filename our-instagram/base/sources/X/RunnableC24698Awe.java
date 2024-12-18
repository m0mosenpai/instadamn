package X;

import android.widget.ProgressBar;

/* renamed from: X.Awe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24698Awe implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C189988bH A01;

    public RunnableC24698Awe(C189988bH c189988bH, double d) {
        this.A01 = c189988bH;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProgressBar progressBar = this.A01.A0E;
        if (progressBar != null) {
            progressBar.setProgress((int) (100.0d * this.A00));
        }
    }
}
