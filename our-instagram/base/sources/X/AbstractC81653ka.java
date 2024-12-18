package X;

import java.io.IOException;

/* renamed from: X.3ka, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81653ka {
    public static C9BO parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BO c9bo = new C9BO(7);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("nudge_type".equals(A0q)) {
                    c9bo.A00 = c16l.A1D();
                } else if ("create_time".equals(A0q)) {
                    c9bo.A01 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return c9bo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C9BO c9bo, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("nudge_type", c9bo.A00);
        Number number = (Number) c9bo.A01;
        if (number != null) {
            anonymousClass182.A0R("create_time", number.longValue());
        }
        anonymousClass182.A0a();
    }
}
