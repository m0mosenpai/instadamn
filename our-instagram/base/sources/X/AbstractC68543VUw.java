package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68543VUw {
    public static C69004Vfg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69004Vfg c69004Vfg = new C69004Vfg();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("event".equals(A0s)) {
                    c69004Vfg.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69003Vff parseFromJson = AbstractC68542VUv.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69004Vfg.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c69004Vfg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
