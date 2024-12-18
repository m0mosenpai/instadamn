package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5q5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127805q5 {
    public static final List A00(Iterable iterable, InterfaceC16660sJ interfaceC16660sJ) {
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC16660sJ.invoke(it.next()));
        }
        return AbstractC001800i.A0a(arrayList);
    }
}
