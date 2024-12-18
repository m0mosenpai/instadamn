package X;

import java.util.List;

/* renamed from: X.Gxw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38593Gxw extends C0T6 {
    public final List A00;

    public C38593Gxw(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38593Gxw) && C14360o3.A0K(this.A00, ((C38593Gxw) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
