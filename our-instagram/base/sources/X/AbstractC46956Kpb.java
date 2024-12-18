package X;

import java.io.IOException;

/* renamed from: X.Kpb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46956Kpb {
    public static C1e7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C1e7 c1e7 = new C1e7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("animated_media".equals(A0s)) {
                    c1e7.A02 = AbstractC47867LCn.parseFromJson(c16l);
                } else if ("direct_forwarding_params".equals(A0s)) {
                    c1e7.A00 = FUT.parseFromJson(c16l);
                } else if ("replied_to_message".equals(A0s)) {
                    c1e7.A01 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c1e7, A0s);
                }
                c16l.A0z();
            }
            return c1e7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
