package X;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70893Gb extends AbstractC70903Gc {
    public Double A00;
    public final C26191Pa A01;
    public final C31G A02;
    public final C1PY A03;
    public final boolean A04;
    public final double A05;
    public final AnonymousClass318 A06;
    public final C71043Gq A07;
    public final C1PH A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    @Override // X.AbstractC70903Gc, X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, final InterfaceC670130s interfaceC670130s) {
        C14360o3.A0B(interfaceC670130s, 0);
        C14360o3.A0B(interfaceC669830p, 1);
        C14360o3.A0B(anonymousClass320, 2);
        A03(anonymousClass320, interfaceC669830p, new InterfaceC670130s() { // from class: X.3Gy
            @Override // X.InterfaceC670130s
            public final C101484hA DnX(Integer num, List list) {
                C14360o3.A0B(list, 0);
                C14360o3.A0B(num, 1);
                return InterfaceC670130s.this.DnX(num, list);
            }

            @Override // X.InterfaceC670130s
            public final Map Bkt() {
                return InterfaceC670130s.this.Bkt();
            }

            @Override // X.InterfaceC670130s
            public final void CtX(int i) {
                InterfaceC670130s.this.CtX(i);
            }

            @Override // X.InterfaceC670130s
            public final void D7Y() {
                InterfaceC670130s.this.D7Y();
            }

            @Override // X.InterfaceC670130s
            public final /* synthetic */ C101484hA DnY(Integer num, Integer num2, List list) {
                throw new UnsupportedOperationException(AbstractC111324zv.A00(24));
            }
        });
        C71043Gq c71043Gq = this.A07;
        C14360o3.A0B(c71043Gq, 0);
        this.A0H.EPL(c71043Gq);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r0 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (X.C23061Al.A00(r7.A0F).A00(X.EnumC23071Am.A0e) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r7.A02.CiF(null, "HEADLOAD", null, "prefetch_peak_throttling", true, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        return;
     */
    @Override // X.AbstractC70903Gc, X.InterfaceC669530m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void CoM(X.C9C3 r8, X.AnonymousClass320 r9, X.EnumC37671p4 r10, java.lang.String r11, java.lang.String r12, double r13, boolean r15) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            r0 = 2
            X.C14360o3.A0B(r10, r0)
            boolean r0 = r7.A0D
            if (r0 == 0) goto L2a
            long r0 = X.C23051Ak.A02
            com.instagram.common.session.UserSession r0 = r7.A0F
            X.1Ak r1 = X.C23061Al.A00(r0)
            X.1Am r0 = X.EnumC23071Am.A0e
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L2a
        L1c:
            X.31G r0 = r7.A02
            java.lang.String r2 = "HEADLOAD"
            java.lang.String r4 = "prefetch_peak_throttling"
            r1 = 0
            r5 = 1
            r6 = r15
            r3 = r1
            r0.CiF(r1, r2, r3, r4, r5, r6)
        L29:
            return
        L2a:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L37
            X.1PH r0 = r7.A08
            boolean r0 = r0.A08()
        L34:
            if (r0 == 0) goto L4a
            goto L1c
        L37:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L4a
            long r0 = X.C23051Ak.A02
            com.instagram.common.session.UserSession r0 = r7.A0F
            X.1Ak r1 = X.C23061Al.A00(r0)
            X.1Am r0 = X.EnumC23071Am.A0e
            boolean r0 = r1.A00(r0)
            goto L34
        L4a:
            if (r8 == 0) goto Lc5
            java.lang.Object r0 = r8.A04
            java.lang.Double r0 = (java.lang.Double) r0
        L50:
            r7.A00 = r0
            X.1PY r4 = r7.A03
            java.util.LinkedList r0 = r4.A02
            boolean r6 = r0.isEmpty()
            boolean r0 = r7.A04
            r2 = 1
            r5 = r0 ^ 1
            double r0 = r7.A05
            boolean r3 = r7.A0A
            if (r3 == 0) goto Lc0
            int r0 = java.lang.Double.compare(r13, r0)
            if (r0 < 0) goto L72
            boolean r0 = r4.A09()
            r4 = 1
            if (r0 != 0) goto L73
        L72:
            r4 = 0
        L73:
            r4 = r4 & r5
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A06
            boolean r0 = r0.get()
            if (r0 == 0) goto L29
            X.1Pa r3 = r7.A01
            boolean r0 = r3.A01()
            if (r0 == 0) goto L29
            if (r6 != 0) goto L88
            if (r4 == 0) goto L29
        L88:
            java.lang.Integer r1 = r7.A03
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L29
            java.util.List r1 = r9.A03
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7.A04 = r0
            int r0 = r9.A02
            r7.A01 = r0
            int r1 = r9.A01
            r7.A00 = r1
            boolean r0 = r9.A00
            r7.A0D = r0
            X.318 r0 = r7.A06
            r0.A0U = r11
            r0.A0c = r12
            boolean r0 = r7.A09
            if (r0 == 0) goto Lbe
            if (r4 == 0) goto Lbe
            if (r6 != 0) goto Lbe
        Lb1:
            r7.A04(r10, r1, r2)
            java.lang.Integer r1 = r7.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L29
            r0 = 1
            r3.A05 = r0
            return
        Lbe:
            r2 = 0
            goto Lb1
        Lc0:
            boolean r4 = r4.A09()
            goto L73
        Lc5:
            r0 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70893Gb.CoM(X.9C3, X.320, X.1p4, java.lang.String, java.lang.String, double, boolean):void");
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.3Gq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C70893Gb(android.content.Context r25, X.AbstractC018607g r26, com.instagram.common.session.UserSession r27, X.AnonymousClass318 r28, X.C3G2 r29, X.C3GX r30, X.C26191Pa r31, X.C31G r32, X.C1PY r33, X.C1M1 r34, java.lang.String r35) {
        /*
            r24 = this;
            X.3Gd r8 = X.C70913Gd.A00
            X.3Ge r9 = X.C70923Ge.A00
            X.3Gf r10 = X.C70933Gf.A00
            X.3Gg r11 = X.C70943Gg.A00
            X.3Gh r12 = X.C70953Gh.A00
            X.3Gi r13 = X.C70963Gi.A00
            X.3Gj r14 = X.C70973Gj.A00
            X.3Gk r15 = X.C70983Gk.A00
            X.3Gl r16 = X.C70993Gl.A00
            X.3Gm r17 = X.C71003Gm.A00
            X.3Gn r6 = new X.3Gn
            r6.<init>()
            java.lang.String r1 = ""
            r0 = 0
            r7 = 0
            X.2qK r5 = X.AbstractC60952qJ.A01(r1, r0, r0)
            X.3Go r4 = new X.3Go
            r19 = r0
            r20 = r0
            r21 = r0
            r18 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r3 = r28
            r13 = r29
            r14 = r30
            r2 = r31
            r1 = r32
            r19 = r34
            r20 = r35
            r12 = r3
            r15 = r7
            r16 = r2
            r17 = r1
            r18 = r4
            r22 = r0
            r23 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r0 = r33
            r8.A03 = r0
            r8.A01 = r2
            r8.A02 = r1
            r8.A06 = r3
            com.instagram.common.session.UserSession r2 = r8.A0F
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36310538284892294(0x81003e00130086, double:3.026268849943309E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r8.A0B = r0
            r0 = 36310538287972519(0x81003e004200a7, double:3.026268851891256E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r8.A04 = r0
            r0 = 36310538288103593(0x81003e004400a9, double:3.0262688519741474E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r8.A0A = r0
            r0 = 37154963218300936(0x84003e00450008, double:3.560286578057219E-306)
            double r0 = X.C18U.A00(r3, r2, r0)
            r8.A05 = r0
            r0 = 36321426026603941(0x810a25000d25a5, double:3.0331543016431715E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r8.A09 = r0
            r0 = 36321426026931626(0x810a25001225aa, double:3.033154301850401E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r8.A0E = r0
            r0 = 36321426026997163(0x810a25001325ab, double:3.0331543018918466E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r8.A0C = r0
            r0 = 36315069475523567(0x81045d00150bef, double:3.029134393144166E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r8.A0D = r0
            X.1PH r0 = X.C1PH.A00(r2)
            X.C14360o3.A07(r0)
            r8.A08 = r0
            X.3Gq r0 = new X.3Gq
            r0.<init>()
            r8.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70893Gb.<init>(android.content.Context, X.07g, com.instagram.common.session.UserSession, X.318, X.3G2, X.3GX, X.1Pa, X.31G, X.1PY, X.1M1, java.lang.String):void");
    }

    @Override // X.AbstractC70903Gc, X.InterfaceC669530m
    public final void deactivate() {
        super.A06.set(false);
    }

    @Override // X.AbstractC70903Gc
    public final C85653ru A05(boolean z) {
        C85653ru A05 = super.A05(z);
        A05.A0I = true;
        A05.A0H = true;
        A05.A0J = true;
        A05.A0C = Collections.emptyMap();
        A05.A0G = this.A0B;
        A05.A07 = this.A00;
        return A05;
    }
}
