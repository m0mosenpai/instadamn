package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import java.util.List;

/* renamed from: X.8s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199578s9 {
    public final FilterChain A00;
    public final C199568s8 A01;

    public static final void A00(ValueMapFilterModel valueMapFilterModel, List list) {
        if (valueMapFilterModel != null) {
            valueMapFilterModel.A03(MSV.A00(210), new float[]{((Number) list.get(0)).floatValue() / 255.0f, ((Number) list.get(1)).floatValue() / 255.0f, ((Number) list.get(2)).floatValue() / 255.0f});
            valueMapFilterModel.A03("midtone", new float[]{((Number) list.get(3)).floatValue() / 255.0f, ((Number) list.get(4)).floatValue() / 255.0f, ((Number) list.get(5)).floatValue() / 255.0f});
            valueMapFilterModel.A03("shadow", new float[]{((Number) list.get(6)).floatValue() / 255.0f, ((Number) list.get(7)).floatValue() / 255.0f, ((Number) list.get(8)).floatValue() / 255.0f});
        }
    }

    public final void A01(int i, int i2, float f) {
        FilterModel filterModel;
        FilterModel filterModel2;
        if (f >= 0.0f && f <= 1.0f) {
            if (i == i2 && f != 0.0f && f != 1.0f) {
                throw new IllegalArgumentException("If the left and right filters have the same id only one must be fully visible");
            }
            FilterModel filterModel3 = (FilterModel) this.A00.A01.get(17);
            C14360o3.A0C(filterModel3, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel3;
            splitScreenFilter.A00 = f;
            boolean z = false;
            if (f > 0.0f) {
                z = true;
            }
            FilterModel filterModel4 = null;
            if (z) {
                if (i != 1112) {
                    filterModel = this.A01.A00(i);
                } else {
                    ValueMapFilterModel A01 = AHK.A01(null, AbstractC199508rx.A01(i), null, 62);
                    A01.A00("strength", 0.3f);
                    filterModel = A01;
                }
            } else {
                filterModel = null;
            }
            splitScreenFilter.A01 = filterModel;
            splitScreenFilter.A02 = filterModel;
            if (splitScreenFilter.A00 < 1.0f) {
                if (i2 != 1112) {
                    filterModel2 = this.A01.A00(i2);
                } else {
                    ValueMapFilterModel A012 = AHK.A01(null, AbstractC199508rx.A01(i2), null, 62);
                    A012.A00("strength", 0.3f);
                    filterModel2 = A012;
                }
                filterModel4 = filterModel2;
            }
            splitScreenFilter.A03 = filterModel4;
            splitScreenFilter.A04 = filterModel4;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final void A02(List list, int i, int i2) {
        if (list != null) {
            FilterModel filterModel = (FilterModel) this.A00.A01.get(17);
            C14360o3.A0C(filterModel, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter");
            SplitScreenFilter splitScreenFilter = (SplitScreenFilter) filterModel;
            if (i == 1112) {
                A00((ValueMapFilterModel) splitScreenFilter.A01, list);
            }
            if (i2 == 1112) {
                A00((ValueMapFilterModel) splitScreenFilter.A03, list);
            }
        }
    }

    public C199578s9(FilterChain filterChain, C199568s8 c199568s8) {
        this.A00 = filterChain;
        this.A01 = c199568s8;
    }
}
