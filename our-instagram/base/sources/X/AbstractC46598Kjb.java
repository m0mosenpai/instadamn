package X;

import com.facebook.R;

/* renamed from: X.Kjb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46598Kjb {
    public static final int A00(InterfaceC109884xG interfaceC109884xG) {
        Integer BEm;
        if (interfaceC109884xG != null && (BEm = interfaceC109884xG.BEm()) != null) {
            int intValue = BEm.intValue();
            if (intValue == 0) {
                return R.drawable.instagram_info_outline_16;
            }
            if (intValue != 1) {
                if (intValue == 3) {
                    return R.drawable.instagram_warning_outline_16;
                }
                if (intValue == 2) {
                    return R.drawable.instagram_news_off_pano_outline_32;
                }
                if (intValue == 4) {
                    return R.drawable.instagram_app_instagram_pano_outline_24;
                }
                if (intValue == 5) {
                    return R.drawable.instagram_info_pano_filled_12;
                }
                return R.drawable.instagram_eye_off_pano_outline_32;
            }
            return R.drawable.instagram_eye_off_pano_outline_32;
        }
        return R.drawable.instagram_eye_off_pano_outline_32;
    }
}
