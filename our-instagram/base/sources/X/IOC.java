package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IOC {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H90, X.1um, X.1ul] */
    public static H90 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C45136Jyc parseFromJson = AbstractC39725Hjv.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else if ("paging_info".equals(A0q)) {
                    c40791um.A01 = AbstractC111064zN.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            List list = c40791um.A02;
            C14360o3.A0A(list);
            C111074zO c111074zO = c40791um.A01;
            C14360o3.A0A(c111074zO);
            c40791um.A00 = new C45014Jw4(c111074zO, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}