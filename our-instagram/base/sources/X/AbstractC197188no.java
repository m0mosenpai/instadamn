package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.creation.base.CropInfo;

/* renamed from: X.8no, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197188no {
    public static final CropInfo A00(Rect rect, float f, int i, int i2, int i3, boolean z) {
        int width;
        int i4;
        int height;
        if (rect == null) {
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            matrix.mapRect(rectF);
            rectF.offsetTo(0.0f, 0.0f);
            Rect rect2 = new Rect();
            rectF.round(rect2);
            if (z) {
                f = rectF.width() / rectF.height();
            }
            float width2 = (rect2.width() * 1.0f) / rect2.height();
            int i5 = 0;
            if (width2 < f) {
                int round = Math.round((width2 / f) * rect2.height());
                i5 = (rect2.height() - round) / 2;
                i4 = rect2.width();
                height = round + i5;
                width = 0;
            } else {
                int round2 = Math.round((f / width2) * rect2.width());
                width = (rect2.width() - round2) / 2;
                i4 = round2 + width;
                height = rect2.height();
            }
            if (i3 % 180 == 0) {
                rect = new Rect(width, i5, i4, height);
            } else {
                rect = new Rect(i5, width, height, i4);
            }
        }
        return new CropInfo(rect, i, i2);
    }
}
