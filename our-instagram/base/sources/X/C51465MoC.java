package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;

/* renamed from: X.MoC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51465MoC extends AbstractC199818si {
    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        TiltShiftFilter tiltShiftFilter = (TiltShiftFilter) this.A00;
        filterManagerImpl.setIntParameter(DatePickerDialogModule.ARG_MODE, AbstractC55027OXe.A01(tiltShiftFilter.A05));
        Integer num = tiltShiftFilter.A05;
        if (num == C05F.A01) {
            float[] fArr = new float[2];
            MSX.A0y(tiltShiftFilter.A04, fArr);
            filterManagerImpl.setFloatArrayParameter("center", fArr);
            filterManagerImpl.setFloatParameter("radius", tiltShiftFilter.A00);
            return;
        }
        if (num != C05F.A0C) {
            return;
        }
        float[] fArr2 = new float[2];
        MSX.A0y(tiltShiftFilter.A03, fArr2);
        filterManagerImpl.setFloatArrayParameter("center", fArr2);
        filterManagerImpl.setFloatParameter("radius", tiltShiftFilter.A02);
        filterManagerImpl.setFloatParameter("angle", -tiltShiftFilter.A01);
    }

    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        AbstractC167027dH.A12(filterManagerImpl, fArr, fArr2);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }
}
