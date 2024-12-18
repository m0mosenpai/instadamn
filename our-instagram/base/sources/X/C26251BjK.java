package X;

import java.util.List;

/* renamed from: X.BjK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26251BjK extends C0T6 implements InterfaceC30886Dhz {
    public final C38321qM A00;
    public final List A01;

    public C26251BjK(C38321qM c38321qM, List list) {
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = c38321qM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26251BjK) {
                C26251BjK c26251BjK = (C26251BjK) obj;
                if (!C14360o3.A0K(this.A01, c26251BjK.A01) || !C14360o3.A0K(this.A00, c26251BjK.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }
}
