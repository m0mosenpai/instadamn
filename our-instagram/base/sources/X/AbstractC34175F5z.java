package X;

import java.io.IOException;

/* renamed from: X.F5z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34175F5z {
    public static C29221az parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29221az c29221az = new C29221az();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c29221az.A01 = AbstractC31172DnG.A0o(c16l);
                } else if ("clip".equals(A0q)) {
                    C1575375n parseFromJson = IQG.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c29221az.A00 = parseFromJson;
                } else {
                    AbstractC47856LCb.A01(c16l, c29221az, A0q);
                }
                c16l.A0z();
            }
            return c29221az;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
