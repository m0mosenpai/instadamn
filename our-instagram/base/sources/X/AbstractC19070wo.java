package X;

import java.util.WeakHashMap;

/* renamed from: X.0wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19070wo extends AbstractC06400Vg {
    public final WeakHashMap A00 = new WeakHashMap();

    public abstract Object A05(InterfaceC06330Uz interfaceC06330Uz);

    public final synchronized Object A06(InterfaceC06330Uz interfaceC06330Uz) {
        Object A05;
        WeakHashMap weakHashMap = this.A00;
        if (weakHashMap.containsKey(interfaceC06330Uz)) {
            A05 = weakHashMap.get(interfaceC06330Uz);
        } else {
            A05 = A05(interfaceC06330Uz);
            weakHashMap.put(interfaceC06330Uz, A05);
        }
        return A05;
    }
}
