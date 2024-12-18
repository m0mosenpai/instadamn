package X;

import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AppState;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.mcs.SyncHandler;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.navigation.ttrc.MPLTracker;

/* renamed from: X.69v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1352069v implements InterfaceC1352169w {
    public C6A1 A00;
    public boolean A01;

    @Override // X.InterfaceC1352169w
    public final void Epz() {
        this.A01 = true;
        C42201xA c42201xA = C1334460n.A06;
        C6A1 c6a1 = this.A00;
        if (c6a1 == null) {
            C14360o3.A0F("igMsysAppStateHandler");
            throw C00O.createAndThrow();
        }
        C218914p.A06(c6a1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6A1] */
    @Override // X.InterfaceC1352169w
    public final /* bridge */ /* synthetic */ void EgM(Object obj) {
        C1351969u c1351969u = (C1351969u) obj;
        C14360o3.A0B(c1351969u, 0);
        C42201xA c42201xA = C1334460n.A06;
        final UserSession userSession = c1351969u.A02;
        final Mailbox mailbox = c1351969u.A01;
        this.A00 = new InterfaceC12870lZ(mailbox, userSession) { // from class: X.6A1
            public final Mailbox A00;
            public final UserSession A01;

            {
                this.A01 = userSession;
                this.A00 = mailbox;
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(1026776615);
                Mailbox mailbox2 = this.A00;
                AccountSession accountSession = mailbox2.getAccountSession();
                Execution.executeAsync(new K4M(mailbox2, accountSession), accountSession, 1);
                C0f9.A0A(-469942159, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int A03 = C0f9.A03(1608465189);
                final Mailbox mailbox2 = this.A00;
                final AccountSession accountSession = mailbox2.getAccountSession();
                Execution.executeAsync(new AbstractRunnableC94874Os() { // from class: X.6A4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("getSyncHandlerToNotifyEnterAppForeground");
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AppState appState;
                        Mailbox mailbox3 = Mailbox.this;
                        mailbox3.updateAppStateToForeground();
                        final SyncHandler syncHandler = mailbox3.getSyncHandler();
                        AccountSession accountSession2 = accountSession;
                        if (syncHandler != null) {
                            Execution.executeAsync(new AbstractRunnableC94874Os() { // from class: X.5ym
                                {
                                    super("notifyEnterAppForeground");
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    SyncHandler.this.notifyAppEnterForeground();
                                }
                            }, accountSession2, 2);
                        } else {
                            android.util.Log.e("MsysAppStateHandler", "SyncHandler is null when attempting to notify Msys of app foreground.");
                        }
                        synchronized (MsysInfraNoSqliteObjectHolder.class) {
                            appState = MsysInfraNoSqliteObjectHolder.A03.A01;
                        }
                        if (appState != null) {
                            appState.notifyAppEnterForeground(C136066Dl.A00());
                        } else {
                            android.util.Log.e("MsysAppStateHandler", "appState or notificationCenter is null when attempting to notify Msys of app foreground.");
                        }
                    }
                }, accountSession, 1);
                C47142Eg A00 = AbstractC47132Ef.A00(this.A01);
                if (A00.A02() && ((Boolean) A00.A01.A00()).booleanValue()) {
                    AbstractC46868KoB.A00(mailbox2);
                }
                C0f9.A0A(833322341, A03);
            }
        };
        if (C18U.A06(C06090Tz.A05, userSession, 36313063726253790L)) {
            MPLTracker mPLTracker = new MPLTracker();
            if (mPLTracker.isReady()) {
                SessionedNotificationCenter sessionedNotificationCenter = mailbox.getAccountSession().getSessionedNotificationCenter();
                C14360o3.A07(sessionedNotificationCenter);
                mPLTracker.registerMPLTTRCListenerSessionedNotifications(sessionedNotificationCenter);
                mPLTracker.syncTamGroupStateListenForCompletion();
            }
        }
        if (!this.A01) {
            C6A1 c6a1 = this.A00;
            if (c6a1 == null) {
                C14360o3.A0F("igMsysAppStateHandler");
                throw C00O.createAndThrow();
            }
            if (C218914p.A08()) {
                c6a1.onAppBackgrounded();
            } else {
                c6a1.onAppForegrounded();
            }
            C218914p.A03(EnumC220415e.A03, c6a1);
        }
    }
}
