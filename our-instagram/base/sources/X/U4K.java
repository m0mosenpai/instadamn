package X;

import android.util.LongSparseArray;

/* loaded from: classes11.dex */
public final class U4K {
    public final LongSparseArray A00;
    public final LongSparseArray A01;
    public final C78473fD A02;

    public U4K(C78473fD c78473fD, C102884kP c102884kP) {
        this.A02 = c78473fD;
        int i = c102884kP.A04;
        LongSparseArray longSparseArray = new LongSparseArray(c102884kP.A0M().size());
        InterfaceC09390do interfaceC09390do = c78473fD.A06;
        C78463fC c78463fC = (C78463fC) interfaceC09390do.getValue();
        Long valueOf = Long.valueOf(i);
        c78463fC.A01(valueOf, longSparseArray);
        this.A01 = longSparseArray;
        this.A00 = (LongSparseArray) ((C78463fC) interfaceC09390do.getValue()).A00(valueOf);
    }
}
