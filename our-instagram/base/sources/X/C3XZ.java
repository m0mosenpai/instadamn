package X;

import java.util.List;

/* renamed from: X.3XZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XZ extends C0T6 implements InterfaceC74673Xb {
    public final List A00;

    public C3XZ(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3XZ) && C14360o3.A0K(this.A00, ((C3XZ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
