package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6QO, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6QO {
    public static final void A00(TextView textView, Context context) {
        C14360o3.A0B(textView, 1);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 81;
        layoutParams2.setMargins(0, 0, 0, 0);
        ((ViewGroup.LayoutParams) layoutParams2).height = context.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        textView.setLayoutParams(layoutParams2);
        textView.setBackground(context.getDrawable(R.drawable.reel_item_action_button_background));
        textView.setTextColor(context.getColor(R.color.countdown_sticker_title_text_color));
        textView.setCompoundDrawableTintList(null);
        boolean A02 = AbstractC13620mo.A02(context);
        int i = R.drawable.chevron_right;
        if (A02) {
            i = R.drawable.chevron_left;
        }
        Drawable drawable = context.getDrawable(i);
        RectF rectF = AbstractC13880nE.A01;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        textView.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.reel_item_action_button_padding_start), 0, context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0);
    }
}
