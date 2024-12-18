package X;

import java.util.List;

/* renamed from: X.Mvd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51835Mvd extends C0T6 implements InterfaceC57822Pko {
    public final List A00;

    public C51835Mvd(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51835Mvd) && C14360o3.A0K(this.A00, ((C51835Mvd) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
