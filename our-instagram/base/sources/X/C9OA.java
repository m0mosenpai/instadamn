package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;

/* renamed from: X.9OA, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9OA {
    public static final FilterGroupModelImpl A01(FilterModel filterModel) {
        FilterGroupModelImpl filterGroupModelImpl = new FilterGroupModelImpl(new FilterChain(), null, C05F.A01, -1, true);
        filterGroupModelImpl.EUT(filterModel, 8);
        SplitScreenFilter splitScreenFilter = new SplitScreenFilter();
        ColorFilter colorFilter = new ColorFilter(AbstractC199508rx.A01(0), true);
        splitScreenFilter.A01 = colorFilter;
        splitScreenFilter.A02 = colorFilter;
        splitScreenFilter.A00 = 1.0f;
        filterGroupModelImpl.EUT(splitScreenFilter, 17);
        return filterGroupModelImpl;
    }

    public static final FilterGroupModelImpl A00() {
        return new FilterGroupModelImpl(new FilterChain(), null, C05F.A00, -1, true);
    }
}
