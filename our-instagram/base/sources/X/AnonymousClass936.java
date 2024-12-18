package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.936, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class AnonymousClass936 {
    public static final List A00;
    public static final List A01;

    static {
        ImmutableList A002 = AbstractC34324FBs.A00();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A002, 10));
        Iterator<E> it = A002.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1QO) it.next()).A05);
        }
        A00 = arrayList;
        ImmutableList A003 = AbstractC34324FBs.A00();
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A003, 10));
        Iterator<E> it2 = A003.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C1QO) it2.next()).A06);
        }
        A01 = arrayList2;
    }
}
