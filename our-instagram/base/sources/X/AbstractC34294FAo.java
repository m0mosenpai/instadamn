package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.registration.model.RegFlowExtras;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FAo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34294FAo {
    public static RegFlowExtras parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            RegFlowExtras regFlowExtras = new RegFlowExtras();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("device_verification_result".equals(A0s)) {
                    regFlowExtras.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("device_verification_nonce".equals(A0s)) {
                    regFlowExtras.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("country_code_data".equals(A0s)) {
                    regFlowExtras.A01 = FA4.parseFromJson(c16l);
                } else if ("phone_number_without_country_code".equals(A0s)) {
                    regFlowExtras.A0R = AbstractC167017dG.A0m(c16l);
                } else if ("phone_number_with_country_code".equals(A0s)) {
                    regFlowExtras.A0Q = AbstractC167017dG.A0m(c16l);
                } else if ("email".equals(A0s)) {
                    regFlowExtras.A08 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    regFlowExtras.A0O = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31193Dnc.A00().equals(A0s)) {
                    regFlowExtras.A0Z = AbstractC167017dG.A0m(c16l);
                } else if ("suggested_username".equals(A0s)) {
                    regFlowExtras.A0W = AbstractC167017dG.A0m(c16l);
                } else if ("password".equals(A0s)) {
                    regFlowExtras.A0P = AbstractC167017dG.A0m(c16l);
                } else if ("skip_password".equals(A0s)) {
                    regFlowExtras.A11 = c16l.A0d();
                } else if ("confirmation_code".equals(A0s)) {
                    regFlowExtras.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("force_sign_up_code".equals(A0s)) {
                    regFlowExtras.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("google_id_token".equals(A0s)) {
                    regFlowExtras.A0D = AbstractC167017dG.A0m(c16l);
                } else if ("username_suggestions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    regFlowExtras.A0e = arrayList;
                } else if ("username_suggestions_with_metadata".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C34517FJd parseFromJson = AbstractC34297FAr.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    regFlowExtras.A0f = arrayList;
                } else if ("solution".equals(A0s)) {
                    regFlowExtras.A02 = FAP.parseFromJson(c16l);
                } else if ("registration_flow".equals(A0s)) {
                    regFlowExtras.A0S = AbstractC167017dG.A0m(c16l);
                } else if ("last_registration_step".equals(A0s)) {
                    regFlowExtras.A0N = AbstractC167017dG.A0m(c16l);
                } else if ("signup_type".equals(A0s)) {
                    regFlowExtras.A0V = AbstractC167017dG.A0m(c16l);
                } else if ("actor_id".equals(A0s)) {
                    regFlowExtras.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("sac_intent".equals(A0s)) {
                    regFlowExtras.A0T = AbstractC167017dG.A0m(c16l);
                } else if ("sac_upsell_surface".equals(A0s)) {
                    regFlowExtras.A0U = AbstractC167017dG.A0m(c16l);
                } else if ("skip_email".equals(A0s)) {
                    regFlowExtras.A10 = c16l.A0d();
                } else if ("allow_contact_sync".equals(A0s)) {
                    regFlowExtras.A0h = c16l.A0d();
                } else if ("has_sms_consent".equals(A0s)) {
                    regFlowExtras.A0q = c16l.A0d();
                } else if ("gdpr_required".equals(A0s)) {
                    regFlowExtras.A0n = c16l.A0d();
                } else if ("gdpr_s".equals(A0s)) {
                    regFlowExtras.A0C = AbstractC167017dG.A0m(c16l);
                } else if ("tos_version".equals(A0s)) {
                    regFlowExtras.A0X = AbstractC167017dG.A0m(c16l);
                } else if ("tos_acceptance_not_required".equals(A0s)) {
                    regFlowExtras.A12 = c16l.A0d();
                } else if ("cache_time".equals(A0s)) {
                    regFlowExtras.A00 = c16l.A0y();
                } else if ("force_create_account".equals(A0s)) {
                    regFlowExtras.A0l = c16l.A0d();
                } else if ("requested_username_change".equals(A0s)) {
                    regFlowExtras.A0x = c16l.A0d();
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0s)) {
                    regFlowExtras.A0Y = AbstractC167017dG.A0m(c16l);
                } else if ("one_tap_opt_in".equals(A0s)) {
                    regFlowExtras.A0w = c16l.A0d();
                } else if ("age_required".equals(A0s)) {
                    regFlowExtras.A0g = c16l.A0d();
                } else if ("is_eligible_to_register".equals(A0s)) {
                    regFlowExtras.A0s = c16l.A0d();
                } else if ("is_supervised_user".equals(A0s)) {
                    regFlowExtras.A0v = c16l.A0d();
                } else if ("user_birth_date".equals(A0s)) {
                    regFlowExtras.A03 = AbstractC34296FAq.parseFromJson(c16l);
                } else if ("existing_account_dialog_shown".equals(A0s)) {
                    regFlowExtras.A0k = c16l.A0d();
                } else if ("is_simple_sac_enabled".equals(A0s)) {
                    regFlowExtras.A0u = c16l.A0d();
                } else if ("last_logged_in_user_id".equals(A0s)) {
                    regFlowExtras.A0J = AbstractC167017dG.A0m(c16l);
                } else if ("last_logged_in_username".equals(A0s)) {
                    regFlowExtras.A0M = AbstractC167017dG.A0m(c16l);
                } else if ("fb_access_token".equals(A0s)) {
                    regFlowExtras.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("is_cal_flow".equals(A0s)) {
                    regFlowExtras.A0r = c16l.A0d();
                } else if ("force_signup_with_fb_after_cp_claiming".equals(A0s)) {
                    regFlowExtras.A0m = c16l.A0d();
                } else if ("vpc_link".equals(A0s)) {
                    regFlowExtras.A0b = AbstractC167017dG.A0m(c16l);
                } else if ("vpc_token".equals(A0s)) {
                    regFlowExtras.A0d = AbstractC167017dG.A0m(c16l);
                } else if ("vpc_status".equals(A0s)) {
                    regFlowExtras.A0c = AbstractC167017dG.A0m(c16l);
                } else if ("vpc_invite_id".equals(A0s)) {
                    regFlowExtras.A0a = AbstractC167017dG.A0m(c16l);
                } else if ("last_logged_in_user_auth_header".equals(A0s)) {
                    regFlowExtras.A0H = AbstractC167017dG.A0m(c16l);
                } else if ("last_logged_in_user_access_token".equals(A0s)) {
                    regFlowExtras.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("sac_cal_flow".equals(A0s)) {
                    regFlowExtras.A0t = c16l.A0d();
                } else if ("sac_cal_user_consent_accepted".equals(A0s)) {
                    regFlowExtras.A0y = c16l.A0d();
                } else if ("last_logged_in_user_phone_number_with_country_code".equals(A0s)) {
                    regFlowExtras.A0K = AbstractC167017dG.A0m(c16l);
                } else if ("last_logged_in_user_phone_number_without_country_code".equals(A0s)) {
                    regFlowExtras.A0L = AbstractC167017dG.A0m(c16l);
                } else if ("last_logged_in_user_email".equals(A0s)) {
                    regFlowExtras.A0I = AbstractC167017dG.A0m(c16l);
                } else if ("should_link_to_main".equals(A0s)) {
                    regFlowExtras.A0z = c16l.A0d();
                } else if ("convert_to_group".equals(A0s)) {
                    regFlowExtras.A0i = c16l.A0d();
                } else if ("group_biography".equals(A0s)) {
                    regFlowExtras.A0E = AbstractC167017dG.A0m(c16l);
                } else if ("group_external_url".equals(A0s)) {
                    regFlowExtras.A0F = AbstractC167017dG.A0m(c16l);
                } else if ("group_should_be_private".equals(A0s)) {
                    regFlowExtras.A0o = c16l.A0d();
                } else if (AbstractC111324zv.A00(117).equals(A0s)) {
                    regFlowExtras.A0p = c16l.A0d();
                } else if ("create_group_thread".equals(A0s)) {
                    regFlowExtras.A0j = c16l.A0d();
                }
                c16l.A0z();
            }
            return regFlowExtras;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
