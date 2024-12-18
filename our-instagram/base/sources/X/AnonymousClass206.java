package X;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.MqttSubscribeListener;
import com.facebook.msys.mci.AuthDataStorage;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.JsonSerialization;
import com.facebook.msys.mci.Proxies;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.realtimeclient.MqttClientSelector;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.206, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass206 implements AnonymousClass207 {
    public static final AnonymousClass209 A0G = new AnonymousClass209("XplatMqttThread");
    public static final Executor A0H = C20B.A00;
    public C4MI A00;
    public ConnectionConfig A01;
    public C94464My A02;
    public final InterfaceC93764Ji A03;
    public final C4MW A04;
    public final C4MX A05;
    public final C4MZ A06;
    public final C4MT A07;
    public final C5N0 A08;
    public final C12250kT A09;
    public final DGWClientHolder A0A;
    public final MqttClientSelector.AnonymousClass1 A0B;
    public final String A0C;
    public final C4MY A0D;
    public final AtomicBoolean A0E;
    public volatile C20H A0F;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.4MZ] */
    public AnonymousClass206(InterfaceC93764Ji interfaceC93764Ji, C4MT c4mt, C5N0 c5n0, C12250kT c12250kT, DGWClientHolder dGWClientHolder, MqttClientSelector.AnonymousClass1 anonymousClass1, String str) {
        C14360o3.A0B(interfaceC93764Ji, 1);
        this.A03 = interfaceC93764Ji;
        this.A07 = c4mt;
        this.A0A = dGWClientHolder;
        this.A08 = c5n0;
        this.A09 = c12250kT;
        this.A0C = str;
        this.A0B = anonymousClass1;
        AnonymousClass209 anonymousClass209 = A0G;
        this.A04 = new C4MW(anonymousClass209);
        this.A05 = new C4MX(anonymousClass209);
        this.A0E = new AtomicBoolean(false);
        this.A0D = new C4MY();
        this.A06 = new MqttSubscribeListener() { // from class: X.4MZ
            @Override // com.facebook.mqtt.service.MqttSubscribeListener
            public final void onData(String str2, byte[] bArr, long j) {
                C14360o3.A0B(str2, 0);
                C14360o3.A0B(bArr, 1);
                AnonymousClass206.A03(AnonymousClass206.this, str2, bArr);
            }

            @Override // com.facebook.mqtt.service.MqttSubscribeListener
            public final void onSubscriptionResponse(String str2, boolean z, int i) {
                C14360o3.A0B(str2, 0);
            }
        };
    }

    @Override // X.AnonymousClass207
    public final void E6m(final C4Q9 c4q9, C4Q5 c4q5, String str, byte[] bArr) {
        C4QA c4qa;
        AnonymousClass209 anonymousClass209;
        Runnable runnable;
        A00();
        if (str != null) {
            if (bArr != null) {
                if (c4q5 != null) {
                    if (c4q5 == C4Q5.FIRE_AND_FORGET) {
                        c4qa = C4QA.A03;
                    } else {
                        c4qa = C4QA.A02;
                    }
                    if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                        anonymousClass209 = A0G;
                        runnable = new TR1(c4q9, c4qa, this, str, bArr);
                    } else {
                        final int A00 = this.A04.A00(null, c4qa, str, null, bArr);
                        anonymousClass209 = A0G;
                        runnable = new Runnable() { // from class: X.4QC
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i = A00;
                                C4Q9 c4q92 = c4q9;
                                if (i == -1) {
                                    c4q92.onFailure();
                                } else {
                                    c4q92.onSuccess();
                                }
                            }
                        };
                    }
                    anonymousClass209.A01(runnable);
                    return;
                }
                throw new IllegalStateException("Qos cannot be null");
            }
            throw new IllegalStateException("Payload cannot be null");
        }
        throw new IllegalStateException("Topic name cannot be null");
    }

    @Override // X.AnonymousClass207
    public final int E6o(C4Q9 c4q9, C4Q5 c4q5, InterfaceC65545TmK interfaceC65545TmK, String str, byte[] bArr) {
        C4QA c4qa;
        A00();
        if (str != null) {
            if (bArr != null) {
                if (c4q5 != null) {
                    if (c4q5 == C4Q5.FIRE_AND_FORGET) {
                        c4qa = C4QA.A03;
                    } else {
                        c4qa = C4QA.A02;
                    }
                    if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
                        int incrementAndGet = C4MW.A05.incrementAndGet();
                        A0G.A01(new TRN(c4q9, c4qa, this, interfaceC65545TmK, str, bArr, incrementAndGet));
                        return incrementAndGet;
                    }
                    int A00 = this.A04.A00(new C64083Syz(interfaceC65545TmK), c4qa, str, null, bArr);
                    if (c4q9 != null) {
                        A0G.A01(new RunnableC64619TNb(c4q9, A00));
                    }
                    return A00;
                }
                throw new IllegalStateException("Qos cannot be null");
            }
            throw new IllegalStateException("Payload cannot be null");
        }
        throw new IllegalStateException("Topic name cannot be null");
    }

    private final void A00() {
        if (this.A0E.get()) {
        } else {
            throw new RuntimeException("You must call init() before calling this method");
        }
    }

    public static final void A01(final ConnectionConfig connectionConfig, final AnonymousClass206 anonymousClass206, final Integer num) {
        A0G.A01(new Runnable() { // from class: X.4OD
            @Override // java.lang.Runnable
            public final void run() {
                final AnonymousClass206 anonymousClass2062 = anonymousClass206;
                if (anonymousClass2062.A0F == null) {
                    C14360o3.A0B(num, 0);
                    C4MI c4mi = anonymousClass2062.A00;
                    if (c4mi != null) {
                        ConnectionConfig connectionConfig2 = connectionConfig;
                        if (connectionConfig2 == null) {
                            C94464My c94464My = anonymousClass2062.A02;
                            if (c94464My != null) {
                                connectionConfig2 = c94464My.A05(anonymousClass2062.A03, c4mi, anonymousClass2062.A07, AnonymousClass206.A0H);
                            } else {
                                connectionConfig2 = null;
                            }
                        }
                        anonymousClass2062.A01 = connectionConfig2;
                    }
                    final ConnectionConfig connectionConfig3 = anonymousClass2062.A01;
                    if (connectionConfig3 != null) {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        AbstractC94824On.A00.execute(new Runnable() { // from class: X.4Op
                            @Override // java.lang.Runnable
                            public final void run() {
                                C4P2 c4p2;
                                try {
                                    final AnonymousClass206 anonymousClass2063 = anonymousClass2062;
                                    ConnectionConfig connectionConfig4 = connectionConfig3;
                                    C4MI c4mi2 = anonymousClass2063.A00;
                                    if (c4mi2 != null) {
                                        AnonymousClass209 anonymousClass209 = AnonymousClass206.A0G;
                                        C4P1 c4p1 = new C4P1(anonymousClass209, new C94904Ov(anonymousClass2063), AbstractC94824On.A00, C94914Ow.A00);
                                        Context context = c4mi2.A04;
                                        c4p2 = new C4P2(context, anonymousClass209, c4p1);
                                        if (c4p2.start(context, connectionConfig4, new C4P5() { // from class: X.4P4
                                            @Override // X.C4P5
                                            public final void D7A(ConnectionConfig connectionConfig5, Integer num2) {
                                                String str;
                                                C94464My c94464My2;
                                                C14360o3.A0B(num2, 0);
                                                switch (num2.intValue()) {
                                                    case 0:
                                                        str = "CONNACK_SERVER_UNAVAILABLE";
                                                        break;
                                                    case 1:
                                                        str = "CONNACK_BAD_USERNAME_PASS";
                                                        break;
                                                    case 2:
                                                        str = "CONNACK_BAD_CONNECTION_HASH";
                                                        break;
                                                    case 3:
                                                        str = "CONNACK_AUTH_FAILED";
                                                        break;
                                                    default:
                                                        str = "SERVER_SHEDDING_LOAD";
                                                        break;
                                                }
                                                C0K8.A0D("XplatMqttClientImpl", AnonymousClass001.A0R("Connection error ", str));
                                                AnonymousClass206 anonymousClass2064 = AnonymousClass206.this;
                                                if ((num2 == C05F.A0N || num2 == C05F.A01) && (c94464My2 = anonymousClass2064.A02) != null) {
                                                    synchronized (c94464My2) {
                                                        c94464My2.A00 = connectionConfig5;
                                                    }
                                                    C94454Mx c94454Mx = c94464My2.A03;
                                                    AnonymousClass206.A0G.A01(new RunnableC64618TNa(c94454Mx.A00, c94454Mx.A01));
                                                }
                                            }

                                            @Override // X.C4P5
                                            public final boolean D7G(C4P9 c4p9) {
                                                C14360o3.A0B(c4p9, 0);
                                                AnonymousClass206.A02(c4p9, AnonymousClass206.this);
                                                return false;
                                            }

                                            @Override // X.C4P5
                                            public final void onMessageDropped(String str, byte[] bArr, long j) {
                                                AnonymousClass206.A03(AnonymousClass206.this, str, bArr);
                                            }
                                        }, anonymousClass2063.A06)) {
                                            anonymousClass2063.A04.A02(c4p2);
                                            anonymousClass2063.A05.A01(c4p2);
                                            anonymousClass2063.A0F = c4p2;
                                        }
                                    }
                                    c4p2 = null;
                                    anonymousClass2063.A0F = c4p2;
                                } finally {
                                    countDownLatch.countDown();
                                }
                            }
                        });
                        try {
                            countDownLatch.await(10L, TimeUnit.SECONDS);
                            return;
                        } catch (InterruptedException e) {
                            C0K8.A0G("XplatMqttClientImpl", "Error waiting for client start", e);
                            return;
                        }
                    }
                    return;
                }
                C14360o3.A0B(C05F.A0N, 0);
                C20H c20h = anonymousClass2062.A0F;
                if (c20h != null) {
                    c20h.kickOffConnection();
                }
            }
        });
    }

    public static final void A02(C4P9 c4p9, AnonymousClass206 anonymousClass206) {
        C4MI c4mi;
        AnonymousClass201 anonymousClass201;
        C4MY c4my = anonymousClass206.A0D;
        int ordinal = c4p9.ordinal();
        if (ordinal != 1 && ordinal != 2) {
            if (ordinal != 3) {
                c4my.A02 = C05F.A0C;
                c4my.A01 = SystemClock.elapsedRealtime();
            } else {
                c4my.A02 = C05F.A01;
                c4my.A00 = SystemClock.elapsedRealtime();
            }
        } else {
            c4my.A02 = C05F.A00;
        }
        if (anonymousClass206.A0E.get() && (c4mi = anonymousClass206.A00) != null && (anonymousClass201 = c4mi.A05) != null) {
            anonymousClass201.onChannelStateChanged(new C95094Pu(null, c4my.A02, c4my.A00, c4my.A01));
        }
    }

    @Override // X.AnonymousClass207
    public final C5ET BV8() {
        C4MY c4my = this.A0D;
        return new C5ET(new C95094Pu(null, c4my.A02, c4my.A00, c4my.A01));
    }

    @Override // X.AnonymousClass207
    public final void CNi(final C4MI c4mi) {
        if (this.A0E.compareAndSet(false, true)) {
            AnonymousClass209 anonymousClass209 = A0G;
            anonymousClass209.A00();
            anonymousClass209.A02(C20C.A00);
            anonymousClass209.A01(new Runnable() { // from class: X.4Mb
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass206 anonymousClass206 = this;
                    C4MI c4mi2 = c4mi;
                    anonymousClass206.A00 = c4mi2;
                    try {
                        c4mi2.A00.run();
                        MqttClientSelector.AnonymousClass1 anonymousClass1 = anonymousClass206.A0B;
                        Context context = c4mi2.A04;
                        Integer msysThreadPriority = anonymousClass1.getMsysThreadPriority(context);
                        Execution.initialize(msysThreadPriority, null);
                        if (msysThreadPriority != null) {
                            Execution.setThreadPriorities(msysThreadPriority);
                        }
                        JsonSerialization.initialize();
                        AuthDataStorage.initialize(context);
                        Proxies.configure(anonymousClass1.getProxyProvider(context));
                    } catch (IllegalStateException unused) {
                    }
                    AbstractC93754Jh abstractC93754Jh = (AbstractC93754Jh) anonymousClass206.A03;
                    String str = abstractC93754Jh.mMqttConnectionConfig;
                    C14360o3.A07(str);
                    String str2 = abstractC93754Jh.mPreferredTier;
                    C14360o3.A07(str2);
                    String str3 = abstractC93754Jh.mPreferredSandbox;
                    C14360o3.A07(str3);
                    Context context2 = c4mi2.A04;
                    DGWClientHolder dGWClientHolder = anonymousClass206.A0A;
                    C94464My c94464My = new C94464My(context2, new C94454Mx(c4mi2, anonymousClass206), anonymousClass206.A08, anonymousClass206.A09, dGWClientHolder, str, str2, str3, anonymousClass206.A0C);
                    anonymousClass206.A02 = c94464My;
                    synchronized (c94464My) {
                        C4N3 c4n3 = c94464My.A04;
                        c94464My.A03(c4n3);
                        c4n3.A00();
                        c94464My.A03(new C4NB(c94464My.A02));
                        c94464My.A01();
                    }
                }
            });
            return;
        }
        throw new RuntimeException("This client has already been initialized");
    }

    @Override // X.AnonymousClass207
    public final void Cnv(int i) {
        this.A04.A03(i);
    }

    @Override // X.AnonymousClass207
    public final void destroy() {
        C0K8.A0D("XplatMqttClientImpl", "Destroy client client");
        stop();
        A0G.A01(new TKJ(this));
    }

    @Override // X.AnonymousClass207
    public final void stop() {
        A0G.A02(new TKL(this));
    }

    public static final void A03(AnonymousClass206 anonymousClass206, String str, byte[] bArr) {
        InterfaceC43661zx interfaceC43661zx;
        SystemClock.elapsedRealtime();
        C4MI c4mi = anonymousClass206.A00;
        if (c4mi != null && (interfaceC43661zx = c4mi.A06) != null) {
            interfaceC43661zx.onMessageArrived(new C5EZ(str, bArr));
        }
    }

    @Override // X.AnonymousClass207
    public final void Cga() {
        A00();
        A0G.A01(new TKK(this));
    }

    @Override // X.AnonymousClass207
    public final void FAG(final boolean z, final boolean z2) {
        A00();
        A0G.A01(new Runnable() { // from class: X.4OC
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                byte[] bArr;
                AnonymousClass206 anonymousClass206 = AnonymousClass206.this;
                C94464My c94464My = anonymousClass206.A02;
                if (c94464My != null) {
                    boolean z3 = !z;
                    synchronized (c94464My) {
                        c94464My.A01 = z3;
                    }
                }
                if (z2) {
                    C4PM A00 = C4PM.A00();
                    boolean z4 = z;
                    String A03 = A00.A03(Boolean.valueOf(z4));
                    if (A03 != null) {
                        C4MT c4mt = anonymousClass206.A07;
                        if (z4) {
                            i = c4mt.A02;
                        } else {
                            i = c4mt.A01;
                        }
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            C95024Pl c95024Pl = new C95024Pl(new C4PN(byteArrayOutputStream));
                            c95024Pl.A0U(AbstractC95064Pq.A03);
                            c95024Pl.A0J();
                            c95024Pl.A0K();
                            c95024Pl.A0U(AbstractC95064Pq.A04);
                            c95024Pl.A0Q(AbstractC95064Pq.A01);
                            c95024Pl.A0X(z4);
                            c95024Pl.A0Q(AbstractC95064Pq.A02);
                            c95024Pl.A0O(i);
                            c95024Pl.A0Q(AbstractC95064Pq.A00);
                            c95024Pl.A0V(A03);
                            c95024Pl.A0J();
                            c95024Pl.A0K();
                            bArr = byteArrayOutputStream.toByteArray();
                        } catch (C4MF unused) {
                            bArr = null;
                        }
                        C20H c20h = anonymousClass206.A0F;
                        if (c20h != null) {
                            c20h.setForeground(z4, bArr, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C20H c20h2 = anonymousClass206.A0F;
                if (c20h2 != null) {
                    c20h2.setForeground(z, null, null);
                }
            }
        });
    }

    @Override // X.AnonymousClass207
    public final void start() {
        A00();
        A01(null, this, C05F.A00);
    }
}
