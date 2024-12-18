package X;

import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.4Ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93534Ht {
    public static C9BH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9BH c9bh = new C9BH(27);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("publish_ids".equals(A0q)) {
                    HashSet hashSet = null;
                    if (c16l.A11() == C16R.A0C) {
                        hashSet = new HashSet();
                        while (c16l.A1J() != C16R.A08) {
                            Integer valueOf = Integer.valueOf(c16l.A1D());
                            if (valueOf != null) {
                                hashSet.add(valueOf);
                            }
                        }
                    }
                    C14360o3.A0B(hashSet, 0);
                    c9bh.A00 = hashSet;
                }
                c16l.A0z();
            }
            return c9bh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
