package X;

import java.io.Serializable;

/* renamed from: X.45J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45J implements Serializable {
    public static final C45J A02;
    public final C45K A00;
    public final C45K A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C45J c45j = (C45J) obj;
            if (c45j.A01 != this.A01 || c45j.A00 != this.A00) {
                return false;
            }
        }
        return true;
    }

    static {
        C45K c45k = C45K.DEFAULT;
        A02 = new C45J(c45k, c45k);
    }

    public final int hashCode() {
        return this.A01.ordinal() + (this.A00.ordinal() << 2);
    }

    public final String toString() {
        return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this.A01, this.A00);
    }

    public C45J(C45K c45k, C45K c45k2) {
        this.A01 = c45k;
        this.A00 = c45k2;
    }
}
