package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.Fpp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC35715Fpp implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ContextualFeedFragment A01;

    public ViewTreeObserverOnGlobalLayoutListenerC35715Fpp(View view, ContextualFeedFragment contextualFeedFragment) {
        this.A01 = contextualFeedFragment;
        this.A00 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        FragmentActivity activity = this.A01.getActivity();
        if (activity != null) {
            AbstractC31175DnJ.A0i(activity);
        }
        ViewTreeObserver viewTreeObserver = this.A00.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
