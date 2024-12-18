package X;

import java.io.IOException;

/* renamed from: X.VzE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69994VzE {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.VdK, java.lang.Object] */
    public static C68864VdK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("data".equals(AbstractC166997dE.A0s(c16l))) {
                    C68863VdJ parseFromJson = AbstractC68604VXf.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
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
}
