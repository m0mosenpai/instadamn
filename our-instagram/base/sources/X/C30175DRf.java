package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.DRf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30175DRf extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30175DRf(C6MC c6mc, InterfaceC16660sJ interfaceC16660sJ, C15080pO c15080pO, float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        if (i != 0) {
            this.A02 = c15080pO;
            this.A04 = c6mc;
            this.A03 = interfaceC16660sJ;
        } else {
            this.A03 = c15080pO;
            this.A04 = c6mc;
            this.A02 = interfaceC16660sJ;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC74953Yl interfaceC74953Yl;
        Object valueOf;
        C15080pO c15080pO;
        float f;
        switch (this.A01) {
            case 0:
                C62T c62t = (C62T) obj;
                InterfaceC74953Yl interfaceC74953Yl2 = c62t.A06;
                float abs = Math.abs(AbstractC25231BEo.A04(interfaceC74953Yl2));
                float f2 = this.A00;
                float abs2 = Math.abs(f2);
                float A04 = AbstractC25231BEo.A04(interfaceC74953Yl2);
                if (abs >= abs2) {
                    if (f2 == 0.0f) {
                        A04 = 0.0f;
                    } else if (f2 <= 0.0f ? A04 < f2 : A04 > f2) {
                        A04 = f2;
                    }
                    C15080pO c15080pO2 = (C15080pO) this.A03;
                    float f3 = A04 - c15080pO2.A00;
                    C6MC c6mc = (C6MC) this.A04;
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                    float EMD = c6mc.EMD(f3);
                    AbstractC25226BEj.A1T(interfaceC16660sJ, EMD);
                    if (AbstractC166987dD.A01(f3, EMD) > 0.5f) {
                        c62t.A00();
                    }
                    c62t.A00();
                    c15080pO2.A00 = A04;
                    return C0eB.A00;
                }
                c15080pO = (C15080pO) this.A03;
                float f4 = A04 - c15080pO.A00;
                C6MC c6mc2 = (C6MC) this.A04;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A02;
                float EMD2 = c6mc2.EMD(f4);
                AbstractC25226BEj.A1T(interfaceC16660sJ2, EMD2);
                if (AbstractC166987dD.A01(f4, EMD2) > 0.5f) {
                    c62t.A00();
                }
                f = AbstractC25231BEo.A04(interfaceC74953Yl2);
                c15080pO.A00 = f;
                return C0eB.A00;
            case 1:
                C62T c62t2 = (C62T) obj;
                InterfaceC74953Yl interfaceC74953Yl3 = c62t2.A06;
                float A042 = AbstractC25231BEo.A04(interfaceC74953Yl3);
                float f5 = this.A00;
                if (f5 == 0.0f) {
                    A042 = 0.0f;
                } else if (f5 <= 0.0f ? A042 < f5 : A042 > f5) {
                    A042 = f5;
                }
                c15080pO = (C15080pO) this.A02;
                float f6 = A042 - c15080pO.A00;
                float EMD3 = ((C6MC) this.A04).EMD(f6);
                AbstractC25226BEj.A1T((InterfaceC16660sJ) this.A03, EMD3);
                if (AbstractC166987dD.A01(f6, EMD3) > 0.5f || A042 != AbstractC25231BEo.A04(interfaceC74953Yl3)) {
                    c62t2.A00();
                }
                f = c15080pO.A00 + EMD3;
                c15080pO.A00 = f;
                return C0eB.A00;
            case 2:
                long j = ((C119365at) obj).A00;
                if (C119365at.A01(j) > this.A00) {
                    float A02 = C119365at.A02(j);
                    if (A02 > AbstractC25231BEo.A03((InterfaceC74953Yl) this.A03) && A02 < AbstractC25231BEo.A03((InterfaceC74953Yl) this.A04)) {
                        interfaceC74953Yl = (InterfaceC74953Yl) this.A02;
                        valueOf = AbstractC166997dE.A0b();
                        interfaceC74953Yl.Egh(valueOf);
                    }
                }
                return C0eB.A00;
            case 3:
                InterfaceC1131459c interfaceC1131459c = (InterfaceC1131459c) obj;
                C14360o3.A0B(interfaceC1131459c, 0);
                float A00 = AbstractC46673Kkq.A00((GifUrlImpl) this.A02);
                interfaceC74953Yl = (InterfaceC74953Yl) this.A04;
                AbstractC25227BEk.A19(interfaceC74953Yl, AbstractC25225BEi.A06(interfaceC1131459c.Bxd()));
                int i = 0;
                if (this.A00 != A00) {
                    InterfaceC74953Yl interfaceC74953Yl4 = (InterfaceC74953Yl) this.A03;
                    AbstractC25227BEk.A19(interfaceC74953Yl4, C119055aN.A00(interfaceC1131459c.Bxd()));
                    if (A00 <= 1.0f) {
                        i = AbstractC25231BEo.A0E(interfaceC74953Yl4);
                    }
                    valueOf = Integer.valueOf(i);
                    interfaceC74953Yl.Egh(valueOf);
                }
                return C0eB.A00;
            case 4:
                C29271CvS c29271CvS = (C29271CvS) this.A03;
                C162987Rj c162987Rj = (C162987Rj) this.A02;
                c29271CvS.A00 = new CP0(c162987Rj);
                float f7 = this.A00;
                C7T7 c7t7 = (C7T7) this.A04;
                c162987Rj.A02(f7, c7t7.A01.A00, c7t7.A06);
                return new C25240BEy(14, c29271CvS, c162987Rj);
            default:
                float EqH = ((InterfaceC1128957x) this.A02).EqH(AbstractC166987dD.A09(obj)) * this.A00;
                C15080pO c15080pO3 = (C15080pO) this.A04;
                float f8 = c15080pO3.A00 + EqH;
                c15080pO3.A00 = f8;
                AbstractC25226BEj.A1T((InterfaceC16660sJ) this.A03, f8);
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30175DRf(Object obj, Object obj2, Object obj3, float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        this.A03 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
    }
}
