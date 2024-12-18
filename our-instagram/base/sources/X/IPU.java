package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IPU {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9P, X.1um, X.1ul] */
    public static H9P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("formatted_incentive_match_for_account".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("formatted_total_amount_earned_by_account".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("media_insights".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51636MrT parseFromJson = AbstractC40439HwU.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("start_date".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0h(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A02;
            String str2 = c40791um.A03;
            C14360o3.A0A(str2);
            List list = c40791um.A04;
            C14360o3.A0A(list);
            c40791um.A00 = new C51602Mqu(c40791um.A01, str, str2, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
