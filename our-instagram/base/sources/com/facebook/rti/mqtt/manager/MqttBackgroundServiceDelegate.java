package com.facebook.rti.mqtt.manager;

import X.AbstractC09800fd;
import X.AbstractC19560xi;
import X.AbstractC62178S0z;
import X.AbstractC62803SRx;
import X.AbstractC74143Us;
import X.AbstractHandlerC72132XPe;
import X.AbstractServiceC19690xx;
import X.AnonymousClass001;
import X.C05F;
import X.C0K8;
import X.C14360o3;
import X.C23483Aaw;
import X.C3UV;
import X.C3UY;
import X.C3Uj;
import X.C3V2;
import X.C3VA;
import X.C4N7;
import X.C4N8;
import X.C60546R6j;
import X.C60547R6k;
import X.C60555R6s;
import X.C60560R6z;
import X.C62486SDn;
import X.C62621SJe;
import X.C62711SMz;
import X.C62912SWt;
import X.C62945SYn;
import X.C62952SYu;
import X.C63306ShC;
import X.C63367SiS;
import X.C64148T0z;
import X.C74083Um;
import X.C74103Uo;
import X.C74123Uq;
import X.C91M;
import X.EnumC74133Ur;
import X.ExecutorC64806TUu;
import X.InterfaceC65365Tix;
import X.InterfaceC65369Tj1;
import X.InterfaceC65585TnO;
import X.S14;
import X.SBY;
import X.SII;
import X.SN5;
import X.SNI;
import X.SOA;
import X.SVU;
import X.Sh7;
import X.T11;
import X.T16;
import X.T17;
import X.T18;
import X.T19;
import X.T1C;
import X.T1D;
import X.T1P;
import X.XXc;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class MqttBackgroundServiceDelegate extends AbstractC19560xi {
    public boolean A00;
    public final Object A01;
    public volatile AbstractHandlerC72132XPe A02;

    @Override // X.AbstractC19560xi
    public final void A09(Intent intent, int i) {
        A07(intent, -1, i);
    }

    public abstract void A0H();

    public abstract void A0J(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @Override // X.AbstractC19560xi
    public final int A07(Intent intent, int i, int i2) {
        this.A02.A02(i, i2, intent);
        return 1;
    }

    @Override // X.AbstractC19560xi
    public void A0F() {
        this.A02.A00();
        super.A0F();
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, X.RpV] */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.S1D] */
    /* JADX WARN: Type inference failed for: r1v54, types: [java.lang.Object, X.RpW] */
    /* JADX WARN: Type inference failed for: r31v1, types: [X.S0y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r47v0, types: [java.lang.Object, X.S18] */
    /* JADX WARN: Type inference failed for: r48v0, types: [java.lang.Object, X.S19] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.lang.Object, X.4ME] */
    public final void A0G() {
        AbstractC09800fd.A01("MqttBackgroundServiceDelegate.ensureInitialized", -1398809912);
        try {
            synchronized (this.A01) {
                if (!this.A00) {
                    MqttPushServiceDelegate mqttPushServiceDelegate = (MqttPushServiceDelegate) this;
                    boolean z = false;
                    if (mqttPushServiceDelegate.A0A == null) {
                        z = true;
                    }
                    AbstractC62803SRx.A01(z);
                    FbnsServiceDelegate fbnsServiceDelegate = (FbnsServiceDelegate) mqttPushServiceDelegate;
                    FbnsServiceDelegate fbnsServiceDelegate2 = FbnsServiceDelegate.A0E;
                    if (fbnsServiceDelegate2 != null) {
                        fbnsServiceDelegate2.A0P();
                    }
                    FbnsServiceDelegate.A0E = fbnsServiceDelegate;
                    C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
                    AbstractServiceC19690xx abstractServiceC19690xx = ((AbstractC19560xi) fbnsServiceDelegate).A01;
                    C14360o3.A07(abstractServiceC19690xx.getApplicationContext());
                    C74103Uo A02 = c74123Uq.A02();
                    Context applicationContext = abstractServiceC19690xx.getApplicationContext();
                    C14360o3.A07(applicationContext);
                    fbnsServiceDelegate.A03 = new T11(applicationContext, A02);
                    T17 t17 = new T17(fbnsServiceDelegate);
                    T18 t18 = new T18(fbnsServiceDelegate);
                    T19 t19 = new T19(fbnsServiceDelegate);
                    Context applicationContext2 = abstractServiceC19690xx.getApplicationContext();
                    C14360o3.A07(applicationContext2);
                    C3VA c3va = new C3VA(applicationContext2, false);
                    Context applicationContext3 = abstractServiceC19690xx.getApplicationContext();
                    C14360o3.A07(applicationContext3);
                    boolean A022 = C3V2.A02(applicationContext3.getPackageName());
                    C74083Um c74083Um = c74123Uq.A00;
                    if (c74083Um.A00 != null) {
                        c74083Um.A00();
                        Context applicationContext4 = abstractServiceC19690xx.getApplicationContext();
                        C14360o3.A07(applicationContext4);
                        T1P t1p = new T1P(applicationContext4, A02, A022);
                        fbnsServiceDelegate.A09 = t1p.AxH();
                        Context applicationContext5 = abstractServiceC19690xx.getApplicationContext();
                        C14360o3.A07(applicationContext5);
                        C60555R6s c60555R6s = new C60555R6s(applicationContext5);
                        Context applicationContext6 = abstractServiceC19690xx.getApplicationContext();
                        C14360o3.A07(applicationContext6);
                        Integer num = C05F.A01;
                        C4N8 A00 = A02.A00(applicationContext6, AnonymousClass001.A0R("rti.mqtt.", "analytics"));
                        C14360o3.A07(abstractServiceC19690xx.getApplicationContext());
                        boolean z2 = true;
                        int i = 1;
                        if (!(!C3UV.A00(r1).A02)) {
                            i = 10000;
                        }
                        C91M ARA = A00.ARA();
                        if (new Random().nextInt(10000) >= i) {
                            z2 = false;
                        }
                        EnumC74133Ur enumC74133Ur = EnumC74133Ur.A0C;
                        enumC74133Ur.A01(ARA, Integer.valueOf(i));
                        EnumC74133Ur.A0B.A01(ARA, Boolean.valueOf(z2));
                        for (Map.Entry entry : FbnsServiceDelegate.A0H.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (value != null && !enumC74133Ur.A00.A00().isInstance(value)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Cannot cast");
                                sb.append(value.getClass());
                                throw new ClassCastException(sb.toString());
                            }
                            enumC74133Ur.A00.A03(ARA, value, AnonymousClass001.A0g("LOG_SR", "/", str));
                        }
                        ARA.AIb("FbnsServiceDelegate", "PreferencesManager failed to commit analytics config values");
                        final AtomicInteger atomicInteger = new AtomicInteger(-1);
                        int i2 = 1;
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        EnumC74133Ur enumC74133Ur2 = EnumC74133Ur.A0A;
                        Integer num2 = -1;
                        InterfaceC65365Tix interfaceC65365Tix = new InterfaceC65365Tix() { // from class: X.T12
                            @Override // X.InterfaceC65365Tix
                            public final void onResult(Object obj) {
                                AtomicInteger atomicInteger2 = atomicInteger;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                FbnsServiceDelegate fbnsServiceDelegate3 = FbnsServiceDelegate.A0E;
                                atomicInteger2.set(((Number) obj).intValue());
                                countDownLatch2.countDown();
                            }
                        };
                        AbstractC74143Us abstractC74143Us = enumC74133Ur2.A00;
                        if (abstractC74143Us.A00().isInstance(num2)) {
                            abstractC74143Us.A04(interfaceC65365Tix, A00, num2, "logging_health_stats_sample_rate");
                            try {
                                countDownLatch.await(5L, TimeUnit.SECONDS);
                            } catch (InterruptedException e) {
                                C0K8.A0F("FbnsServiceDelegate", "Waiting for current health sample rate fetch in initHealthStatsAnalytics was interrupted", e);
                            }
                            int i3 = atomicInteger.get();
                            if (i3 < 0 || i3 > 10000) {
                                C14360o3.A07(abstractServiceC19690xx.getApplicationContext());
                                if (!(!C3UV.A00(r1).A02)) {
                                    i2 = 10000;
                                }
                                Integer valueOf = Integer.valueOf(i2);
                                C91M ARA2 = A00.ARA();
                                enumC74133Ur2.A01(ARA2, valueOf);
                                ARA2.AIb("FbnsServiceDelegate", "PreferencesManager failed to commit health stats sampling rate");
                                i3 = i2;
                            }
                            AtomicLong atomicLong = new AtomicLong(-1L);
                            CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            try {
                                atomicLong.set(Long.parseLong(((C4N7) A00).getString("fb_uid", "")));
                            } catch (NumberFormatException unused) {
                            }
                            countDownLatch2.countDown();
                            try {
                                countDownLatch2.await(5L, TimeUnit.SECONDS);
                            } catch (InterruptedException e2) {
                                C0K8.A0F("FbnsServiceDelegate", "Waiting for logger user id fetch was interrupted", e2);
                            }
                            Long valueOf2 = Long.valueOf(atomicLong.get());
                            ?? obj = new Object();
                            obj.A00 = A00;
                            fbnsServiceDelegate.A06 = obj;
                            boolean z3 = false;
                            if (new Random().nextInt(10000) < i3) {
                                z3 = true;
                            }
                            C74083Um c74083Um2 = c74123Uq.A02;
                            if (c74083Um2.A00 != null) {
                                C3Uj c3Uj = (C3Uj) c74083Um2.A00();
                                Context applicationContext7 = abstractServiceC19690xx.getApplicationContext();
                                C14360o3.A07(applicationContext7);
                                c3Uj.A00 = z3;
                                Executor executor = C62952SYu.A04;
                                C62952SYu c62952SYu = new C62952SYu(applicationContext7, new T1D(c60555R6s, fbnsServiceDelegate));
                                C62945SYn c62945SYn = new C62945SYn(applicationContext7, C3UV.A00(applicationContext7), "MQTT", null);
                                String AxH = t1p.AxH();
                                Context applicationContext8 = abstractServiceC19690xx.getApplicationContext();
                                C14360o3.A07(applicationContext8);
                                ?? obj2 = new Object();
                                obj2.A00 = A00;
                                String A002 = S14.A00(num);
                                T1C t1c = new T1C(c60555R6s, fbnsServiceDelegate);
                                ExecutorC64806TUu executorC64806TUu = C64148T0z.A0E;
                                C3UV A003 = C3UV.A00(applicationContext8);
                                C64148T0z c64148T0z = new C64148T0z(applicationContext8, c62952SYu, A00, t1c, new T16(AxH), obj2, A002, new C62945SYn(applicationContext8, A003, "MQTT", null).A01(), A003.A01, A003.A00);
                                fbnsServiceDelegate.A08 = new SNI(c62952SYu);
                                Context applicationContext9 = abstractServiceC19690xx.getApplicationContext();
                                C14360o3.A07(applicationContext9);
                                C4N8 A004 = A02.A00(applicationContext9, AnonymousClass001.A0R("rti.mqtt.", "ids"));
                                ?? obj3 = new Object();
                                ?? obj4 = new Object();
                                Context applicationContext10 = abstractServiceC19690xx.getApplicationContext();
                                C14360o3.A07(applicationContext10);
                                Context applicationContext11 = abstractServiceC19690xx.getApplicationContext();
                                C14360o3.A07(applicationContext11);
                                boolean A005 = AbstractC62178S0z.A00(applicationContext11);
                                boolean z4 = false;
                                if (A005) {
                                    z4 = true;
                                }
                                C63367SiS c63367SiS = new C63367SiS(z4);
                                InterfaceC65585TnO interfaceC65585TnO = ((MqttPushServiceDelegate) fbnsServiceDelegate).A0D;
                                C23483Aaw c23483Aaw = new C23483Aaw(A004);
                                ?? obj5 = new Object();
                                Handler handler = new Handler(Looper.getMainLooper());
                                ?? obj6 = new Object();
                                T11 t11 = fbnsServiceDelegate.A03;
                                C62912SWt c62912SWt = fbnsServiceDelegate.A0C;
                                if (c62912SWt.A02 == null) {
                                    c62912SWt.A02 = c60555R6s;
                                }
                                InterfaceC65369Tj1 interfaceC65369Tj1 = fbnsServiceDelegate.A0B;
                                SII sii = new SII();
                                C60547R6k c60547R6k = new C60547R6k(c3Uj);
                                SVU svu = new SVU(fbnsServiceDelegate);
                                C60560R6z c60560R6z = new C60560R6z();
                                C62621SJe c62621SJe = new C62621SJe(applicationContext10, handler, c64148T0z, obj6, c60547R6k, t11, A02, null, t17, t19, t18, t19, c60555R6s, c23483Aaw, interfaceC65369Tj1, interfaceC65585TnO, c63367SiS, t1p, sii, obj3, obj4, obj5, svu, num, valueOf2, null, null);
                                ?? r14 = new Object() { // from class: X.S1D
                                };
                                c60560R6z.A00 = c3va;
                                Context context = c62621SJe.A00;
                                C74103Uo A023 = c74123Uq.A02();
                                c60560R6z.A00(new C60547R6k(new C62486SDn(context, A023)), c62621SJe, FbnsServiceDelegate.A0G);
                                C4N8 A006 = A023.A00(context, AnonymousClass001.A0R("rti.mqtt.", "analytics"));
                                c60560R6z.A03 = new Sh7(context, A023, c60560R6z.A05, c60560R6z.A06);
                                c60560R6z.A02 = new C62711SMz(context, c60560R6z.A00, A023, c60560R6z.A04, c60560R6z.A07, c60560R6z.A08);
                                c60560R6z.A01 = new SOA(context, ((SN5) c60560R6z).A01, A006, c60560R6z.A04, c62945SYn, c60560R6z.A0I, r14);
                                mqttPushServiceDelegate.A0A = c60560R6z;
                                mqttPushServiceDelegate.A0N();
                                mqttPushServiceDelegate.A0M();
                                ((T11) mqttPushServiceDelegate.A01).A01 = new SBY(mqttPushServiceDelegate);
                                MqttPushServiceDelegate.A06(mqttPushServiceDelegate, "doCreate");
                                C63306ShC c63306ShC = mqttPushServiceDelegate.A0E;
                                String A0R = AnonymousClass001.A0R(S14.A00(num), ".SERVICE_CREATE");
                                C60546R6j c60546R6j = C60546R6j.A00;
                                c63306ShC.A02(mqttPushServiceDelegate.A06.A02(), c60546R6j, c60546R6j, A0R, null, mqttPushServiceDelegate.A06.A06.get(), mqttPushServiceDelegate.A0B.get());
                                this.A00 = true;
                            } else {
                                throw new RuntimeException("IMqttStatsLogSwitcher not bound in FBNS Config Manager");
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cannot cast");
                            sb2.append(num2.getClass());
                            throw new ClassCastException(sb2.toString());
                        }
                    } else {
                        throw new RuntimeException("MqttIdManagerBuilder not bound in Fbns Config Manager");
                    }
                }
            }
            AbstractC09800fd.A00(282297691);
        } catch (Throwable th) {
            AbstractC09800fd.A00(1268921199);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0106, code lost:
    
        if (r1 != null) goto L5;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(int r18, int r19, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate.A0I(int, int, android.content.Intent):void");
    }

    public MqttBackgroundServiceDelegate(AbstractServiceC19690xx abstractServiceC19690xx) {
        super(abstractServiceC19690xx);
        this.A01 = new Object();
    }

    @Override // X.AbstractC19560xi
    public final void A0A(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        A0G();
        A0J(fileDescriptor, printWriter, strArr);
    }

    @Override // X.AbstractC19560xi
    public void A0C() {
        super.A0C();
        this.A02 = new XXc(Looper.getMainLooper(), this);
        this.A02.A01();
    }
}
