package X;

import java.util.List;

/* renamed from: X.Muh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51777Muh extends C0T6 implements InterfaceC58216PrM {
    public final List A00;

    public C51777Muh(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51777Muh) && C14360o3.A0K(this.A00, ((C51777Muh) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}