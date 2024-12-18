package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class T64 implements InterfaceC65412Tjj, Serializable {
    public final Object A00;

    public T64(Object obj) {
        this.A00 = obj;
    }

    @Override // X.InterfaceC65412Tjj
    public final Object FFc() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T64) {
            Object obj2 = this.A00;
            Object obj3 = ((T64) obj).A00;
            if (obj2 != obj3 && !obj2.equals(obj3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0g("Suppliers.ofInstance(", this.A00.toString(), ")");
    }
}
