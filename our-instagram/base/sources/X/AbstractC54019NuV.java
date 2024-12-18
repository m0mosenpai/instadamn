package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NuV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54019NuV {
    public static C54644OBv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54644OBv c54644OBv = new C54644OBv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("advertiser_privacy_policy_name".equals(A0s)) {
                    c54644OBv.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("disclaimer_title".equals(A0s)) {
                    c54644OBv.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("checkboxes".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C54643OBu parseFromJson = AbstractC54015NuR.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c54644OBv.A02 = arrayList;
                } else if ("disclaimer_body".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C54542O7u parseFromJson2 = AbstractC54018NuU.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c54644OBv.A03 = arrayList;
                }
                c16l.A0z();
            }
            return c54644OBv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
