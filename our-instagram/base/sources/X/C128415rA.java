package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.5rA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128415rA {
    public final UserSession A00;
    public final InterfaceC25391Lt A01;
    public final EnumC64222vh A02;
    public final InterfaceC128405r9 A03;

    public final void A00(EnumC64262vl enumC64262vl, Object obj, Object obj2, String str) {
        InterfaceC25391Lt interfaceC25391Lt = this.A01;
        String obj3 = UUID.randomUUID().toString();
        C14360o3.A07(obj3);
        AnonymousClass317 anonymousClass317 = AnonymousClass317.A0Y;
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A03;
        EnumC64222vh enumC64222vh = this.A02;
        InterfaceC128405r9 interfaceC128405r9 = this.A03;
        interfaceC25391Lt.DVh(new C9BW(new C9C7(interfaceC128405r9.AUg(obj), enumC64262vl, enumC74603Ws, anonymousClass317, enumC64222vh, obj3), interfaceC128405r9.AUh(obj, obj2, str)));
    }

    public /* synthetic */ C128415rA(UserSession userSession, EnumC64222vh enumC64222vh, InterfaceC128405r9 interfaceC128405r9) {
        InterfaceC25391Lt A00 = C25361Lq.A00(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 3);
        this.A00 = userSession;
        this.A01 = A00;
        this.A03 = interfaceC128405r9;
        this.A02 = enumC64222vh;
    }
}
