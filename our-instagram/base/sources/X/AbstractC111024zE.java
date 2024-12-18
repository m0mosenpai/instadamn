package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.4zE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC111024zE {
    public static C111034zF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38321qM c38321qM = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("media".equals(A0q)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (c38321qM == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("media", "ClipsItemDict");
                throw C00O.createAndThrow();
            }
            return new C111034zF(c38321qM, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C111034zF c111034zF) {
        anonymousClass182.A0d();
        C38321qM c38321qM = c111034zF.A00;
        if (c38321qM != null) {
            anonymousClass182.A0r("media");
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        Integer num = c111034zF.A01;
        if (num != null) {
            anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num.intValue());
        }
        anonymousClass182.A0a();
    }
}
