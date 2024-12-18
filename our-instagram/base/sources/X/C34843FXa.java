package X;

import java.io.IOException;

/* renamed from: X.FXa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34843FXa {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.EC6, X.1um, X.1ul] */
    public static EC6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("purchase_protection_info".equals(A0s)) {
                    C34524FJk parseFromJson = AbstractC34307FBb.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c40791um.A00 = parseFromJson;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
