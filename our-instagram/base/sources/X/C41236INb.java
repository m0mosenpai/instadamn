package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.INb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41236INb {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H8u, X.1um, X.1ul] */
    public static C38846H8u parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fundraisers".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H5H parseFromJson = AbstractC40260HtQ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else if ("total_count".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0h(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A02;
            C14360o3.A0A(list);
            Integer num = c40791um.A01;
            C14360o3.A0A(num);
            c40791um.A00 = new C81723kh(list, num.intValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}