package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ADc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23020ADc {
    public static final Drawable A00(Context context, C3PO c3po, boolean z) {
        int i;
        Drawable drawable = null;
        if (context != null) {
            switch (c3po.ordinal()) {
                case 0:
                    i = R.drawable.instagram_users_pano_filled_24;
                    break;
                case 1:
                    i = R.drawable.instagram_eye_off_pano_outline_24;
                    break;
                case 2:
                    i = R.drawable.instagram_crown_pano_outline_24;
                    break;
                case 3:
                    return AbstractC172497mJ.A00(context);
                case 4:
                    i = R.drawable.instagram_user_requested_pano_filled_24;
                    break;
                case 5:
                    break;
                case 6:
                    i = R.drawable.instagram_app_instagram_pano_outline_24;
                    break;
                default:
                    throw B4Z.A00();
            }
            drawable = context.getDrawable(i);
            if (drawable != null) {
                drawable.mutate();
                int i2 = R.attr.igds_color_primary_icon;
                if (z) {
                    i2 = R.attr.igds_color_icon_on_color;
                }
                drawable.setTint(AbstractC167007dF.A09(context, i2));
            }
        }
        return drawable;
    }

    public static final String A01(Context context, UserSession userSession, C3PO c3po, boolean z) {
        int i;
        C14360o3.A0B(userSession, 1);
        if (context == null) {
            return null;
        }
        switch (c3po.ordinal()) {
            case 0:
                if (z) {
                    i = 2131965331;
                    if (AbstractC166997dE.A1Z(AbstractC166997dE.A0Y(userSession).A0J(), true)) {
                        i = 2131965330;
                        break;
                    }
                } else {
                    i = 2131964030;
                    break;
                }
                break;
            case 1:
                i = 2131964027;
                break;
            case 2:
                i = 2131964035;
                break;
            case 3:
                i = 2131964018;
                break;
            case 4:
                i = 2131964020;
                break;
            case 5:
                String str = AbstractC171597kp.A00(userSession).A03;
                if (str != null) {
                    return str;
                }
                return "";
            case 6:
                i = 2131964023;
                break;
            default:
                throw AbstractC166987dD.A1D(MSV.A00(71));
        }
        return context.getString(i);
    }
}
