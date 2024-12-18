package X;

import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* renamed from: X.PHv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56778PHv implements InterfaceC676933j {
    public final /* synthetic */ C54650OCc A00;

    @Override // X.InterfaceC676933j
    public final boolean DiJ(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        return true;
    }

    @Override // X.InterfaceC676933j
    public final void DiP(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
    }

    public C56778PHv(C54650OCc c54650OCc) {
        this.A00 = c54650OCc;
    }

    @Override // X.InterfaceC676933j
    public final boolean DiK(ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        Object obj;
        C54650OCc c54650OCc = this.A00;
        C676533f c676533f = c54650OCc.A01;
        if (!c676533f.A02()) {
            C54649OCb c54649OCb = c54650OCc.A02;
            String str = c54649OCb.A03;
            C120985dq c120985dq = c54649OCb.A02.A06;
            if (AbstractC25397BLo.A00(c120985dq)) {
                obj = c54649OCb.A01.A00;
            } else {
                obj = null;
            }
            String A0R = AnonymousClass001.A0R("clips_zoomable_container_", str);
            if (obj != null) {
                StringBuilder A11 = AbstractC166997dE.A11(A0R);
                A11.append('_');
                A0R = AbstractC166997dE.A0v(obj, A11);
            }
            SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) c54649OCb.A00.A05.A03(A0R);
            if (simpleZoomableViewContainer == null) {
                C0f5 AEp = C18950wb.A01.AEp("ig_android_reels_empty_zoomable_container", 307496533);
                AEp.ABW("isCarouselOrganic", String.valueOf(AbstractC25397BLo.A00(c120985dq)));
                AEp.ABW("carouselIndex", String.valueOf(AbstractC166987dD.A0H(c54649OCb.A01.A00)));
                AEp.ABW("tag", String.valueOf(A0R));
                AEp.report();
                return true;
            }
            c676533f.A01(AnonymousClass040.A00(simpleZoomableViewContainer, 0), simpleZoomableViewContainer, null, c54650OCc.A00, 0, 0);
            return true;
        }
        return true;
    }
}
