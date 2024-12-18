package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68523VUc {
    public static C68996VfY parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68996VfY c68996VfY = new C68996VfY();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("field_key".equals(A0s)) {
                    c68996VfY.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("values".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c68996VfY.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c68996VfY;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
