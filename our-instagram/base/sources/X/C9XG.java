package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter;

/* renamed from: X.9XG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9XG extends C9XI {
    @Override // X.C9XI, X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        super.ACJ(filterManagerImpl);
        BlurTransitionFilter blurTransitionFilter = (BlurTransitionFilter) ((AbstractC199818si) this).A00;
        filterManagerImpl.setFloatParameter("max_blur", blurTransitionFilter.A01);
        filterManagerImpl.setFloatParameter("brightness", blurTransitionFilter.A00);
    }
}
