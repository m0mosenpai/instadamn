package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Ox, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138416Ox {
    public static final ArrayList A00(List list) {
        C138426Oy c138426Oy = C138426Oy.A00;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c138426Oy.invoke(it.next()));
        }
        return new ArrayList(arrayList);
    }
}
