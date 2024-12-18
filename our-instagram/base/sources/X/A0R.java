package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes4.dex */
public abstract class A0R {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    public static final SurfaceCropFilter A00(FilterGroupModel filterGroupModel, String str) {
        String A0R;
        SurfaceCropFilterModel surfaceCropFilterModel;
        if (filterGroupModel == null) {
            A0R = "FilterGroupModel was null when calling getSurfaceCropFilter()";
        } else {
            FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroupModel;
            FilterModel A0g = AbstractC166987dD.A0g(filterGroupModelImpl.A02.A01, 3);
            if ((A0g instanceof SurfaceCropFilterModel) && (surfaceCropFilterModel = (SurfaceCropFilterModel) A0g) != null) {
                ?? obj = new Object();
                obj.A00 = surfaceCropFilterModel;
                return obj;
            }
            A0R = AnonymousClass001.A0R("SurfaceCropFilter was null when calling getSurfaceCropFilter(). FeatureMode is: ", AE6.A01(filterGroupModelImpl.A03));
        }
        AbstractC12120kG.A0C(str, A0R, null);
        return null;
    }
}
