package X;

import java.util.List;

/* renamed from: X.Bh2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26118Bh2 extends C0T6 implements InterfaceC31083DlR {
    public final List A00;

    public C26118Bh2(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26118Bh2) && C14360o3.A0K(this.A00, ((C26118Bh2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
