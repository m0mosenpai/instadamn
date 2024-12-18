package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel;

/* loaded from: classes4.dex */
public final class AW7 implements InterfaceC199548s4 {
    public final InstagramFilterFactoryProvider A00;
    public final DetectionFilterModel A01;

    @Override // X.InterfaceC199548s4
    public final void AC1(FilterManagerImpl filterManagerImpl, AnonymousClass810 anonymousClass810, String str) {
    }

    @Override // X.InterfaceC199548s4
    public final void AC6(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        DetectionFilterModel detectionFilterModel = this.A01;
        if (filterManagerImpl.mCachedModel != detectionFilterModel) {
            filterManagerImpl.mCachedModel = detectionFilterModel;
            filterManagerImpl.createFilter(this.A00.createFilterFactory(detectionFilterModel.getFilterName()));
        }
    }

    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
    }

    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
    }

    @Override // X.InterfaceC199548s4
    public final FilterModel B6R() {
        return this.A01;
    }

    public AW7(InstagramFilterFactoryProvider instagramFilterFactoryProvider, DetectionFilterModel detectionFilterModel) {
        AbstractC167017dG.A1P(detectionFilterModel, instagramFilterFactoryProvider);
        this.A01 = detectionFilterModel;
        this.A00 = instagramFilterFactoryProvider;
    }
}
