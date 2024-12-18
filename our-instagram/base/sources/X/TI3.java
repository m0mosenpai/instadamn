package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TI3 implements Serializable {
    public String A00;
    public final Class A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            TI3 ti3 = (TI3) obj;
            if (this.A01 != ti3.A01 || !C2I7.A00(this.A00, ti3.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.A02;
    }

    public final String toString() {
        String A0g;
        String name = this.A01.getName();
        String str = this.A00;
        if (str == null) {
            A0g = "null";
        } else {
            A0g = AnonymousClass001.A0g("'", str, "'");
        }
        return AnonymousClass001.A11("[NamedType, class ", name, ", name: ", A0g, "]");
    }

    public TI3(Class cls, String str) {
        this.A01 = cls;
        this.A02 = cls.getName().hashCode() + AbstractC167017dG.A0O(str);
        this.A00 = (str == null || str.isEmpty()) ? null : str;
    }
}
