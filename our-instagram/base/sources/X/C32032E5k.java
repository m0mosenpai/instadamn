package X;

import java.util.List;

/* renamed from: X.E5k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32032E5k extends C0T6 {
    public final List A00;

    public C32032E5k(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32032E5k) && C14360o3.A0K(this.A00, ((C32032E5k) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
