package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.Iza, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42984Iza implements InterfaceC61432r6 {
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
        EnumC64262vl enumC64262vl;
        C41181vS c41181vS = (C41181vS) obj;
        AbstractC167027dH.A12(anonymousClass317, c41181vS, obj2);
        C14360o3.A0B(c6t6, 3);
        if (anonymousClass317 == AnonymousClass317.A05) {
            XVS xvs = c6t6.A01;
            if (xvs != null) {
                C41209ILy c41209ILy = this.A00;
                C38321qM c38321qM = c41181vS.A0b;
                if (c38321qM != null) {
                    enumC64262vl = AbstractC37302Gc3.A0O(c38321qM);
                } else {
                    enumC64262vl = EnumC64262vl.A06;
                }
                c41209ILy.A00(xvs, enumC64262vl, c41181vS, obj2);
                return;
            }
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in AFIRealtimeSignalProviderImpl: ", AbstractC166987dD.A1C());
    }

    public C42984Iza(InterfaceC25223BDy interfaceC25223BDy, C41209ILy c41209ILy) {
        this.A00 = c41209ILy;
        this.A01 = interfaceC25223BDy;
    }
}
