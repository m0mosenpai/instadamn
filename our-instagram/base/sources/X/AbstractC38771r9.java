package X;

import java.io.IOException;

/* renamed from: X.1r9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38771r9 {
    public static C38781rA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("optimization_type".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("option_value".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C38781rA(num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38781rA c38781rA) {
        anonymousClass182.A0d();
        Integer num = c38781rA.A00;
        if (num != null) {
            anonymousClass182.A0Q("optimization_type", num.intValue());
        }
        Integer num2 = c38781rA.A01;
        if (num2 != null) {
            anonymousClass182.A0Q("option_value", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
