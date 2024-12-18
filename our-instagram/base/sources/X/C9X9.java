package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter;

/* renamed from: X.9X9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9X9 extends AbstractC199818si {
    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        C14360o3.A0B(filterManagerImpl, 0);
        GainmapAlphaFilter gainmapAlphaFilter = (GainmapAlphaFilter) this.A00;
        filterManagerImpl.setFloatArrayParameter("texture_transform", gainmapAlphaFilter.A03);
        filterManagerImpl.setFloatArrayParameter("content_transform", gainmapAlphaFilter.A02);
    }

    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
    }
}
