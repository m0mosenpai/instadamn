package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hyb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40555Hyb {
    public static IKS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            IKS iks = new IKS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("ad_id".equals(A0s)) {
                    iks.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("is_demo".equals(A0s)) {
                    iks.A01 = AbstractC166997dE.A0d(c16l);
                } else if ("learn_more".equals(A0s)) {
                    iks.A00 = AbstractC40557Hyd.parseFromJson(c16l);
                } else if ("primer_message".equals(A0s)) {
                    iks.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("questions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C41120IIl parseFromJson = AbstractC40558Hye.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    iks.A09 = arrayList;
                } else if ("show_primer".equals(A0s)) {
                    iks.A02 = AbstractC166997dE.A0d(c16l);
                } else if ("show_results".equals(A0s)) {
                    iks.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("survey_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    iks.A06 = A0m;
                } else if ("survey_type".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    iks.A07 = A0m2;
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    iks.A08 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return iks;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
