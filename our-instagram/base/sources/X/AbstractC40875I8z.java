package X;

import java.io.IOException;

/* renamed from: X.I8z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40875I8z {
    public static C38687GzS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38687GzS c38687GzS = new C38687GzS(19);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thumbnail_url".equals(A0s)) {
                    c38687GzS.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("thumbnail_icon_type".equals(A0s)) {
                    EnumC39568Hde enumC39568Hde = (EnumC39568Hde) EnumC39568Hde.A01.get(AbstractC167017dG.A0m(c16l));
                    if (enumC39568Hde == null) {
                        enumC39568Hde = EnumC39568Hde.A06;
                    }
                    c38687GzS.A00 = enumC39568Hde;
                }
                c16l.A0z();
            }
            return c38687GzS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
