package X;

import java.util.List;

/* renamed from: X.BjE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26245BjE extends C0T6 implements InterfaceC30865Dhe {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26245BjE) {
                C26245BjE c26245BjE = (C26245BjE) obj;
                if (!C14360o3.A0K(this.A01, c26245BjE.A01) || !C14360o3.A0K(this.A00, c26245BjE.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C26245BjE(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
