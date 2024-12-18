package X;

import java.io.IOException;

/* renamed from: X.52f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1117852f {
    public static C1117952g parseFromJson(C16L c16l) {
        String A01;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A01 = AbstractC37310GcC.A01(22, 8, 54);
                if (A1J == c16r) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_verified".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("profile_pic_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A01.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_verified", "CutoutStickerUserImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(A01, "CutoutStickerUserImpl");
            } else {
                return new C1117952g(bool.booleanValue(), str2, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C1117952g c1117952g) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("is_verified", c1117952g.A02);
        String str = c1117952g.A00;
        if (str != null) {
            anonymousClass182.A0S("profile_pic_url", str);
        }
        String str2 = c1117952g.A01;
        if (str2 != null) {
            anonymousClass182.A0S(AbstractC37310GcC.A01(22, 8, 54), str2);
        }
        anonymousClass182.A0a();
    }
}
