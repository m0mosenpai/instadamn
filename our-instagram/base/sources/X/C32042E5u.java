package X;

import java.util.List;

/* renamed from: X.E5u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32042E5u extends C0T6 {
    public final List A00;

    public C32042E5u(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32042E5u) && C14360o3.A0K(this.A00, ((C32042E5u) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
