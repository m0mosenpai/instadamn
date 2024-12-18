package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9zQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226689zQ {
    public static final C9SQ A00(Context context, C37964Gn6 c37964Gn6, boolean z) {
        ImageUrl AsR = c37964Gn6.AsR();
        String title = c37964Gn6.getTitle();
        String str = c37964Gn6.A07;
        int A01 = AbstractC166997dE.A01(context);
        int color = context.getColor(R.color.gallery_item_selection_circle_default_color);
        AbstractC167007dF.A1F(AsR, 2, str);
        C9SQ c9sq = new C9SQ(context, AsR, str, title, R.dimen.audio_translations_language_list_cell_row_height, color, 1, R.dimen.avatar_sticker_max_height, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, A01, false, false, false);
        int i = StringTreeSet.MAX_SYMBOL_COUNT;
        if (z) {
            i = 255;
        }
        c9sq.setAlpha(i);
        return c9sq;
    }
}
