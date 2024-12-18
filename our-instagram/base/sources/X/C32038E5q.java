package X;

import java.util.List;

/* renamed from: X.E5q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32038E5q extends C0T6 {
    public final List A00;

    public C32038E5q(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32038E5q) && C14360o3.A0K(this.A00, ((C32038E5q) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
