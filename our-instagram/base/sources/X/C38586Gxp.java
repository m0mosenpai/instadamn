package X;

import java.util.List;

/* renamed from: X.Gxp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38586Gxp extends C0T6 {
    public final List A00;

    public C38586Gxp(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38586Gxp) && C14360o3.A0K(this.A00, ((C38586Gxp) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
