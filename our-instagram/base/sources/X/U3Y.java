package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class U3Y {
    public static U3Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            U3Z u3z = new U3Z();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    u3z.A00 = (EnumC68180VEy) EnumHelper.A00(c16l.A1Q(), EnumC68180VEy.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("parameters".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C66186U3b parseFromJson = AbstractC66185U3a.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    u3z.A01 = arrayList;
                }
                c16l.A0z();
            }
            return u3z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
