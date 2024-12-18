package X;

import java.util.List;

/* loaded from: classes10.dex */
public abstract class SK5 {
    public static final SK5 A00 = new Object();
    public static final SK5 A01 = new Object();

    public final List A01(Object msg, long offset) {
        if (this instanceof RVF) {
            InterfaceC65690TsC interfaceC65690TsC = (InterfaceC65690TsC) PxF.A00(msg, offset);
            if (!((AbstractC58537Px5) interfaceC65690TsC).A00) {
                InterfaceC65690TsC Cq4 = interfaceC65690TsC.Cq4(AbstractC58320PtC.A01(interfaceC65690TsC));
                C58546PxE.A05(msg, offset, Cq4);
                return Cq4;
            }
            return interfaceC65690TsC;
        }
        return RVG.A00(msg, 10, offset);
    }
}
