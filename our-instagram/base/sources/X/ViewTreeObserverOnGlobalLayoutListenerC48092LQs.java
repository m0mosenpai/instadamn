package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.LQs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC48092LQs implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public ViewTreeObserverOnGlobalLayoutListenerC48092LQs(View view, ReelViewerFragment reelViewerFragment) {
        this.A01 = reelViewerFragment;
        this.A00 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ReelViewerFragment reelViewerFragment = this.A01;
        if (reelViewerFragment.isAdded()) {
            FragmentActivity requireActivity = reelViewerFragment.requireActivity();
            CallerContext callerContext = ReelViewerFragment.A3T;
            AbstractC145016gM.A05(requireActivity, reelViewerFragment.getSession(), !AbstractC13440mV.A07());
        }
        AbstractC166997dE.A1K(this.A00, this);
    }
}
