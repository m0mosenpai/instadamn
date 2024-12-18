package com.instagram.igsignalsproducts.ttnc;

import X.AbstractC1117051t;
import X.AbstractC166987dD;
import X.AbstractC201688vy;
import X.AbstractC25227BEk;
import X.AbstractC37302Gc3;
import X.AbstractC55167OdV;
import X.C05F;
import X.C0eB;
import X.C0f9;
import X.C19L;
import X.C218914p;
import X.C41018IEn;
import X.C51959Mxg;
import X.C51u;
import X.C54967OSx;
import X.C54986OTu;
import X.C55134Oc1;
import X.InterfaceC09390do;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC14020nS;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC57950Pmw;
import X.MBs;
import X.MSX;
import X.MSZ;
import X.NMI;
import X.NML;
import X.NMO;
import X.OAJ;
import X.OIS;
import X.PZ5;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes9.dex */
public final class IgSignalsTtncEstimator implements InterfaceC12870lZ, InterfaceC13000lm {
    public AbstractC1117051t A00;
    public C55134Oc1 A01;
    public NMO A02;
    public boolean A03;
    public boolean A04;
    public final double A05;
    public final long A06;
    public final UserSession A07;
    public final InterfaceC14020nS A08;
    public final InterfaceC57950Pmw A09;
    public final C54967OSx A0A;
    public final OIS A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC16820sZ A0D;
    public final C19L A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final void A03() {
        long A0E = MSZ.A0E(this.A0D);
        AbstractC166987dD.A1Z(new MBs(this, (InterfaceC23621Ds) null, 20, A0E), this.A0E);
    }

    public final void A04() {
        long A0E = MSZ.A0E(this.A0D);
        AbstractC166987dD.A1Z(new MBs(this, (InterfaceC23621Ds) null, 21, A0E), this.A0E);
    }

    public final void A05(Integer num, boolean z) {
        long A0E = MSZ.A0E(this.A0D);
        AbstractC166987dD.A1Z(new PZ5(this, num, null, A0E, z), this.A0E);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x006b, code lost:
    
        if (r14 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IgSignalsTtncEstimator(com.instagram.common.session.UserSession r17) {
        /*
            r16 = this;
            X.OIS r10 = new X.OIS
            r9 = r17
            r10.<init>(r9)
            r13 = 0
            android.content.Context r0 = X.AbstractC12290kX.A00
            X.OSx r8 = new X.OSx
            r8.<init>(r0)
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36603240304939940(0x820a74000113a4, double:3.2113747860378725E-306)
            int r2 = X.AbstractC25225BEi.A07(r7, r9, r0)
            if (r2 <= 0) goto Lc9
            r1 = 0
            X.2Us r0 = X.AbstractC50712Us.A01
            int r0 = r0.A06(r1, r2)
            if (r0 != 0) goto Lc9
            X.P3Z r6 = new X.P3Z
            r6.<init>(r9)
        L2a:
            r0 = 36321765328299834(0x810a740002273a, double:3.0333688774019125E-306)
            boolean r14 = X.C18U.A06(r7, r9, r0)
            r0 = 36603240305136549(0x820a74000413a5, double:3.211374786162209E-306)
            X.C18U.A01(r7, r9, r0)
            r0 = 36321765329020734(0x810a74000d273e, double:3.0333688778578125E-306)
            boolean r12 = X.C18U.A06(r7, r9, r0)
            r0 = 36321765329217344(0x810a7400102740, double:3.0333688779821495E-306)
            boolean r11 = X.C18U.A06(r7, r9, r0)
            r0 = 37166190259012014(0x840a74000b01ae, double:3.567386603810569E-306)
            double r4 = X.C18U.A00(r7, r9, r0)
            r0 = 36603240305660840(0x820a74000c13a8, double:3.2113747864937725E-306)
            long r2 = X.C18U.A01(r7, r9, r0)
            r0 = 36321765328365371(0x810a740003273b, double:3.0333688774433583E-306)
            boolean r0 = X.C18U.A06(r7, r9, r0)
            if (r0 != 0) goto L6d
            r15 = 0
            if (r14 == 0) goto L6e
        L6d:
            r15 = 1
        L6e:
            X.0o0 r1 = X.AbstractC14350nz.A00()
            java.lang.String r0 = "IgSignalsTtncEstimator"
            r1.A01 = r0
            X.0vB r14 = new X.0vB
            r14.<init>(r1)
            X.12M r7 = new X.12M
            r7.<init>(r14)
            r1 = 1002435370(0x3bbff32a, float:0.005857845)
            r0 = 3
            X.0nZ r0 = r7.AOT(r1, r0)
            X.19K r1 = X.AnonymousClass194.A02(r0)
            X.PdU r0 = X.C57370PdU.A00
            r7 = 1
            X.C14360o3.A0B(r9, r7)
            r7 = 17
            X.C14360o3.A0B(r1, r7)
            r7 = 18
            X.C14360o3.A0B(r0, r7)
            r7 = r16
            r7.<init>()
            r7.A07 = r9
            r7.A0B = r10
            r7.A0A = r8
            r7.A09 = r6
            r7.A0G = r12
            r7.A0H = r11
            r7.A05 = r4
            r7.A06 = r2
            r7.A0F = r15
            r7.A00 = r13
            r7.A08 = r14
            r7.A0E = r1
            r7.A0D = r0
            X.0dv r1 = X.EnumC09460dv.A02
            X.PdV r0 = X.C57371PdV.A00
            X.0do r0 = X.AbstractC09440dt.A00(r1, r0)
            r7.A0C = r0
            X.C218914p.A05(r7)
            return
        Lc9:
            r6 = r13
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator.<init>(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (X.AbstractC166987dD.A1a(r1) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r6, X.InterfaceC23621Ds r7, X.InterfaceC16660sJ r8) {
        /*
            r3 = 39
            boolean r0 = X.MAK.A01(r7, r3)
            if (r0 == 0) goto L7b
            r4 = r7
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L43
            if (r0 != r2) goto L81
            java.lang.Object r8 = r4.A02
            X.0sJ r8 = (X.InterfaceC16660sJ) r8
            java.lang.Object r6 = r4.A01
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r6 = (com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator) r6
            X.AbstractC09560e7.A00(r1)
        L2c:
            boolean r0 = X.AbstractC166987dD.A1a(r1)
            if (r0 != 0) goto L5a
        L32:
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r5 = -1
            r7 = 0
            X.OTu r0 = new X.OTu
            r3 = r1
            r0.<init>(r1, r3, r5, r7)
            r8.invoke(r0)
        L40:
            X.0eB r3 = X.C0eB.A00
            return r3
        L43:
            X.AbstractC09560e7.A00(r1)
            X.51t r1 = r6.A00
            if (r1 == 0) goto L5a
            boolean r0 = r1 instanceof com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor
            if (r0 == 0) goto L5a
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r1 = (com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor) r1
            X.AbstractC31172DnG.A1V(r6, r8, r4, r2)
            java.lang.Object r1 = r1.A04(r4)
            if (r1 != r3) goto L2c
            return r3
        L5a:
            X.Oc1 r3 = r6.A01
            if (r3 == 0) goto L32
            r0 = 11
            X.PgZ r2 = new X.PgZ
            r2.<init>(r8, r0)
            X.OTu r0 = r3.A00
            if (r0 == 0) goto L6d
            r2.invoke(r0)
            goto L40
        L6d:
            java.util.List r1 = r3.A01
            X.O38 r0 = new X.O38
            r0.<init>(r2)
            r1.add(r0)
            X.C55134Oc1.A00(r3)
            goto L40
        L7b:
            X.MAK r4 = new X.MAK
            r4.<init>(r6, r7, r3)
            goto L16
        L81:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator.A00(com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator, X.1Ds, X.0sJ):java.lang.Object");
    }

    public static final C0eB A01(IgSignalsTtncEstimator igSignalsTtncEstimator, C41018IEn c41018IEn, long j, boolean z) {
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        C55134Oc1 c55134Oc1 = igSignalsTtncEstimator.A01;
        if (c55134Oc1 != null) {
            C51959Mxg c51959Mxg = c55134Oc1.A07;
            Integer num4 = c51959Mxg.A03;
            Integer num5 = C05F.A00;
            if (num4 == num5) {
                if (z) {
                    num2 = C05F.A0C;
                } else {
                    num2 = C05F.A01;
                }
                c51959Mxg.A03 = num2;
                c51959Mxg.A00 = (int) (j - c51959Mxg.A04);
                int i2 = -1;
                if (c41018IEn != null && (num3 = c41018IEn.A01) != null) {
                    i = num3.intValue();
                } else {
                    i = -1;
                }
                c51959Mxg.A02 = i;
                if (c41018IEn != null) {
                    i2 = AbstractC25227BEk.A06(c41018IEn.A00, -1);
                }
                c51959Mxg.A01 = i2;
            }
            if (c55134Oc1.A00 == null) {
                C55134Oc1.A01(c55134Oc1, new C54986OTu(-1.0d, -1.0d, -1L, false));
            }
            igSignalsTtncEstimator.A01 = null;
            igSignalsTtncEstimator.A04 = true;
            igSignalsTtncEstimator.A03 = false;
            OAJ A00 = igSignalsTtncEstimator.A0B.A00();
            C51959Mxg c51959Mxg2 = c55134Oc1.A07;
            A00.A00 = c51959Mxg2;
            A00.A01 = true;
            if (c51959Mxg2.A07 != C05F.A0N && (num = c51959Mxg2.A03) != num5) {
                int i3 = c51959Mxg2.A00;
                if (num != C05F.A0C || (i3 >= 300 && i3 <= 15000)) {
                    List list = A00.A02;
                    list.add(c51959Mxg2);
                    if (list.size() > 120) {
                        list.remove(0);
                    }
                    NML nml = c55134Oc1.A08;
                    if (nml != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        NMI nmi = nml.A01;
                        if (nmi == null) {
                            nmi = AbstractC55167OdV.A02(nml, currentTimeMillis);
                            nml.A01 = nmi;
                        }
                        if (z) {
                            nmi.A02(AbstractC166987dD.A1J(new IgSignalsFeature(7000000, "time_to_new_content_ms", c51959Mxg2.A00)));
                        }
                    }
                }
            }
        }
        return C0eB.A00;
    }

    public final C51u A02(long j) {
        InterfaceC09390do interfaceC09390do = this.A0C;
        MSX.A1R((Calendar) AbstractC166987dD.A17(interfaceC09390do), j);
        return new C51u(Integer.valueOf(((Calendar) AbstractC166987dD.A17(interfaceC09390do)).get(7)), Integer.valueOf(((Calendar) AbstractC166987dD.A17(interfaceC09390do)).get(11)), Integer.valueOf(((Calendar) AbstractC166987dD.A17(interfaceC09390do)).get(12)));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        if (AbstractC201688vy.A01(this.A07, C05F.A0N)) {
            C218914p.A06(this);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-113461692);
        AbstractC37302Gc3.A1W(this, this.A0E, 13);
        C0f9.A0A(660028481, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1983392353, C0f9.A03(-1320739631));
    }
}
