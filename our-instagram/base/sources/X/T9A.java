package X;

/* loaded from: classes10.dex */
public final class T9A implements InterfaceC65521Tlq {
    public static final T9A A00 = new Object();

    @Override // X.InterfaceC65521Tlq
    public final boolean Ce4(Class messageType) {
        return AbstractC58533Px1.class.isAssignableFrom(messageType);
    }

    @Override // X.InterfaceC65521Tlq
    public final C62587SHm CpW(Class messageType) {
        if (AbstractC58533Px1.class.isAssignableFrom(messageType)) {
            try {
                Class asSubclass = messageType.asSubclass(AbstractC58533Px1.class);
                AbstractC58533Px1 abstractC58533Px1 = (AbstractC58533Px1) AbstractC58533Px1.defaultInstanceMap.get(asSubclass);
                if (abstractC58533Px1 == null) {
                    try {
                        AbstractC58320PtC.A1K(asSubclass);
                        abstractC58533Px1 = (AbstractC58533Px1) AbstractC58533Px1.defaultInstanceMap.get(asSubclass);
                        if (abstractC58533Px1 == null) {
                            abstractC58533Px1 = (AbstractC58533Px1) ((AbstractC58533Px1) C58546PxE.A01(asSubclass)).A0F(C05F.A0j);
                            if (abstractC58533Px1 != null) {
                                AbstractC58533Px1.defaultInstanceMap.put(asSubclass, abstractC58533Px1);
                            } else {
                                throw AbstractC58318PtA.A0Z();
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (C62587SHm) abstractC58533Px1.A0F(C05F.A0C);
            } catch (Exception e2) {
                throw AbstractC58318PtA.A0e(AbstractC58319PtB.A0t(messageType, "Unable to get message info for "), e2);
            }
        }
        throw AbstractC167007dF.A0c("Unsupported message type: ", messageType.getName());
    }
}
