package X;

import androidx.compose.foundation.lazy.layout.DefaultLazyKey;

/* renamed from: X.6KS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6KS {
    public InterfaceC138166Nw A00() {
        return ((C138156Nt) this).A01;
    }

    public final Object A01(int i) {
        C6Nx AXC = A00().AXC(i);
        return ((InterfaceC138176Ny) AXC.A02).CBo().invoke(Integer.valueOf(i - AXC.A01));
    }

    public final Object A02(int i) {
        Object invoke;
        C6Nx AXC = A00().AXC(i);
        int i2 = i - AXC.A01;
        InterfaceC16660sJ BKh = ((InterfaceC138176Ny) AXC.A02).BKh();
        if (BKh == null || (invoke = BKh.invoke(Integer.valueOf(i2))) == null) {
            return new DefaultLazyKey(i);
        }
        return invoke;
    }
}
