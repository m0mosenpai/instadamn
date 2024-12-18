package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: X.SiS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63367SiS {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public Context A04;
    public Handler A05;
    public AbstractC64515THi A06;
    public C3Uj A07;
    public InterfaceC65618To9 A08;
    public RealtimeSinceBootClock A09;
    public C62831STd A0A;
    public C62670SLh A0B;
    public C63306ShC A0C;
    public C63363SiM A0D;
    public C4N0 A0E;
    public C63006SaU A0F;
    public SZ6 A0G;
    public C62465SCs A0H;
    public InterfaceC65564Tmq A0I;
    public C63344Shz A0J;
    public InterfaceC65369Tj1 A0K;
    public C62975SZv A0L;
    public InterfaceC65585TnO A0M;
    public SJF A0N;
    public C62970SZn A0O;
    public C4N9 A0P;
    public C4N3 A0Q;
    public InterfaceC65590TnV A0R;
    public InterfaceC65545TmK A0S;
    public InterfaceC65498TlM A0T;
    public C4ME A0U;
    public SZK A0V;
    public SVU A0W;
    public String A0Y;
    public Executor A0a;
    public AtomicInteger A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public long A0i;
    public BroadcastReceiver A0j;
    public BroadcastReceiver A0k;
    public Method A0l;
    public final Object A0m;
    public final Runnable A0n;
    public final Runnable A0o;
    public final Runnable A0p;
    public final Runnable A0q;
    public final AtomicLong A0r;
    public final SBW A0s;
    public volatile long A0t;
    public volatile Pair A0u;
    public volatile C4N1 A0v;
    public volatile C63364SiN A0w;
    public volatile S18 A0x;
    public volatile long A0y;
    public String A0X = "FbnsConnectionManager";
    public AtomicBoolean A0b = new AtomicBoolean(false);
    public Map A0Z = AbstractC166987dD.A1G();
    public boolean A0h = false;

    public final int A04(InterfaceC65498TlM interfaceC65498TlM, Integer num, String str, byte[] bArr) {
        AbstractC64515THi A06 = A06(null, interfaceC65498TlM, num, str, bArr, this.A0E.A00().A0L);
        if (A06 instanceof C60546R6j) {
            return -1;
        }
        return ((SPL) A06.A01()).A01;
    }

    public final Future A07(C63364SiN c63364SiN, RhR rhR, Integer num) {
        synchronized (this) {
            if (this.A0w == c63364SiN) {
                this.A0w = null;
            }
        }
        boolean z = false;
        Future<?> future = FutureC64810TUy.A01;
        if (c63364SiN != null) {
            z = AbstractC167007dF.A1X(c63364SiN.A0Y, C05F.A0N);
            c63364SiN.A0X = null;
            synchronized (c63364SiN) {
                EnumC61139Rft enumC61139Rft = EnumC61139Rft.DISCONNECT;
                if (c63364SiN.A04()) {
                    future = c63364SiN.A0J.submit(new RunnableC64701TQh(c63364SiN, enumC61139Rft, rhR, null));
                }
            }
            this.A01 = System.currentTimeMillis();
        }
        if (!z) {
            A01(C60546R6j.A00, this, num);
            return future;
        }
        this.A0M.D7F(C60546R6j.A00);
        return future;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
    
        if (X.AbstractC166987dD.A0L(X.AbstractC58318PtA.A0B(r1)) >= r18.A0E.A00().A0O) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.AbstractC64515THi r17, X.C63367SiS r18, java.lang.Integer r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63367SiS.A01(X.THi, X.SiS, java.lang.Integer):void");
    }

    public static void A02(C63367SiS c63367SiS) {
        boolean z;
        SVU svu = c63367SiS.A0W;
        if (svu != null) {
            FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0E;
            C62912SWt c62912SWt = svu.A00.A0C;
            c62912SWt.A01 = 0;
            int i = c62912SWt.A00 + 1;
            c62912SWt.A00 = i;
            if (i % 2 == 0) {
                AtomicInteger atomicInteger = c62912SWt.A03;
                int i2 = atomicInteger.get() - 1;
                synchronized (c62912SWt) {
                    if (i2 >= 0) {
                        if (i2 < C62912SWt.A05.size()) {
                            atomicInteger.set(i2);
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    SVU.A00(svu);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:18|19|19f|28|(1:30)(1:106)|31|(25:33|(1:35)|36|37|38|39|(2:42|40)|43|44|(1:46)(1:102)|47|(1:49)|50|(1:52)|53|(1:55)(1:101)|56|(1:58)|59|33c|69|(2:71|72)(1:97)|73|378|78)|105|36|37|38|39|(1:40)|43|44|(0)(0)|47|(0)|50|(0)|53|(0)(0)|56|(0)|59|33c) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033e A[Catch: all -> 0x03cb, TRY_LEAVE, TryCatch #4 {, blocks: (B:19:0x0184, B:20:0x019f, B:28:0x01bc, B:30:0x01c1, B:31:0x01e0, B:33:0x01ea, B:36:0x0205, B:38:0x0230, B:39:0x0242, B:40:0x024e, B:42:0x0254, B:44:0x0261, B:46:0x026f, B:47:0x0279, B:49:0x027d, B:50:0x0287, B:52:0x02b9, B:53:0x02bd, B:55:0x02ee, B:56:0x02f2, B:58:0x0304, B:59:0x030a, B:60:0x033c, B:68:0x0357, B:69:0x0358, B:72:0x0370, B:73:0x0372, B:74:0x0378, B:77:0x039b, B:94:0x03c3, B:100:0x03ca, B:97:0x036d, B:99:0x03c9, B:101:0x033e, B:106:0x01f7, B:76:0x0379, B:63:0x0343, B:65:0x034d, B:66:0x0356), top: B:18:0x0184, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0254 A[Catch: all -> 0x03cb, LOOP:1: B:40:0x024e->B:42:0x0254, LOOP_END, TryCatch #4 {, blocks: (B:19:0x0184, B:20:0x019f, B:28:0x01bc, B:30:0x01c1, B:31:0x01e0, B:33:0x01ea, B:36:0x0205, B:38:0x0230, B:39:0x0242, B:40:0x024e, B:42:0x0254, B:44:0x0261, B:46:0x026f, B:47:0x0279, B:49:0x027d, B:50:0x0287, B:52:0x02b9, B:53:0x02bd, B:55:0x02ee, B:56:0x02f2, B:58:0x0304, B:59:0x030a, B:60:0x033c, B:68:0x0357, B:69:0x0358, B:72:0x0370, B:73:0x0372, B:74:0x0378, B:77:0x039b, B:94:0x03c3, B:100:0x03ca, B:97:0x036d, B:99:0x03c9, B:101:0x033e, B:106:0x01f7, B:76:0x0379, B:63:0x0343, B:65:0x034d, B:66:0x0356), top: B:18:0x0184, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026f A[Catch: all -> 0x03cb, TryCatch #4 {, blocks: (B:19:0x0184, B:20:0x019f, B:28:0x01bc, B:30:0x01c1, B:31:0x01e0, B:33:0x01ea, B:36:0x0205, B:38:0x0230, B:39:0x0242, B:40:0x024e, B:42:0x0254, B:44:0x0261, B:46:0x026f, B:47:0x0279, B:49:0x027d, B:50:0x0287, B:52:0x02b9, B:53:0x02bd, B:55:0x02ee, B:56:0x02f2, B:58:0x0304, B:59:0x030a, B:60:0x033c, B:68:0x0357, B:69:0x0358, B:72:0x0370, B:73:0x0372, B:74:0x0378, B:77:0x039b, B:94:0x03c3, B:100:0x03ca, B:97:0x036d, B:99:0x03c9, B:101:0x033e, B:106:0x01f7, B:76:0x0379, B:63:0x0343, B:65:0x034d, B:66:0x0356), top: B:18:0x0184, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027d A[Catch: all -> 0x03cb, TryCatch #4 {, blocks: (B:19:0x0184, B:20:0x019f, B:28:0x01bc, B:30:0x01c1, B:31:0x01e0, B:33:0x01ea, B:36:0x0205, B:38:0x0230, B:39:0x0242, B:40:0x024e, B:42:0x0254, B:44:0x0261, B:46:0x026f, B:47:0x0279, B:49:0x027d, B:50:0x0287, B:52:0x02b9, B:53:0x02bd, B:55:0x02ee, B:56:0x02f2, B:58:0x0304, B:59:0x030a, B:60:0x033c, B:68:0x0357, B:69:0x0358, B:72:0x0370, B:73:0x0372, B:74:0x0378, B:77:0x039b, B:94:0x03c3, B:100:0x03ca, B:97:0x036d, B:99:0x03c9, B:101:0x033e, B:106:0x01f7, B:76:0x0379, B:63:0x0343, B:65:0x034d, B:66:0x0356), top: B:18:0x0184, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02b9 A[Catch: all -> 0x03cb, TryCatch #4 {, blocks: (B:19:0x0184, B:20:0x019f, B:28:0x01bc, B:30:0x01c1, B:31:0x01e0, B:33:0x01ea, B:36:0x0205, B:38:0x0230, B:39:0x0242, B:40:0x024e, B:42:0x0254, B:44:0x0261, B:46:0x026f, B:47:0x0279, B:49:0x027d, B:50:0x0287, B:52:0x02b9, B:53:0x02bd, B:55:0x02ee, B:56:0x02f2, B:58:0x0304, B:59:0x030a, B:60:0x033c, B:68:0x0357, B:69:0x0358, B:72:0x0370, B:73:0x0372, B:74:0x0378, B:77:0x039b, B:94:0x03c3, B:100:0x03ca, B:97:0x036d, B:99:0x03c9, B:101:0x033e, B:106:0x01f7, B:76:0x0379, B:63:0x0343, B:65:0x034d, B:66:0x0356), top: B:18:0x0184, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ee A[Catch: all -> 0x03cb, TryCatch #4 {, blocks: (B:19:0x0184, B:20:0x019f, B:28:0x01bc, B:30:0x01c1, B:31:0x01e0, B:33:0x01ea, B:36:0x0205, B:38:0x0230, B:39:0x0242, B:40:0x024e, B:42:0x0254, B:44:0x0261, B:46:0x026f, B:47:0x0279, B:49:0x027d, B:50:0x0287, B:52:0x02b9, B:53:0x02bd, B:55:0x02ee, B:56:0x02f2, B:58:0x0304, B:59:0x030a, B:60:0x033c, B:68:0x0357, B:69:0x0358, B:72:0x0370, B:73:0x0372, B:74:0x0378, B:77:0x039b, B:94:0x03c3, B:100:0x03ca, B:97:0x036d, B:99:0x03c9, B:101:0x033e, B:106:0x01f7, B:76:0x0379, B:63:0x0343, B:65:0x034d, B:66:0x0356), top: B:18:0x0184, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0304 A[Catch: all -> 0x03cb, TryCatch #4 {, blocks: (B:19:0x0184, B:20:0x019f, B:28:0x01bc, B:30:0x01c1, B:31:0x01e0, B:33:0x01ea, B:36:0x0205, B:38:0x0230, B:39:0x0242, B:40:0x024e, B:42:0x0254, B:44:0x0261, B:46:0x026f, B:47:0x0279, B:49:0x027d, B:50:0x0287, B:52:0x02b9, B:53:0x02bd, B:55:0x02ee, B:56:0x02f2, B:58:0x0304, B:59:0x030a, B:60:0x033c, B:68:0x0357, B:69:0x0358, B:72:0x0370, B:73:0x0372, B:74:0x0378, B:77:0x039b, B:94:0x03c3, B:100:0x03ca, B:97:0x036d, B:99:0x03c9, B:101:0x033e, B:106:0x01f7, B:76:0x0379, B:63:0x0343, B:65:0x034d, B:66:0x0356), top: B:18:0x0184, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x033d A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C63367SiS r47) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63367SiS.A03(X.SiS):void");
    }

    public final Pair A05() {
        ArrayList arrayList;
        ArrayList arrayList2;
        C63364SiN c63364SiN = this.A0w;
        if (c63364SiN != null) {
            Map map = this.A0Z;
            Map map2 = c63364SiN.A0I;
            synchronized (map2) {
                Iterator A16 = AbstractC166997dE.A16(map);
                arrayList = null;
                while (A16.hasNext()) {
                    SubscribeTopic subscribeTopic = (SubscribeTopic) A16.next();
                    String str = subscribeTopic.A01;
                    if (!map2.containsKey(str)) {
                        map2.put(str, subscribeTopic);
                        if (arrayList == null) {
                            arrayList = AbstractC166987dD.A1E();
                        }
                        arrayList.add(subscribeTopic);
                    }
                }
                Iterator A15 = AbstractC166997dE.A15(map2);
                arrayList2 = null;
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    if (!AbstractC58319PtB.A1V(A1K, map)) {
                        if (arrayList2 == null) {
                            arrayList2 = AbstractC166987dD.A1E();
                        }
                        arrayList2.add((SubscribeTopic) A1K.getValue());
                        A15.remove();
                    }
                }
                AbstractC62803SRx.A01(AbstractC167007dF.A1P(map.size(), map2.size()));
            }
            if (arrayList == null && arrayList2 == null) {
                return null;
            }
            return new Pair(arrayList, arrayList2);
        }
        return null;
    }

    public final AbstractC64515THi A06(InterfaceC65545TmK interfaceC65545TmK, InterfaceC65498TlM interfaceC65498TlM, Integer num, String str, byte[] bArr, int i) {
        long j;
        long j2;
        int i2;
        SPL spl;
        int i3 = i;
        int A03 = AbstractC50522MSa.A03(num.intValue());
        AbstractC62803SRx.A00(AbstractC167007dF.A1Q(A03, 2));
        C63364SiN c63364SiN = this.A0w;
        if (c63364SiN != null) {
            if (!c63364SiN.A04()) {
                j = c63364SiN.A0V;
            } else {
                C62830STc c62830STc = C62830STc.A00;
                try {
                    int andIncrement = C63364SiN.A0e.getAndIncrement() & 65535;
                    Integer num2 = c63364SiN.A0Y;
                    if (num2 == C05F.A00 || num2 == C05F.A01) {
                        long j3 = 0;
                        if (c63364SiN.A0V > 0) {
                            j2 = SystemClock.elapsedRealtime() - c63364SiN.A0V;
                        } else {
                            j2 = 0;
                        }
                        long j4 = this.A0E.A00().A0K * 1000;
                        long j5 = j4 - j2;
                        if (j5 >= 0) {
                            if (j5 > j4) {
                                j3 = j4;
                            } else {
                                j3 = j5;
                            }
                        }
                        i2 = (int) (j3 / 1000);
                    } else {
                        i2 = 0;
                    }
                    int i4 = i2 + i;
                    if (i4 < Integer.MAX_VALUE) {
                        i3 = i4;
                    }
                    Integer num3 = C05F.A01;
                    if (num == num3) {
                        if (interfaceC65545TmK == null) {
                            spl = this.A0O.A02(c63364SiN, EnumC61172RgY.PUBACK, str, andIncrement, i3);
                        } else {
                            spl = this.A0O.A01(c63364SiN, interfaceC65545TmK, EnumC61172RgY.PUBACK, str, andIncrement, i3);
                        }
                    } else {
                        spl = new SPL(c63364SiN, EnumC61172RgY.PUBACK, str, andIncrement, SystemClock.elapsedRealtime());
                        if (spl.A07 != null) {
                            spl.A07.onSuccess(spl.A01);
                        }
                        if (spl.A06 != null) {
                            spl.A06.cancel(false);
                        }
                        this.A0C.A04(str, 0L, A03, andIncrement, spl.A01, c63364SiN.A0V);
                    }
                    synchronized (c63364SiN) {
                        if (c63364SiN.A04()) {
                            c63364SiN.A0J.execute(new TRP(c62830STc, c63364SiN, interfaceC65498TlM, num, str, bArr, andIncrement));
                        } else {
                            Integer num4 = C05F.A15;
                            throw new C42Y(num4, AbstractC62804SRy.A01(num4), null);
                        }
                    }
                    if (!"/mqtt_health_stats".equals(str) && num == num3) {
                        A09();
                    }
                    return new C60547R6k(spl);
                } catch (C42Y e) {
                    C0K8.A0I(this.A0X, "exception/publish", e);
                    A07(c63364SiN, RhR.A0J, C05F.A01);
                    throw e;
                }
            }
        } else {
            j = 0;
        }
        this.A0C.A05("not_connected", str, null, A03, 0, 0, j);
        return C60546R6j.A00;
    }

    public final Future A08(RhR rhR) {
        SZK szk = this.A0V;
        synchronized (szk) {
            SZK.A00(szk);
        }
        return A07(this.A0w, rhR, C05F.A0C);
    }

    public final void A09() {
        this.A0L.A00();
        if (!this.A0d) {
            this.A0J.A05();
        } else {
            this.A0L.A01();
        }
    }

    public final void A0A() {
        Q1k q1k = new Q1k(this, 12);
        this.A0k = q1k;
        C0DJ.A01(q1k, this.A04, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), this.A05);
        Q1k q1k2 = new Q1k(this, 13);
        this.A0j = q1k2;
        C0DJ.A02(q1k2, this.A04, new IntentFilter("com.facebook.rti.mqtt.ACTION_MQTT_CONFIG_CHANGED"), this.A05, null, false);
        C63006SaU c63006SaU = this.A0F;
        SBW sbw = this.A0s;
        synchronized (c63006SaU) {
            c63006SaU.A04.add(sbw);
        }
        this.A0Q.A00();
    }

    public final void A0B() {
        this.A0J.A03();
        this.A0L.A00();
        this.A0J.A04();
        C63006SaU c63006SaU = this.A0F;
        SBW sbw = this.A0s;
        synchronized (c63006SaU) {
            c63006SaU.A04.remove(sbw);
        }
        BroadcastReceiver broadcastReceiver = this.A0k;
        if (broadcastReceiver != null) {
            try {
                this.A04.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C0K8.A0I(this.A0X, "Failed to unregister broadcast receiver", e);
            }
            this.A0k = null;
        }
        BroadcastReceiver broadcastReceiver2 = this.A0j;
        if (broadcastReceiver2 != null) {
            try {
                this.A04.unregisterReceiver(broadcastReceiver2);
            } catch (IllegalArgumentException e2) {
                C0K8.A0I(this.A0X, "Failed to unregister broadcast receiver", e2);
            }
            this.A0j = null;
        }
        this.A0Q.A01();
        this.A0P.A01();
    }

    public final void A0C() {
        int Aew;
        boolean z = this.A0b.get();
        InterfaceC65369Tj1 interfaceC65369Tj1 = this.A0K;
        if (z) {
            Aew = 60;
        } else {
            Aew = interfaceC65369Tj1.Aew();
        }
        if (this.A0c.getAndSet(Aew) != Aew) {
            A09();
        }
    }

    public final void A0D(Integer num) {
        Integer num2;
        C63364SiN c63364SiN = this.A0w;
        List list = this.A0H.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("setMqttNetworkConnectionRetryInfo");
            }
        }
        if (C05F.A08.equals(num)) {
            num2 = C05F.A0C;
        } else {
            if (!this.A0M.EiB()) {
                A08(RhR.A07);
                return;
            }
            if (c63364SiN != null) {
                if (c63364SiN.A04()) {
                    return;
                } else {
                    num2 = C05F.A0N;
                }
            }
            A03(this);
        }
        A07(c63364SiN, RhR.A04, num2);
        A03(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0E(Integer num) {
        C62975SZv c62975SZv;
        C63364SiN c63364SiN = this.A0w;
        if (!this.A0M.EiB()) {
            A08(RhR.A07);
            return;
        }
        if (!this.A0d) {
            C63344Shz c63344Shz = this.A0J;
            synchronized (c63344Shz) {
                if (!c63344Shz.A03) {
                    c63344Shz.A05();
                    c62975SZv = c63344Shz;
                } else {
                    SystemClock.elapsedRealtime();
                    c62975SZv = c63344Shz;
                }
            }
        } else {
            C62975SZv c62975SZv2 = this.A0L;
            synchronized (c62975SZv2) {
                boolean z = c62975SZv2.A00;
                c62975SZv = c62975SZv2;
                if (!z) {
                    c62975SZv2.A01();
                    c62975SZv = c62975SZv2;
                }
            }
        }
        if (c63364SiN != null && c63364SiN.A0Y == C05F.A0C) {
            if (!((String) ((Pair) this.A0I.BKl()).first).equals(c63364SiN.A0Z)) {
                A08(RhR.A02);
            } else if (this.A03 <= this.A02) {
                if (!num.equals(C05F.A08)) {
                    return;
                }
                this.A0D.A0F = C05F.A0u;
                SZK szk = this.A0V;
                synchronized (szk) {
                    if (szk.A07 == null) {
                        C0K8.A0D("ConnectionRetryManager", "No force reconnect runnable set. Completing early from kickNow()");
                    } else {
                        Handler handler = szk.A0B;
                        if (handler != null && handler.getLooper().getThread() == Thread.currentThread()) {
                            szk.A07.run();
                        } else {
                            szk.A0D.submit(szk.A07);
                        }
                    }
                }
            }
        } else {
            C63364SiN c63364SiN2 = this.A0w;
            if (c63364SiN2 != null && c63364SiN2.A04()) {
                return;
            }
        }
        List list = this.A0H.A00;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("setMqttNetworkConnectionInfo");
            }
        }
        A0C();
        this.A0D.A0F = num;
        SZK szk2 = this.A0V;
        synchronized (szk2) {
            szk2.A00++;
            SZK.A00(szk2);
            szk2.A01();
        }
    }

    public final void A0F(String str) {
        String str2;
        C63364SiN c63364SiN = this.A0w;
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (AbstractC166987dD.A0L(elapsedRealtime - this.A0y) >= this.A0E.A00().A00) {
                this.A0y = elapsedRealtime;
                SWD.A02.A01 = str;
                C3Uj c3Uj = this.A07;
                this.A0F.A03();
                if (c3Uj.A00) {
                    if (this.A0b.get()) {
                        T1G.A00(EnumC61223Rij.ForegroundPing, (T1G) this.A0D.A05(C60551R6o.class));
                    } else {
                        T1G.A00(EnumC61223Rij.BackgroundPing, (T1G) this.A0D.A05(C60551R6o.class));
                    }
                    if (c63364SiN != null && c63364SiN.A0Y == C05F.A0C) {
                        long A0B = AbstractC58318PtA.A0B(c63364SiN.A0V);
                        C63363SiM c63363SiM = this.A0D;
                        try {
                            str2 = S13.A00(null, null, null, C63363SiM.A00(c63363SiM), (C60550R6n) c63363SiM.A05(C60550R6n.class), C63363SiM.A01(c63363SiM, A0B), null, null, false, true).toString();
                        } catch (JSONException unused) {
                            str2 = "";
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            try {
                                try {
                                    AbstractC64515THi A06 = A06(this.A0S, this.A0T, C05F.A01, "/mqtt_health_stats", str2.getBytes(ReactWebViewManager.HTML_ENCODING), this.A0E.A00().A0L);
                                    if (!(A06 instanceof C60546R6j)) {
                                        A06.A01();
                                        return;
                                    }
                                    return;
                                } catch (UnsupportedEncodingException unused2) {
                                    throw AbstractC166987dD.A18("UTF-8 not supported");
                                }
                            } catch (C42Y unused3) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                if (c63364SiN != null) {
                    Integer num = c63364SiN.A0Y;
                    Integer num2 = C05F.A0C;
                    if (num == num2) {
                        if (this.A0S != null) {
                            this.A0O.A01(c63364SiN, this.A0S, EnumC61172RgY.PINGRESP, "callPing", -1, this.A0E.A00().A0L);
                        } else {
                            this.A0O.A02(c63364SiN, EnumC61172RgY.PINGRESP, "callPing", -1, this.A0E.A00().A0L);
                        }
                        synchronized (c63364SiN) {
                            if (c63364SiN.A0Y == num2) {
                                c63364SiN.A0J.execute(new TL3(c63364SiN));
                            } else {
                                Integer num3 = C05F.A15;
                                throw new C42Y(num3, AbstractC62804SRy.A01(num3), null);
                            }
                        }
                    }
                }
            }
        } catch (C42Y e) {
            C0K8.A0G(this.A0X, "exception/send_keepalive", e);
            A07(c63364SiN, RhR.A0J, C05F.A01);
        }
    }

    public C63367SiS(boolean z) {
        C62465SCs c62465SCs = C62465SCs.A01;
        if (c62465SCs == null) {
            c62465SCs = new C62465SCs();
            C62465SCs.A01 = c62465SCs;
        }
        this.A0H = c62465SCs;
        this.A0m = AbstractC58318PtA.A0b();
        this.A0s = new SBW(this);
        this.A0r = new AtomicLong();
        this.A0q = new RunnableC64585TKw(this);
        this.A0n = new RunnableC64586TKx(this);
        this.A0o = new RunnableC64587TKy(this);
        this.A0p = new RunnableC64588TKz(this);
        this.A0g = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r3.A01.equals(r4.A01) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
    
        if (r0.isConnected() == false) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A00(android.content.Intent r6, X.C63367SiS r7) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63367SiS.A00(android.content.Intent, X.SiS):void");
    }

    public C63367SiS() {
        C62465SCs c62465SCs = C62465SCs.A01;
        if (c62465SCs == null) {
            c62465SCs = new C62465SCs();
            C62465SCs.A01 = c62465SCs;
        }
        this.A0H = c62465SCs;
        this.A0m = AbstractC58318PtA.A0b();
        this.A0s = new SBW(this);
        this.A0r = new AtomicLong();
        this.A0q = new RunnableC64585TKw(this);
        this.A0n = new RunnableC64586TKx(this);
        this.A0o = new RunnableC64587TKy(this);
        this.A0p = new RunnableC64588TKz(this);
    }
}
