package X;

import java.util.List;

/* renamed from: X.KIv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45658KIv extends C4F4 {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45658KIv) && C14360o3.A0K(this.A00, ((C45658KIv) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C45658KIv(List list) {
        this.A00 = list;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewModel(filterList=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
