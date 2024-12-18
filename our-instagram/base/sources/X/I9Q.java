package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I9Q {
    public static Map A00(JK6 jk6) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jk6.B2z() != null) {
            List<JLJ> B2z = jk6.B2z();
            ArrayList arrayList = null;
            if (B2z != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JLJ jlj : B2z) {
                    if (jlj != null) {
                        arrayList.add(jlj.F7o());
                    }
                }
            }
            A1I.put("exp", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
