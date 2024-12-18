package com.instagram.direct.stella;

import X.AbstractC08590cN;
import X.AbstractC08760ce;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC31171DnF;
import X.AbstractC43592JPx;
import X.C008002u;
import X.C05F;
import X.C0UO;
import X.C0b3;
import X.C10E;
import X.C14250np;
import X.C14360o3;
import X.C1ZS;
import X.C1ZU;
import X.C2OD;
import X.C50682MZa;
import X.C53965Ntc;
import X.InterfaceC13050lr;
import X.OIP;
import X.RunnableC56897PMq;
import X.WIJ;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.os.Handler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class StellaIpcDirectMessagingServiceClient implements InterfaceC13050lr {
    public static final C53965Ntc Companion = new Object();
    public static final String FB_PERMISSION = "com.instagram.android.fbpermission.SEND_ACTION_RESULT";
    public static final long KEEP_CONNECTION_ALIVE_MS = 60000;
    public static final String VIEW_APP_DIRECT_MESSAGING_HANDLER = "com.facebook.assistant.stella.ipc.instagram.service.InstagramIpcDirectMessagingServiceServer";
    public static volatile StellaIpcDirectMessagingServiceClient _instance;
    public Application context;
    public final Runnable disconnectRunnable;
    public Handler handler;
    public boolean isServiceConnectionInProgress;
    public final Object lock;
    public int runningRequests;
    public final ServiceConnection serviceConnection;
    public SettableFuture serviceInterfaceFuture;
    public UserSession userSession;

    public /* synthetic */ StellaIpcDirectMessagingServiceClient(Application application, UserSession userSession, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, userSession);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final SettableFuture runIpcRequest(OIP oip) {
        C14360o3.A0B(oip, 0);
        ?? obj = new Object();
        if (isPackageValid()) {
            synchronized (this.lock) {
                this.runningRequests++;
                C2OD.A03(new C50682MZa(3, obj, oip, this), connect(), C14250np.A00().A00);
            }
        }
        return obj;
    }

    public final C0UO runIpcRequestAsFlow(OIP oip) {
        C14360o3.A0B(oip, 0);
        C008002u A00 = C10E.A00(AbstractC31171DnF.A0q().toString());
        if (isPackageValid()) {
            synchronized (this.lock) {
                this.runningRequests++;
                C2OD.A03(new C50682MZa(4, A00, oip, this), connect(), C14250np.A00().A00);
            }
        }
        return A00;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    private final ListenableFuture connect() {
        SettableFuture settableFuture;
        synchronized (this.lock) {
            if (!this.isServiceConnectionInProgress && !this.serviceInterfaceFuture.isDone()) {
                if (this.context != null && this.userSession != null) {
                    this.isServiceConnectionInProgress = true;
                    this.serviceInterfaceFuture = new Object();
                    Handler handler = this.handler;
                    if (handler != null) {
                        handler.removeCallbacks(this.disconnectRunnable);
                    }
                    Intent A04 = AbstractC31171DnF.A04();
                    C1ZS c1zs = C1ZS.A01;
                    Application application = this.context;
                    if (application != null) {
                        PackageInfo A00 = c1zs.A00(application, this.userSession);
                        if (A00 != null) {
                            A04.setComponent(new ComponentName(A00.packageName, VIEW_APP_DIRECT_MESSAGING_HANDLER));
                            try {
                                C0b3.A00().A0B(AbstractC08590cN.A02(AbstractC43592JPx.A16(AbstractC08760ce.A1f))).A06("MANAGE_DIRECT_MESSAGING").A04(this.context, A04, this.serviceConnection, 1);
                            } catch (Exception e) {
                                this.serviceInterfaceFuture.setException(e);
                                Application application2 = this.context;
                                if (application2 != null) {
                                    application2.unbindService(this.serviceConnection);
                                    C1ZU.A00(this.userSession, C05F.A01, e.toString());
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                settableFuture = this.serviceInterfaceFuture;
            } else {
                settableFuture = this.serviceInterfaceFuture;
            }
        }
        return settableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public final void disconnect() {
        synchronized (this.lock) {
            try {
                Application application = this.context;
                if (application != null) {
                    application.unbindService(this.serviceConnection);
                }
            } catch (Exception e) {
                C1ZU.A00(this.userSession, C05F.A0C, e.toString());
            }
            this.isServiceConnectionInProgress = false;
            this.serviceInterfaceFuture = new Object();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.7O2, java.lang.Object] */
    private final boolean isPackageValid() {
        UserSession userSession;
        C1ZS c1zs;
        PackageInfo A00;
        Application application = this.context;
        if (application == null || (userSession = this.userSession) == null || (A00 = (c1zs = C1ZS.A01).A00(application, userSession)) == null || A00.applicationInfo == null) {
            return false;
        }
        Application application2 = this.context;
        if (application2 != null) {
            PackageInfo A002 = c1zs.A00(application2, this.userSession);
            if (A002 == null || new Object().compare(A002.versionName, "124.0.0.0.15") < 0) {
                return false;
            }
            return true;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRequestFinished() {
        synchronized (this.lock) {
            int i = this.runningRequests - 1;
            this.runningRequests = i;
            if (i <= 0) {
                Handler handler = this.handler;
                if (handler != null) {
                    handler.removeCallbacks(this.disconnectRunnable);
                    handler.postDelayed(this.disconnectRunnable, KEEP_CONNECTION_ALIVE_MS);
                }
                this.runningRequests = 0;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public StellaIpcDirectMessagingServiceClient(Application application, UserSession userSession) {
        this.context = application;
        this.handler = AbstractC167007dF.A0J();
        this.userSession = userSession;
        this.lock = new Object();
        this.disconnectRunnable = new RunnableC56897PMq(this);
        this.serviceInterfaceFuture = new Object();
        this.serviceConnection = new WIJ(this, 4);
    }

    @Override // X.InterfaceC13050lr
    public void onUserSessionWillEnd(boolean z) {
        disconnect();
        synchronized (this.lock) {
            this.userSession = null;
            this.context = null;
            this.handler = null;
            _instance = null;
        }
    }
}
