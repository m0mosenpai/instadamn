package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.HqF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40088HqF {
    public static C38688GzT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C37471Gep c37471Gep = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38321qM c38321qM = null;
            H4O h4o = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_media".equals(A0s)) {
                    c37471Gep = AbstractC37470Geo.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("netego_media".equals(A0s)) {
                    h4o = AbstractC40104HqW.parseFromJson(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                }
                c16l.A0z();
            }
            return new C38688GzT(1, c37471Gep, h4o, num, c38321qM);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
