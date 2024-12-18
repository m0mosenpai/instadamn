package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.phonenumber.model.CountryCodeData;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.registration.model.UserBirthDate;
import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.FvV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36033FvV implements InterfaceC25281Li {
    public final int A00;
    public final Object A01;

    public C36033FvV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ Object E3T(String str) {
        if (this.A00 != 0) {
            return AbstractC34294FAo.parseFromJson(C16V.A00(str));
        }
        return AbstractC34198F6w.parseFromJson(C16V.A00(str));
    }

    @Override // X.InterfaceC25281Li
    public final /* bridge */ /* synthetic */ String EOt(Object obj) {
        if (this.A00 != 0) {
            RegFlowExtras regFlowExtras = (RegFlowExtras) obj;
            StringWriter stringWriter = new StringWriter();
            C17z A0S = AbstractC167007dF.A0S(stringWriter);
            String str = regFlowExtras.A07;
            if (str != null) {
                A0S.A0S("device_verification_result", str);
            }
            String str2 = regFlowExtras.A06;
            if (str2 != null) {
                A0S.A0S("device_verification_nonce", str2);
            }
            if (regFlowExtras.A01 != null) {
                A0S.A0r("country_code_data");
                CountryCodeData countryCodeData = regFlowExtras.A01;
                A0S.A0d();
                String str3 = countryCodeData.A01;
                if (str3 != null) {
                    A0S.A0S("country_code", str3);
                }
                String str4 = countryCodeData.A02;
                if (str4 != null) {
                    A0S.A0S("display_string", str4);
                }
                String str5 = countryCodeData.A00;
                if (str5 != null) {
                    A0S.A0S("country", str5);
                }
                A0S.A0a();
            }
            String str6 = regFlowExtras.A0R;
            if (str6 != null) {
                A0S.A0S("phone_number_without_country_code", str6);
            }
            String str7 = regFlowExtras.A0Q;
            if (str7 != null) {
                A0S.A0S("phone_number_with_country_code", str7);
            }
            String str8 = regFlowExtras.A08;
            if (str8 != null) {
                A0S.A0S("email", str8);
            }
            String str9 = regFlowExtras.A0O;
            if (str9 != null) {
                A0S.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str9);
            }
            String str10 = regFlowExtras.A0Z;
            if (str10 != null) {
                A0S.A0S(AbstractC31193Dnc.A00(), str10);
            }
            String str11 = regFlowExtras.A0W;
            if (str11 != null) {
                A0S.A0S("suggested_username", str11);
            }
            String str12 = regFlowExtras.A0P;
            if (str12 != null) {
                A0S.A0S("password", str12);
            }
            A0S.A0T("skip_password", regFlowExtras.A11);
            String str13 = regFlowExtras.A05;
            if (str13 != null) {
                A0S.A0S("confirmation_code", str13);
            }
            String str14 = regFlowExtras.A0B;
            if (str14 != null) {
                A0S.A0S("force_sign_up_code", str14);
            }
            String str15 = regFlowExtras.A0D;
            if (str15 != null) {
                A0S.A0S("google_id_token", str15);
            }
            if (regFlowExtras.A0e != null) {
                C16V.A03(A0S, "username_suggestions");
                Iterator it = regFlowExtras.A0e.iterator();
                while (it.hasNext()) {
                    AbstractC167017dG.A1F(A0S, it);
                }
                A0S.A0Z();
            }
            if (regFlowExtras.A0f != null) {
                C16V.A03(A0S, "username_suggestions_with_metadata");
                for (C34517FJd c34517FJd : regFlowExtras.A0f) {
                    if (c34517FJd != null) {
                        A0S.A0d();
                        String str16 = c34517FJd.A01;
                        if (str16 != null) {
                            A0S.A0S(AbstractC31193Dnc.A00(), str16);
                        }
                        String str17 = c34517FJd.A00;
                        if (str17 != null) {
                            A0S.A0S("prototype", str17);
                        }
                        A0S.A0a();
                    }
                }
                A0S.A0Z();
            }
            if (regFlowExtras.A02 != null) {
                A0S.A0r("solution");
                C34706FQr c34706FQr = regFlowExtras.A02;
                A0S.A0d();
                if (c34706FQr.A00 != null) {
                    C16V.A03(A0S, "solutions");
                    for (C34705FQq c34705FQq : c34706FQr.A00) {
                        if (c34705FQq != null) {
                            A0S.A0d();
                            if (c34705FQq.A00 != null) {
                                C16V.A03(A0S, "sublist");
                                for (Number number : c34705FQq.A00) {
                                    if (number != null) {
                                        A0S.A0h(number.intValue());
                                    }
                                }
                                A0S.A0Z();
                            }
                            A0S.A0a();
                        }
                    }
                    A0S.A0Z();
                }
                A0S.A0a();
            }
            String str18 = regFlowExtras.A0S;
            if (str18 != null) {
                A0S.A0S("registration_flow", str18);
            }
            String str19 = regFlowExtras.A0N;
            if (str19 != null) {
                A0S.A0S("last_registration_step", str19);
            }
            String str20 = regFlowExtras.A0V;
            if (str20 != null) {
                A0S.A0S("signup_type", str20);
            }
            String str21 = regFlowExtras.A04;
            if (str21 != null) {
                A0S.A0S("actor_id", str21);
            }
            String str22 = regFlowExtras.A0T;
            if (str22 != null) {
                A0S.A0S("sac_intent", str22);
            }
            String str23 = regFlowExtras.A0U;
            if (str23 != null) {
                A0S.A0S("sac_upsell_surface", str23);
            }
            A0S.A0T("skip_email", regFlowExtras.A10);
            A0S.A0T("allow_contact_sync", regFlowExtras.A0h);
            A0S.A0T("has_sms_consent", regFlowExtras.A0q);
            A0S.A0T("gdpr_required", regFlowExtras.A0n);
            String str24 = regFlowExtras.A0C;
            if (str24 != null) {
                A0S.A0S("gdpr_s", str24);
            }
            String str25 = regFlowExtras.A0X;
            if (str25 != null) {
                A0S.A0S("tos_version", str25);
            }
            A0S.A0T("tos_acceptance_not_required", regFlowExtras.A12);
            A0S.A0R("cache_time", regFlowExtras.A00);
            A0S.A0T("force_create_account", regFlowExtras.A0l);
            A0S.A0T("requested_username_change", regFlowExtras.A0x);
            String str26 = regFlowExtras.A0Y;
            if (str26 != null) {
                A0S.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str26);
            }
            A0S.A0T("one_tap_opt_in", regFlowExtras.A0w);
            A0S.A0T("age_required", regFlowExtras.A0g);
            A0S.A0T("is_eligible_to_register", regFlowExtras.A0s);
            A0S.A0T("is_supervised_user", regFlowExtras.A0v);
            if (regFlowExtras.A03 != null) {
                A0S.A0r("user_birth_date");
                UserBirthDate userBirthDate = regFlowExtras.A03;
                A0S.A0d();
                A0S.A0Q("birth_year", userBirthDate.A02);
                A0S.A0Q("birth_month", userBirthDate.A01);
                A0S.A0Q("birth_day", userBirthDate.A00);
                A0S.A0a();
            }
            A0S.A0T("existing_account_dialog_shown", regFlowExtras.A0k);
            A0S.A0T("is_simple_sac_enabled", regFlowExtras.A0u);
            String str27 = regFlowExtras.A0J;
            if (str27 != null) {
                A0S.A0S("last_logged_in_user_id", str27);
            }
            String str28 = regFlowExtras.A0M;
            if (str28 != null) {
                A0S.A0S("last_logged_in_username", str28);
            }
            String str29 = regFlowExtras.A09;
            if (str29 != null) {
                A0S.A0S("fb_access_token", str29);
            }
            A0S.A0T("is_cal_flow", regFlowExtras.A0r);
            A0S.A0T("force_signup_with_fb_after_cp_claiming", regFlowExtras.A0m);
            String str30 = regFlowExtras.A0b;
            if (str30 != null) {
                A0S.A0S("vpc_link", str30);
            }
            String str31 = regFlowExtras.A0d;
            if (str31 != null) {
                A0S.A0S("vpc_token", str31);
            }
            String str32 = regFlowExtras.A0c;
            if (str32 != null) {
                A0S.A0S("vpc_status", str32);
            }
            String str33 = regFlowExtras.A0a;
            if (str33 != null) {
                A0S.A0S("vpc_invite_id", str33);
            }
            String str34 = regFlowExtras.A0H;
            if (str34 != null) {
                A0S.A0S("last_logged_in_user_auth_header", str34);
            }
            String str35 = regFlowExtras.A0G;
            if (str35 != null) {
                A0S.A0S("last_logged_in_user_access_token", str35);
            }
            A0S.A0T("sac_cal_flow", regFlowExtras.A0t);
            A0S.A0T("sac_cal_user_consent_accepted", regFlowExtras.A0y);
            String str36 = regFlowExtras.A0K;
            if (str36 != null) {
                A0S.A0S("last_logged_in_user_phone_number_with_country_code", str36);
            }
            String str37 = regFlowExtras.A0L;
            if (str37 != null) {
                A0S.A0S("last_logged_in_user_phone_number_without_country_code", str37);
            }
            String str38 = regFlowExtras.A0I;
            if (str38 != null) {
                A0S.A0S("last_logged_in_user_email", str38);
            }
            A0S.A0T("should_link_to_main", regFlowExtras.A0z);
            A0S.A0T("convert_to_group", regFlowExtras.A0i);
            String str39 = regFlowExtras.A0E;
            if (str39 != null) {
                A0S.A0S("group_biography", str39);
            }
            String str40 = regFlowExtras.A0F;
            if (str40 != null) {
                A0S.A0S("group_external_url", str40);
            }
            A0S.A0T("group_should_be_private", regFlowExtras.A0o);
            A0S.A0T(AbstractC111324zv.A00(117), regFlowExtras.A0p);
            A0S.A0T("create_group_thread", regFlowExtras.A0j);
            return AbstractC167017dG.A0l(A0S, stringWriter);
        }
        FGU fgu = (FGU) obj;
        StringWriter stringWriter2 = new StringWriter();
        C17z A0S2 = AbstractC167007dF.A0S(stringWriter2);
        if (fgu.A00 != null) {
            C16V.A03(A0S2, "entries");
            Iterator it2 = fgu.A00.iterator();
            while (it2.hasNext()) {
                DirectShareTarget A0m = AbstractC31172DnG.A0m(it2);
                if (A0m != null) {
                    C7NS.A00(A0S2, A0m);
                }
            }
            A0S2.A0Z();
        }
        return AbstractC167017dG.A0l(A0S2, stringWriter2);
    }
}
