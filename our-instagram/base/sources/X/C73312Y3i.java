package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: X.Y3i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73312Y3i {
    public static final C73312Y3i A00 = new Object();

    public static final Bitmap A00(int[] iArr, int i, int i2) {
        if (iArr.length == i * i2) {
            Bitmap A0F = AbstractC167007dF.A0F(i, i2);
            A0F.setPixels(iArr, 0, i, 0, 0, i, i2);
            return A0F;
        }
        throw AbstractC166987dD.A14("Check failed.");
    }

    public final Bitmap A02(Bitmap bitmap, float[] fArr) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] <= 0.0f) {
                iArr[i2] = iArr[i2] & 16777215;
            }
        }
        return A00(iArr, bitmap.getWidth(), bitmap.getHeight());
    }

    public final Bitmap A01(Bitmap bitmap, Rect rect, float[] fArr) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        int[] iArr = new int[width2 * height2];
        bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height2);
        Rect rect2 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        for (int i = 0; i < width; i++) {
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = (i2 * width) + i;
                if (fArr[i3] > 0.0f) {
                    rect2.left = Math.min(i, rect2.left);
                    rect2.right = Math.max(i, rect2.right);
                    rect2.top = Math.min(i2, rect2.top);
                    rect2.bottom = Math.max(i2, rect2.bottom);
                } else {
                    iArr[i3] = iArr[i3] & 16777215;
                }
            }
        }
        if (rect2.left == Integer.MAX_VALUE) {
            return A00(iArr, bitmap.getWidth(), bitmap.getHeight());
        }
        if (rect != null) {
            if (!Rect.intersects(rect2, rect)) {
                return bitmap;
            }
            rect2.set(Math.max(rect2.left, rect.left), Math.max(rect2.top, rect.top), Math.min(rect2.right, rect.right), Math.min(rect2.bottom, rect.bottom));
        }
        int width3 = rect2.width();
        int height3 = rect2.height();
        int[] iArr2 = new int[width3 * height3];
        for (int i4 = 0; i4 < width3; i4++) {
            for (int i5 = 0; i5 < height3; i5++) {
                iArr2[(i5 * width3) + i4] = iArr[rect2.left + i4 + ((rect2.top + i5) * width)];
            }
        }
        return A00(iArr2, width3, height3);
    }
}
