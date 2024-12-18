package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.8ML, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8ML implements C8MI {
    public FilterGroupModel A00;
    public final C8MD A01;

    @Override // X.C8MI
    public final void Da9() {
        boolean z;
        String filterName;
        Integer num = this.A01.A01;
        if (num != C05F.A00 && num != C05F.A01) {
            FilterGroupModel filterGroupModel = this.A00;
            if (filterGroupModel != null) {
                FilterModel filterModel = (FilterModel) ((FilterGroupModelImpl) filterGroupModel).A02.A01.get(17);
                if (filterModel instanceof ColorFilter) {
                    filterName = ((ColorFilter) filterModel).A04;
                } else {
                    C14360o3.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
                    SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
                    FilterModel filterModel2 = splitScreenFilter.A01;
                    if (filterModel2 == null && (filterModel2 = splitScreenFilter.A03) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    filterName = filterModel2.getFilterName();
                }
                z = !C14360o3.A0K(filterName, AbstractC22792A3k.A00);
            }
            C14360o3.A0F("filterGroupModel");
            throw C00O.createAndThrow();
        }
        z = true;
        FilterGroupModel filterGroupModel2 = this.A00;
        if (filterGroupModel2 != null) {
            filterGroupModel2.EUV(17, z);
            return;
        }
        C14360o3.A0F("filterGroupModel");
        throw C00O.createAndThrow();
    }

    public C8ML(C8MD c8md) {
        this.A01 = c8md;
    }
}
