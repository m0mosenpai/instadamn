package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86773tp {
    public final UserSession A00;
    public final InterfaceC11380iw A01;

    public C86773tp(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A00 = userSession;
        this.A01 = interfaceC11380iw;
    }

    public final void A00(Context context, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        UserSession userSession = this.A00;
        if (AbstractC31206Dnp.A01(userSession)) {
            AbstractC31206Dnp.A00(context, userSession, new C49691LxM(interfaceC16820sZ));
            return;
        }
        Integer num = C05F.A01;
        if (AbstractC43607JQo.A00(userSession, num)) {
            AbstractC34362FDe.A00(context, new ViewOnClickListenerC48045LOr(this, interfaceC16820sZ), C26661Qv.A00(userSession).C98(), this.A01, null, false, num);
            return;
        }
        interfaceC16820sZ.invoke();
    }
}
