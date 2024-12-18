package X;

import com.facebook.R;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* loaded from: classes9.dex */
public final class OZ9 {
    public static final OZ9 A00 = new Object();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final N8K A00(String str) {
        String str2;
        String str3;
        int i;
        int i2;
        int hashCode = str.hashCode();
        if (hashCode != -1832044242) {
            switch (hashCode) {
                case 910733121:
                    if (str.equals("simple_gradient_background_0")) {
                        return new N8K(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, "simple_gradient_background_0", 0, 0);
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733122:
                    str2 = "simple_gradient_background_1";
                    if (str.equals("simple_gradient_background_1")) {
                        str3 = "primaries_msn";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_primaries_msn_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_primaries_msn_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733123:
                    str2 = "simple_gradient_background_2";
                    if (str.equals("simple_gradient_background_2")) {
                        str3 = "primaries_orange";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_primaries_orange_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_primaries_orange_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733124:
                    str2 = "simple_gradient_background_3";
                    if (str.equals("simple_gradient_background_3")) {
                        str3 = "primaries_tropical";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_primaries_tropical_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_primaries_tropical_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733125:
                    str2 = "simple_gradient_background_4";
                    if (str.equals("simple_gradient_background_4")) {
                        str3 = "muted_cold";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_muted_cold_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_muted_cold_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733126:
                    str2 = "simple_gradient_background_5";
                    if (str.equals("simple_gradient_background_5")) {
                        str3 = "muted_neutral";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_muted_neutral_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_muted_neutral_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733127:
                    str2 = "simple_gradient_background_6";
                    if (str.equals("simple_gradient_background_6")) {
                        str3 = "muted_sage";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_muted_sage_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_muted_sage_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733128:
                    str2 = "simple_gradient_background_7";
                    if (str.equals("simple_gradient_background_7")) {
                        str3 = "daylight_morning";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_daylight_morning_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_daylight_morning_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733129:
                    str2 = "simple_gradient_background_8";
                    if (str.equals("simple_gradient_background_8")) {
                        str3 = "daylight_noon";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_daylight_noon_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_daylight_noon_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                case 910733130:
                    str2 = "simple_gradient_background_9";
                    if (str.equals("simple_gradient_background_9")) {
                        str3 = "daylight_sunset";
                        i = R.drawable.messenger_rtc_avatar_backgrounds_daylight_sunset_thumb;
                        i2 = R.drawable.messenger_rtc_avatar_backgrounds_daylight_sunset_bg;
                        break;
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
                default:
                    throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
            }
            return new N8K(str3, str2, i, i2);
        }
        str2 = "simple_gradient_background_10";
        if (str.equals("simple_gradient_background_10")) {
            str3 = "daylight_night";
            i = R.drawable.messenger_rtc_avatar_backgrounds_daylight_night_thumb;
            i2 = R.drawable.messenger_rtc_avatar_backgrounds_daylight_night_bg;
            return new N8K(str3, str2, i, i2);
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0S("Unrecognised background Id '", str, '\''));
    }
}
