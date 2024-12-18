package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.ui.blur.BlurUtil;

/* renamed from: X.LHl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47965LHl {
    public static final Paint A00 = AbstractC166987dD.A0S(7);

    public static Bitmap A00(int i, int i2, int i3) {
        int i4 = i / i3;
        int i5 = i2 / i3;
        if (i4 > 0 && i5 > 0) {
            return Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
        }
        C0w9.A03("BlurBitmapUtil_createScaledBitmap", StringFormatUtil.formatStrLocaleSafe("originalSize=%dx%d scale=%d scaledSize=%dx%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
        return null;
    }

    public static Bitmap A01(Rect rect, Bitmap[] bitmapArr, Rect[] rectArr, View[] viewArr, int i, int i2) {
        Bitmap A002 = A00(rect.width(), rect.height(), i);
        if (A002 == null) {
            return null;
        }
        Canvas A06 = AbstractC43592JPx.A06(A002);
        A002.eraseColor(-1);
        for (int i3 = 0; i3 < viewArr.length; i3++) {
            View view = viewArr[i3];
            if (view.getParent() != null && view.getVisibility() == 0 && view.isLaidOut()) {
                Rect rect2 = rectArr[i3];
                if (rect2 == null) {
                    rect2 = AbstractC166987dD.A0U();
                }
                if (rect2.isEmpty()) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    int i4 = iArr[0] - rect.left;
                    rect2.set(i4, iArr[1] - rect.top, i4 + view.getWidth(), (iArr[1] - rect.top) + view.getHeight());
                }
                A06.save();
                float f = i;
                A06.translate((rect2.left * 1.0f) / f, (rect2.top * 1.0f) / f);
                if (view instanceof TextureView) {
                    Bitmap bitmap = bitmapArr[i3];
                    if ((bitmap != null || (bitmap = A00(view.getWidth(), view.getHeight(), i)) != null) && !bitmap.isRecycled()) {
                        ((TextureView) view).getBitmap(bitmap);
                        A06.drawBitmap(bitmap, 0.0f, 0.0f, A00);
                    }
                } else {
                    float f2 = 1.0f / f;
                    A06.scale(f2, f2);
                    view.draw(A06);
                }
                A06.restore();
            }
        }
        BlurUtil.blurInPlace(A002, i2);
        return A002;
    }
}
