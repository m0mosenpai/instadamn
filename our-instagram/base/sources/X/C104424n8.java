package X;

import java.util.List;

/* renamed from: X.4n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104424n8 extends C0T6 {
    public final List A00;

    public C104424n8(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C104424n8) && C14360o3.A0K(this.A00, ((C104424n8) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
