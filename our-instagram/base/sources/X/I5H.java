package X;

import com.facebook.R;
import com.instagram.api.schemas.StoryPollColorType;

/* loaded from: classes7.dex */
public abstract class I5H {
    public static final int A00(StoryPollColorType storyPollColorType) {
        if (storyPollColorType == null) {
            return R.color.black;
        }
        switch (storyPollColorType.ordinal()) {
            case 2:
                return R.color.badge_color;
            case 3:
            default:
                return R.color.black;
            case 4:
                return R.color.green_5;
            case 5:
                return R.color.clips_gradient_redesign_color_3;
            case 6:
                return R.color.clips_gradient_redesign_color_1;
            case 7:
                return R.color.clips_gradient_redesign_color_2;
            case 8:
                return R.color.clips_gradient_redesign_color_4;
        }
    }
}
