package X;

import android.view.ViewParent;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Itb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42618Itb implements JG7 {
    public final C676533f A00;

    @Override // X.JG7
    public final void DiL(C38321qM c38321qM, C75113Zb c75113Zb, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk, MediaFrameLayout mediaFrameLayout, int i) {
        AbstractC167017dG.A1N(scaleGestureDetectorOnScaleGestureListenerC81153jk, c38321qM);
        C14360o3.A0B(mediaFrameLayout, 4);
        C676533f c676533f = this.A00;
        if (!c676533f.A02() && (mediaFrameLayout.getParent() instanceof InterfaceC73933Tf)) {
            ViewParent parent = mediaFrameLayout.getParent();
            C14360o3.A0C(parent, "null cannot be cast to non-null type com.instagram.common.ui.widget.zoomcontainer.ZoomableViewContainer");
            c676533f.A01(mediaFrameLayout, (InterfaceC73933Tf) parent, c38321qM, scaleGestureDetectorOnScaleGestureListenerC81153jk, c75113Zb.A03, i);
        }
    }

    public C42618Itb(C676533f c676533f) {
        this.A00 = c676533f;
    }
}
