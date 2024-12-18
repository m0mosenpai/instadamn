package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5Aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113385Aa extends C59W implements InterfaceC1131559d, InterfaceC113395Ab, InterfaceC1131359b {
    public float A00;
    public float A01;
    public float A02;
    public GraphicsLayer A07;
    public GraphicsLayer A08;
    public Object A0A;
    public InterfaceC16660sJ A0B;
    public InterfaceC16660sJ A0C;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final InterfaceC16820sZ A0R;
    public final /* synthetic */ C5AZ A0S;
    public int A04 = Integer.MAX_VALUE;
    public int A03 = Integer.MAX_VALUE;
    public Integer A09 = C05F.A0C;
    public long A05 = 0;
    public boolean A0K = true;
    public final AbstractC113415Ad A0O = new AbstractC113415Ad(this);
    public final C57S A0P = new C57S(new C113385Aa[16]);
    public boolean A0D = true;
    public final InterfaceC16820sZ A0Q = new C9EV(this, 26);
    public long A06 = 0;

    private final void A03(GraphicsLayer graphicsLayer, InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        C5AW c119225ae;
        this.A0G = true;
        boolean z = false;
        if (j == this.A05) {
            z = true;
        }
        if (!z || this.A0N) {
            C5AZ c5az = this.A0S;
            if (c5az.A07 || c5az.A08 || this.A0N) {
                c5az.A0A = true;
                this.A0N = false;
            }
            A0M();
        }
        C5AZ c5az2 = this.A0S;
        AnonymousClass599 anonymousClass599 = c5az2.A0I;
        if (AbstractC119095aR.A00(anonymousClass599)) {
            C59U c59u = anonymousClass599.A0W.A04.A07;
            if (c59u == null || (c119225ae = ((C59V) c59u).A05) == null) {
                c119225ae = new C119225ae(C59M.A00(anonymousClass599));
            }
            C121665fI c121665fI = c5az2.A05;
            C14360o3.A0A(c121665fI);
            AnonymousClass599 A0B = anonymousClass599.A0B();
            if (A0B != null) {
                A0B.A0U.A02 = 0;
            }
            c121665fI.A00 = Integer.MAX_VALUE;
            c119225ae.A05(c121665fI, 0.0f, (int) (j >> 32), (int) (j & 4294967295L));
        }
        C121665fI c121665fI2 = c5az2.A05;
        if (c121665fI2 != null && !c121665fI2.A0D) {
            AbstractC28290Cdc.A01("Error: Placement happened before lookahead.");
            throw C00O.createAndThrow();
        }
        A02(graphicsLayer, this, interfaceC16660sJ, f, j);
    }

    @Override // X.C59W
    public final void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A03(graphicsLayer, null, f, j);
    }

    @Override // X.C59W
    public final void A0K(InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        A03(null, interfaceC16660sJ, f, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        if (r4 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0N() {
        /*
            r5 = this;
            r0 = 1
            r5.A0J = r0
            X.5AZ r0 = r5.A0S
            X.599 r1 = r0.A0I
            X.599 r4 = r1.A0B()
            X.59T r0 = r5.BHu()
            float r3 = r0.A00
            X.59S r0 = r1.A0W
            X.59U r2 = r0.A04
            X.59T r1 = r0.A06
        L17:
            if (r2 == r1) goto L24
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"
            X.C14360o3.A0C(r2, r0)
            float r0 = r2.A00
            float r3 = r3 + r0
            X.59U r2 = r2.A06
            goto L17
        L24:
            float r0 = r5.A02
            r1 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L35
            r5.A02 = r3
            if (r4 == 0) goto L35
            r4.A0O()
            r4.A0J()
        L35:
            boolean r0 = r5.A0F
            if (r0 != 0) goto L69
            if (r4 == 0) goto L3e
            r4.A0J()
        L3e:
            r5.A00()
            boolean r0 = r5.A0M
            if (r0 == 0) goto L69
            if (r4 == 0) goto L6c
            r4.A0Y(r1)
        L4a:
            boolean r0 = r5.A0M
            if (r0 != 0) goto L65
            X.5AZ r2 = r4.A0U
            java.lang.Integer r1 = r2.A06
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L65
            int r1 = r5.A03
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L6f
            int r0 = r2.A03
            r5.A03 = r0
            int r0 = r0 + 1
            r2.A03 = r0
        L65:
            r5.Ch0()
            return
        L69:
            if (r4 == 0) goto L6c
            goto L4a
        L6c:
            r5.A03 = r1
            goto L65
        L6f:
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.AbstractC28290Cdc.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113385Aa.A0N():void");
    }

    @Override // X.InterfaceC113395Ab
    public final void Ch0() {
        AnonymousClass599 anonymousClass599;
        C57S A0A;
        int i;
        this.A0H = true;
        AbstractC113415Ad abstractC113415Ad = this.A0O;
        abstractC113415Ad.A06();
        C5AZ c5az = this.A0S;
        if (c5az.A0A && (i = (A0A = (anonymousClass599 = c5az.A0I).A0A()).A00) > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (anonymousClass5992.A0U.A0H && anonymousClass5992.A0U.A0J.A09 == C05F.A00) {
                    C113385Aa c113385Aa = anonymousClass5992.A0U.A0J;
                    if (c113385Aa.A0I) {
                        Constraints constraints = new Constraints(((C59W) c113385Aa).A04);
                        if (anonymousClass5992.A0F == C05F.A0C) {
                            anonymousClass5992.A0H();
                        }
                        if (anonymousClass5992.A0U.A0J.A0O(constraints.A00)) {
                            anonymousClass599.A0a(false, true, true);
                        }
                    }
                }
                i2++;
            } while (i2 < i);
        }
        if (c5az.A0B || (!this.A0E && !((C59V) BHu()).A02 && c5az.A0A)) {
            c5az.A0A = false;
            Integer num = c5az.A06;
            c5az.A06 = C05F.A0C;
            if (c5az.A08) {
                c5az.A08 = false;
                if (!c5az.A07) {
                    c5az.A01(c5az.A00 - 1);
                }
            }
            AnonymousClass599 anonymousClass5993 = c5az.A0I;
            C5BV c5bv = ((AndroidComposeView) C59M.A00(anonymousClass5993)).A0b;
            c5bv.A00(anonymousClass5993, this.A0Q, c5bv.A01);
            c5az.A06 = num;
            if (((C59V) BHu()).A02 && c5az.A08) {
                requestLayout();
            }
            c5az.A0B = false;
        }
        if (abstractC113415Ad.A05) {
            abstractC113415Ad.A02 = true;
        }
        if (abstractC113415Ad.A01) {
            abstractC113415Ad.A06();
            if (abstractC113415Ad.A00 != null) {
                abstractC113415Ad.A05();
            }
        }
        this.A0H = false;
    }

    public C113385Aa(C5AZ c5az) {
        this.A0S = c5az;
        this.A0R = new C9F8(4, c5az, this);
    }

    private final void A00() {
        boolean z = this.A0F;
        this.A0F = true;
        AnonymousClass599 anonymousClass599 = this.A0S.A0I;
        if (!z) {
            C5AZ c5az = anonymousClass599.A0U;
            if (c5az.A0H) {
                anonymousClass599.A0a(true, true, true);
            } else if (c5az.A0G) {
                anonymousClass599.A0Z(true, true, true);
            }
        }
        C59S c59s = anonymousClass599.A0W;
        C59U c59u = c59s.A06.A06;
        for (C59U c59u2 = c59s.A04; !C14360o3.A0K(c59u2, c59u) && c59u2 != null; c59u2 = c59u2.A06) {
            if (c59u2.A0C) {
                c59u2.A0X();
            }
        }
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (anonymousClass5992.A0U.A0J.A03 != Integer.MAX_VALUE) {
                    anonymousClass5992.A0U.A0J.A00();
                    AnonymousClass599.A08(anonymousClass5992);
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A01() {
        Integer num;
        AnonymousClass599 anonymousClass599 = this.A0S.A0I;
        anonymousClass599.A0a(false, true, true);
        AnonymousClass599 A0B = anonymousClass599.A0B();
        if (A0B != null && anonymousClass599.A0F == C05F.A0C) {
            int intValue = A0B.A0U.A06.intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    num = A0B.A0F;
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A00;
            }
            anonymousClass599.A0F = num;
        }
    }

    public static final void A02(GraphicsLayer graphicsLayer, C113385Aa c113385Aa, InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        C5AZ c5az = c113385Aa.A0S;
        AnonymousClass599 anonymousClass599 = c5az.A0I;
        if (!(!anonymousClass599.A0L)) {
            AbstractC28290Cdc.A00("place is called on a deactivated node");
            throw C00O.createAndThrow();
        }
        c5az.A06 = C05F.A0C;
        c113385Aa.A05 = j;
        c113385Aa.A00 = f;
        c113385Aa.A0B = interfaceC16660sJ;
        c113385Aa.A07 = graphicsLayer;
        c113385Aa.A0L = true;
        c113385Aa.A0J = false;
        InterfaceC1128457r A00 = C59M.A00(anonymousClass599);
        if (!c5az.A0A && c113385Aa.A0F) {
            C59U c59u = anonymousClass599.A0W.A04;
            C59U.A08(graphicsLayer, c59u, interfaceC16660sJ, f, C119235af.A01(j, ((C59W) c59u).A02));
            c113385Aa.A0N();
        } else {
            c113385Aa.A0O.A03 = false;
            if (c5az.A07) {
                c5az.A07 = false;
                if (!c5az.A08) {
                    c5az.A01(c5az.A00 - 1);
                }
            }
            c113385Aa.A0C = interfaceC16660sJ;
            c113385Aa.A06 = j;
            c113385Aa.A01 = f;
            c113385Aa.A08 = graphicsLayer;
            C5BV c5bv = ((AndroidComposeView) A00).A0b;
            c5bv.A00(anonymousClass599, c113385Aa.A0R, c5bv.A02);
        }
        c5az.A06 = C05F.A0Y;
    }

    public static final void A04(C113385Aa c113385Aa) {
        if (c113385Aa.A0F) {
            int i = 0;
            c113385Aa.A0F = false;
            AnonymousClass599 anonymousClass599 = c113385Aa.A0S.A0I;
            C59S c59s = anonymousClass599.A0W;
            C59U c59u = c59s.A06.A06;
            for (C59U c59u2 = c59s.A04; !C14360o3.A0K(c59u2, c59u) && c59u2 != null; c59u2 = c59u2.A06) {
                c59u2.A0b();
            }
            C57S A0A = anonymousClass599.A0A();
            int i2 = A0A.A00;
            if (i2 > 0) {
                Object[] objArr = A0A.A02;
                do {
                    A04(((AnonymousClass599) objArr[i]).A0U.A0J);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final List A0L() {
        AnonymousClass599 anonymousClass599 = this.A0S.A0I;
        anonymousClass599.A0S();
        boolean z = this.A0D;
        C57S c57s = this.A0P;
        if (z) {
            C57S A0A = anonymousClass599.A0A();
            int i = A0A.A00;
            if (i > 0) {
                Object[] objArr = A0A.A02;
                int i2 = 0;
                do {
                    AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                    int i3 = c57s.A00;
                    C113385Aa c113385Aa = anonymousClass5992.A0U.A0J;
                    if (i3 <= i2) {
                        c57s.A09(c113385Aa);
                    } else {
                        c57s.A02[i2] = c113385Aa;
                    }
                    i2++;
                } while (i2 < i);
            }
            c57s.A03(anonymousClass599.A0F().size(), c57s.A00);
            this.A0D = false;
        }
        List list = c57s.A01;
        if (list == null) {
            C119075aP c119075aP = new C119075aP(c57s);
            c57s.A01 = c119075aP;
            return c119075aP;
        }
        return list;
    }

    public final void A0M() {
        C57S A0A;
        int i;
        C5AZ c5az = this.A0S;
        if (c5az.A00 > 0 && (i = (A0A = c5az.A0I.A0A()).A00) > 0) {
            Object[] objArr = A0A.A02;
            int i2 = 0;
            do {
                AnonymousClass599 anonymousClass599 = (AnonymousClass599) objArr[i2];
                C5AZ c5az2 = anonymousClass599.A0U;
                if ((c5az2.A08 || c5az2.A07) && !c5az2.A0A) {
                    anonymousClass599.A0Y(false);
                }
                c5az2.A0J.A0M();
                i2++;
            } while (i2 < i);
        }
    }

    public final boolean A0O(long j) {
        boolean z;
        C5AZ c5az = this.A0S;
        AnonymousClass599 anonymousClass599 = c5az.A0I;
        boolean z2 = true;
        if (!(!anonymousClass599.A0L)) {
            AbstractC28290Cdc.A00("measure is called on a deactivated node");
        } else {
            InterfaceC1128457r A00 = C59M.A00(anonymousClass599);
            AnonymousClass599 A0B = anonymousClass599.A0B();
            if (anonymousClass599.A0I || (A0B != null && A0B.A0I)) {
                z = true;
            } else {
                z = false;
            }
            anonymousClass599.A0I = z;
            if (!anonymousClass599.A0U.A0H && super.A04 == j) {
                ((AndroidComposeView) A00).A0a.A0B(anonymousClass599, false);
                anonymousClass599.A0R();
                return false;
            }
            this.A0O.A04 = false;
            AWN(C119045aM.A00);
            this.A0I = true;
            C59S c59s = anonymousClass599.A0W;
            long j2 = ((C59W) c59s.A04).A03;
            A0I(j);
            Integer num = c5az.A06;
            Integer num2 = C05F.A0Y;
            if (num == num2) {
                Integer num3 = C05F.A00;
                c5az.A06 = num3;
                c5az.A0H = false;
                c5az.A04 = j;
                C5BV c5bv = ((AndroidComposeView) C59M.A00(anonymousClass599)).A0b;
                c5bv.A00(anonymousClass599, c5az.A0K, c5bv.A06);
                if (c5az.A06 == num3) {
                    c5az.A0A = true;
                    c5az.A0B = true;
                    c5az.A06 = num2;
                }
                C59U c59u = c59s.A04;
                if (((C59W) c59u).A03 == j2 && ((C59W) c59u).A01 == super.A01 && ((C59W) c59u).A00 == super.A00) {
                    z2 = false;
                }
                A0H(AbstractC119215ad.A00(((C59W) c59u).A01, ((C59W) c59u).A00));
                return z2;
            }
            AbstractC28290Cdc.A01("layout state is not idle before measure starts");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC113395Ab
    public final void AWN(InterfaceC16660sJ interfaceC16660sJ) {
        C57S A0A = this.A0S.A0I.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                interfaceC16660sJ.invoke(((AnonymousClass599) objArr[i2]).A0U.A0J);
                i2++;
            } while (i2 < i);
        }
    }

    @Override // X.C59X
    public final int AX8(AbstractC122975hY abstractC122975hY) {
        Integer num;
        AnonymousClass599 anonymousClass599 = this.A0S.A0I;
        AnonymousClass599 A0B = anonymousClass599.A0B();
        Integer num2 = null;
        if (A0B != null) {
            num = A0B.A0U.A06;
        } else {
            num = null;
        }
        if (num == C05F.A00) {
            this.A0O.A06 = true;
        } else {
            if (A0B != null) {
                num2 = A0B.A0U.A06;
            }
            if (num2 == C05F.A0C) {
                this.A0O.A05 = true;
            }
        }
        this.A0E = true;
        int AX8 = anonymousClass599.A0W.A04.AX8(abstractC122975hY);
        this.A0E = false;
        return AX8;
    }

    @Override // X.InterfaceC113395Ab
    public final AbstractC113415Ad Aav() {
        return this.A0O;
    }

    @Override // X.InterfaceC113395Ab
    public final C59T BHu() {
        return this.A0S.A0I.A0W.A06;
    }

    @Override // X.InterfaceC113395Ab
    public final InterfaceC113395Ab BbG() {
        C5AZ c5az;
        AnonymousClass599 A0B = this.A0S.A0I.A0B();
        if (A0B != null && (c5az = A0B.A0U) != null) {
            return c5az.A0J;
        }
        return null;
    }

    @Override // X.InterfaceC113395Ab
    public final boolean CaU() {
        return this.A0F;
    }

    @Override // X.InterfaceC1131559d
    public final C59W CpF(long j) {
        C5AZ c5az = this.A0S;
        AnonymousClass599 anonymousClass599 = c5az.A0I;
        Integer num = anonymousClass599.A0F;
        Integer num2 = C05F.A0C;
        if (num == num2) {
            anonymousClass599.A0H();
        }
        if (AbstractC119095aR.A00(anonymousClass599)) {
            C121665fI c121665fI = c5az.A05;
            C14360o3.A0A(c121665fI);
            c121665fI.A05 = num2;
            c121665fI.CpF(j);
        }
        AnonymousClass599 A0B = anonymousClass599.A0B();
        if (A0B != null) {
            if (this.A09 != num2 && !anonymousClass599.A0I) {
                AbstractC28290Cdc.A01("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                throw C00O.createAndThrow();
            }
            Integer num3 = A0B.A0U.A06;
            int intValue = num3.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    num2 = C05F.A01;
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0R("Measurable could be only measured from the parent's measure or layout block. Parents state is ", AbstractC33633Etj.A00(num3)));
                }
            } else {
                num2 = C05F.A00;
            }
        }
        this.A09 = num2;
        A0O(j);
        return this;
    }

    @Override // X.InterfaceC113395Ab
    public final void EJB() {
        this.A0S.A0I.A0a(false, true, true);
    }

    @Override // X.InterfaceC1131359b
    public final void Eat(boolean z) {
        C59U c59u = this.A0S.A0I.A0W.A04;
        boolean z2 = ((C59V) c59u).A01;
        if (z != z2) {
            ((C59V) c59u).A01 = z2;
            this.A0N = true;
        }
    }

    @Override // X.InterfaceC113395Ab
    public final void requestLayout() {
        this.A0S.A0I.A0Y(false);
    }

    @Override // X.InterfaceC1131659e
    public final int Cnj(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.Cnj(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cnm(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.Cnm(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cpe(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.Cpe(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cph(int i) {
        A01();
        return this.A0S.A0I.A0W.A04.Cph(i);
    }
}
