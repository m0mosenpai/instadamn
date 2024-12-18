package X;

/* loaded from: classes9.dex */
public abstract class NsX {
    public static final int A00(InterfaceC58113Ppc interfaceC58113Ppc, int i) {
        C14360o3.A0B(interfaceC58113Ppc, 0);
        if (interfaceC58113Ppc.BsJ() > 0) {
            if (i >= 0) {
                int BsJ = interfaceC58113Ppc.BsJ();
                for (int i2 = 0; i2 < BsJ; i2++) {
                    if (i >= interfaceC58113Ppc.BsQ(i2) && i < interfaceC58113Ppc.BsN(i2)) {
                        return i2;
                    }
                }
                if (i < interfaceC58113Ppc.BsQ(0)) {
                    return 0;
                }
                return interfaceC58113Ppc.BsJ() - 1;
            }
            throw AbstractC166987dD.A14("timelinePositionInMs must be >= 0");
        }
        throw AbstractC166987dD.A14("segment count must be > 0");
    }
}
