package X;

import java.io.Serializable;

/* renamed from: X.T5s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64243T5s implements InterfaceC65411Tji, Serializable {
    public final Object A00;

    public C64243T5s(Object obj) {
        this.A00 = obj;
    }

    @Override // X.InterfaceC65411Tji
    public final Object FFc() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C64243T5s)) {
            return false;
        }
        Object obj2 = this.A00;
        Object obj3 = ((C64243T5s) obj).A00;
        if (obj2 != obj3 && !obj2.equals(obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }

    public final String toString() {
        return AnonymousClass001.A0g("Suppliers.ofInstance(", this.A00.toString(), ")");
    }
}
