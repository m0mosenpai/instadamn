package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes4.dex */
public abstract class AEP {
    public static final Drawable A00(Context context, Integer num) {
        int i;
        C14360o3.A0B(num, 2);
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                i = R.drawable.sticker_icon_support_small;
            } else {
                throw AbstractC166987dD.A14(AnonymousClass001.A0R("Unexpected SupportBusinessProfileSticker Theme: ", A2A.A00(num)));
            }
        } else {
            i = R.drawable.black_sticker_icon_support_small;
        }
        return context.getDrawable(i);
    }

    public static final int[] A01(Context context, Integer num) {
        int[] iArr;
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                iArr = new int[]{context.getColor(R.color.share_professional_profile_sticker_username_color_start)};
                i = R.color.share_professional_profile_sticker_username_color_end;
            } else {
                throw AbstractC166987dD.A14(AnonymousClass001.A0R("Unexpected SupportBusinessProfileSticker Theme: ", A2A.A00(num)));
            }
        } else {
            iArr = new int[]{context.getColor(R.color.cardview_dark_background)};
            i = R.color.abc_decor_view_status_guard;
        }
        iArr[1] = context.getColor(i);
        return iArr;
    }
}
