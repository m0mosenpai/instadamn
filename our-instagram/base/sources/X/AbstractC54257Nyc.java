package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Nyc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54257Nyc {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.O90] */
    public static O90 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    HashMap hashMap = null;
                    if ("resource_type".equals(A0s)) {
                        obj.A00 = AbstractC167017dG.A0m(c16l);
                    } else if ("resource_data".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        }
                        obj.A01 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
