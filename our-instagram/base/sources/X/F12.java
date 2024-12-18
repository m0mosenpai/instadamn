package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F12 {
    public static C35023Fbw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35023Fbw c35023Fbw = new C35023Fbw();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("is_answered".equals(A0s)) {
                    c35023Fbw.A05 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC111324zv.A00(473).equals(A0s)) {
                        c35023Fbw.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("qp_id".equals(A0s)) {
                        c35023Fbw.A02 = AbstractC167017dG.A0m(c16l);
                    } else if ("questions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                FRG parseFromJson = F11.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c35023Fbw.A04 = arrayList;
                    } else if ("tessa_survey_config_id".equals(A0s)) {
                        c35023Fbw.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("extra_data_token".equals(A0s)) {
                        c35023Fbw.A00 = AbstractC167017dG.A0m(c16l);
                    }
                }
                c16l.A0z();
            }
            return c35023Fbw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
