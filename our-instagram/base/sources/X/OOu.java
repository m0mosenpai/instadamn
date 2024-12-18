package X;

import com.facebook.R;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;

/* loaded from: classes9.dex */
public abstract class OOu {
    public static final int A00(PublishScreenCategoryType publishScreenCategoryType) {
        switch (publishScreenCategoryType.ordinal()) {
            case 0:
                return -1;
            case 1:
                return R.drawable.instagram_eye_pano_outline_24;
            case 2:
                return R.drawable.instagram_business_pano_outline_24;
            case 3:
                return R.drawable.instagram_more_horizontal_pano_outline_24;
            case 4:
                return R.drawable.instagram_app_instagram_pano_outline_24;
            case 5:
                return R.drawable.instagram_apps_pano_outline_24;
            default:
                throw B4Z.A00();
        }
    }

    public static final int A01(PublishScreenCategoryType publishScreenCategoryType) {
        switch (publishScreenCategoryType.ordinal()) {
            case 0:
                return -1;
            case 1:
                return 2131953258;
            case 2:
                return 2131952484;
            case 3:
                return 2131966903;
            case 4:
                return 2131964618;
            case 5:
                return 2131955255;
            default:
                throw B4Z.A00();
        }
    }
}
