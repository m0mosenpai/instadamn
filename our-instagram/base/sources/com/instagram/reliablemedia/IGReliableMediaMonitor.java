package com.instagram.reliablemedia;

import X.AbstractC08820cl;
import X.AbstractC111324zv;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C09270dc;
import X.C0f9;
import X.C14250np;
import X.C14360o3;
import X.C15670qN;
import X.C18150uz;
import X.C18U;
import X.C218914p;
import X.C92H;
import X.EnumC220415e;
import X.InterfaceC12870lZ;
import X.InterfaceC15680qO;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.LruCache;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGTigonService;

/* loaded from: classes4.dex */
public final class IGReliableMediaMonitor implements InterfaceC12870lZ, InterfaceC15680qO {
    public static final C92H Companion = new Object();
    public final HybridData mHybridData;
    public final UserSession userSession;

    public IGReliableMediaMonitor(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.userSession = userSession;
        IGTigonService tigonService = IGTigonService.getTigonService(userSession);
        C14360o3.A07(tigonService);
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C14250np.A00().A00);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.mHybridData = initHybrid(tigonService, androidAsyncExecutorFactory2, C18U.A04(c06090Tz, userSession, 36892136985789367L), C18U.A06(c06090Tz, userSession, 2342172196245684343L), (int) C18U.A01(c06090Tz, userSession, 36610662008494245L), (int) C18U.A01(c06090Tz, userSession, 36610662008821926L), (int) C18U.A01(c06090Tz, userSession, 36610662008887463L), C18U.A04(c06090Tz, userSession, 36892136985658294L), getServerUrl(), C18U.A04(c06090Tz, userSession, 36892136985920441L), 180);
    }

    private final native HybridData initHybrid(IGTigonService iGTigonService, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, boolean z, int i, int i2, int i3, String str2, String str3, String str4, int i4);

    private final native void onAppBackgroundedNative();

    private final native void onAppForegroundedNative();

    private final native void onCellConnection();

    private final native void onNoConnection();

    private final native void onOtherConnection();

    private final native void onUserSessionStartNative(boolean z);

    private final native void onUserSessionWillEndNative();

    private final native void onWifiConnection();

    @Override // X.InterfaceC12870lZ
    public synchronized void onAppBackgrounded() {
        int A03 = C0f9.A03(-2031705521);
        onAppBackgroundedNative();
        C0f9.A0A(-1373493976, A03);
    }

    @Override // X.InterfaceC12870lZ
    public synchronized void onAppForegrounded() {
        int A03 = C0f9.A03(438280190);
        onAppForegroundedNative();
        C0f9.A0A(535822458, A03);
    }

    @Override // X.InterfaceC15680qO
    public synchronized void onConnectionChanged(NetworkInfo networkInfo) {
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                int type = networkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 6) {
                            onOtherConnection();
                        }
                    } else {
                        onWifiConnection();
                    }
                }
                onCellConnection();
            }
        }
        onNoConnection();
    }

    public final synchronized void onUserSessionStart(boolean z) {
        onUserSessionStartNative(z);
        boolean z2 = C218914p.A04;
        C218914p.A03(EnumC220415e.A03, this);
        C18150uz.A0B.A03(this);
    }

    public final synchronized void onUserSessionWillEnd() {
        onUserSessionWillEndNative();
        C218914p.A06(this);
        C15670qN.A00(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.92H, java.lang.Object] */
    static {
        C09270dc.A01("reliablemedia");
    }

    private final String getServerUrl() {
        UserSession userSession = this.userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, userSession, 36892136985134005L);
        String A0T = AnonymousClass001.A0T("567067343352427", AbstractC111324zv.A00(2344), '|');
        String A042 = C18U.A04(c06090Tz, this.userSession, 36892136985854904L);
        LruCache lruCache = AbstractC08820cl.A00;
        String obj = Uri.parse(A04).buildUpon().appendQueryParameter("access_token", A0T).appendQueryParameter("rule_context", A042).toString();
        C14360o3.A07(obj);
        return obj;
    }

    public final UserSession getUserSession() {
        return this.userSession;
    }
}
