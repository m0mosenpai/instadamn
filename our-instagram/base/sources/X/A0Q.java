package X;

import android.graphics.Rect;
import com.instagram.creation.base.CropInfo;

/* loaded from: classes4.dex */
public abstract class A0Q {
    public static final CropInfo A00(int i, int i2) {
        int min = Math.min(i, i2);
        Rect rect = new Rect(0, 0, min, min);
        if (i > i2) {
            rect.offsetTo(C1H4.A01((i / 2.0f) - (min / 2.0f)), 0);
        } else if (i < i2) {
            rect.offsetTo(0, C1H4.A01((i2 / 2.0f) - (min / 2.0f)));
        }
        return new CropInfo(rect, i, i2);
    }
}
