package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.6MA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6MA implements C6M4 {
    public final InterfaceC74953Yl A02;
    public final InterfaceC74953Yl A03;
    public final InterfaceC74953Yl A04;
    public final InterfaceC16660sJ A05;
    public final C6MC A01 = new C6MC() { // from class: X.6MB
        @Override // X.C6MC
        public final float EMD(float f) {
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            C6MA c6ma = C6MA.this;
            float floatValue = ((Number) c6ma.A05.invoke(Float.valueOf(f))).floatValue();
            InterfaceC74953Yl interfaceC74953Yl = c6ma.A03;
            boolean z = true;
            boolean z2 = false;
            if (floatValue > 0.0f) {
                z2 = true;
            }
            interfaceC74953Yl.Egh(Boolean.valueOf(z2));
            InterfaceC74953Yl interfaceC74953Yl2 = c6ma.A02;
            if (floatValue >= 0.0f) {
                z = false;
            }
            interfaceC74953Yl2.Egh(Boolean.valueOf(z));
            return floatValue;
        }
    };
    public final C6MD A00 = new C6MD();

    @Override // X.C6M4
    public final Object EMA(EnumC27348C5d enumC27348C5d, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object A00 = AnonymousClass194.A00(interfaceC23621Ds, new C9DH(this, enumC27348C5d, interfaceC16620sF, null, 1));
        if (A00 != C1JX.A02) {
            return C0eB.A00;
        }
        return A00;
    }

    @Override // X.C6M4
    public final float APr(float f) {
        return ((Number) this.A05.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // X.C6M4
    public final /* synthetic */ boolean Akm() {
        return true;
    }

    @Override // X.C6M4
    public final /* synthetic */ boolean Akn() {
        return true;
    }

    @Override // X.C6M4
    public final boolean CcT() {
        return ((Boolean) this.A04.getValue()).booleanValue();
    }

    public C6MA(InterfaceC16660sJ interfaceC16660sJ) {
        this.A05 = interfaceC16660sJ;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A04 = new ParcelableSnapshotMutableState(A00, false);
        this.A03 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), false);
        this.A02 = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), false);
    }
}
