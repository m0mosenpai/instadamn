package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.KrT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47072KrT {
    public static final BOM A00(Context context, ImageUrl imageUrl) {
        Resources resources = context.getResources();
        BOM bom = new BOM(context, null, resources.getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_radius), resources.getDimensionPixelSize(R.dimen.clips_control_music_button_stroke_width), context.getColor(R.color.audio_bar_action_color_enabled), AbstractC166997dE.A06(resources), 0, false);
        bom.A04(imageUrl, null);
        return bom;
    }
}
