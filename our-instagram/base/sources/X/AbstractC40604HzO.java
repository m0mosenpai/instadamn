package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HzO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40604HzO {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.IBy, java.lang.Object] */
    public static C40951IBy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if ("list".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Integer A0h = AbstractC166997dE.A0h(c16l);
                            if (A0h != null) {
                                arrayList.add(A0h);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (arrayList != null) {
                obj.A00 = arrayList;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
