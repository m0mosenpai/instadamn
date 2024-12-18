package com.google.gson.reflect;

import X.AbstractC47822Hp;
import X.AnonymousClass001;
import X.C5MQ;
import X.C64735TRt;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class TypeToken {
    public final int hashCode;
    public final Class rawType;
    public final Type type;

    @Deprecated
    public boolean isAssignableFrom(Type type) {
        if (type != null) {
            if (this.type.equals(type)) {
                return true;
            }
            Type type2 = this.type;
            if (type2 instanceof Class) {
                return this.rawType.isAssignableFrom(AbstractC47822Hp.A00(type));
            }
            if (type2 instanceof ParameterizedType) {
                return isAssignableFrom(type, (ParameterizedType) type2, new HashMap());
            }
            if (type2 instanceof GenericArrayType) {
                if (this.rawType.isAssignableFrom(AbstractC47822Hp.A00(type)) && isAssignableFrom(type, (GenericArrayType) this.type)) {
                    return true;
                }
            } else {
                throw buildUnexpectedTypeError(type2, Class.class, ParameterizedType.class, GenericArrayType.class);
            }
        }
        return false;
    }

    public static AssertionError buildUnexpectedTypeError(Type type, Class... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class cls : clsArr) {
            sb.append(cls.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    public static TypeToken get(Class cls) {
        return new TypeToken(cls);
    }

    public static TypeToken getArray(Type type) {
        return new TypeToken(new C64735TRt(type));
    }

    private Type getTypeTokenTypeArgument() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == TypeToken.class) {
                return AbstractC47822Hp.A04(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == TypeToken.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeToken) && AbstractC47822Hp.A06(this.type, ((TypeToken) obj).type)) {
            return true;
        }
        return false;
    }

    public final Class getRawType() {
        return this.rawType;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.hashCode;
    }

    public final String toString() {
        return AbstractC47822Hp.A01(this.type);
    }

    public TypeToken(Type type) {
        type.getClass();
        Type A04 = AbstractC47822Hp.A04(type);
        this.type = A04;
        this.rawType = AbstractC47822Hp.A00(A04);
        this.hashCode = A04.hashCode();
    }

    public static TypeToken getParameterized(Type type, Type... typeArr) {
        type.getClass();
        typeArr.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            TypeVariable[] typeParameters = cls.getTypeParameters();
            int length = typeParameters.length;
            int length2 = typeArr.length;
            if (length2 == length) {
                for (int i = 0; i < length; i++) {
                    Type type2 = typeArr[i];
                    Class<?> A00 = AbstractC47822Hp.A00(type2);
                    TypeVariable typeVariable = typeParameters[i];
                    for (Type type3 : typeVariable.getBounds()) {
                        if (!AbstractC47822Hp.A00(type3).isAssignableFrom(A00)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Type argument ");
                            sb.append(type2);
                            sb.append(" does not satisfy bounds for type variable ");
                            sb.append(typeVariable);
                            sb.append(" declared by ");
                            sb.append(type);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
                return new TypeToken(new C5MQ(null, type, typeArr));
            }
            throw new IllegalArgumentException(AnonymousClass001.A0o(cls.getName(), " requires ", " type arguments, but got ", length, length2));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawType must be of type Class, but was ");
        sb2.append(type);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static boolean matches(Type type, Type type2, Map map) {
        if (!type2.equals(type)) {
            if ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName()))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean typeEquals(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!matches(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    public TypeToken() {
        Type typeTokenTypeArgument = getTypeTokenTypeArgument();
        this.type = typeTokenTypeArgument;
        this.rawType = AbstractC47822Hp.A00(typeTokenTypeArgument);
        this.hashCode = typeTokenTypeArgument.hashCode();
    }

    public static TypeToken get(Type type) {
        return new TypeToken(type);
    }

    public static boolean isAssignableFrom(Type type, ParameterizedType parameterizedType, Map map) {
        ParameterizedType parameterizedType2;
        if (type == null) {
            return false;
        }
        if (!parameterizedType.equals(type)) {
            Class A00 = AbstractC47822Hp.A00(type);
            if ((type instanceof ParameterizedType) && (parameterizedType2 = (ParameterizedType) type) != null) {
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                TypeVariable[] typeParameters = A00.getTypeParameters();
                for (int i = 0; i < actualTypeArguments.length; i++) {
                    Type type2 = actualTypeArguments[i];
                    TypeVariable typeVariable = typeParameters[i];
                    while (type2 instanceof TypeVariable) {
                        type2 = (Type) map.get(((TypeVariable) type2).getName());
                    }
                    map.put(typeVariable.getName(), type2);
                }
                if (typeEquals(parameterizedType2, parameterizedType, map)) {
                    return true;
                }
            }
            for (Type type3 : A00.getGenericInterfaces()) {
                if (!isAssignableFrom(type3, parameterizedType, new HashMap(map))) {
                }
            }
            return isAssignableFrom(A00.getGenericSuperclass(), parameterizedType, new HashMap(map));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static boolean isAssignableFrom(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (genericComponentType instanceof ParameterizedType) {
            if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if (type instanceof Class) {
                type = (Class) type;
                while (type.isArray()) {
                    type = type.getComponentType();
                }
            }
            return isAssignableFrom(type, (ParameterizedType) genericComponentType, new HashMap());
        }
        return true;
    }

    @Deprecated
    public boolean isAssignableFrom(TypeToken typeToken) {
        return isAssignableFrom(typeToken.type);
    }

    @Deprecated
    public boolean isAssignableFrom(Class cls) {
        return isAssignableFrom((Type) cls);
    }
}
