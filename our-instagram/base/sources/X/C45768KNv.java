package X;

import java.util.List;

/* renamed from: X.KNv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45768KNv extends AbstractC46412KgY {
    public final List A00;

    public C45768KNv(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45768KNv) && C14360o3.A0K(this.A00, ((C45768KNv) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
