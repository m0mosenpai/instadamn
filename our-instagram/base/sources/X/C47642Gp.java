package X;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* renamed from: X.2Gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47642Gp {
    public final List A00;
    public final Map A01;

    public final C2I0 A01(TypeToken typeToken) {
        Type type = typeToken.type;
        final Class cls = typeToken.rawType;
        Map map = this.A01;
        map.get(type);
        map.get(cls);
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new C42118IlS(type);
        }
        if (cls == EnumMap.class) {
            return new C42119IlT(type);
        }
        AbstractC47862Hv.A00(this.A00);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                AbstractC47892Hy abstractC47892Hy = AbstractC47872Hw.A00;
                try {
                    declaredConstructor.setAccessible(true);
                } catch (Exception e) {
                    String A0u = AnonymousClass001.A0u("Failed making constructor '", AbstractC47872Hw.A01(declaredConstructor), "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ", e.getMessage());
                    if (A0u != null) {
                        return new C42120IlU(A0u);
                    }
                }
                return new C2I0() { // from class: X.2Hz
                    @Override // X.C2I0
                    public final Object AJW() {
                        try {
                            return declaredConstructor.newInstance(new Object[0]);
                        } catch (IllegalAccessException e2) {
                            AbstractC47892Hy abstractC47892Hy2 = AbstractC47872Hw.A00;
                            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                        } catch (InstantiationException e3) {
                            throw new RuntimeException(AnonymousClass001.A0g("Failed to invoke constructor '", AbstractC47872Hw.A01(declaredConstructor), "' with no args"), e3);
                        } catch (InvocationTargetException e4) {
                            throw new RuntimeException(AnonymousClass001.A0g("Failed to invoke constructor '", AbstractC47872Hw.A01(declaredConstructor), "' with no args"), e4.getCause());
                        }
                    }
                };
            } catch (NoSuchMethodException unused) {
            }
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C23554Ac8();
            }
            if (java.util.Set.class.isAssignableFrom(cls)) {
                return new C2I0() { // from class: X.2Qh
                    @Override // X.C2I0
                    public final Object AJW() {
                        return new LinkedHashSet();
                    }
                };
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C23555Ac9();
            }
            return new C2I0() { // from class: X.8jp
                @Override // X.C2I0
                public final Object AJW() {
                    return new ArrayList();
                }
            };
        }
        if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C23556AcA();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C23557AcB();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C23558AcC();
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(new TypeToken(((ParameterizedType) type).getActualTypeArguments()[0]).rawType)) {
                return new C23559AcD();
            }
            return new C2I0() { // from class: X.5MS
                @Override // X.C2I0
                public final Object AJW() {
                    return new C5MT();
                }
            };
        }
        String A00 = A00(cls);
        if (A00 != null) {
            return new C42121IlV(this, A00);
        }
        return new C2I0() { // from class: X.3Kz
            @Override // X.C2I0
            public final Object AJW() {
                try {
                    return C3L1.A00.A01(cls);
                } catch (Exception e2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to create instance of ");
                    sb.append(cls);
                    sb.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
                    throw new RuntimeException(sb.toString(), e2);
                }
            }
        };
    }

    public final String toString() {
        return this.A01.toString();
    }

    public C47642Gp(List list, Map map) {
        this.A01 = map;
        this.A00 = list;
    }

    public static String A00(Class cls) {
        StringBuilder sb;
        String str;
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            sb = new StringBuilder();
            str = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ";
        } else if (Modifier.isAbstract(modifiers)) {
            sb = new StringBuilder();
            str = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ";
        } else {
            return null;
        }
        sb.append(str);
        sb.append(cls.getName());
        return sb.toString();
    }
}
