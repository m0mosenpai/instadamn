package com.instagram.feed.tifu;

import X.AbstractC001800i;
import X.AbstractC123875j1;
import X.AbstractC132145xr;
import X.AbstractC133095zb;
import X.AbstractC14490oL;
import X.AbstractC15820qc;
import X.AbstractC16960so;
import X.AnonymousClass386;
import X.C00O;
import X.C05A;
import X.C09530e4;
import X.C0UO;
import X.C119835bh;
import X.C132115xo;
import X.C132125xp;
import X.C132135xq;
import X.C132155xs;
import X.C132335yC;
import X.C14360o3;
import X.C23031Ai;
import X.C35265Fh0;
import X.C38321qM;
import X.C4dV;
import X.C57532kS;
import X.C5Hc;
import X.C9C6;
import X.EnumC77173d3;
import X.I0H;
import X.InterfaceC11380iw;
import X.InterfaceC132105xl;
import X.InterfaceC99474dM;
import X.InterfaceC99494dO;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.api.TifuApiHelper;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class TifuViewModel {
    public String A00;
    public final Context A01;
    public final C132135xq A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final AnonymousClass386 A05;
    public final InterfaceC132105xl A06;
    public final C132125xp A07;
    public final C132115xo A08;
    public final C4dV A09;
    public final C119835bh A0A;
    public final C23031Ai A0B;
    public final Double A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final C05A A0F;
    public final C0UO A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final TifuApiHelper A0M;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (X.C14360o3.A0K(((X.C99514dR) r0).A01, true) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (X.C18U.A06(r6, r40, 36326266455275308L) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (X.C14360o3.A0K(((X.C99514dR) r0).A00, true) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TifuViewModel(android.content.Context r38, X.InterfaceC11380iw r39, com.instagram.common.session.UserSession r40, X.AnonymousClass386 r41, X.InterfaceC132105xl r42, X.C4dV r43, X.C119835bh r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.<init>(android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.386, X.5xl, X.4dV, X.5bh, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r15, X.InterfaceC23621Ds r16, boolean r17) {
        /*
            r14 = this;
            r8 = r15
            r3 = r17
            r5 = 9
            r6 = r16
            boolean r0 = X.PX0.A01(r6, r5)
            if (r0 == 0) goto Lcb
            r2 = r6
            X.PX0 r2 = (X.PX0) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto Lcb
            int r4 = r4 - r1
            r2.A00 = r4
        L1b:
            java.lang.Object r5 = r2.A03
            X.1JX r1 = X.C1JX.A02
            int r4 = r2.A00
            r0 = 1
            if (r4 == 0) goto L3b
            if (r4 != r0) goto Ld2
            boolean r3 = r2.A05
            java.lang.Object r8 = r2.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r2.A01
            com.instagram.feed.tifu.TifuViewModel r0 = (com.instagram.feed.tifu.TifuViewModel) r0
            X.AbstractC09560e7.A00(r5)
        L33:
            com.instagram.common.session.UserSession r0 = r0.A04
            X.AbstractC41286IPb.A01(r0, r8, r3)
            X.0eB r1 = X.C0eB.A00
        L3a:
            return r1
        L3b:
            X.AbstractC09560e7.A00(r5)
            r12 = 0
            X.5xl r7 = r14.A06
            X.4dV r4 = r14.A09
            java.lang.String r9 = r4.A06
            java.lang.String r10 = r4.A07
            X.0UO r6 = r14.A0G
            java.lang.Object r4 = r6.getValue()
            X.5yC r4 = (X.C132335yC) r4
            X.5Hc r4 = r4.A06
            java.util.Iterator r5 = r4.iterator()
            if (r17 == 0) goto L6e
        L57:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L9c
            java.lang.Object r4 = r5.next()
            X.9C6 r4 = (X.C9C6) r4
            java.lang.String r4 = r4.A03
            boolean r4 = X.C14360o3.A0K(r4, r15)
            if (r4 != 0) goto L9d
            int r12 = r12 + 1
            goto L57
        L6e:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r5.next()
            X.9C6 r4 = (X.C9C6) r4
            java.lang.String r4 = r4.A03
            boolean r4 = X.C14360o3.A0K(r4, r15)
            if (r4 != 0) goto L86
            int r12 = r12 + 1
            goto L6e
        L85:
            r12 = -1
        L86:
            java.lang.Object r4 = r6.getValue()
            X.5yC r4 = (X.C132335yC) r4
            X.5Hc r4 = r4.A06
            int r13 = r4.size()
            java.lang.Integer r4 = r14.A0E
            java.lang.String r11 = X.AbstractC123875j1.A00(r4)
            r7.EIO(r8, r9, r10, r11, r12, r13)
            goto Lb2
        L9c:
            r12 = -1
        L9d:
            java.lang.Object r4 = r6.getValue()
            X.5yC r4 = (X.C132335yC) r4
            X.5Hc r4 = r4.A06
            int r13 = r4.size()
            java.lang.Integer r4 = r14.A0E
            java.lang.String r11 = X.AbstractC123875j1.A00(r4)
            r7.EIN(r8, r9, r10, r11, r12, r13)
        Lb2:
            com.instagram.feed.tifu.api.TifuApiHelper r5 = r14.A0M
            X.1rC r4 = X.C38321qM.A0h
            java.lang.String r4 = X.C38801rC.A06(r15)
            r2.A01 = r14
            r2.A02 = r15
            r2.A05 = r3
            r2.A00 = r0
            java.lang.Object r0 = r5.A02(r4, r2, r3)
            if (r0 == r1) goto L3a
            r0 = r14
            goto L33
        Lcb:
            X.PX0 r2 = new X.PX0
            r2.<init>(r14, r6, r5)
            goto L1b
        Ld2:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A03(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    public final void A05(FragmentActivity fragmentActivity, String str) {
        InterfaceC99474dM interfaceC99474dM;
        Object obj;
        InterfaceC99494dO interfaceC99494dO;
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(str, 1);
        C5Hc c5Hc = ((C132335yC) this.A0G.getValue()).A06;
        C35265Fh0 c35265Fh0 = C35265Fh0.A00;
        UserSession userSession = this.A04;
        Iterator it = c5Hc.iterator();
        while (true) {
            interfaceC99474dM = null;
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C9C6) obj).A03, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9C6 c9c6 = (C9C6) obj;
        if (c9c6 != null && (interfaceC99494dO = (InterfaceC99494dO) c9c6.A01) != null) {
            interfaceC99474dM = interfaceC99494dO.CCA();
        }
        c35265Fh0.A07(fragmentActivity, interfaceC99474dM, userSession, "ufiLikeDestination", "tifu");
        InterfaceC132105xl interfaceC132105xl = this.A06;
        C4dV c4dV = this.A09;
        String str2 = c4dV.A06;
        String str3 = c4dV.A07;
        int i = 0;
        Iterator it2 = c5Hc.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C14360o3.A0K(((C9C6) it2.next()).A03, str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        interfaceC132105xl.EIM(str, str2, str3, AbstractC123875j1.A00(this.A0E), null, i, c5Hc.size());
    }

    public final void A08(C5Hc c5Hc, C5Hc c5Hc2) {
        Object value;
        String str;
        String str2;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean bool;
        C14360o3.A0B(c5Hc, 0);
        C14360o3.A0B(c5Hc2, 1);
        C05A c05a = this.A0F;
        do {
            value = c05a.getValue();
            C132335yC c132335yC = (C132335yC) value;
            str = c132335yC.A03;
            str2 = c132335yC.A04;
            num = c132335yC.A02;
            z = c132335yC.A0A;
            i = c132335yC.A00;
            z2 = c132335yC.A07;
            z3 = c132335yC.A08;
            z4 = c132335yC.A09;
            bool = c132335yC.A01;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            C14360o3.A0B(num, 2);
        } while (!c05a.AIi(value, new C132335yC(bool, num, str, str2, c5Hc, c5Hc2, i, z, z2, z3, z4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.feed.tifu.TifuViewModel r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            r3 = 33
            boolean r0 = X.MAK.A01(r13, r3)
            if (r0 == 0) goto L2c
            r5 = r13
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r9 = 2
            r8 = 1
            if (r0 == 0) goto L32
            if (r0 == r8) goto La6
            if (r0 == r9) goto La6
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L2c:
            X.MAK r5 = new X.MAK
            r5.<init>(r11, r13, r3)
            goto L16
        L32:
            X.AbstractC09560e7.A00(r1)
            X.0e4 r1 = r11.A01(r12)
            if (r1 == 0) goto Lbc
            java.lang.Object r0 = r1.A00
            X.9C6 r0 = (X.C9C6) r0
            java.lang.Object r10 = r1.A01
            java.lang.Object r0 = r0.A00
            X.1qM r0 = (X.C38321qM) r0
            java.lang.String r4 = r0.A2u()
            if (r4 == 0) goto Lbc
            X.3d3 r1 = X.EnumC77173d3.A02
            r3 = 0
            com.instagram.feed.tifu.api.TifuApiHelper r2 = r11.A0M
            X.4dV r7 = r11.A09
            java.lang.String r0 = r7.A07
            if (r10 != r1) goto L7f
            if (r0 == 0) goto L7d
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)
            if (r0 == 0) goto L7d
            int r1 = r0.intValue()
        L62:
            java.lang.String r0 = r7.A06
            if (r0 == 0) goto L70
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)
            if (r0 == 0) goto L70
            int r3 = r0.intValue()
        L70:
            r5.A01 = r11
            r5.A02 = r12
            r5.A00 = r8
            java.lang.Object r1 = r2.A00(r4, r5, r1, r3)
        L7a:
            if (r1 != r6) goto Lb1
            return r6
        L7d:
            r1 = 0
            goto L62
        L7f:
            if (r0 == 0) goto La4
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)
            if (r0 == 0) goto La4
            int r1 = r0.intValue()
        L8b:
            java.lang.String r0 = r7.A06
            if (r0 == 0) goto L99
            java.lang.Integer r0 = X.AbstractC003100w.A0i(r0)
            if (r0 == 0) goto L99
            int r3 = r0.intValue()
        L99:
            r5.A01 = r11
            r5.A02 = r12
            r5.A00 = r9
            java.lang.Object r1 = r2.A01(r4, r5, r1, r3)
            goto L7a
        La4:
            r1 = 0
            goto L8b
        La6:
            java.lang.Object r12 = r5.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r5.A01
            com.instagram.feed.tifu.TifuViewModel r11 = (com.instagram.feed.tifu.TifuViewModel) r11
            X.AbstractC09560e7.A00(r1)
        Lb1:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto Lbc
            r11.A01(r12)
        Lbc:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A00(com.instagram.feed.tifu.TifuViewModel, java.lang.String, X.1Ds):java.lang.Object");
    }

    private final C09530e4 A01(String str) {
        EnumC77173d3 enumC77173d3;
        EnumC77173d3 enumC77173d32;
        C132335yC c132335yC = (C132335yC) this.A0G.getValue();
        C5Hc c5Hc = c132335yC.A06;
        ArrayList A0U = AbstractC001800i.A0U(c5Hc);
        int i = 0;
        for (Object obj : c5Hc) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C9C6 c9c6 = (C9C6) obj;
            String str2 = c9c6.A03;
            if (C14360o3.A0K(str2, str)) {
                C38321qM c38321qM = (C38321qM) c9c6.A00;
                if (c38321qM.A5l()) {
                    enumC77173d3 = EnumC77173d3.A03;
                } else {
                    enumC77173d3 = EnumC77173d3.A02;
                }
                UserSession userSession = this.A04;
                C57532kS A00 = C57532kS.A00(userSession);
                InterfaceC11380iw interfaceC11380iw = this.A03;
                A00.A0M(interfaceC11380iw, enumC77173d3, c38321qM, AbstractC15820qc.A07(), null, false);
                if (c38321qM.A5l()) {
                    enumC77173d32 = EnumC77173d3.A02;
                } else {
                    enumC77173d32 = EnumC77173d3.A03;
                }
                I0H.A00(userSession, enumC77173d32, enumC77173d3, c38321qM);
                C132155xs c132155xs = C132155xs.A00;
                boolean z = this.A0L;
                boolean z2 = this.A0I;
                boolean z3 = this.A0J;
                C5Hc A002 = c132155xs.A00(userSession, c38321qM, this.A0C, this.A0D, i, true, false, true, z, z2, false, z3, this.A0H, this.A0K, false, false);
                A0U.set(i, new C9C6((InterfaceC99494dO) c9c6.A01, c38321qM, str2, A002, AbstractC132145xr.A01(this.A01, interfaceC11380iw, A002), c9c6.A04));
                A08(AbstractC133095zb.A00(A0U), c132335yC.A05);
                return new C09530e4(c9c6, enumC77173d3);
            }
            i = i2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(androidx.fragment.app.FragmentActivity r15, java.lang.String r16, X.InterfaceC23621Ds r17) {
        /*
            r14 = this;
            r7 = r16
            r3 = 34
            r4 = r17
            boolean r0 = X.MAK.A01(r4, r3)
            if (r0 == 0) goto Lae
            r6 = r4
            X.MAK r6 = (X.MAK) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r6.A00 = r2
        L1a:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r12 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L61
            if (r0 == r3) goto L8a
            if (r0 != r4) goto Lb5
            java.lang.Object r7 = r6.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r6.A01
            com.instagram.feed.tifu.TifuViewModel r2 = (com.instagram.feed.tifu.TifuViewModel) r2
            X.AbstractC09560e7.A00(r1)
        L34:
            X.0UO r0 = r2.A0G
            java.lang.Object r0 = r0.getValue()
            X.5yC r0 = (X.C132335yC) r0
            X.5Hc r3 = r0.A06
            X.5xl r6 = r2.A06
            X.4dV r0 = r2.A09
            java.lang.String r8 = r0.A06
            java.lang.String r9 = r0.A07
            java.util.Iterator r1 = r3.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r1.next()
            X.9C6 r0 = (X.C9C6) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 != 0) goto Lc2
            int r12 = r12 + 1
            goto L4a
        L61:
            X.AbstractC09560e7.A00(r1)
            X.4dV r0 = r14.A09
            X.4dS r0 = r0.A02
            if (r0 == 0) goto Lbd
            X.4dR r0 = (X.C99514dR) r0
            java.lang.Boolean r1 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lbd
            r14.A00 = r7
            com.instagram.feed.tifu.api.TifuApiHelper r0 = r14.A0M
            r6.A01 = r14
            r6.A02 = r7
            r6.A00 = r3
            java.lang.Object r1 = r0.A03(r6)
            if (r1 == r5) goto Ld2
            r2 = r14
            goto L95
        L8a:
            java.lang.Object r7 = r6.A02
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r6.A01
            com.instagram.feed.tifu.TifuViewModel r2 = (com.instagram.feed.tifu.TifuViewModel) r2
            X.AbstractC09560e7.A00(r1)
        L95:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto Laa
            r6.A01 = r2
            r6.A02 = r7
            r6.A00 = r4
            java.lang.Object r0 = A00(r2, r7, r6)
            if (r0 != r5) goto L34
            return r5
        Laa:
            r2.A09(r3)
            goto L34
        Lae:
            X.MAK r6 = new X.MAK
            r6.<init>(r14, r4, r3)
            goto L1a
        Lb5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbd:
            r14.A05(r15, r7)
            goto Ld0
        Lc1:
            r12 = -1
        Lc2:
            int r13 = r3.size()
            java.lang.Integer r0 = r2.A0E
            java.lang.String r10 = X.AbstractC123875j1.A00(r0)
            r11 = 0
            r6.EIM(r7, r8, r9, r10, r11, r12, r13)
        Ld0:
            X.0eB r5 = X.C0eB.A00
        Ld2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A02(androidx.fragment.app.FragmentActivity, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r20, boolean r21) {
        /*
            r19 = this;
            r5 = 18
            r6 = r20
            boolean r1 = X.MAH.A01(r6, r5)
            r0 = r19
            if (r1 == 0) goto L97
            r3 = r6
            X.MAH r3 = (X.MAH) r3
            int r4 = r3.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r2
            if (r1 == 0) goto L97
            int r4 = r4 - r2
            r3.A00 = r4
        L1a:
            java.lang.Object r5 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r4 = r3.A00
            r1 = 2
            r13 = 1
            if (r4 == 0) goto L36
            if (r4 == r13) goto L7f
            if (r4 != r1) goto L9e
            java.lang.Object r4 = r3.A01
            com.instagram.feed.tifu.TifuViewModel r4 = (com.instagram.feed.tifu.TifuViewModel) r4
            X.AbstractC09560e7.A00(r5)
        L2f:
            r0 = 0
            r4.A09(r0)
            X.0eB r2 = X.C0eB.A00
        L35:
            return r2
        L36:
            X.AbstractC09560e7.A00(r5)
            if (r21 == 0) goto L95
            com.instagram.feed.tifu.api.TifuApiHelper r4 = r0.A0M
            r3.A01 = r0
            r3.A00 = r13
            r14 = 0
            X.2JM r7 = new X.2JM
            r7.<init>()
            X.2JM r6 = new X.2JM
            r6.<init>()
            com.instagram.common.session.UserSession r4 = r4.A00
            X.2JQ r5 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1uJ r8 = X.AbstractC40511uK.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Qo3> r12 = X.Qo3.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "TifuLikeConfirmationMutation"
            r15 = 0
            java.lang.String r17 = "xdt_likes_ig_threads_set_like_confirmation"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1ud r4 = X.AbstractC40691uc.A01(r4)
            java.lang.Object r4 = r4.A04(r7, r3)
            if (r4 == r2) goto L7b
            X.0eB r4 = X.C0eB.A00
        L7b:
            if (r4 == r2) goto L35
            r4 = r0
            goto L86
        L7f:
            java.lang.Object r4 = r3.A01
            com.instagram.feed.tifu.TifuViewModel r4 = (com.instagram.feed.tifu.TifuViewModel) r4
            X.AbstractC09560e7.A00(r5)
        L86:
            java.lang.String r0 = r4.A00
            if (r0 == 0) goto L2f
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r0 = A00(r4, r0, r3)
            if (r0 != r2) goto L2f
            return r2
        L95:
            r4 = r0
            goto L2f
        L97:
            X.MAH r3 = new X.MAH
            r3.<init>(r0, r6, r5)
            goto L1a
        L9e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.TifuViewModel.A04(X.1Ds, boolean):java.lang.Object");
    }

    public final void A06(FragmentActivity fragmentActivity, String str) {
        InterfaceC99474dM interfaceC99474dM;
        Object obj;
        InterfaceC99494dO interfaceC99494dO;
        C5Hc c5Hc = ((C132335yC) this.A0G.getValue()).A06;
        C35265Fh0 c35265Fh0 = C35265Fh0.A00;
        UserSession userSession = this.A04;
        Iterator it = c5Hc.iterator();
        while (true) {
            interfaceC99474dM = null;
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C9C6) obj).A03, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9C6 c9c6 = (C9C6) obj;
        if (c9c6 != null && (interfaceC99494dO = (InterfaceC99494dO) c9c6.A01) != null) {
            interfaceC99474dM = interfaceC99494dO.BQg();
        }
        c35265Fh0.A07(fragmentActivity, interfaceC99474dM, userSession, "mediaDestination", "tifu");
        int i = 0;
        Iterator it2 = c5Hc.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C14360o3.A0K(((C9C6) it2.next()).A03, str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        InterfaceC132105xl interfaceC132105xl = this.A06;
        C4dV c4dV = this.A09;
        String str2 = c4dV.A06;
        String str3 = c4dV.A07;
        int size = c5Hc.size();
        String A00 = AbstractC123875j1.A00(this.A0E);
        interfaceC132105xl.CmK(str, str2, str3, A00, i, size);
        interfaceC132105xl.CkZ(str, str2, str3, A00, null, i, c5Hc.size(), AbstractC14490oL.A0A(this.A01));
        interfaceC132105xl.Ckd(str2, c4dV.A03.A0D, str);
    }

    public final void A07(String str) {
        InterfaceC132105xl interfaceC132105xl = this.A06;
        C4dV c4dV = this.A09;
        String str2 = c4dV.A06;
        String str3 = c4dV.A07;
        Iterator it = c4dV.A09.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C14360o3.A0K(((C38321qM) it.next()).getId(), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        interfaceC132105xl.EIS(str, str2, str3, AbstractC123875j1.A00(this.A0E), null, i, ((C132335yC) this.A0G.getValue()).A06.size());
    }

    public final void A09(boolean z) {
        Object value;
        String str;
        String str2;
        Integer num;
        C5Hc c5Hc;
        C5Hc c5Hc2;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        Boolean bool;
        C05A c05a = this.A0F;
        do {
            value = c05a.getValue();
            C132335yC c132335yC = (C132335yC) value;
            str = c132335yC.A03;
            str2 = c132335yC.A04;
            num = c132335yC.A02;
            c5Hc = c132335yC.A06;
            c5Hc2 = c132335yC.A05;
            i = c132335yC.A00;
            z2 = c132335yC.A07;
            z3 = c132335yC.A08;
            z4 = c132335yC.A09;
            bool = c132335yC.A01;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            C14360o3.A0B(num, 2);
            C14360o3.A0B(c5Hc, 3);
            C14360o3.A0B(c5Hc2, 4);
        } while (!c05a.AIi(value, new C132335yC(bool, num, str, str2, c5Hc, c5Hc2, i, z, z2, z3, z4)));
    }
}
