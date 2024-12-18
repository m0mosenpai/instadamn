package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.KoN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46880KoN {
    public static JTa parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            L1W l1w = null;
            Boolean bool6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_sampled_for_e2e_logging".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_in_shh_mode".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("send_silently".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_moment".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("hide_future_requests".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("mutation_attribution".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("power_up_data".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("ad_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("ephemerality_params".equals(A0s)) {
                    l1w = AbstractC46832KnR.parseFromJson(c16l);
                } else {
                    bool6 = AbstractC37303Gc4.A0K(c16l, bool6, A0s, "should_xpost");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "DirectMutationBasicInfo");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_in_shh_mode", c16l, "DirectMutationBasicInfo");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("send_silently", c16l, "DirectMutationBasicInfo");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_moment", c16l, "DirectMutationBasicInfo");
                } else if (bool5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("hide_future_requests", c16l, "DirectMutationBasicInfo");
                } else {
                    return new JTa(l1w, bool6, str, str2, str3, str4, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("is_sampled_for_e2e_logging", c16l, "DirectMutationBasicInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
