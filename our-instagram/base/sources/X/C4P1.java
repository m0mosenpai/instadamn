package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.common.dextricks.DexStore;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttPublishListener;
import com.facebook.mqtt.service.MqttSubscribeListener;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.4P1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4P1 implements C20H {
    public Context A00;
    public ConnectionConfig A01;
    public MqttSubscribeListener A02;
    public C4P5 A03;
    public final AnonymousClass209 A04;
    public final C4MW A05;
    public final C4MX A06;
    public final C94904Ov A07;
    public final Executor A08;
    public final AtomicBoolean A09;
    public final InterfaceC16820sZ A0A;
    public final ReentrantReadWriteLock A0B;
    public volatile C20H A0C;
    public volatile boolean A0D;

    public C4P1(AnonymousClass209 anonymousClass209, C94904Ov c94904Ov, Executor executor, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(anonymousClass209, 1);
        C14360o3.A0B(executor, 2);
        this.A04 = anonymousClass209;
        this.A08 = executor;
        this.A07 = c94904Ov;
        this.A0A = interfaceC16820sZ;
        this.A0B = new ReentrantReadWriteLock();
        this.A09 = new AtomicBoolean(false);
        this.A05 = new C4MW(anonymousClass209);
        this.A06 = new C4MX(anonymousClass209);
    }

    @Override // X.C20H
    public final int publish(String str, byte[] bArr, C4QA c4qa, MqttPublishListener mqttPublishListener) {
        if (!this.A09.get()) {
            C0K8.A0C("MqttDozeAwareClientWrapper", "Unable to publish. Client not stated");
            return -1;
        }
        if (this.A0D || this.A0C == null) {
            A03(this, false);
        }
        if (this.A0D && this.A0C == null) {
            C0K8.A0D("MqttDozeAwareClientWrapper", "Unable to publish. Doze mode active without client");
            return -1;
        }
        return this.A05.A00(mqttPublishListener, c4qa, str, null, bArr);
    }

    @Override // X.C20H
    public final void setForeground(boolean z, byte[] bArr, MqttPublishListener mqttPublishListener) {
        ConnectionConfig connectionConfig = this.A01;
        if (connectionConfig == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        connectionConfig.isAppInBackground = !z;
        if (z) {
            A03(this, false);
        }
        A01(this, new C9FW(0, mqttPublishListener, this, bArr, z));
    }

    @Override // X.C20H
    public final boolean start(Context context, ConnectionConfig connectionConfig, final C4P5 c4p5, MqttSubscribeListener mqttSubscribeListener) {
        C14360o3.A0B(context, 0);
        AtomicBoolean atomicBoolean = this.A09;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.A00 = context.getApplicationContext();
            this.A01 = connectionConfig;
            this.A03 = new C4P5() { // from class: X.4P6
                @Override // X.C4P5
                public final void D7A(ConnectionConfig connectionConfig2, Integer num) {
                    C14360o3.A0B(num, 0);
                    c4p5.D7A(connectionConfig2, num);
                }

                @Override // X.C4P5
                public final boolean D7G(C4P9 c4p9) {
                    C14360o3.A0B(c4p9, 0);
                    C4P9 c4p92 = C4P9.A06;
                    if (c4p9 == c4p92) {
                        C4P1.A03(C4P1.this, true);
                    }
                    if (!C4P1.this.A0D || c4p9 == c4p92) {
                        return c4p5.D7G(c4p9);
                    }
                    return false;
                }

                @Override // X.C4P5
                public final void onMessageDropped(String str, byte[] bArr, long j) {
                    c4p5.onMessageDropped(str, bArr, j);
                }
            };
            this.A02 = mqttSubscribeListener;
            A03(this, false);
            return atomicBoolean.get();
        }
        throw new IllegalStateException("Doze client already started!");
    }

    @Override // X.C20H
    public final boolean subscribe(String str, C4QA c4qa, MqttSubscribeListener mqttSubscribeListener) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c4qa, 1);
        C14360o3.A0B(mqttSubscribeListener, 2);
        A00();
        return this.A06.A02(new C51757Mtg(mqttSubscribeListener, c4qa, str));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0oO, java.lang.Object] */
    @Override // X.C20H
    public final boolean verifyAuthToken(String str) {
        C14360o3.A0B(str, 0);
        ?? obj = new Object();
        A01(this, new C50253MHi(obj, this, str, 0));
        return obj.A00;
    }

    private final void A00() {
        Looper looper;
        if (this.A0C == null) {
            Looper myLooper = Looper.myLooper();
            AnonymousClass209 anonymousClass209 = this.A04;
            synchronized (anonymousClass209) {
                HandlerThread handlerThread = anonymousClass209.A01;
                if (handlerThread != null) {
                    looper = handlerThread.getLooper();
                } else {
                    looper = null;
                }
            }
            if (C14360o3.A0K(myLooper, looper)) {
                A03(this, false);
            } else {
                anonymousClass209.A01(new RunnableC24265ApW(this));
            }
        }
    }

    public static final void A01(C4P1 c4p1, InterfaceC16820sZ interfaceC16820sZ) {
        ReentrantReadWriteLock reentrantReadWriteLock = c4p1.A0B;
        reentrantReadWriteLock.readLock().lock();
        try {
            interfaceC16820sZ.invoke();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public static final void A02(C4P1 c4p1, InterfaceC16820sZ interfaceC16820sZ) {
        ReentrantReadWriteLock reentrantReadWriteLock = c4p1.A0B;
        reentrantReadWriteLock.writeLock().lock();
        try {
            interfaceC16820sZ.invoke();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        if (r7.A01 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
    
        if (r8 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(final X.C4P1 r7, boolean r8) {
        /*
            X.20H r1 = r7.A0C
            r0 = 0
            if (r1 != 0) goto L6
            r0 = 1
        L6:
            r6 = 1
            r5 = 0
            if (r0 != 0) goto Ld
            r0 = 0
            if (r8 == 0) goto Le
        Ld:
            r0 = 1
        Le:
            java.lang.String r4 = "MqttDozeAwareClientWrapper"
            if (r0 == 0) goto Lc0
            android.content.Context r3 = r7.A00
            if (r3 == 0) goto Lc0
            boolean r2 = X.C4OT.A00(r3)     // Catch: java.lang.RuntimeException -> L25
            X.209 r1 = r7.A04     // Catch: java.lang.RuntimeException -> L25
            X.4P7 r0 = new X.4P7     // Catch: java.lang.RuntimeException -> L25
            r0.<init>(r7)     // Catch: java.lang.RuntimeException -> L25
            r1.A01(r0)     // Catch: java.lang.RuntimeException -> L25
            goto L34
        L25:
            r1 = move-exception
            java.lang.String r0 = "Exception checking doze mode"
            X.C0K8.A0F(r4, r0, r1)
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.RemoteException
            if (r0 != 0) goto L38
            throw r1
        L34:
            if (r2 == 0) goto L63
            r6 = 0
        L37:
            r5 = r6
        L38:
            r7.A0D = r5
            boolean r0 = r7.A0D
            if (r0 == 0) goto La1
            X.20H r0 = r7.A0C
            if (r0 == 0) goto La1
            if (r8 == 0) goto La1
            java.lang.String r0 = "Doze mode enabled. Stopping client"
            X.C0K8.A0D(r4, r0)
            java.lang.Integer r1 = X.C05F.A0Y
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r1 = 21
            X.9Dq r0 = new X.9Dq
            r0.<init>(r7, r1)
            A02(r7, r0)
            X.4Ov r0 = r7.A07
            X.206 r1 = r0.A00
            X.4P9 r0 = X.C4P9.A06
            X.AnonymousClass206.A02(r0, r1)
            return
        L63:
            java.lang.String r0 = "power"
            java.lang.Object r2 = r3.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L25
            java.lang.String r0 = "null cannot be cast to non-null type android.os.PowerManager"
            X.C14360o3.A0C(r2, r0)     // Catch: java.lang.RuntimeException -> L25
            android.os.PowerManager r2 = (android.os.PowerManager) r2     // Catch: java.lang.RuntimeException -> L25
            boolean r0 = r2.isDeviceIdleMode()     // Catch: java.lang.RuntimeException -> L25
            if (r0 != 0) goto L37
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L25
            r0 = 33
            if (r1 < r0) goto L81
            boolean r6 = r2.isDeviceLightIdleMode()     // Catch: java.lang.RuntimeException -> L25
            goto L37
        L81:
            com.facebook.mqtt.service.ConnectionConfig r0 = r7.A01     // Catch: java.lang.RuntimeException -> L25
            java.lang.String r1 = "config"
            if (r0 == 0) goto L99
            boolean r0 = r0.isAppInBackground     // Catch: java.lang.RuntimeException -> L25
            if (r0 != 0) goto L92
            boolean r0 = r2.isInteractive()     // Catch: java.lang.RuntimeException -> L25
            if (r0 == 0) goto L92
            r6 = 0
        L92:
            r2.isPowerSaveMode()     // Catch: java.lang.RuntimeException -> L25
            com.facebook.mqtt.service.ConnectionConfig r0 = r7.A01     // Catch: java.lang.RuntimeException -> L25
            if (r0 != 0) goto L37
        L99:
            X.C14360o3.A0F(r1)     // Catch: java.lang.RuntimeException -> L25
            X.00O r0 = X.C00O.createAndThrow()     // Catch: java.lang.RuntimeException -> L25
            throw r0     // Catch: java.lang.RuntimeException -> L25
        La1:
            boolean r0 = r7.A0D
            if (r0 != 0) goto Lc0
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A09
            boolean r0 = r0.get()
            if (r0 == 0) goto Lc0
            X.20H r0 = r7.A0C
            if (r0 != 0) goto Lc0
            java.lang.String r0 = "Doze mode disabled. Starting client"
            X.C0K8.A0D(r4, r0)
            java.util.concurrent.Executor r1 = r7.A08
            X.4P8 r0 = new X.4P8
            r0.<init>()
            r1.execute(r0)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4P1.A03(X.4P1, boolean):void");
    }

    @Override // X.C20H
    public final void kickOffConnection() {
        if (this.A09.get()) {
            A03(this, false);
        }
    }

    @Override // X.C20H
    public final void onNetworkAvailable() {
        ConnectionConfig connectionConfig = this.A01;
        if (connectionConfig != null) {
            connectionConfig.initialNetworkState = 1;
            if (this.A0C == null) {
                ConnectionConfig connectionConfig2 = this.A01;
                if (connectionConfig2 != null) {
                    if (!connectionConfig2.isAppInBackground) {
                        A03(this, false);
                        return;
                    }
                }
            }
            A01(this, new C206859Dq(this, 24));
            return;
        }
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }

    @Override // X.C20H
    public final void onNetworkInterfaceChanged(int i) {
        if (i != 0 && this.A0C == null) {
            ConnectionConfig connectionConfig = this.A01;
            if (connectionConfig == null) {
                C14360o3.A0F(DexStore.CONFIG_FILENAME);
                throw C00O.createAndThrow();
            }
            if (!connectionConfig.isAppInBackground) {
                A03(this, false);
                return;
            }
        }
        A01(this, new C207069El(this, i, 0));
    }

    @Override // X.C20H
    public final void onNetworkUnavailable() {
        ConnectionConfig connectionConfig = this.A01;
        if (connectionConfig == null) {
            C14360o3.A0F(DexStore.CONFIG_FILENAME);
            throw C00O.createAndThrow();
        }
        connectionConfig.initialNetworkState = 2;
        A01(this, new C206859Dq(this, 25));
    }

    @Override // X.C20H
    public final boolean unsubscribe(List list) {
        return this.A06.A03(list);
    }

    @Override // X.C20H
    public final boolean cancelPublish(int i) {
        A00();
        return this.A05.A03(i);
    }

    @Override // X.C20H
    public final void stop() {
        Looper looper;
        Looper myLooper = Looper.myLooper();
        AnonymousClass209 anonymousClass209 = this.A04;
        synchronized (anonymousClass209) {
            HandlerThread handlerThread = anonymousClass209.A01;
            if (handlerThread != null) {
                looper = handlerThread.getLooper();
            } else {
                looper = null;
            }
        }
        if (C14360o3.A0K(myLooper, looper)) {
            this.A09.set(false);
            A02(this, new C206859Dq(this, 21));
            return;
        }
        throw new IllegalStateException("Stop should be called inside the handler!");
    }
}
