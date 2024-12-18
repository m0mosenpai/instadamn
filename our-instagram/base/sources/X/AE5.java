package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AE5 {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.A7X, java.lang.Object] */
    public static A7X parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Float f = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("centerX".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("centerY".equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (f != null) {
                obj.A00 = f.floatValue();
            }
            if (f2 != null) {
                obj.A01 = f2.floatValue();
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, A7X a7x) {
        anonymousClass182.A0d();
        anonymousClass182.A0P("centerX", a7x.A00);
        anonymousClass182.A0P("centerY", a7x.A01);
        anonymousClass182.A0a();
    }
}
