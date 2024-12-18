package X;

import com.google.common.collect.Lists$TransformingRandomAccessList;
import com.google.common.collect.Lists$TransformingSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.4Au, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC92144Au {
    public static ArrayList A01(Object... elements) {
        ArrayList arrayList = new ArrayList(computeArrayListCapacity(elements.length));
        Collections.addAll(arrayList, elements);
        return arrayList;
    }

    public static ArrayList A00(Iterable elements) {
        if (elements instanceof Collection) {
            return new ArrayList((Collection) elements);
        }
        Iterator it = elements.iterator();
        ArrayList arrayList = new ArrayList();
        AbstractC63071Sbt.A02(arrayList, it);
        return arrayList;
    }

    public static List A02(C2n2 fromList, List function) {
        if (function instanceof RandomAccess) {
            return new Lists$TransformingRandomAccessList(fromList, function);
        }
        return new Lists$TransformingSequentialList(fromList, function);
    }

    public static int computeArrayListCapacity(int arraySize) {
        AbstractC24841Jd.A00(arraySize, "arraySize");
        return AbstractC38301qK.A02(arraySize + 5 + (arraySize / 10));
    }
}
