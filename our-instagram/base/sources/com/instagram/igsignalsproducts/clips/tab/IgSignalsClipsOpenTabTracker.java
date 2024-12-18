package com.instagram.igsignalsproducts.clips.tab;

import X.A7T;
import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC003100w;
import X.AbstractC108254uC;
import X.AbstractC14350nz;
import X.AbstractC23641Du;
import X.AbstractC50712Us;
import X.AbstractC54792fc;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C00O;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C0o0;
import X.C108194u6;
import X.C108214u8;
import X.C108224u9;
import X.C108244uB;
import X.C108284uF;
import X.C108304uH;
import X.C1116951r;
import X.C12M;
import X.C14360o3;
import X.C16930sl;
import X.C18240vB;
import X.C18U;
import X.C19K;
import X.C19L;
import X.C206629Ct;
import X.C206649Cv;
import X.C218914p;
import X.C220549oe;
import X.C22977ABb;
import X.C49506LuJ;
import X.C52G;
import X.C52H;
import X.EnumC220415e;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC14020nS;
import X.InterfaceC16820sZ;
import X.L7O;
import X.MTL;
import X.MTM;
import X.PZS;
import android.os.Handler;
import android.os.Looper;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import java.util.List;

/* loaded from: classes2.dex */
public final class IgSignalsClipsOpenTabTracker implements InterfaceC12870lZ, InterfaceC13000lm {
    public int A00;
    public long A01;
    public IgSignalsDcpPredictor A02;
    public C220549oe A03;
    public A7T A04;
    public C22977ABb A05;
    public boolean A06;
    public final Handler A07;
    public final UserSession A08;
    public final InterfaceC14020nS A09;
    public final C108224u9 A0A;
    public final C108304uH A0B;
    public final C108194u6 A0C;
    public final InterfaceC16820sZ A0D;
    public final C19L A0E;

    public final void A02(Integer num) {
        num.intValue();
        C22977ABb c22977ABb = this.A05;
        if (c22977ABb != null) {
            c22977ABb.A00 = ((Number) this.A0D.invoke()).longValue() - c22977ABb.A02;
            c22977ABb.A01 = num;
            this.A0C.A01(c22977ABb);
            this.A05 = null;
            return;
        }
        Integer num2 = C05F.A00;
        if (num == num2) {
            C108194u6 c108194u6 = this.A0C;
            C108194u6.A00(c108194u6);
            List list = c108194u6.A00;
            if (list == null) {
                list = C16930sl.A00;
            }
            C22977ABb c22977ABb2 = (C22977ABb) AbstractC001800i.A0L(list);
            if (c22977ABb2 != null && c22977ABb2.A01 == C05F.A01) {
                c22977ABb2.A00 += ((int) (((Number) this.A0D.invoke()).longValue() - this.A01)) + this.A00;
                c22977ABb2.A01 = num2;
                c108194u6.A01(c22977ABb2);
            }
        }
        this.A00 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.51t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r7, X.InterfaceC16660sJ r8) {
        /*
            r6 = this;
            r3 = 14
            boolean r0 = X.C206489Cf.A00(r7, r3)
            if (r0 == 0) goto L7c
            r4 = r7
            X.9Cf r4 = (X.C206489Cf) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r5 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L56
            if (r0 != r2) goto L82
            java.lang.Object r1 = r4.A03
            X.51t r1 = (X.AbstractC1117051t) r1
            java.lang.Object r8 = r4.A02
            X.0sJ r8 = (X.InterfaceC16660sJ) r8
            java.lang.Object r4 = r4.A01
            com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker r4 = (com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker) r4
            X.AbstractC09560e7.A00(r5)
        L30:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r0 = r5.booleanValue()
            if (r0 == 0) goto L71
            X.9oe r3 = r4.A03
            if (r3 == 0) goto L53
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.OIt r2 = new X.OIt
            r2.<init>(r3, r3, r1)
            r1 = 41
            X.9FO r0 = new X.9FO
            r0.<init>(r1, r4, r3, r8)
            r2.A00 = r0
            X.4uG r0 = r2.A02
            r0.ELI(r2)
        L53:
            X.0eB r3 = X.C0eB.A00
        L55:
            return r3
        L56:
            X.AbstractC09560e7.A00(r5)
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r1 = r6.A02
            if (r1 == 0) goto L71
            X.9oe r0 = r6.A03
            if (r0 == 0) goto L71
            r4.A01 = r6
            r4.A02 = r8
            r4.A03 = r1
            r4.A00 = r2
            java.lang.Object r5 = r1.A04(r4)
            if (r5 == r3) goto L55
            r4 = r6
            goto L30
        L71:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r0 = new java.lang.Double
            r0.<init>(r1)
            r8.invoke(r0)
            goto L53
        L7c:
            X.9Cf r4 = new X.9Cf
            r4.<init>(r6, r7, r3)
            goto L16
        L82:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igsignalsproducts.clips.tab.IgSignalsClipsOpenTabTracker.A00(X.1Ds, X.0sJ):java.lang.Object");
    }

    public final void A01() {
        C19L c19l = this.A0E;
        C206629Ct c206629Ct = new C206629Ct(this, null, 27);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
    }

    public /* synthetic */ IgSignalsClipsOpenTabTracker(UserSession userSession) {
        Integer num;
        long j;
        Long A0k;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "IgSignalsClipsOpenTab";
        C18240vB c18240vB = new C18240vB(A00);
        C19K A02 = AnonymousClass194.A02(new C12M(c18240vB).AOT(507027573, 3));
        C108194u6 c108194u6 = new C108194u6(userSession);
        C108214u8 c108214u8 = C108214u8.A00;
        AbstractC54792fc.A06(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A02, 3);
        C14360o3.A0B(c108214u8, 5);
        this.A08 = userSession;
        this.A09 = c18240vB;
        this.A0E = A02;
        this.A0C = c108194u6;
        this.A0D = c108214u8;
        this.A01 = -1L;
        C108244uB c108244uB = C108224u9.A04;
        C108224u9 c108224u9 = new C108224u9(userSession);
        c108224u9.A00 = AbstractC108254uC.A00(userSession).A00(c108224u9, new MTM(c108244uB), new MTL(c108244uB));
        this.A0A = c108224u9;
        this.A0B = new C108304uH(userSession, c108194u6);
        this.A07 = new Handler(Looper.getMainLooper());
        C108284uF c108284uF = c108224u9.A00;
        if (c108284uF != null) {
            c108284uF.A00 = c108194u6;
            C218914p.A03(EnumC220415e.A03, this);
            C06090Tz c06090Tz = C06090Tz.A05;
            int A01 = (int) C18U.A01(c06090Tz, userSession, 36611267598817544L);
            if (A01 > 0 && AbstractC50712Us.A01.A06(0, A01) == 0) {
                C49506LuJ c49506LuJ = new C49506LuJ(userSession);
                C108284uF c108284uF2 = c108224u9.A00;
                if (c108284uF2 != null) {
                    c108284uF2.A03.add(c49506LuJ);
                }
            }
            String A04 = C18U.A04(c06090Tz, userSession, 36892742575588305L);
            long A012 = C18U.A01(c06090Tz, userSession, 36611267599014153L);
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
                    this.A02 = igSignalsDcpPredictor;
                    L7O A002 = C52H.A00(C18U.A04(c06090Tz, userSession, 36892742575784914L));
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
        int A03 = C0f9.A03(1307504408);
        C19L c19l = this.A0E;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZS(this, null, 11), c19l);
        C0f9.A0A(1117969150, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1696149590);
        C19L c19l = this.A0E;
        C206649Cv c206649Cv = new C206649Cv(this, null, 24);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
        C0f9.A0A(1979564557, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        C19L c19l = this.A0E;
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZS(this, null, 12), c19l);
    }
}
