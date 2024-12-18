package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.5J0, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5J0 {
    public static C5J1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            Long l2 = null;
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("duration_in_ms".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("index".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("start_time_in_ms".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("duration_in_ms", "ClipsTemplateTransitionEffectInfoImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (l2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("start_time_in_ms", "ClipsTemplateTransitionEffectInfoImpl");
                } else {
                    return new C5J1(num, str, l.longValue(), l2.longValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "ClipsTemplateTransitionEffectInfoImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
