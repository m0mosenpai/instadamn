package X;

import android.content.Context;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2FN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FN {
    public final AbstractC12990ll A00;
    public final AtomicReference A01;

    public C2FN(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
        this.A01 = new AtomicReference();
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.2GE] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.2FU, X.0cm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [X.2GE] */
    public final void A00() {
        AtomicReference atomicReference;
        C40701ud A00;
        synchronized (this) {
            atomicReference = this.A01;
            if (atomicReference.get() == null || !C14360o3.A0K(atomicReference.get(), C2FP.A05().A00)) {
                ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 570, 3, false, true);
                synchronized (C2FP.class) {
                    if (C2FP.A05().A01) {
                        TLD tld = new TLD(C2FP.A05().A00);
                        C2FP.A05().A00 = null;
                        C2FP.A05().A01 = false;
                        executorC14040nU.execute(tld);
                    }
                }
                atomicReference.set(null);
            }
        }
        try {
            if (atomicReference.get() == null) {
                synchronized (this) {
                    try {
                        if (atomicReference.get() == null) {
                            final AbstractC12990ll abstractC12990ll = this.A00;
                            boolean z = abstractC12990ll instanceof UserSession;
                            if (z) {
                                A00 = AbstractC40691uc.A01((UserSession) abstractC12990ll);
                            } else {
                                C14360o3.A0C(abstractC12990ll, "null cannot be cast to non-null type com.instagram.common.session.LoggedOutSession");
                                A00 = AbstractC40691uc.A00((C07270a1) abstractC12990ll);
                            }
                            FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor = new FBPayIGGraphQLQueryExecutor(A00);
                            C2FS c2fs = new C2FS(fBPayIGGraphQLQueryExecutor, fBPayIGGraphQLQueryExecutor, AbstractC12290kX.A00.getMainExecutor(), new ExecutorC14040nU(C14120nc.A00(), 568, 3, false, true));
                            final ?? obj = new Object();
                            obj.A00 = c2fs;
                            obj.A01 = false;
                            Context context = AbstractC12290kX.A00;
                            context.getClass();
                            Context applicationContext = context.getApplicationContext();
                            InterfaceC08830cm interfaceC08830cm = null;
                            InterfaceC08830cm interfaceC08830cm2 = null;
                            InterfaceC08830cm interfaceC08830cm3 = null;
                            InterfaceC08830cm interfaceC08830cm4 = null;
                            InterfaceC08830cm interfaceC08830cm5 = null;
                            InterfaceC08830cm interfaceC08830cm6 = null;
                            InterfaceC08830cm interfaceC08830cm7 = null;
                            InterfaceC08830cm interfaceC08830cm8 = null;
                            InterfaceC08830cm interfaceC08830cm9 = null;
                            final Context context2 = AbstractC12290kX.A00;
                            C14360o3.A07(context2);
                            final C2FV c2fv = C2FV.A00;
                            final InterfaceC08830cm interfaceC08830cm10 = new InterfaceC08830cm() { // from class: X.2FW
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new SNK(InterfaceC08830cm.this);
                                }
                            };
                            final C2FX c2fx = C2FX.A00;
                            c2fx.getClass();
                            final InterfaceC08830cm interfaceC08830cm11 = new InterfaceC08830cm() { // from class: X.2FY
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new SVW((Map) InterfaceC08830cm.this.get());
                                }
                            };
                            InterfaceC08830cm A002 = C2FU.A00(new InterfaceC08830cm(context2, abstractC12990ll, obj, interfaceC08830cm10, interfaceC08830cm11) { // from class: X.2FZ
                                public final Context A00;
                                public final AbstractC12990ll A01;
                                public final InterfaceC08830cm A02;
                                public final InterfaceC08830cm A03;
                                public final InterfaceC08830cm A04;

                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    InterfaceC08830cm interfaceC08830cm12 = this.A03;
                                    C58443PvM c58443PvM = (C58443PvM) interfaceC08830cm12.get();
                                    AbstractC12990ll abstractC12990ll2 = this.A01;
                                    C62962SZf c62962SZf = new C62962SZf(C2FP.A04(), c58443PvM, new C62566SGr(abstractC12990ll2));
                                    T2P t2p = new T2P(abstractC12990ll2);
                                    C62567SGs c62567SGs = new C62567SGs(t2p, abstractC12990ll2);
                                    interfaceC08830cm12.get();
                                    SDZ sdz = new SDZ(c62567SGs);
                                    Context context3 = this.A00;
                                    C63337Shp c63337Shp = new C63337Shp(sdz, t2p, new SCP(context3));
                                    SNK snk = (SNK) this.A04.get();
                                    return new SQ1(context3, c63337Shp, c63337Shp, t2p, (SVW) this.A02.get(), c62962SZf, snk, C2FP.A04(), (C58443PvM) interfaceC08830cm12.get(), c62567SGs);
                                }

                                {
                                    this.A00 = context2;
                                    this.A03 = obj;
                                    this.A04 = interfaceC08830cm10;
                                    this.A01 = abstractC12990ll;
                                    this.A02 = interfaceC08830cm11;
                                }
                            });
                            final C2Fb c2Fb = C2Fb.A1o;
                            InterfaceC08830cm A003 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2Ft
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new C60626REl(AbstractC12990ll.this, c2Fb);
                                }
                            });
                            final Context context3 = AbstractC12290kX.A00;
                            C14360o3.A07(context3);
                            InterfaceC08830cm A004 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2Fv
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new Object();
                                }
                            });
                            final Context context4 = AbstractC12290kX.A00;
                            C14360o3.A07(context4);
                            InterfaceC08830cm A005 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2Fw
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new C69679VtP(context4);
                                }
                            });
                            InterfaceC08830cm A006 = C2FU.A00(C47482Fx.A00);
                            final Context context5 = AbstractC12290kX.A00;
                            C14360o3.A07(context5);
                            InterfaceC08830cm A007 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2Fy
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new SYL(context5, abstractC12990ll);
                                }
                            });
                            C47502Fz c47502Fz = C47502Fz.A00;
                            C2G0 c2g0 = C2G0.A00;
                            final Context context6 = AbstractC12290kX.A00;
                            C14360o3.A07(context6);
                            InterfaceC08830cm A008 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2G1
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new XlH(context6);
                                }
                            });
                            final C2G2 c2g2 = new C2G2(C12L.A00);
                            InterfaceC08830cm interfaceC08830cm12 = new InterfaceC08830cm() { // from class: X.2G3
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    return new SVZ(C2G2.this);
                                }
                            };
                            InterfaceC08830cm A009 = C2FU.A00(C2G4.A00);
                            final Context context7 = AbstractC12290kX.A00;
                            C14360o3.A07(context7);
                            InterfaceC08830cm interfaceC08830cm13 = new InterfaceC08830cm() { // from class: X.2G5
                                @Override // X.InterfaceC08830cm
                                public final /* bridge */ /* synthetic */ Object get() {
                                    throw new C141786av(AnonymousClass001.A0R("An operation is not implemented: ", "Not yet implemented"));
                                }
                            };
                            C2G6 c2g6 = C2G6.A00;
                            if (z) {
                                final Context context8 = AbstractC12290kX.A00;
                                C14360o3.A07(context8);
                                final UserSession userSession = (UserSession) abstractC12990ll;
                                C14360o3.A0B(userSession, 2);
                                interfaceC08830cm6 = C2FU.A00(new InterfaceC08830cm(context8, userSession, obj) { // from class: X.2G7
                                    public final Context A00;
                                    public final UserSession A01;
                                    public final InterfaceC08830cm A02;

                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        Context context9 = this.A00;
                                        TVW tvw = new TVW();
                                        UserSession userSession2 = this.A01;
                                        return new C63307ShD(context9, userSession2, new C64822TVm(context9, userSession2, tvw), this.A02);
                                    }

                                    {
                                        this.A00 = context8;
                                        this.A02 = obj;
                                        this.A01 = userSession;
                                    }
                                });
                                final Context context9 = AbstractC12290kX.A00;
                                C14360o3.A07(context9);
                                interfaceC08830cm7 = C2FU.A00(new InterfaceC08830cm(userSession, context9) { // from class: X.2G8
                                    public final Context A00;
                                    public final UserSession A01;

                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        UserSession userSession2 = this.A01;
                                        Wan wan = new Wan(AbstractC12220kQ.A00(new C19270xB("bsc"), C12180kM.A05, userSession2));
                                        C006802i c006802i = C006802i.A0p;
                                        C14360o3.A07(c006802i);
                                        return new WFY(c006802i, wan, new C71676WyU(this.A00, userSession2, C64830TVu.A00), YJG.A00, C71677WyV.A00, new C71675WyT(userSession2), new C71673WyR(), new C71674WyS(userSession2));
                                    }

                                    {
                                        this.A01 = userSession;
                                        this.A00 = context9;
                                    }
                                });
                                final Context context10 = AbstractC12290kX.A00;
                                C14360o3.A07(context10);
                                interfaceC08830cm2 = C2FU.A00(new InterfaceC08830cm(context10, userSession) { // from class: X.2G9
                                    public final Context A00;
                                    public final UserSession A01;

                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        UserSession userSession2 = this.A01;
                                        C12210kP c12210kP = new C12210kP(userSession2);
                                        c12210kP.A01 = "payflows";
                                        C18920wW A0010 = c12210kP.A00();
                                        C006802i c006802i = C006802i.A0p;
                                        C1QT A0011 = C1QS.A00(userSession2);
                                        Context context11 = this.A00;
                                        C71672WyQ c71672WyQ = new C71672WyQ();
                                        YJA yja = new YJA();
                                        C14360o3.A0A(c006802i);
                                        return new SPR(context11, new Wap(A0010, c006802i), new C69548VrC(A0011), new Wao(A0010), userSession2.userId, c71672WyQ, yja, C2FU.A00(new TVP()));
                                    }

                                    {
                                        this.A00 = context10;
                                        this.A01 = userSession;
                                    }
                                });
                                interfaceC08830cm4 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2GA
                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        return new SNQ(UserSession.this);
                                    }
                                });
                                final Context context11 = AbstractC12290kX.A00;
                                C12210kP c12210kP = new C12210kP(userSession);
                                c12210kP.A01 = "payflows";
                                final C2GB c2gb = new C2GB(c12210kP.A00());
                                final C2GC c2gc = new C2GC(c2gb) { // from class: X.2GD
                                    public final C2GB A00;

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0020. Please report as an issue. */
                                    @Override // X.C2GC
                                    public final void Chz(String str, Map map) {
                                        Map unmodifiableMap;
                                        String str2;
                                        C25531Mh c25531Mh;
                                        C14360o3.A0B(str, 0);
                                        if (map != null) {
                                            AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
                                            C14360o3.A07(awakeTimeSinceBootClock);
                                            C2GB c2gb2 = this.A00;
                                            InterfaceC02550Ad interfaceC02550Ad = c2gb2.A00;
                                            String A06 = AbstractC58442PvL.A06(map);
                                            String A05 = AbstractC58442PvL.A05(map);
                                            String str3 = "get_encryption_key";
                                            switch (str.hashCode()) {
                                                case -1535674460:
                                                    if (str.equals("fbpay_auth_ticket_query_fail")) {
                                                        HashMap hashMap = new HashMap(map);
                                                        hashMap.put("flow_step", "auth_ticket_query");
                                                        unmodifiableMap = Collections.unmodifiableMap(hashMap);
                                                        C14360o3.A07(unmodifiableMap);
                                                        str2 = "payflows_fail";
                                                        c2gb2.Chz(str2, unmodifiableMap);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case -66680387:
                                                    if (str.equals("fbpay_auth_ticket_query_success")) {
                                                        HashMap hashMap2 = new HashMap(map);
                                                        hashMap2.put("flow_step", "auth_ticket_query");
                                                        unmodifiableMap = Collections.unmodifiableMap(hashMap2);
                                                        C14360o3.A07(unmodifiableMap);
                                                        str2 = "payflows_success";
                                                        c2gb2.Chz(str2, unmodifiableMap);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case 434863887:
                                                    if (str.equals("client_load_paysec_fail")) {
                                                        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
                                                        c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "client_load_paysec_fail"), 86);
                                                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                                            c25531Mh.A0u(A06);
                                                            c25531Mh.A0M(C2O5.valueOf(A05), "product_type");
                                                            c25531Mh.A0M(EnumC31203Dnm.ANDROID, "platform");
                                                            c25531Mh.A0Q("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
                                                            C0Zx c0Zx = new C0Zx() { // from class: X.9We
                                                            };
                                                            c0Zx.A06("sec_type", "get_encryption_key");
                                                            c25531Mh.A0N(c0Zx, "event_payload");
                                                            c25531Mh.A0R("error_message", String.valueOf(map.get("error_message")));
                                                            c25531Mh.A0R(TraceFieldType.ErrorCode, String.valueOf(map.get(TraceFieldType.ErrorCode)));
                                                            c25531Mh.A0R("error_stacktrace", String.valueOf(map.get("error_stacktrace")));
                                                            c25531Mh.Cht();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case 434965761:
                                                    if (str.equals("client_load_paysec_init")) {
                                                        C18920wW c18920wW2 = (C18920wW) interfaceC02550Ad;
                                                        c25531Mh = new C25531Mh(c18920wW2.A00(c18920wW2.A00, "client_load_paysec_init"), 87);
                                                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                                            c25531Mh.A0u(A06);
                                                            c25531Mh.A0M(C2O5.valueOf(A05), "product_type");
                                                            c25531Mh.A0M(EnumC31203Dnm.ANDROID, "platform");
                                                            c25531Mh.A0Q("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
                                                            C0Zx c0Zx2 = new C0Zx() { // from class: X.9We
                                                            };
                                                            c0Zx2.A06("sec_type", "get_encryption_key");
                                                            c25531Mh.A0N(c0Zx2, "event_payload");
                                                            c25531Mh.Cht();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case 628213362:
                                                    if (str.equals("client_load_paysec_success")) {
                                                        C18920wW c18920wW3 = (C18920wW) interfaceC02550Ad;
                                                        c25531Mh = new C25531Mh(c18920wW3.A00(c18920wW3.A00, "client_load_paysec_success"), 88);
                                                        String str4 = null;
                                                        Object obj2 = map.get("sec_type");
                                                        if (obj2 != null && (obj2 instanceof String)) {
                                                            str4 = (String) obj2;
                                                        }
                                                        HashMap hashMap3 = new HashMap();
                                                        if (str4 != null) {
                                                            for (Map.Entry entry : map.entrySet()) {
                                                                if (entry.getValue() instanceof String) {
                                                                    Object key = entry.getKey();
                                                                    Object value = entry.getValue();
                                                                    C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                                                                    hashMap3.put(key, value);
                                                                }
                                                            }
                                                            str3 = str4;
                                                        }
                                                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                                            C2O5 c2o5 = C2O5.A0K;
                                                            try {
                                                                c2o5 = C2O5.valueOf(A05);
                                                            } catch (Exception unused) {
                                                            }
                                                            c25531Mh.A0u(A06);
                                                            c25531Mh.A0M(c2o5, "product_type");
                                                            c25531Mh.A0M(EnumC31203Dnm.ANDROID, "platform");
                                                            c25531Mh.A0Q("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
                                                            C0Zx c0Zx3 = new C0Zx() { // from class: X.9We
                                                            };
                                                            c0Zx3.A06("sec_type", str3);
                                                            c25531Mh.A0N(c0Zx3, "event_payload");
                                                            if (hashMap3.size() > 0) {
                                                                c25531Mh.A0w(hashMap3);
                                                            }
                                                            c25531Mh.Cht();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                default:
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                            }
                                        }
                                    }

                                    {
                                        this.A00 = c2gb;
                                    }
                                };
                                final ?? r2 = new C2GC(c2gc) { // from class: X.2GE
                                    public final C2GC A00;

                                    @Override // X.C2GC
                                    public final void Chz(String str, Map map) {
                                        this.A00.Chz(str, map);
                                    }

                                    {
                                        this.A00 = c2gc;
                                    }
                                };
                                interfaceC08830cm8 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2GF
                                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0047, code lost:
                                    
                                        if (X.C18U.A06(X.C06090Tz.A05, r4, 36311981392659282L) != false) goto L6;
                                     */
                                    @Override // X.InterfaceC08830cm
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final /* bridge */ /* synthetic */ java.lang.Object get() {
                                        /*
                                            r10 = this;
                                            com.instagram.common.session.UserSession r4 = r2
                                            java.lang.String r6 = r4.userId
                                            android.content.Context r5 = r1
                                            X.1AU r1 = X.C1AT.A01(r4)
                                            X.1AV r0 = X.C1AV.A1O
                                            X.0xq r0 = r1.A03(r0)
                                            X.0xs r3 = new X.0xs
                                            r3.<init>(r0)
                                            X.0cm r2 = r4
                                            java.lang.Object r1 = r2.get()
                                            X.PvM r1 = (X.C58443PvM) r1
                                            X.SCT r0 = new X.SCT
                                            r0.<init>(r2)
                                            X.Si2 r6 = X.C63346Si2.A00(r5, r3, r1, r0, r6)
                                            java.lang.String r0 = r4.userId
                                            X.SEy r8 = new X.SEy
                                            r8.<init>(r0, r2)
                                            java.lang.Object r7 = r2.get()
                                            X.PvM r7 = (X.C58443PvM) r7
                                            X.2GE r5 = r3
                                            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
                                            if (r0 != 0) goto L49
                                            X.0Tz r2 = X.C06090Tz.A05
                                            r0 = 36311981392659282(0x81018e00000352, double:3.027181477106081E-306)
                                            boolean r0 = X.C18U.A06(r2, r4, r0)
                                            r9 = 0
                                            if (r0 == 0) goto L4a
                                        L49:
                                            r9 = 1
                                        L4a:
                                            X.SeZ r4 = new X.SeZ
                                            r4.<init>(r5, r6, r7, r8, r9)
                                            return r4
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C2GF.get():java.lang.Object");
                                    }
                                });
                                final Context context12 = AbstractC12290kX.A00;
                                C14360o3.A07(context12);
                                interfaceC08830cm = C2FU.A00(new InterfaceC08830cm() { // from class: X.2GG
                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        return new C62520SEw(context12, userSession);
                                    }
                                });
                                interfaceC08830cm5 = C2FU.A00(new InterfaceC08830cm() { // from class: X.2GH
                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        return new C70153WDa(UserSession.this);
                                    }
                                });
                                interfaceC08830cm9 = new InterfaceC08830cm() { // from class: X.2GI
                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        return new SharedPreferencesC19650xs(C1AT.A01(UserSession.this).A03(C1AV.A1P));
                                    }
                                };
                                final Context context13 = AbstractC12290kX.A00;
                                C14360o3.A07(context13);
                                interfaceC08830cm3 = new InterfaceC08830cm() { // from class: X.2GJ
                                    @Override // X.InterfaceC08830cm
                                    public final /* bridge */ /* synthetic */ Object get() {
                                        return new C62936SYe(context13, userSession);
                                    }
                                };
                            } else if (abstractC12990ll instanceof C07270a1) {
                                Context context14 = AbstractC12290kX.A00;
                                C07270a1 c07270a1 = (C07270a1) abstractC12990ll;
                                C14360o3.A0B(c07270a1, 0);
                                C12210kP c12210kP2 = new C12210kP(c07270a1);
                                c12210kP2.A01 = "payflows";
                                final C2GB c2gb2 = new C2GB(c12210kP2.A00());
                                final C2GC c2gc2 = new C2GC(c2gb2) { // from class: X.2GD
                                    public final C2GB A00;

                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0020. Please report as an issue. */
                                    @Override // X.C2GC
                                    public final void Chz(String str, Map map) {
                                        Map unmodifiableMap;
                                        String str2;
                                        C25531Mh c25531Mh;
                                        C14360o3.A0B(str, 0);
                                        if (map != null) {
                                            AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
                                            C14360o3.A07(awakeTimeSinceBootClock);
                                            C2GB c2gb22 = this.A00;
                                            InterfaceC02550Ad interfaceC02550Ad = c2gb22.A00;
                                            String A06 = AbstractC58442PvL.A06(map);
                                            String A05 = AbstractC58442PvL.A05(map);
                                            String str3 = "get_encryption_key";
                                            switch (str.hashCode()) {
                                                case -1535674460:
                                                    if (str.equals("fbpay_auth_ticket_query_fail")) {
                                                        HashMap hashMap = new HashMap(map);
                                                        hashMap.put("flow_step", "auth_ticket_query");
                                                        unmodifiableMap = Collections.unmodifiableMap(hashMap);
                                                        C14360o3.A07(unmodifiableMap);
                                                        str2 = "payflows_fail";
                                                        c2gb22.Chz(str2, unmodifiableMap);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case -66680387:
                                                    if (str.equals("fbpay_auth_ticket_query_success")) {
                                                        HashMap hashMap2 = new HashMap(map);
                                                        hashMap2.put("flow_step", "auth_ticket_query");
                                                        unmodifiableMap = Collections.unmodifiableMap(hashMap2);
                                                        C14360o3.A07(unmodifiableMap);
                                                        str2 = "payflows_success";
                                                        c2gb22.Chz(str2, unmodifiableMap);
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case 434863887:
                                                    if (str.equals("client_load_paysec_fail")) {
                                                        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
                                                        c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "client_load_paysec_fail"), 86);
                                                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                                            c25531Mh.A0u(A06);
                                                            c25531Mh.A0M(C2O5.valueOf(A05), "product_type");
                                                            c25531Mh.A0M(EnumC31203Dnm.ANDROID, "platform");
                                                            c25531Mh.A0Q("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
                                                            C0Zx c0Zx = new C0Zx() { // from class: X.9We
                                                            };
                                                            c0Zx.A06("sec_type", "get_encryption_key");
                                                            c25531Mh.A0N(c0Zx, "event_payload");
                                                            c25531Mh.A0R("error_message", String.valueOf(map.get("error_message")));
                                                            c25531Mh.A0R(TraceFieldType.ErrorCode, String.valueOf(map.get(TraceFieldType.ErrorCode)));
                                                            c25531Mh.A0R("error_stacktrace", String.valueOf(map.get("error_stacktrace")));
                                                            c25531Mh.Cht();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case 434965761:
                                                    if (str.equals("client_load_paysec_init")) {
                                                        C18920wW c18920wW2 = (C18920wW) interfaceC02550Ad;
                                                        c25531Mh = new C25531Mh(c18920wW2.A00(c18920wW2.A00, "client_load_paysec_init"), 87);
                                                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                                            c25531Mh.A0u(A06);
                                                            c25531Mh.A0M(C2O5.valueOf(A05), "product_type");
                                                            c25531Mh.A0M(EnumC31203Dnm.ANDROID, "platform");
                                                            c25531Mh.A0Q("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
                                                            C0Zx c0Zx2 = new C0Zx() { // from class: X.9We
                                                            };
                                                            c0Zx2.A06("sec_type", "get_encryption_key");
                                                            c25531Mh.A0N(c0Zx2, "event_payload");
                                                            c25531Mh.Cht();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                case 628213362:
                                                    if (str.equals("client_load_paysec_success")) {
                                                        C18920wW c18920wW3 = (C18920wW) interfaceC02550Ad;
                                                        c25531Mh = new C25531Mh(c18920wW3.A00(c18920wW3.A00, "client_load_paysec_success"), 88);
                                                        String str4 = null;
                                                        Object obj2 = map.get("sec_type");
                                                        if (obj2 != null && (obj2 instanceof String)) {
                                                            str4 = (String) obj2;
                                                        }
                                                        HashMap hashMap3 = new HashMap();
                                                        if (str4 != null) {
                                                            for (Map.Entry entry : map.entrySet()) {
                                                                if (entry.getValue() instanceof String) {
                                                                    Object key = entry.getKey();
                                                                    Object value = entry.getValue();
                                                                    C14360o3.A0C(value, "null cannot be cast to non-null type kotlin.String");
                                                                    hashMap3.put(key, value);
                                                                }
                                                            }
                                                            str3 = str4;
                                                        }
                                                        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                                            C2O5 c2o5 = C2O5.A0K;
                                                            try {
                                                                c2o5 = C2O5.valueOf(A05);
                                                            } catch (Exception unused) {
                                                            }
                                                            c25531Mh.A0u(A06);
                                                            c25531Mh.A0M(c2o5, "product_type");
                                                            c25531Mh.A0M(EnumC31203Dnm.ANDROID, "platform");
                                                            c25531Mh.A0Q("actual_event_time", Long.valueOf(awakeTimeSinceBootClock.now()));
                                                            C0Zx c0Zx3 = new C0Zx() { // from class: X.9We
                                                            };
                                                            c0Zx3.A06("sec_type", str3);
                                                            c25531Mh.A0N(c0Zx3, "event_payload");
                                                            if (hashMap3.size() > 0) {
                                                                c25531Mh.A0w(hashMap3);
                                                            }
                                                            c25531Mh.Cht();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                                default:
                                                    throw new IllegalArgumentException(AnonymousClass001.A0g("Event name ", str, " is not supported!"));
                                            }
                                        }
                                    }

                                    {
                                        this.A00 = c2gb2;
                                    }
                                };
                                interfaceC08830cm8 = C2FU.A00(new C64823TVn(context14, new C2GC(c2gc2) { // from class: X.2GE
                                    public final C2GC A00;

                                    @Override // X.C2GC
                                    public final void Chz(String str, Map map) {
                                        this.A00.Chz(str, map);
                                    }

                                    {
                                        this.A00 = c2gc2;
                                    }
                                }, obj));
                            }
                            atomicReference.set(new C2GK(applicationContext, A002, interfaceC08830cm6, interfaceC08830cm2, interfaceC08830cm7, interfaceC08830cm4, A003, A004, A005, A006, interfaceC08830cm8, A007, obj, interfaceC08830cm, interfaceC08830cm5, c47502Fz, c2g0, interfaceC08830cm9, A008, interfaceC08830cm12, A009, interfaceC08830cm13, c2g6, interfaceC08830cm3));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            C2GK c2gk = (C2GK) atomicReference.get();
            if (c2gk != null) {
                synchronized (C2FP.class) {
                    try {
                        if (!C2FP.A05().A01) {
                            C2FP A05 = C2FP.A05();
                            A05.A01 = true;
                            A05.A00 = c2gk;
                        } else if (!C2FP.A05().A00.equals(c2gk)) {
                            throw new Exception();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } catch (C40N e) {
            C0K8.A0F("FBPayInstagramConfig", "FBPay config object is already initialized.", e);
        }
    }
}
