package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hzi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40624Hzi {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.5z2] */
    public static C132795z2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("cluster".equals(A0q)) {
                    obj.A00 = AbstractC127865qF.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(2201).equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("cover_title".equals(A0q)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("should_show_icon".equals(A0q)) {
                    obj.A04 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
