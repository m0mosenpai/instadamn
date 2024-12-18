package X;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

/* renamed from: X.2Hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC47822Hp {
    public static final Type[] A00 = new Type[0];

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0045, code lost:
    
        if (X.C2I7.A00(r0, r1) != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0124 A[EDGE_INSN: B:24:0x0124->B:25:0x0124 BREAK  A[LOOP:0: B:2:0x0001->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0001->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.5MR] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.5MR] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.5MQ] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.TRt] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type A03(java.lang.Class r8, java.lang.reflect.Type r9, java.lang.reflect.Type r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47822Hp.A03(java.lang.Class, java.lang.reflect.Type, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static boolean A06(Type type, Type type2) {
        boolean equals;
        Type[] lowerBounds;
        Type[] lowerBounds2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (C2I7.A00(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
                    lowerBounds = parameterizedType.getActualTypeArguments();
                    lowerBounds2 = parameterizedType2.getActualTypeArguments();
                    equals = Arrays.equals(lowerBounds, lowerBounds2);
                } else {
                    return false;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return A06(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds())) {
                    lowerBounds = wildcardType.getLowerBounds();
                    lowerBounds2 = wildcardType2.getLowerBounds();
                    equals = Arrays.equals(lowerBounds, lowerBounds2);
                } else {
                    return false;
                }
            }
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration()) {
                equals = typeVariable.getName().equals(typeVariable2.getName());
            } else {
                return false;
            }
        }
        return false;
        return equals;
    }

    public static Class A00(Type type) {
        String name;
        if (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
                C2I6.A00(type instanceof Class);
            } else {
                if (type instanceof GenericArrayType) {
                    return Array.newInstance((Class<?>) A00(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
                }
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    return A00(((WildcardType) type).getUpperBounds()[0]);
                }
                if (type == null) {
                    name = "null";
                } else {
                    name = type.getClass().getName();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (Class) type;
    }

    public static String A01(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static Type A02(Class cls, Class cls2, Type type) {
        Class<?> superclass;
        Type genericSuperclass;
        if (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    Class<?> cls3 = interfaces[i];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        genericSuperclass = cls.getGenericInterfaces()[i];
                        superclass = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        return A02(superclass, cls2, genericSuperclass);
                    }
                    cls = superclass;
                }
            }
            return cls2;
        }
        return type;
    }

    public static Type A04(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            boolean isArray = cls.isArray();
            Type type2 = cls;
            if (isArray) {
                type2 = new C64735TRt(A04(cls.getComponentType()));
            }
            return type2;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C5MQ(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C64735TRt(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C5MR(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (((java.lang.Class) r1).isPrimitive() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(java.lang.reflect.Type r1) {
        /*
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Ld
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            r0 = 0
            if (r1 != 0) goto Le
        Ld:
            r0 = 1
        Le:
            X.C2I6.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC47822Hp.A05(java.lang.reflect.Type):void");
    }
}
