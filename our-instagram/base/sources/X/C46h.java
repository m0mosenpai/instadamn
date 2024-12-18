package X;

import java.io.Serializable;

/* renamed from: X.46h, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C46h implements Serializable {
    public abstract boolean equals(Object object);

    public abstract int hashCode();

    public abstract String toString();

    public static C46h A00(Object nullableReference) {
        if (nullableReference == null) {
            return C4JK.A00;
        }
        return new C4JL(nullableReference);
    }

    public final C46h A02(C2n2 function) {
        if (this instanceof C4JK) {
            return C4JK.A00;
        }
        Object apply = function.apply(((C4JL) this).A00);
        C18C.A07(apply, "the Function passed to Optional.transform() must not return null.");
        return new C4JL(apply);
    }

    public final Object A03() {
        if (this instanceof C4JL) {
            return ((C4JL) this).A00;
        }
        throw new IllegalStateException(AbstractC58317Pt9.A00(601));
    }

    public final Object A04() {
        if (this instanceof C4JL) {
            return ((C4JL) this).A00;
        }
        return null;
    }

    public final Object A05(Object defaultValue) {
        if (this instanceof C4JL) {
            C18C.A07(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
            return ((C4JL) this).A00;
        }
        C18C.A07(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return defaultValue;
    }

    public static C4JL A01(Object reference) {
        reference.getClass();
        return new C4JL(reference);
    }
}
