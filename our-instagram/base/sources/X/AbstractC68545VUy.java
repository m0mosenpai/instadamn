package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.VUy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68545VUy {
    public static C69235Vk3 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69235Vk3 c69235Vk3 = new C69235Vk3();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bitmap_name".equals(A0s)) {
                    c69235Vk3.A01 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c69235Vk3.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("tag".equals(A0s)) {
                    c69235Vk3.A03 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    c69235Vk3.A00 = (VF0) EnumHelper.A00(c16l.A1Q(), VF0.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                c16l.A0z();
            }
            return c69235Vk3;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
