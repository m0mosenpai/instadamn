package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.5bE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119565bE {
    public int A00;
    public final int A01;
    public final InterfaceC119545bC A02;
    public final InterfaceC119545bC A03;
    public final InterfaceC119545bC A04;
    public final InterfaceC119545bC A05;
    public final InterfaceC119545bC A06;
    public final boolean A07;

    public C119565bE(int i, int i2, int i3, int i4) {
        this.A01 = i2;
        boolean z = i2 > 5;
        this.A07 = z;
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = new ParcelableSnapshotMutableIntState(0);
        this.A05 = parcelableSnapshotMutableIntState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = new ParcelableSnapshotMutableIntState(i3);
        this.A03 = parcelableSnapshotMutableIntState2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = new ParcelableSnapshotMutableIntState(0);
        this.A06 = parcelableSnapshotMutableIntState3;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = new ParcelableSnapshotMutableIntState(i4);
        this.A04 = parcelableSnapshotMutableIntState4;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = new ParcelableSnapshotMutableIntState(i);
        this.A02 = parcelableSnapshotMutableIntState5;
        if (z) {
            int BIi = parcelableSnapshotMutableIntState5.BIi();
            int i5 = i2 / 2;
            int BIi2 = parcelableSnapshotMutableIntState5.BIi();
            if (BIi > i5) {
                parcelableSnapshotMutableIntState4.EWE(Math.min(BIi2 + 2, i2 - 1));
                parcelableSnapshotMutableIntState3.EWE(Math.max((parcelableSnapshotMutableIntState2.BIi() - 5) + 1, 0));
            } else {
                parcelableSnapshotMutableIntState3.EWE(Math.max(BIi2 - 2, 0));
                parcelableSnapshotMutableIntState4.EWE(Math.min((parcelableSnapshotMutableIntState.BIi() + 5) - 1, i2 - 1));
            }
            parcelableSnapshotMutableIntState.EWE(Math.max(0, parcelableSnapshotMutableIntState3.BIi() - 2));
            parcelableSnapshotMutableIntState2.EWE(Math.min(parcelableSnapshotMutableIntState4.BIi() + 2, i2 - 1));
        }
    }
}
