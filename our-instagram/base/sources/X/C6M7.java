package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.6M7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6M7 implements InterfaceC74963Ym {
    public int A00;
    public final InterfaceC74953Yl A01;
    public final int A02;
    public final int A03;

    public final void A00(int i) {
        if (i != this.A00) {
            this.A00 = i;
            int i2 = this.A03;
            int i3 = this.A02;
            int i4 = (i / i2) * i2;
            this.A01.Egh(C17s.A0C(Math.max(i4 - i3, 0), i4 + i2 + i3));
        }
    }

    @Override // X.InterfaceC74963Ym
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.A01.getValue();
    }

    public C6M7(int i, int i2, int i3) {
        this.A03 = i2;
        this.A02 = i3;
        int i4 = (i / i2) * i2;
        C17u A0C = C17s.A0C(Math.max(i4 - i3, 0), i4 + i2 + i3);
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A01 = new ParcelableSnapshotMutableState(A00, A0C);
        this.A00 = i;
    }
}
