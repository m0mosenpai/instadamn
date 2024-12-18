package X;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I0R {
    public static C41155IJu parseFromJson(C16L c16l) {
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            C41155IJu c41155IJu = new C41155IJu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("survey_id".equals(A0s)) {
                    c41155IJu.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("survey_type".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    c41155IJu.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("primer_message".equals(A0s)) {
                    c41155IJu.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("questions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C41128IIt parseFromJson = I0Q.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c41155IJu.A04 = arrayList;
                } else if ("is_demo".equals(A0s)) {
                    c16l.A0d();
                } else if ("show_primer".equals(A0s)) {
                    c41155IJu.A05 = c16l.A0d();
                } else if ("show_results".equals(A0s)) {
                    c41155IJu.A06 = c16l.A0d();
                }
                c16l.A0z();
            }
            if (TextUtils.isEmpty(c41155IJu.A03)) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            c41155IJu.A00 = num;
            return c41155IJu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
