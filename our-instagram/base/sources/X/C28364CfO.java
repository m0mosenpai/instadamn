package X;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* renamed from: X.CfO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28364CfO {
    public static final C5C7 A05 = C6M5.A00(DJY.A00, BXH.A00);
    public long A00;
    public C114205Dh A01;
    public final C57F A02;
    public final C57F A03;
    public final InterfaceC74953Yl A04;

    public final void A00(C6M3 c6m3, C114205Dh c114205Dh, int i, int i2) {
        float f;
        float f2;
        float f3 = i2 - i;
        this.A02.EUc(f3);
        float f4 = c114205Dh.A01;
        C114205Dh c114205Dh2 = this.A01;
        if (f4 != c114205Dh2.A01 || c114205Dh.A03 != c114205Dh2.A03) {
            if (c6m3 == C6M3.Vertical) {
                f4 = c114205Dh.A03;
                f = c114205Dh.A00;
            } else {
                f = c114205Dh.A02;
            }
            C57F c57f = this.A03;
            float B72 = c57f.B72();
            float f5 = i;
            float f6 = B72 + f5;
            if (f > f6 || (f4 < B72 && f - f4 > f5)) {
                f2 = f - f6;
            } else if (f4 < B72 && f - f4 <= f5) {
                f2 = f4 - B72;
            } else {
                f2 = 0.0f;
            }
            c57f.EUc(c57f.B72() + f2);
            this.A01 = c114205Dh;
        }
        C57F c57f2 = this.A03;
        c57f2.EUc(C17s.A02(c57f2.B72(), 0.0f, f3));
    }

    public C28364CfO(C6M3 c6m3, float f) {
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A03 = new ParcelableSnapshotMutableFloatState(f);
        this.A02 = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A01 = C114205Dh.A04;
        this.A00 = C5C2.A01;
        this.A04 = AbstractC25229BEm.A0R(c6m3);
    }

    public C28364CfO() {
        this(C6M3.Vertical, 0.0f);
    }
}
