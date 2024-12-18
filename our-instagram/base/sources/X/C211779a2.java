package X;

import java.util.List;

/* renamed from: X.9a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211779a2 extends C0T6 implements XFO {
    public final List A00;

    public C211779a2(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C211779a2) && C14360o3.A0K(this.A00, ((C211779a2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
