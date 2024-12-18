package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.XOq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72119XOq implements InterfaceC61432r6 {
    public final C129635tS A00;
    public final InterfaceC129665tV A01;

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        C14360o3.A0B(str, 0);
        return this.A01.AUb(str);
    }

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        EnumC64262vl enumC64262vl;
        C38321qM c38321qM;
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        AbstractC167027dH.A12(anonymousClass317, abstractC127945qN, obj2);
        C14360o3.A0B(c6t6, 3);
        if (anonymousClass317 == AnonymousClass317.A0C) {
            C206209Bd c206209Bd = c6t6.A00;
            if (c206209Bd != null) {
                C129635tS c129635tS = this.A00;
                C130505uv c130505uv = abstractC127945qN.A03;
                if (c130505uv != null && (c38321qM = c130505uv.A0A) != null && !c38321qM.CdW()) {
                    enumC64262vl = EnumC64262vl.A04;
                } else {
                    enumC64262vl = EnumC64262vl.A05;
                }
                c129635tS.A00(c206209Bd, enumC64262vl, abstractC127945qN, obj2);
                return;
            }
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, AbstractC111324zv.A00(710), AbstractC166987dD.A1C());
    }

    public C72119XOq(InterfaceC129665tV interfaceC129665tV, C129635tS c129635tS) {
        this.A00 = c129635tS;
        this.A01 = interfaceC129665tV;
    }
}
