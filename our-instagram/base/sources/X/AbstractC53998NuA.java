package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NuA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53998NuA {
    public static OFA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OFA ofa = new OFA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(4740).equals(A0s)) {
                    ofa.A08 = c16l.A0d();
                } else if (AbstractC58317Pt9.A00(101).equals(A0s)) {
                    ofa.A00 = c16l.A1D();
                } else if ("uncompressed_filesize_bytes".equals(A0s)) {
                    ofa.A01 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("cache_key".equals(A0s)) {
                        ofa.A03 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        ofa.A04 = AbstractC167017dG.A0m(c16l);
                    } else if ("md5_hash".equals(A0s)) {
                        ofa.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("uri".equals(A0s)) {
                        ofa.A06 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(376).equals(A0s)) {
                        ofa.A02 = (EnumC53280NhI) EnumHelper.A00(c16l.A1Q(), EnumC53280NhI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    } else if (AbstractC111324zv.A00(4353).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                OBt parseFromJson = Nu9.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        ofa.A07 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return ofa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
