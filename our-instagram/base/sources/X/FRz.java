package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRz {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.EAq, X.1um, X.1ul] */
    public static C32143EAq parseFromJson(C16L c16l) {
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
                if ("active_bonus_deals".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51647Mre parseFromJson = AbstractC33669EuJ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else if ("available_bonus_deals".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            E7g parseFromJson2 = AbstractC33684EuY.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if ("inactive_bonus_deals".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51647Mre parseFromJson3 = AbstractC33669EuJ.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else if ("is_within_24hr_bonus_tagging_window".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A02;
            C14360o3.A0A(list);
            List list2 = c40791um.A03;
            C14360o3.A0A(list2);
            List list3 = c40791um.A04;
            C14360o3.A0A(list3);
            c40791um.A00 = new C51776Mug(c40791um.A01, list, list2, list3);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
