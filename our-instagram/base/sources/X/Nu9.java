package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public abstract class Nu9 {
    public static OBt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OBt oBt = new OBt();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("__typename".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("cache_key".equals(A0s)) {
                        oBt.A00 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        oBt.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("md5_hash".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("uri".equals(A0s)) {
                        oBt.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(376).equals(A0s)) {
                        EnumHelper.A00(c16l.A1Q(), EnumC53280NhI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if ("string_identifiers".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        oBt.A03 = arrayList;
                    }
                    c16l.A0z();
                }
            }
            return oBt;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
