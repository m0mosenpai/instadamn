package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.util.DeviceProperties;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.61f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1335961f implements Handler.Callback {
    public static C1335961f A0F;
    public static final Status A0G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0I = new Object();
    public InterfaceC65408Tjf A02;
    public TelemetryData A04;
    public final Context A05;
    public final Handler A06;
    public final GoogleApiAvailability A07;
    public final C1336261r A08;
    public volatile boolean A0E;
    public long A00 = 10000;
    public boolean A03 = false;
    public final AtomicInteger A0B = new AtomicInteger(1);
    public final AtomicInteger A0C = new AtomicInteger(0);
    public final Map A09 = new ConcurrentHashMap(5, 0.75f, 1);
    public C61n A01 = null;
    public final java.util.Set A0A = new C012504o(0);
    public final java.util.Set A0D = new C012504o(0);

    public static final void A05(C61Q c61q, C1335961f c1335961f, C58411Pup c58411Pup, int i) {
        long currentTimeMillis;
        long elapsedRealtime;
        if (i != 0) {
            C61c c61c = c61q.A06;
            if (c1335961f.A08()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = C125745mM.A00().A00;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.A03) {
                        boolean z = rootTelemetryConfiguration.A04;
                        C69C c69c = (C69C) c1335961f.A09.get(c61c);
                        if (c69c != null) {
                            Object obj = c69c.A04;
                            if (obj instanceof BaseGmsClient) {
                                BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                                if (baseGmsClient.A0Q != null && !baseGmsClient.CRe()) {
                                    ConnectionTelemetryConfiguration A00 = C64271T6v.A00(c69c, baseGmsClient, i);
                                    if (A00 != null) {
                                        c69c.A00++;
                                        z = A00.A03;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        if (!z) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            C64271T6v c64271T6v = new C64271T6v(c61c, c1335961f, i, currentTimeMillis, elapsedRealtime);
                            C5KS c5ks = c58411Pup.A00;
                            final Handler handler = c1335961f.A06;
                            handler.getClass();
                            c5ks.A09(c64271T6v, new Executor() { // from class: X.B1c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    handler.post(runnable);
                                }
                            });
                        }
                    } else {
                        return;
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                C64271T6v c64271T6v2 = new C64271T6v(c61c, c1335961f, i, currentTimeMillis, elapsedRealtime);
                C5KS c5ks2 = c58411Pup.A00;
                final Handler handler2 = c1335961f.A06;
                handler2.getClass();
                c5ks2.A09(c64271T6v2, new Executor() { // from class: X.B1c
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler2.post(runnable);
                    }
                });
            }
        }
    }

    public static Status A00(ConnectionResult connectionResult, C61c c61c) {
        return new Status(connectionResult.A02, connectionResult, AnonymousClass001.A0u("API: ", c61c.A00.A02, " is not available on this device. Connection failed with: ", String.valueOf(connectionResult)), 17);
    }

    public static C1335961f A01(Context context) {
        C1335961f c1335961f;
        HandlerThread handlerThread;
        synchronized (A0I) {
            c1335961f = A0F;
            if (c1335961f == null) {
                synchronized (C61m.A07) {
                    handlerThread = C61m.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        AbstractC09770fa.A00(handlerThread2);
                        C61m.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = C61m.A05;
                    }
                }
                c1335961f = new C1335961f(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.A00);
                A0F = c1335961f;
            }
        }
        return c1335961f;
    }

    private final C69C A02(C61Q c61q) {
        Map map = this.A09;
        C61c c61c = c61q.A06;
        C69C c69c = (C69C) map.get(c61c);
        if (c69c == null) {
            c69c = new C69C(c61q, this);
            map.put(c61c, c69c);
        }
        if (c69c.A04.requiresSignIn()) {
            this.A0D.add(c61c);
        }
        c69c.A09();
        return c69c;
    }

    public static void A03() {
        synchronized (A0I) {
            C1335961f c1335961f = A0F;
            if (c1335961f != null) {
                c1335961f.A0C.incrementAndGet();
                Handler handler = c1335961f.A06;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.Tjf, X.61Q] */
    private final void A04() {
        TelemetryData telemetryData = this.A04;
        if (telemetryData != null) {
            if (telemetryData.A01 > 0 || A08()) {
                InterfaceC65408Tjf interfaceC65408Tjf = this.A02;
                InterfaceC65408Tjf interfaceC65408Tjf2 = interfaceC65408Tjf;
                if (interfaceC65408Tjf == null) {
                    ?? c61q = new C61Q(this.A05, C64221T4v.A01, C60649RGa.A00, C61Z.A02);
                    this.A02 = c61q;
                    interfaceC65408Tjf2 = c61q;
                }
                interfaceC65408Tjf2.Ci1(telemetryData);
            }
            this.A04 = null;
        }
    }

    public final void A07(C61n c61n) {
        synchronized (A0I) {
            if (this.A01 != c61n) {
                this.A01 = c61n;
                this.A0A.clear();
            }
            this.A0A.addAll(c61n.A00);
        }
    }

    public final boolean A08() {
        if (this.A03) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C125745mM.A00().A00;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.A03) {
            return false;
        }
        int i = this.A08.A01.get(203400000, -1);
        if (i != -1 && i != 0) {
            return false;
        }
        return true;
    }

    public final boolean A09(ConnectionResult connectionResult, int i) {
        boolean isInstantApp;
        Intent A04;
        PendingIntent activity;
        Boolean bool;
        GoogleApiAvailability googleApiAvailability = this.A07;
        Context context = this.A05;
        synchronized (CNN.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = CNN.A00;
            if (context2 != null && (bool = CNN.A01) != null && context2 == applicationContext) {
                isInstantApp = bool.booleanValue();
            } else {
                CNN.A01 = null;
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                CNN.A01 = Boolean.valueOf(isInstantApp);
                CNN.A00 = applicationContext;
            }
        }
        if (!isInstantApp) {
            int i2 = connectionResult.A01;
            if ((i2 != 0 && (activity = connectionResult.A02) != null) || ((A04 = googleApiAvailability.A04(context, null, i2)) != null && (activity = PendingIntent.getActivity(context, 0, A04, 201326592)) != null)) {
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra(AbstractC58317Pt9.A00(909), activity);
                intent.putExtra(AbstractC58317Pt9.A00(784), i);
                intent.putExtra(AbstractC58317Pt9.A00(882), true);
                googleApiAvailability.A06(PendingIntent.getActivity(context, 0, intent, S7E.A00 | 134217728), context, i2);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0230, code lost:
    
        if (r1.A02 != false) goto L102;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000d. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.Tjf, X.61Q] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1335961f.handleMessage(android.os.Message):boolean");
    }

    public C1335961f(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.A0E = true;
        this.A05 = context;
        HandlerC1336161q handlerC1336161q = new HandlerC1336161q(looper, this);
        this.A06 = handlerC1336161q;
        this.A07 = googleApiAvailability;
        this.A08 = new C1336261r(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = DeviceProperties.A03;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            DeviceProperties.A03 = bool;
        }
        if (bool.booleanValue()) {
            this.A0E = false;
        }
        handlerC1336161q.sendMessage(handlerC1336161q.obtainMessage(6));
    }

    public final void A06(ConnectionResult connectionResult, int i) {
        if (!A09(connectionResult, i)) {
            Handler handler = this.A06;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
