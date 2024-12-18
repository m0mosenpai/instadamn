package X;

import java.util.List;

/* renamed from: X.E5s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32040E5s extends C0T6 {
    public final List A00;

    public C32040E5s(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C32040E5s) && C14360o3.A0K(this.A00, ((C32040E5s) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
