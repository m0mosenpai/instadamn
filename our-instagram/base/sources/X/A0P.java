package X;

import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes4.dex */
public abstract class A0P {
    public static final PhotoFilter A00(FilterGroupModel filterGroupModel, String str) {
        C14360o3.A0B(str, 1);
        if (filterGroupModel == null) {
            AbstractC12120kG.A0C(str, "FilterGroupModel was null when calling getPhotoFilter()", null);
            return null;
        }
        FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroupModel;
        PhotoFilter photoFilter = filterGroupModelImpl.A01;
        if (photoFilter == null) {
            AbstractC12120kG.A0C(str, AnonymousClass001.A0R("PhotoFilter was null when calling getPhotoFilter(). FeatureMode is: ", AE6.A01(filterGroupModelImpl.A03)), null);
        }
        return photoFilter;
    }
}
