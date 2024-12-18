package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.1Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28341Yv {
    public static C28341Yv A00;

    public final void A01(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43588JPt interfaceC43588JPt, UpcomingEvent upcomingEvent, String str, String str2, String str3, boolean z, boolean z2) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str2, 4);
        A00(context, userSession, interfaceC60442pS, null, interfaceC43588JPt, upcomingEvent, str, str2, str3, false, z, z2);
    }

    public static final void A00(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC1119153d interfaceC1119153d, InterfaceC43588JPt interfaceC43588JPt, UpcomingEvent upcomingEvent, String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = false;
        c189448aO.A0T = interfaceC43588JPt;
        c189448aO.A0U = interfaceC1119153d;
        c189448aO.A1R = true;
        c189448aO.A00().A03(context, IA5.A00(userSession, interfaceC43588JPt, upcomingEvent, str, str2, str3, z, z2, z3));
        new C146076i5(interfaceC60442pS, userSession, interfaceC60442pS.getModuleName()).A04(upcomingEvent, str, "open_upcoming_event_bottom_sheet", str3);
    }
}
