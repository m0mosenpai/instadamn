package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.FOp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34656FOp {
    public final float A00(Context context, boolean z) {
        Resources resources = context.getResources();
        CharSequence text = resources.getText(2131952369);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
        int A0A = AbstractC13880nE.A0A(context) - (resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 2);
        Typeface typeface = Typeface.SANS_SERIF;
        float A01 = C13680mu.A01(context, typeface, text, 1.28f, dimensionPixelSize, A0A);
        Resources resources2 = context.getResources();
        float A012 = C13680mu.A01(context, typeface, resources2.getText(2131952374), 1.07f, (int) TypedValue.applyDimension(2, 26.0f, AbstractC167007dF.A0K(context)), AbstractC13880nE.A0A(context) - (resources2.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 4));
        float A09 = AbstractC13880nE.A09(context);
        float f = A01 + A012;
        float f2 = 0.38f;
        if (z) {
            f2 = 0.54f;
        }
        return Math.min(f + (f2 * A09), A09);
    }
}
