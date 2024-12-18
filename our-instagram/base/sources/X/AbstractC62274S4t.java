package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.S4t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62274S4t {
    public static SCW parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            SCW scw = new SCW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("header".equals(A0s)) {
                    if (c16l.A11() != C16R.A0G) {
                        c16l.A1P();
                    }
                } else if ("points".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    scw.A00 = arrayList;
                }
                c16l.A0z();
            }
            return scw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
