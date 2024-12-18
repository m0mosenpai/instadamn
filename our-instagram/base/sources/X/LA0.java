package X;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public abstract class LA0 {
    public final ConcurrentHashMap objects = new ConcurrentHashMap();

    public Object getAdaptedObject(int i, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        ConcurrentHashMap concurrentHashMap = this.objects;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            Object adaptedObject = toAdaptedObject(interfaceC16820sZ.invoke());
            C14360o3.A0A(adaptedObject);
            C47937LFl c47937LFl = new C47937LFl(adaptedObject);
            obj = concurrentHashMap.putIfAbsent(valueOf, c47937LFl);
            if (obj == null) {
                obj = c47937LFl;
            }
        }
        Object obj2 = ((C47937LFl) obj).A00;
        if (obj2 != null) {
            return obj2;
        }
        throw new NoSuchElementException();
    }

    public Object getNullableAdaptedObject(int i, InterfaceC16820sZ interfaceC16820sZ) {
        C47937LFl c47937LFl;
        C14360o3.A0B(interfaceC16820sZ, 1);
        ConcurrentHashMap concurrentHashMap = this.objects;
        Integer valueOf = Integer.valueOf(i);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            Object nullableAdaptedObject = toNullableAdaptedObject(interfaceC16820sZ.invoke());
            if (nullableAdaptedObject == null) {
                c47937LFl = C47937LFl.A01;
            } else {
                c47937LFl = new C47937LFl(nullableAdaptedObject);
            }
            obj = concurrentHashMap.putIfAbsent(valueOf, c47937LFl);
            if (obj == null) {
                obj = c47937LFl;
            }
        }
        return ((C47937LFl) obj).A00;
    }

    public abstract Object toAdaptedObject(Object obj);

    public abstract Object toNullableAdaptedObject(Object obj);
}
