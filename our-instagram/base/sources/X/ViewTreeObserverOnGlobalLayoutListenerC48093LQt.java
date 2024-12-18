package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.common.callercontext.CallerContext;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.LQt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC48093LQt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public ViewTreeObserverOnGlobalLayoutListenerC48093LQt(View view, ReelViewerFragment reelViewerFragment) {
        this.A01 = reelViewerFragment;
        this.A00 = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ReelViewerFragment reelViewerFragment = this.A01;
        CallerContext callerContext = ReelViewerFragment.A3T;
        reelViewerFragment.A2j = true;
        View view = this.A00;
        int height = view.getHeight();
        int width = view.getWidth();
        reelViewerFragment.A03 = height;
        reelViewerFragment.A04 = width;
        ReelViewerFragment.A0B(reelViewerFragment.A0a, reelViewerFragment.Av7(), reelViewerFragment);
        InterfaceC147266kB interfaceC147266kB = reelViewerFragment.mViewPager;
        if (interfaceC147266kB != null) {
            C3Vd c3Vd = ((C147256kA) interfaceC147266kB).A00;
            if (c3Vd instanceof C147986lU) {
                C14360o3.A0C(c3Vd, "null cannot be cast to non-null type com.instagram.common.ui.widget.reboundviewpager.CubeItemPositioner");
                C147986lU c147986lU = (C147986lU) c3Vd;
                c147986lU.A03 = 0;
                c147986lU.A02 = 0;
            }
        }
        AbstractC166997dE.A1K(view, this);
    }
}
