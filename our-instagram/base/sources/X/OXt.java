package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class OXt {
    public static final ValueMapFilterModel A00(FilterGroupModel filterGroupModel) {
        C14360o3.A0B(filterGroupModel, 0);
        return (ValueMapFilterModel) MSX.A0C(((FilterGroupModelImpl) filterGroupModel).A02, 13);
    }

    public static final boolean A01(FilterModel filterModel) {
        if (!(filterModel instanceof ValueMapFilterModel)) {
            return false;
        }
        Map map = ((ValueMapFilterModel) filterModel).A01.A02;
        if (C14360o3.A0I((Float) map.get("highlights"), 0.0f) && MSY.A1Y("shadows", map, 0.0f) && MSY.A1Y("sharpen", map, 0.0f)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(FilterModel filterModel) {
        if (!(filterModel instanceof ValueMapFilterModel)) {
            return false;
        }
        TypedParameterMap typedParameterMap = ((ValueMapFilterModel) filterModel).A01;
        Map map = typedParameterMap.A02;
        if (C14360o3.A0I((Float) map.get("brightness"), 0.0f) && MSY.A1Y("contrast", map, 0.0f) && MSY.A1Y("saturation", map, 0.0f) && MSY.A1Y("temperature", map, 0.0f) && MSY.A1Y("vignette", map, 0.0f) && MSY.A1Y("fade", map, 0.0f)) {
            Map map2 = typedParameterMap.A01;
            EnumC53258Ngw A01 = AbstractC55164OdS.A01((float[]) map2.get("tint_shadows_color"));
            EnumC53258Ngw enumC53258Ngw = EnumC53258Ngw.A06;
            if (A01 == enumC53258Ngw && AbstractC55164OdS.A01((float[]) map2.get("tint_highlights_color")) == enumC53258Ngw) {
                return false;
            }
        }
        return true;
    }
}
