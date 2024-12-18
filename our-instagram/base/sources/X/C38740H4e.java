package X;

import java.util.List;

/* renamed from: X.H4e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38740H4e extends C0T6 implements InterfaceC43476JIo {
    public final List A00;

    public C38740H4e(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38740H4e) && C14360o3.A0K(this.A00, ((C38740H4e) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
