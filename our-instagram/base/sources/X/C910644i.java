package X;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.44i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C910644i implements InterfaceC910744j, Serializable {
    public final transient ConcurrentHashMap A00;
    public final transient int A01;

    public final void A00(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap = this.A00;
        int size = concurrentHashMap.size();
        int i = this.A01;
        if (size >= i) {
            synchronized (this) {
                if (concurrentHashMap.size() >= i) {
                    concurrentHashMap.clear();
                }
            }
        }
        concurrentHashMap.put(obj, obj2);
    }

    @Override // X.InterfaceC910744j
    public final Object putIfAbsent(Object obj, Object obj2) {
        ConcurrentHashMap concurrentHashMap = this.A00;
        int size = concurrentHashMap.size();
        int i = this.A01;
        if (size >= i) {
            synchronized (this) {
                if (concurrentHashMap.size() >= i) {
                    concurrentHashMap.clear();
                }
            }
        }
        return concurrentHashMap.putIfAbsent(obj, obj2);
    }

    public C910644i(int i, int i2) {
        this.A00 = new ConcurrentHashMap(i, 0.8f, 4);
        this.A01 = i2;
    }
}
