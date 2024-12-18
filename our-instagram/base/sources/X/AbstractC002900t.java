package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.00t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC002900t extends AbstractC003400z {
    public static final List A0z(Class cls, Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void A10(List list) {
        C14360o3.A0B(list, 0);
        Collections.reverse(list);
    }
}
