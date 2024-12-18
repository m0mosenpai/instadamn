package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class BQD extends AbstractC51572Yf {
    public final C25377BKu A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final SPM A06;
    public final C27845CPi A07;
    public final WeakReference A08;
    public final boolean A09;
    public final boolean A0A;
    public final InterfaceC31017DkG A0B;
    public final InterfaceC30877Dhq A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    private final C51682Yq A06(C2Z1 c2z1) {
        C120985dq c120985dq = this.A02;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            double A1B = c38321qM.A1B();
            C75113Zb c75113Zb = this.A03.A0E;
            if (c75113Zb != null && c75113Zb.A1p && !c120985dq.CdW()) {
                return A07(c2z1, C23831Eq.A03(AbstractC25229BEm.A0M(c2z1), A1B), C29863DFd.A00, 1, R.attr.igds_color_secondary_text_on_media, AbstractC77623dm.A09(c2z1), true);
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r1, 36321537695688250L) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r1, 36326064591615611L) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x029d, code lost:
    
        if (r3 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f3, code lost:
    
        if (r5 == X.EnumC37732Gj7.A03) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x032c, code lost:
    
        if (r3 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x029d  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r49) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQD.A0Y(X.3bS):X.2Vc");
    }

    public static final long A03(C2Z1 c2z1, BQD bqd) {
        UserSession userSession = bqd.A04;
        C120985dq c120985dq = bqd.A02;
        if (C25375BKs.A01(c120985dq, userSession) > 0) {
            return AbstractC25225BEi.A0A(C25375BKs.A01(c120985dq, userSession));
        }
        return AbstractC77623dm.A0A(c2z1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        r4 = 2131973211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ae, code lost:
    
        if (r1 != 2) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r17 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC50812Vc A04(X.C2Z1 r14, com.instagram.common.session.UserSession r15, X.C38321qM r16, X.EnumC75183Zl r17, X.InterfaceC31017DkG r18, X.InterfaceC30877Dhq r19) {
        /*
            r13 = this;
            r8 = r19
            boolean r0 = r8 instanceof X.BOK
            r3 = r15
            r4 = r16
            r5 = r17
            if (r0 == 0) goto L1f
            X.BOK r8 = (X.BOK) r8
            X.2pS r2 = r13.A05
            java.lang.ref.WeakReference r0 = r13.A08
            java.lang.Object r6 = r0.get()
            X.Dj2 r6 = (X.InterfaceC30945Dj2) r6
            X.BT3 r1 = new X.BT3
            r7 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L1f:
            X.2pS r9 = r13.A05
            r2 = 0
            java.lang.ref.WeakReference r0 = r13.A08
            java.lang.Object r11 = r0.get()
            X.Dj2 r11 = (X.InterfaceC30945Dj2) r11
            X.AbstractC167027dH.A12(r9, r15, r4)
            X.3Zl r0 = X.EnumC75183Zl.A03
            if (r5 == r0) goto La2
            r7 = 1
            X.Cl2 r6 = new X.Cl2
            r8 = r4
            r10 = r15
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            if (r17 != 0) goto La3
        L3c:
            r4 = 2131973211(0x7f13545b, float:1.9583451E38)
        L3f:
            X.3ay r0 = X.C51722Yv.A02
            long r0 = X.AbstractC77623dm.A06(r14)
            java.lang.Integer r3 = X.C05F.A15
            r9 = 0
            X.2Yv r1 = X.C9CU.A00(r2, r3, r9, r0)
            r0 = 2
            X.DRV r0 = X.DRV.A00(r6, r0)
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
        La2:
            r6 = 0
        La3:
            int r1 = r5.ordinal()
            r0 = 1
            if (r1 == r0) goto Lb1
            r0 = 2
            r4 = 2131965665(0x7f1336e1, float:1.9568146E38)
            if (r1 == r0) goto L3f
            goto L3c
        Lb1:
            r4 = 2131973204(0x7f135454, float:1.9583437E38)
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQD.A04(X.2Z1, com.instagram.common.session.UserSession, X.1qM, X.3Zl, X.DkG, X.Dhq):X.2Vc");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        if (r19.A5t() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r1 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC50792Va A05(X.C2Z1 r16, X.C120985dq r17, X.C37644Ghd r18, X.C38321qM r19) {
        /*
            r15 = this;
            r2 = r17
            X.1qM r0 = r2.A02
            X.4gy r0 = X.AbstractC76903cc.A00(r0)
            r6 = r15
            r7 = r16
            if (r0 == 0) goto L2f
            java.lang.String r8 = r0.getQuestion()
            if (r8 == 0) goto L2f
            int r0 = r8.length()
            if (r0 == 0) goto L2f
            r0 = 43
            r1 = r18
            X.DH2 r9 = X.DH2.A01(r2, r1, r15, r0)
            r11 = 2130970282(0x7f0406aa, float:1.754927E38)
            r10 = 1
            r14 = 0
            long r12 = X.AbstractC77623dm.A05(r7)
        L2a:
            X.2Yq r3 = r6.A07(r7, r8, r9, r10, r11, r12, r14)
            return r3
        L2f:
            boolean r0 = r2.CdW()
            if (r0 == 0) goto L4f
            com.instagram.common.session.UserSession r0 = r15.A04
            boolean r0 = X.AbstractC25381BKy.A07(r2, r0)
            if (r0 == 0) goto L4f
            X.1v4 r0 = r2.A06()
            java.lang.String r8 = r0.A0i
            X.DFc r9 = X.C29862DFc.A00
            r11 = 2130970282(0x7f0406aa, float:1.754927E38)
            r10 = 1
            long r12 = X.AbstractC77623dm.A05(r7)
            r14 = r10
            goto L2a
        L4f:
            r2 = r19
            boolean r5 = r2.CdW()
            boolean r0 = r2.A58()
            if (r0 != 0) goto L62
            boolean r0 = r2.A5t()
            r1 = 0
            if (r0 == 0) goto L63
        L62:
            r1 = 1
        L63:
            com.instagram.common.session.UserSession r3 = r15.A04
            X.5dq r0 = r15.A02
            boolean r0 = X.AbstractC25381BKy.A08(r0, r3)
            if (r0 != 0) goto L8e
            boolean r0 = X.BLH.A05(r3, r5, r1)
            if (r0 != 0) goto L8e
            X.BKu r0 = r15.A00
            boolean r0 = r0.A0C
            if (r0 != 0) goto L8e
            boolean r0 = X.AbstractC85373rS.A00(r3)
            if (r0 != 0) goto L8e
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36330789054530585(0x8112a900014419, double:3.0390755182058684E-306)
            boolean r0 = X.C18U.A06(r4, r3, r0)
            if (r0 == 0) goto Le0
            if (r5 != 0) goto Le0
        L8e:
            X.Ghd r0 = r15.A03
            X.3Zb r0 = r0.A0E
            if (r0 == 0) goto Lde
            boolean r1 = r0.A1p
            r0 = 2131954797(0x7f130c6d, float:1.9546103E38)
            if (r1 != 0) goto L9e
        L9b:
            r0 = 2131954798(0x7f130c6e, float:1.9546105E38)
        L9e:
            java.lang.String r8 = X.AbstractC77623dm.A0F(r7, r0)
            r4 = 0
            X.2Z0 r7 = X.AbstractC25233BEq.A0L(r7)
            r0 = 28
            X.D8O r9 = new X.D8O
            r9.<init>(r0, r2, r15, r1)
            r11 = 2130970314(0x7f0406ca, float:1.7549335E38)
            r10 = 1
            r14 = 0
            long r12 = X.AbstractC77623dm.A05(r7)
            X.2Yq r0 = r6.A07(r7, r8, r9, r10, r11, r12, r14)
            r7.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330789054530585(0x8112a900014419, double:3.0390755182058684E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Ld2
            X.2Yq r0 = r15.A06(r7)
            r7.A00(r0)
        Ld2:
            java.util.List r0 = r7.A01
            X.2WF r3 = new X.2WF
            r5 = r4
            r6 = r4
            r7 = r0
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        Lde:
            r1 = 0
            goto L9b
        Le0:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BQD.A05(X.2Z1, X.5dq, X.Ghd, X.1qM):X.2Va");
    }

    private final C51682Yq A07(C2Z1 c2z1, CharSequence charSequence, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, long j, boolean z) {
        CharSequence charSequence2 = charSequence;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(C05F.A1F, new DHP(38, interfaceC16820sZ, z), 4));
        UserSession userSession = this.A04;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36327138332260669L);
        DHP dhp = new DHP(39, interfaceC16820sZ, z);
        Integer num = C05F.A03;
        if (!A06) {
            dhp = null;
        }
        C51722Yv A0N = AbstractC25233BEq.A0N(EnumC77673dr.A02, C9CV.A00(A0h, num, dhp, 4));
        if (!this.A0F) {
            long A03 = A03(c2z1, this);
            C2Z3 A08 = A08();
            A0N = C9CU.A00(A0N, C05F.A15, 0, A03);
            if (A08 != null) {
                A0N = C9CU.A00(A0N, C05F.A1I, 0, A08.A00);
            }
        }
        if (z) {
            charSequence2 = String.valueOf(charSequence2);
        }
        C2XE ArD = c2z1.ArD();
        Context context = ArD.A0C;
        Integer num2 = C05F.A00;
        Typeface A0Q = AbstractC25226BEj.A0Q(context, num2);
        int A032 = AbstractC25232BEp.A03(context, c2z1, i2);
        Integer num3 = C05F.A0N;
        long A04 = AbstractC25449BNo.A04(userSession);
        int A02 = AbstractC25449BNo.A02(c2z1, userSession);
        long A05 = AbstractC25449BNo.A05(userSession);
        Integer A062 = AbstractC25449BNo.A06(c2z1, userSession);
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(ArD, charSequence2, A032);
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

    private final C2Z3 A08() {
        C75113Zb c75113Zb;
        C120985dq c120985dq = this.A02;
        C38321qM c38321qM = c120985dq.A02;
        UserSession userSession = this.A04;
        if (C25375BKs.A02(userSession, c38321qM) > 0 && (c75113Zb = this.A03.A0E) != null && !c75113Zb.A1o) {
            return AbstractC25225BEi.A0p(AbstractC25225BEi.A0A(C25375BKs.A02(userSession, c120985dq.A02)));
        }
        return null;
    }

    public BQD(C25377BKu c25377BKu, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, SPM spm, InterfaceC31017DkG interfaceC31017DkG, InterfaceC30877Dhq interfaceC30877Dhq, C27845CPi c27845CPi, WeakReference weakReference, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean A06;
        AbstractC167017dG.A1P(interfaceC30877Dhq, interfaceC31017DkG);
        AbstractC167017dG.A1U(c37644Ghd, clipsViewerConfig);
        C14360o3.A0B(c25377BKu, 9);
        this.A0C = interfaceC30877Dhq;
        this.A0B = interfaceC31017DkG;
        this.A02 = c120985dq;
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A03 = c37644Ghd;
        this.A01 = clipsViewerConfig;
        this.A08 = weakReference;
        this.A00 = c25377BKu;
        this.A09 = z;
        this.A0D = z2;
        this.A07 = c27845CPi;
        this.A06 = spm;
        this.A0E = z3;
        this.A0A = z4;
        if (c120985dq.CdW()) {
            A06 = false;
        } else {
            A06 = C18U.A06(C06090Tz.A05, userSession, 36329032414019556L);
        }
        this.A0F = A06;
    }
}
