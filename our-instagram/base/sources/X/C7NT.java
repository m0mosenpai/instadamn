package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.IOException;

/* renamed from: X.7NT, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7NT {
    public static PendingRecipient parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            PendingRecipient pendingRecipient = new PendingRecipient();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if (!CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q) && !"pk".equals(A0q) && !PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (AbstractC31188DnX.A02(19, 8, 12).equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        pendingRecipient.A0C = str;
                    } else if ("full_name".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        pendingRecipient.A0A = str;
                    } else if (!"profilepic_url".equals(A0q) && !"profile_pic_url".equals(A0q)) {
                        if ("is_verified".equals(A0q)) {
                            pendingRecipient.A0b = c16l.A0d();
                        } else if ("is_restricted".equals(A0q)) {
                            pendingRecipient.A0Z = c16l.A0d();
                        } else if ("is_blocking".equals(A0q)) {
                            pendingRecipient.A0J = c16l.A0d();
                        } else if ("is_group_creation_reachable".equals(A0q)) {
                            pendingRecipient.A0P = c16l.A0d();
                        } else if ("is_messaging_blocking".equals(A0q)) {
                            pendingRecipient.A0V = c16l.A0d();
                        } else if ("is_messaging_pseudo_blocking".equals(A0q)) {
                            pendingRecipient.A0W = c16l.A0d();
                        } else if ("reachability_status".equals(A0q)) {
                            pendingRecipient.A07 = Integer.valueOf(c16l.A1D());
                        } else if ("is_unavailable".equals(A0q)) {
                            pendingRecipient.A0a = c16l.A0d();
                        } else if ("is_using_unified_inbox_for_direct".equals(A0q)) {
                            pendingRecipient.A05 = Boolean.valueOf(c16l.A0d());
                        } else if ("is_business".equals(A0q)) {
                            pendingRecipient.A0K = c16l.A0d();
                        } else if ("is_connected".equals(A0q)) {
                            pendingRecipient.A0L = c16l.A0d();
                        } else if ("interop_user_type".equals(A0q)) {
                            pendingRecipient.A01 = c16l.A1D();
                        } else if ("is_facebook_friend_with_current_user".equals(A0q)) {
                            pendingRecipient.A0N = c16l.A0d();
                        } else if ("is_interop_eligible".equals(A0q)) {
                            pendingRecipient.A0U = c16l.A0c();
                        } else if ("context_line".equals(A0q)) {
                            if (c16l.A11() == C16R.A0J) {
                                str = c16l.A1P();
                            }
                            pendingRecipient.A09 = str;
                        } else if ("interop_messaging_user_id".equals(A0q)) {
                            pendingRecipient.A08 = Long.valueOf(c16l.A0y());
                        } else if ("restriction_type".equals(A0q)) {
                            pendingRecipient.A02 = c16l.A1D();
                        } else if ("is_groups_xac_eligible".equals(A0q)) {
                            pendingRecipient.A0S = c16l.A0d();
                        } else if ("is_group_xac_calling_eligible".equals(A0q)) {
                            pendingRecipient.A0R = c16l.A0d();
                        } else if ("wa_addressable".equals(A0q)) {
                            pendingRecipient.A0d = c16l.A0d();
                        } else if ("wa_eligibility".equals(A0q)) {
                            pendingRecipient.A00 = c16l.A1D();
                        } else if ("is_following_viewer".equals(A0q)) {
                            pendingRecipient.A0O = c16l.A0d();
                        } else if ("account_type".equals(A0q)) {
                            pendingRecipient.A06 = Integer.valueOf(c16l.A1D());
                        } else if ("is_group_profile".equals(A0q)) {
                            pendingRecipient.A0Q = c16l.A0d();
                        } else if ("is_armadillo_message_request_eligible".equals(A0q)) {
                            pendingRecipient.A0I = c16l.A0d();
                        } else if ("is_viewer_unconnected".equals(A0q)) {
                            pendingRecipient.A0c = c16l.A0d();
                        } else if ("supports_e2ee_spamd_storage".equals(A0q)) {
                            pendingRecipient.A0e = c16l.A0d();
                        } else if ("has_cutover_thread".equals(A0q)) {
                            pendingRecipient.A0G = c16l.A0d();
                        } else if ("default_e2ee_thread".equals(A0q)) {
                            pendingRecipient.A0D = c16l.A0d();
                        } else if ("default_e2ee_thread_one_to_one".equals(A0q)) {
                            pendingRecipient.A0E = c16l.A0d();
                        } else if ("is_ai_agent".equals(A0q)) {
                            pendingRecipient.A0H = c16l.A0d();
                        } else if ("is_opal".equals(A0q)) {
                            pendingRecipient.A0Y = c16l.A0d();
                        } else if ("has_ai_embodiment".equals(A0q)) {
                            pendingRecipient.A0F = c16l.A0d();
                        } else if ("is_meta_ai_bot".equals(A0q)) {
                            pendingRecipient.A0X = c16l.A0d();
                        } else if ("is_creator_agent_enabled".equals(A0q)) {
                            pendingRecipient.A0M = c16l.A0d();
                        } else if ("is_high_risk_sharesheet_recipient".equals(A0q)) {
                            pendingRecipient.A0T = c16l.A0d();
                        }
                    } else {
                        SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                        C14360o3.A0B(A00, 0);
                        pendingRecipient.A03 = A00;
                    }
                } else {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    pendingRecipient.A0B = str;
                }
                c16l.A0z();
            }
            return pendingRecipient;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, PendingRecipient pendingRecipient) {
        anonymousClass182.A0d();
        String str = pendingRecipient.A0B;
        if (str != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        }
        anonymousClass182.A0S(AbstractC31188DnX.A02(19, 8, 12), pendingRecipient.A0C);
        anonymousClass182.A0S("full_name", pendingRecipient.A0A);
        anonymousClass182.A0r("profilepic_url");
        AbstractC222616c.A01(anonymousClass182, pendingRecipient.A03);
        anonymousClass182.A0T("is_verified", pendingRecipient.A0b);
        anonymousClass182.A0T("is_restricted", pendingRecipient.A0Z);
        anonymousClass182.A0T("is_blocking", pendingRecipient.A0J);
        anonymousClass182.A0T("is_group_creation_reachable", pendingRecipient.A0P);
        anonymousClass182.A0T("is_messaging_blocking", pendingRecipient.A0V);
        anonymousClass182.A0T("is_messaging_pseudo_blocking", pendingRecipient.A0W);
        Integer num = pendingRecipient.A07;
        if (num != null) {
            anonymousClass182.A0Q("reachability_status", num.intValue());
        }
        anonymousClass182.A0T("is_unavailable", pendingRecipient.A0a);
        Boolean bool = pendingRecipient.A05;
        if (bool != null) {
            anonymousClass182.A0T("is_using_unified_inbox_for_direct", bool.booleanValue());
        }
        anonymousClass182.A0T("is_business", pendingRecipient.A0K);
        anonymousClass182.A0T("is_connected", pendingRecipient.A0L);
        anonymousClass182.A0Q("interop_user_type", pendingRecipient.A01);
        anonymousClass182.A0T("is_facebook_friend_with_current_user", pendingRecipient.A0N);
        anonymousClass182.A0T("is_interop_eligible", pendingRecipient.A0U);
        String str2 = pendingRecipient.A09;
        if (str2 != null) {
            anonymousClass182.A0S("context_line", str2);
        }
        Long l = pendingRecipient.A08;
        if (l != null) {
            anonymousClass182.A0R("interop_messaging_user_id", l.longValue());
        }
        anonymousClass182.A0Q("restriction_type", pendingRecipient.A02);
        anonymousClass182.A0T("is_groups_xac_eligible", pendingRecipient.A0S);
        anonymousClass182.A0T("is_group_xac_calling_eligible", pendingRecipient.A0R);
        anonymousClass182.A0T("wa_addressable", pendingRecipient.A0d);
        anonymousClass182.A0Q("wa_eligibility", pendingRecipient.A00);
        anonymousClass182.A0T("is_following_viewer", pendingRecipient.A0O);
        Integer num2 = pendingRecipient.A06;
        if (num2 != null) {
            anonymousClass182.A0Q("account_type", num2.intValue());
        }
        anonymousClass182.A0T("is_group_profile", pendingRecipient.A0Q);
        anonymousClass182.A0T("is_armadillo_message_request_eligible", pendingRecipient.A0I);
        anonymousClass182.A0T("is_viewer_unconnected", pendingRecipient.A0c);
        anonymousClass182.A0T("supports_e2ee_spamd_storage", pendingRecipient.A0e);
        anonymousClass182.A0T("has_cutover_thread", pendingRecipient.A0G);
        anonymousClass182.A0T("default_e2ee_thread", pendingRecipient.A0D);
        anonymousClass182.A0T("default_e2ee_thread_one_to_one", pendingRecipient.A0E);
        anonymousClass182.A0T("is_ai_agent", pendingRecipient.A0H);
        anonymousClass182.A0T("is_opal", pendingRecipient.A0Y);
        anonymousClass182.A0T("has_ai_embodiment", pendingRecipient.A0F);
        anonymousClass182.A0T("is_meta_ai_bot", pendingRecipient.A0X);
        anonymousClass182.A0T("is_creator_agent_enabled", pendingRecipient.A0M);
        anonymousClass182.A0T("is_high_risk_sharesheet_recipient", pendingRecipient.A0T);
        anonymousClass182.A0a();
    }
}
