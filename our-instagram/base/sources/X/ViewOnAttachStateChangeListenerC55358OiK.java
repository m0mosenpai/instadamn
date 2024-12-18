package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: X.OiK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC55358OiK implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C14360o3.A0B(view, 0);
        ((ShimmerFrameLayout) view).A02();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C14360o3.A0B(view, 0);
        ((ShimmerFrameLayout) view).A03();
    }
}
