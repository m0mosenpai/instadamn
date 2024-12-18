package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.8tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200168tL implements InterfaceC216113n, Serializable {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C200168tL) {
            return AbstractC50102Ry.A00(this.A00, ((C200168tL) obj).A00);
        }
        return false;
    }

    @Override // X.InterfaceC216113n
    public final Object get() {
        return this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC58317Pt9.A00(624));
        sb.append(this.A00);
        sb.append(")");
        return sb.toString();
    }

    public C200168tL(Object instance) {
        this.A00 = instance;
    }
}
