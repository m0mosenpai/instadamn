package X;

import java.util.List;

/* renamed from: X.E5w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32044E5w extends C0T6 {
    public final List A00;

    public C32044E5w(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32044E5w) && C14360o3.A0K(this.A00, ((C32044E5w) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
