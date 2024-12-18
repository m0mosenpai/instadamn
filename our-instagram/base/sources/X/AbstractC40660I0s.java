package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.I0s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40660I0s {
    public static final void A00(Context context, C42795IwX c42795IwX, boolean z) {
        int i = R.drawable.instagram_volume_off_pano_filled_24;
        if (z) {
            i = R.drawable.instagram_volume_pano_filled_24;
        }
        C3W4 c3w4 = c42795IwX.A05;
        SlideInAndOutIconView A01 = c3w4.A01();
        Resources A0M = AbstractC25228BEl.A0M(A01);
        A01.setTextSize(A0M.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
        TitleTextView titleTextView = A01.A0C;
        int lineHeight = titleTextView.getLineHeight() + (A0M.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
        int lineHeight2 = (titleTextView.getLineHeight() - A0M.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
        A01.A03(context.getDrawable(i), lineHeight, lineHeight);
        A01.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
        A01.setIconColor(context.getColor(R.color.design_dark_default_color_on_background));
        A01.setIconScale(0.5f);
        c3w4.A01().setVisibility(0);
    }
}
