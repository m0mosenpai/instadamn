package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TIB implements Serializable {
    public static final TIB A02 = new TIB(null, null);
    public final Boolean A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        TIB tib = (TIB) obj;
        Boolean bool = this.A00;
        Boolean bool2 = tib.A00;
        if (bool == null) {
            if (bool2 != null) {
                return false;
            }
        } else if (!bool.equals(bool2)) {
            return false;
        }
        Object obj2 = this.A01;
        Object obj3 = tib.A01;
        if (obj2 == null) {
            return obj3 == null;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.A01;
        int i = 1;
        if (obj != null) {
            i = AbstractC166987dD.A0I(obj, 1);
        }
        Boolean bool = this.A00;
        if (bool != null) {
            return AbstractC166987dD.A0I(bool, i);
        }
        return i;
    }

    public final String toString() {
        return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.A01, this.A00);
    }

    public TIB(Boolean bool, Object obj) {
        this.A01 = obj;
        this.A00 = bool;
    }
}
