package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.HqG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40089HqG {
    public static C38601Gy4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                }
                c16l.A0z();
            }
            if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media", c16l, "MixedMediaItemDict");
                throw C00O.createAndThrow();
            }
            return new C38601Gy4(c38321qM, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
