package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;

/* renamed from: X.MoD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51466MoD extends AbstractC199818si {
    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        TiltShiftOverlayFilter tiltShiftOverlayFilter = (TiltShiftOverlayFilter) this.A00;
        filterManagerImpl.setIntParameter(DatePickerDialogModule.ARG_MODE, AbstractC55027OXe.A01(tiltShiftOverlayFilter.A06));
        filterManagerImpl.setIntParameter("blendWithInput", 1);
        filterManagerImpl.setFloatParameter("overlayOpacity", tiltShiftOverlayFilter.A00);
        Integer num = tiltShiftOverlayFilter.A06;
        if (num == C05F.A01) {
            float[] fArr = new float[2];
            MSX.A0y(tiltShiftOverlayFilter.A05, fArr);
            filterManagerImpl.setFloatArrayParameter("center", fArr);
            filterManagerImpl.setFloatParameter("radius", tiltShiftOverlayFilter.A01);
            return;
        }
        if (num != C05F.A0C) {
            return;
        }
        float[] fArr2 = new float[2];
        MSX.A0y(tiltShiftOverlayFilter.A04, fArr2);
        filterManagerImpl.setFloatArrayParameter("center", fArr2);
        filterManagerImpl.setFloatParameter("radius", tiltShiftOverlayFilter.A03);
        filterManagerImpl.setFloatParameter("angle", -tiltShiftOverlayFilter.A02);
    }

    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        AbstractC167027dH.A12(filterManagerImpl, fArr, fArr2);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }
}
