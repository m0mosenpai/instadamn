package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.3Bk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69763Bk {
    public static final void A00(Context context, View view, View view2, View view3, ImageUrl imageUrl) {
        float dimension = context.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        float dimension2 = context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        float dimension3 = context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        float height = ((view.getHeight() - view2.getHeight()) - dimension) - dimension3;
        float width = view.getWidth() - (2.0f * dimension2);
        float height2 = imageUrl.getHeight() / imageUrl.getWidth();
        float f = width * height2;
        if (f > height) {
            width = height / height2;
        } else {
            height = f;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) width, (int) height);
        int i = (int) dimension2;
        layoutParams.setMargins(i, (int) dimension3, i, (int) dimension);
        view3.setLayoutParams(layoutParams);
    }
}
