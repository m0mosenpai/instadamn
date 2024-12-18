package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.4kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102734kA {
    public static C103444lK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C914346k c914346k = null;
            Integer num = null;
            String str = null;
            Boolean bool = null;
            C39561sd c39561sd = null;
            C103434lJ c103434lJ = null;
            String str2 = null;
            String str3 = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("bloks_data".equals(A0q)) {
                    c914346k = IQ3.parseFromJson(c16l);
                } else if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_fullscreen".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("layout".equals(A0q)) {
                    c103434lJ = AbstractC102744kB.A00(c16l);
                } else if ("netego_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C103444lK(c39561sd, c103434lJ, c914346k, bool, num, num2, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
