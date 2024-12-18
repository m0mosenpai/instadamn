package X;

import java.io.IOException;

/* renamed from: X.VSo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68483VSo {
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.VbW] */
    public static C68753VbW parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A00 = A1P;
                } else {
                    if (AbstractC43591JPw.A00(394).equals(A0s)) {
                        String A1Q = c16l.A1Q();
                        C14360o3.A0B(A1Q, 0);
                        for (Integer num : C05F.A00(2)) {
                            if (1 - num.intValue() != 0) {
                                A00 = "circle";
                            } else {
                                A00 = AbstractC58317Pt9.A00(134);
                            }
                            if (!A00.equals(A1Q)) {
                            }
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    continue;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
