package X;

import android.view.View;

/* renamed from: X.GKa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36801GKa implements Runnable {
    public final /* synthetic */ C31720DwP A00;

    public RunnableC36801GKa(C31720DwP c31720DwP) {
        this.A00 = c31720DwP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        C31720DwP c31720DwP = this.A00;
        View view = c31720DwP.mView;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        c31720DwP.A00 = i;
    }
}
