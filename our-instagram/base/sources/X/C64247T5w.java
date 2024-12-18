package X;

import java.util.Map;

/* renamed from: X.T5w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64247T5w implements InterfaceC65515Tlk {
    public static final C64247T5w A00 = new Object();

    @Override // X.InterfaceC65515Tlk
    public final InterfaceC65254Tgk FFo(Class cls) {
        if (RLJ.class.isAssignableFrom(cls)) {
            try {
                Class asSubclass = cls.asSubclass(RLJ.class);
                Map map = RLJ.zzb;
                RLJ rlj = (RLJ) map.get(asSubclass);
                if (rlj == null) {
                    try {
                        AbstractC58320PtC.A1K(asSubclass);
                        rlj = (RLJ) map.get(asSubclass);
                        if (rlj == null) {
                            C63405Sja.A04(asSubclass);
                            rlj = RLP.zzb;
                            if (rlj != null) {
                                map.put(asSubclass, rlj);
                            } else {
                                throw AbstractC58318PtA.A0Z();
                            }
                        }
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Class initialization cannot fail.", e);
                    }
                }
                return (InterfaceC65254Tgk) rlj.A02(3);
            } catch (Exception e2) {
                throw AbstractC58318PtA.A0e("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
            }
        }
        throw AbstractC166987dD.A12("Unsupported message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // X.InterfaceC65515Tlk
    public final boolean FG1(Class cls) {
        return RLJ.class.isAssignableFrom(cls);
    }
}
