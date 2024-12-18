package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;

/* renamed from: X.NsH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53885NsH {
    public static final void A00(FilterChain filterChain, int i, int i2) {
        ColorFilter colorFilter = new ColorFilter(AbstractC199508rx.A01(i));
        colorFilter.A00 = i2 / 100.0f;
        filterChain.A01(colorFilter, 17);
    }
}
