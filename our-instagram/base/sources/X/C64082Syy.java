package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.instagram.realtimeclient.RealtimeMqttClientConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

/* renamed from: X.Syy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64082Syy implements AnonymousClass207, InterfaceC65585TnO {
    public Context A00;
    public Handler A01;
    public HandlerThread A02;
    public AnonymousClass201 A03;
    public InterfaceC93764Ji A04;
    public C4MI A05;
    public InterfaceC43661zx A06;
    public AbstractC94474Mz A07;
    public C62973SZs A08;
    public C63363SiM A09;
    public C4N1 A0A;
    public InterfaceC65368Tj0 A0B;
    public InterfaceC65564Tmq A0C;
    public C63367SiS A0D;
    public boolean A0E;
    public volatile EnumC122375gY A0F;
    public volatile Integer A0G;
    public volatile boolean A0H;

    @Override // X.InterfaceC65585TnO
    public final void D79() {
        A02(this, null);
    }

    @Override // X.InterfaceC65585TnO
    public final void D7B() {
        A02(this, null);
    }

    @Override // X.InterfaceC65585TnO
    public final void D8h() {
    }

    @Override // X.InterfaceC65585TnO
    public final void DTD(C62671SLj c62671SLj) {
    }

    private C95094Pu A00(EnumC122375gY enumC122375gY, String str) {
        Integer num = C05F.A0C;
        try {
            if (str.equals("CONNECTING")) {
                num = C05F.A00;
            } else if (str.equals("CONNECTED")) {
                num = C05F.A01;
            } else if (!str.equals("DISCONNECTED")) {
                throw AbstractC166987dD.A12(str);
            }
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        C63367SiS c63367SiS = this.A0D;
        return new C95094Pu(enumC122375gY, num, c63367SiS.A00, c63367SiS.A01);
    }

    private void A01() {
        if (this.A0H) {
        } else {
            throw AbstractC166987dD.A18("You must call init() before calling this method");
        }
    }

    public static void A02(C64082Syy c64082Syy, EnumC122375gY enumC122375gY) {
        Integer num;
        C63364SiN c63364SiN = c64082Syy.A0D.A0w;
        if (c63364SiN == null) {
            num = C05F.A0N;
        } else {
            num = c63364SiN.A0Y;
            if (num == null) {
                return;
            }
        }
        if (num != c64082Syy.A0G) {
            c64082Syy.A0G = num;
            if (num == C05F.A0N) {
                c64082Syy.A0F = enumC122375gY;
            }
            C62973SZs c62973SZs = c64082Syy.A08;
            String A00 = S15.A00(num);
            c62973SZs.A01(A00);
            AnonymousClass201 anonymousClass201 = c64082Syy.A03;
            if (anonymousClass201 != null) {
                anonymousClass201.onChannelStateChanged(c64082Syy.A00(enumC122375gY, A00));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.T1K, java.lang.Object, X.Tmq] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.3Uj] */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.S0y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.Tiy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.Tiy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.Tiy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object, X.S18] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Object, X.S19] */
    @Override // X.AnonymousClass207
    public final synchronized void CNi(C4MI c4mi) {
        if (!this.A0H) {
            this.A05 = c4mi;
            this.A00 = c4mi.A04;
            String str = c4mi.A08;
            this.A06 = c4mi.A06;
            this.A03 = c4mi.A05;
            this.A02 = MSY.A0A("MqttThread");
            InterfaceC93764Ji interfaceC93764Ji = this.A04;
            AbstractC93754Jh abstractC93754Jh = (AbstractC93754Jh) interfaceC93764Ji;
            C58919QJx c58919QJx = new C58919QJx(this, ((AbstractC93754Jh) interfaceC93764Ji).mMqttConnectionConfig, abstractC93754Jh.mPreferredTier, abstractC93754Jh.mPreferredSandbox);
            this.A07 = c58919QJx;
            this.A0A = ((AbstractC94474Mz) c58919QJx).A00;
            T1O t1o = new T1O(str);
            C93744Je c93744Je = c4mi.A0A;
            ?? obj = new Object();
            c93744Je.getClass();
            obj.A00 = c93744Je;
            this.A0C = obj;
            this.A02.start();
            this.A01 = MSY.A09(this.A02);
            boolean A1Q = AbstractC167007dF.A1Q(new Random().nextInt(10000), 30);
            T1B t1b = new T1B(this, 0);
            C63367SiS c63367SiS = new C63367SiS();
            T1A t1a = new T1A(this, c63367SiS);
            C4ME c4me = c4mi.A07;
            C74103Uo A02 = ((C74123Uq) C3UY.A00).A02();
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            Context context = this.A00;
            Integer num = C05F.A0Y;
            InterfaceC65564Tmq interfaceC65564Tmq = this.A0C;
            AbstractC94474Mz abstractC94474Mz = this.A07;
            ?? obj4 = new Object();
            Handler handler = this.A01;
            ?? obj5 = new Object();
            InterfaceC93784Jk interfaceC93784Jk = ((RealtimeMqttClientConfig) interfaceC93764Ji).mAnalyticsLogger;
            ?? obj6 = new Object();
            InterfaceC65369Tj1 keepaliveParams = interfaceC93764Ji.getKeepaliveParams();
            SII sii = new SII();
            ?? obj7 = new Object();
            ?? obj8 = new Object();
            obj8.A00 = A1Q;
            C62621SJe c62621SJe = new C62621SJe(context, handler, interfaceC93784Jk, obj5, new C60547R6k(obj8), null, A02, t1a, obj4, obj6, t1b, obj7, abstractC94474Mz, interfaceC65564Tmq, keepaliveParams, this, c63367SiS, t1o, sii, obj2, obj3, c4me, null, num, null, c4mi.A01, interfaceC93764Ji.getAppSpecificInfo());
            SN5 sn5 = new SN5();
            List list = c4mi.A09;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(new SubscribeTopic(AbstractC166987dD.A1B(it), 1));
            }
            sn5.A00(new C60547R6k(new C62486SDn(this.A00, A02)), c62621SJe, A1E);
            this.A0D = sn5.A0O;
            this.A0B = sn5.A0K;
            this.A08 = sn5.A0C;
            this.A09 = sn5.A0D;
            boolean z = c4mi.A03;
            boolean z2 = c4mi.A02;
            c63367SiS.A0f = z;
            c63367SiS.A0e = z2;
            this.A0H = true;
        } else {
            throw AbstractC166987dD.A18("This client has already been initialized");
        }
    }

    @Override // X.AnonymousClass207
    public final void Cnv(int i) {
        SPL spl;
        Map map = this.A0D.A0O.A02;
        synchronized (map) {
            spl = (SPL) map.remove(Integer.valueOf(i));
        }
        if (spl != null) {
            spl.A01(new C42Y(C05F.A0u, "abort pending operation", new CancellationException()));
        }
    }

    @Override // X.InterfaceC65585TnO
    public final void D7F(AbstractC64515THi abstractC64515THi) {
        EnumC122375gY enumC122375gY;
        if (abstractC64515THi instanceof C60546R6j) {
            enumC122375gY = null;
        } else {
            enumC122375gY = (EnumC122375gY) abstractC64515THi.A01();
        }
        A02(this, enumC122375gY);
    }

    @Override // X.InterfaceC65585TnO
    public final void DcR(C62830STc c62830STc, Long l, String str, byte[] bArr, int i, long j) {
        A03(this, new TR0(this, c62830STc, str, bArr, j));
    }

    @Override // X.InterfaceC65585TnO
    public final void EHT(long j, String str, boolean z) {
        A03(this, new TK6(this));
    }

    @Override // X.InterfaceC65585TnO
    public final boolean EiB() {
        if (!this.A0E) {
            return false;
        }
        if (!this.A0B.EiC(AbstractC166987dD.A1G())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[Catch: all -> 0x0064, TryCatch #1 {, blocks: (B:4:0x0006, B:6:0x000c, B:8:0x0012, B:10:0x0019, B:11:0x001a, B:14:0x001f, B:20:0x002f, B:23:0x0042, B:24:0x003e, B:25:0x0046, B:26:0x0048, B:34:0x005f, B:41:0x0063, B:42:0x0024, B:28:0x0049, B:33:0x005e, B:38:0x0054), top: B:3:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AnonymousClass207
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FAG(boolean r10, boolean r11) {
        /*
            r9 = this;
            X.SiS r5 = r9.A0D
            r6 = 0
            java.lang.Object r2 = r5.A0m
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.A0b     // Catch: java.lang.Throwable -> L64
            boolean r0 = X.AbstractC167007dF.A1N(r10)
            boolean r1 = r3.compareAndSet(r0, r10)     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L1b
            r5.A0C()     // Catch: java.lang.Throwable -> L64
            X.SiN r0 = r5.A0w     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L1b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
        L1b:
            if (r11 != 0) goto L29
            if (r10 == 0) goto L24
            boolean r0 = r5.A0f     // Catch: java.lang.Throwable -> L64
            if (r0 != 0) goto L2b
            goto L29
        L24:
            boolean r0 = r5.A0e     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L29
            goto L2b
        L29:
            r8 = 0
            goto L2c
        L2b:
            r8 = 1
        L2c:
            r7 = 0
            if (r1 == 0) goto L46
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L64
            boolean r1 = r3.get()     // Catch: java.lang.Throwable -> L64
            X.Tj1 r0 = r5.A0K     // Catch: java.lang.Throwable -> L64
            if (r1 == 0) goto L3e
            r0 = 60
            goto L42
        L3e:
            int r0 = r0.Aew()     // Catch: java.lang.Throwable -> L64
        L42:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L64
        L46:
            java.util.Map r1 = r5.A0Z     // Catch: java.lang.Throwable -> L64
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L64
            android.util.Pair r4 = r5.A05()     // Catch: java.lang.Throwable -> L61
            if (r6 != 0) goto L54
            if (r7 != 0) goto L54
            if (r4 != 0) goto L54
            goto L5e
        L54:
            java.util.concurrent.Executor r0 = r5.A0a     // Catch: java.lang.Throwable -> L61
            X.TR2 r3 = new X.TR2     // Catch: java.lang.Throwable -> L61
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L61
            r0.execute(r3)     // Catch: java.lang.Throwable -> L61
        L5e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            return
        L61:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64082Syy.FAG(boolean, boolean):void");
    }

    public static void A03(C64082Syy c64082Syy, Runnable runnable) {
        if (Looper.myLooper() != c64082Syy.A01.getLooper()) {
            c64082Syy.A01.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // X.AnonymousClass207
    public final C5ET BV8() {
        long j;
        A01();
        C95094Pu A00 = A00(this.A0F, S15.A00(this.A0G));
        C63363SiM c63363SiM = this.A09;
        C63364SiN c63364SiN = this.A0D.A0w;
        if (c63364SiN != null && c63364SiN.A0Y == C05F.A0C) {
            j = AbstractC58318PtA.A0B(c63364SiN.A0V);
        } else {
            j = 0;
        }
        C60549R6m A002 = C63363SiM.A00(c63363SiM);
        C60551R6o A01 = C63363SiM.A01(c63363SiM, j);
        C60548R6l c60548R6l = (C60548R6l) c63363SiM.A05(C60548R6l.class);
        try {
            S13.A00(c63363SiM.A00.A00(true), c60548R6l, (C60552R6p) c63363SiM.A05(C60552R6p.class), A002, null, A01, (C60553R6q) c63363SiM.A05(C60553R6q.class), (C60554R6r) c63363SiM.A05(C60554R6r.class), true, false).toString();
        } catch (JSONException unused) {
        }
        return new C5ET(A00);
    }

    @Override // X.AnonymousClass207
    public final void Cga() {
        A01();
        this.A01.post(new TKA(this));
    }

    @Override // X.AnonymousClass207
    public final void E6m(C4Q9 c4q9, C4Q5 c4q5, String str, byte[] bArr) {
        A01();
        str.getClass();
        bArr.getClass();
        c4q5.getClass();
        try {
            if (this.A0D.A04(new T1S(c4q9, this, 0), S1B.A00(c4q5.A00), str, bArr) != -1) {
                return;
            }
        } catch (C42Y unused) {
        }
        A03(this, new TNY(c4q9, this));
    }

    @Override // X.AnonymousClass207
    public final int E6o(C4Q9 c4q9, C4Q5 c4q5, InterfaceC65545TmK interfaceC65545TmK, String str, byte[] bArr) {
        T1S t1s;
        int i;
        A01();
        str.getClass();
        bArr.getClass();
        c4q5.getClass();
        boolean z = true;
        int i2 = -1;
        try {
            C63367SiS c63367SiS = this.A0D;
            Integer A00 = S1B.A00(c4q5.A00);
            if (c4q9 == null) {
                t1s = null;
            } else {
                t1s = new T1S(c4q9, this, 1);
            }
            AbstractC64515THi A06 = c63367SiS.A06(interfaceC65545TmK, t1s, A00, str, bArr, c63367SiS.A0E.A00().A0L);
            if (!(A06 instanceof C60546R6j)) {
                i = ((SPL) A06.A01()).A01;
                if (i != -1) {
                    z = false;
                }
            } else {
                i = -1;
            }
            i2 = i;
        } catch (C42Y unused) {
        }
        if (z && c4q9 != null) {
            A03(this, new TNX(c4q9, this));
        }
        return i2;
    }

    @Override // X.AnonymousClass207
    public final void destroy() {
        A01();
        this.A01.post(new TK9(this));
    }

    @Override // X.AnonymousClass207
    public final void start() {
        A01();
        this.A01.post(new TK7(this));
    }

    @Override // X.AnonymousClass207
    public final void stop() {
        A01();
        this.A01.post(new TK8(this));
    }
}
