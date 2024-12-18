package X;

import android.content.Context;
import android.content.pm.ShortcutManager;
import android.os.Looper;
import android.os.MessageQueue;
import com.instagram.common.session.UserSession;

/* renamed from: X.2N6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2N6 implements InterfaceC13000lm {
    public final Context A00;
    public final InterfaceC41501vz A01;
    public final UserSession A02;

    public C2N6(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = new InterfaceC41501vz() { // from class: X.2NG
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(531735036);
                int A032 = C0f9.A03(-1783696265);
                C2N6.A00(C2N6.this);
                C0f9.A0A(148449023, A032);
                C0f9.A0A(-1179304956, A03);
            }
        };
    }

    public static final void A00(final C2N6 c2n6) {
        Boolean Ce0;
        UserSession userSession = c2n6.A02;
        InterfaceC223716s C45 = C17060sy.A01.A01(userSession).A03.C45();
        if (C45 != null && C45.Ce0() != null && (Ce0 = C45.Ce0()) != null && Ce0.booleanValue()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328297973497277L)) {
                ShortcutManager shortcutManager = (ShortcutManager) c2n6.A00.getSystemService(ShortcutManager.class);
                if (shortcutManager != null) {
                    shortcutManager.removeAllDynamicShortcuts();
                    return;
                }
                return;
            }
            if (C18U.A06(c06090Tz, userSession, 36328297973562814L)) {
                AbstractC49772Qn.A01 = true;
                AbstractC49772Qn.A00 = true;
            }
        } else if (!C18U.A06(C06090Tz.A05, userSession, 36320700176278329L)) {
            Looper.getMainLooper().getQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: X.2NL
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    C2N6 c2n62 = C2N6.this;
                    C14120nc.A00().ATO(new C49782Qo(c2n62.A00, c2n62.A02));
                    return false;
                }
            });
            return;
        }
        C14120nc.A00().ATO(new C49782Qo(c2n6.A00, userSession));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        UserSession userSession = this.A02;
        if (((C17110t6) C0BQ.A00(userSession)).BOc(null).isEmpty()) {
            Context context = this.A00;
            C14120nc.A00().ATO(new C49782Qo(context, userSession));
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager != null) {
                shortcutManager.removeAllDynamicShortcuts();
            }
        }
        AbstractC25651Mw.A00(userSession).A02(this.A01, C2IP.class);
    }
}
