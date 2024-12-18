package X;

/* renamed from: X.8gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC192958gb {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.8ga, java.lang.Object] */
    public static C192948ga A00(C102814kI c102814kI, InterfaceC102764kD interfaceC102764kD) {
        String Ep1;
        ?? obj = new Object();
        if (interfaceC102764kD.E3x() != C05F.A0C) {
            interfaceC102764kD.EmB();
            return null;
        }
        while (interfaceC102764kD.Csy() != C05F.A0N) {
            String E3u = interfaceC102764kD.E3u();
            boolean z = false;
            if (AbstractC102804kH.A00(E3u) >= 32) {
                z = true;
            }
            interfaceC102764kD.Csy();
            if (!z) {
                if ("payload".equals(E3u)) {
                    if (interfaceC102764kD.E3y().isNull()) {
                        Ep1 = null;
                    } else {
                        Ep1 = interfaceC102764kD.E3y().Ep1();
                    }
                    obj.A01 = Ep1;
                } else if ("layout".equals(E3u)) {
                    obj.A00 = AbstractC102784kF.A00(c102814kI, interfaceC102764kD);
                }
            }
            interfaceC102764kD.EmB();
        }
        return obj;
    }
}
