package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.IzX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42981IzX implements InterfaceC61432r6 {
    public final C127395pI A00;
    public final InterfaceC127425pL A01;

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167027dH.A12(anonymousClass317, c120985dq, obj2);
        if (anonymousClass317 == AnonymousClass317.A0G) {
            this.A00.A00(AbstractC37303Gc4.A0G(c120985dq), anonymousClass317, c120985dq, obj2);
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in MediaSwipeLeftRealtimeSignalProviderImpl: ", AbstractC166987dD.A1C());
    }

    public C42981IzX(InterfaceC127425pL interfaceC127425pL, C127395pI c127395pI) {
        this.A00 = c127395pI;
        this.A01 = interfaceC127425pL;
    }

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        return AbstractC06930Yk.A0E();
    }
}
