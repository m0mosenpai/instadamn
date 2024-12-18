package X;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GkL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37806GkL implements InterfaceC61432r6 {
    public final C5Jq A00;
    public final C5Js A01;

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167027dH.A12(anonymousClass317, c120985dq, obj2);
        if (anonymousClass317 == AnonymousClass317.A0D) {
            this.A00.A00(AbstractC37303Gc4.A0G(c120985dq), c120985dq, obj2);
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in LikeUnlikeRealtimeSignalProviderImpl for Clips: ", AbstractC166987dD.A1C());
    }

    public C37806GkL(C5Js c5Js, C5Jq c5Jq) {
        this.A00 = c5Jq;
        this.A01 = c5Js;
    }

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        LinkedHashMap A0i = AbstractC37302Gc3.A0i(str);
        C5Jr c5Jr = (C5Jr) this.A01;
        InterfaceC25391Lt interfaceC25391Lt = c5Jr.A02;
        List EMt = interfaceC25391Lt.EMt(c5Jr.A03);
        if (!c5Jr.A05) {
            interfaceC25391Lt.EGJ(EMt);
        }
        A0i.putAll(c5Jr.A00.A00(str, EMt));
        return A0i;
    }
}
