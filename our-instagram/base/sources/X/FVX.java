package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FVX {
    public static C32158EBf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32158EBf c32158EBf = new C32158EBf();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("channels".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38900HAw parseFromJson = C41314IQk.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32158EBf.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32158EBf, A0s);
                }
                c16l.A0z();
            }
            return c32158EBf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}