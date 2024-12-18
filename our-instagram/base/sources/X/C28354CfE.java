package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.CfE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28354CfE {
    public Object A00;
    public boolean A01;
    public final C6M7 A02;
    public final InterfaceC119545bC A03;
    public final InterfaceC119545bC A04;

    public static final void A00(C28354CfE c28354CfE, int i, int i2) {
        if (i >= 0.0f) {
            c28354CfE.A03.EWE(i);
            c28354CfE.A02.A00(i);
            c28354CfE.A04.EWE(i2);
            return;
        }
        throw AbstractC166987dD.A12(AbstractC25235BEs.A0q(AbstractC111324zv.A00(1665), i));
    }

    public C28354CfE(int i, int i2) {
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A03 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableIntState(i2);
        this.A02 = new C6M7(i, 90, 200);
    }

    public C28354CfE() {
        this(0, 0);
    }
}
