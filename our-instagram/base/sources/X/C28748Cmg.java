package X;

import java.util.ArrayList;

/* renamed from: X.Cmg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28748Cmg implements InterfaceC30904DiH {
    public final int A00;

    @Override // X.InterfaceC30904DiH
    public final ArrayList AF4(InterfaceC1128957x interfaceC1128957x, int i, int i2) {
        int i3 = this.A00;
        int i4 = i - (i2 * (i3 - 1));
        int i5 = i4 / i3;
        int i6 = i4 % i3;
        ArrayList A17 = AbstractC25225BEi.A17(i3);
        for (int i7 = 0; i7 < i3; i7++) {
            AbstractC166997dE.A1W(A17, (AbstractC167007dF.A1Q(i7, i6) ? 1 : 0) + i5);
        }
        return A17;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C28748Cmg) && this.A00 == ((C28748Cmg) obj).A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -this.A00;
    }

    public C28748Cmg(int i) {
        this.A00 = i;
    }
}
