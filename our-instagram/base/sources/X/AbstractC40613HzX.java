package X;

import java.io.IOException;

/* renamed from: X.HzX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40613HzX {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.IIp, java.lang.Object] */
    public static C41124IIp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1D(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A03 = A0m;
                } else if ("link_text".equals(A0q)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("link".equals(A0q)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("icon_style".equals(A0q)) {
                    obj.A00 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            String str = obj.A00;
            if (str != null) {
                EnumC39615HeP.A01.get(str);
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
