package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.0ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12990ll {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();

    public final Object A01(Class cls, InterfaceC16820sZ interfaceC16820sZ) {
        C17050sx c17050sx;
        C14360o3.A0B(interfaceC16820sZ, 1);
        ConcurrentHashMap concurrentHashMap = this.A00;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (obj = concurrentHashMap.putIfAbsent(cls, (c17050sx = new C17050sx(interfaceC16820sZ)))) == null) {
            obj = c17050sx;
        }
        Object value = ((InterfaceC09390do) obj).getValue();
        C14360o3.A0C(value, "null cannot be cast to non-null type Key of com.instagram.common.session.Session.getScopedClass");
        return value;
    }

    @Deprecated(message = "Avoid using Session as a mutable map, it adds complexity and risks creating difficult-to-debug problems. Use the getScopedClass function for thread-safe lazy initialization", replaceWith = @ReplaceWith(expression = "getScopedClass", imports = {}))
    public final void A03(Class cls) {
        C14360o3.A0B(cls, 0);
        this.A00.remove(cls);
    }

    @Deprecated(message = "Avoid using Session as a mutable map, it adds complexity and risks creating difficult-to-debug problems. Use the getScopedClass function for thread-safe lazy initialization", replaceWith = @ReplaceWith(expression = "getScopedClass", imports = {}))
    public final void A04(Class cls, Object obj) {
        C14360o3.A0B(obj, 1);
        this.A00.put(cls, new C28111Xp(obj));
    }

    public abstract C18720vz getDeviceSession();

    public abstract String getToken();

    public abstract boolean hasEnded();

    @Deprecated(message = "Avoid using Session as a mutable map, it adds complexity and risks creating difficult-to-debug problems. Use the getScopedClass function for thread-safe lazy initialization", replaceWith = @ReplaceWith(expression = "getScopedClass", imports = {}))
    public final Object A00(Class cls) {
        Object value;
        InterfaceC09390do interfaceC09390do = (InterfaceC09390do) this.A00.get(cls);
        if (interfaceC09390do == null || (value = interfaceC09390do.getValue()) == null) {
            return null;
        }
        return value;
    }

    public final List A02() {
        Object value;
        Collection<InterfaceC09390do> values = this.A00.values();
        C14360o3.A07(values);
        ArrayList arrayList = new ArrayList();
        for (InterfaceC09390do interfaceC09390do : values) {
            if (interfaceC09390do.CWa() && (value = interfaceC09390do.getValue()) != null) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }

    @Deprecated(message = "Avoid using Session as a mutable map, it adds complexity and risks creating difficult-to-debug problems. Use the getScopedClass function for thread-safe lazy initialization", replaceWith = @ReplaceWith(expression = "getScopedClass", imports = {}))
    public final boolean A05(Class cls) {
        InterfaceC09390do interfaceC09390do;
        ConcurrentHashMap concurrentHashMap = this.A00;
        if (concurrentHashMap.containsKey(cls) && (interfaceC09390do = (InterfaceC09390do) concurrentHashMap.get(cls)) != null && interfaceC09390do.CWa()) {
            return true;
        }
        return false;
    }
}
