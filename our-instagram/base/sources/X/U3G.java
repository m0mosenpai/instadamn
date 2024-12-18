package X;

import android.content.Context;
import android.graphics.ColorFilter;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes11.dex */
public abstract class U3G {
    public static final void A00(Context context, CircularImageView circularImageView, Integer num) {
        int i;
        ColorFilter A00;
        C14360o3.A0B(circularImageView, 1);
        circularImageView.setStrokeAlpha(38);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                i = R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24;
                if (intValue != 2) {
                    i = R.drawable.instagram_search_gen_ai_pano_filled_20;
                }
            } else {
                i = R.drawable.instagram_hashtag_pano_outline_24;
            }
        } else {
            i = R.drawable.instagram_search_pano_outline_24;
        }
        AbstractC166997dE.A19(context, circularImageView, i);
        if (num == C05F.A0C) {
            A00 = null;
        } else {
            A00 = C3DY.A00(context.getColor(AbstractC53242c7.A08(context)));
        }
        circularImageView.setColorFilter(A00);
        int A03 = AbstractC167017dG.A03(context);
        circularImageView.setPadding(A03, A03, A03, A03);
    }
}
