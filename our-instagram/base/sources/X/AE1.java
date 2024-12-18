package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes4.dex */
public abstract class AE1 {
    public static final BitmapDrawable A00(Context context, int i) {
        C14360o3.A0B(context, 0);
        int[] iArr = new int[5];
        C50L.A03(context, null, iArr, R.style.GradientPatternStyle);
        Paint paint = C3LQ.A00;
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            Rect A0W = AbstractC166987dD.A0W(drawable);
            int width = A0W.width();
            int height = A0W.height();
            if (width <= 0 || height <= 0) {
                width = drawable.getIntrinsicWidth();
                height = drawable.getIntrinsicWidth();
            }
            return C3LQ.A00(context, new LinearGradient(0.0f, 0.0f, width, height, iArr, (float[]) null, Shader.TileMode.REPEAT), drawable);
        }
        throw AbstractC166997dE.A0g();
    }

    public static final Drawable A01(Context context, int i) {
        C14360o3.A0B(context, 0);
        int A09 = AbstractC167007dF.A09(context, R.attr.igds_color_gradient_red);
        int A092 = AbstractC167007dF.A09(context, R.attr.igds_color_gradient_pink);
        Paint paint = C3LQ.A00;
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            return C3LQ.A02(context, drawable, A09, A092);
        }
        throw AbstractC166997dE.A0g();
    }
}
