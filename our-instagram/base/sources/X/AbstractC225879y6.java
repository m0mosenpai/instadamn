package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.ImageSpan;
import com.facebook.R;

/* renamed from: X.9y6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225879y6 {
    public static final ImageSpan A00(Context context, boolean z, boolean z2) {
        Drawable drawable = context.getDrawable(R.drawable.instagram_carousel_pano_outline_24);
        if (drawable != null) {
            Resources resources = context.getResources();
            int i = R.dimen.abc_text_size_menu_header_material;
            if (z2) {
                i = R.dimen.backup_codes_text_size;
            }
            int dimension = (int) resources.getDimension(i);
            int i2 = 2;
            drawable.setBounds(0, 2, dimension, dimension + 2);
            Drawable mutate = drawable.mutate();
            int i3 = R.attr.textColorSecondary;
            if (z) {
                i3 = R.attr.textColorPrimary;
            }
            mutate.setTint(AbstractC53242c7.A0F(context, i3));
            if (Build.VERSION.SDK_INT < 29) {
                i2 = 1;
            }
            return new ImageSpan(drawable, i2);
        }
        return null;
    }
}
