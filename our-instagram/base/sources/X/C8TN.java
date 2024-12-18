package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8TN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TN implements InterfaceC1829489p, C8F1, InterfaceC185958Mp, BBw, InterfaceC1810781j, AnonymousClass851 {
    public View A00;
    public boolean A01;
    public boolean A02;
    public C55U A03;
    public java.util.Set A04;
    public boolean A05;
    public final Context A06;
    public final C1825387s A07;
    public final C1824787m A08;
    public final UserSession A09;
    public final C1810981l A0A;
    public final C183688Ct A0B;
    public final C8HI A0C;
    public final C184328Fw A0D;
    public final C88D A0E;
    public final C81J A0F;
    public final C8C0 A0G;
    public final C8FG A0H;
    public final C8FE A0I;
    public final C8GE A0J;
    public final C1814382v A0K;
    public final C8TQ A0L;
    public final C8GF A0M;
    public final InterfaceC1810081c A0N;
    public final C8JU A0O;
    public final C89E A0P;
    public final InteractiveDrawableContainer A0Q;
    public final List A0R = new ArrayList();
    public final boolean A0S;
    public final View A0T;
    public final AbstractC184688Hj A0U;
    public final C1821786b A0V;
    public final C1813982r A0W;
    public final boolean A0X;

    public C8TN(Context context, View view, C1825387s c1825387s, C1824787m c1824787m, UserSession userSession, C1810981l c1810981l, C183688Ct c183688Ct, C8HI c8hi, C184328Fw c184328Fw, C1821786b c1821786b, C88D c88d, C81J c81j, C8C0 c8c0, C8FG c8fg, C8FE c8fe, C1813982r c1813982r, C8GE c8ge, C1814382v c1814382v, C8GF c8gf, InterfaceC1810081c interfaceC1810081c, C8JU c8ju, C89E c89e, InteractiveDrawableContainer interactiveDrawableContainer, boolean z, boolean z2) {
        this.A06 = context;
        this.A0N = interfaceC1810081c;
        interfaceC1810081c.A82(this);
        this.A0F = c81j;
        this.A09 = userSession;
        this.A0A = c1810981l;
        c1810981l.A0G(new AnonymousClass822() { // from class: X.8TO
            @Override // X.AnonymousClass822
            public final void onChanged(Object obj) {
                CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
                C8TN.A03(cameraConfiguration.A03, C8TN.this, cameraConfiguration.A04);
            }
        });
        this.A0K = c1814382v;
        this.A0G = c8c0;
        this.A0V = c1821786b;
        this.A0D = c184328Fw;
        this.A0C = c8hi;
        this.A0J = c8ge;
        this.A0O = c8ju;
        this.A0I = c8fe;
        this.A0P = c89e;
        this.A0B = c183688Ct;
        this.A0L = new C8TQ(this.A09, new C8TP(this), c184328Fw);
        this.A0Q = interactiveDrawableContainer;
        this.A0E = c88d;
        this.A0H = c8fg;
        this.A0M = c8gf;
        this.A0S = z;
        this.A0U = new C8TR(this);
        this.A0T = view;
        A03((C55U) c1810981l.A08.A00, this, (java.util.Set) c1810981l.A09.A00);
        this.A00 = null;
        this.A0W = c1813982r;
        if (!AbstractC184448Gi.A00(context.getApplicationContext())) {
            c1813982r.A04(new C8HL() { // from class: X.9Le
                @Override // X.C8HL
                public final void D1Z() {
                    C8TN.this.A08();
                }
            });
        }
        this.A08 = c1824787m;
        this.A07 = c1825387s;
        this.A0X = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 == X.C88Z.A0Y) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.C88X r7) {
        /*
            r6 = this;
            r3 = 0
            r2 = 1
            if (r7 == 0) goto L17
            X.88Z r4 = r7.A04
            X.88Z r0 = X.C88Z.A0G
            if (r4 == r0) goto L17
            if (r4 != 0) goto Le
            X.88Z r4 = X.C88Z.A0G
        Le:
            X.88Z r0 = X.C88Z.A0g
            if (r4 == r0) goto L17
            X.88Z r0 = X.C88Z.A0Y
            r1 = 0
            if (r4 != r0) goto L18
        L17:
            r1 = 1
        L18:
            r5 = r1 ^ 1
            X.81l r4 = r6.A0A
            X.81v r0 = r4.A07
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
            int r0 = r0.size()
            if (r0 <= r2) goto L5e
            boolean r0 = r4.A0S()
            if (r0 != 0) goto L5e
            X.81v r0 = r4.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L44
            X.8JU r0 = r6.A0O
            X.8KA r0 = r0.Aus()
            X.8K8 r0 = r0.A00
            int r0 = r0.ordinal()
            if (r0 != r3) goto L5e
        L44:
            r1 = 1
        L45:
            X.81W r0 = X.C81W.A0C
            X.81W[] r0 = new X.C81W[]{r0}
            boolean r0 = r4.A0W(r0)
            if (r5 != 0) goto L53
            if (r1 == 0) goto L56
        L53:
            if (r0 != 0) goto L56
            r3 = 1
        L56:
            X.8C0 r0 = r6.A0G
            if (r3 == 0) goto L60
            r0.A0C(r2)
            return
        L5e:
            r1 = 0
            goto L45
        L60:
            r0.A0B(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TN.A09(X.88X):void");
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dep(Drawable drawable, int i, boolean z) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    private void A00() {
        C3DN A01 = C3DN.A00.A01(this.A06);
        if (A01 != null) {
            Fragment A09 = A01.A09();
            if ((A09 instanceof BottomSheetFragment) && (((BottomSheetFragment) A09).A0M() instanceof C214739fB)) {
                A01.A0B();
            }
        }
    }

    private void A01() {
        this.A0K.A00().EkM(true);
        this.A0O.DF1(-1);
        C8FG c8fg = this.A0H;
        if (c8fg != null) {
            C8FP c8fp = c8fg.A0O;
            if (c8fp != null) {
                c8fp.ElN();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    private void A02() {
        InterfaceC1810081c interfaceC1810081c = this.A0N;
        if (interfaceC1810081c.AuH() == EnumC1810381f.A03 && interfaceC1810081c.AuG() != EnumC1810181d.A0j) {
            C8TP c8tp = this.A0L.A01;
            if (!c8tp.A00.A0C.A0V() || C05F.A0N != c8tp.A01()) {
                this.A0K.A00().EkU(false);
            }
        }
    }

    public static void A03(C55U c55u, final C8TN c8tn, java.util.Set set) {
        if (c8tn.A0N.AuH() == EnumC1810381f.A03) {
            java.util.Set set2 = c8tn.A04;
            c8tn.A04 = set;
            c8tn.A03 = c55u;
            A05(c8tn);
            java.util.Set set3 = c8tn.A04;
            C81W c81w = C81W.A0C;
            c8tn.A0Q.A0O = !set3.contains(c81w);
            AnonymousClass832 A00 = c8tn.A0K.A00();
            boolean z = false;
            if (c55u != C128535rM.A00) {
                z = true;
            }
            A00.EW4(z);
            if (set2 != null && set2.contains(c81w) && !c8tn.A04.contains(c81w)) {
                C88D c88d = c8tn.A0E;
                if (!c88d.A03) {
                    c88d.A01.A00();
                }
                c88d.A07(false);
            }
            C11T.A03(new Runnable() { // from class: X.8dm
                @Override // java.lang.Runnable
                public final void run() {
                    C8TN.A06(C8TN.this);
                }
            });
        }
    }

    public static void A04(C8TN c8tn) {
        boolean A00 = C2B0.A00(C05F.A0Q);
        if (c8tn.A0N.AuH() == EnumC1810381f.A03 || !A00) {
            c8tn.A0K.A00().FCn(false, false, false, false, false, c8tn.A0F.A3F, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false);
        }
        c8tn.A0P.A00().A0P(false, true);
        c8tn.A0E.A08(false);
        c8tn.A0O.Edx(true);
    }

    public static void A05(C8TN c8tn) {
        C1810981l c1810981l = c8tn.A0A;
        C81W c81w = C81W.A0T;
        Drawable drawable = null;
        if (c1810981l.A0W(c81w, C81W.A0z)) {
            InterfaceC1810081c interfaceC1810081c = c8tn.A0N;
            if (interfaceC1810081c.AuG() != EnumC1810181d.A0g && interfaceC1810081c.AuG() != EnumC1810181d.A1O) {
                c8tn.A0K.A00().EeN(null);
                if (c1810981l.A0W(c81w)) {
                    return;
                }
            } else {
                Drawable A00 = AbstractC13630mp.A00(c8tn.A0Q.getContext(), R.drawable.instagram_check_pano_filled_24);
                A00.setBounds(0, 0, A00.getIntrinsicWidth(), A00.getIntrinsicHeight());
                c8tn.A0K.A00().EeN(A00);
                return;
            }
        }
        int A002 = AbstractC191348dl.A00(c1810981l.A08());
        if (A002 != -1) {
            C1811981v c1811981v = c1810981l.A08;
            if (c1811981v.A00 != C81S.A00 && !c1810981l.A0W(C81W.A0B, C81W.A0M, C81W.A0D) && !(c1811981v.A00 instanceof C81V)) {
                Context context = c8tn.A0Q.getContext();
                drawable = AbstractC13630mp.A00(context, A002);
                int A003 = C88P.A00(context);
                drawable.setBounds(0, 0, A003, A003);
            }
        }
        c8tn.A0K.A00().EeN(drawable);
    }

    public static void A06(C8TN c8tn) {
        c8tn.A0C.A0U(c8tn.A0U);
    }

    public static void A07(C8TN c8tn) {
        C88X A01;
        C88X A012;
        C8TQ c8tq = c8tn.A0L;
        boolean z = false;
        if (c8tn.A0A.A0W(C81W.A0C)) {
            C8TN c8tn2 = c8tq.A01.A00;
            if (!c8tn2.A01 && c8tn2.A0B.A0D == null && !c8tn2.A0E.A09()) {
                z = true;
            }
        }
        C88D c88d = c8tn.A0E;
        boolean z2 = false;
        if (c88d.A05 && (A012 = c88d.A0H.A01()) != null) {
            if (!C88E.A00(A012)) {
                ACt A013 = c88d.A01(A012);
                if (!(A013 instanceof C218029ka) && !(A013 instanceof C218039kb) && !(A013 instanceof C218119kj)) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        boolean z3 = false;
        if (c88d.A05 && (A01 = c88d.A0H.A01()) != null) {
            z3 = C88E.A00(A01) || !(c88d.A01(A01) instanceof C218069ke);
        }
        c8tn.A0K.A00().FCo(z, z2, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (X.AbstractC184448Gi.A00(r3.A06.getApplicationContext()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08() {
        /*
            r3 = this;
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L30
            X.81l r0 = r3.A0A
            X.81v r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.5rM r0 = X.C128535rM.A00
            if (r1 != r0) goto L25
            X.81c r0 = r3.A0N
            X.81f r1 = r0.AuH()
            X.81f r0 = X.EnumC1810381f.A03
            if (r1 != r0) goto L25
            android.content.Context r0 = r3.A06
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.AbstractC184448Gi.A00(r0)
            r2 = 1
            if (r0 != 0) goto L26
        L25:
            r2 = 0
        L26:
            android.view.View r1 = r3.A00
            r0 = 8
            if (r2 == 0) goto L2d
            r0 = 0
        L2d:
            r1.setVisibility(r0)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TN.A08():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r1.A3m != false) goto L6;
     */
    @Override // X.BBw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D2U(boolean r8) {
        /*
            r7 = this;
            X.81J r1 = r7.A0F
            boolean r5 = r1.A3F
            X.8TQ r0 = r7.A0L
            boolean r4 = r0.A00()
            boolean r3 = r0.A02()
            android.view.View r6 = r7.A0T
            r2 = 8
            if (r8 == 0) goto L19
            boolean r1 = r1.A3m
            r0 = 0
            if (r1 == 0) goto L1b
        L19:
            r0 = 8
        L1b:
            r6.setVisibility(r0)
            if (r8 == 0) goto L3e
            android.view.View r0 = r7.A00
            if (r0 == 0) goto L27
            r0.setVisibility(r2)
        L27:
            X.82v r0 = r7.A0K
            X.832 r2 = r0.A00()
            X.8HI r0 = r7.A0C
            float r1 = r0.A00
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L38
            r0 = 1
        L38:
            r0 = r0 ^ 1
            r2.FCv(r5, r4, r3, r0)
            return
        L3e:
            X.82v r0 = r7.A0K
            X.832 r2 = r0.A00()
            X.8HI r0 = r7.A0C
            float r1 = r0.A00
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L4f
            r0 = 1
        L4f:
            r0 = r0 ^ 1
            r2.FCw(r5, r4, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TN.D2U(boolean):void");
    }

    @Override // X.C8F1
    public final void DCs(boolean z) {
        InterfaceC1810081c interfaceC1810081c = this.A0N;
        if (interfaceC1810081c.AuH() == EnumC1810381f.A03 && interfaceC1810081c.AuG() != EnumC1810181d.A0j) {
            A06(this);
            if (!this.A0E.A09()) {
                this.A0P.A00().A0O(true);
            }
        }
    }

    @Override // X.C8F1
    public final void DCt() {
        if (this.A0N.AuH() == EnumC1810381f.A03) {
            A06(this);
            this.A0P.A00().A0O(false);
        }
    }

    @Override // X.InterfaceC185958Mp
    public final void DFL() {
        InterfaceC1810081c interfaceC1810081c = this.A0N;
        if (interfaceC1810081c.AuH() == EnumC1810381f.A03 && interfaceC1810081c.AuG() != EnumC1810181d.A0j) {
            this.A0K.A00().CMN(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r6.A0O.Aus().A01 == X.C8K9.A04) goto L6;
     */
    @Override // X.AnonymousClass851
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DJ2(float r7, float r8) {
        /*
            r6 = this;
            r5 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L14
            X.8JU r0 = r6.A0O
            X.8KA r0 = r0.Aus()
            X.8K9 r1 = r0.A01
            X.8K9 r0 = X.C8K9.A04
            r3 = 1
            if (r1 != r0) goto L15
        L14:
            r3 = 0
        L15:
            X.82v r0 = r6.A0K
            X.832 r2 = r0.A00()
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r0 = 0
            if (r1 >= 0) goto L21
            r0 = 1
        L21:
            r2.FCr(r3, r0)
            X.86b r0 = r6.A0V
            r0.A00 = r7
            X.C1821786b.A06(r0)
            X.C1821786b.A04(r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L34
            r4 = 1
        L34:
            r6.A05 = r4
            X.89E r0 = r6.A0P
            X.8LD r1 = r0.A00()
            boolean r0 = r6.A05
            r0 = r0 ^ 1
            r1.A0L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TN.DJ2(float, float):void");
    }

    @Override // X.InterfaceC1829489p
    public final void Din(Drawable drawable, float f, float f2, float f3, float f4) {
        if (!this.A0X) {
            C1814382v c1814382v = this.A0K;
            c1814382v.A00().CMN(false);
            A04(this);
            if (drawable instanceof C8P8) {
                c1814382v.A00().CMP();
            }
        }
    }

    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        C183688Ct c183688Ct = this.A0B;
        C8Y6 c8y6 = (C8Y6) c183688Ct.A1x.get();
        if (c8y6 != null && (drawable instanceof BEc)) {
            c8y6.A0H.A00().Dml();
        }
        ((C8NW) c183688Ct.A1h.get()).A1F(drawable, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x010d, code lost:
    
        if (r1.A0n.A0A() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016d, code lost:
    
        if ((r13 instanceof X.C187708Tn) != false) goto L85;
     */
    @Override // X.InterfaceC1810781j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8TN.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC1829489p
    public final void DuD() {
        if (!this.A05 && this.A0N.AuH() == EnumC1810381f.A03) {
            C8TP c8tp = this.A0L.A01;
            if (!c8tp.A00.A0C.A0V() || C05F.A0N != c8tp.A01()) {
                this.A0K.A00().EkU(false);
            }
            A06(this);
            this.A0K.A00().EkY();
        }
    }

    public final void A0A(EnumC1810381f enumC1810381f) {
        C88X A0D;
        A06(this);
        InteractiveDrawableContainer interactiveDrawableContainer = this.A0Q;
        interactiveDrawableContainer.A0v(this);
        C1810981l c1810981l = this.A0A;
        C81W c81w = C81W.A0C;
        interactiveDrawableContainer.A0O = !c1810981l.A0W(c81w);
        C1811981v c1811981v = c1810981l.A08;
        if (c1811981v.A00 instanceof C81V) {
            A05(this);
        } else {
            if (c1810981l.A0W(c81w)) {
                A0D = this.A0E.A0H.A01();
            } else {
                C8FG c8fg = this.A0H;
                if (c8fg != null) {
                    A0D = c8fg.A0D();
                }
            }
            A09(A0D);
        }
        if ((c1811981v.A00 instanceof C208509Kk) && enumC1810381f != null && enumC1810381f == EnumC1810381f.A04) {
            List list = this.A0R;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int ordinal = ((EnumC222679s8) it.next()).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 1) {
                            if (ordinal == 3) {
                                this.A0K.A00().Ekc();
                            }
                        } else {
                            this.A0K.A00().EkY();
                        }
                    } else {
                        this.A0K.A00().EkU(true);
                    }
                } else {
                    this.A0K.A00().Ekh();
                }
            }
            list.clear();
        }
    }

    @Override // X.InterfaceC185958Mp
    public final void DFI() {
        A02();
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        A02();
    }
}
