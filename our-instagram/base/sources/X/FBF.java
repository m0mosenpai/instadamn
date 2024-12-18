package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes6.dex */
public abstract class FBF {
    public static void A00(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, Integer num, String str, boolean z) {
        String str2;
        String str3;
        interfaceC11380iw.getClass();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "enable_sso");
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            A0f.AAP(AbstractC111324zv.A00(2310), str);
            switch (num.intValue()) {
                case 1:
                    str2 = "one_tap_screen";
                    break;
                case 2:
                    str2 = "aymh_screen";
                    break;
                case 3:
                    str2 = "settings";
                    break;
                case 4:
                    str2 = "nux";
                    break;
                case 5:
                    str2 = "logout_dialog";
                    break;
                case 6:
                    str2 = "logout_bottom_sheet";
                    break;
                case 7:
                    str2 = "login_screen";
                    break;
                case 8:
                    str2 = "change_password_upsell";
                    break;
                case 9:
                    str2 = "save_password_registration";
                    break;
                case 10:
                    str2 = "login_spi_screen";
                    break;
                case 11:
                    str2 = "passwordless_password_creation_unlinking";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str2 = "passwordless_password_creation_setting";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str2 = "multiple_account_recovery_screen";
                    break;
                default:
                    str2 = "one_tap_login_nonce_callback";
                    break;
            }
            AbstractC31171DnF.A1E(A0f, str2);
            if (z) {
                str3 = "YES";
            } else {
                str3 = "NO";
            }
            A0f.AAP("to_enabled", str3);
            A0f.Cht();
        }
    }
}
