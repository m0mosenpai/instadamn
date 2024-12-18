package X;

import android.content.Context;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.facebook.R;

/* renamed from: X.5jw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124405jw {
    public boolean A00;
    public final LayerDrawable A01;

    public C124405jw(Context context, Integer num) {
        Drawable[] drawableArr;
        Drawable drawable = context.getResources().getDrawable(R.drawable.instagram_guideline_safe_zone, null);
        if (drawable != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), C1NC.A0D(drawable));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
            int intValue = num.intValue();
            int i = 3;
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        i = 5;
                    }
                } else {
                    i = 48;
                }
            } else {
                i = 80;
            }
            drawableArr = new Drawable[]{bitmapDrawable, new C124385ju(context, dimensionPixelSize, R.color.netego_su_background_gradient_end_4, i)};
        } else {
            drawableArr = new Drawable[0];
        }
        this.A01 = new LayerDrawable(drawableArr);
    }
}
