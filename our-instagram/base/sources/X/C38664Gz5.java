package X;

import java.util.List;

/* renamed from: X.Gz5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38664Gz5 extends C0T6 {
    public final List A00;

    public C38664Gz5(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38664Gz5) && C14360o3.A0K(this.A00, ((C38664Gz5) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final List A00() {
        return this.A00;
    }
}
