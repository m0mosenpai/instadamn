package X;

import java.io.IOException;

/* renamed from: X.VSu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68489VSu {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VfE, java.lang.Object] */
    public static C68976VfE parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("location_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    obj.A01 = A1P;
                } else if ("reel".equals(A0s)) {
                    obj.A00 = AbstractC38741r6.parseFromJson(c16l);
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
