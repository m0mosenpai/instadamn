package X;

/* renamed from: X.NpK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC53731NpK {
    public static InterfaceC16820sZ A00(InterfaceC57797PkP interfaceC57797PkP, C51732MtD c51732MtD, Object obj, Object obj2) {
        InterfaceC16820sZ c57261Pbj;
        if (!(interfaceC57797PkP instanceof InterfaceC58273PsR)) {
            if (interfaceC57797PkP instanceof C48220LVu) {
                c57261Pbj = new ME7(11, c51732MtD, interfaceC57797PkP, obj2, obj);
            } else if (interfaceC57797PkP instanceof InterfaceC58272PsQ) {
                c57261Pbj = new C57261Pbj(18, c51732MtD, obj2, interfaceC57797PkP);
            } else {
                if (interfaceC57797PkP instanceof C55736Op5) {
                    throw AbstractC166987dD.A14("nested GranularSubscribers are not supported");
                }
                throw B4Z.A00();
            }
            return c57261Pbj;
        }
        throw AbstractC166987dD.A14("RpStateSubscriber not supported in granular subscribers");
    }
}
