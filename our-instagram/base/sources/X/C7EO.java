package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;
import com.instagram.direct.fragment.permanentmedia.DirectAggregatedMediaViewerController;

/* renamed from: X.7EO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7EO extends C7EP {
    public final /* synthetic */ DirectAggregatedMediaViewerController A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return false;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(scaleGestureDetectorOnScaleGestureListenerC81153jk, 0);
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        C7ET c7et = directAggregatedMediaViewerController.A1C;
        if (c7et.isIdle()) {
            ReboundViewPager reboundViewPager = directAggregatedMediaViewerController.A0D;
            if (reboundViewPager == null) {
                C14360o3.A0F("viewPager");
                throw C00O.createAndThrow();
            }
            if (reboundViewPager.A0O == C3VZ.A03) {
                SimpleZoomableViewContainer simpleZoomableViewContainer = directAggregatedMediaViewerController.A0F;
                if (simpleZoomableViewContainer != null) {
                    TouchInterceptorFrameLayout touchInterceptorFrameLayout = directAggregatedMediaViewerController.A0E;
                    if (touchInterceptorFrameLayout != null) {
                        c7et.EoL(touchInterceptorFrameLayout, simpleZoomableViewContainer, scaleGestureDetectorOnScaleGestureListenerC81153jk);
                        DirectAggregatedMediaViewerController.A0X(directAggregatedMediaViewerController, false);
                        DirectAggregatedMediaViewerController.A0W(directAggregatedMediaViewerController, false);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        return false;
    }

    public C7EO(DirectAggregatedMediaViewerController directAggregatedMediaViewerController) {
        this.A00 = directAggregatedMediaViewerController;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        DirectAggregatedMediaViewerController directAggregatedMediaViewerController = this.A00;
        DirectAggregatedMediaViewerController.A0X(directAggregatedMediaViewerController, true);
        DirectAggregatedMediaViewerController.A0W(directAggregatedMediaViewerController, true);
    }
}
