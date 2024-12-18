package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7Lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC161497Lk {
    public static final C161507Ll A00(Context context, DirectThreadThemeInfo directThreadThemeInfo, boolean z, boolean z2) {
        C14360o3.A0B(context, 0);
        int color = context.getColor(R.color.gradient_light);
        Drawable drawable = context.getDrawable(R.drawable.direct_large_avatar_button_background);
        int color2 = context.getColor(R.color.design_dark_default_color_on_background);
        Drawable drawable2 = context.getDrawable(R.drawable.red_circle_bg);
        Drawable drawable3 = context.getDrawable(R.drawable.filled_circle_grey_1);
        Resources resources = context.getResources();
        int i = R.dimen.ad4ad_button_bottom_margin;
        if (z) {
            i = R.dimen.abc_button_padding_horizontal_material;
        }
        int dimensionPixelOffset = resources.getDimensionPixelOffset(i);
        return new C161507Ll(drawable, drawable2, drawable3, context.getDrawable(R.drawable.instagram_delete_pano_outline_24), context.getDrawable(R.drawable.vertical_send_arrow), AbstractC09440dt.A01(new C9FH(4, directThreadThemeInfo, context, z2)), color, color2, dimensionPixelOffset, context.getResources().getDimensionPixelOffset(R.dimen.direct_voice_messaging_lock_button_offset));
    }
}
