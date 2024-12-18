package X;

import java.io.IOException;

/* renamed from: X.Jfg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44177Jfg {
    public static C44178Jfh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("shortcut".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("uuid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("label".equals(A0q)) {
                    num = AbstractC47853LBw.A01(c16l.A1D());
                }
                c16l.A0z();
            }
            C44178Jfh c44178Jfh = new C44178Jfh();
            if (str != null) {
                c44178Jfh.A03 = str;
            }
            if (str2 != null) {
                c44178Jfh.A02 = str2;
            }
            if (str3 != null) {
                c44178Jfh.A01 = str3;
            }
            if (num != null) {
                c44178Jfh.A00 = num;
            }
            return c44178Jfh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
