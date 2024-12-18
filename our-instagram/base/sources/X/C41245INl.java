package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.INl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41245INl {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9L, X.1um, X.1ul] */
    public static H9L parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_duration_warning_threshold".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0h(c16l);
                } else {
                    ArrayList arrayList = null;
                    if ("optimized_daily_budget_options".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                Integer A0h = AbstractC166997dE.A0h(c16l);
                                if (A0h != null) {
                                    arrayList.add(A0h);
                                }
                            }
                        }
                        c40791um.A03 = arrayList;
                    } else if ("override_budget_minimum".equals(A0s)) {
                        c40791um.A02 = AbstractC166997dE.A0h(c16l);
                    } else if ("recommended_budgets".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                H2T parseFromJson = AbstractC39784Hku.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A04 = arrayList;
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            c40791um.A00 = new C66631UQh(c40791um.A01, c40791um.A02, c40791um.A03, c40791um.A04);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
