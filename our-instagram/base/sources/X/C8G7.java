package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.8G7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G7 {
    public final C8G4 A02(Context context) {
        C8G4 c8g4 = new C8G4(context);
        c8g4.A04 = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size));
        c8g4.A0B = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top));
        c8g4.A0A = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left));
        c8g4.A03 = Integer.valueOf(context.getColor(R.color.black_60_transparent));
        c8g4.A06 = 0;
        c8g4.A0C = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_progress_bar_on_media)));
        c8g4.A08 = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_separator_or_stroke_on_media)));
        c8g4.A00 = context.getDrawable(R.drawable.instagram_play_pano_filled_12);
        c8g4.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
        c8g4.A07 = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material));
        c8g4.A0D = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.afi_margin_top));
        c8g4.A01(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_separator_or_stroke_on_media)));
        return c8g4;
    }

    public final C8G4 A01(Context context) {
        C8G4 c8g4 = new C8G4(context);
        c8g4.A0B = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.afi_indicator_arrow_margin_top));
        c8g4.A0A = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.action_bar_item_spacing_left));
        c8g4.A01(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_icon)));
        c8g4.A00 = context.getDrawable(R.drawable.instagram_play_pano_filled_12);
        c8g4.A01 = context.getDrawable(R.drawable.instagram_stop_filled_16);
        return c8g4;
    }

    public static final void A00(Rect rect, Drawable drawable, int i) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = i / Math.max(intrinsicHeight, intrinsicWidth);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i2 = (int) ((intrinsicWidth * max) / 2.0f);
        int i3 = (int) ((intrinsicHeight * max) / 2.0f);
        drawable.setBounds(centerX - i2, centerY - i3, centerX + i2, centerY + i3);
    }
}
