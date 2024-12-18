package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.CmX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28739CmX implements InterfaceC119655bO, InterfaceC31141Dmg {
    public final long A00;
    public final InterfaceC1128957x A01;
    public final /* synthetic */ C119645bN A02 = C119645bN.A00;

    @Override // X.InterfaceC119655bO
    public final Modifier AB5(Alignment alignment, Modifier modifier) {
        return this.A02.AB5(alignment, modifier);
    }

    @Override // X.InterfaceC119655bO
    public final Modifier Cng(Modifier modifier) {
        return this.A02.Cng(modifier);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28739CmX) {
                C28739CmX c28739CmX = (C28739CmX) obj;
                if (!C14360o3.A0K(this.A01, c28739CmX.A01) || this.A00 != c28739CmX.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + AbstractC25228BEl.A03(this.A00);
    }

    public C28739CmX(InterfaceC1128957x interfaceC1128957x, long j) {
        this.A01 = interfaceC1128957x;
        this.A00 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BoxWithConstraintsScopeImpl(density=");
        A1C.append(this.A01);
        A1C.append(AbstractC58317Pt9.A00(151));
        return AbstractC167017dG.A0o(Constraints.A05(this.A00), A1C);
    }
}
