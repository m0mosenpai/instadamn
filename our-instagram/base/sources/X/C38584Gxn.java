package X;

import java.util.List;

/* renamed from: X.Gxn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38584Gxn extends C0T6 {
    public final List A00;

    public C38584Gxn(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38584Gxn) && C14360o3.A0K(this.A00, ((C38584Gxn) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
