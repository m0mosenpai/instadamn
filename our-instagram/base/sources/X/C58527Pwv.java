package X;

import java.util.Arrays;

/* renamed from: X.Pwv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58527Pwv {
    public final Class A00;
    public final Class A01;

    public final boolean equals(Object o) {
        if (!(o instanceof C58527Pwv)) {
            return false;
        }
        C58527Pwv c58527Pwv = (C58527Pwv) o;
        if (!c58527Pwv.A00.equals(this.A00) || !c58527Pwv.A01.equals(this.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        return AnonymousClass001.A0g(this.A00.getSimpleName(), " with primitive type: ", this.A01.getSimpleName());
    }

    public C58527Pwv(Class keyClass, Class primitiveClass) {
        this.A00 = keyClass;
        this.A01 = primitiveClass;
    }
}
