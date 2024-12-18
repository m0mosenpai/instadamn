package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.488, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass488 {
    public static String A00(C9B9 c9b9) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        A0A.A0Q("sequence_number", c9b9.A01);
        A0A.A0Q("impression_count", c9b9.A00);
        A0A.A0T("has_synced_with_server", c9b9.A04);
        A0A.A0Q("last_impression_time_sec", c9b9.A03);
        A0A.A0a();
        A0A.close();
        return stringWriter.toString();
    }

    public static C9B9 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Boolean bool = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("sequence_number".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("impression_count".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("has_synced_with_server".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("last_impression_time_sec".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("sequence_number", "CXPNoticeState");
            } else if (num2 != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("has_synced_with_server", "CXPNoticeState");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("last_impression_time_sec", "CXPNoticeState");
                } else {
                    return new C9B9(bool.booleanValue(), num2.intValue(), num.intValue(), num3.intValue(), 0);
                }
            } else {
                ((C07950bF) c16l).A03.A00("impression_count", "CXPNoticeState");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
