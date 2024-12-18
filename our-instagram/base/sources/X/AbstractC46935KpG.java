package X;

import java.io.IOException;

/* renamed from: X.KpG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46935KpG {
    public static C31351ee parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31351ee c31351ee = new C31351ee();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("direct_voice_media".equals(A0s)) {
                    c31351ee.A01 = C4G1.parseFromJson(c16l);
                } else if ("replied_to_message".equals(A0s)) {
                    c31351ee.A00 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c31351ee, A0s);
                }
                c16l.A0z();
            }
            return c31351ee;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
