package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7AY, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7AY {
    public static final C158677Ad A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165337aM interfaceC165337aM, AnonymousClass988 anonymousClass988, C7AW c7aw) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(interfaceC165337aM, 1);
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        C7Aa c7Aa = new C7Aa(userSession, (InterfaceC165057Zu) interfaceC165337aM, 0);
        C158667Ac c158667Ac = new C158667Ac(interfaceC11380iw, userSession, new C158657Ab((InterfaceC165247aD) interfaceC165337aM, c7az.A00));
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC165337aM, z);
        return new C158677Ad(context, interfaceC11380iw, userSession, interfaceC165337aM, anonymousClass988, c7aw, new C162907Rb(AbstractC16960so.A1Q(c7az, new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC165337aM), c7Aa, c158667Ac, c7q9, (InterfaceC165507ad) interfaceC165337aM, anonymousClass988, null, false))), false);
    }
}
