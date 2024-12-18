package X;

import com.facebook.graphql.enums.EnumHelper;
import java.io.IOException;

/* renamed from: X.VTc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68497VTc {
    public static C69120ViA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69120ViA c69120ViA = new C69120ViA();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("length".equals(A0s)) {
                    c69120ViA.A00 = c16l.A1D();
                } else if ("offset".equals(A0s)) {
                    c69120ViA.A01 = c16l.A1D();
                } else if ("inline_style".equals(A0s)) {
                    c69120ViA.A02 = (EnumC72402Xcp) EnumHelper.A00(c16l.A1Q(), EnumC72402Xcp.A02);
                }
                c16l.A0z();
            }
            return c69120ViA;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
