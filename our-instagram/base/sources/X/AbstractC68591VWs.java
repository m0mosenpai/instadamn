package X;

import java.io.IOException;

/* renamed from: X.VWs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68591VWs {
    public static C70865WiV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C70865WiV c70865WiV = new C70865WiV();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bounds_padding_for_underline".equals(A0s)) {
                    c70865WiV.A00 = c16l.A1D();
                } else if ("hashtag".equals(A0s)) {
                    c70865WiV.A01 = AbstractC109614wn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c70865WiV;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
