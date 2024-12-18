package X;

import java.util.List;

/* renamed from: X.UQl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66633UQl extends C0T6 implements XF9 {
    public final List A00;

    public C66633UQl(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66633UQl) && C14360o3.A0K(this.A00, ((C66633UQl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
