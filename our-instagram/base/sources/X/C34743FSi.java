package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FSi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34743FSi {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.EAo, X.1um, X.1ul] */
    public static C32141EAo parseFromJson(C16L c16l) {
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
                if (AbstractC111324zv.A00(950).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            E82 parseFromJson = AbstractC33730EvI.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else if ("member_count".equals(A0s)) {
                    c40791um.A01 = AbstractC166997dE.A0h(c16l);
                } else if ("social_context_members".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c40791um.A03 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A02;
            C14360o3.A0A(list);
            Integer num = c40791um.A01;
            C14360o3.A0A(num);
            int intValue = num.intValue();
            List list2 = c40791um.A03;
            C14360o3.A0A(list2);
            c40791um.A00 = new E83(list, list2, intValue);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
