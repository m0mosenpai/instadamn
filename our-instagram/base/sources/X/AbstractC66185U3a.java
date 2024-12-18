package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.U3a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66185U3a {
    public static C66186U3b parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C66186U3b c66186U3b = new C66186U3b();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c66186U3b.A01 = str;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c66186U3b.A02 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    c66186U3b.A00 = (EnumC68197VFp) EnumHelper.A00(c16l.A1Q(), EnumC68197VFp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }
                c16l.A0z();
            }
            return c66186U3b;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
