package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.WqP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71234WqP implements Runnable {
    public final /* synthetic */ U56 A00;

    public RunnableC71234WqP(U56 u56) {
        this.A00 = u56;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout = this.A00.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout);
            }
            frameLayout.removeAllViews();
        }
    }
}
