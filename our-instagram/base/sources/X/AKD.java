package X;

import android.graphics.Color;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AKD {
    public static final AKD A00 = new Object();

    public static final void A00(ValueMapFilterModel valueMapFilterModel, int[] iArr) {
        TypedParameterMap typedParameterMap = valueMapFilterModel.A01;
        Number number = (Number) typedParameterMap.A02.get("numIntervals");
        if (number != null) {
            int floatValue = ((int) number.floatValue()) + 1;
            for (int i = 0; i < floatValue; i++) {
                typedParameterMap.A01.remove(AnonymousClass001.A0O("color_", i));
            }
        }
        int length = iArr.length;
        valueMapFilterModel.A00("numIntervals", length - 1);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            valueMapFilterModel.A03(AnonymousClass001.A0O("color_", i3), new float[]{Color.red(i4) / 255.0f, Color.green(i4) / 255.0f, Color.blue(i4) / 255.0f, 1.0f});
            i2++;
            i3++;
        }
    }

    public final void A01(ValueMapFilterModel valueMapFilterModel, List list) {
        AbstractC167017dG.A1N(valueMapFilterModel, list);
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = AbstractC167007dF.A0B(it);
            i++;
        }
        A00(valueMapFilterModel, iArr);
    }
}
