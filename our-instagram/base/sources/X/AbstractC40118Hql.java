package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Hql, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40118Hql {
    public static C38640Gyh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Integer num = null;
            String str = null;
            C39561sd c39561sd = null;
            C9C4 c9c4 = null;
            String str2 = null;
            Integer num2 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("enable_self_note".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("enable_show_more".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("global_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A0s)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A0s)) {
                    c9c4 = AbstractC125555m1.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1E(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "view_state_item_type");
                }
                c16l.A0z();
            }
            return new C38640Gyh(c9c4, c39561sd, bool, bool2, num, num2, num3, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
