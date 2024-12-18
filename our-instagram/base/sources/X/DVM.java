package X;

import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;

/* loaded from: classes5.dex */
public final class DVM extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C6M3 A01;
    public final /* synthetic */ InterfaceC1333460b A02;
    public final /* synthetic */ InterfaceC30772Dg9 A03;
    public final /* synthetic */ LazyStaggeredGridState A04;
    public final /* synthetic */ C5BH A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ C19L A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVM(C6M3 c6m3, InterfaceC1333460b interfaceC1333460b, InterfaceC30772Dg9 interfaceC30772Dg9, LazyStaggeredGridState lazyStaggeredGridState, C5BH c5bh, InterfaceC16820sZ interfaceC16820sZ, C19L c19l, float f, boolean z) {
        super(2);
        this.A04 = lazyStaggeredGridState;
        this.A01 = c6m3;
        this.A03 = interfaceC30772Dg9;
        this.A06 = interfaceC16820sZ;
        this.A02 = interfaceC1333460b;
        this.A08 = z;
        this.A00 = f;
        this.A07 = c19l;
        this.A05 = c5bh;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C1333560c c1333560c;
        float f;
        float f2;
        float f3;
        int A01;
        long A00;
        int i;
        int A012;
        InterfaceC16660sJ interfaceC16660sJ;
        InterfaceC138146Ns interfaceC138146Ns = (InterfaceC138146Ns) obj;
        long j = ((Constraints) obj2).A00;
        LazyStaggeredGridState lazyStaggeredGridState = this.A04;
        lazyStaggeredGridState.A0H.getValue();
        C6M3 c6m3 = this.A01;
        C6O3.A00(c6m3, j);
        C28767Cmz c28767Cmz = (C28767Cmz) this.A03;
        C27853CPq c27853CPq = c28767Cmz.A02;
        if (c27853CPq != null && c28767Cmz.A01 == j && c28767Cmz.A00 == interfaceC138146Ns.Awk()) {
            C14360o3.A0A(c27853CPq);
        } else {
            c28767Cmz.A01 = j;
            c28767Cmz.A00 = interfaceC138146Ns.Awk();
            c27853CPq = (C27853CPq) c28767Cmz.A03.invoke(interfaceC138146Ns, new Constraints(j));
            c28767Cmz.A02 = c27853CPq;
        }
        boolean A1X = AbstractC167007dF.A1X(c6m3, C6M3.Vertical);
        InterfaceC31144Dmj interfaceC31144Dmj = (InterfaceC31144Dmj) this.A06.invoke();
        InterfaceC1333460b interfaceC1333460b = this.A02;
        boolean z = this.A08;
        int ordinal = c6m3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c1333560c = (C1333560c) interfaceC1333460b;
                if (z) {
                    f = c1333560c.A01;
                } else {
                    f = c1333560c.A02;
                }
            } else {
                throw B4Z.A00();
            }
        } else {
            c1333560c = (C1333560c) interfaceC1333460b;
            if (z) {
                f = c1333560c.A00;
            } else {
                f = c1333560c.A03;
            }
        }
        int EL8 = interfaceC138146Ns.EL8(f);
        if (ordinal != 0) {
            if (z) {
                f2 = c1333560c.A02;
            } else {
                f2 = c1333560c.A01;
            }
        } else if (z) {
            f2 = c1333560c.A03;
        } else {
            f2 = c1333560c.A00;
        }
        int EL82 = interfaceC138146Ns.EL8(f2);
        if (ordinal != 0) {
            f3 = c1333560c.A03;
        } else {
            f3 = c1333560c.A02;
        }
        int EL83 = interfaceC138146Ns.EL8(f3);
        if (A1X) {
            A01 = Constraints.A00(j);
        } else {
            A01 = Constraints.A01(j);
        }
        int i2 = (A01 - EL8) - EL82;
        if (A1X) {
            A00 = AbstractC113765Bo.A00(EL83, EL8);
        } else {
            A00 = AbstractC113765Bo.A00(EL8, EL83);
        }
        int EL84 = interfaceC138146Ns.EL8(c1333560c.A02 + c1333560c.A01);
        int EL85 = interfaceC138146Ns.EL8(c1333560c.A03 + c1333560c.A00);
        C27853CPq c27853CPq2 = c27853CPq;
        CUT cut = new CUT(interfaceC138146Ns, interfaceC31144Dmj, c27853CPq2, lazyStaggeredGridState, this.A05, C6O5.A00(lazyStaggeredGridState.A08, interfaceC31144Dmj, lazyStaggeredGridState.A0A), this.A07, i2, EL8, EL82, interfaceC138146Ns.EL8(this.A00), Constraints.A04(C5AU.A03(j, EL84), Constraints.A01(j), C5AU.A02(j, EL85), Constraints.A00(j)), A00, A1X, z);
        C28356CfG c28356CfG = lazyStaggeredGridState.A0D;
        int[] iArr = c28356CfG.A02;
        int A002 = C6O4.A00(interfaceC31144Dmj, c28356CfG.A00, AbstractC25227BEk.A06(AbstractC009903n.A04(iArr, 0), 0));
        if (!AbstractC009903n.A0P(iArr, A002)) {
            c28356CfG.A04.A00(A002);
            Snapshot A02 = C3Z5.A02();
            if (A02 != null) {
                interfaceC16660sJ = A02.A03();
            } else {
                interfaceC16660sJ = null;
            }
            Snapshot A03 = C3Z5.A03(A02);
            try {
                iArr = (int[]) c28356CfG.A07.invoke(Integer.valueOf(A002), Integer.valueOf(iArr.length));
                C3Z5.A06(A02, A03, interfaceC16660sJ);
                c28356CfG.A02 = iArr;
                c28356CfG.A05.EWE(C28356CfG.A00(iArr));
            } catch (Throwable th) {
                C3Z5.A06(A02, A03, interfaceC16660sJ);
                throw th;
            }
        }
        int[] iArr2 = c28356CfG.A03;
        int length = iArr.length;
        int i3 = cut.A02;
        if (length != i3) {
            C28282CdU c28282CdU = cut.A09;
            c28282CdU.A03();
            int[] iArr3 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                if (i4 >= length || (A012 = iArr[i4]) == -1) {
                    if (i4 == 0) {
                        A012 = 0;
                    } else {
                        A012 = AbstractC28429Cgc.A01(iArr3, (i4 & 4294967295L) | AbstractC25230BEn.A0G()) + 1;
                    }
                }
                iArr3[i4] = A012;
                c28282CdU.A05(A012, i4);
            }
            iArr = iArr3;
        }
        int length2 = iArr2.length;
        if (length2 != i3) {
            int[] iArr4 = new int[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                if (i5 < length2) {
                    i = iArr2[i5];
                } else if (i5 == 0) {
                    i = 0;
                } else {
                    i = iArr4[i5 - 1];
                }
                iArr4[i5] = i;
            }
            iArr2 = iArr4;
        }
        C28837Co7 A022 = AbstractC28429Cgc.A02(cut, iArr, iArr2, Math.round(lazyStaggeredGridState.A00), true);
        lazyStaggeredGridState.A03(A022, false);
        return A022;
    }
}
