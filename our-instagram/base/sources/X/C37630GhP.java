package X;

import android.transition.Fade;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.View;
import com.instagram.api.schemas.ClipChainType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GhP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37630GhP implements C38Y {
    public C120985dq A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final ClipsViewerConfig A03;
    public final InterfaceC60442pS A04;
    public final C32S A05;
    public final InterfaceC43589JPu A06;
    public final C59952od A07;
    public final C59952od A08;
    public final C59952od A09;
    public final C59952od A0A;
    public final C37628GhN A0B;
    public final IG5 A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final InterfaceC16600sD A0H;
    public final boolean A0I;

    @Override // X.C38Y
    public final void DXS(int i) {
    }

    @Override // X.C38Y
    public final void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final void DY0() {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
    }

    private final void A00(int i) {
        View view;
        Integer valueOf;
        C37628GhN c37628GhN = this.A0B;
        if (c37628GhN != null) {
            View view2 = c37628GhN.A02;
            if ((view2 != null && (valueOf = Integer.valueOf(view2.getVisibility())) != null && valueOf.intValue() == i) || (view = c37628GhN.A02) == null) {
                return;
            }
            view.setVisibility(i);
        }
    }

    @Override // X.C38Y
    public final void DXR(int i) {
        C38321qM c38321qM;
        InterfaceC43530JKq Ao5;
        ClipChainType AoC;
        C37556GgC A0N = this.A0A.A0N();
        if (this.A0I) {
            C120985dq c120985dq = this.A00;
            C120985dq A09 = A0N.A09(i);
            this.A00 = A09;
            if (C14360o3.A0K(A09, c120985dq)) {
                return;
            }
        }
        C59952od c59952od = this.A07;
        C120985dq A092 = A0N.A09(i);
        if (A092 != null && (c38321qM = A092.A02) != null && (Ao5 = c38321qM.A0C.Ao5()) != null && (AoC = Ao5.AoC()) != null) {
            C37540Gfw c37540Gfw = c59952od.A09;
            if (c37540Gfw == null) {
                C14360o3.A0F("clipsViewerFragmentViewModel");
                throw C00O.createAndThrow();
            }
            C5R5 c5r5 = c37540Gfw.A0X;
            if (c5r5 instanceof C42179ImR) {
                ((C42179ImR) c5r5).A00 = AoC;
            }
        }
        C120985dq A093 = A0N.A09(i);
        int A05 = A0N.A05();
        boolean z = false;
        if (i < A0N.A03()) {
            z = true;
        }
        this.A0H.invoke(A093, Integer.valueOf(i), Integer.valueOf(A05), Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0106, code lost:
    
        if (r5.intValue() == 8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r35.A01, 36319209828260961L) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    @Override // X.C38Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DXa(int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37630GhP.DXa(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r1 != X.EnumC129395t1.A08) goto L11;
     */
    @Override // X.C38Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dim(float r6, float r7) {
        /*
            r5 = this;
            X.2od r0 = r5.A0A
            X.GgC r4 = r0.A0N()
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318479680542910(0x810777002418be, double:3.031291020530192E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L2b
            int r1 = r4.A05()
            int r0 = r4.A03()
            if (r1 != r0) goto L2b
            X.5dq r0 = r4.A09(r0)
            if (r0 == 0) goto L3e
            X.5t1 r1 = r0.A01
        L27:
            X.5t1 r0 = X.EnumC129395t1.A08
            if (r1 == r0) goto L36
        L2b:
            X.32S r1 = r5.A05
            if (r1 == 0) goto L36
            int r0 = r4.A03()
            r1.A0C(r0)
        L36:
            androidx.viewpager2.widget.ViewPager2 r0 = r4.A00
            if (r0 == 0) goto L3d
            X.BRS.A00(r0)
        L3d:
            return
        L3e:
            r1 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37630GhP.Dim(float, float):void");
    }

    @Override // X.C38Y
    public final void DrV() {
        C59952od c59952od = this.A09;
        C37540Gfw c37540Gfw = c59952od.A09;
        if (c37540Gfw == null) {
            C14360o3.A0F("clipsViewerFragmentViewModel");
            throw C00O.createAndThrow();
        }
        if (c37540Gfw.A21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new Slide(48));
            transitionSet.addTransition(new Fade(1));
            c59952od.setReturnTransition(transitionSet);
            AbstractC25225BEi.A0r(c59952od.requireActivity(), C59952od.A01(c59952od)).A06();
        }
    }

    public C37630GhP(ClipsViewerConfig clipsViewerConfig, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C32S c32s, InterfaceC43589JPu interfaceC43589JPu, C59952od c59952od, C59952od c59952od2, C59952od c59952od3, C59952od c59952od4, C37628GhN c37628GhN, IG5 ig5, InterfaceC16600sD interfaceC16600sD, boolean z) {
        AbstractC167017dG.A1P(interfaceC60442pS, userSession);
        AbstractC167017dG.A1T(interfaceC43589JPu, ig5);
        C14360o3.A0B(clipsViewerConfig, 10);
        this.A04 = interfaceC60442pS;
        this.A01 = userSession;
        this.A0A = c59952od;
        this.A08 = c59952od2;
        this.A06 = interfaceC43589JPu;
        this.A0C = ig5;
        this.A05 = c32s;
        this.A09 = c59952od3;
        this.A0I = z;
        this.A03 = clipsViewerConfig;
        this.A0B = c37628GhN;
        this.A07 = c59952od4;
        this.A0H = interfaceC16600sD;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new J8W(this, 42));
        this.A0D = clipsViewerConfig.A01;
        this.A0G = clipsViewerConfig.A19;
        this.A0F = clipsViewerConfig.A15;
        this.A0E = clipsViewerConfig.A14;
    }

    @Override // X.C38Y
    public final void DrY(C120985dq c120985dq, int i) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            InterfaceC60442pS interfaceC60442pS = this.A04;
            UserSession userSession = this.A01;
            InterfaceC43589JPu interfaceC43589JPu = this.A06;
            String str = this.A03.A0n;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "instagram_clips_end_of_feed");
            String A38 = A0G.A38();
            String A0o = AbstractC25233BEq.A0o(A0G);
            if (A38 != null && A0o != null) {
                AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
                AbstractC25236BEt.A0r(A0f, A38);
                AbstractC25230BEn.A1D(A0f, Long.parseLong(A0o));
                AbstractC25229BEm.A19(A0f, i);
                InterfaceC43589JPu.A00(A0f, interfaceC43589JPu);
                AbstractC37303Gc4.A0a(A0f);
                AbstractC37302Gc3.A0y(A0f, A0G);
                if (str != null) {
                    A0f.A9K("blend_id", AbstractC25228BEl.A13(str));
                }
                AbstractC31176DnK.A1I(A0f);
            }
        }
    }
}
