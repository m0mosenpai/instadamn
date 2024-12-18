package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import java.util.List;

/* renamed from: X.Cmn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28755Cmn implements C6M8 {
    public final LazyStaggeredGridState A00;

    @Override // X.C6M8
    public final float AF6(int i) {
        Object obj;
        long j;
        int A06;
        InterfaceC74953Yl interfaceC74953Yl = this.A00.A0G;
        C28837Co7 A0D = AbstractC25235BEs.A0D(interfaceC74953Yl);
        List list = A0D.A0D;
        if (list.isEmpty()) {
            return 0.0f;
        }
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = list.get(i2);
                if (((C28761Cmt) ((InterfaceC30773DgA) obj)).A07 == i) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC30773DgA interfaceC30773DgA = (InterfaceC30773DgA) obj;
        if (interfaceC30773DgA == null) {
            int size2 = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                InterfaceC30773DgA interfaceC30773DgA2 = (InterfaceC30773DgA) list.get(i4);
                C6M3 c6m3 = A0D.A0A;
                C6M3 c6m32 = C6M3.Vertical;
                long j2 = ((C28761Cmt) interfaceC30773DgA2).A0B;
                if (c6m3 == c6m32) {
                    A06 = C119055aN.A00(j2);
                } else {
                    A06 = AbstractC25225BEi.A06(j2);
                }
                i3 += A06;
            }
            int size3 = (i3 / list.size()) + A0D.A05;
            int length = ((C28837Co7) interfaceC74953Yl.getValue()).A0B.A01.length;
            return (size3 * ((i / length) - (B6n() / length))) - B6o();
        }
        C6M3 c6m33 = A0D.A0A;
        C6M3 c6m34 = C6M3.Vertical;
        long j3 = ((C28761Cmt) interfaceC30773DgA).A03;
        if (c6m33 == c6m34) {
            j = j3 & 4294967295L;
        } else {
            j = j3 >> 32;
        }
        return (int) j;
    }

    @Override // X.C6M8
    public final int B6n() {
        return this.A00.A0D.A05.BIi();
    }

    @Override // X.C6M8
    public final int B6o() {
        return this.A00.A0D.A06.BIi();
    }

    @Override // X.C6M8
    public final int BM2() {
        InterfaceC30773DgA interfaceC30773DgA = (InterfaceC30773DgA) AbstractC001800i.A0L(AbstractC25235BEs.A0D(this.A00.A0G).A0D);
        if (interfaceC30773DgA != null) {
            return ((C28761Cmt) interfaceC30773DgA).A07;
        }
        return 0;
    }

    @Override // X.C6M8
    public final Object EMB(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        Object EMA = this.A00.EMA(EnumC27348C5d.Default, interfaceC23621Ds, interfaceC16620sF);
        if (EMA != C1JX.A02) {
            return C0eB.A00;
        }
        return EMA;
    }

    @Override // X.C6M8
    public final void EmI(C6MC c6mc, int i, int i2) {
        this.A00.A02(i, i2);
    }

    @Override // X.C6M8
    public final int getItemCount() {
        return AbstractC25235BEs.A0D(this.A00.A0G).A06;
    }

    public C28755Cmn(LazyStaggeredGridState lazyStaggeredGridState) {
        this.A00 = lazyStaggeredGridState;
    }
}
