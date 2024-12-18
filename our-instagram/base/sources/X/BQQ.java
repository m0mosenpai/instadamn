package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class BQQ extends AbstractC51572Yf {
    public final C37644Ghd A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C75113Zb A03;
    public final SPM A04;
    public final C25515BQd A05;
    public final C27845CPi A06;
    public final WeakReference A07;
    public final boolean A08;
    public final boolean A09;
    public final InterfaceC30873Dhm A0A;
    public final InterfaceC31017DkG A0B;
    public final InterfaceC30877Dhq A0C;
    public final boolean A0D;
    public final boolean A0E;

    public BQQ(C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, SPM spm, InterfaceC30873Dhm interfaceC30873Dhm, C25515BQd c25515BQd, InterfaceC31017DkG interfaceC31017DkG, InterfaceC30877Dhq interfaceC30877Dhq, C27845CPi c27845CPi, WeakReference weakReference, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167027dH.A0a(1, interfaceC30877Dhq, interfaceC31017DkG, c25515BQd, interfaceC30873Dhm);
        C14360o3.A0B(c37644Ghd, 7);
        this.A0C = interfaceC30877Dhq;
        this.A0B = interfaceC31017DkG;
        this.A05 = c25515BQd;
        this.A0A = interfaceC30873Dhm;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = c37644Ghd;
        this.A07 = weakReference;
        this.A08 = z;
        this.A0D = z2;
        this.A06 = c27845CPi;
        this.A04 = spm;
        this.A0E = z3;
        this.A09 = z4;
        this.A03 = c37644Ghd.A0E;
    }

    private final C51682Yq A05(C2Z1 c2z1) {
        C75113Zb c75113Zb = this.A03;
        if (c75113Zb != null && c75113Zb.A1p) {
            C25515BQd c25515BQd = this.A05;
            if (!c25515BQd.A0F) {
                return A06(c2z1, C23831Eq.A03(AbstractC25229BEm.A0M(c2z1), c25515BQd.A00), C29861DFb.A00, 1, R.attr.igds_color_secondary_text_on_media, AbstractC77623dm.A09(c2z1), true);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x027b, code lost:
    
        if (r5 == X.EnumC37732Gj7.A03) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02aa, code lost:
    
        if (r1 != null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0233  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r47) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQQ.A0Y(X.3bS):X.2Vc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r4 = 2131973211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (r1 != 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r17 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC50812Vc A03(X.C2Z1 r14, com.instagram.common.session.UserSession r15, X.C38321qM r16, X.EnumC75183Zl r17, X.InterfaceC31017DkG r18, X.InterfaceC30877Dhq r19) {
        /*
            r13 = this;
            r8 = r19
            boolean r0 = r8 instanceof X.BOK
            r3 = r15
            r4 = r16
            r5 = r17
            if (r0 == 0) goto L1f
            X.BOK r8 = (X.BOK) r8
            X.2pS r2 = r13.A02
            java.lang.ref.WeakReference r0 = r13.A07
            java.lang.Object r6 = r0.get()
            X.Dj2 r6 = (X.InterfaceC30945Dj2) r6
            X.BT3 r1 = new X.BT3
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L1f:
            X.2pS r9 = r13.A02
            r2 = 0
            java.lang.ref.WeakReference r0 = r13.A07
            java.lang.Object r11 = r0.get()
            X.Dj2 r11 = (X.InterfaceC30945Dj2) r11
            X.AbstractC167027dH.A12(r9, r15, r4)
            X.3Zl r0 = X.EnumC75183Zl.A03
            if (r5 == r0) goto La3
            r7 = 1
            X.Cl2 r6 = new X.Cl2
            r8 = r4
            r10 = r15
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            if (r17 != 0) goto La4
        L3c:
            r4 = 2131973211(0x7f13545b, float:1.9583451E38)
        L3f:
            X.3ay r0 = X.C51722Yv.A02
            long r0 = X.AbstractC77623dm.A06(r14)
            java.lang.Integer r3 = X.C05F.A15
            r9 = 0
            X.2Yv r1 = X.C9CU.A00(r2, r3, r9, r0)
            r0 = 46
            X.DRT r0 = X.DRT.A00(r6, r0)
            X.2Yv r10 = X.AbstractC25233BEq.A0d(r1, r0)
            java.lang.String r11 = X.AbstractC77623dm.A0F(r14, r4)
            X.2XE r5 = r14.ArD()
            android.content.Context r1 = r5.A0C
            r0 = 2130970314(0x7f0406ca, float:1.7549335E38)
            int r0 = X.AbstractC25228BEl.A06(r1, r14, r0)
            long r3 = X.AbstractC77623dm.A09(r14)
            java.lang.Integer r8 = X.C05F.A0N
            android.graphics.Typeface r7 = android.graphics.Typeface.DEFAULT
            long r1 = X.AbstractC25229BEm.A0D()
            java.lang.Integer r6 = X.C05F.A00
            X.3dw r5 = X.AbstractC25233BEq.A0g(r5, r11, r0)
            X.2XH r0 = r14.BoZ()
            X.AbstractC25230BEn.A1K(r5, r0, r9, r3)
            r5.A0T(r7)
            r5.A0F()
            int r0 = X.AbstractC25228BEl.A0A(r14, r1)
            X.AbstractC25234BEr.A18(r5, r14, r0, r1)
            int r0 = X.AbstractC25228BEl.A0A(r14, r1)
            float r0 = (float) r0
            r5.A0H(r0)
            X.AbstractC25234BEr.A1F(r5, r8, r6)
            r5.A0E()
            X.AbstractC25233BEq.A1D(r10, r5, r9)
            X.2Yq r1 = r5.A0A()
            return r1
        La3:
            r6 = 0
        La4:
            int r1 = r5.ordinal()
            r0 = 1
            if (r1 == r0) goto Lb2
            r0 = 2
            r4 = 2131965665(0x7f1336e1, float:1.9568146E38)
            if (r1 == r0) goto L3f
            goto L3c
        Lb2:
            r4 = 2131973204(0x7f135454, float:1.9583437E38)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQQ.A03(X.2Z1, com.instagram.common.session.UserSession, X.1qM, X.3Zl, X.DkG, X.Dhq):X.2Vc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r1 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC50792Va A04(X.C2Z1 r19) {
        /*
            r18 = this;
            r3 = r18
            X.BQd r2 = r3.A05
            java.lang.String r5 = r2.A09
            r4 = r19
            if (r5 == 0) goto L24
            int r0 = r5.length()
            if (r0 == 0) goto L24
            r0 = 9
            X.DGs r6 = X.C29904DGs.A01(r3, r0)
            r8 = 2130970282(0x7f0406aa, float:1.754927E38)
            r7 = 1
            r11 = 0
            long r9 = X.AbstractC77623dm.A05(r4)
        L1f:
            X.2Yq r12 = r3.A06(r4, r5, r6, r7, r8, r9, r11)
            return r12
        L24:
            boolean r0 = r2.A0F
            if (r0 == 0) goto L40
            boolean r0 = r2.A0J
            if (r0 == 0) goto L40
            X.5dq r0 = r2.A05
            X.1v4 r0 = r0.A06()
            java.lang.String r5 = r0.A0i
            X.DFa r6 = X.C29860DFa.A00
            r8 = 2130970282(0x7f0406aa, float:1.754927E38)
            r7 = 1
            long r9 = X.AbstractC77623dm.A05(r4)
            r11 = r7
            goto L1f
        L40:
            boolean r0 = r2.A0M
            r13 = 0
            if (r0 == 0) goto L8b
            X.3Zb r0 = r3.A03
            if (r0 == 0) goto L89
            boolean r1 = r0.A1p
            r0 = 2131954797(0x7f130c6d, float:1.9546103E38)
            if (r1 != 0) goto L53
        L50:
            r0 = 2131954798(0x7f130c6e, float:1.9546105E38)
        L53:
            java.lang.String r5 = X.AbstractC77623dm.A0F(r4, r0)
            X.2Z0 r4 = X.AbstractC25233BEq.A0L(r4)
            r11 = 0
            X.D8H r6 = new X.D8H
            r6.<init>(r11, r3, r1)
            r8 = 2130970314(0x7f0406ca, float:1.7549335E38)
            r7 = 1
            long r9 = X.AbstractC77623dm.A05(r4)
            X.2Yq r0 = r3.A06(r4, r5, r6, r7, r8, r9, r11)
            r4.A00(r0)
            boolean r0 = r2.A0O
            if (r0 == 0) goto L7b
            X.2Yq r0 = r3.A05(r4)
            r4.A00(r0)
        L7b:
            java.util.List r0 = r4.A01
            X.2WF r12 = new X.2WF
            r14 = r13
            r15 = r13
            r16 = r0
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            return r12
        L89:
            r1 = 0
            goto L50
        L8b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQQ.A04(X.2Z1):X.2Va");
    }

    private final C51682Yq A06(C2Z1 c2z1, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, long j, boolean z) {
        long A0A;
        C2Z3 c2z3;
        C75113Zb c75113Zb;
        CharSequence charSequence2 = charSequence;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(C05F.A1F, new DHP(36, interfaceC16820sZ, z), 4));
        UserSession userSession = this.A01;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327138332260669L);
        DHP dhp = new DHP(37, interfaceC16820sZ, z);
        Integer num = C05F.A03;
        if (!A06) {
            dhp = null;
        }
        C51722Yv A0N = AbstractC25233BEq.A0N(EnumC77673dr.A02, C9CV.A00(A0h, num, dhp, 4));
        C25515BQd c25515BQd = this.A05;
        if (!c25515BQd.A0G) {
            int i3 = c25515BQd.A04;
            if (i3 > 0) {
                A0A = AbstractC25225BEi.A0A(i3);
            } else {
                A0A = AbstractC77623dm.A0A(c2z1);
            }
            int i4 = c25515BQd.A03;
            if (i4 > 0 && (c75113Zb = this.A03) != null && !c75113Zb.A1o) {
                c2z3 = AbstractC25225BEi.A0p(AbstractC25225BEi.A0A(i4));
            } else {
                c2z3 = null;
            }
            A0N = C9CU.A00(A0N, C05F.A15, 0, A0A);
            if (c2z3 != null) {
                A0N = C9CU.A00(A0N, C05F.A1I, 0, c2z3.A00);
            }
        }
        if (z) {
            charSequence2 = String.valueOf(charSequence2);
        }
        C2XE ArD = c2z1.ArD();
        Context context = ArD.A0C;
        Integer num2 = C05F.A00;
        Typeface A0Q = AbstractC25226BEj.A0Q(context, num2);
        int A03 = AbstractC25232BEp.A03(context, c2z1, i2);
        Integer num3 = C05F.A0N;
        long A04 = AbstractC25449BNo.A04(userSession);
        int A02 = AbstractC25449BNo.A02(c2z1, userSession);
        long A05 = AbstractC25449BNo.A05(userSession);
        Integer A062 = AbstractC25449BNo.A06(c2z1, userSession);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(ArD, charSequence2, A03);
        AbstractC25230BEn.A1K(A0g, c2z1.BoZ(), 0, j);
        A0g.A0T(A0Q);
        A0g.A0P(A02);
        AbstractC25234BEr.A18(A0g, c2z1, AbstractC25228BEl.A0A(c2z1, A04), A0D);
        AbstractC25234BEr.A1A(A0g, c2z1.BoZ(), A062, A05);
        AbstractC25234BEr.A1F(A0g, num3, num2);
        A0g.A0M(i);
        AbstractC25233BEq.A1D(A0N, A0g, false);
        return A0g.A0A();
    }
}
