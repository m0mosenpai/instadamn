package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68542VUv {
    public static C69003Vff parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69003Vff c69003Vff = new C69003Vff();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    c69003Vff.A00 = (EnumC68181VEz) EnumHelper.A00(c16l.A1Q(), EnumC68181VEz.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("parameters".equals(A0s)) {
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
                    c69003Vff.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c69003Vff;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
