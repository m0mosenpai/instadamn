package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter;

/* renamed from: X.9XH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9XH extends C9XI {
    @Override // X.C9XI, X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        super.ACJ(filterManagerImpl);
        ZoomTransitionFilter zoomTransitionFilter = (ZoomTransitionFilter) ((AbstractC199818si) this).A00;
        filterManagerImpl.setFloatParameter("max_blur", zoomTransitionFilter.A00);
        filterManagerImpl.setFloatParameter("strength", zoomTransitionFilter.A01);
    }
}
