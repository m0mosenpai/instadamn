package X;

import com.google.protobuf.UnsafeUtil;

/* loaded from: classes10.dex */
public final class TEP implements InterfaceC65525Tlu {
    public static final TEP A00 = new Object();

    @Override // X.InterfaceC65525Tlu
    public final boolean Ce4(Class cls) {
        return RYn.class.isAssignableFrom(cls);
    }

    @Override // X.InterfaceC65525Tlu
    public final C62590SHq CpX(Class cls) {
        if (RYn.class.isAssignableFrom(cls)) {
            try {
                Class asSubclass = cls.asSubclass(RYn.class);
                RYn rYn = (RYn) RYn.defaultInstanceMap.get(asSubclass);
                if (rYn == null) {
                    try {
                        AbstractC58320PtC.A1K(asSubclass);
                        rYn = (RYn) RYn.defaultInstanceMap.get(asSubclass);
                        if (rYn == null) {
                            rYn = (RYn) ((RYn) UnsafeUtil.A02(asSubclass)).A0K(C05F.A0j, null, null);
                            if (rYn != null) {
                                RYn.defaultInstanceMap.put(asSubclass, rYn);
                            } else {
                                throw AbstractC58318PtA.A0Z();
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (C62590SHq) rYn.A0K(C05F.A0C, null, null);
            } catch (Exception e2) {
                throw AbstractC58318PtA.A0e(AbstractC58319PtB.A0t(cls, "Unable to get message info for "), e2);
            }
        }
        throw AbstractC167007dF.A0c("Unsupported message type: ", cls.getName());
    }
}
