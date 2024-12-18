package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.VVz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68572VVz {
    public static C5S7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5S7 c5s7 = new C5S7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("states".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C4NQ parseFromJson = C4NX.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c5s7.A00 = arrayList;
                }
                c16l.A0z();
            }
            List list = c5s7.A00;
            if (list == null) {
                c5s7.A00 = new ArrayList();
                return c5s7;
            }
            synchronized (list) {
                List<C4NQ> list2 = c5s7.A00;
                C14360o3.A0A(list2);
                for (C4NQ c4nq : list2) {
                    Map map = c5s7.A01;
                    C14360o3.A06(map);
                    map.put(C5S8.A00(c4nq), c4nq);
                }
            }
            return c5s7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
