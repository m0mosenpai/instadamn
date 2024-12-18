package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.78e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1581978e {
    public final C1581878d A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C79Z c79z, InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, C7DK c7dk, Class cls, boolean z) {
        C14360o3.A0B(c7dk, 4);
        C14360o3.A0B(c79z, 5);
        C1580177l A00 = AbstractC1575875s.A00(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), new C77Z((InterfaceC164887Zb) interfaceC165247aD, 1, 0, false), interfaceC165247aD, anonymousClass988);
        final C7ZT c7zt = (C7ZT) interfaceC165247aD;
        return new C1581878d(c79z, new C1579277b(interfaceC11380iw, userSession, (C7ZZ) interfaceC165247aD, anonymousClass988, c7dk, AbstractC16960so.A1N(A00, new C7QB() { // from class: X.78h
            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void D8a(Object obj) {
            }

            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void Dw5(Object obj) {
            }

            @Override // X.C7QB
            public final /* bridge */ /* synthetic */ void CzN(Object obj, Object obj2) {
                C7QY c7qy = (C7QY) obj2;
                if (c7qy != null) {
                    DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
                    String str = ((MessageIdentifier) directMessageIdentifier).A01;
                    String str2 = c7qy.A0Y;
                    if (str2 == null && (str2 = c7qy.A0T) == null) {
                        C2EY Ar9 = ((AbstractC129515tG) c7qy).A00.Ar9();
                        if (Ar9 != null) {
                            str2 = Ar9.toString();
                        } else {
                            return;
                        }
                    }
                    if (str2 != null) {
                        C7ZT.this.AFl(str, str2, ((AbstractC129515tG) c7qy).A00.Ar9().A00, directMessageIdentifier.A00, true);
                    }
                }
            }
        }), false, z), C158907Bc.A00(interfaceC165247aD, anonymousClass988), cls);
    }
}
