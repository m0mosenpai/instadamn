package X;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: X.Sfu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63240Sfu {
    public static ParameterizedType A00(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length == 1) {
                    return A00(upperBounds[0]);
                }
            }
        }
        return null;
    }

    public static TypeVariable A01(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length == 1) {
                    return A01(upperBounds[0]);
                }
            }
        }
        return null;
    }

    public static boolean A02(AbstractC910944l abstractC910944l, AnonymousClass456 anonymousClass456, Type type) {
        AbstractC910944l abstractC910944l2;
        if (!abstractC910944l.A0Q(anonymousClass456.EKO(type).A00)) {
            return false;
        }
        ParameterizedType A00 = A00(type);
        if (A00 != null && C2I7.A00(abstractC910944l.A00, A00.getRawType())) {
            Type[] actualTypeArguments = A00.getActualTypeArguments();
            AbstractC910944l[] abstractC910944lArr = abstractC910944l.A0G().A01;
            int length = abstractC910944lArr.length;
            if (length != actualTypeArguments.length) {
                return false;
            }
            for (int i = 0; i < length; i++) {
                if (i >= 0 && i < length) {
                    abstractC910944l2 = abstractC910944lArr[i];
                } else {
                    abstractC910944l2 = null;
                }
                if (!A02(abstractC910944l2, anonymousClass456, actualTypeArguments[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
