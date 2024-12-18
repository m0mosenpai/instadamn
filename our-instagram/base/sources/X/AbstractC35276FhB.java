package X;

import android.content.Context;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.fx.access.constants.FxcalAccountType;
import com.instagram.nux.cal.model.NuxConnectResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FhB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35276FhB {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.FNZ, java.lang.Object] */
    public static FNZ A0H(FxcalAccountType fxcalAccountType, String str, String str2) {
        EnumC33436Eq7 enumC33436Eq7 = EnumC33436Eq7.A04;
        ?? obj = new Object();
        obj.A00 = fxcalAccountType;
        obj.A04 = str;
        obj.A05 = str2;
        obj.A01 = enumC33436Eq7;
        obj.A02 = "Instagram";
        obj.A03 = "active_account";
        return obj;
    }

    public static C11830jh A00(AbstractC23721Ec abstractC23721Ec, AbstractC12990ll abstractC12990ll, String str, String str2) {
        abstractC23721Ec.A9s(str, str2);
        abstractC23721Ec.A9s("adid", A0I());
        return C11830jh.A04.A01(abstractC12990ll);
    }

    public static C1ON A01(Context context, C07270a1 c07270a1, Boolean bool, Boolean bool2, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("users/lookup_phone/");
        AbstractC31178DnM.A0n(context, A0M, AbstractC31182DnR.A00(), C16030qx.A00(context));
        A0M.A0I("supports_sms_code", z);
        AbstractC31176DnK.A1Q(A0M);
        A0M.A0H("query", str);
        A0M.A0H("use_whatsapp", String.valueOf(z2));
        A0M.A0H("client_message", str2);
        A0M.A0F("auth_failed", bool);
        A0M.A0F("is_resend", bool2);
        A0M.A0S(EDY.class, C34811FVn.class);
        if (LHp.A00(context)) {
            A0M.A9s("android_build_type", AbstractC31176DnK.A0r((EnumC12900lc) EnumC12900lc.A02.getValue()));
        }
        return AbstractC31176DnK.A0P(A0M);
    }

    public static C1ON A02(Context context, C07270a1 c07270a1, Integer num, String str) {
        String str2;
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/assisted_account_recovery/");
        AbstractC31179DnN.A0j(context, A0M, "query", str);
        switch (num.intValue()) {
            case 0:
                str2 = "login_help";
                break;
            case 1:
                str2 = "account_access";
                break;
            case 2:
                str2 = "multi_account";
                break;
            case 3:
                str2 = "recovery_upsell";
                break;
            default:
                str2 = "login_upsell";
                break;
        }
        A0M.A9s(CacheBehaviorLogger.SOURCE, str2);
        A0M.A0S(EDH.class, C34800FVc.class);
        String A00 = new C101304gm().A00("vetted_device_nonces");
        if (A00 != null) {
            A0M.A9s("vetted_device_nonces", A00);
        }
        return AbstractC31176DnK.A0P(A0M);
    }

    public static C1ON A03(Context context, C07270a1 c07270a1, String str) {
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/send_recovery_flow_email/");
        AbstractC31179DnN.A0j(context, A0M, "query", str);
        AbstractC31178DnM.A1K(A0M, "adid", A0I());
        return AbstractC31178DnM.A0I(A0M, EDD.class, C34807FVj.class);
    }

    public static C1ON A04(Context context, C07270a1 c07270a1, String str, String str2, String str3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/one_tap_app_login/");
        AbstractC31179DnN.A0j(context, A0M, "login_nonce", str);
        AbstractC31175DnJ.A1F(C19T.A1v, A0M, A00(A0M, c07270a1, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2));
        A0M.A0H("device_base_login_session", str3);
        return AbstractC31180DnO.A0H(A0M, EfU.class, C35072Fcj.class);
    }

    public static C1ON A05(Context context, C07270a1 c07270a1, String str, String str2, String str3) {
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/one_tap_app_login/");
        AbstractC31179DnN.A0j(context, A0M, "login_nonce", str);
        AbstractC31175DnJ.A1F(C19T.A1v, A0M, A00(A0M, c07270a1, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2));
        A0M.A0H("stop_deletion_token", str3);
        return AbstractC31180DnO.A0H(A0M, EfU.class, C35072Fcj.class);
    }

    public static C1ON A06(Context context, C07270a1 c07270a1, String str, String str2, String str3, String str4) {
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/account_recovery_code_verify/");
        AbstractC31177DnL.A0t(context, A0M);
        AbstractC31178DnM.A1K(A0M, "recover_code", str);
        A0M.A0H("recovery_handle", str2);
        A0M.A9s("recovery_handle_type", str3);
        A0M.A9s("recovery_type", str4);
        return AbstractC31180DnO.A0H(A0M, C32195ECq.class, C34798FVa.class);
    }

    public static C1ON A07(Context context, C07270a1 c07270a1, String str, String str2, String str3, String str4, String str5, String str6) {
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/account_recovery_code_login/");
        A0M.A9s("query", str);
        A0M.A9s("recover_code", str2);
        AbstractC31179DnN.A0j(context, A0M, CacheBehaviorLogger.SOURCE, "account_recover_code");
        AbstractC31176DnK.A1Q(A0M);
        AbstractC31176DnK.A1O(C19T.A1v, A0M, AbstractC31172DnG.A0P(c07270a1));
        A0M.A0H("flow_type", str3);
        A0M.A0H("client_message", str4);
        A0M.A0H("auth_start_response", str5);
        A0M.A0H("autoconf_metadata_blob", str6);
        return AbstractC31180DnO.A0H(A0M, EfU.class, C35072Fcj.class);
    }

    public static C1ON A08(Context context, AbstractC12990ll abstractC12990ll, String str, List list) {
        String obj;
        String str2;
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("fxcal/get_sso_accounts/");
        AbstractC31177DnL.A0t(context, A0M);
        A0M.A0H("surface", str);
        A0M.A9s("include_social_context", "false");
        A0M.A0P(C07340a8.A00, C32156EBd.class, FVM.class, false);
        try {
            JSONArray A0p = AbstractC31171DnF.A0p();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0p.put(new JSONObject(AbstractC34207F7f.A00((FNZ) it.next())));
            }
            A0M.A0H("tokens", A0p.toString());
        } catch (IOException e) {
            obj = e.toString();
            str2 = "Fail to fetch IG SSO users";
            C0w9.A03(str2, obj);
            return AbstractC31176DnK.A0P(A0M);
        } catch (JSONException e2) {
            obj = e2.toString();
            str2 = "Fail to build JSON object";
            C0w9.A03(str2, obj);
            return AbstractC31176DnK.A0P(A0M);
        }
        return AbstractC31176DnK.A0P(A0M);
    }

    public static C1ON A09(Context context, UserSession userSession, Boolean bool) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("accounts/opt_out_feo2_service/");
        AbstractC31171DnF.A1J(A0M, userSession.userId);
        A0M.A0F("retrieve_only", bool);
        AbstractC31176DnK.A1Q(A0M);
        AbstractC31179DnN.A0j(context, A0M, CacheBehaviorLogger.SOURCE, "account_recover_code");
        AbstractC31176DnK.A1O(C19T.A1v, A0M, AbstractC31172DnG.A0P(userSession));
        return AbstractC31180DnO.A0H(A0M, ECR.class, C34806FVi.class);
    }

    public static C1ON A0A(Context context, UserSession userSession, String str, String str2, String str3, boolean z) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("accounts/register_feo2_service/");
        A0M.A0H("enc_verifier", str);
        AbstractC31178DnM.A1K(A0M, "recover_code", str2);
        AbstractC31171DnF.A1J(A0M, userSession.userId);
        A0M.A0I("has_feo2_consent", z);
        AbstractC31179DnN.A0j(context, A0M, CacheBehaviorLogger.SOURCE, "account_recover_code");
        A0M.A9s("sms_flow_type", str3);
        return AbstractC31180DnO.A0H(A0M, EB3.class, C34809FVl.class);
    }

    public static C1ON A0B(AbstractC12990ll abstractC12990ll, FNZ fnz, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("fxcal/sso_login/");
        A0M.A0H("pk", str);
        AbstractC31180DnO.A1R(A0M, "adid", A0I(), str2, str3);
        AbstractC31178DnM.A1K(A0M, "phone_id", AbstractC31172DnG.A0P(abstractC12990ll).A02(C19T.A1v));
        A0M.A0H("surface", str4);
        A0M.A0F("require_password_reset", bool);
        A0M.A0H("stop_deletion_token", str5);
        A0M.A0P(C07340a8.A00, EfV.class, C34802FVe.class, false);
        A0M.A0R = true;
        try {
            A0M.A9s("token", AbstractC34207F7f.A00(fnz));
        } catch (IOException e) {
            C0w9.A03("Fail to fetch SSO token", e.toString());
        }
        return A0M.A0N();
    }

    public static C1ON A0C(AbstractC12990ll abstractC12990ll, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str8;
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("fb/facebook_signup/");
        String str9 = "false";
        String str10 = "false";
        if (z2) {
            str10 = "true";
        }
        A0M.A9s("dryrun", str10);
        A0M.A9s(AbstractC31182DnR.A01(), str);
        A0M.A9s("adid", A0I());
        if (z) {
            str8 = "big_blue_token";
        } else {
            str8 = "fb_access_token";
        }
        AbstractC31180DnO.A1R(A0M, str8, str2, str5, str6);
        C11820jg c11820jg = C11830jh.A04;
        C11830jh A01 = c11820jg.A01(abstractC12990ll);
        C19T c19t = C19T.A1v;
        AbstractC31175DnJ.A1F(c19t, A0M, A01);
        C28131Xr c28131Xr = C28131Xr.A00;
        if (c28131Xr != null) {
            AbstractC31178DnM.A1K(A0M, "jazoest", c28131Xr.A00(c11820jg.A01(abstractC12990ll).A02(c19t)));
            A0M.A0I("fb_reg_flag", z4);
            if (z5) {
                str9 = "true";
            }
            A0M.A9s("force_signup_with_fb_after_cp_claiming", str9);
            A0M.A0F("require_password_reset", bool);
            A0M.A0P(C07340a8.A00, EfV.class, C34802FVe.class, false);
            A0M.A0R = true;
            if (z3) {
                A0M.A9s("allow_contacts_sync", "true");
            }
            if (str3 != null) {
                A0M.A9s("sn_result", str3);
            }
            if (str4 != null) {
                A0M.A9s("sn_nonce", str4);
            }
            if (str7 != null) {
                A0M.A9s("surface", str7);
            }
            return A0M.A0N();
        }
        throw new RuntimeException("SprinklePlugin instance needs to be set before get");
    }

    public static C1ON A0D(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, String str5) {
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("fb/nux_fb_connect/");
        A0M.A9s("access_token", str);
        A0M.A9s("ap", str2);
        A0M.A9s("selected_age_account_id", str3);
        A0M.A9s("selected_age_account_type", str4);
        A0M.A0H("linking_entry_point", str5);
        return AbstractC31180DnO.A0H(A0M, NuxConnectResponse.class, FWM.class);
    }

    public static C1ON A0E(AbstractC12990ll abstractC12990ll, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i) {
        JSONArray A0p = AbstractC31171DnF.A0p();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC31172DnG.A1W(it, A0p);
            }
        }
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("accounts/login/");
        A0M.A9s(AbstractC31182DnR.A01(), str8);
        AbstractC31180DnO.A1R(A0M, "enc_password", AbstractC31176DnK.A0p(abstractC12990ll, str6), str2, str5);
        A0M.A9s("adid", A0I());
        C11820jg c11820jg = C11830jh.A04;
        C11830jh A01 = c11820jg.A01(abstractC12990ll);
        C19T c19t = C19T.A1v;
        AbstractC31175DnJ.A1F(c19t, A0M, A01);
        FDT.A00(c19t, A0M, c11820jg, abstractC12990ll);
        A0M.A9s("login_attempt_count", Integer.toString(i));
        AbstractC31176DnK.A1R(A0M, A0p);
        A0M.A0H("sn_result", str4);
        A0M.A0H("sn_nonce", str3);
        A0M.A0H("country_codes", str);
        A0M.A0H("stop_deletion_token", str7);
        return AbstractC31180DnO.A0H(A0M, EfU.class, C35072Fcj.class);
    }

    public static C1ON A0F(AbstractC12990ll abstractC12990ll, List list) {
        JSONArray A0p = AbstractC31171DnF.A0p();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31172DnG.A1W(it, A0p);
        }
        C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
        A0M.A0B("accounts/google_token_users/");
        AbstractC31176DnK.A1R(A0M, A0p);
        return AbstractC31178DnM.A0I(A0M, C32160EBh.class, C34803FVf.class);
    }

    public static C1ON A0G(UserSession userSession, String str) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("accounts/change_password/");
        A0M.A9s("enc_new_password", AbstractC31176DnK.A0p(userSession, str));
        return AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class);
    }

    public static String A0I() {
        String string = AbstractC31174DnI.A0f().getString("google_ad_id", null);
        Pattern pattern = AbstractC13670mt.A01;
        if (string == null) {
            return "";
        }
        return string;
    }
}
