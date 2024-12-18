package X;

import java.lang.reflect.Executable;
import java.util.Map;

/* renamed from: X.0m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13230m9 {
    public static final boolean A02(Class cls, Object obj) {
        Map map = C0YZ.A02;
        C14360o3.A0C(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Number number = (Number) map.get(cls);
        if (number != null) {
            return C15500q5.A0B(obj, number.intValue());
        }
        if (cls.isPrimitive()) {
            cls = AbstractC53012bi.A01(new C0YZ(cls));
        }
        return cls.isInstance(obj);
    }

    public static final String A00(Class cls) {
        String str;
        String A0R;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (!componentType.isPrimitive() || (str = (String) C0YZ.A01.get(componentType.getName())) == null || (A0R = AnonymousClass001.A0R(str, "Array")) == null) {
                return "kotlin.Array";
            }
            return A0R;
        }
        String str2 = (String) C0YZ.A01.get(cls.getName());
        if (str2 != null) {
            return str2;
        }
        return cls.getCanonicalName();
    }

    public static final String A01(Class cls) {
        String str;
        String str2 = "Array";
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Executable enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod == null && (enclosingMethod = cls.getEnclosingConstructor()) == null) {
                C14360o3.A0A(simpleName);
                C14360o3.A0B(simpleName, 0);
                int A04 = AbstractC001900j.A04(simpleName, '$', 0);
                if (A04 != -1) {
                    String substring = simpleName.substring(A04 + 1, simpleName.length());
                    C14360o3.A07(substring);
                    return substring;
                }
                return simpleName;
            }
            C14360o3.A0A(simpleName);
            return AbstractC001900j.A0K(simpleName, AnonymousClass001.A0C(enclosingMethod.getName(), '$'), simpleName);
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C0YZ.A03.get(componentType.getName())) != null) {
                String A0R = AnonymousClass001.A0R(str, "Array");
                if (A0R == null) {
                    return "Array";
                }
                return A0R;
            }
        } else {
            str2 = (String) C0YZ.A03.get(cls.getName());
            if (str2 == null) {
                return cls.getSimpleName();
            }
        }
        return str2;
    }
}
