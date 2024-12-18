package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import java.util.List;

/* renamed from: X.Cmm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28754Cmm implements C6M8 {
    public final LazyGridState A00;

    @Override // X.C6M8
    public final float AF6(int i) {
        int i2;
        Object obj;
        long j;
        int A06;
        LazyGridState lazyGridState = this.A00;
        C28836Co6 c28836Co6 = (C28836Co6) lazyGridState.A00();
        List list = c28836Co6.A0C;
        if (list.isEmpty()) {
            return 0.0f;
        }
        int size = list.size();
        boolean z = false;
        int i3 = 0;
        while (true) {
            i2 = 1;
            if (i3 < size) {
                obj = list.get(i3);
                if (((C28760Cms) ((InterfaceC58206PrC) obj)).A08 == i) {
                    break;
                }
                i3++;
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC58206PrC interfaceC58206PrC = (InterfaceC58206PrC) obj;
        if (interfaceC58206PrC == null) {
            int i4 = ((C28836Co6) lazyGridState.A0H.getValue()).A05;
            boolean A1X = AbstractC167007dF.A1X(c28836Co6.A09, C6M3.Vertical);
            DHP dhp = new DHP(1, list, A1X);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < list.size()) {
                int A0H = AbstractC166987dD.A0H(dhp.invoke(Integer.valueOf(i5)));
                if (A0H == -1) {
                    i5++;
                } else {
                    int i8 = 0;
                    while (i5 < list.size() && AbstractC166987dD.A0H(dhp.invoke(Integer.valueOf(i5))) == A0H) {
                        long j2 = ((C28760Cms) ((InterfaceC58206PrC) list.get(i5))).A0B;
                        if (A1X) {
                            A06 = C119055aN.A00(j2);
                        } else {
                            A06 = AbstractC25225BEi.A06(j2);
                        }
                        i8 = Math.max(i8, A06);
                        i5++;
                    }
                    i6 += i8;
                    i7++;
                }
            }
            int i9 = (i6 / i7) + c28836Co6.A04;
            if (i < B6n()) {
                z = true;
            }
            int B6n = i - B6n();
            int i10 = i4 - 1;
            if (z) {
                i2 = -1;
            }
            return (i9 * ((B6n + (i10 * i2)) / i4)) - B6o();
        }
        C6M3 c6m3 = c28836Co6.A09;
        C6M3 c6m32 = C6M3.Vertical;
        long j3 = ((C28760Cms) interfaceC58206PrC).A05;
        if (c6m3 == c6m32) {
            j = j3 & 4294967295L;
        } else {
            j = j3 >> 32;
        }
        return (int) j;
    }

    @Override // X.C6M8
    public final int B6n() {
        return this.A00.A09.A03.BIi();
    }

    @Override // X.C6M8
    public final int B6o() {
        return this.A00.A09.A04.BIi();
    }

    @Override // X.C6M8
    public final int BM2() {
        InterfaceC58206PrC interfaceC58206PrC = (InterfaceC58206PrC) AbstractC001800i.A0L(((C28836Co6) this.A00.A00()).A0C);
        if (interfaceC58206PrC != null) {
            return ((C28760Cms) interfaceC58206PrC).A08;
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
        return ((C28836Co6) this.A00.A00()).A06;
    }

    public C28754Cmm(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }
}
