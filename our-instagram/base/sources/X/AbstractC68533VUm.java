package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68533VUm {
    public static C68999Vfb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68999Vfb c68999Vfb = new C68999Vfb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("conditionals".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    c68999Vfb.A00 = arrayList;
                } else if ("primitives".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69300Vl8 parseFromJson = AbstractC68532VUl.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68999Vfb.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c68999Vfb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
