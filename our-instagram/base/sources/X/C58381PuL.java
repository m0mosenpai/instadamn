package X;

/* renamed from: X.PuL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58381PuL implements InterfaceC65465Tkh {
    public static final C58381PuL A00 = new Object();

    @Override // X.InterfaceC65465Tkh
    public final boolean Ce4(Class cls) {
        return AbstractC58374PuE.class.isAssignableFrom(cls);
    }

    @Override // X.InterfaceC65465Tkh
    public final InterfaceC65180TfO CpV(Class cls) {
        if (AbstractC58374PuE.class.isAssignableFrom(cls)) {
            try {
                Class asSubclass = cls.asSubclass(AbstractC58374PuE.class);
                AbstractC58374PuE abstractC58374PuE = (AbstractC58374PuE) AbstractC58374PuE.defaultInstanceMap.get(asSubclass);
                if (abstractC58374PuE == null) {
                    try {
                        AbstractC58320PtC.A1K(asSubclass);
                        abstractC58374PuE = (AbstractC58374PuE) AbstractC58374PuE.defaultInstanceMap.get(asSubclass);
                        if (abstractC58374PuE == null) {
                            abstractC58374PuE = (AbstractC58374PuE) ((AbstractC58374PuE) C58400Pue.A02(asSubclass)).A03(C05F.A0j, null, null);
                            if (abstractC58374PuE != null) {
                                AbstractC58374PuE.defaultInstanceMap.put(asSubclass, abstractC58374PuE);
                            } else {
                                throw AbstractC58318PtA.A0Z();
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (InterfaceC65180TfO) abstractC58374PuE.A03(C05F.A0C, null, null);
            } catch (Exception e2) {
                throw AbstractC58318PtA.A0e(AbstractC58319PtB.A0t(cls, "Unable to get message info for "), e2);
            }
        }
        throw AbstractC167007dF.A0c("Unsupported message type: ", cls.getName());
    }
}
