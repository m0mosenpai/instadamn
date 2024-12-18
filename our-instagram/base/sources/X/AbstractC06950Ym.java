package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0Ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC06950Ym extends AbstractC16960so {
    public static final int A1E(Iterable iterable, int i) {
        C14360o3.A0B(iterable, 0);
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static final ArrayList A1F(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }

    public static final C09530e4 A1G(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        int A1E = A1E(iterable, 10);
        ArrayList arrayList = new ArrayList(A1E);
        ArrayList arrayList2 = new ArrayList(A1E);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            arrayList.add(c09530e4.A00);
            arrayList2.add(c09530e4.A01);
        }
        return new C09530e4(arrayList, arrayList2);
    }
}
