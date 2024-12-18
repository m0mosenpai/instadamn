package X;

import java.util.List;

/* renamed from: X.Mw2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51858Mw2 extends C0T6 implements InterfaceC57855PlL {
    public final List A00;

    public C51858Mw2(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51858Mw2) && C14360o3.A0K(this.A00, ((C51858Mw2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
