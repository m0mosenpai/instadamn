package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.GGm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36717GGm implements InterfaceC125355lh {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    public C36717GGm(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
        if (reboundViewPager == null) {
            C14360o3.A0F("viewPager");
            throw C00O.createAndThrow();
        }
        reboundViewPager.setVisibility(0);
        View view = directAggregatedMediaViewerController.A06;
        if (view != null) {
            view.postDelayed(new GL9(directAggregatedMediaViewerController), 100L);
        }
        InterfaceC37230Gaf interfaceC37230Gaf = directAggregatedMediaViewerController.A0M;
        if (interfaceC37230Gaf != null) {
            interfaceC37230Gaf.A9G();
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = directAggregatedMediaViewerController.A0E;
        if (touchInterceptorFrameLayout != null && touchInterceptorFrameLayout.getHeight() > 0) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = directAggregatedMediaViewerController.A0E;
            C14360o3.A0A(touchInterceptorFrameLayout2);
            directAggregatedMediaViewerController.A0V = Integer.valueOf(touchInterceptorFrameLayout2.getHeight());
        }
        directAggregatedMediaViewerController.A0h = true;
        DirectAggregatedMediaViewerController.A0J(directAggregatedMediaViewerController.A08, directAggregatedMediaViewerController);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = directAggregatedMediaViewerController.A0E;
        if (touchInterceptorFrameLayout3 != null) {
            touchInterceptorFrameLayout3.requestFocus();
        }
    }
}
