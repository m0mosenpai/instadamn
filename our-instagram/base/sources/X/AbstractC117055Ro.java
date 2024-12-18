package X;

import java.io.IOException;

/* renamed from: X.5Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117055Ro {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5Rp, java.lang.Object] */
    public static C117065Rp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                Long l = null;
                if ("start".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        l = Long.valueOf(c16l.A0y());
                    }
                    obj.A01 = l;
                } else if ("end".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        l = Long.valueOf(c16l.A0y());
                    }
                    obj.A00 = l;
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
