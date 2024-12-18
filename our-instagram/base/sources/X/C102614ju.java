package X;

import java.io.IOException;

/* renamed from: X.4ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102614ju {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4jt, X.1um, X.1ul] */
    public static C102604jt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("free_token".equals(A0q)) {
                    c40791um.A01 = AbstractC103534lV.parseFromJson(c16l);
                } else if ("normal_token".equals(A0q)) {
                    c40791um.A02 = AbstractC103534lV.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            C103574lZ c103574lZ = c40791um.A01;
            C14360o3.A0A(c103574lZ);
            C103574lZ c103574lZ2 = c40791um.A02;
            C14360o3.A0A(c103574lZ2);
            c40791um.A00 = new C103604lc(c103574lZ, c103574lZ2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
