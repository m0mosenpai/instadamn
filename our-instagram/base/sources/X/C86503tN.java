package X;

import java.util.List;

/* renamed from: X.3tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86503tN extends C0T6 implements InterfaceC86513tO {
    public final List A00;

    public C86503tN(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86503tN) && C14360o3.A0K(this.A00, ((C86503tN) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
