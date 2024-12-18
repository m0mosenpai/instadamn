package X;

import java.io.IOException;

/* renamed from: X.F0p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34036F0p {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.FNM, java.lang.Object] */
    public static FNM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("url".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("lock".equals(A0s)) {
                    obj.A05 = c16l.A0d();
                } else if ("api_path".equals(A0s)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(2450).equals(A0s)) {
                    obj.A03 = c16l.A0d();
                } else if ("challenge_context".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(2602).equals(A0s)) {
                    obj.A04 = c16l.A0d();
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
