package com.instagram.direct.notifications.sync;

import X.AbstractC167027dH;
import X.AbstractC31174DnI;
import X.C06090Tz;
import X.C1334460n;
import X.C14360o3;
import X.C18U;
import X.C41761wQ;
import X.C42201xA;
import X.C46891KoY;
import X.C49799Lz6;
import X.C50367MLu;
import X.C60K;
import X.InterfaceC13050lr;
import X.InterfaceC16660sJ;
import X.K37;
import X.K4W;
import X.K4X;
import X.L7H;
import X.MHJ;
import com.facebook.messenger.notification.engine.MSGNotificationEngineInstagramSyncPathIntegrator;
import com.facebook.messenger.notification.engine.MSGNotificationEngineValueProvider;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.Execution;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class NotificationEngineInstagramSyncIntegrator implements InterfaceC13050lr {
    public static final C46891KoY Companion = new Object();
    public static final String TAG = "NotificationEngineInstagramSyncIntegrator";
    public MSGNotificationEngineInstagramSyncPathIntegrator integrator;
    public long integratorInitializationDelay;
    public boolean isInitialized;
    public final K37 notificationEngineInstagramIntegratorCallback;
    public final InterfaceC16660sJ subscribeConsumer;
    public final C41761wQ subscriber;
    public final UserSession userSession;
    public final MSGNotificationEngineValueProvider valueProvider;
    public final L7H valueProviderRegister;

    public NotificationEngineInstagramSyncIntegrator(UserSession userSession, MSGNotificationEngineValueProvider mSGNotificationEngineValueProvider, K37 k37, L7H l7h) {
        AbstractC167027dH.A0a(1, userSession, mSGNotificationEngineValueProvider, k37, l7h);
        this.userSession = userSession;
        this.valueProvider = mSGNotificationEngineValueProvider;
        this.notificationEngineInstagramIntegratorCallback = k37;
        this.valueProviderRegister = l7h;
        this.subscriber = AbstractC31174DnI.A0S();
        this.subscribeConsumer = C50367MLu.A01(this, 48);
    }

    public static final NotificationEngineInstagramSyncIntegrator getInstance(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (NotificationEngineInstagramSyncIntegrator) userSession.A01(NotificationEngineInstagramSyncIntegrator.class, MHJ.A00(userSession, 29));
    }

    public final void initialize(String str) {
        C14360o3.A0B(str, 0);
        if (!this.isInitialized) {
            if (this.userSession.hasEnded()) {
                logInitializationError();
                return;
            }
            C42201xA c42201xA = C1334460n.A01(this.userSession, str).A02;
            C14360o3.A07(c42201xA);
            C49799Lz6.A00(c42201xA, this.subscriber, this.subscribeConsumer, 1);
            this.isInitialized = true;
            logInitialization();
        }
    }

    public final void start(Mailbox mailbox) {
        C14360o3.A0B(mailbox, 0);
        if (this.integrator == null) {
            UserSession userSession = this.userSession;
            C14360o3.A0B(userSession, 0);
            long A01 = C18U.A01(C06090Tz.A06, userSession, 36596316818770312L);
            this.integratorInitializationDelay = A01;
            if (A01 > 0) {
                Execution.executeAfterWithPriority(new K4W(mailbox, this), null, 1, 0, A01);
            } else {
                Execution.executeAsync(new K4X(mailbox, this), null, 1);
            }
        }
    }

    public final MSGNotificationEngineInstagramSyncPathIntegrator getIntegrator() {
        return this.integrator;
    }

    public final boolean isIntegratorInitialized() {
        return this.isInitialized;
    }

    public final void logInitialization() {
        UserSession userSession = this.userSession;
        if (userSession != null) {
            C60K.A00(userSession);
        }
    }

    public final void logInitializationError() {
        UserSession userSession = this.userSession;
        if (userSession != null) {
            C60K.A00(userSession).A00(null, null, null, null, "InstagramSyncPathIntegrator not initialized, user session has ended", 7);
        }
    }

    @Override // X.InterfaceC13050lr
    public void onUserSessionWillEnd(boolean z) {
        if (z) {
            this.integrator = null;
        }
        this.subscriber.A01();
    }

    public final void setIntegrator(MSGNotificationEngineInstagramSyncPathIntegrator mSGNotificationEngineInstagramSyncPathIntegrator) {
        this.integrator = mSGNotificationEngineInstagramSyncPathIntegrator;
    }
}
