package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.5tS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129635tS {
    public final UserSession A00;
    public final InterfaceC129625tR A01;
    public final InterfaceC25391Lt A02;
    public final EnumC64222vh A03;

    public final void A00(C206209Bd c206209Bd, EnumC64262vl enumC64262vl, Object obj, Object obj2) {
        InterfaceC25391Lt interfaceC25391Lt = this.A02;
        String obj3 = UUID.randomUUID().toString();
        C14360o3.A07(obj3);
        AnonymousClass317 anonymousClass317 = AnonymousClass317.A0C;
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A03;
        EnumC64222vh enumC64222vh = this.A03;
        InterfaceC129625tR interfaceC129625tR = this.A01;
        interfaceC25391Lt.DVh(new C9BW(new C9C7(interfaceC129625tR.AUA(obj, obj2), enumC64262vl, enumC74603Ws, anonymousClass317, enumC64222vh, obj3), interfaceC129625tR.AUB(c206209Bd, obj, obj2)));
    }

    public /* synthetic */ C129635tS(UserSession userSession, InterfaceC129625tR interfaceC129625tR, EnumC64222vh enumC64222vh) {
        InterfaceC25391Lt A00 = C25361Lq.A00(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 3);
        this.A00 = userSession;
        this.A02 = A00;
        this.A01 = interfaceC129625tR;
        this.A03 = enumC64222vh;
    }
}
