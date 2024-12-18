package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;

/* renamed from: X.Km9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46752Km9 {
    public static final C195638l4 A00(Context context, Integer num, int i, boolean z, boolean z2) {
        int dimensionPixelOffset;
        int dimensionPixelOffset2;
        int i2;
        Resources resources = context.getResources();
        if (num != null) {
            dimensionPixelOffset = num.intValue();
        } else {
            dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.ad4ad_button_bottom_margin);
        }
        if (z2) {
            i2 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
            dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        } else {
            dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.asset_picker_cell_margin);
            i2 = R.dimen.accent_edge_thickness;
        }
        return new C195638l4(z, dimensionPixelOffset, dimensionPixelOffset2, resources.getDimensionPixelOffset(i2), i);
    }
}
