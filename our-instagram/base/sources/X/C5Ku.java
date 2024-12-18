package X;

import java.io.IOException;

/* renamed from: X.5Ku, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5Ku {
    public static C5Kv parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C5Kv c5Kv = new C5Kv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("draft_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c5Kv.A03 = A1P;
                } else if ("draft_external_source".equals(A0q)) {
                    c5Kv.A01 = Long.valueOf(c16l.A0y());
                } else if ("draft_source_type".equals(A0q)) {
                    c5Kv.A00 = Integer.valueOf(c16l.A1D());
                } else if ("meta_gallery_media_id".equals(A0q)) {
                    c5Kv.A02 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return c5Kv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
