package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.text.TextPaint;
import com.facebook.R;

/* renamed from: X.2kM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57472kM {
    public static C57472kM A04;
    public C57482kN A00;
    public C57482kN A01;
    public C57482kN A02;
    public C57482kN A03;

    public static C57482kN A00(Context context, String str, int i, boolean z, boolean z2) {
        Resources resources = context.getResources();
        int dimensionPixelSize = i - (resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right) * 2);
        if (z) {
            dimensionPixelSize = ((dimensionPixelSize - resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap)) - resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap)) - (resources.getDimensionPixelSize(R.dimen.abc_control_corner_material) * 2);
        }
        if (z2) {
            dimensionPixelSize = (dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.afi_margin_top) * 2)) - resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        }
        if (dimensionPixelSize < 0) {
            dimensionPixelSize = 0;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int A0F = AbstractC53242c7.A0F(context, R.attr.textColorPrimary);
        int A0F2 = AbstractC53242c7.A0F(context, R.attr.igds_color_link);
        int A0F3 = AbstractC53242c7.A0F(context, R.attr.igds_color_primary_background);
        Resources resources2 = context.getResources();
        TextPaint textPaint = new TextPaint(1);
        textPaint.density = resources2.getDisplayMetrics().density;
        textPaint.linkColor = A0F2;
        textPaint.bgColor = A0F3;
        textPaint.setTextSize(resources2.getDimension(R.dimen.abc_text_size_menu_header_material));
        textPaint.setColor(A0F);
        AbstractC14710oj.A06(context, null, textPaint, C05F.A00);
        C14360o3.A0B(context.getResources(), 0);
        return new C57482kN(alignment, textPaint, str, r1.getDimensionPixelSize(R.dimen.abc_control_corner_material), 1.0f, dimensionPixelSize, false);
    }

    public static void A01(Context context, C57472kM c57472kM) {
        Resources resources = context.getResources();
        int min = Math.min(resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().heightPixels);
        c57472kM.A00 = A00(context, "feed_comment", min, false, false);
        c57472kM.A01 = A00(context, "feed_comment_with_like", min, true, false);
        c57472kM.A03 = A00(context, "feed_comment_with_indent", min, false, true);
        c57472kM.A02 = A00(context, "feed_comment_with_like_and_indent", min, true, true);
    }
}
