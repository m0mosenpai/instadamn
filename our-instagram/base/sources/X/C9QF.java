package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9QF, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9QF {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.A6F, java.lang.Object] */
    public static A6F parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("signal_to_decision_maker".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C22885A7f parseFromJson = C9QG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
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
