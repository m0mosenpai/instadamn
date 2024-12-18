package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8Yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC188868Yc {
    public static final Map A00 = new HashMap();

    public static final int A02(Context context) {
        C14360o3.A0B(context, 0);
        return (AbstractC13890nF.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * 2)) / 3;
    }

    public static final String A04(Integer num) {
        C14360o3.A0B(num, 0);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                return "W,16:9";
            }
            throw new RuntimeException();
        }
        return "W,1:1";
    }

    public static final Matrix A03(int i, int i2, int i3, int i4, int i5) {
        Rect rect;
        int i6 = i2;
        int i7 = i3;
        if (i % 180 == 90) {
            i6 = i3;
            i7 = i2;
        }
        float f = (i6 * 1.0f) / i7;
        float f2 = i4;
        float f3 = i5;
        boolean z = true;
        boolean z2 = false;
        if (f2 / f3 <= f) {
            z2 = true;
        }
        boolean z3 = false;
        if (f > 0.75f) {
            z3 = true;
        }
        if (z2 != z3) {
            z = false;
        }
        if (z) {
            int i8 = (int) ((i5 - r1) / 2.0f);
            rect = new Rect(0, i8, i4, ((int) ((f2 / f) + 0.5f)) + i8);
        } else {
            int i9 = (int) ((i4 - r1) / 2.0f);
            rect = new Rect(i9, 0, ((int) ((f3 * f) + 0.5f)) + i9, i5);
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF(0.0f, 0.0f, i2, i3);
        int i10 = i % 360;
        if (i10 != 0) {
            matrix.setRotate(i);
            matrix.mapRect(rectF);
        }
        matrix.setRectToRect(rectF, new RectF(rect), Matrix.ScaleToFit.CENTER);
        if (i10 != 0) {
            matrix.preRotate(i);
        }
        return matrix;
    }

    public static final int A00(Context context) {
        return C1H4.A01(((AbstractC188878Yd.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * 2)) / 3) / 0.5625f);
    }

    public static final int A01(Context context) {
        return (AbstractC188878Yd.A01(context) - (context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) * 2)) / 3;
    }

    public static final boolean A05(ImageView imageView, Medium medium) {
        if (imageView.getDrawable() instanceof BitmapDrawable) {
            Drawable drawable = imageView.getDrawable();
            C14360o3.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            if (((BitmapDrawable) drawable).getBitmap() != null && medium.isValid()) {
                return true;
            }
        }
        return false;
    }
}
