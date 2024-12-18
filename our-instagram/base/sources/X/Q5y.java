package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* loaded from: classes10.dex */
public final class Q5y extends Snapshot {
    public final Snapshot A00;
    public final InterfaceC16660sJ A01;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final InterfaceC16660sJ A04() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A06() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final boolean A0E() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ InterfaceC16660sJ A03() {
        return this.A01;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ void A0D(InterfaceC74933Yj interfaceC74933Yj) {
        Object obj = AbstractC75013Yr.A07;
        throw AbstractC166987dD.A14(AbstractC111324zv.A00(3529));
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0H() {
        if (!this.A02) {
            int A0F = A0F();
            Snapshot snapshot = this.A00;
            if (A0F != snapshot.A0F()) {
                A08();
            }
            snapshot.A0B(this);
            super.A0H();
        }
    }

    public Q5y(Snapshot snapshot, C75063Yw c75063Yw, InterfaceC16660sJ interfaceC16660sJ, int i) {
        super(c75063Yw, i);
        this.A01 = interfaceC16660sJ;
        this.A00 = snapshot;
        snapshot.A0A(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ Snapshot A02(InterfaceC16660sJ interfaceC16660sJ) {
        int A0F = A0F();
        return new Q5y(this.A00, A0G(), AbstractC75013Yr.A0C(interfaceC16660sJ, this.A01, true), A0F);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ void A0A(Snapshot snapshot) {
        ST4.A00();
        throw C00O.createAndThrow();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final /* bridge */ /* synthetic */ void A0B(Snapshot snapshot) {
        ST4.A00();
        throw C00O.createAndThrow();
    }
}
