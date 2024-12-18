package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FW2 {
    public static C32162EBj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32162EBj c32162EBj = new C32162EBj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("amplitudes".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(AbstractC167007dF.A0a(c16l));
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32162EBj.A00 = arrayList;
                } else {
                    C55702hA.A01(c16l, c32162EBj, A0s);
                }
                c16l.A0z();
            }
            return c32162EBj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
