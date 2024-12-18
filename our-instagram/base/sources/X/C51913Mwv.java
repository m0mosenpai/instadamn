package X;

import java.util.List;

/* renamed from: X.Mwv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51913Mwv extends C0T6 implements InterfaceC57862PlS {
    public final List A00;

    public C51913Mwv(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51913Mwv) && C14360o3.A0K(this.A00, ((C51913Mwv) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
