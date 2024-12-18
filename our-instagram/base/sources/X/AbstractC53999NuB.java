package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NuB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53999NuB {
    public static OEP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OEP oep = new OEP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(2622).equals(A0s)) {
                    oep.A05 = c16l.A0d();
                } else if ("is_user_safety_warning_required".equals(A0s)) {
                    c16l.A0d();
                } else if (AbstractC111324zv.A00(5550).equals(A0s)) {
                    oep.A06 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        oep.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("manifest_json".equals(A0s)) {
                        oep.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("packaged_file".equals(A0s)) {
                        oep.A00 = AbstractC53998NuA.parseFromJson(c16l);
                    } else if (AbstractC111324zv.A00(4062).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C54532O7k parseFromJson = AbstractC53995Nu6.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        oep.A03 = arrayList;
                    } else if (AbstractC111324zv.A00(4355).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                OAG parseFromJson2 = AbstractC53997Nu8.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        oep.A04 = arrayList;
                    }
                }
                c16l.A0z();
            }
            return oep;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
