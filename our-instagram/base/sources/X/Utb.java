package X;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class Utb extends C70469WYa implements XLA {
    public final XC8[] A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Utb(XC8... xc8Arr) {
        super((XC8[]) Arrays.copyOf(xc8Arr, xc8Arr.length));
        C14360o3.A0B(xc8Arr, 1);
        this.A00 = xc8Arr;
    }

    @Override // X.XLB
    public final void D7n(Exception exc) {
        for (XC8 xc8 : this.A00) {
            if (xc8 instanceof XLB) {
                ((XLB) xc8).D7n(exc);
            }
        }
    }
}
