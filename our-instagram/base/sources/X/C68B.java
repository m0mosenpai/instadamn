package X;

import java.util.List;

/* renamed from: X.68B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68B extends C0T6 implements C68C {
    public final List A00;

    public C68B(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.C68C
    public final C68B ExQ(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68B) && C14360o3.A0K(this.A00, ((C68B) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
