package com.instagram.casper;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC003100w;
import X.AbstractC06950Ym;
import X.AbstractC108254uC;
import X.AbstractC14350nz;
import X.AbstractC23021Ah;
import X.AbstractC23641Du;
import X.AbstractC50712Us;
import X.AbstractC55167OdV;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass523;
import X.AnonymousClass524;
import X.AnonymousClass529;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0o0;
import X.C108284uF;
import X.C1116951r;
import X.C12M;
import X.C14360o3;
import X.C15900qk;
import X.C18240vB;
import X.C18U;
import X.C19K;
import X.C19L;
import X.C1CC;
import X.C1QO;
import X.C206629Ct;
import X.C218914p;
import X.C2KW;
import X.C2OJ;
import X.C49506LuJ;
import X.C52A;
import X.C52B;
import X.C52C;
import X.C52D;
import X.C52F;
import X.C52G;
import X.C52H;
import X.C55772hI;
import X.C57167PZl;
import X.C57214Pay;
import X.C57233PbH;
import X.EnumC220415e;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC14020nS;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.L7O;
import X.L9P;
import X.LK0;
import X.MBT;
import X.MCK;
import X.NMF;
import X.NMG;
import X.NMK;
import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class IgSignalsCasper implements InterfaceC12870lZ, InterfaceC13000lm {
    public static boolean A09;
    public NMG A00;
    public IgSignalsDcpPredictor A01;
    public final Context A02;
    public final C52D A03;
    public final C52A A04;
    public final UserSession A05;
    public final InterfaceC14020nS A06;
    public final InterfaceC16820sZ A07;
    public final C19L A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.NMG, X.52C] */
    private final NMG A00() {
        long j;
        Integer num;
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        NMF nmf;
        Number number;
        C108284uF c108284uF = this.A04.A00;
        if (c108284uF == null) {
            C14360o3.A0F("productCore");
            throw C00O.createAndThrow();
        }
        AbstractC55167OdV abstractC55167OdV = (AbstractC55167OdV) c108284uF.A06.invoke("on_start");
        abstractC55167OdV.A00 = c108284uF;
        NMK nmk = (NMK) abstractC55167OdV;
        C52D c52d = this.A03;
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        long longValue = ((Number) interfaceC16820sZ.invoke()).longValue();
        C14360o3.A0B(nmk, 0);
        nmk.A0a.A01(Long.valueOf(((Number) c52d.A04.getValue()).longValue()));
        NMF nmf2 = nmk.A0R;
        Context context = c52d.A01;
        if (context != null) {
            C15900qk.A01();
            j = C15900qk.A00(context, false) / 1048576;
        } else {
            j = -1;
        }
        nmf2.A01(Long.valueOf(j));
        nmk.A0e.A01(Integer.valueOf(((Number) c52d.A05.getValue()).intValue()));
        nmk.A0Z.A01(Integer.valueOf(((Number) c52d.A03.getValue()).intValue()));
        NMF nmf3 = nmk.A0X;
        UserSession userSession = c52d.A02;
        String str = C55772hI.A00(userSession).A05;
        if (str != null) {
            if (str.equals(C1QO.A0C.toString())) {
                num = C05F.A01;
            } else if (str.equals(C1QO.A09.toString())) {
                num = C05F.A0C;
            } else if (!str.equals(C1QO.A0A.toString()) && !str.equals(C1QO.A0G.toString())) {
                if (str.equals(C1QO.A0B.toString())) {
                    num = C05F.A0Y;
                } else {
                    num = C05F.A0j;
                }
            } else {
                num = C05F.A0N;
            }
        } else {
            num = C05F.A00;
        }
        switch (num.intValue()) {
            case 0:
                i = -1;
                break;
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        nmf3.A01(Integer.valueOf(i));
        TimeZone timeZone = TimeZone.getDefault();
        Calendar calendar = Calendar.getInstance(timeZone);
        timeZone.getOffset(calendar.getTimeInMillis());
        calendar.setTime(new Date(longValue));
        double d = calendar.get(7);
        double d2 = calendar.get(11);
        double d3 = calendar.get(12);
        nmk.A0d.A01(Double.valueOf(d));
        nmk.A0b.A01(Double.valueOf(d2));
        nmk.A0c.A01(Double.valueOf((d * 24.0d * 60.0d) + (d2 * 60.0d) + d3));
        List A0a = AbstractC001800i.A0a(new L9P(AbstractC23021Ah.A00(userSession)).A02());
        long j6 = longValue / 1000;
        ArrayList arrayList = new ArrayList();
        for (Object obj : A0a) {
            if (((Number) obj).longValue() > j6) {
                arrayList.add(obj);
            }
        }
        List A0d = AbstractC001800i.A0d(arrayList, 5);
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A0d, 10));
        Iterator it = A0d.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf((((Number) it.next()).longValue() - j6) / 60));
        }
        NMF nmf4 = nmk.A0S;
        Number number2 = (Number) AbstractC001800i.A0O(arrayList2, 0);
        long j7 = -1;
        if (number2 != null) {
            j2 = number2.longValue();
        } else {
            j2 = -1;
        }
        nmf4.A01(Long.valueOf(j2));
        NMF nmf5 = nmk.A0T;
        Number number3 = (Number) AbstractC001800i.A0O(arrayList2, 1);
        if (number3 != null) {
            j3 = number3.longValue();
        } else {
            j3 = -1;
        }
        nmf5.A01(Long.valueOf(j3));
        NMF nmf6 = nmk.A0U;
        Number number4 = (Number) AbstractC001800i.A0O(arrayList2, 2);
        if (number4 != null) {
            j4 = number4.longValue();
        } else {
            j4 = -1;
        }
        nmf6.A01(Long.valueOf(j4));
        NMF nmf7 = nmk.A0V;
        Number number5 = (Number) AbstractC001800i.A0O(arrayList2, 3);
        if (number5 != null) {
            j5 = number5.longValue();
        } else {
            j5 = -1;
        }
        nmf7.A01(Long.valueOf(j5));
        NMF nmf8 = nmk.A0W;
        Number number6 = (Number) AbstractC001800i.A0O(arrayList2, 4);
        if (number6 != null) {
            j7 = number6.longValue();
        }
        nmf8.A01(Long.valueOf(j7));
        nmk.A02.A01(Integer.valueOf(C2OJ.A00().A00(context)));
        nmk.A0Y.A01(Integer.valueOf(c52d.A00));
        AnonymousClass523 anonymousClass523 = C1CC.A03;
        if (anonymousClass523 != null) {
            LK0 lk0 = new LK0();
            AbstractC23641Du.A05(AnonymousClass191.A00, new C57167PZl(anonymousClass523, lk0, null, 4), anonymousClass523.A04);
            try {
                lk0.A01.await();
            } catch (InterruptedException unused) {
            }
            Object obj2 = lk0.A00;
            C14360o3.A07(obj2);
            Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar2.setTimeInMillis(longValue);
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            long timeInMillis = calendar2.getTimeInMillis();
            long j8 = timeInMillis - 86400000;
            long j9 = j8 - 86400000;
            long j10 = j9 - 86400000;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            long j20 = 0;
            long j21 = 0;
            long j22 = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (AnonymousClass524 anonymousClass524 : (List) obj2) {
                long j23 = anonymousClass524.A01;
                if (j23 <= longValue) {
                    if (timeInMillis <= j23) {
                        i2++;
                        j11 += anonymousClass524.A00;
                    } else if (j8 <= j23 && j23 < timeInMillis) {
                        i3++;
                        j13 += anonymousClass524.A00;
                    } else if (j9 <= j23 && j23 < j8) {
                        i4++;
                        j12 += anonymousClass524.A00;
                    } else if (j10 <= j23 && j23 < j9) {
                        i12++;
                        j20 += anonymousClass524.A00;
                    }
                    if (j23 >= longValue - 3600000) {
                        i5++;
                        i6++;
                        i7++;
                        i8++;
                        i9++;
                        i10++;
                        i11++;
                        long j24 = anonymousClass524.A00;
                        j14 += j24;
                        j15 += j24;
                        j16 += j24;
                    } else if (j23 >= longValue - 7200000) {
                        i5++;
                        i6++;
                        i7++;
                        i8++;
                        i9++;
                        i10++;
                        i11++;
                        j15 += anonymousClass524.A00;
                    } else {
                        if (j23 >= longValue - 28800000) {
                            i6++;
                        } else if (j23 < longValue - 43200000) {
                            if (j23 >= longValue - 86400000) {
                                i8++;
                                i9++;
                                i10++;
                                i11++;
                                j18 += anonymousClass524.A00;
                                j19 += anonymousClass524.A00;
                                j21 += anonymousClass524.A00;
                                j22 += anonymousClass524.A00;
                            } else if (j23 >= longValue - 172800000) {
                                i9++;
                                i10++;
                                i11++;
                                j19 += anonymousClass524.A00;
                                j21 += anonymousClass524.A00;
                                j22 += anonymousClass524.A00;
                            } else if (j23 >= longValue - 432000000) {
                                i10++;
                                i11++;
                                j21 += anonymousClass524.A00;
                                j22 += anonymousClass524.A00;
                            } else if (j23 >= longValue - 604800000) {
                                i11++;
                                j22 += anonymousClass524.A00;
                            }
                        }
                        i7++;
                        i8++;
                        i9++;
                        i10++;
                        i11++;
                    }
                    j17 += anonymousClass524.A00;
                    j18 += anonymousClass524.A00;
                    j19 += anonymousClass524.A00;
                    j21 += anonymousClass524.A00;
                    j22 += anonymousClass524.A00;
                }
            }
            nmk.A04.A01(Integer.valueOf(i5));
            nmk.A07.A01(Integer.valueOf(i6));
            nmk.A0A.A01(Integer.valueOf(i7));
            nmk.A05.A01(Integer.valueOf(i8));
            nmk.A06.A01(Integer.valueOf(i9));
            nmk.A09.A01(Integer.valueOf(i10));
            nmk.A03.A01(Integer.valueOf(i11));
            nmk.A0K.A01(Long.valueOf(j14));
            nmk.A0G.A01(Long.valueOf(j15));
            nmk.A0J.A01(Long.valueOf(j16));
            nmk.A0M.A01(Long.valueOf(j17));
            nmk.A0H.A01(Long.valueOf(j18));
            nmk.A0I.A01(Long.valueOf(j19));
            nmk.A0L.A01(Long.valueOf(j21));
            nmk.A0F.A01(Long.valueOf(j22));
            nmk.A0B.A01(Integer.valueOf(i2));
            nmk.A0C.A01(Integer.valueOf(i3));
            nmk.A0D.A01(Integer.valueOf(i4));
            nmk.A0E.A01(Integer.valueOf(i12));
            nmk.A0N.A01(Long.valueOf(j11));
            nmk.A0O.A01(Long.valueOf(j13));
            nmk.A0P.A01(Long.valueOf(j12));
            nmf = nmk.A0Q;
            number = Long.valueOf(j20);
        } else {
            nmf = nmk.A03;
            number = -1;
        }
        nmf.A01(number);
        long longValue2 = ((Number) interfaceC16820sZ.invoke()).longValue();
        NMG nmg = nmk.A01;
        NMG nmg2 = nmg;
        if (nmg == null) {
            String str2 = ((AbstractC55167OdV) nmk).A02;
            double d4 = ((AbstractC55167OdV) nmk).A01;
            ArrayList A03 = AbstractC55167OdV.A03(nmk);
            C14360o3.A0B(A03, 3);
            ?? c52c = new C52C(str2, A03, d4, longValue2);
            nmk.A05(c52c);
            nmk.A00 = c52c;
            nmk.A01 = c52c;
            nmg2 = c52c;
        }
        this.A00 = nmg2;
        return nmg2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.casper.IgSignalsCasper r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 17
            boolean r0 = X.MAG.A01(r9, r3)
            if (r0 == 0) goto L58
            r7 = r9
            X.MAG r7 = (X.MAG) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L5e
            java.lang.Object r4 = r7.A01
            X.52C r4 = (X.C52C) r4
            X.AbstractC09560e7.A00(r1)
        L28:
            r4.A01()
            X.0eB r0 = X.C0eB.A00
            return r0
        L2e:
            X.AbstractC09560e7.A00(r1)
            X.NMG r4 = r8.A00()
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r0 = r8.A01
            if (r0 == 0) goto L3c
            r0.A01()
        L3c:
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36329711017869816(0x8111ae000341f8, double:3.038393763480693E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L28
            X.B9B r0 = X.B9B.A00
            r7.A01 = r4
            r7.A00 = r5
            java.lang.Object r0 = r8.A02(r7, r0)
            if (r0 != r6) goto L28
            return r6
        L58:
            X.MAG r7 = new X.MAG
            r7.<init>(r8, r9, r3)
            goto L16
        L5e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.casper.IgSignalsCasper.A01(com.instagram.casper.IgSignalsCasper, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.51t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r10, X.InterfaceC16660sJ r11) {
        /*
            r9 = this;
            r3 = 26
            boolean r0 = X.MAL.A01(r10, r3)
            if (r0 == 0) goto L91
            r4 = r10
            X.MAL r4 = (X.MAL) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A04
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L6f
            if (r1 != r0) goto L97
            java.lang.Object r7 = r4.A03
            X.51t r7 = (X.AbstractC1117051t) r7
            java.lang.Object r11 = r4.A02
            X.0sJ r11 = (X.InterfaceC16660sJ) r11
            java.lang.Object r8 = r4.A01
            com.instagram.casper.IgSignalsCasper r8 = (com.instagram.casper.IgSignalsCasper) r8
            X.AbstractC09560e7.A00(r3)
        L30:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L86
            X.NMG r6 = r8.A00
            if (r6 == 0) goto L6a
            long r4 = r6.A03
            X.0sZ r0 = r8.A07
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r0 = 15000(0x3a98, double:7.411E-320)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6a
        L51:
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.OIt r2 = new X.OIt
            r2.<init>(r6, r6, r7)
            r1 = 7
            X.MLv r0 = new X.MLv
            r0.<init>(r11, r1)
            r2.A00 = r0
            X.4uG r0 = r2.A02
            r0.ELI(r2)
        L67:
            X.0eB r2 = X.C0eB.A00
        L69:
            return r2
        L6a:
            X.NMG r6 = r8.A00()
            goto L51
        L6f:
            X.AbstractC09560e7.A00(r3)
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r7 = r9.A01
            if (r7 == 0) goto L86
            r4.A01 = r9
            r4.A02 = r11
            r4.A03 = r7
            r4.A00 = r0
            java.lang.Object r3 = r7.A04(r4)
            if (r3 == r2) goto L69
            r8 = r9
            goto L30
        L86:
            r1 = -1
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r11.invoke(r0)
            goto L67
        L91:
            X.MAL r4 = new X.MAL
            r4.<init>(r9, r10, r3)
            goto L16
        L97:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.casper.IgSignalsCasper.A02(X.1Ds, X.0sJ):java.lang.Object");
    }

    public final void A03(InterfaceC16660sJ interfaceC16660sJ) {
        if (this.A01 != null) {
            C19L c19l = this.A08;
            AbstractC23641Du.A05(AnonymousClass191.A00, new MCK(interfaceC16660sJ, this, (InterfaceC23621Ds) null, 16), c19l);
            return;
        }
        interfaceC16660sJ.invoke(-1L);
    }

    public /* synthetic */ IgSignalsCasper(Context context, UserSession userSession) {
        Integer num;
        long j;
        Long A0k;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "IgSignalsCasper";
        C18240vB c18240vB = new C18240vB(A00);
        C19K A02 = AnonymousClass194.A02(new C12M(c18240vB).AOT(109120473, 3));
        AnonymousClass529 anonymousClass529 = AnonymousClass529.A00;
        C52B c52b = C52A.A04;
        C14360o3.A0B(userSession, 0);
        C52A c52a = new C52A(userSession);
        c52a.A00 = AbstractC108254uC.A00(userSession).A00(c52a, new C57214Pay(c52b), new C57233PbH(c52b));
        C14360o3.A0B(A02, 4);
        C14360o3.A0B(anonymousClass529, 5);
        this.A05 = userSession;
        this.A02 = context;
        this.A06 = c18240vB;
        this.A08 = A02;
        this.A07 = anonymousClass529;
        this.A04 = c52a;
        this.A00 = null;
        this.A03 = new C52D(userSession, context);
        C218914p.A03(EnumC220415e.A03, this);
        C52F c52f = new C52F(userSession);
        C108284uF c108284uF = c52a.A00;
        if (c108284uF != null) {
            c108284uF.A00 = c52f;
            C06090Tz c06090Tz = C06090Tz.A06;
            int A01 = (int) C18U.A01(c06090Tz, userSession, 36611185994438915L);
            if (A01 > 0 && AbstractC50712Us.A01.A06(0, A01) == 0) {
                C49506LuJ c49506LuJ = new C49506LuJ(userSession);
                C108284uF c108284uF2 = c52a.A00;
                if (c108284uF2 != null) {
                    c108284uF2.A03.add(c49506LuJ);
                }
            }
            String A04 = C18U.A04(c06090Tz, userSession, 36892660971209674L);
            long A012 = C18U.A01(c06090Tz, userSession, 36611185994635524L);
            if (A012 == 1) {
                num = C05F.A00;
            } else if (A012 == 2) {
                num = C05F.A01;
            } else if (A012 == 3) {
                num = C05F.A0C;
            } else {
                num = null;
            }
            if (A04.length() > 0 && num != null) {
                List A0R = AbstractC001900j.A0R(A04, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
                if (A0R.size() == 3) {
                    String str = (String) AbstractC001800i.A0O(A0R, 0);
                    str = str == null ? "undefined" : str;
                    String str2 = (String) AbstractC001800i.A0O(A0R, 1);
                    str2 = str2 == null ? "undefined" : str2;
                    String str3 = (String) AbstractC001800i.A0O(A0R, 2);
                    if (str3 != null && (A0k = AbstractC003100w.A0k(10, str3)) != null) {
                        j = A0k.longValue();
                    } else {
                        j = 0;
                    }
                    C52G.A00(num);
                    IgSignalsDcpPredictor igSignalsDcpPredictor = new IgSignalsDcpPredictor(userSession, new C1116951r(j, str, str2), num);
                    this.A01 = igSignalsDcpPredictor;
                    L7O A002 = C52H.A00(C18U.A04(C06090Tz.A05, userSession, 36892660971406283L));
                    if (A002 != null) {
                        List list = igSignalsDcpPredictor.A04;
                        if (list.size() < 1) {
                            list.add(A002);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C14360o3.A0F("productCore");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-102566291);
        C52D c52d = this.A03;
        c52d.A00 = C2KW.A00(c52d.A02).A00.A02;
        C19L c19l = this.A08;
        AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(this, null, 12), c19l);
        C0f9.A0A(302919485, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(910529308);
        C19L c19l = this.A08;
        C206629Ct c206629Ct = new C206629Ct(this, null, 11);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
        C0f9.A0A(1281018058, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
