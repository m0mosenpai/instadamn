package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vz7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69988Vz7 {
    public static C68085V9q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68085V9q c68085V9q = new C68085V9q();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("users".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList);
                        }
                    }
                    c68085V9q.A01 = arrayList;
                } else {
                    U3D.A00(c16l, c68085V9q, A0s);
                }
                c16l.A0z();
            }
            c68085V9q.A00 = U12.A01(c68085V9q.A01);
            return c68085V9q;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
