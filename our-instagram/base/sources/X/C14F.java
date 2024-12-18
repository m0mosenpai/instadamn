package X;

import android.content.Context;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.common.fury.IgFury;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.privacy.zone.upf.nocton.AndroidPurposePolicyFlowsToEvaluator;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.systrace.Systrace;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.14F, reason: invalid class name */
/* loaded from: classes.dex */
public final class C14F extends AbstractC211911v {
    public final Context A00;
    public final C211211o A01;
    public final C211211o A02;

    public C14F(Context context, C211211o c211211o) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = c211211o;
        this.A02 = c211211o;
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "ConfigFromQEInitializer";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC211911v
    public final void A07() {
        Integer num;
        C18V c18v;
        C1AC A02;
        String str;
        C2U6 c2u6;
        final C0SW[] c0swArr;
        C58505PwZ c58505PwZ;
        final AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A08, 36318917764848401L)) {
            final AbstractC18280vF abstractC18280vF = new AbstractC18280vF() { // from class: X.4dY
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("battery_logging", 266, 5, false, false);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    AbstractC12990ll abstractC12990ll = A08;
                    AbstractC19330xH A00 = AbstractC11060iN.A00(abstractC12990ll);
                    Context context = C14F.this.A00;
                    C18920wW A002 = C41341vj.A00(abstractC12990ll);
                    C06090Tz c06090Tz2 = C06090Tz.A05;
                    boolean A06 = C18U.A06(c06090Tz2, abstractC12990ll, 36318917764913938L);
                    boolean A062 = C18U.A06(c06090Tz2, abstractC12990ll, 36318917764979475L);
                    boolean A063 = C18U.A06(c06090Tz2, abstractC12990ll, 36318917765045012L);
                    synchronized (C41341vj.class) {
                        C09170dP.A0C("liger");
                        C41341vj.A06 = new C41341vj(context, A00, A002, A06, A063, A062);
                        C218914p.A08.A0A(new C64477TFn());
                    }
                    C41341vj.A02(A00);
                    C41341vj.A03(C41341vj.A00(abstractC12990ll));
                }
            };
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.4dZ
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super("battery_logging_scheduler", 266, 5, false, false);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    C14270nr.A00().A01(abstractC18280vF, Long.valueOf(C18U.A01(C06090Tz.A05, A08, 36600392741818243L)).intValue() * 1000);
                }
            });
        }
        if (C18U.A06(c06090Tz, A08, 36311392982139399L)) {
            C72774Xmt.A03 = new C72774Xmt(A08);
            C218914p.A08.A0A(new YEX());
        }
        String A04 = C18U.A04(c06090Tz, A08, 36876919916200059L);
        java.util.Set set = C222816h.A08;
        set.clear();
        Collections.addAll(set, A04.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1));
        C2U1 c2u1 = C2U1.A03;
        if (c2u1 == null) {
            c2u1 = new C2U1();
            C2U1.A03 = c2u1;
        }
        c2u1.A02 = C18U.A06(c06090Tz, A08, 36310379369857064L);
        boolean A06 = C18U.A06(c06090Tz, A08, 36310392254758954L);
        boolean A062 = C18U.A06(c06090Tz, A08, 36310392254824491L);
        if (A06) {
            boolean z = !A062;
            if (IgFury.A00.compareAndSet(false, true)) {
                IgFury.A01 = true;
                if (IgFury.A01) {
                    C2U3 c2u3 = new C2U3();
                    String[][] strArr = Systrace.A03;
                    C0ev.A01(c2u3);
                    if (!z) {
                        if (A062) {
                            c58505PwZ = C58505PwZ.A00;
                        } else {
                            c58505PwZ = null;
                        }
                        C06600Wq.A03 = c58505PwZ;
                    }
                    C09630ee c09630ee = C09630ee.A01;
                    if (A062) {
                        c0swArr = new C0SW[]{c2u3, c09630ee, C58505PwZ.A00};
                    } else {
                        c0swArr = new C0SW[]{c2u3, c09630ee};
                    }
                    C0SW c0sw = new C0SW(c0swArr) { // from class: X.0ak
                        public final C0SW[] A00;

                        @Override // X.C0SW
                        public final Integer CAQ() {
                            Integer num2 = C05F.A0C;
                            for (C0SW c0sw2 : this.A00) {
                                int intValue = c0sw2.CAQ().intValue();
                                if (intValue != 0) {
                                    if (intValue == 1) {
                                        num2 = C05F.A01;
                                    }
                                } else {
                                    return C05F.A00;
                                }
                            }
                            return num2;
                        }

                        {
                            this.A00 = c0swArr;
                        }
                    };
                    if (C0SX.A00 == null) {
                        C0SX.A00 = c0sw;
                    } else {
                        final C0SW[] c0swArr2 = {C0SX.A00, c0sw};
                        C0SX.A00 = new C0SW(c0swArr2) { // from class: X.0ak
                            public final C0SW[] A00;

                            @Override // X.C0SW
                            public final Integer CAQ() {
                                Integer num2 = C05F.A0C;
                                for (C0SW c0sw2 : this.A00) {
                                    int intValue = c0sw2.CAQ().intValue();
                                    if (intValue != 0) {
                                        if (intValue == 1) {
                                            num2 = C05F.A01;
                                        }
                                    } else {
                                        return C05F.A00;
                                    }
                                }
                                return num2;
                            }

                            {
                                this.A00 = c0swArr2;
                            }
                        };
                    }
                    final InterfaceC06270Us[] interfaceC06270UsArr = {c2u3, c09630ee};
                    InterfaceC06270Us interfaceC06270Us = new InterfaceC06270Us(interfaceC06270UsArr) { // from class: X.0h4
                        public final InterfaceC06270Us[] A00;

                        @Override // X.C0SW
                        public final Integer CAQ() {
                            Integer num2 = C05F.A0C;
                            InterfaceC06270Us[] interfaceC06270UsArr2 = this.A00;
                            int i = 0;
                            do {
                                int intValue = interfaceC06270UsArr2[i].CAQ().intValue();
                                if (intValue != 0) {
                                    if (intValue == 1) {
                                        num2 = C05F.A01;
                                    }
                                    i++;
                                } else {
                                    return C05F.A00;
                                }
                            } while (i < 2);
                            return num2;
                        }

                        @Override // X.InterfaceC06270Us
                        public final void Cus(C0SJ c0sj) {
                            InterfaceC06270Us[] interfaceC06270UsArr2 = this.A00;
                            int i = 0;
                            do {
                                if (interfaceC06270UsArr2[i].CAQ() != C05F.A0C) {
                                    interfaceC06270UsArr2[i].Cus(c0sj);
                                }
                                i++;
                            } while (i < 2);
                        }

                        @Override // X.InterfaceC06270Us
                        public final void D9M(C0SJ c0sj) {
                            InterfaceC06270Us[] interfaceC06270UsArr2 = this.A00;
                            int i = 0;
                            do {
                                if (interfaceC06270UsArr2[i].CAQ() != C05F.A0C) {
                                    interfaceC06270UsArr2[i].D9M(c0sj);
                                }
                                i++;
                            } while (i < 2);
                        }

                        {
                            this.A00 = interfaceC06270UsArr;
                        }
                    };
                    if (C06600Wq.A02 == null) {
                        C06600Wq.A02 = interfaceC06270Us;
                    } else {
                        final InterfaceC06270Us[] interfaceC06270UsArr2 = {C06600Wq.A02, interfaceC06270Us};
                        C06600Wq.A02 = new InterfaceC06270Us(interfaceC06270UsArr2) { // from class: X.0h4
                            public final InterfaceC06270Us[] A00;

                            @Override // X.C0SW
                            public final Integer CAQ() {
                                Integer num2 = C05F.A0C;
                                InterfaceC06270Us[] interfaceC06270UsArr22 = this.A00;
                                int i = 0;
                                do {
                                    int intValue = interfaceC06270UsArr22[i].CAQ().intValue();
                                    if (intValue != 0) {
                                        if (intValue == 1) {
                                            num2 = C05F.A01;
                                        }
                                        i++;
                                    } else {
                                        return C05F.A00;
                                    }
                                } while (i < 2);
                                return num2;
                            }

                            @Override // X.InterfaceC06270Us
                            public final void Cus(C0SJ c0sj) {
                                InterfaceC06270Us[] interfaceC06270UsArr22 = this.A00;
                                int i = 0;
                                do {
                                    if (interfaceC06270UsArr22[i].CAQ() != C05F.A0C) {
                                        interfaceC06270UsArr22[i].Cus(c0sj);
                                    }
                                    i++;
                                } while (i < 2);
                            }

                            @Override // X.InterfaceC06270Us
                            public final void D9M(C0SJ c0sj) {
                                InterfaceC06270Us[] interfaceC06270UsArr22 = this.A00;
                                int i = 0;
                                do {
                                    if (interfaceC06270UsArr22[i].CAQ() != C05F.A0C) {
                                        interfaceC06270UsArr22[i].D9M(c0sj);
                                    }
                                    i++;
                                } while (i < 2);
                            }

                            {
                                this.A00 = interfaceC06270UsArr2;
                            }
                        };
                    }
                }
            }
        }
        boolean A063 = C18U.A06(c06090Tz, A08, 36314549783104188L);
        synchronized (C2U4.class) {
            if (C2U4.A00 == null) {
                if (A06) {
                    if (!A063) {
                        C0K8.A0D("IgZoneModule", "IG Policy Zone is disabled. No-op Zone is setup");
                        c2u6 = C2U5.A00;
                    } else {
                        final InterfaceC100654fU interfaceC100654fU = new InterfaceC100654fU() { // from class: X.4fT
                            public final /* synthetic */ C100694fY A00 = new C100694fY(new Object(), AbstractC09440dt.A01(C100664fV.A00), AbstractC09440dt.A01(C100674fW.A00));

                            @Override // X.InterfaceC100654fU
                            public final InterfaceC65574Tn8 B2g(Integer num2) {
                                C14360o3.A0B(num2, 0);
                                return this.A00.B2g(num2);
                            }

                            @Override // X.InterfaceC100654fU
                            public final void EHZ(Integer num2, String str2, Map map) {
                                C14360o3.A0B(num2, 0);
                                C14360o3.A0B(str2, 1);
                                C14360o3.A0B(map, 2);
                                this.A00.EHZ(num2, str2, map);
                            }

                            @Override // X.InterfaceC100654fU
                            public final void EIV(Integer num2, String str2, Map map) {
                                C14360o3.A0B(num2, 0);
                                C14360o3.A0B(str2, 1);
                                C14360o3.A0B(map, 2);
                                this.A00.EIV(num2, str2, map);
                            }
                        };
                        c2u6 = new C2U6(interfaceC100654fU) { // from class: X.4fZ
                            public final InterfaceC100654fU A00;

                            public final void A00(C58914QIs c58914QIs, C58914QIs c58914QIs2, String str2) {
                                String str3;
                                String A16;
                                Integer num2;
                                String str4;
                                String str5;
                                C14360o3.A0B(c58914QIs, 0);
                                C14360o3.A0B(c58914QIs2, 1);
                                C39715Hjl c39715Hjl = AndroidPurposePolicyFlowsToEvaluator.Companion;
                                ZonePolicy zonePolicy = c58914QIs.A00;
                                String A00 = zonePolicy.A00();
                                ZonePolicy zonePolicy2 = c58914QIs2.A00;
                                int flowsTo = AndroidPurposePolicyFlowsToEvaluator.flowsTo(A00, zonePolicy2.A00(), AbstractC06930Yk.A0E());
                                if (flowsTo != 0 && flowsTo != 1) {
                                    A16 = AnonymousClass001.A13("FlowsTo evaluator error: ", zonePolicy.A00(), " !--> ", zonePolicy2.A00(), " for ", str2);
                                    num2 = C05F.A0C;
                                } else {
                                    if (flowsTo == 1) {
                                        str3 = "pass";
                                    } else {
                                        str3 = RealtimeConstants.SEND_FAIL;
                                    }
                                    A16 = AnonymousClass001.A16("FlowsTo ", str3, ": ", zonePolicy.A00(), " !--> ", zonePolicy2.A00(), " for ", str2);
                                    num2 = C05F.A0N;
                                }
                                Integer num3 = zonePolicy.A00;
                                Integer num4 = zonePolicy2.A00;
                                C14360o3.A0B(num3, 0);
                                C14360o3.A0B(num4, 1);
                                for (Integer num5 : C05F.A00(2)) {
                                    if (AbstractC225329wv.A00(num5) == Math.min(AbstractC225329wv.A00(num3), AbstractC225329wv.A00(num4))) {
                                        InterfaceC100654fU interfaceC100654fU2 = this.A00;
                                        C09530e4 c09530e4 = new C09530e4("from", zonePolicy.A00());
                                        C09530e4 c09530e42 = new C09530e4("to", zonePolicy2.A00());
                                        C09530e4 c09530e43 = new C09530e4("fromAsid", c58914QIs.A01);
                                        C09530e4 c09530e44 = new C09530e4("toAsid", c58914QIs2.A01);
                                        if (1 - num5.intValue() != 0) {
                                            str4 = "FULL_THROW";
                                        } else {
                                            str4 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                                        }
                                        C09530e4 c09530e45 = new C09530e4("enforcementMode", str4);
                                        C09530e4 c09530e46 = new C09530e4("fromPolicyVersion", zonePolicy.A01());
                                        C09530e4 c09530e47 = new C09530e4("toPolicyVersion", zonePolicy2.A01());
                                        if (flowsTo != 0) {
                                            if (flowsTo != 1) {
                                                switch (flowsTo) {
                                                    case -100:
                                                        str5 = "UnknownPolicy";
                                                        break;
                                                    case -99:
                                                        str5 = AbstractC58317Pt9.A00(555);
                                                        break;
                                                    case -98:
                                                        str5 = "MissingConsent";
                                                        break;
                                                    default:
                                                        throw new IllegalArgumentException(AnonymousClass001.A0O(AbstractC111324zv.A00(3656), flowsTo));
                                                }
                                            } else {
                                                str5 = "True";
                                            }
                                        } else {
                                            str5 = "False";
                                        }
                                        C09530e4 c09530e48 = new C09530e4("flowsToResult", str5);
                                        boolean z2 = true;
                                        if (flowsTo != 1 && num5 != C05F.A01) {
                                            z2 = false;
                                        }
                                        interfaceC100654fU2.EIV(num2, A16, AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, new C09530e4("finalResult", String.valueOf(z2))));
                                        if (flowsTo != 1 && num5 != C05F.A01) {
                                            C0K8.A0D("ZoneImpl", A16);
                                            C14360o3.A0B(A16, 1);
                                            throw new RuntimeException(A16);
                                        }
                                        return;
                                    }
                                }
                                throw new NoSuchElementException(MSV.A00(6));
                            }

                            @Override // X.C2U6
                            public final boolean isEnabled() {
                                return true;
                            }

                            @Override // X.C2U6
                            public final Rl2 ELD(InterfaceC65349TiW interfaceC65349TiW, ZonePolicy zonePolicy, String str2) {
                                C58914QIs c58914QIs = new C58914QIs(zonePolicy, "UNKNOWN");
                                try {
                                    C58506Pwa c58506Pwa = C58506Pwa.A02;
                                    A00((C58914QIs) c58506Pwa.A01(), c58914QIs, "Run");
                                    C65022Tc8 c65022Tc8 = new C65022Tc8(interfaceC65349TiW, zonePolicy, "UNKNOWN", 0);
                                    ThreadLocal threadLocal = c58506Pwa.A00;
                                    C46h c46h = (C46h) threadLocal.get();
                                    threadLocal.set(new C4JL(c58914QIs));
                                    C14360o3.A0A(c46h);
                                    THJ thj = new THJ(c58506Pwa, c46h);
                                    try {
                                        Object invoke = c65022Tc8.invoke(c58914QIs);
                                        thj.close();
                                        return (Rl2) invoke;
                                    } finally {
                                    }
                                } catch (TXB e) {
                                    return new R2B(e);
                                }
                            }

                            @Override // X.C2U6
                            public final Rl2 F9v(ZonedValue zonedValue) {
                                C58914QIs c58914QIs = new C58914QIs(zonedValue.A00, zonedValue.A02);
                                C58914QIs c58914QIs2 = (C58914QIs) C58506Pwa.A02.A01();
                                try {
                                    A00(c58914QIs, c58914QIs2, "Unwrap");
                                    this.A00.EHZ(C05F.A01, AnonymousClass001.A0R("Unwrap ", "ZonedValue"), AbstractC06930Yk.A06(new C09530e4("from", c58914QIs.A00.A00()), new C09530e4("to", c58914QIs2.A00.A00())));
                                    return new R2C(zonedValue.A01);
                                } catch (TXB e) {
                                    return new R2B(e);
                                }
                            }

                            @Override // X.C2U6
                            public final Object F9x(ZonedValue zonedValue, Integer num2) {
                                C14360o3.A0B(num2, 1);
                                InterfaceC65574Tn8 B2g = this.A00.B2g(C05F.A00);
                                ZonePolicy zonePolicy = zonedValue.A00;
                                zonePolicy.A00();
                                if (B2g.isSampled()) {
                                    ZonePolicy zonePolicy2 = ((C58914QIs) C58506Pwa.A02.A01()).A00;
                                    String A0g = AnonymousClass001.A0g("ZonedValue", " is unzoned for ", "IGD_OBC_LOGGING_OUT_OF_REFACTOR_SCOPE");
                                    C14360o3.A0B(A0g, 1);
                                    B2g.A8W(new Exception(A0g));
                                    B2g.ABZ("reason", "IGD_OBC_LOGGING_OUT_OF_REFACTOR_SCOPE");
                                    B2g.ABZ("from", zonePolicy.A00());
                                    B2g.ABZ("to", zonePolicy2.A00());
                                    B2g.ABZ("fromAsid", zonedValue.A02);
                                    B2g.ABZ("fromPolicyVersion", zonePolicy.A01());
                                    B2g.ABZ("toPolicyVersion", zonePolicy2.A01());
                                    B2g.report();
                                }
                                return zonedValue.A01;
                            }

                            {
                                this.A00 = interfaceC100654fU;
                            }
                        };
                    }
                } else {
                    C0K8.A0D("IgZoneModule", "IgFury is disabled. No-op Zone is setup");
                    c2u6 = C2U5.A00;
                }
                C2U4.A00 = c2u6;
            }
        }
        boolean z2 = false;
        if (C04100Kb.A00(this.A00) <= 2012) {
            z2 = true;
        }
        boolean z3 = !z2;
        C2U7.A00 = z3;
        C2U8.A03 = z3;
        C2U8.A01 = DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD;
        C2U8.A00 = 350;
        C2U9.A06 = C18U.A06(c06090Tz, A08, 36311968507757390L);
        C27741Wc.A03 = C18U.A06(c06090Tz, A08, 36312131716514738L);
        if (C18U.A06(c06090Tz, A08, 36312191846056946L)) {
            int intValue = Long.valueOf(C18U.A01(c06090Tz, A08, 36593666822833624L)).intValue();
            C2UB c2ub = new C2UB() { // from class: X.2UA
                public final AtomicInteger A00 = new AtomicInteger();

                @Override // X.C2UB
                public final int En9(Class cls, String str2, String str3) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i == null) {
                        return 0;
                    }
                    int incrementAndGet = this.A00.incrementAndGet();
                    c006802i.markerStart(681648273, incrementAndGet);
                    MarkerEditor A00 = C41431vs.A01.A00(c006802i, 681648273, incrementAndGet);
                    A00.annotate("request_name", str2);
                    A00.annotate("callback_method", str3);
                    A00.annotate("callback_class", cls.getName());
                    A00.annotate("field_to_deobfuscate", "callback_class");
                    A00.markerEditingCompleted();
                    return incrementAndGet;
                }

                @Override // X.C2UB
                public final void ASS(int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i != null) {
                        c006802i.markerEnd(681648273, i, (short) 467);
                    }
                }
            };
            C2UB c2ub2 = c2ub;
            if (intValue != 1) {
                c2ub2 = c2ub;
                if (new Random().nextInt(intValue) != 0) {
                    c2ub2 = new Object();
                }
            }
            C2UD.A00 = c2ub2;
        }
        if (C18U.A06(c06090Tz, A08, 36312251975599126L)) {
            C2UE c2ue = C2UE.A01;
            int intValue2 = Long.valueOf(C18U.A01(c06090Tz, A08, 36593726952375776L)).intValue();
            C2UG c2ug = new C2UG() { // from class: X.2UH
                public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C2UI.A00);
                public final AtomicInteger A00 = new AtomicInteger(0);

                @Override // X.C2UG
                public final int En1(Class cls) {
                    C14360o3.A0B(cls, 0);
                    C006802i c006802i = (C006802i) A01.getValue();
                    if (c006802i != null) {
                        int incrementAndGet = this.A00.incrementAndGet();
                        c006802i.markerStart(998578638, incrementAndGet);
                        MarkerEditor A00 = C41431vs.A01.A00(c006802i, 998578638, incrementAndGet);
                        A00.annotate("action_class", cls.getName());
                        A00.annotate("field_to_deobfuscate", "action_class");
                        A00.markerEditingCompleted();
                        return incrementAndGet;
                    }
                    return 0;
                }

                @Override // X.C2UG
                public final void ASP(int i) {
                    C006802i c006802i = (C006802i) A01.getValue();
                    if (c006802i != null) {
                        c006802i.markerEnd(998578638, i, (short) 467);
                    }
                }
            };
            C2UG c2ug2 = c2ug;
            if (intValue2 != 1) {
                c2ug2 = c2ug;
                if (new Random().nextInt(intValue2) != 0) {
                    c2ug2 = new Object();
                }
            }
            c2ue.A00 = c2ug2;
        }
        if (C18U.A06(c06090Tz, A08, 36312410889389159L)) {
            int intValue3 = Long.valueOf(C18U.A01(c06090Tz, A08, 36593885866165780L)).intValue();
            C2UK c2uk = new C2UK() { // from class: X.2UJ
                public final AtomicInteger A00 = new AtomicInteger();

                @Override // X.C2UK
                public final void ASR(C154516x1 c154516x1, int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i != null) {
                        MarkerEditor withMarker = c006802i.withMarker(248451991, i);
                        withMarker.annotate("view_type", c154516x1.A01);
                        withMarker.annotate("field_to_deobfuscate", "view_type");
                        withMarker.annotate("ad_type", AbstractC154526x2.A00(c154516x1.A00));
                        withMarker.annotate("is_litho_view", c154516x1.A02);
                        withMarker.markerEditingCompleted();
                        c006802i.markerEnd(248451991, i, (short) 467);
                    }
                }

                @Override // X.C2UK
                public final void ASU(C154516x1 c154516x1, int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i != null) {
                        MarkerEditor withMarker = c006802i.withMarker(248448614, i);
                        withMarker.annotate("view_type", c154516x1.A01);
                        withMarker.annotate("field_to_deobfuscate", "view_type");
                        withMarker.annotate("ad_type", AbstractC154526x2.A00(c154516x1.A00));
                        withMarker.annotate("is_litho_view", c154516x1.A02);
                        withMarker.annotate("is_preloaded", c154516x1.A04);
                        withMarker.annotate("is_on_critical_path", c154516x1.A03);
                        withMarker.markerEditingCompleted();
                        c006802i.markerEnd(248448614, i, (short) 467);
                    }
                }

                @Override // X.C2UK
                public final int En5(int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i != null) {
                        int incrementAndGet = this.A00.incrementAndGet();
                        c006802i.markerStart(248451991, incrementAndGet);
                        MarkerEditor A00 = C41431vs.A01.A00(c006802i, 248451991, incrementAndGet);
                        A00.annotate("view_type_id", i);
                        A00.markerEditingCompleted();
                        return incrementAndGet;
                    }
                    return 0;
                }

                @Override // X.C2UK
                public final int EnB(int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i != null) {
                        int incrementAndGet = this.A00.incrementAndGet();
                        c006802i.markerStart(248448614, incrementAndGet);
                        MarkerEditor A00 = C41431vs.A01.A00(c006802i, 248448614, incrementAndGet);
                        A00.annotate("view_type_id", i);
                        A00.markerEditingCompleted();
                        return incrementAndGet;
                    }
                    return 0;
                }
            };
            C2UK c2uk2 = c2uk;
            if (intValue3 != 1) {
                c2uk2 = c2uk;
                if (new Random().nextInt(intValue3) != 0) {
                    c2uk2 = new Object();
                }
            }
            C2UL.A00 = c2uk2;
        }
        if (C18U.A06(c06090Tz, A08, 36312307810173991L)) {
            int intValue4 = Long.valueOf(C18U.A01(c06090Tz, A08, 36593782786950650L)).intValue();
            C2UO c2uo = new C2UO() { // from class: X.2UN
                public final AtomicInteger A00 = new AtomicInteger();

                @Override // X.C2UO
                public final int Enh(Class cls, String str2) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i == null) {
                        return 0;
                    }
                    int incrementAndGet = this.A00.incrementAndGet();
                    c006802i.markerStart(200358122, incrementAndGet);
                    MarkerEditor A00 = C41431vs.A01.A00(c006802i, 200358122, incrementAndGet);
                    A00.annotate("scroll_method", "onScroll");
                    A00.annotate("listener_class", cls.getName());
                    A00.annotate("surface_name", str2);
                    A00.annotate("field_to_deobfuscate", "listener_class");
                    A00.markerEditingCompleted();
                    return incrementAndGet;
                }

                @Override // X.C2UO
                public final int Eni(Class cls, String str2, int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i == null) {
                        return 0;
                    }
                    int incrementAndGet = this.A00.incrementAndGet();
                    c006802i.markerStart(200358122, incrementAndGet);
                    MarkerEditor A00 = C41431vs.A01.A00(c006802i, 200358122, incrementAndGet);
                    A00.annotate("scroll_method", "onScrollStateChanged");
                    A00.annotate("listener_class", cls.getName());
                    A00.annotate("surface_name", str2);
                    A00.annotate("scroll_state", i);
                    A00.annotate("field_to_deobfuscate", "listener_class");
                    A00.markerEditingCompleted();
                    return incrementAndGet;
                }

                @Override // X.C2UO
                public final void ASX(int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i != null) {
                        c006802i.markerEnd(200358122, i, (short) 467);
                    }
                }

                @Override // X.C2UO
                public final void ASY(int i) {
                    C006802i c006802i = C006802i.A0p;
                    if (c006802i != null) {
                        c006802i.markerEnd(200358122, i, (short) 467);
                    }
                }
            };
            C2UO c2uo2 = c2uo;
            if (intValue4 != 1) {
                c2uo2 = c2uo;
                if (new Random().nextInt(intValue4) != 0) {
                    c2uo2 = new Object();
                }
            }
            C2UQ.A00 = c2uo2;
        }
        boolean z4 = false;
        if (C18U.A06(c06090Tz, A08, 36312337874945069L)) {
            z4 = true;
        }
        C2UR.A03 = z4;
        C2UR.A01 = Long.valueOf(C18U.A01(c06090Tz, A08, 36593812851787266L)).intValue();
        boolean z5 = false;
        if (C18U.A06(c06090Tz, A08, 36312337875010606L)) {
            z5 = true;
        }
        C2UR.A02 = z5;
        if (C18U.A06(c06090Tz, A08, 36312788846773505L)) {
            C2US.sEnableSmartUpdateAsync = true;
        }
        if (!C18U.A06(c06090Tz, A08, 2342156360700921762L)) {
            C2US.sEnableStableIdFix = false;
        }
        C18U.A06(c06090Tz, A08, 36314485358594687L);
        C18U.A06(c06090Tz, A08, 36317440296096930L);
        C18U.A01(c06090Tz, A08, 36600843715547168L);
        C18U.A06(c06090Tz, A08, 36319871247916764L);
        C18U.A06(c06090Tz, A08, 36321627889215121L);
        UserSession A01 = AbstractC03270Dk.A01(A08);
        if (A01 != null && (c18v = C18V.A01) != null && (A02 = c18v.A02(A01)) != null) {
            C229419w c229419w = A02.A01.A00;
            C06090Tz A00 = C06090Tz.A00(new C06090Tz());
            A00.A02 = true;
            boolean AhE = c229419w.AhE(A00, 36321627889215121L);
            C006802i c006802i = C006802i.A0p;
            int source = A00.A00.A00.getSource();
            if (AhE) {
                str = "passed";
            } else {
                str = "failed";
            }
            c006802i.markEventBuilder(13647117, str).annotate("value_source", source).report();
        }
        String A042 = C18U.A04(c06090Tz, A08, 36889933666845550L);
        if (A042.length() > 0) {
            C2UV.A00 = A042;
        }
        ((AnonymousClass122) this.A02.A00()).A08();
        if (C0L6.A04 == null) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (num != C05F.A00) {
            C19360xL.A00().A03 = C17190tE.A00;
            C0L6.A05(C0LK.A9D, String.valueOf(C19360xL.A00().A00));
            C0L6.A05(C0LK.A9q, String.valueOf(C19360xL.A00().A02));
            C0L6.A05(C0LK.A61, AbstractC12380kg.A00(C19360xL.A00().A0A));
            C0L6.A05(C0LK.A9E, String.valueOf(C19360xL.A00().A01));
        }
        C2UW.A00 = 5;
        C2UX.A00 = 5;
        C2UX.A01 = true;
    }
}
