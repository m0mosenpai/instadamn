package X;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C61182qg implements Closeable {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final C4A7 A00(Class cls, InterfaceC16820sZ interfaceC16820sZ) {
        Object invoke;
        ConcurrentHashMap concurrentHashMap = this.A00;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (obj = concurrentHashMap.putIfAbsent(cls, (invoke = interfaceC16820sZ.invoke()))) == null) {
            obj = invoke;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type R of com.instagram.repository.common.IgRepositoryStore.getOrPut");
        return (C4A7) obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((C4A7) ((Map.Entry) it.next()).getValue()).close();
        }
        concurrentHashMap.clear();
    }
}
