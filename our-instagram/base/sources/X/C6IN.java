package X;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;

/* renamed from: X.6IN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6IN implements C6M8 {
    public final LazyListState A00;

    @Override // X.C6M8
    public final float AF6(int i) {
        Object obj;
        List list = ((C6IF) this.A00.A02()).A0D;
        if (list.isEmpty()) {
            return 0.0f;
        }
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = list.get(i2);
                if (((C137036Ig) ((InterfaceC137046Ii) obj)).A07 == i) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        if (((InterfaceC137046Ii) obj) == null) {
            int size2 = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                i3 += ((C137036Ig) ((InterfaceC137046Ii) list.get(i4))).A09;
            }
            return (((i3 / list.size()) + r5.A05) * (i - r4.A00())) - r4.A01();
        }
        return ((C137036Ig) r1).A02;
    }

    @Override // X.C6M8
    public final int B6n() {
        return this.A00.A00();
    }

    @Override // X.C6M8
    public final int B6o() {
        return this.A00.A01();
    }

    @Override // X.C6M8
    public final int BM2() {
        InterfaceC137046Ii interfaceC137046Ii = (InterfaceC137046Ii) AbstractC001800i.A0L(((C6IF) this.A00.A02()).A0D);
        if (interfaceC137046Ii != null) {
            return ((C137036Ig) interfaceC137046Ii).A07;
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
        this.A00.A05(i, i2);
    }

    @Override // X.C6M8
    public final int getItemCount() {
        return ((C6IF) this.A00.A02()).A06;
    }

    public C6IN(LazyListState lazyListState) {
        this.A00 = lazyListState;
    }
}
