package X;

import android.content.Context;
import android.os.HandlerThread;
import com.facebook.R;
import com.facebook.analytics2.logger.interfaces.DefaultHandlerThreadFactory;
import com.facebook.flexiblesampling.SamplingResult;
import com.instagram.analytics.analytics2.IGAnalytics2HandlerThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ri, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39091ri {
    public static final C39111rk A0M;
    public static final C39111rk A0N;
    public static final C39111rk A0O;
    public static final C39111rk A0P;
    public InterfaceC38441qY A00;
    public C38151q2 A01;
    public final C02Q A02;
    public final InterfaceC39211ry A03;
    public final C39141rn A04;
    public final C39231s0 A05;
    public final C39701st A06;
    public final InterfaceC38191q6 A07;
    public final InterfaceC39151rq A08;
    public final C04060Jx A09;
    public final C38081ps A0A;
    public final C38131px A0B;
    public final C38261qG A0C;
    public final C38071pr A0D;
    public final C38341qO A0E;
    public final C38951rU A0F;
    public final C38961rV A0G;
    public final C37951pc A0H;
    public final C39161rr A0I;
    public final InterfaceC08830cm A0J;
    public final C0S0 A0K;
    public final Context A0L;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A0P = new C39111rk(timeUnit.toMillis(15L), timeUnit.toMillis(45L), 0L, timeUnit.toMillis(30L));
        A0O = new C39111rk(0L, 0L, 0L, 0L);
        A0N = new C39111rk(timeUnit.toMillis(15L), timeUnit.toMillis(45L), 0L, timeUnit.toMillis(30L));
        A0M = new C39111rk(0L, 0L, 0L, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (((X.InterfaceC38631qu) r1.get()).B3y().isEmpty() == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C39141rn A00(com.facebook.flexiblesampling.SamplingResult r10, java.lang.Integer r11, java.lang.String r12, boolean r13) {
        /*
            r9 = this;
            X.0cm r1 = r9.A0J
            java.lang.Object r0 = r1.get()
            X.1qu r0 = (X.InterfaceC38631qu) r0
            java.lang.String r0 = r0.B3y()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lad
            java.util.UUID r0 = X.C0HM.A00()
            java.lang.String r7 = r0.toString()
        L1a:
            java.lang.String r5 = "event.logged"
            r3 = 1
            X.1rU r2 = r9.A0F
            boolean r0 = r2.A02
            r6 = r12
            if (r0 == 0) goto L2e
            X.4wf r2 = r2.A00()
            r8 = 1
            r2.Ci2(r3, r5, r6, r7, r8)
        L2e:
            r2 = 0
            X.02Q r0 = r9.A02
            java.lang.Object r4 = r0.A7H()
            X.1rn r4 = (X.C39141rn) r4
            if (r4 != 0) goto L3e
            X.1rn r4 = new X.1rn
            r4.<init>()
        L3e:
            if (r13 != 0) goto L51
            java.lang.Object r0 = r1.get()
            X.1qu r0 = (X.InterfaceC38631qu) r0
            java.lang.String r0 = r0.B3y()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 != 0) goto L52
        L51:
            r0 = 1
        L52:
            r4.A04 = r9
            r4.A0C = r2
            r4.A0B = r12
            r4.A09 = r11
            r4.A0H = r0
            r4.A0E = r7
            X.0Jx r0 = r9.A09
            X.0CA r2 = r0.A02()
            r4.A05 = r2
            X.0C2 r1 = X.C0C2.A00()
            java.lang.String r0 = "encoder cannot be null!"
            X.AbstractC05810Sj.A01(r1, r0)
            r2.A02 = r1
            java.lang.String r2 = r4.A0E
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L82
            X.0CA r1 = r4.A05
            java.lang.String r0 = "trace_id"
            X.C0CA.A00(r1, r2, r0)
        L82:
            r4.A07 = r10
            boolean r0 = r4.A0I
            if (r0 != 0) goto Lb1
            r0 = 1
            r4.A0I = r0
            r4.A0A()
            int r0 = r10.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0A = r0
            boolean r0 = r10.A01
            if (r0 == 0) goto La1
            r2 = 64
            long r0 = r4.A03
            long r2 = r2 | r0
            r4.A03 = r2
        La1:
            boolean r0 = r10.A02
            if (r0 == 0) goto Lac
            r2 = 128(0x80, double:6.3E-322)
            long r0 = r4.A03
            long r2 = r2 | r0
            r4.A03 = r2
        Lac:
            return r4
        Lad:
            java.lang.String r7 = ""
            goto L1a
        Lb1:
            java.lang.String r1 = "Expected immutability"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39091ri.A00(com.facebook.flexiblesampling.SamplingResult, java.lang.Integer, java.lang.String, boolean):X.1rn");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.1rn, X.1rm] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.SvT, java.lang.Object] */
    public C39091ri(final Context context, C02Q c02q, InterfaceC39211ry interfaceC39211ry, C38141q1 c38141q1, InterfaceC38441qY interfaceC38441qY, final InterfaceC37451oi interfaceC37451oi, final InterfaceC37451oi interfaceC37451oi2, InterfaceC38361qQ interfaceC38361qQ, final InterfaceC38191q6 interfaceC38191q6, final InterfaceC38311qL interfaceC38311qL, final InterfaceC38311qL interfaceC38311qL2, InterfaceC39151rq interfaceC39151rq, InterfaceC39191rv interfaceC39191rv, final C0S0 c0s0, C38081ps c38081ps, C38131px c38131px, final C38201qA c38201qA, C38261qG c38261qG, C38071pr c38071pr, C38151q2 c38151q2, C38341qO c38341qO, final C38951rU c38951rU, C38961rV c38961rV, C37951pc c37951pc, C39161rr c39161rr, Class cls, final Class cls2, final Class cls3, final InterfaceC08830cm interfaceC08830cm) {
        C02Q c02q2 = c02q;
        InterfaceC38361qQ interfaceC38361qQ2 = interfaceC38361qQ;
        InterfaceC39211ry interfaceC39211ry2 = interfaceC39211ry;
        InterfaceC39191rv interfaceC39191rv2 = interfaceC39191rv;
        Class cls4 = cls;
        C39131rm.A01 = this;
        C39131rm c39131rm = C39131rm.A02;
        C39131rm c39131rm2 = c39131rm;
        if (c39131rm == null) {
            ?? c39141rn = new C39141rn();
            C39131rm.A02 = c39141rn;
            c39131rm2 = c39141rn;
        }
        this.A04 = c39131rm2;
        this.A02 = c02q == null ? new C12550kz(6) : c02q2;
        interfaceC38191q6.getClass();
        this.A07 = interfaceC38191q6;
        c0s0.getClass();
        this.A0K = c0s0;
        final C04060Jx c04060Jx = new C04060Jx();
        this.A09 = c04060Jx;
        this.A0C = c38261qG;
        this.A0H = c37951pc;
        this.A01 = c38151q2;
        this.A00 = interfaceC38441qY;
        context.getClass();
        this.A0L = context;
        this.A0E = c38341qO;
        this.A0D = c38071pr;
        c38081ps.getClass();
        this.A0A = c38081ps;
        this.A0B = c38131px;
        this.A08 = interfaceC39151rq;
        if (interfaceC38361qQ == null) {
            synchronized (C63895SvT.class) {
                if (C63895SvT.A03 == null) {
                    ?? obj = new Object();
                    obj.A02 = C09840fj.A00();
                    obj.A00 = 0;
                    obj.A01 = C05F.A00;
                    C63895SvT.A03 = obj;
                    c37951pc.A02.registerObserver(obj);
                }
                interfaceC38361qQ2 = C63895SvT.A03;
            }
        }
        this.A0I = c39161rr;
        this.A0G = c38961rV;
        this.A0F = c38951rU;
        this.A0J = interfaceC08830cm;
        if (interfaceC39211ry == null) {
            final Class cls5 = cls == null ? DefaultHandlerThreadFactory.class : cls4;
            final C39171rs c39171rs = new C39171rs(c38141q1, c04060Jx, c38081ps, c38131px, c38071pr);
            if (interfaceC39191rv == null) {
                final C39111rk c39111rk = A0P;
                final C39111rk c39111rk2 = A0N;
                interfaceC39191rv2 = new InterfaceC39191rv(c39111rk, c39111rk2) { // from class: X.1ru
                    public final C39111rk A00;
                    public final C39111rk A01;

                    @Override // X.InterfaceC39191rv
                    public final C39111rk Af2() {
                        return this.A00;
                    }

                    @Override // X.InterfaceC39191rv
                    public final C39111rk B7t() {
                        return this.A01;
                    }

                    {
                        this.A01 = c39111rk;
                        this.A00 = c39111rk2;
                    }
                };
            }
            final C39111rk c39111rk3 = A0O;
            final C39111rk c39111rk4 = A0M;
            final InterfaceC39191rv interfaceC39191rv3 = new InterfaceC39191rv(c39111rk3, c39111rk4) { // from class: X.1ru
                public final C39111rk A00;
                public final C39111rk A01;

                @Override // X.InterfaceC39191rv
                public final C39111rk Af2() {
                    return this.A00;
                }

                @Override // X.InterfaceC39191rv
                public final C39111rk B7t() {
                    return this.A01;
                }

                {
                    this.A01 = c39111rk3;
                    this.A00 = c39111rk4;
                }
            };
            final C38151q2 c38151q22 = this.A01;
            C37571ou c37571ou = c38341qO.A00;
            final boolean z = c37571ou.A1t;
            final long j = c37571ou.A0k;
            final int i = c37571ou.A0I;
            final InterfaceC38361qQ interfaceC38361qQ3 = interfaceC38361qQ2;
            final InterfaceC39191rv interfaceC39191rv4 = interfaceC39191rv2;
            interfaceC39211ry2 = new InterfaceC39211ry(context, interfaceC37451oi2, interfaceC37451oi, interfaceC38361qQ3, interfaceC38191q6, c39171rs, interfaceC38311qL2, interfaceC38311qL, interfaceC39191rv4, interfaceC39191rv3, c04060Jx, c0s0, c38201qA, c38151q22, c38951rU, cls3, cls2, cls5, interfaceC08830cm, i, j, z) { // from class: X.1rx
                public C39841t8 A00;
                public C72853Xp9 A01;
                public C72853Xp9 A02;
                public C39941tI A03;
                public final int A04;
                public final long A05;
                public final Context A06;
                public final InterfaceC37451oi A07;
                public final InterfaceC38361qQ A08;
                public final InterfaceC38191q6 A09;
                public final C39171rs A0A;
                public final InterfaceC38311qL A0B;
                public final InterfaceC39191rv A0C;
                public final C04060Jx A0D;
                public final C38201qA A0E;
                public final C38951rU A0F;
                public final Class A0G;
                public final boolean A0H;
                public final InterfaceC37451oi A0I;
                public final InterfaceC38311qL A0J;
                public final InterfaceC39191rv A0K;
                public final C0S0 A0L;
                public final C38151q2 A0M;
                public final Class A0N;
                public final Class A0O;
                public final InterfaceC08830cm A0P;

                private synchronized C39911tF A03(String str) {
                    return new C39911tF(this.A0O, this.A0N, this.A0G, ((InterfaceC38631qu) this.A0P.get()).getClass(), C05F.A00, str);
                }

                private synchronized C72853Xp9 A00() {
                    if (this.A02 == null) {
                        Context context2 = this.A06;
                        C39251s2 A00 = C39251s2.A00(context2);
                        Class cls6 = this.A0G;
                        HandlerThread ALb = A00.A04(cls6.getName()).ALb("Analytics-HighPri-Proc", 0);
                        Integer num = C05F.A00;
                        InterfaceC37451oi interfaceC37451oi3 = this.A0I;
                        InterfaceC38311qL interfaceC38311qL3 = this.A0J;
                        C39901tE c39901tE = new C39901tE(this.A0A);
                        C04060Jx c04060Jx2 = this.A0D;
                        C39911tF A03 = A03("ads");
                        InterfaceC38191q6 interfaceC38191q62 = this.A09;
                        InterfaceC39191rv interfaceC39191rv5 = this.A0K;
                        boolean z2 = this.A0H;
                        long j2 = this.A05;
                        int i2 = this.A04;
                        InterfaceC38361qQ interfaceC38361qQ4 = this.A08;
                        C38951rU c38951rU2 = this.A0F;
                        C72853Xp9 c72853Xp9 = new C72853Xp9(ALb, interfaceC37451oi3, interfaceC38311qL3, new C72818Xni(context2, interfaceC38361qQ4, interfaceC38191q62, interfaceC38311qL3, c39901tE, A03, interfaceC39191rv5, c04060Jx2, c38951rU2, cls6, "high", R.id.jobscheduler_analytics2_high_pri, i2, j2, z2), this.A0E, c38951rU2, num);
                        this.A02 = c72853Xp9;
                        c72853Xp9.A01(this.A00);
                    }
                    return this.A02;
                }

                private C72853Xp9 A01(long j2) {
                    C72853Xp9 c72853Xp9;
                    if (j2 == -2) {
                        return A00();
                    }
                    synchronized (this) {
                        if (this.A01 == null) {
                            Context context2 = this.A06;
                            C39251s2 A00 = C39251s2.A00(context2);
                            Class cls6 = this.A0G;
                            HandlerThread ALb = A00.A04(cls6.getName()).ALb("Analytics-NormalPri-Proc", 10);
                            Integer num = C05F.A01;
                            InterfaceC37451oi interfaceC37451oi3 = this.A07;
                            InterfaceC38311qL interfaceC38311qL3 = this.A0B;
                            C39901tE c39901tE = new C39901tE(this.A0A);
                            C04060Jx c04060Jx2 = this.A0D;
                            C39911tF A03 = A03("regular");
                            InterfaceC38191q6 interfaceC38191q62 = this.A09;
                            InterfaceC39191rv interfaceC39191rv5 = this.A0C;
                            boolean z2 = this.A0H;
                            long j3 = this.A05;
                            int i2 = this.A04;
                            InterfaceC38361qQ interfaceC38361qQ4 = this.A08;
                            C38951rU c38951rU2 = this.A0F;
                            C72853Xp9 c72853Xp92 = new C72853Xp9(ALb, interfaceC37451oi3, interfaceC38311qL3, new C72818Xni(context2, interfaceC38361qQ4, interfaceC38191q62, interfaceC38311qL3, c39901tE, A03, interfaceC39191rv5, c04060Jx2, c38951rU2, cls6, "normal", R.id.jobscheduler_analytics2_normal_pri, i2, j3, z2), this.A0E, c38951rU2, num);
                            this.A01 = c72853Xp92;
                            c72853Xp92.A01(this.A00);
                        }
                        c72853Xp9 = this.A01;
                    }
                    return c72853Xp9;
                }

                private synchronized C39941tI A02() {
                    HandlerThread A00;
                    C38151q2 c38151q23 = this.A0M;
                    C39861tA c39861tA = new C39861tA(c38151q23);
                    C39871tB c39871tB = new C39871tB(c38151q23);
                    C37571ou c37571ou2 = c38151q23.A02;
                    if (c37571ou2.A1q) {
                        A00 = null;
                    } else {
                        A00 = IGAnalytics2HandlerThreadFactory.A00(AbstractC37641p1.A00, "iga2_mb");
                    }
                    if (this.A03 == null) {
                        if (A00 == null) {
                            A00 = C39251s2.A00(this.A06).A04(this.A0G.getName()).ALb("Analytics-MicroBatch-Proc", 10);
                        }
                        InterfaceC37451oi interfaceC37451oi3 = this.A07;
                        InterfaceC37451oi interfaceC37451oi4 = this.A0I;
                        Context context2 = this.A06;
                        InterfaceC38311qL interfaceC38311qL3 = this.A0B;
                        C39901tE c39901tE = new C39901tE(this.A0A);
                        C04060Jx c04060Jx2 = this.A0D;
                        C39911tF A03 = A03("micro_batch");
                        Class cls6 = this.A0G;
                        C39921tG c39921tG = new C39921tG(this.A09, c39861tA, c39871tB, c37571ou2.A0l, c37571ou2.A0m, c37571ou2.A0E);
                        boolean z2 = this.A0H;
                        long j2 = this.A05;
                        int i2 = this.A04;
                        InterfaceC38361qQ interfaceC38361qQ4 = this.A08;
                        C38951rU c38951rU2 = this.A0F;
                        C39941tI c39941tI = new C39941tI(A00, interfaceC37451oi3, interfaceC37451oi4, interfaceC38311qL3, new C39931tH(context2, interfaceC38361qQ4, interfaceC38311qL3, c39901tE, A03, c39921tG, c04060Jx2, c38151q23, c38951rU2, cls6, i2, j2, z2), this.A0E, c38151q23, c38951rU2);
                        this.A03 = c39941tI;
                        c39941tI.Enc(this.A00);
                    }
                    return this.A03;
                }

                @Override // X.InterfaceC39221rz
                public final void CtZ(C39831t7 c39831t7) {
                    C72853Xp9 c72853Xp9 = this.A02;
                    if (c72853Xp9 != null) {
                        HandlerC72134XPg handlerC72134XPg = c72853Xp9.A05;
                        HandlerC72134XPg.A04(handlerC72134XPg);
                        handlerC72134XPg.sendMessage(handlerC72134XPg.obtainMessage(4, null));
                    }
                    C72853Xp9 c72853Xp92 = this.A01;
                    if (c72853Xp92 != null) {
                        HandlerC72134XPg handlerC72134XPg2 = c72853Xp92.A05;
                        HandlerC72134XPg.A04(handlerC72134XPg2);
                        handlerC72134XPg2.sendMessage(handlerC72134XPg2.obtainMessage(4, null));
                    }
                    C39941tI c39941tI = this.A03;
                    if (c39941tI != null) {
                        c39941tI.CtZ(c39831t7);
                    }
                }

                @Override // X.InterfaceC39221rz
                public final void E6E(C39851t9 c39851t9) {
                    long j2;
                    String str = c39851t9.A05;
                    C38151q2 c38151q23 = this.A0M;
                    C37851pO c37851pO = c38151q23.A03;
                    synchronized (c37851pO.A03) {
                        if (c37851pO.A02) {
                            if (c37851pO.A04.contains(str)) {
                                j2 = -2;
                                A01(j2).A00(c39851t9);
                            }
                        }
                    }
                    if (!c38151q23.A02.A1a) {
                        j2 = c39851t9.A00;
                        A01(j2).A00(c39851t9);
                    } else {
                        A02().E6E(c39851t9);
                    }
                }

                @Override // X.InterfaceC39221rz
                public final void E6F(C39851t9 c39851t9) {
                    boolean z2;
                    String str = c39851t9.A05;
                    C38151q2 c38151q23 = this.A0M;
                    C37851pO c37851pO = c38151q23.A03;
                    synchronized (c37851pO.A03) {
                        if (c37851pO.A02) {
                            if (c37851pO.A04.contains(str)) {
                                A00().A00(c39851t9);
                                return;
                            }
                        }
                    }
                    if (!c38151q23.A02.A1a) {
                        HandlerC72134XPg handlerC72134XPg = A01(c39851t9.A00).A05;
                        String str2 = c39851t9.A06;
                        C0CA c0ca = c39851t9.A03;
                        HandlerC72134XPg.A05(handlerC72134XPg, c0ca, "event.queued", str, str2);
                        InterfaceC38311qL interfaceC38311qL3 = handlerC72134XPg.A09.A03;
                        if (interfaceC38311qL3.B1R()) {
                            synchronized (handlerC72134XPg.A07) {
                                Y11 y11 = handlerC72134XPg.A01;
                                if (y11 != null && !y11.A03 && y11.A04.length > y11.A01) {
                                    z2 = false;
                                } else {
                                    int AbZ = interfaceC38311qL3.AbZ();
                                    synchronized (Y11.A06) {
                                        try {
                                            y11 = Y11.A05;
                                            if (y11 != null) {
                                                Y11.A05 = y11.A02;
                                                y11.A02 = null;
                                            } else {
                                                y11 = new Y11(AbZ);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    handlerC72134XPg.A01 = y11;
                                    z2 = true;
                                }
                                if (!y11.A03) {
                                    C0CA[] c0caArr = y11.A04;
                                    int length = c0caArr.length;
                                    int i2 = y11.A01;
                                    if (length > i2) {
                                        c0caArr[i2] = c0ca;
                                        y11.A01 = i2 + 1;
                                        if (z2) {
                                            handlerC72134XPg.sendMessage(handlerC72134XPg.obtainMessage(1, 2, 0, y11));
                                        }
                                    }
                                }
                                throw new IllegalStateException("Batch cannot accept more events");
                            }
                            return;
                        }
                        handlerC72134XPg.sendMessage(handlerC72134XPg.obtainMessage(1, 1, 0, c39851t9));
                        return;
                    }
                    A02().E6F(c39851t9);
                }

                @Override // X.InterfaceC39211ry
                public final SamplingResult Eiw(String str) {
                    SamplingResult samplingResult = SamplingResult.A05;
                    if (samplingResult == null) {
                        SamplingResult samplingResult2 = new SamplingResult(0L, 1, true, false, false);
                        SamplingResult.A05 = samplingResult2;
                        return samplingResult2;
                    }
                    return samplingResult;
                }

                @Override // X.InterfaceC39221rz
                public final void Enc(C39841t8 c39841t8) {
                    this.A00 = c39841t8;
                    C72853Xp9 c72853Xp9 = this.A02;
                    if (c72853Xp9 != null) {
                        c72853Xp9.A01(c39841t8);
                    }
                    C72853Xp9 c72853Xp92 = this.A01;
                    if (c72853Xp92 != null) {
                        c72853Xp92.A01(c39841t8);
                    }
                    C39941tI c39941tI = this.A03;
                    if (c39941tI != null) {
                        c39941tI.Enc(c39841t8);
                    }
                }

                @Override // X.InterfaceC39221rz
                public final void F8b() {
                    C72853Xp9 c72853Xp9 = this.A02;
                    if (c72853Xp9 != null) {
                        HandlerC72134XPg handlerC72134XPg = c72853Xp9.A05;
                        HandlerC72134XPg.A04(handlerC72134XPg);
                        handlerC72134XPg.sendMessage(handlerC72134XPg.obtainMessage(9));
                    }
                    C72853Xp9 c72853Xp92 = this.A01;
                    if (c72853Xp92 != null) {
                        HandlerC72134XPg handlerC72134XPg2 = c72853Xp92.A05;
                        HandlerC72134XPg.A04(handlerC72134XPg2);
                        handlerC72134XPg2.sendMessage(handlerC72134XPg2.obtainMessage(9));
                    }
                    C39941tI c39941tI = this.A03;
                    if (c39941tI != null) {
                        c39941tI.F8b();
                    }
                }

                {
                    this.A06 = context;
                    this.A0O = cls3;
                    this.A07 = interfaceC37451oi2;
                    this.A0I = interfaceC37451oi;
                    this.A0N = cls2;
                    this.A0G = cls5;
                    this.A0A = c39171rs;
                    this.A0D = c04060Jx;
                    this.A09 = interfaceC38191q6;
                    this.A0C = interfaceC39191rv4;
                    this.A0K = interfaceC39191rv3;
                    this.A0B = interfaceC38311qL2;
                    this.A0J = interfaceC38311qL;
                    this.A0M = c38151q22;
                    this.A0E = c38201qA;
                    this.A0H = z;
                    this.A05 = j;
                    this.A04 = i;
                    this.A08 = interfaceC38361qQ3;
                    this.A0P = interfaceC08830cm;
                    this.A0F = c38951rU;
                    this.A0L = c0s0;
                }
            };
        }
        this.A03 = interfaceC39211ry2;
        C39231s0 c39231s0 = new C39231s0(context, interfaceC39211ry2, interfaceC37451oi, c38951rU, c38961rV, c39161rr, cls == null ? DefaultHandlerThreadFactory.class : cls4);
        this.A05 = c39231s0;
        this.A06 = new C39701st(c39231s0, interfaceC38361qQ2, c37951pc, c38341qO.A00.A1j);
        c37951pc.A02.registerObserver(new InterfaceC37991pg(context) { // from class: X.1su
            public final Context A00;

            @Override // X.InterfaceC37991pg
            public final void Cyz() {
            }

            @Override // X.InterfaceC37991pg
            public final void DI6() {
            }

            {
                this.A00 = context;
            }
        });
    }
}
