package X;

import java.io.IOException;

/* renamed from: X.I8f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40855I8f {
    public static C51759Mti parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C51759Mti c51759Mti = new C51759Mti(14);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thumbnail_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumC39577Hdn enumC39577Hdn = (EnumC39577Hdn) EnumC39577Hdn.A01.get(A1P);
                    if (enumC39577Hdn == null) {
                        enumC39577Hdn = EnumC39577Hdn.A09;
                    }
                    c51759Mti.A01 = enumC39577Hdn;
                } else if ("thumbnail".equals(A0s)) {
                    C38687GzS parseFromJson = AbstractC40875I8z.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c51759Mti.A00 = parseFromJson;
                }
                c16l.A0z();
            }
            return c51759Mti;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
