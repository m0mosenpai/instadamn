package X;

import java.util.Map;

/* renamed from: X.Nns, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53647Nns {
    public static void A00(Map map, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16510rw interfaceC16510rw) {
        if (!map.containsKey(interfaceC16510rw)) {
            map.put(interfaceC16510rw, new C186258Nt(interfaceC16660sJ, interfaceC16510rw));
            return;
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0S("A `initializer` with the same `clazz` has already been added: ", AbstractC13230m9.A00(((C0YZ) interfaceC16510rw).A00), '.'));
    }
}
