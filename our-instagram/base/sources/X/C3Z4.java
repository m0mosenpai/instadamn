package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.3Z4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z4 extends Snapshot {
    public InterfaceC16660sJ A00;
    public final long A01;
    public final Snapshot A02;
    public final Snapshot A03;
    public final boolean A04;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final void A0H() {
        Snapshot snapshot;
        super.A02 = true;
        if (this.A04 && (snapshot = this.A02) != null) {
            snapshot.A0H();
        }
    }

    public C3Z4(Snapshot snapshot, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        super(C75063Yw.A04, 0);
        this.A02 = snapshot;
        this.A04 = z;
        int i = AbstractC75013Yr.A00;
        this.A00 = interfaceC16660sJ == null ? null : interfaceC16660sJ;
        this.A01 = Thread.currentThread().getId();
        this.A03 = this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final int A0F() {
        Snapshot snapshot = this.A02;
        if (snapshot == null) {
            snapshot = (Snapshot) AbstractC75013Yr.A08.get();
        }
        return snapshot.A0F();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public final C75063Yw A0G() {
        Snapshot snapshot = this.A02;
        if (snapshot == null) {
            snapshot = (Snapshot) AbstractC75013Yr.A08.get();
        }
        return snapshot.A0G();
    }
}
