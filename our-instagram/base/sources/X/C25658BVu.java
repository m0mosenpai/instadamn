package X;

import java.util.List;

/* renamed from: X.BVu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25658BVu implements C6M8 {
    public final /* synthetic */ BVY A00;

    @Override // X.C6M8
    public final void EmI(C6MC c6mc, int i, int i2) {
        this.A00.A07(i, i2 / r1.A05());
    }

    public C25658BVu(BVY bvy) {
        this.A00 = bvy;
    }

    @Override // X.C6M8
    public final float AF6(int i) {
        Object obj;
        BVY bvy = this.A00;
        List list = AbstractC25230BEn.A0S(bvy.A0C).A0F;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = list.get(i2);
                if (((BWF) ((InterfaceC30776DgD) obj)).A03 == i) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        if (((InterfaceC30776DgD) obj) == null) {
            return ((i - bvy.A03()) * (((BVX) r6.getValue()).A05 + ((BVX) r6.getValue()).A06)) - (bvy.A0N.A04.B72() * bvy.A05());
        }
        return ((BWF) r1).A01;
    }

    @Override // X.C6M8
    public final int B6n() {
        return this.A00.A02;
    }

    @Override // X.C6M8
    public final int B6o() {
        return this.A00.A03;
    }

    @Override // X.C6M8
    public final int BM2() {
        return ((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0K(AbstractC25230BEn.A0S(this.A00.A0C).A0F))).A03;
    }

    @Override // X.C6M8
    public final Object EMB(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object A01 = BVY.A01(EnumC27348C5d.Default, this.A00, interfaceC23621Ds, interfaceC16620sF);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    @Override // X.C6M8
    public final int getItemCount() {
        return this.A00.A04();
    }
}
