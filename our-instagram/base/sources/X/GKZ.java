package X;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public final class GKZ implements Runnable {
    public final /* synthetic */ C31720DwP A00;

    public GKZ(C31720DwP c31720DwP) {
        this.A00 = c31720DwP;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup.LayoutParams layoutParams;
        C31720DwP c31720DwP = this.A00;
        View view = c31720DwP.mView;
        if (view != null && view.getHeight() == c31720DwP.A00) {
            return;
        }
        View view2 = c31720DwP.mView;
        if (view2 != null) {
            layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = c31720DwP.A00;
            }
        } else {
            layoutParams = null;
        }
        View view3 = c31720DwP.mView;
        if (view3 == null) {
            return;
        }
        view3.setLayoutParams(layoutParams);
    }
}
