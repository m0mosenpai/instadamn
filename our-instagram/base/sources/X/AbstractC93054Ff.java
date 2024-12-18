package X;

import java.io.IOException;

/* renamed from: X.4Ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93054Ff {
    public static C93064Fg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("hex_rgba_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("count", "ClipsTextColor");
            } else if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("hex_rgba_color", "ClipsTextColor");
            } else {
                return new C93064Fg(num.intValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
