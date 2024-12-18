package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.5Nw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116175Nw {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.50B] */
    public static C50B parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("di".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                } else if ("dt".equals(A0q)) {
                    obj.A02 = c16l.A1D();
                } else if ("dt_open".equals(A0q)) {
                    obj.A05 = Integer.valueOf(c16l.A1D());
                } else if ("dt_e2ee".equals(A0q)) {
                    obj.A04 = Integer.valueOf(c16l.A1D());
                } else if ("ac".equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else if ("ta_o".equals(A0q)) {
                    obj.A03 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C50B c50b) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        A0A.A0Q("di", c50b.A00);
        A0A.A0Q("dt", c50b.A02);
        Integer num = c50b.A05;
        if (num != null) {
            A0A.A0Q("dt_open", num.intValue());
        }
        Integer num2 = c50b.A04;
        if (num2 != null) {
            A0A.A0Q("dt_e2ee", num2.intValue());
        }
        A0A.A0Q("ac", c50b.A01);
        A0A.A0Q("ta_o", c50b.A03);
        A0A.A0a();
        A0A.close();
        return stringWriter.toString();
    }
}
