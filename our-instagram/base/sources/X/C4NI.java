package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4NI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NI {
    public static C4NJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C4NJ c4nj = new C4NJ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("creative".equals(A0q)) {
                    C4NM parseFromJson = C4NR.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c4nj.A08 = parseFromJson;
                } else if ("template".equals(A0q)) {
                    C4NP parseFromJson2 = C4NW.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c4nj.A09 = parseFromJson2;
                } else {
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    ArrayList arrayList = null;
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        c4nj.A0C = str2;
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        C14360o3.A0B(str3, 0);
                        c4nj.A0E = str3;
                    } else if ("promotion_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        C14360o3.A0B(str4, 0);
                        c4nj.A0D = str4;
                    } else if ("end_time".equals(A0q)) {
                        c4nj.A02 = c16l.A0y();
                    } else if ("max_impressions".equals(A0q)) {
                        c4nj.A00 = c16l.A1D();
                    } else if ("is_server_force_pass".equals(A0q)) {
                        c4nj.A0J = c16l.A0d();
                    } else if ("disable_logging_to_qp_tables".equals(A0q)) {
                        c4nj.A0M = c16l.A0d();
                    } else if ("local_state".equals(A0q)) {
                        C4NQ parseFromJson3 = C4NX.parseFromJson(c16l);
                        C14360o3.A0B(parseFromJson3, 0);
                        c4nj.A0A = parseFromJson3;
                    } else if ("priority".equals(A0q)) {
                        c4nj.A01 = c16l.A1D();
                    } else if ("surface".equals(A0q)) {
                        QuickPromotionSurface quickPromotionSurface = (QuickPromotionSurface) QuickPromotionSurface.A02.get(Integer.valueOf(c16l.A1D()));
                        C14360o3.A0B(quickPromotionSurface, 0);
                        c4nj.A06 = quickPromotionSurface;
                    } else if ("triggers".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Trigger A00 = AbstractC55742hF.A00(c16l.A1Q());
                                if (A00 != null) {
                                    arrayList.add(A00);
                                }
                            }
                        }
                        c4nj.A0F = arrayList;
                    } else if ("logging_data".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c4nj.A0B = str;
                    } else if ("log_eligibility_waterfall".equals(A0q)) {
                        c4nj.A0L = c16l.A0d();
                    } else if ("contextual_filters".equals(A0q)) {
                        c4nj.A07 = C4NY.parseFromJson(c16l);
                    } else if ("is_holdout".equals(A0q)) {
                        c4nj.A0I = c16l.A0d();
                    } else if ("client_side_dry_run".equals(A0q)) {
                        c4nj.A0G = c16l.A0d();
                    } else if ("fetch_time_epoch".equals(A0q)) {
                        c4nj.A03 = c16l.A0y();
                    } else {
                        C55702hA.A01(c16l, c4nj, A0q);
                    }
                }
                c16l.A0z();
            }
            return c4nj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4NJ c4nj) {
        anonymousClass182.A0d();
        anonymousClass182.A0r("creative");
        C4NR.A00(anonymousClass182, c4nj.A08);
        anonymousClass182.A0r("template");
        C4NW.A00(anonymousClass182, c4nj.A09);
        String str = c4nj.A0C;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c4nj.A0E);
        anonymousClass182.A0S("promotion_id", c4nj.A0D);
        anonymousClass182.A0R("end_time", c4nj.A02);
        anonymousClass182.A0Q("max_impressions", c4nj.A00);
        anonymousClass182.A0T("is_server_force_pass", c4nj.A0J);
        anonymousClass182.A0T("disable_logging_to_qp_tables", c4nj.A0M);
        anonymousClass182.A0r("local_state");
        C4NX.A00(anonymousClass182, c4nj.A0A);
        anonymousClass182.A0Q("priority", c4nj.A01);
        anonymousClass182.A0Q("surface", c4nj.A06.A00);
        if (c4nj.A0F != null) {
            C16V.A03(anonymousClass182, "triggers");
            for (Trigger trigger : c4nj.A0F) {
                if (trigger != null) {
                    anonymousClass182.A0u(trigger.A01);
                }
            }
            anonymousClass182.A0Z();
        }
        String str2 = c4nj.A0B;
        if (str2 != null) {
            anonymousClass182.A0S("logging_data", str2);
        }
        anonymousClass182.A0T("log_eligibility_waterfall", c4nj.A0L);
        if (c4nj.A07 != null) {
            anonymousClass182.A0r("contextual_filters");
            C4NY.A00(anonymousClass182, c4nj.A07);
        }
        anonymousClass182.A0T("is_holdout", c4nj.A0I);
        anonymousClass182.A0T("client_side_dry_run", c4nj.A0G);
        anonymousClass182.A0R("fetch_time_epoch", c4nj.A03);
        C55702hA.A00(anonymousClass182, c4nj);
        anonymousClass182.A0a();
    }
}
