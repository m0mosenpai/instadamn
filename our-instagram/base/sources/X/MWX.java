package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MWX {
    public final UserSession A00;

    public MWX(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(String str) {
        InterfaceC19610xo A0e;
        String str2;
        C14360o3.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1574224499) {
            if (hashCode != -773734548) {
                if (hashCode == 1949671265 && str.equals("IG_LOGOUT_UPSELL")) {
                    A0e = AbstractC31176DnK.A0e(this.A00);
                    str2 = "fx_cal_has_migrated_client_impression_to_server_logout_upsell";
                } else {
                    return;
                }
            } else {
                if (!str.equals("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                    return;
                }
                A0e = AbstractC31176DnK.A0e(this.A00);
                str2 = "fx_cal_has_migrated_client_impression_to_server_profile_photo_change_chaining_upsell";
            }
        } else {
            if (!str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
                return;
            }
            A0e = AbstractC31176DnK.A0e(this.A00);
            str2 = "fx_cal_has_migrated_client_impression_to_server_feed_crossposting_upsell";
        }
        AbstractC167007dF.A17(A0e, str2);
    }

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        C2JM A0b = AbstractC25225BEi.A0b();
        A0b.A04("upsell_name", str);
        C907442n c907442n = new C907442n(A0b, C51540MpQ.class, "FxIgLogImpressionsForACUpsell", true);
        C195928le.A00(this.A00).ATV(C55659Onk.A00, C55669Onu.A00, c907442n);
    }

    public final boolean A02(String str) {
        InterfaceC19630xq A0x;
        String str2;
        C14360o3.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1574224499) {
            if (hashCode != -773734548) {
                if (hashCode == 1949671265 && str.equals("IG_LOGOUT_UPSELL")) {
                    A0x = AbstractC166987dD.A0x(this.A00);
                    str2 = "fx_cal_has_migrated_client_impression_to_server_logout_upsell";
                } else {
                    return false;
                }
            } else if (str.equals("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                A0x = AbstractC166987dD.A0x(this.A00);
                str2 = "fx_cal_has_migrated_client_impression_to_server_profile_photo_change_chaining_upsell";
            } else {
                return false;
            }
        } else if (str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
            A0x = AbstractC166987dD.A0x(this.A00);
            str2 = "fx_cal_has_migrated_client_impression_to_server_feed_crossposting_upsell";
        } else {
            return false;
        }
        return A0x.getBoolean(str2, false);
    }
}
