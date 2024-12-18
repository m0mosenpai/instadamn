package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LAd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47821LAd {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.K82, X.1um, X.1ul] */
    public static K82 parseFromJson(C16L c16l) {
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
                if ("next_cursor".equals(A0s)) {
                    c40791um.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("reaction_details".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C45127Jxw parseFromJson = AbstractC46585KjO.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A02 = arrayList;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A01;
            List list = c40791um.A02;
            C14360o3.A0A(list);
            c40791um.A00 = new C45012Jw2(str, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
