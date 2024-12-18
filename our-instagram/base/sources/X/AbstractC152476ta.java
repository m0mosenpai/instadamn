package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* renamed from: X.6ta, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC152476ta {
    public static final C1ON A00(Context context, AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 0);
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A05();
        c25621Ms.A0B("users/check_username/");
        c25621Ms.A9s(AbstractC31186DnV.A00(), str);
        c25621Ms.A9s("_uuid", C16030qx.A02.A05(context));
        c25621Ms.A9s("is_group_creation", "false");
        c25621Ms.A0R(C32200ECv.class, FXv.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A01(Context context, AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(abstractC12990ll, 0);
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A05();
        c25621Ms.A0B("accounts/verify_email_code/");
        c25621Ms.A9s(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, str2);
        c25621Ms.A9s("email", str);
        c25621Ms.A9s(AbstractC31186DnV.A01(0, 9, 92), C16030qx.A00(context));
        c25621Ms.A0R(ECU.class, C34816FVs.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A02(Context context, UserSession userSession, Integer num, String str) {
        String str2;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 3);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("accounts/initiate_phone_number_confirmation/");
        c25621Ms.A0R(ECS.class, C34808FVk.class);
        c25621Ms.A9s(AbstractC31186DnV.A01(9, 12, 42), str);
        c25621Ms.A9s("phone_id", C11830jh.A04.A01(userSession).A02(C19T.A2M));
        c25621Ms.A9s("guid", C16030qx.A02.A05(context));
        if (1 - num.intValue() != 0) {
            str2 = "edit_profile";
        } else {
            str2 = "profile_megaphone";
        }
        c25621Ms.A9s("send_source", str2);
        if (LHp.A00(context)) {
            String name = ((EnumC12900lc) EnumC12900lc.A02.getValue()).name();
            Locale locale = Locale.getDefault();
            C14360o3.A07(locale);
            String lowerCase = name.toLowerCase(locale);
            C14360o3.A07(lowerCase);
            c25621Ms.A9s("android_build_type", lowerCase);
        }
        if (C0BQ.A00(userSession).CLL()) {
            c25621Ms.A0N = true;
        }
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A03(Context context, UserSession userSession, Integer num, String str, String str2, List list) {
        String str3;
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("accounts/send_confirm_email/");
        c25621Ms.A0R(ED3.class, C34861FXw.class);
        c25621Ms.A9s(AbstractC31186DnV.A01(0, 9, 92), C16030qx.A00(context));
        c25621Ms.A9s("guid", C16030qx.A02.A05(context));
        switch (num.intValue()) {
            case 1:
                str3 = "profile_megaphone";
                break;
            case 2:
                str3 = "edit_profile";
                break;
            case 3:
                str3 = "personal_information";
                break;
            case 4:
                str3 = "profile_qp";
                break;
            case 5:
                str3 = "nux";
                break;
            case 6:
                str3 = "logout_upsell";
                break;
            case 7:
                str3 = "2fa_sms";
                break;
            default:
                str3 = "email_cliff_megaphone";
                break;
        }
        c25621Ms.A9s("send_source", str3);
        c25621Ms.A0H("email", str);
        c25621Ms.A0H("phone_id", str2);
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            c25621Ms.A9s("google_tokens", jSONArray.toString());
        }
        if (C0BQ.A00(userSession).CLL()) {
            c25621Ms.A0N = true;
        }
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A04(AbstractC12990ll abstractC12990ll, String str) {
        C14360o3.A0B(abstractC12990ll, 0);
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A05();
        c25621Ms.A0B("accounts/send_sms_code/");
        c25621Ms.A9s(AbstractC31186DnV.A01(9, 12, 42), str);
        c25621Ms.A0R(EDW.class, C35073Fck.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A05(AbstractC12990ll abstractC12990ll, String str, String str2, boolean z) {
        C14360o3.A0B(abstractC12990ll, 0);
        C25621Ms c25621Ms = new C25621Ms(abstractC12990ll, -2);
        c25621Ms.A05();
        c25621Ms.A0B("accounts/verify_sms_code/");
        c25621Ms.A9s(AbstractC31186DnV.A01(9, 12, 42), str);
        c25621Ms.A9s(AbstractC31186DnV.A01(39, 17, 107), str2);
        if (z) {
            c25621Ms.A9s("has_sms_consent", "true");
        }
        c25621Ms.A0R(EDX.class, C35074Fcl.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("accounts/current_user/");
        c25621Ms.A9s("edit", "true");
        c25621Ms.A0P(null, ECB.class, FY2.class, false);
        return c25621Ms.A0N();
    }

    public static final C1ON A07(UserSession userSession, C34649FOh c34649FOh, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c34649FOh, 1);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("accounts/edit_profile/");
        c25621Ms.A9s(AbstractC31186DnV.A00(), c34649FOh.A0O);
        c25621Ms.A9s("first_name", c34649FOh.A0F);
        c25621Ms.A9s(AbstractC31186DnV.A01(9, 12, 42), c34649FOh.A0M);
        c25621Ms.A9s("email", c34649FOh.A0D);
        c25621Ms.A9s("biography", c34649FOh.A0A);
        c25621Ms.A9s(AbstractC58317Pt9.A00(342), c34649FOh.A02.A00);
        c25621Ms.A0I(AbstractC58317Pt9.A00(132), c34649FOh.A0b);
        c25621Ms.A0I(AbstractC58317Pt9.A00(133), c34649FOh.A0c);
        if (z) {
            c25621Ms.A9s("gender", String.valueOf(c34649FOh.A00));
        }
        c25621Ms.A0R(EDA.class, FY3.class);
        c25621Ms.A9s(AbstractC31186DnV.A01(0, 9, 92), str);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A08(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("multiple_accounts/get_featured_accounts/");
        c25621Ms.A9s("target_user_id", str);
        c25621Ms.A0P(null, C152486tb.class, C152496tc.class, false);
        return c25621Ms.A0N();
    }
}
