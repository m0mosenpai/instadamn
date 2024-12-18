package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.facebook.R;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;

/* renamed from: X.Sgw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63295Sgw {
    public static final C63295Sgw A00 = new Object();

    public static final C2JO A00(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        if (bundle.get("ad_id") == null) {
            return null;
        }
        C2JO c2jo = new C2JO();
        c2jo.A09("ad_id", "key");
        c2jo.A09(AbstractC58321PtD.A0t(bundle, "ad_id"), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        C2JO c2jo2 = new C2JO();
        c2jo2.A09("iab_session_id", "key");
        c2jo2.A09(AbstractC58321PtD.A0t(bundle, "iab_session_id"), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        C2JO c2jo3 = new C2JO();
        c2jo3.A05("data", AbstractC16960so.A1Q(c2jo, c2jo2));
        return c2jo3;
    }

    public final void A02(Bundle bundle, InterfaceC02550Ad interfaceC02550Ad, Integer num, String str) {
        A03(bundle, interfaceC02550Ad, num, str, null, null);
    }

    public static final void A01(Activity activity, Integer num) {
        int i;
        int intValue = num.intValue();
        if (intValue != 0) {
            i = R.string.res_0x7f13001f_name_removed;
            if (intValue != 1) {
                i = R.string.res_0x7f13001c_name_removed;
            }
        } else {
            i = R.string.res_0x7f13001e_name_removed;
        }
        Toast.makeText(activity.getApplicationContext(), i, 1).show();
    }

    public final void A03(Bundle bundle, InterfaceC02550Ad interfaceC02550Ad, Integer num, String str, String str2, String str3) {
        Integer num2;
        String str4;
        String str5;
        String str6;
        AbstractC167017dG.A1O(interfaceC02550Ad, bundle);
        String string = bundle.getString(CacheBehaviorLogger.SOURCE);
        String str7 = "";
        String str8 = "";
        if (string == null) {
            string = "";
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(CacheBehaviorLogger.SOURCE, string));
        String string2 = bundle.getString("token_source");
        if (string2 == null) {
            string2 = "";
        }
        A07.put("token_source", string2);
        long A06 = AbstractC31177DnL.A06();
        long j = bundle.getLong("expiry_time");
        if (j == 0) {
            num2 = C05F.A00;
        } else if (j < A06) {
            num2 = C05F.A01;
        } else {
            num2 = C05F.A0C;
        }
        switch (num2.intValue()) {
            case 0:
                str4 = "UNAUTHENTICATED";
                break;
            case 1:
                str4 = "AUTH_EXPIRED";
                break;
            default:
                str4 = "AUTHENTICATED";
                break;
        }
        A07.put("auth_state", str4);
        String string3 = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string3 != null) {
            str7 = string3;
        }
        A07.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str7);
        InterfaceC02590Ai A0H = MSY.A0H(interfaceC02550Ad, "externally_linked_account_authentication_interactions");
        String string4 = bundle.getString("ad_id");
        if (string4 == null) {
            string4 = str8;
        }
        String string5 = bundle.getString("iab_session_id");
        if (string5 == null) {
            string5 = str8;
        }
        String string6 = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string6 != null) {
            str8 = string6;
        }
        if (str8.equals("universal_link")) {
            str5 = "BUY_WITH_PRIME_UNIVERSAL_LINK";
        } else {
            str5 = "BUY_WITH_PRIME";
        }
        if (!A0H.isSampled()) {
            return;
        }
        switch (num.intValue()) {
            case 0:
                str6 = "LOGIN_INITIATED";
                break;
            case 1:
                str6 = "LOGIN_URL_RECEIVED";
                break;
            case 2:
                str6 = "LOGIN_AUTH_CODE_RECEIVED";
                break;
            case 3:
                str6 = "LOGIN_ACCESS_TOKEN_RECEIVED";
                break;
            case 4:
                str6 = "LOGIN_CANCELED_BY_USER";
                break;
            case 5:
                str6 = "LOGIN_INTERNAL_ERROR";
                break;
            case 6:
                str6 = "LOGIN_EXTERNAL_PARTNER_ERROR";
                break;
            case 7:
                str6 = "ACCESS_TOKEN_REFRESH_SUCCEED";
                break;
            case 8:
                str6 = "ACCESS_TOKEN_FROM_CACHE";
                break;
            default:
                str6 = "ACCESS_TOKEN_REFRESH_ERROR";
                break;
        }
        A0H.AAP("event_name", str6);
        A0H.AAP("flow_name", str5);
        A0H.AAP("ad_id", string4);
        A0H.AAP("iab_session_id", string5);
        A0H.A9M("extra_data", A07);
        A0H.AAP("error_message", str);
        A0H.AAP("error_type", str2);
        A0H.AAP(MSV.A00(203), str3);
        A0H.Cht();
    }
}
