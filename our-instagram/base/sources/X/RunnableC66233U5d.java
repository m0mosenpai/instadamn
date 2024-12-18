package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.U5d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC66233U5d implements Runnable {
    public final /* synthetic */ U55 A00;

    public RunnableC66233U5d(U55 u55) {
        this.A00 = u55;
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
