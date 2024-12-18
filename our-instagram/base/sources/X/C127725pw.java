package X;

import java.io.IOException;

/* renamed from: X.5pw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127725pw {
    public static C202248x4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C202248x4 c202248x4 = new C202248x4();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("client_mutation_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        c16l.A1P();
                    }
                } else if ("extra_info_output".equals(A0q)) {
                    c202248x4.A00 = AbstractC202258x5.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c202248x4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
