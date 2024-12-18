package com.instagram.realtimeclient.keepalive;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C28531Zo;
import X.C2DG;
import X.InterfaceC08830cm;
import X.InterfaceC13000lm;
import X.InterfaceC16820sZ;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.lang.ref.WeakReference;

/* loaded from: classes10.dex */
public class RealtimeClientKeepAlive implements InterfaceC13000lm {
    public static final String SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION = "SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION";
    public static final String TAG = "RealtimeClientKeepAlive";
    public Runnable mDelayStopRunnable;
    public final InterfaceC08830cm mDirectPluginProvider;
    public final String mKeepaliveCondition;
    public final Handler mMainLooperHandler;
    public final InterfaceC08830cm mRealtimeClientManagerProvider;
    public final UserSession mUserSession;

    /* loaded from: classes10.dex */
    public class RemoveKeepAliveRunnable implements Runnable {
        public final String mKeepaliveCondition;
        public final WeakReference mRealtimeClientManager;

        @Override // java.lang.Runnable
        public void run() {
            RealtimeClientManager realtimeClientManager = (RealtimeClientManager) this.mRealtimeClientManager.get();
            if (realtimeClientManager != null) {
                realtimeClientManager.removeKeepAliveCondition(this.mKeepaliveCondition);
            }
        }

        public RemoveKeepAliveRunnable(RealtimeClientManager realtimeClientManager, String str) {
            this.mRealtimeClientManager = AbstractC25225BEi.A16(realtimeClientManager);
            this.mKeepaliveCondition = str;
        }
    }

    private synchronized void clearLastStopRunnable() {
        Runnable runnable = this.mDelayStopRunnable;
        if (runnable != null) {
            this.mMainLooperHandler.removeCallbacks(runnable);
        }
        this.mDelayStopRunnable = null;
    }

    public synchronized void doKeepAlive(final String str) {
        clearLastStopRunnable();
        final RealtimeClientManager realtimeClientManager = (RealtimeClientManager) this.mRealtimeClientManagerProvider.get();
        this.mMainLooperHandler.post(new Runnable() { // from class: com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RealtimeClientKeepAlive.this.m100x4f7c0ef3(str, realtimeClientManager);
            }
        });
        RemoveKeepAliveRunnable removeKeepAliveRunnable = new RemoveKeepAliveRunnable(realtimeClientManager, this.mKeepaliveCondition);
        this.mDelayStopRunnable = removeKeepAliveRunnable;
        this.mMainLooperHandler.postDelayed(removeKeepAliveRunnable, realtimeClientManager.mRealtimeClientConfig.delayDisconnectMQTTMS);
    }

    @Override // X.InterfaceC13000lm
    public synchronized void onSessionWillEnd() {
        clearLastStopRunnable();
        this.mMainLooperHandler.post(new RemoveKeepAliveRunnable((RealtimeClientManager) this.mRealtimeClientManagerProvider.get(), this.mKeepaliveCondition));
    }

    public static RealtimeClientKeepAlive getInstance(final UserSession userSession) {
        return (RealtimeClientKeepAlive) userSession.A01(RealtimeClientKeepAlive.class, new InterfaceC16820sZ() { // from class: com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive$$ExternalSyntheticLambda2
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return RealtimeClientKeepAlive.lambda$getInstance$1(UserSession.this);
            }
        });
    }

    /* renamed from: lambda$doKeepAlive$2$com-instagram-realtimeclient-keepalive-RealtimeClientKeepAlive, reason: not valid java name */
    public /* synthetic */ void m100x4f7c0ef3(String str, RealtimeClientManager realtimeClientManager) {
        if (!this.mUserSession.hasEnded()) {
            this.mDirectPluginProvider.get();
            UserSession userSession = this.mUserSession;
            AbstractC167017dG.A1N(userSession, str);
            C2DG.A00(userSession).A0A(str);
            realtimeClientManager.addKeepAliveCondition(this.mKeepaliveCondition);
        }
    }

    public RealtimeClientKeepAlive(UserSession userSession, String str, Handler handler, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        this.mUserSession = userSession;
        this.mKeepaliveCondition = str;
        this.mMainLooperHandler = handler;
        this.mRealtimeClientManagerProvider = interfaceC08830cm;
        this.mDirectPluginProvider = interfaceC08830cm2;
    }

    public static /* synthetic */ RealtimeClientKeepAlive lambda$getInstance$1(final UserSession userSession) {
        return new RealtimeClientKeepAlive(userSession, SHARED_REALTIME_CLIENT_KEEPALIVE_CONDITION, AbstractC167007dF.A0J(), new InterfaceC08830cm() { // from class: com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive$$ExternalSyntheticLambda0
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return RealtimeClientManager.getInstance(UserSession.this);
            }
        }, new InterfaceC08830cm() { // from class: com.instagram.realtimeclient.keepalive.RealtimeClientKeepAlive$$ExternalSyntheticLambda1
            @Override // X.InterfaceC08830cm
            public final Object get() {
                return C28531Zo.A04;
            }
        });
    }
}
