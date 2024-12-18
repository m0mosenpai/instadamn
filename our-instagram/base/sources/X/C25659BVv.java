package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.BVv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25659BVv {
    public Object A00;
    public boolean A01;
    public final C6M7 A02;
    public final BVY A03;
    public final C57F A04;
    public final InterfaceC119545bC A05;

    public C25659BVv(BVY bvy, float f, int i) {
        this.A03 = bvy;
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A05 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableFloatState(f);
        this.A02 = new C6M7(i, 30, 100);
    }
}
