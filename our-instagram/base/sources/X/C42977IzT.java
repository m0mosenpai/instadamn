package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.IzT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42977IzT implements InterfaceC61432r6 {
    public final C41209ILy A00;
    public final InterfaceC25223BDy A01;

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        C14360o3.A0B(str, 0);
        C42974IzQ c42974IzQ = (C42974IzQ) this.A01;
        InterfaceC25391Lt interfaceC25391Lt = c42974IzQ.A01;
        List EMt = interfaceC25391Lt.EMt(c42974IzQ.A02);
        if (!c42974IzQ.A03) {
            interfaceC25391Lt.EGJ(EMt);
        }
        return c42974IzQ.A00.A00(str, EMt);
    }

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167027dH.A12(anonymousClass317, c120985dq, obj2);
        C14360o3.A0B(c6t6, 3);
        if (anonymousClass317 == AnonymousClass317.A05) {
            XVS xvs = c6t6.A01;
            if (xvs != null) {
                this.A00.A00(xvs, AbstractC37303Gc4.A0G(c120985dq), c120985dq, obj2);
                return;
            }
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in AFIRealtimeSignalProviderImpl: ", AbstractC166987dD.A1C());
    }

    public C42977IzT(InterfaceC25223BDy interfaceC25223BDy, C41209ILy c41209ILy) {
        this.A00 = c41209ILy;
        this.A01 = interfaceC25223BDy;
    }
}
