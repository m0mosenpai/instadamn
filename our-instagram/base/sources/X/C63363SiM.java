package X;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SiM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63363SiM {
    public final C62701SMp A00;
    public final C62465SCs A01;
    public final ConcurrentMap A02 = AbstractC58318PtA.A14();
    public final Context A03;
    public final C74103Uo A04;
    public final RealtimeSinceBootClock A05;
    public final C4N2 A06;
    public final InterfaceC65366Tiy A07;
    public final C62670SLh A08;
    public final C63006SaU A09;
    public final SZ6 A0A;
    public final String A0B;
    public final HashMap A0C;
    public final HashMap A0D;
    public final boolean A0E;
    public volatile Integer A0F;
    public volatile String A0G;
    public volatile String A0H;
    public volatile String A0I;
    public volatile String A0J;
    public volatile String A0K;

    public static synchronized AtomicLong A04(EnumC61084Rey enumC61084Rey, C63363SiM c63363SiM) {
        AtomicLong atomicLong;
        synchronized (c63363SiM) {
            HashMap hashMap = c63363SiM.A0C;
            if (!hashMap.containsKey(enumC61084Rey)) {
                hashMap.put(enumC61084Rey, new AtomicLong());
            }
            atomicLong = (AtomicLong) hashMap.get(enumC61084Rey);
        }
        return atomicLong;
    }

    public final synchronized InterfaceC65232TgO A05(Class cls) {
        String name;
        HashMap hashMap;
        Object obj;
        try {
            name = cls.getName();
            hashMap = this.A0D;
            if (!hashMap.containsKey(name)) {
                if (cls == C60552R6p.class) {
                    Context context = this.A03;
                    String str = this.A0B;
                    obj = new T1H(context, this.A05, this.A06, str, "du", this.A0E);
                } else if (cls == C60554R6r.class) {
                    Context context2 = this.A03;
                    String str2 = this.A0B;
                    obj = new T1H(context2, this.A05, this.A06, str2, "ts", this.A0E);
                } else if (cls == C60553R6q.class) {
                    Context context3 = this.A03;
                    String str3 = this.A0B;
                    obj = new T1H(context3, this.A05, this.A06, str3, "tp", this.A0E);
                } else {
                    obj = (InterfaceC65232TgO) cls.newInstance();
                }
                hashMap.put(name, obj);
            }
        } catch (Exception e) {
            throw AbstractC58318PtA.A0e("Incorrect stat category used:", e);
        }
        return (InterfaceC65232TgO) hashMap.get(name);
    }

    public static C60549R6m A00(C63363SiM c63363SiM) {
        String str;
        String networkCountryIso;
        String str2;
        NetworkInfo A02;
        String str3;
        String upperCase;
        String str4;
        C60549R6m c60549R6m = (C60549R6m) c63363SiM.A05(C60549R6m.class);
        c60549R6m.A03(EnumC61224Rik.ServiceName, c63363SiM.A0B);
        c60549R6m.A03(EnumC61224Rik.ClientCoreName, c63363SiM.A0G);
        c60549R6m.A03(EnumC61224Rik.NotificationStoreName, c63363SiM.A0I);
        C74103Uo c74103Uo = c63363SiM.A04;
        Context context = c63363SiM.A03;
        C4N8 A0V = AbstractC58319PtB.A0V(context, c74103Uo, "analytics");
        c60549R6m.A03(EnumC61224Rik.YearClass, String.valueOf(A0V.getInt("year_class", 0)));
        c60549R6m.A03(EnumC61224Rik.MqttGKs, A03(AbstractC58319PtB.A0V(context, c74103Uo, "gk").getAll()));
        c60549R6m.A03(EnumC61224Rik.MqttFlags, A03(AbstractC58319PtB.A0V(context, c74103Uo, "flags").getAll()));
        InterfaceC65366Tiy interfaceC65366Tiy = c63363SiM.A07;
        if (interfaceC65366Tiy != null) {
            EnumC61224Rik enumC61224Rik = EnumC61224Rik.AppState;
            if (AbstractC166987dD.A1a(interfaceC65366Tiy.get())) {
                str4 = "fg";
            } else {
                str4 = "bg";
            }
            c60549R6m.A03(enumC61224Rik, str4);
        }
        EnumC61224Rik enumC61224Rik2 = EnumC61224Rik.ScreenState;
        if (c63363SiM.A0A.A00()) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        c60549R6m.A03(enumC61224Rik2, str);
        AbstractC64515THi A00 = c63363SiM.A08.A00(TelephonyManager.class, "phone");
        EnumC61224Rik enumC61224Rik3 = EnumC61224Rik.Country;
        if (A00 instanceof C60546R6j) {
            networkCountryIso = "";
        } else {
            networkCountryIso = ((TelephonyManager) A00.A01()).getNetworkCountryIso();
            if (networkCountryIso == null) {
                str2 = null;
                c60549R6m.A03(enumC61224Rik3, str2);
                EnumC61224Rik enumC61224Rik4 = EnumC61224Rik.NetworkType;
                C63006SaU c63006SaU = c63363SiM.A09;
                c60549R6m.A03(enumC61224Rik4, S11.A00(c63006SaU.A03().A02).toUpperCase());
                EnumC61224Rik enumC61224Rik5 = EnumC61224Rik.NetworkSubtype;
                A02 = c63006SaU.A02();
                if (A02 == null && !TextUtils.isEmpty(A02.getSubtypeName())) {
                    str3 = A02.getSubtypeName();
                    if (str3 == null) {
                        upperCase = null;
                        c60549R6m.A03(enumC61224Rik5, upperCase);
                        c60549R6m.A03(EnumC61224Rik.IsEmployee, Boolean.valueOf(A0V.getBoolean("is_employee", false)));
                        c60549R6m.A03(EnumC61224Rik.ValidCompatibleApps, c63363SiM.A0K);
                        c60549R6m.A03(EnumC61224Rik.EnabledCompatibleApps, c63363SiM.A0H);
                        c60549R6m.A03(EnumC61224Rik.RegisteredApps, c63363SiM.A0J);
                        return c60549R6m;
                    }
                } else {
                    str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                }
                upperCase = str3.toUpperCase();
                c60549R6m.A03(enumC61224Rik5, upperCase);
                c60549R6m.A03(EnumC61224Rik.IsEmployee, Boolean.valueOf(A0V.getBoolean("is_employee", false)));
                c60549R6m.A03(EnumC61224Rik.ValidCompatibleApps, c63363SiM.A0K);
                c60549R6m.A03(EnumC61224Rik.EnabledCompatibleApps, c63363SiM.A0H);
                c60549R6m.A03(EnumC61224Rik.RegisteredApps, c63363SiM.A0J);
                return c60549R6m;
            }
        }
        str2 = networkCountryIso.toUpperCase();
        c60549R6m.A03(enumC61224Rik3, str2);
        EnumC61224Rik enumC61224Rik42 = EnumC61224Rik.NetworkType;
        C63006SaU c63006SaU2 = c63363SiM.A09;
        c60549R6m.A03(enumC61224Rik42, S11.A00(c63006SaU2.A03().A02).toUpperCase());
        EnumC61224Rik enumC61224Rik52 = EnumC61224Rik.NetworkSubtype;
        A02 = c63006SaU2.A02();
        if (A02 == null) {
        }
        str3 = NetInfoModule.CONNECTION_TYPE_NONE;
        upperCase = str3.toUpperCase();
        c60549R6m.A03(enumC61224Rik52, upperCase);
        c60549R6m.A03(EnumC61224Rik.IsEmployee, Boolean.valueOf(A0V.getBoolean("is_employee", false)));
        c60549R6m.A03(EnumC61224Rik.ValidCompatibleApps, c63363SiM.A0K);
        c60549R6m.A03(EnumC61224Rik.EnabledCompatibleApps, c63363SiM.A0H);
        c60549R6m.A03(EnumC61224Rik.RegisteredApps, c63363SiM.A0J);
        return c60549R6m;
    }

    public static C60551R6o A01(C63363SiM c63363SiM, long j) {
        C60551R6o c60551R6o = (C60551R6o) c63363SiM.A05(C60551R6o.class);
        ((AtomicLong) c60551R6o.A01(EnumC61223Rij.MqttDurationMs)).set(j);
        AtomicLong atomicLong = (AtomicLong) c60551R6o.A01(EnumC61223Rij.NetworkDurationMs);
        C63006SaU c63006SaU = c63363SiM.A09;
        AtomicLong atomicLong2 = c63006SaU.A06;
        long j2 = atomicLong2.get();
        long j3 = 0;
        if (j2 != 0) {
            j3 = AbstractC58318PtA.A0B(j2);
        }
        atomicLong.set(j3);
        AtomicLong atomicLong3 = (AtomicLong) c60551R6o.A01(EnumC61223Rij.NetworkTotalDurationMs);
        long j4 = c63006SaU.A05.get();
        long j5 = atomicLong2.get();
        long j6 = 0;
        if (j5 != 0) {
            j6 = AbstractC58318PtA.A0B(j5);
        }
        atomicLong3.set(j4 + j6);
        ((AtomicLong) c60551R6o.A01(EnumC61223Rij.ServiceDurationMs)).set(SystemClock.elapsedRealtime() - A04(EnumC61084Rey.A01, c63363SiM).get());
        return c60551R6o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r11 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            r12 = this;
            X.Tiy r0 = r12.A07
            if (r0 != 0) goto Ld2
            r11 = 0
        L5:
            X.SWD r4 = X.SWD.A02
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r4.A00
            long r5 = r5 - r0
            r1 = 17000(0x4268, double:8.399E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            boolean r2 = X.AbstractC167007dF.A1O(r0)
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L24
            if (r16 != 0) goto Lc2
            java.lang.String r0 = "PINGREQ"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto Lca
        L24:
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            if (r11 == 0) goto Lbb
            r1.append(r13)
            java.lang.String r0 = "_FG"
        L2f:
            java.lang.String r6 = X.AbstractC166997dE.A0x(r0, r1)
            java.lang.String r9 = "fg"
            java.lang.String r8 = "bg"
            java.lang.String r7 = "tc"
            r5 = 1
            if (r2 == 0) goto L92
            java.lang.String r10 = "rw"
            if (r11 == 0) goto L83
            java.lang.Class<X.R6r> r0 = X.C60554R6r.class
            X.TgO r3 = r12.A05(r0)
            X.T1H r3 = (X.T1H) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r9, r10, r15}
            r0 = 1
        L4f:
            r3.A03(r2, r0)
            if (r11 == 0) goto Lb9
        L54:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L66
            java.lang.String r0 = "/"
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L81
            java.lang.String r6 = r14.substring(r5)
        L66:
            java.lang.Class<X.R6q> r0 = X.C60553R6q.class
            X.TgO r3 = r12.A05(r0)
            X.T1H r3 = (X.T1H) r3
            java.lang.String[] r2 = new java.lang.String[]{r6, r9}
            r0 = 1
            r3.A03(r2, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A00 = r0
            java.lang.System.currentTimeMillis()
            return
        L81:
            r6 = r14
            goto L66
        L83:
            r0 = 1
            java.lang.Class<X.R6r> r2 = X.C60554R6r.class
            X.TgO r3 = r12.A05(r2)
            X.T1H r3 = (X.T1H) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r8, r10, r15}
            goto L4f
        L92:
            java.lang.String r10 = "nw"
            if (r11 == 0) goto La8
            java.lang.Class<X.R6r> r0 = X.C60554R6r.class
            X.TgO r3 = r12.A05(r0)
            X.T1H r3 = (X.T1H) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r9, r10, r15}
            r0 = 1
            r3.A03(r2, r0)
            goto L54
        La8:
            r1 = 1
            java.lang.Class<X.R6r> r0 = X.C60554R6r.class
            X.TgO r3 = r12.A05(r0)
            X.T1H r3 = (X.T1H) r3
            java.lang.String[] r0 = new java.lang.String[]{r7, r8, r10, r15}
            r3.A03(r0, r1)
        Lb9:
            r9 = r8
            goto L54
        Lbb:
            r1.append(r13)
            java.lang.String r0 = "_BG"
            goto L2f
        Lc2:
            java.lang.String r0 = "PINGRESP"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L24
        Lca:
            java.lang.String r0 = "_"
            java.lang.String r13 = X.AnonymousClass001.A0g(r13, r0, r1)
            goto L24
        Ld2:
            java.lang.Object r0 = r0.get()
            boolean r11 = X.AbstractC166987dD.A1a(r0)
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63363SiM.A06(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public C63363SiM(Context context, C74103Uo c74103Uo, RealtimeSinceBootClock realtimeSinceBootClock, C4N2 c4n2, InterfaceC65366Tiy interfaceC65366Tiy, C62670SLh c62670SLh, C63006SaU c63006SaU, SZ6 sz6, String str, boolean z) {
        C62465SCs c62465SCs = C62465SCs.A01;
        if (c62465SCs == null) {
            c62465SCs = new C62465SCs();
            C62465SCs.A01 = c62465SCs;
        }
        this.A01 = c62465SCs;
        this.A0G = "";
        this.A0I = "";
        this.A0K = "";
        this.A0H = "";
        this.A0J = "";
        this.A03 = context;
        this.A08 = c62670SLh;
        this.A0B = str;
        this.A09 = c63006SaU;
        this.A0A = sz6;
        this.A00 = new C62701SMp(context, realtimeSinceBootClock);
        this.A06 = c4n2;
        this.A05 = realtimeSinceBootClock;
        this.A07 = interfaceC65366Tiy;
        this.A0C = AbstractC166987dD.A1G();
        this.A0D = AbstractC166987dD.A1G();
        this.A0E = z;
        this.A04 = c74103Uo;
    }

    public static String A02(List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            Map map = ((C74123Uq) C3UY.A00).A06;
            if (map.containsKey(next)) {
                listIterator.set(String.valueOf(map.get(next)));
            } else {
                C0K8.A0P("MqttHealthStatsHelper", "appPkgName %s not found in encoding map", next);
            }
        }
        return TextUtils.join(";", list);
    }

    public static String A03(Map map) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        Iterator A15 = AbstractC166997dE.A15(map);
        boolean z = true;
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (z) {
                z = false;
            } else {
                A1C.append(";");
            }
            A1C.append(AbstractC31172DnG.A17(A1K));
            A1C.append("|");
            A1C.append(A1K.getValue());
        }
        return A1C.toString();
    }
}
