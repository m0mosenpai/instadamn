package X;

import java.util.List;

/* renamed from: X.Jyi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45142Jyi extends C0T6 implements InterfaceC50497MRa {
    public final List A00;

    public C45142Jyi(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45142Jyi) && C14360o3.A0K(this.A00, ((C45142Jyi) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
