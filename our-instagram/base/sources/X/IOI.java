package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IOI {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.H9N, X.1um, X.1ul] */
    public static H9N parseFromJson(C16L c16l) {
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
                if ("beats".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51775Muf parseFromJson = C9x5.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if (AbstractC111324zv.A00(3218).equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("track_start_time_ms".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("trimmed_results".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H5F parseFromJson2 = AbstractC40254HtK.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c40791um.A04 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A03;
            C14360o3.A0A(list);
            String str = c40791um.A02;
            Integer num = c40791um.A01;
            C14360o3.A0A(num);
            int intValue = num.intValue();
            List list2 = c40791um.A04;
            C14360o3.A0A(list2);
            c40791um.A00 = new C51601Mqt(str, list, list2, intValue);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
