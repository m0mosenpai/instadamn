package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;

/* renamed from: X.8s8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199568s8 {
    public final SparseArray A00 = new SparseArray();
    public final FilterChain A01;
    public final InterfaceC16660sJ A02;

    public final ColorFilter A00(int i) {
        int i2;
        ColorFilter colorFilter;
        SparseArray sparseArray = this.A00;
        if (sparseArray.get(i) != null) {
            Object obj = sparseArray.get(i);
            C14360o3.A07(obj);
            return (ColorFilter) obj;
        }
        FilterModel filterModel = (FilterModel) this.A01.A01.get(17);
        C14360o3.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
        SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
        FilterModel filterModel2 = splitScreenFilter.A01;
        if (filterModel2 != null) {
            i2 = AbstractC199508rx.A00(filterModel2.getFilterName());
        } else {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == i) {
            FilterModel filterModel3 = splitScreenFilter.A01;
            C14360o3.A0C(filterModel3, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter");
            colorFilter = (ColorFilter) filterModel3;
        } else {
            colorFilter = new ColorFilter(AbstractC199508rx.A01(i), false);
            colorFilter.A00 = ((Number) this.A02.invoke(Integer.valueOf(i))).floatValue();
        }
        sparseArray.put(i, colorFilter);
        return colorFilter;
    }

    public C199568s8(FilterChain filterChain, InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = filterChain;
        this.A02 = interfaceC16660sJ;
    }
}
