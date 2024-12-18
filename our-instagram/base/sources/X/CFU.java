package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.StoryPollColorType;

/* loaded from: classes5.dex */
public abstract class CFU {
    public static final int A00(Context context, StoryPollColorType storyPollColorType) {
        int i;
        if (storyPollColorType != null) {
            switch (storyPollColorType.ordinal()) {
                case 2:
                    i = R.attr.igds_color_gradient_blue;
                    break;
                case 4:
                    return R.color.igds_active_badge;
                case 5:
                    i = R.attr.igds_color_gradient_lavender;
                    break;
                case 6:
                    return R.color.activator_card_progress_bad;
                case 7:
                    i = R.attr.igds_color_gradient_pink;
                    break;
                case 8:
                    i = R.attr.igds_color_gradient_purple;
                    break;
            }
            return AbstractC53242c7.A0H(context, i);
        }
        i = R.attr.igds_color_primary_text;
        return AbstractC53242c7.A0H(context, i);
    }
}
