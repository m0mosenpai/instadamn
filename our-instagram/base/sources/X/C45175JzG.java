package X;

import java.util.List;

/* renamed from: X.JzG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45175JzG extends C0T6 implements MN0 {
    public final List A00;

    public C45175JzG(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45175JzG) && C14360o3.A0K(this.A00, ((C45175JzG) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
