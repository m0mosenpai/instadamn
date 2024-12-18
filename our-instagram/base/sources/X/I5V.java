package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I5V {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.IJy] */
    public static C41159IJy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("timestamp".equals(A0s)) {
                    obj.A01 = c16l.A0y();
                } else if (AbstractC37300Gc1.A1J(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("quiz_id".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("answer".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if (AbstractC43591JPw.A00(51).equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC43591JPw.A00(83).equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_session_id".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
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
