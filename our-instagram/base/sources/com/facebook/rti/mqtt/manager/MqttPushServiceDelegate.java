package com.facebook.rti.mqtt.manager;

import X.AbstractC19560xi;
import X.AbstractC43591JPw;
import X.AbstractC58317Pt9;
import X.AbstractServiceC19690xx;
import X.AnonymousClass001;
import X.C05F;
import X.C0K8;
import X.C14360o3;
import X.C3UW;
import X.C3V1;
import X.C58697Q1f;
import X.C60546R6j;
import X.C60547R6k;
import X.C60548R6l;
import X.C60549R6m;
import X.C60551R6o;
import X.C60552R6p;
import X.C60553R6q;
import X.C60554R6r;
import X.C62701SMp;
import X.C62830STc;
import X.C62973SZs;
import X.C62975SZv;
import X.C63006SaU;
import X.C63211SfG;
import X.C63276Sga;
import X.C63293Sgt;
import X.C63306ShC;
import X.C63344Shz;
import X.C63363SiM;
import X.C63364SiN;
import X.C63367SiS;
import X.C74103Uo;
import X.C91M;
import X.EnumC61084Rey;
import X.EnumC61139Rft;
import X.EnumC61223Rij;
import X.ExecutorServiceC64921TZw;
import X.FutureC64810TUy;
import X.InterfaceC65368Tj0;
import X.InterfaceC65585TnO;
import X.InterfaceC65618To9;
import X.RhR;
import X.S12;
import X.S13;
import X.S14;
import X.S15;
import X.SN5;
import X.SZ6;
import X.T11;
import X.T1G;
import X.T1I;
import X.T1N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* loaded from: classes2.dex */
public abstract class MqttPushServiceDelegate extends MqttBackgroundServiceDelegate {
    public long A00;
    public InterfaceC65618To9 A01;
    public C74103Uo A02;
    public RealtimeSinceBootClock A03;
    public C62973SZs A04;
    public C63363SiM A05;
    public C63006SaU A06;
    public SZ6 A07;
    public InterfaceC65368Tj0 A08;
    public C63367SiS A09;
    public SN5 A0A;
    public AtomicBoolean A0B;
    public Integer A0C;
    public final InterfaceC65585TnO A0D;
    public volatile C63306ShC A0E;

    public final void A0O() {
        ((AtomicLong) ((T1G) ((MqttPushServiceDelegate) ((FbnsServiceDelegate) this)).A05.A05(C60551R6o.class)).A01(EnumC61223Rij.FbnsLiteNotificationDeliveryRetried)).addAndGet(r1.A04.A02());
    }

    public abstract void A0R(C62830STc c62830STc, Long l, String str, byte[] bArr, int i, long j);

    public static String A05(MqttPushServiceDelegate mqttPushServiceDelegate) {
        long j;
        C63364SiN c63364SiN = mqttPushServiceDelegate.A09.A0w;
        if (c63364SiN != null && c63364SiN.A0Y == C05F.A0C) {
            j = SystemClock.elapsedRealtime() - c63364SiN.A0V;
        } else {
            j = 0;
        }
        C63363SiM c63363SiM = mqttPushServiceDelegate.A05;
        C60549R6m A00 = C63363SiM.A00(c63363SiM);
        C60551R6o A01 = C63363SiM.A01(c63363SiM, j);
        C60548R6l c60548R6l = (C60548R6l) c63363SiM.A05(C60548R6l.class);
        try {
            return S13.A00(c63363SiM.A00.A00(false), c60548R6l, (C60552R6p) c63363SiM.A05(C60552R6p.class), A00, null, A01, (C60553R6q) c63363SiM.A05(C60553R6q.class), (C60554R6r) c63363SiM.A05(C60554R6r.class), true, false).toString(2);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static void A06(MqttPushServiceDelegate mqttPushServiceDelegate, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("pid", String.valueOf(Process.myPid()));
        mqttPushServiceDelegate.A01.Chz("life_cycle", hashMap);
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate, X.AbstractC19560xi
    public final void A0F() {
        if (this.A0E != null) {
            C63306ShC c63306ShC = this.A0E;
            String A0R = AnonymousClass001.A0R(S14.A00(C05F.A01), ".SERVICE_ON_DESTROY");
            C60546R6j c60546R6j = C60546R6j.A00;
            c63306ShC.A02(null, c60546R6j, c60546R6j, A0R, null, 0L, this.A0B.get());
        }
        super.A0F();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0H() {
        C63306ShC c63306ShC = this.A0E;
        String A0R = AnonymousClass001.A0R(S14.A00(C05F.A01), ".SERVICE_DESTROY");
        C60546R6j c60546R6j = C60546R6j.A00;
        boolean z = this.A0B.get();
        c63306ShC.A02(this.A06.A02(), c60546R6j, c60546R6j, A0R, null, this.A06.A06.get(), z);
        A06(this, "doDestroy");
        ((T11) this.A01).A01 = null;
        A0P();
    }

    @Override // com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate
    public void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String valueOf;
        HashSet hashSet;
        String str;
        String str2;
        String str3;
        SocketAddress remoteSocketAddress;
        try {
            printWriter.println("[ MqttPushService ]");
            printWriter.println(AnonymousClass001.A0R("persistence=", "FBNS_ALWAYS"));
            long j = this.A09.A03;
            if (j > 0) {
                valueOf = new Date(j).toString();
            } else {
                valueOf = String.valueOf(j);
            }
            printWriter.println(AnonymousClass001.A0R("networkChangedTime=", valueOf));
            StringBuilder sb = new StringBuilder();
            sb.append("subscribedTopics=");
            Map map = this.A09.A0Z;
            synchronized (map) {
                try {
                    hashSet = new HashSet(map.keySet());
                } finally {
                }
            }
            sb.append(hashSet);
            printWriter.println(sb.toString());
            if (!this.A0A.A06.A02) {
                return;
            }
            C63367SiS c63367SiS = this.A09;
            printWriter.println(AnonymousClass001.A0g("[ ", c63367SiS.A0X, " ]"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("keepAliveIntervalSeconds=");
            sb2.append(c63367SiS.A0c);
            printWriter.println(sb2.toString());
            NetworkInfo A01 = c63367SiS.A0F.A01();
            if (A01 != null) {
                str = A01.toString();
            } else {
                str = "null";
            }
            printWriter.println(AnonymousClass001.A0R("networkInfo=", str));
            if (c63367SiS.A0u != null) {
                String A0g = AnonymousClass001.A0g(((RhR) c63367SiS.A0u.first).toString(), "@", ((EnumC61139Rft) c63367SiS.A0u.second).toString());
                printWriter.println(AnonymousClass001.A0R("lastConnectLostTime=", new Date((System.currentTimeMillis() + c63367SiS.A0t) - SystemClock.elapsedRealtime()).toString()));
                printWriter.println(AnonymousClass001.A0R("lastConnectLostReason=", A0g));
            }
            C63364SiN c63364SiN = c63367SiS.A0w;
            if (c63364SiN != null) {
                synchronized (c63364SiN) {
                    try {
                        printWriter.println("[ MqttClient ]");
                        Integer num = c63364SiN.A0Y;
                        if (num != null) {
                            str2 = S15.A00(num);
                        } else {
                            str2 = "null";
                        }
                        printWriter.println(AnonymousClass001.A0R("state=", str2));
                        printWriter.println(AnonymousClass001.A0R("lastMessageSent=", C63364SiN.A01(c63364SiN, c63364SiN.A0T)));
                        printWriter.println(AnonymousClass001.A0R("lastMessageReceived=", C63364SiN.A01(c63364SiN, c63364SiN.A0S)));
                        printWriter.println(AnonymousClass001.A0R("connectionEstablished=", C63364SiN.A01(c63364SiN, c63364SiN.A0Q)));
                        printWriter.println(AnonymousClass001.A0R("lastPing=", C63364SiN.A01(c63364SiN, c63364SiN.A0U)));
                        C63293Sgt c63293Sgt = c63364SiN.A0E;
                        synchronized (c63293Sgt) {
                            Socket socket = c63293Sgt.A05;
                            if (socket != null && (remoteSocketAddress = socket.getRemoteSocketAddress()) != null) {
                                String str4 = c63293Sgt.A02;
                                if (str4 != null) {
                                    str3 = AnonymousClass001.A0g(str4, "|", remoteSocketAddress.toString());
                                } else {
                                    str3 = remoteSocketAddress.toString();
                                }
                            } else {
                                str3 = "N/A";
                            }
                        }
                        printWriter.println(AnonymousClass001.A0R("peer=", str3));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                printWriter.println("mMqttClient=null");
            }
            printWriter.println("[ MqttHealthStats ]");
            printWriter.println(A05(this));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.SKT, java.lang.Object] */
    public C3V1 A0K(Intent intent, int i, int i2) {
        String str;
        ?? obj = new Object();
        AbstractServiceC19690xx abstractServiceC19690xx = ((AbstractC19560xi) this).A01;
        Context applicationContext = abstractServiceC19690xx.getApplicationContext();
        C14360o3.A07(applicationContext);
        C3V1 A00 = obj.A00(applicationContext, this.A02);
        if (intent != null) {
            if (intent.hasExtra("caller")) {
                A00.A03 = intent.getStringExtra("caller");
            }
            if (intent.hasExtra("EXPIRED_SESSION")) {
                A00.A00 = intent.getLongExtra("EXPIRED_SESSION", 0L);
            }
            String A002 = AbstractC58317Pt9.A00(172);
            if (intent.hasExtra(A002)) {
                Integer valueOf = Integer.valueOf(intent.getIntExtra(A002, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD));
                if (!valueOf.equals(A00.A02)) {
                    A00.A02 = valueOf;
                    Context applicationContext2 = abstractServiceC19690xx.getApplicationContext();
                    C14360o3.A07(applicationContext2);
                    C91M ARA = this.A02.A00(applicationContext2, AnonymousClass001.A0R("rti.mqtt.", AbstractC43591JPw.A00(202))).ARA();
                    Integer num = A00.A02;
                    if (num != null) {
                        ARA.E7B(A002, num.intValue());
                        ARA.AIZ();
                    }
                }
            }
            str = intent.getAction();
        } else {
            str = "NULL";
        }
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf(i2);
        C63306ShC c63306ShC = this.A0E;
        String A0T = AnonymousClass001.A0T(S14.A00(C05F.A01), str, '.');
        String str2 = A00.A03;
        valueOf2.getClass();
        C60547R6k c60547R6k = new C60547R6k(valueOf2);
        valueOf3.getClass();
        C60547R6k c60547R6k2 = new C60547R6k(valueOf3);
        boolean z = this.A0B.get();
        c63306ShC.A02(this.A06.A02(), c60547R6k, c60547R6k2, A0T, str2, this.A06.A06.get(), z);
        return A00;
    }

    public Future A0L(RhR rhR) {
        FutureC64810TUy futureC64810TUy = FutureC64810TUy.A01;
        if (!this.A0B.getAndSet(false)) {
            C0K8.A0D("MqttPushService", "service/stop/inactive_connection");
            return futureC64810TUy;
        }
        C63211SfG c63211SfG = ((FbnsServiceDelegate) this).A04;
        BroadcastReceiver broadcastReceiver = c63211SfG.A00;
        if (broadcastReceiver != null) {
            C3UW.A02.A06(broadcastReceiver, c63211SfG.A03);
            c63211SfG.A00 = null;
        }
        this.A09.A0B();
        Future A08 = this.A09.A08(rhR);
        A0Q();
        return A08;
    }

    public void A0M() {
        C63363SiM c63363SiM = this.A05;
        EnumC61084Rey enumC61084Rey = EnumC61084Rey.A01;
        C63363SiM.A04(enumC61084Rey, c63363SiM).set(SystemClock.elapsedRealtime());
    }

    public void A0N() {
        SN5 sn5 = this.A0A;
        C63367SiS c63367SiS = sn5.A0O;
        C63006SaU c63006SaU = sn5.A0I;
        T1I t1i = sn5.A0K;
        RealtimeSinceBootClock realtimeSinceBootClock = sn5.A04;
        C63306ShC c63306ShC = sn5.A0B;
        C63363SiM c63363SiM = sn5.A0D;
        SZ6 sz6 = sn5.A0J;
        C62973SZs c62973SZs = sn5.A0C;
        InterfaceC65618To9 interfaceC65618To9 = sn5.A02;
        C74103Uo c74103Uo = sn5.A03;
        this.A09 = c63367SiS;
        this.A06 = c63006SaU;
        this.A08 = t1i;
        this.A03 = realtimeSinceBootClock;
        this.A0E = c63306ShC;
        this.A05 = c63363SiM;
        this.A07 = sz6;
        this.A04 = c62973SZs;
        this.A01 = interfaceC65618To9;
        this.A02 = c74103Uo;
    }

    public final void A0P() {
        if (this.A0B.get()) {
            A0L(RhR.A0L);
        }
        C63367SiS c63367SiS = this.A09;
        if (c63367SiS != null) {
            c63367SiS.A08(RhR.A0L);
        }
        SN5 sn5 = this.A0A;
        if (sn5 != null && !sn5.A0W) {
            sn5.A0W = true;
            C62975SZv c62975SZv = sn5.A0M;
            if (c62975SZv != null) {
                synchronized (c62975SZv) {
                    c62975SZv.A00();
                    if (c62975SZv.A01) {
                        boolean z = false;
                        if (!c62975SZv.A07.A06(c62975SZv.A04, c62975SZv.A05)) {
                            z = true;
                        }
                        c62975SZv.A01 = z;
                    }
                }
            }
            C63006SaU c63006SaU = sn5.A0I;
            if (c63006SaU != null) {
                synchronized (c63006SaU) {
                    try {
                        c63006SaU.A01.unregisterReceiver(c63006SaU.A00);
                    } catch (IllegalArgumentException e) {
                        C0K8.A0I(AbstractC58317Pt9.A00(588), AbstractC58317Pt9.A00(69), e);
                    }
                }
            }
            ExecutorServiceC64921TZw executorServiceC64921TZw = sn5.A0G;
            if (executorServiceC64921TZw != null) {
                executorServiceC64921TZw.shutdown();
            }
            C63344Shz c63344Shz = sn5.A0L;
            if (c63344Shz != null) {
                c63344Shz.A04();
            }
            SZ6 sz6 = sn5.A0J;
            if (sz6 != null) {
                synchronized (sz6) {
                    try {
                        sz6.A01.unregisterReceiver(sz6.A00);
                    } catch (IllegalArgumentException e2) {
                        C0K8.A0I("ScreenPowerState", AbstractC58317Pt9.A00(69), e2);
                    }
                    sz6.A04.set(null);
                }
            }
        }
    }

    public final void A0Q() {
        Integer num;
        C63364SiN c63364SiN = this.A09.A0w;
        if (c63364SiN == null) {
            num = C05F.A0N;
        } else {
            num = c63364SiN.A0Y;
            if (num == null) {
                return;
            }
        }
        Integer num2 = this.A0C;
        if (num != num2) {
            String A00 = S15.A00(num2);
            String A002 = S15.A00(num);
            this.A01.Chw(AnonymousClass001.A0u("[state_machine] ", A00, " -> ", A002));
            this.A0C = num;
            this.A04.A01(A002);
        }
    }

    public void A0S(C3V1 c3v1, Integer num) {
        if (!this.A0B.getAndSet(true)) {
            Integer num2 = c3v1.A02;
            if (num2 != null) {
                int intValue = num2.intValue();
                C63211SfG c63211SfG = ((FbnsServiceDelegate) this).A04;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                synchronized (c63211SfG.A07) {
                    Iterator it = c63211SfG.A02.values().iterator();
                    while (it.hasNext()) {
                        ((C63276Sga) it.next()).A01.set(timeUnit.toMillis(intValue));
                    }
                }
            }
            C63363SiM c63363SiM = this.A05;
            String A00 = S12.A00(num);
            C62701SMp c62701SMp = c63363SiM.A00;
            if (c62701SMp.A07 == null) {
                c62701SMp.A07 = A00;
                c62701SMp.A04.set(SystemClock.elapsedRealtime());
                c62701SMp.A02.set(SystemClock.elapsedRealtime());
            }
            C63211SfG c63211SfG2 = ((FbnsServiceDelegate) this).A04;
            if (c63211SfG2.A00 == null) {
                C58697Q1f c58697Q1f = new C58697Q1f(c63211SfG2);
                c63211SfG2.A00 = c58697Q1f;
                C3UW.A02.A07(c58697Q1f, c63211SfG2.A03, new IntentFilter(AbstractC58317Pt9.A00(729)), null, true);
            }
            this.A09.A0A();
        }
        this.A09.A0E(num);
    }

    public final boolean A0T() {
        if (!this.A0B.get()) {
            this.A01.Chw("MqttPushService/not_started");
            return false;
        }
        HashMap hashMap = new HashMap();
        if (!this.A08.EiC(hashMap)) {
            this.A01.Chz("MqttPushService/should_not_connect", hashMap);
            return false;
        }
        return true;
    }

    public MqttPushServiceDelegate(AbstractServiceC19690xx abstractServiceC19690xx) {
        super(abstractServiceC19690xx);
        this.A0B = new AtomicBoolean(false);
        this.A0C = C05F.A0N;
        this.A0D = new T1N(this);
    }
}
