package X;

import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.47y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC916347y {
    public static C9BS parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C9BS c9bs = new C9BS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("segment_paths".equals(A0q)) {
                    HashSet hashSet = null;
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = new HashSet();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                hashSet.add(A1P);
                            }
                        }
                    }
                    C14360o3.A0B(hashSet, 0);
                    c9bs.A00 = hashSet;
                } else if ("are_segments_complete".equals(A0q)) {
                    c9bs.A01 = c16l.A0d();
                } else if ("is_rendering".equals(A0q)) {
                    c9bs.A02 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c9bs;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
