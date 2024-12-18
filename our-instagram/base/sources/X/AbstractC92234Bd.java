package X;

import java.util.List;

/* renamed from: X.4Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92234Bd {
    public static C4B6[] A00(List list) {
        if (list != null && !list.isEmpty()) {
            C4B6[] c4b6Arr = new C4B6[list.size()];
            for (int i = 0; i < list.size(); i++) {
                c4b6Arr[i] = ((C4BB) list.get(i)).A02;
            }
            return c4b6Arr;
        }
        return new C4B6[0];
    }
}
