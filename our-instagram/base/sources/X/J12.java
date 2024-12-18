package X;

import android.widget.ImageView;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* loaded from: classes7.dex */
public final class J12 implements InterfaceC676933j {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C39035HGl A01;
    public final /* synthetic */ SimpleZoomableViewContainer A02;
    public final /* synthetic */ ViewOnTouchListenerC676833i A03;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
    }

    public J12(ImageView imageView, C39035HGl c39035HGl, SimpleZoomableViewContainer simpleZoomableViewContainer, ViewOnTouchListenerC676833i viewOnTouchListenerC676833i) {
        this.A01 = c39035HGl;
        this.A03 = viewOnTouchListenerC676833i;
        this.A02 = simpleZoomableViewContainer;
        this.A00 = imageView;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = this.A03;
        if (viewOnTouchListenerC676833i.isIdle()) {
            viewOnTouchListenerC676833i.EoL(this.A00, this.A02, scaleGestureDetectorOnScaleGestureListenerC81153jk);
            return true;
        }
        return true;
    }
}
