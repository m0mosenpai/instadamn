package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.8bs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190348bs {
    public static final Map A00;
    public static final List A01;

    public static final boolean A00(C55U c55u, java.util.Set set) {
        C14360o3.A0B(c55u, 0);
        C14360o3.A0B(set, 1);
        for (Object obj : set) {
            List list = (List) A00.get(c55u);
            if (list == null) {
                list = C16930sl.A00;
            }
            if (!list.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    static {
        List singletonList = Collections.singletonList(C81W.A0M);
        C14360o3.A07(singletonList);
        A01 = singletonList;
        A00 = AbstractC16850sd.A0M(new C09530e4(C208509Kk.A00, singletonList));
    }
}
