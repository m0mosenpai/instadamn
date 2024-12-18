package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* renamed from: X.CmL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28729CmL implements C6M4 {
    public static final C5C7 A08 = new C5C6(DJ7.A00, DZM.A00);
    public float A00;
    public InterfaceC119545bC A01;
    public final C5XO A02;
    public final InterfaceC119545bC A03;
    public final InterfaceC119545bC A04;
    public final C6M4 A05;
    public final InterfaceC74963Ym A06;
    public final InterfaceC74963Ym A07;

    @Override // X.C6M4
    public final float APr(float f) {
        return this.A05.APr(f);
    }

    @Override // X.C6M4
    public final boolean Akm() {
        return AbstractC25231BEo.A1U(this.A06);
    }

    @Override // X.C6M4
    public final boolean Akn() {
        return AbstractC25231BEo.A1U(this.A07);
    }

    @Override // X.C6M4
    public final boolean CcT() {
        return this.A05.CcT();
    }

    @Override // X.C6M4
    public final Object EMA(EnumC27348C5d enumC27348C5d, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object EMA = this.A05.EMA(enumC27348C5d, interfaceC23621Ds, interfaceC16620sF);
        if (EMA != C1JX.A02) {
            return C0eB.A00;
        }
        return EMA;
    }

    public C28729CmL(int i) {
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A03 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableIntState(0);
        this.A02 = new C5XN();
        this.A01 = new ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
        this.A05 = new C6MA(DRS.A00(this, 18));
        this.A07 = AbstractC25225BEi.A0L(null, new DGT(this, 11));
        this.A06 = DGT.A00(null, this, 10);
    }
}
