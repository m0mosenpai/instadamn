package X;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.TVc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64813TVc implements InterfaceC08830cm {
    public final InterfaceC08830cm A00;

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        InterfaceC65401TjY interfaceC65401TjY = (InterfaceC65401TjY) this.A00.get();
        HashMap A1G = AbstractC166987dD.A1G();
        EnumC61103RfI enumC61103RfI = EnumC61103RfI.DEFAULT;
        java.util.Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            if ("".isEmpty()) {
                A1G.put(enumC61103RfI, new RF0(emptySet, 30000L));
                EnumC61103RfI enumC61103RfI2 = EnumC61103RfI.HIGHEST;
                java.util.Set emptySet2 = Collections.emptySet();
                if (emptySet2 != null) {
                    A1G.put(enumC61103RfI2, new RF0(emptySet2, 1000L));
                    EnumC61103RfI enumC61103RfI3 = EnumC61103RfI.VERY_LOW;
                    if (Collections.emptySet() != null) {
                        java.util.Set unmodifiableSet = Collections.unmodifiableSet(AbstractC58319PtB.A13(new EnumC61104RfJ[]{EnumC61104RfJ.NETWORK_UNMETERED, EnumC61104RfJ.DEVICE_IDLE}));
                        if (unmodifiableSet != null) {
                            A1G.put(enumC61103RfI3, new RF0(unmodifiableSet, 86400000L));
                            if (interfaceC65401TjY != null) {
                                if (A1G.keySet().size() >= EnumC61103RfI.values().length) {
                                    return new RF1(interfaceC65401TjY, A1G);
                                }
                                throw AbstractC166987dD.A14("Not all priorities have been configured");
                            }
                            throw AbstractC166987dD.A15("missing required property: clock");
                        }
                        throw AbstractC166987dD.A15("Null flags");
                    }
                    throw AbstractC166987dD.A15("Null flags");
                }
                throw AbstractC166987dD.A15("Null flags");
            }
            throw AbstractC31175DnJ.A0V("Missing required properties:", "");
        }
        throw AbstractC166987dD.A15("Null flags");
    }

    public C64813TVc(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
