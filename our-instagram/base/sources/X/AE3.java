package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes4.dex */
public abstract class AE3 {
    public static final int A00(Context context, int i) {
        if (i != AbstractC166997dE.A03(context)) {
            return R.color.countdown_sticker_title_text_color;
        }
        return R.color.chat_sticker_button_divider_color;
    }

    public static C124385ju A01(Context context, Drawable.Callback callback, int i) {
        C124385ju c124385ju = new C124385ju(context, context.getResources().getDimensionPixelSize(R.dimen.action_sheet_divider_margin_top), A00(context, i), 80);
        c124385ju.setCallback(callback);
        return c124385ju;
    }
}
