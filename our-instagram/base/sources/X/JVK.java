package X;

import android.content.Context;
import android.util.TypedValue;
import com.facebook.R;

/* loaded from: classes8.dex */
public abstract class JVK {
    public static final C11L A03 = new C11L("[0-9]");
    public static final C11L A00 = new C11L("[A-Z]");
    public static final C11L A02 = new C11L("[.]");
    public static final C11L A01 = new C11L("[,]");
    public static final C11L A04 = new C11L("[+]");

    public static final int A00(Context context, String str) {
        return Math.max(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) + context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material) + A01(context, str) + context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) + context.getResources().getDimensionPixelSize(R.dimen.afi_margin_top) + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding) + context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material));
    }

    public static final int A01(Context context, String str) {
        if (str.length() == 0) {
            return 0;
        }
        return (int) TypedValue.applyDimension(2, (AbstractC224517h.A00(A03.A04(str)) * 5.887313f) + (AbstractC224517h.A00(A00.A04(str)) * 6.2798004f) + (AbstractC224517h.A00(A02.A04(str)) * 2.7474127f) + (AbstractC224517h.A00(A01.A04(str)) * 2.3549252f) + (AbstractC224517h.A00(A04.A04(str)) * 5.4948254f) + (Math.max(0, ((((r4 - r2) - r1) - r8) - r7) - r6) * 5.887313f), context.getResources().getDisplayMetrics());
    }
}
