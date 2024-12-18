package X;

import java.io.IOException;

/* renamed from: X.KpU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46949KpU {
    public static C33731iZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33731iZ c33731iZ = new C33731iZ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_reply".equals(A0s)) {
                    CSD parseFromJson = AbstractC46772KmT.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33731iZ.A00 = parseFromJson;
                } else if ("direct_pending_media".equals(A0s)) {
                    C7Q4 parseFromJson2 = AbstractC47865LCl.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson2, 0);
                    c33731iZ.A01 = parseFromJson2;
                } else {
                    AbstractC47856LCb.A01(c16l, c33731iZ, A0s);
                }
                c16l.A0z();
            }
            return c33731iZ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
