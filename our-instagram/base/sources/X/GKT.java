package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class GKT implements Runnable {
    public final /* synthetic */ FK5 A00;

    public GKT(FK5 fk5) {
        this.A00 = fk5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewParent parent;
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null && (parent = frameLayout.getParent()) != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(frameLayout);
            frameLayout.removeAllViews();
        }
    }
}
