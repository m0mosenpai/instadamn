package X;

/* loaded from: classes10.dex */
public final class TEX implements InterfaceC65526Tlv {
    public static final TEX A00 = new Object();

    @Override // X.InterfaceC65526Tlv
    public final boolean Ce4(Class cls) {
        return RaB.class.isAssignableFrom(cls);
    }

    @Override // X.InterfaceC65526Tlv
    public final SHr CpY(Class cls) {
        if (RaB.class.isAssignableFrom(cls)) {
            try {
                Class asSubclass = cls.asSubclass(RaB.class);
                RaB raB = (RaB) RaB.defaultInstanceMap.get(asSubclass);
                if (raB == null) {
                    try {
                        AbstractC58320PtC.A1K(asSubclass);
                        raB = (RaB) RaB.defaultInstanceMap.get(asSubclass);
                        if (raB == null) {
                            raB = (RaB) ((RaB) C63388Sj4.A01(asSubclass)).A03(C05F.A0j);
                            if (raB != null) {
                                TEY.A03(asSubclass, raB);
                            } else {
                                throw AbstractC58318PtA.A0Z();
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (SHr) raB.A03(C05F.A0C);
            } catch (Exception e2) {
                throw AbstractC58318PtA.A0e(AbstractC58319PtB.A0t(cls, "Unable to get message info for "), e2);
            }
        }
        throw AbstractC167007dF.A0c("Unsupported message type: ", cls.getName());
    }
}
