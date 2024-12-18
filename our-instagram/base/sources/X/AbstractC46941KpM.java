package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.model.DirectForwardingParams;
import java.io.IOException;

/* renamed from: X.KpM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46941KpM {
    public static C31481er parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31481er c31481er = new C31481er();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (TraceFieldType.ContentType.equals(A0s)) {
                    C2EY A00 = C2EY.A0A.A00(c16l.A1P());
                    C14360o3.A0B(A00, 0);
                    c31481er.A03 = A00;
                } else if ("thread_key".equals(A0s)) {
                    c31481er.A02 = AbstractC31172DnG.A0o(c16l);
                } else if ("pending_timestamp_us".equals(A0s)) {
                    c31481er.A04 = AbstractC31173DnH.A0h(c16l);
                } else if ("timestamp_us".equals(A0s)) {
                    c31481er.A00 = c16l.A0y();
                } else if ("params".equals(A0s)) {
                    DirectForwardingParams parseFromJson = FUT.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c31481er.A01 = parseFromJson;
                } else {
                    AbstractC43669JTd.A01(c16l, c31481er, A0s);
                }
                c16l.A0z();
            }
            return c31481er;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
