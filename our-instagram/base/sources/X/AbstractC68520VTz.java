package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VTz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68520VTz {
    public static C68987VfP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68987VfP c68987VfP = new C68987VfP();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("page_info".equals(A0s)) {
                    c68987VfP.A00 = AbstractC68519VTy.parseFromJson(c16l);
                } else if ("edges".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C68782Vbz parseFromJson = AbstractC68518VTx.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68987VfP.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c68987VfP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
