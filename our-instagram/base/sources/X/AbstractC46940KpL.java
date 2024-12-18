package X;

import com.instagram.direct.model.DirectForwardingParams;
import java.io.IOException;

/* renamed from: X.KpL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46940KpL {
    public static C34411jf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34411jf c34411jf = new C34411jf();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("direct_message".equals(A0s)) {
                    C83403nh A00 = C83403nh.A00(c16l, null, false);
                    C14360o3.A0B(A00, 0);
                    c34411jf.A01 = A00;
                } else if ("direct_forwarding_params".equals(A0s)) {
                    DirectForwardingParams parseFromJson = FUT.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c34411jf.A00 = parseFromJson;
                } else if ("thread_key".equals(A0s)) {
                    c34411jf.A02 = AbstractC31172DnG.A0o(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c34411jf, A0s);
                }
                c16l.A0z();
            }
            return c34411jf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
