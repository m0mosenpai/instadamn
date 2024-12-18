package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.1p8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC37711p8 {
    public static C37731pA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C37731pA c37731pA = new C37731pA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("reel".equals(A0q)) {
                    C37771pE parseFromJson = AbstractC38741r6.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c37731pA.A01 = parseFromJson;
                } else if ("delivered_at".equals(A0q)) {
                    c37731pA.A00 = c16l.A0y();
                } else {
                    String str = null;
                    if (TraceFieldType.RequestID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c37731pA.A02 = str;
                    } else if ("request_uuid".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        C14360o3.A0B(str, 0);
                        c37731pA.A03 = str;
                    }
                }
                c16l.A0z();
            }
            return c37731pA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
