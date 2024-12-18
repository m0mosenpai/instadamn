package X;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* renamed from: X.ShW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63322ShW {
    public static final C71473Il A00 = new C60748RPm(new C71473Il(", "));

    public static void A01(String types, Type[] usedAs) {
        for (Type type : usedAs) {
            if (type instanceof Class) {
                C18C.A09((Class) type, types, "Primitive type '%s' used as %s", !r2.isPrimitive());
            }
        }
    }

    public static WildcardType subtypeOf(Type upperBound) {
        return new TS0(new Type[0], new Type[]{upperBound});
    }

    public static Type A00(Type componentType) {
        if (componentType instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) componentType;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            int length = lowerBounds.length;
            boolean z = true;
            C18C.A0G(AbstractC58319PtB.A1P(length, 1), "Wildcard cannot have more than one lower bounds.");
            if (length == 1) {
                return supertypeOf(A00(lowerBounds[0]));
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length != 1) {
                z = false;
            }
            C18C.A0G(z, "Wildcard should have only one upper bound.");
            return subtypeOf(A00(upperBounds[0]));
        }
        return EnumC61069Rej.A00.A01(componentType);
    }

    public static WildcardType supertypeOf(Type lowerBound) {
        return new TS0(new Type[]{lowerBound}, new Type[]{Object.class});
    }
}
