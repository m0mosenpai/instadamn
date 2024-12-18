package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y4d {
    public static final Y4d A00 = new Object();

    public static final Bitmap A00(Bitmap bitmap, List list, int i) {
        C14360o3.A0B(list, 2);
        List<PointF> list2 = (List) list.get(i);
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(copy);
        Paint A03 = AbstractC72049XLp.A03();
        for (PointF pointF : list2) {
            canvas.drawPoint(pointF.x, pointF.y, A03);
        }
        C14360o3.A0A(copy);
        return copy;
    }

    public static final Bitmap A01(float[] fArr, int i, int i2) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            if (fArr[i4] > 0.0f) {
                i5 = -1;
            }
            iArr[i4] = i5;
        }
        Bitmap A0F = AbstractC167007dF.A0F(i, i2);
        A0F.setPixels(iArr, 0, i, 0, 0, i, i2);
        return A0F;
    }

    public final Bitmap A02(Bitmap bitmap, float[] fArr) {
        float f;
        boolean z;
        int i;
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int length = fArr.length;
        int i3 = width * height;
        if (i3 != length) {
            return bitmap;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int i4 = width2 * height2;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
        for (int i5 = 0; i5 < width; i5++) {
            for (int i6 = 0; i6 < height; i6++) {
                int i7 = (i6 * width) + i5;
                int min = Math.min(i7, length - 1);
                int i8 = -1;
                boolean z2 = false;
                do {
                    int i9 = -1;
                    do {
                        int i10 = i5 + i8;
                        if (i10 >= 0 && i10 < width && (i = i6 + i9) >= 0 && i < height && (i2 = i10 + (i * width)) < length) {
                            f = fArr[i2];
                        } else {
                            f = 0.0f;
                        }
                        if (f < fArr[min]) {
                            z2 = true;
                        }
                        i9++;
                    } while (i9 < 2);
                    i8++;
                    z = true;
                } while (i8 < 2);
                float f2 = fArr[min];
                if (f2 <= 0.0f) {
                    z = false;
                }
                int i11 = iArr[i7];
                int i12 = (int) (255.0f * f2);
                int i13 = i12;
                int i14 = i12;
                int i15 = i12;
                if (!z2) {
                    i13 = (i11 >> 16) & 255;
                    i14 = 255 & (i11 >> 8);
                    i15 = i11 & 255;
                }
                if (!z) {
                    i12 = 100;
                }
                iArr[i7] = Color.argb(i12, i13, i14, i15);
            }
        }
        if (i4 == i3) {
            Bitmap A0F = AbstractC167007dF.A0F(width, height);
            A0F.setPixels(iArr, 0, width, 0, 0, width, height);
            return A0F;
        }
        throw AbstractC166987dD.A14("Check failed.");
    }
}
