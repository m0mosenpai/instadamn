package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class VVA {
    public static final View A00(Context context, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        ViewGroup A0C = AbstractC31176DnK.A0C(inflate, R.id.container);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        A0C.setPadding(dimensionPixelSize, dimensionPixelSize2, 0, dimensionPixelSize2);
        int i = 0;
        do {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.merchant_hscroll_loading_placeholder_item, A0C, false);
            int A00 = I9C.A00(context);
            Resources resources2 = context.getResources();
            int dimensionPixelSize3 = (resources2.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material) * 2) + resources2.getDimensionPixelSize(R.dimen.action_button_settings_height);
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(resources2.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            int A01 = dimensionPixelSize3 + C1H4.A01(fontMetrics.bottom - fontMetrics.top);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextSize(resources2.getDimensionPixelSize(R.dimen.button_text_size));
            Paint.FontMetrics fontMetrics2 = textPaint2.getFontMetrics();
            int A012 = A01 + C1H4.A01(fontMetrics2.bottom - fontMetrics2.top) + resources2.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material) + (((A00 - (AbstractC167017dG.A0A(context) * 2)) - AbstractC167017dG.A07(context)) / 2);
            C14360o3.A0A(inflate2);
            if (z) {
                A00 = A012;
            }
            AbstractC13880nE.A0h(inflate2, A00, A012);
            if (i > 0) {
                AbstractC13880nE.A0e(inflate2, resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
            }
            A0C.addView(inflate2);
            i++;
        } while (i < 2.75f);
        return inflate;
    }
}
