package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VUI {
    public static C68990VfS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68990VfS c68990VfS = new C68990VfS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("page_info".equals(A0s)) {
                    c68990VfS.A00 = VUH.parseFromJson(c16l);
                } else if ("edges".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C68796VcD parseFromJson = VUG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68990VfS.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c68990VfS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
