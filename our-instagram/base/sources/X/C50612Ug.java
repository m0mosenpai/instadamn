package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* renamed from: X.2Ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50612Ug implements InterfaceC13060ls {
    public static long A00;
    public static final C50612Ug A01 = new Object();

    @Override // X.InterfaceC13060ls
    public final void Cww(AbstractC12990ll abstractC12990ll) {
        UserSession userSession;
        C1VE c1ve;
        C14360o3.A0B(abstractC12990ll, 0);
        if ((abstractC12990ll instanceof UserSession) && (userSession = (UserSession) abstractC12990ll) != null && !userSession.isEnded() && C18U.A06(C06090Tz.A05, userSession, 36319020844915598L) && (c1ve = C1VE.A02) != null) {
            c1ve.A01(userSession, new Thread(new PP1(userSession)));
        }
    }

    @Override // X.InterfaceC13060ls
    public final void Cwy(AbstractC12990ll abstractC12990ll) {
        final UserSession userSession;
        C1VE c1ve;
        C14360o3.A0B(abstractC12990ll, 0);
        A00 = System.currentTimeMillis();
        if ((abstractC12990ll instanceof UserSession) && (userSession = (UserSession) abstractC12990ll) != null && !userSession.isEnded() && C18U.A06(C06090Tz.A05, userSession, 36319020844915598L) && (c1ve = C1VE.A02) != null) {
            c1ve.A01(userSession, new Thread(new Runnable() { // from class: X.3Jg
                @Override // java.lang.Runnable
                public final void run() {
                    UserSession userSession2 = UserSession.this;
                    try {
                        C1VE c1ve2 = C1VE.A02;
                        if (c1ve2 != null) {
                            IgTimeInAppActivityListener.A00(c1ve2.A00, userSession2).A04.A01(EnumC49762Qj.FOREGROUND);
                        }
                    } catch (Throwable unused) {
                        C0f5 AEp = C18950wb.A01.AEp("ScreenTime", 817892914);
                        AEp.ABW(MSV.A00(854), "Failed to insert foreground event");
                        AEp.report();
                    }
                }
            }));
        }
    }
}
