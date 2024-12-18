package X;

import android.view.View;
import android.view.ViewParent;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8YL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YL implements InterfaceC1829689r {
    public float A00;
    public C188798Xv A01;
    public final int A02;
    public final UserSession A03;
    public final InterfaceC188718Xl A04;
    public final ClipsCreationViewModel A05;
    public final boolean A06;
    public final C1810981l A07;
    public final C183688Ct A08;
    public final C8HI A09;
    public final AnonymousClass840 A0A;
    public final InterfaceC1810081c A0B;
    public final C8YN A0C;
    public final C8YN A0D;

    private C194648jP A00() {
        C188798Xv c188798Xv = this.A01;
        if (c188798Xv == null) {
            return null;
        }
        C194648jP c194648jP = c188798Xv.A00().A01;
        if (c194648jP != null) {
            return c194648jP;
        }
        this.A01.A00().A08();
        return this.A01.A00().A01;
    }

    private boolean A01() {
        EnumC1810181d AuG = this.A0B.AuG();
        if (AuG != EnumC1810181d.A09 && AuG != EnumC1810181d.A0K && AuG != EnumC1810181d.A0z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (X.C183688Ct.A0O(r3) != false) goto L22;
     */
    @Override // X.InterfaceC1829689r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DHW(android.view.MotionEvent r5, float r6, float r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            X.81c r0 = r4.A0B
            X.81f r0 = r0.AuH()
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 != r0) goto L2b
            X.840 r0 = r4.A0A
            X.83z r1 = r0.A02
            boolean r0 = r1.A00
            if (r0 != 0) goto L2b
            if (r8 == 0) goto L2f
            boolean r0 = r4.A01()
            if (r0 != 0) goto L2b
            X.8pb r1 = r1.A01()
            X.8pb r0 = X.EnumC198268pb.A04
            if (r1 != r0) goto L2c
            X.8YN r2 = r4.A0C
        L27:
            double r0 = (double) r6
            r2.DHU(r0)
        L2b:
            return
        L2c:
            X.8YN r2 = r4.A0D
            goto L27
        L2f:
            if (r9 == 0) goto L2b
            X.8Ct r3 = r4.A08
            boolean r0 = r3.A0a
            if (r0 != 0) goto L2b
            X.81c r1 = r3.A1N
            X.81d r0 = X.EnumC1810181d.A09
            boolean r2 = r1.CRB(r0)
            X.81l r0 = r3.A0x
            X.81v r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L50
            boolean r1 = X.C183688Ct.A0O(r3)
            r0 = 1
            if (r1 == 0) goto L51
        L50:
            r0 = 0
        L51:
            if (r2 == 0) goto L2b
            if (r0 == 0) goto L2b
            X.8BD r1 = r3.A0D
            boolean r0 = r1 instanceof com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController
            if (r0 == 0) goto L2b
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r1 = (com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController) r1
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            r1.A0L = r0
            X.8Sk r0 = r1.A09
            r1.A08 = r0
            X.Wd3 r0 = r1.A0D
            if (r0 == 0) goto L2b
            r2 = 0
            r1 = 0
            X.WnF r0 = r0.A0G
            r0.onFling(r2, r5, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YL.DHW(android.view.MotionEvent, float, float, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r8 > (r9 / 2.0f)) goto L70;
     */
    @Override // X.InterfaceC1829689r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean DJG(float r11, float r12, float r13, float r14, float r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8YL.DJG(float, float, float, float, float, boolean, boolean):boolean");
    }

    @Override // X.InterfaceC1829689r
    public final void Dir(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        C188798Xv c188798Xv;
        C193718hr c193718hr;
        C8YN c8yn;
        int ordinal = this.A0B.AuH().ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 && !this.A07.A0W(C81W.A0p, C81W.A0o)) {
                C1816783z c1816783z = this.A0A.A02;
                if (!c1816783z.A00) {
                    if (z && !A01()) {
                        if (c1816783z.A01() == EnumC198268pb.A04) {
                            c8yn = this.A0C;
                        } else {
                            c8yn = this.A0D;
                        }
                        c8yn.Dil(f);
                        return;
                    }
                    if (!z2) {
                        return;
                    }
                    this.A08.A0v(f2);
                    return;
                }
                return;
            }
            return;
        }
        if (!z2) {
            return;
        }
        if ((this.A07.A0W(C81W.A0C) && this.A08.A0v(f2)) || A00() == null) {
            return;
        }
        if (A00().A00 == 0.0f && f2 < 0.0f && (!this.A05.A0s() || !this.A06)) {
            return;
        }
        if (f2 > 0.0f && A00().A00 == 0.0f && (c188798Xv = this.A01) != null && (c193718hr = (C193718hr) c188798Xv.A00().A0k.getValue()) != null) {
            c193718hr.A00("camera_swipe_up");
        }
        C194648jP A00 = A00();
        if (A00.A0G.CVK()) {
            C55982hj c55982hj = A00.A0E;
            c55982hj.A08(c55982hj.A09.A00 - (-f2), true);
        }
        C8HI c8hi = this.A09;
        if (c8hi.A0I || c8hi.A1C.AuH() != EnumC1810381f.A03) {
            return;
        }
        C8HI.A0E(c8hi, true);
    }

    public C8YL(final View view, final View view2, UserSession userSession, C1810981l c1810981l, C183688Ct c183688Ct, C8HI c8hi, AnonymousClass840 anonymousClass840, C81J c81j, InterfaceC188718Xl interfaceC188718Xl, C188798Xv c188798Xv, InterfaceC1810081c interfaceC1810081c, ClipsCreationViewModel clipsCreationViewModel, final C8LM c8lm, final C8LM c8lm2, int i) {
        C8YN c8yn;
        C8YN c8yn2;
        this.A09 = c8hi;
        this.A07 = c1810981l;
        this.A05 = clipsCreationViewModel;
        this.A0A = anonymousClass840;
        this.A0B = interfaceC1810081c;
        this.A08 = c183688Ct;
        this.A06 = c81j.A3h;
        this.A01 = c188798Xv;
        this.A02 = i;
        if (c81j.A3t) {
            c8lm.getClass();
            c8yn = new C8YN(view, c8lm) { // from class: X.8YM
                public double A00;
                public boolean A01;
                public final View A02;
                public final C8LM A03;

                {
                    C14360o3.A0B(view, 2);
                    this.A03 = c8lm;
                    this.A02 = view;
                }

                @Override // X.C8YN
                public final boolean DJH() {
                    C55982hj c55982hj;
                    if (!this.A01) {
                        return false;
                    }
                    C8MN c8mn = (C8MN) this.A03.A00.getValue();
                    double d = this.A00;
                    double d2 = 0.0d;
                    if (d < 0.0d || (d == 0.0d && c8mn.A01 < c8mn.A05 / 2.0d)) {
                        c55982hj = c8mn.A06;
                        c55982hj.A07(d);
                    } else {
                        c55982hj = c8mn.A06;
                        c55982hj.A07(d);
                        d2 = c8mn.A05;
                    }
                    c55982hj.A06(d2);
                    this.A01 = false;
                    return true;
                }

                @Override // X.C8YN
                public final void Dil(double d) {
                    double d2;
                    if (!this.A01) {
                        ViewParent parent = this.A02.getParent();
                        if (parent != null) {
                            d = 0.0d;
                            this.A00 = 0.0d;
                            this.A01 = true;
                            parent.requestDisallowInterceptTouchEvent(true);
                        } else {
                            return;
                        }
                    }
                    C8MN c8mn = (C8MN) this.A03.A00.getValue();
                    if (!c8mn.A04) {
                        c8mn.A04 = true;
                        c8mn.A06.A01();
                        C8MG c8mg = c8mn.A02;
                        if (c8mg != null) {
                            c8mg.onStart();
                        }
                    }
                    double d3 = c8mn.A00 - d;
                    c8mn.A00 = d3;
                    if (d3 < 0.0d) {
                        c8mn.A03 = C05F.A00;
                        d2 = c8mn.A05 + d3;
                        c8mn.A01 = d2;
                    } else {
                        c8mn.A03 = C05F.A01;
                        c8mn.A01 = d3;
                        d2 = d3;
                    }
                    c8mn.A06.A08(d2, true);
                }

                @Override // X.C8YN
                public final void DHU(double d) {
                    this.A00 = d;
                }
            };
        } else {
            c8yn = AiM.A00;
        }
        this.A0C = c8yn;
        this.A04 = interfaceC188718Xl;
        if (c81j.A3t) {
            c8lm2.getClass();
            c8yn2 = new C8YN(view2, c8lm2) { // from class: X.8YM
                public double A00;
                public boolean A01;
                public final View A02;
                public final C8LM A03;

                {
                    C14360o3.A0B(view2, 2);
                    this.A03 = c8lm2;
                    this.A02 = view2;
                }

                @Override // X.C8YN
                public final boolean DJH() {
                    C55982hj c55982hj;
                    if (!this.A01) {
                        return false;
                    }
                    C8MN c8mn = (C8MN) this.A03.A00.getValue();
                    double d = this.A00;
                    double d2 = 0.0d;
                    if (d < 0.0d || (d == 0.0d && c8mn.A01 < c8mn.A05 / 2.0d)) {
                        c55982hj = c8mn.A06;
                        c55982hj.A07(d);
                    } else {
                        c55982hj = c8mn.A06;
                        c55982hj.A07(d);
                        d2 = c8mn.A05;
                    }
                    c55982hj.A06(d2);
                    this.A01 = false;
                    return true;
                }

                @Override // X.C8YN
                public final void Dil(double d) {
                    double d2;
                    if (!this.A01) {
                        ViewParent parent = this.A02.getParent();
                        if (parent != null) {
                            d = 0.0d;
                            this.A00 = 0.0d;
                            this.A01 = true;
                            parent.requestDisallowInterceptTouchEvent(true);
                        } else {
                            return;
                        }
                    }
                    C8MN c8mn = (C8MN) this.A03.A00.getValue();
                    if (!c8mn.A04) {
                        c8mn.A04 = true;
                        c8mn.A06.A01();
                        C8MG c8mg = c8mn.A02;
                        if (c8mg != null) {
                            c8mg.onStart();
                        }
                    }
                    double d3 = c8mn.A00 - d;
                    c8mn.A00 = d3;
                    if (d3 < 0.0d) {
                        c8mn.A03 = C05F.A00;
                        d2 = c8mn.A05 + d3;
                        c8mn.A01 = d2;
                    } else {
                        c8mn.A03 = C05F.A01;
                        c8mn.A01 = d3;
                        d2 = d3;
                    }
                    c8mn.A06.A08(d2, true);
                }

                @Override // X.C8YN
                public final void DHU(double d) {
                    this.A00 = d;
                }
            };
        } else {
            c8yn2 = AiM.A00;
        }
        this.A0D = c8yn2;
        this.A03 = userSession;
    }

    @Override // X.InterfaceC1829689r
    public final void Du2(float f, float f2) {
        float f3;
        if (A00() != null) {
            f3 = A00().A00;
        } else {
            f3 = 0.0f;
        }
        this.A00 = f3;
    }
}
