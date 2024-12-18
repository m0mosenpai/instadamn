package X;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: X.6so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152046so {
    public static C152046so A02 = new C152046so();
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public static C152056sq A00(C152046so c152046so, Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C152056sq c152056sq = (C152056sq) c152046so.A00.get(superclass);
            if (c152056sq == null) {
                c152056sq = A00(c152046so, superclass, null);
            }
            hashMap.putAll(c152056sq.A01);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C152056sq c152056sq2 = (C152056sq) c152046so.A00.get(cls2);
            if (c152056sq2 == null) {
                c152056sq2 = A00(c152046so, cls2, null);
            }
            for (Map.Entry entry : c152056sq2.A01.entrySet()) {
                A01((C152066sr) entry.getKey(), (C07R) entry.getValue(), cls, hashMap);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length > 0) {
                    if (C07X.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                C07R value = onLifecycleEvent.value();
                if (length > 1) {
                    if (C07R.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == C07R.ON_ANY) {
                            i = 2;
                            if (length > 2) {
                                throw new IllegalArgumentException("cannot have more than 2 params");
                            }
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                A01(new C152066sr(method, i), value, cls, hashMap);
                z = true;
            }
        }
        C152056sq c152056sq3 = new C152056sq(hashMap);
        c152046so.A00.put(cls, c152056sq3);
        c152046so.A01.put(cls, Boolean.valueOf(z));
        return c152056sq3;
    }

    public static void A01(C152066sr c152066sr, C07R c07r, Class cls, Map map) {
        Object obj = map.get(c152066sr);
        if (obj != null) {
            if (c07r != obj) {
                Method method = c152066sr.A01;
                StringBuilder sb = new StringBuilder();
                sb.append("Method ");
                sb.append(method.getName());
                sb.append(" in ");
                sb.append(cls.getName());
                sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
                sb.append(obj);
                sb.append(", new value ");
                sb.append(c07r);
                throw new IllegalArgumentException(sb.toString());
            }
            return;
        }
        map.put(c152066sr, c07r);
    }
}
