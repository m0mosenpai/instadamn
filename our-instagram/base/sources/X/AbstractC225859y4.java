package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9y4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225859y4 {
    public static Map A00(JK2 jk2) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jk2.C0d() != null) {
            List<BE5> C0d = jk2.C0d();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (BE5 be5 : C0d) {
                if (be5 != null) {
                    A1E.add(be5.F7o());
                }
            }
            A1I.put(AbstractC111324zv.A00(5402), A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
