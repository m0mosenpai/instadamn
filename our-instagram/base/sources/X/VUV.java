package X;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VUV {
    public static C69234Vk2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69234Vk2 c69234Vk2 = new C69234Vk2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("body".equals(A0s)) {
                    c69234Vk2.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("header".equals(A0s)) {
                    c69234Vk2.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("photo".equals(A0s)) {
                    c69234Vk2.A00 = VUU.parseFromJson(c16l);
                } else if ("descriptions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c69234Vk2.A03 = arrayList;
                }
                c16l.A0z();
            }
            return c69234Vk2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
