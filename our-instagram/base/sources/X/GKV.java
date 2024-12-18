package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class GKV implements Runnable {
    public final /* synthetic */ C34571FLg A00;

    public GKV(C34571FLg c34571FLg) {
        this.A00 = c34571FLg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout);
                frameLayout.removeAllViews();
            }
        }
    }
}
