package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I4o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40760I4o {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.IKY] */
    public static IKY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("pageName".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A05 = A0m;
                } else if ("businessCategories".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    obj.A09 = arrayList;
                } else if ("pageDescription".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("phoneNumber".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("location".equals(A0s)) {
                    obj.A01 = FA1.parseFromJson(c16l);
                } else if ("websiteUrl".equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("profilePicUrl".equals(A0s)) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                } else if ("pageFanCountNum".equals(A0s)) {
                    obj.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("pageFanCount".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A04 = A0m2;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
