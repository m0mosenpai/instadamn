package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public abstract class OXu {
    public static final void A02(FilterGroupModel filterGroupModel, Integer num) {
        C14360o3.A0B(num, 1);
        TiltShiftFilter A00 = A00(filterGroupModel);
        if (A00 != null) {
            A00.A05 = num;
        }
        A01(filterGroupModel).A06 = num;
        Integer num2 = C05F.A00;
        boolean z = true;
        filterGroupModel.EUV(19, AbstractC25229BEm.A1a(num, num2));
        if (num == num2) {
            z = false;
        }
        filterGroupModel.EUV(21, z);
        if (num == num2) {
            A01(filterGroupModel).A00 = 0.0f;
        }
    }

    public static final TiltShiftFilter A00(FilterGroupModel filterGroupModel) {
        return (TiltShiftFilter) MSX.A0C(((FilterGroupModelImpl) filterGroupModel).A02, 19);
    }

    public static final TiltShiftOverlayFilter A01(FilterGroupModel filterGroupModel) {
        FilterModel A0C = MSX.A0C(((FilterGroupModelImpl) filterGroupModel).A02, 21);
        if (A0C != null) {
            return (TiltShiftOverlayFilter) A0C;
        }
        throw AbstractC166997dE.A0g();
    }
}
