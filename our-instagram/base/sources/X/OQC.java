package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class OQC {
    public static C51730MtA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51730MtA c51730MtA = new C51730MtA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_id".equals(A0s)) {
                    c51730MtA.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("merchant_id".equals(A0s)) {
                    c51730MtA.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("confidence_level".equals(A0s)) {
                    c51730MtA.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return c51730MtA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C51730MtA c51730MtA, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c51730MtA.A02;
        if (str != null) {
            anonymousClass182.A0S("product_id", str);
        }
        String str2 = c51730MtA.A01;
        if (str2 != null) {
            anonymousClass182.A0S("merchant_id", str2);
        }
        anonymousClass182.A0P("confidence_level", c51730MtA.A00);
        anonymousClass182.A0a();
    }
}
