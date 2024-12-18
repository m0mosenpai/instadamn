package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.5pI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127395pI {
    public final UserSession A00;
    public final InterfaceC127385pH A01;
    public final InterfaceC25391Lt A02;
    public final EnumC64222vh A03;

    public final void A00(EnumC64262vl enumC64262vl, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        InterfaceC25391Lt interfaceC25391Lt = this.A02;
        String obj3 = UUID.randomUUID().toString();
        C14360o3.A07(obj3);
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A03;
        EnumC64222vh enumC64222vh = this.A03;
        InterfaceC127385pH interfaceC127385pH = this.A01;
        interfaceC25391Lt.DVh(new C9BW(new C9C7(interfaceC127385pH.AU6(obj, obj2), enumC64262vl, enumC74603Ws, anonymousClass317, enumC64222vh, obj3), interfaceC127385pH.AU7(obj, obj2)));
    }

    public /* synthetic */ C127395pI(UserSession userSession, InterfaceC127385pH interfaceC127385pH, EnumC64222vh enumC64222vh) {
        InterfaceC25391Lt A00 = C25361Lq.A00(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A00, 3);
        this.A00 = userSession;
        this.A02 = A00;
        this.A01 = interfaceC127385pH;
        this.A03 = enumC64222vh;
    }
}
