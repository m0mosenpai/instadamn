package X;

import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.FTo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34769FTo {
    public static final InterfaceC31036Dka A01(UserMonetizationProductType userMonetizationProductType, UserSession userSession, boolean z) {
        Object g15;
        switch (AbstractC25227BEk.A05(userMonetizationProductType, 1)) {
            case 2:
            case Process.SIGTERM /* 15 */:
                g15 = new G12(z);
                break;
            case 3:
            case 4:
            case 6:
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            default:
                g15 = new Object();
                break;
            case 5:
                g15 = new Object();
                break;
            case 7:
                g15 = new Object();
                break;
            case 9:
                g15 = new G15(z);
                break;
            case 10:
                g15 = new G14(userSession);
                break;
            case 11:
                g15 = new G13(z);
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                g15 = new Object();
                break;
        }
        return (InterfaceC31036Dka) g15;
    }

    public static final int A00(String str) {
        if (C14360o3.A0K(str, "users-pano")) {
            return R.drawable.instagram_users_pano_outline_24;
        }
        if (C14360o3.A0K(str, "promote-pano")) {
            return R.drawable.instagram_promote_pano_outline_24;
        }
        if (!C14360o3.A0K(str, "money-pano")) {
            if (C14360o3.A0K(str, "key-pano")) {
                return R.drawable.instagram_key_pano_outline_24;
            }
            if (C14360o3.A0K(str, "badge-pano")) {
                return R.drawable.instagram_badge_pano_outline_24;
            }
            if (C14360o3.A0K(str, "badges-pano")) {
                return R.drawable.instagram_badges_pano_outline_24;
            }
            if (C14360o3.A0K(str, "crown-badge-pano")) {
                return R.drawable.instagram_crown_badge_pano_outline_24;
            }
            if (C14360o3.A0K(str, "mail-pano")) {
                return R.drawable.instagram_mail_pano_outline_24;
            }
            if (C14360o3.A0K(str, "business-pano")) {
                return R.drawable.instagram_business_pano_outline_24;
            }
            if (C14360o3.A0K(str, AbstractC111324zv.A00(2046))) {
                return R.drawable.instagram_circle_check_pano_filled_24;
            }
            if (C14360o3.A0K(str, AbstractC111324zv.A00(2047))) {
                return R.drawable.instagram_circle_x_pano_outline_24;
            }
            if (C14360o3.A0K(str, "ticket-pano")) {
                return R.drawable.instagram_ticket_pano_outline_24;
            }
            return R.drawable.instagram_money_pano_outline_24;
        }
        return R.drawable.instagram_money_pano_outline_24;
    }
}
