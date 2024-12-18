package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import java.util.Map;

/* renamed from: X.5fI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121665fI extends C59W implements InterfaceC1131559d, InterfaceC113395Ab, InterfaceC1131359b {
    public GraphicsLayer A03;
    public Constraints A04;
    public Object A06;
    public InterfaceC16660sJ A07;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final /* synthetic */ C5AZ A0J;
    public int A01 = Integer.MAX_VALUE;
    public int A00 = Integer.MAX_VALUE;
    public Integer A05 = C05F.A0C;
    public long A02 = 0;
    public final AbstractC113415Ad A0I = new AbstractC113415Ad(this);
    public final C57S A0H = new C57S(new C121665fI[16]);
    public boolean A08 = true;
    public boolean A0C = true;

    @Override // X.C59W
    public final void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A02(graphicsLayer, this, null, j);
    }

    @Override // X.C59W
    public final void A0K(InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        A02(null, this, interfaceC16660sJ, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r2 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0N() {
        /*
            r3 = this;
            r0 = 1
            r3.A0B = r0
            X.5AZ r0 = r3.A0J
            X.599 r0 = r0.A0I
            X.599 r2 = r0.A0B()
            boolean r0 = r3.A09
            r1 = 0
            if (r0 != 0) goto L3f
            r3.A00()
            boolean r0 = r3.A0E
            if (r0 == 0) goto L3f
            if (r2 == 0) goto L42
            r2.A0X(r1)
        L1c:
            boolean r0 = r3.A0E
            if (r0 != 0) goto L3b
            X.5AZ r2 = r2.A0U
            java.lang.Integer r1 = r2.A06
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L2c
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L3b
        L2c:
            int r1 = r3.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L45
            int r0 = r2.A02
            r3.A00 = r0
            int r0 = r0 + 1
            r2.A02 = r0
        L3b:
            r3.Ch0()
            return
        L3f:
            if (r2 == 0) goto L42
            goto L1c
        L42:
            r3.A00 = r1
            goto L3b
        L45:
            java.lang.String r0 = "Place was called on a node which was placed already"
            X.AbstractC28290Cdc.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121665fI.A0N():void");
    }

    @Override // X.InterfaceC113395Ab
    public final void Ch0() {
        InterfaceC16660sJ interfaceC16660sJ;
        AnonymousClass599 anonymousClass599;
        C57S A0A;
        int i;
        Integer num;
        Constraints constraints;
        this.A0A = true;
        AbstractC113415Ad abstractC113415Ad = this.A0I;
        abstractC113415Ad.A06();
        C5AZ c5az = this.A0J;
        if (c5az.A0E && (i = (A0A = (anonymousClass599 = c5az.A0I).A0A()).A00) > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (anonymousClass5992.A0U.A0G) {
                    C121665fI c121665fI = anonymousClass5992.A0U.A05;
                    if (c121665fI != null) {
                        num = c121665fI.A05;
                    } else {
                        num = C05F.A0C;
                    }
                    if (num == C05F.A00) {
                        C5AZ c5az2 = anonymousClass5992.A0U;
                        C121665fI c121665fI2 = c5az2.A05;
                        C14360o3.A0A(c121665fI2);
                        C121665fI c121665fI3 = c5az2.A05;
                        if (c121665fI3 != null) {
                            constraints = c121665fI3.A04;
                        } else {
                            constraints = null;
                        }
                        C14360o3.A0A(constraints);
                        if (c121665fI2.A0O(constraints.A00)) {
                            anonymousClass599.A0Z(false, true, true);
                        }
                    }
                }
                i2++;
            } while (i2 < i);
        }
        AbstractC137606Lg A0V = BHu().A0V();
        C14360o3.A0A(A0V);
        if (c5az.A0F || (!this.A0F && !((C59V) A0V).A02 && c5az.A0E)) {
            c5az.A0E = false;
            Integer num2 = c5az.A06;
            c5az.A06 = C05F.A0N;
            AnonymousClass599 anonymousClass5993 = c5az.A0I;
            InterfaceC1128457r A00 = C59M.A00(anonymousClass5993);
            if (c5az.A0D) {
                c5az.A0D = false;
                if (!c5az.A0C) {
                    c5az.A02(c5az.A01 - 1);
                }
            }
            C5BV c5bv = ((AndroidComposeView) A00).A0b;
            C57261Pbj c57261Pbj = new C57261Pbj(4, A0V, this, c5az);
            if (anonymousClass5993.A08 != null) {
                interfaceC16660sJ = c5bv.A04;
            } else {
                interfaceC16660sJ = c5bv.A01;
            }
            c5bv.A00(anonymousClass5993, c57261Pbj, interfaceC16660sJ);
            c5az.A06 = num2;
            if (c5az.A0D && ((C59V) A0V).A02) {
                requestLayout();
            }
            c5az.A0F = false;
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
        this.A0A = false;
    }

    public C121665fI(C5AZ c5az) {
        this.A0J = c5az;
        this.A06 = c5az.A0J.A0A;
    }

    private final void A00() {
        boolean z = this.A09;
        this.A09 = true;
        if (!z) {
            C5AZ c5az = this.A0J;
            if (c5az.A0G) {
                c5az.A0I.A0Z(true, true, true);
            }
        }
        C57S A0A = this.A0J.A0I.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass599 = (AnonymousClass599) objArr[i2];
                C121665fI c121665fI = anonymousClass599.A0U.A05;
                if (c121665fI != null) {
                    if (c121665fI.A00 != Integer.MAX_VALUE) {
                        c121665fI.A00();
                        AnonymousClass599.A08(anonymousClass599);
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                }
            } while (i2 < i);
        }
    }

    private final void A01() {
        Integer num;
        AnonymousClass599 anonymousClass599 = this.A0J.A0I;
        anonymousClass599.A0Z(false, true, true);
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

    public static final void A02(GraphicsLayer graphicsLayer, C121665fI c121665fI, InterfaceC16660sJ interfaceC16660sJ, long j) {
        InterfaceC16660sJ interfaceC16660sJ2;
        C5AZ c5az = c121665fI.A0J;
        AnonymousClass599 anonymousClass599 = c5az.A0I;
        if (!(!anonymousClass599.A0L)) {
            AbstractC28290Cdc.A00("place is called on a deactivated node");
            throw C00O.createAndThrow();
        }
        c5az.A06 = C05F.A0N;
        c121665fI.A0D = true;
        c121665fI.A0B = false;
        if (j != c121665fI.A02) {
            if (c5az.A0C || c5az.A0D) {
                c5az.A0E = true;
            }
            c121665fI.A0M();
        }
        InterfaceC1128457r A00 = C59M.A00(anonymousClass599);
        if (!c5az.A0E && c121665fI.A09) {
            AbstractC137606Lg A0V = anonymousClass599.A0W.A04.A0V();
            C14360o3.A0A(A0V);
            AbstractC137606Lg.A01(A0V, C119235af.A01(j, ((C59W) A0V).A02));
            c121665fI.A0N();
        } else {
            if (c5az.A0C) {
                c5az.A0C = false;
                if (!c5az.A0D) {
                    c5az.A02(c5az.A01 - 1);
                }
            }
            c121665fI.A0I.A03 = false;
            C5BV c5bv = ((AndroidComposeView) A00).A0b;
            B63 b63 = new B63(j, A00, c5az, 0);
            if (anonymousClass599.A08 != null) {
                interfaceC16660sJ2 = c5bv.A03;
            } else {
                interfaceC16660sJ2 = c5bv.A02;
            }
            c5bv.A00(anonymousClass599, b63, interfaceC16660sJ2);
        }
        c121665fI.A02 = j;
        c121665fI.A07 = interfaceC16660sJ;
        c121665fI.A03 = graphicsLayer;
        c5az.A06 = C05F.A0Y;
    }

    public static final void A03(C121665fI c121665fI) {
        if (c121665fI.A09) {
            int i = 0;
            c121665fI.A09 = false;
            C57S A0A = c121665fI.A0J.A0I.A0A();
            int i2 = A0A.A00;
            if (i2 > 0) {
                Object[] objArr = A0A.A02;
                do {
                    C121665fI c121665fI2 = ((AnonymousClass599) objArr[i]).A0U.A05;
                    C14360o3.A0A(c121665fI2);
                    A03(c121665fI2);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final Map A0L() {
        if (!this.A0F) {
            C5AZ c5az = this.A0J;
            Integer num = c5az.A06;
            Integer num2 = C05F.A01;
            AbstractC113415Ad abstractC113415Ad = this.A0I;
            if (num == num2) {
                abstractC113415Ad.A04 = true;
                if (abstractC113415Ad.A01) {
                    c5az.A0E = true;
                    c5az.A0F = true;
                }
            } else {
                abstractC113415Ad.A03 = true;
            }
        }
        C59T BHu = BHu();
        AbstractC137606Lg A0V = BHu.A0V();
        if (A0V != null) {
            ((C59V) A0V).A02 = true;
        }
        Ch0();
        AbstractC137606Lg A0V2 = BHu.A0V();
        if (A0V2 != null) {
            ((C59V) A0V2).A02 = false;
        }
        return this.A0I.A08;
    }

    public final void A0M() {
        C57S A0A;
        int i;
        C5AZ c5az = this.A0J;
        if (c5az.A01 > 0 && (i = (A0A = c5az.A0I.A0A()).A00) > 0) {
            Object[] objArr = A0A.A02;
            int i2 = 0;
            do {
                AnonymousClass599 anonymousClass599 = (AnonymousClass599) objArr[i2];
                C5AZ c5az2 = anonymousClass599.A0U;
                if ((c5az2.A0D || c5az2.A0C) && !c5az2.A0E) {
                    anonymousClass599.A0X(false);
                }
                C121665fI c121665fI = c5az2.A05;
                if (c121665fI != null) {
                    c121665fI.A0M();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final boolean A0O(long j) {
        boolean z;
        long A00;
        InterfaceC16660sJ interfaceC16660sJ;
        Constraints constraints;
        C5AZ c5az = this.A0J;
        AnonymousClass599 anonymousClass599 = c5az.A0I;
        if (!(!anonymousClass599.A0L)) {
            AbstractC28290Cdc.A00("measure is called on a deactivated node");
        } else {
            AnonymousClass599 A0B = anonymousClass599.A0B();
            if (anonymousClass599.A0I || (A0B != null && A0B.A0I)) {
                z = true;
            } else {
                z = false;
            }
            anonymousClass599.A0I = z;
            if (!anonymousClass599.A0U.A0G && (constraints = this.A04) != null && constraints.A00 == j) {
                InterfaceC1128457r interfaceC1128457r = anonymousClass599.A0A;
                if (interfaceC1128457r != null) {
                    ((AndroidComposeView) interfaceC1128457r).A0a.A0B(anonymousClass599, true);
                }
                anonymousClass599.A0R();
                return false;
            }
            this.A04 = new Constraints(j);
            A0I(j);
            this.A0I.A04 = false;
            AWN(C29975DJn.A00);
            if (this.A0G) {
                A00 = super.A03;
            } else {
                A00 = AbstractC119215ad.A00(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            this.A0G = true;
            AbstractC137606Lg A0V = anonymousClass599.A0W.A04.A0V();
            if (A0V != null) {
                c5az.A06 = C05F.A01;
                c5az.A0G = false;
                C5BV c5bv = ((AndroidComposeView) C59M.A00(anonymousClass599)).A0b;
                C9GY c9gy = new C9GY(j, c5az, 0);
                if (anonymousClass599.A08 != null) {
                    interfaceC16660sJ = c5bv.A05;
                } else {
                    interfaceC16660sJ = c5bv.A06;
                }
                c5bv.A00(anonymousClass599, c9gy, interfaceC16660sJ);
                c5az.A0E = true;
                c5az.A0F = true;
                if (AbstractC119095aR.A00(anonymousClass599)) {
                    c5az.A0A = true;
                    c5az.A0B = true;
                } else {
                    c5az.A0H = true;
                }
                c5az.A06 = C05F.A0Y;
                A0H(AbstractC119215ad.A00(((C59W) A0V).A01, ((C59W) A0V).A00));
                if (((int) (A00 >> 32)) != ((C59W) A0V).A01 || C119055aN.A00(A00) != ((C59W) A0V).A00) {
                    return true;
                }
                return false;
            }
            AbstractC28290Cdc.A01("Lookahead result from lookaheadRemeasure cannot be null");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC113395Ab
    public final void AWN(InterfaceC16660sJ interfaceC16660sJ) {
        C57S A0A = this.A0J.A0I.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                C121665fI c121665fI = ((AnonymousClass599) objArr[i2]).A0U.A05;
                C14360o3.A0A(c121665fI);
                interfaceC16660sJ.invoke(c121665fI);
                i2++;
            } while (i2 < i);
        }
    }

    @Override // X.C59X
    public final int AX8(AbstractC122975hY abstractC122975hY) {
        Integer num;
        AnonymousClass599 anonymousClass599 = this.A0J.A0I;
        AnonymousClass599 A0B = anonymousClass599.A0B();
        Integer num2 = null;
        if (A0B != null) {
            num = A0B.A0U.A06;
        } else {
            num = null;
        }
        if (num == C05F.A01) {
            this.A0I.A06 = true;
        } else {
            if (A0B != null) {
                num2 = A0B.A0U.A06;
            }
            if (num2 == C05F.A0N) {
                this.A0I.A05 = true;
            }
        }
        this.A0F = true;
        AbstractC137606Lg A0V = anonymousClass599.A0W.A04.A0V();
        C14360o3.A0A(A0V);
        int AX8 = A0V.AX8(abstractC122975hY);
        this.A0F = false;
        return AX8;
    }

    @Override // X.InterfaceC113395Ab
    public final AbstractC113415Ad Aav() {
        return this.A0I;
    }

    @Override // X.InterfaceC113395Ab
    public final C59T BHu() {
        return this.A0J.A0I.A0W.A06;
    }

    @Override // X.InterfaceC113395Ab
    public final InterfaceC113395Ab BbG() {
        C5AZ c5az;
        AnonymousClass599 A0B = this.A0J.A0I.A0B();
        if (A0B != null && (c5az = A0B.A0U) != null) {
            return c5az.A05;
        }
        return null;
    }

    @Override // X.InterfaceC113395Ab
    public final boolean CaU() {
        return this.A09;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1 == X.C05F.A0N) goto L11;
     */
    @Override // X.InterfaceC1131559d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C59W CpF(long r8) {
        /*
            r7 = this;
            X.5AZ r3 = r7.A0J
            X.599 r5 = r3.A0I
            X.599 r2 = r5.A0B()
            r1 = 0
            if (r2 == 0) goto L37
            X.5AZ r0 = r2.A0U
            java.lang.Integer r0 = r0.A06
        Lf:
            java.lang.Integer r6 = X.C05F.A01
            if (r0 == r6) goto L1d
            if (r2 == 0) goto L19
            X.5AZ r0 = r2.A0U
            java.lang.Integer r1 = r0.A06
        L19:
            java.lang.Integer r0 = X.C05F.A0N
            if (r1 != r0) goto L20
        L1d:
            r0 = 0
            r3.A09 = r0
        L20:
            if (r2 == 0) goto L5c
            java.lang.Integer r0 = r7.A05
            java.lang.Integer r4 = X.C05F.A0C
            r3 = 1
            if (r0 == r4) goto L39
            boolean r0 = r5.A0I
            if (r0 != 0) goto L39
            java.lang.String r0 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            X.AbstractC28290Cdc.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L37:
            r0 = r1
            goto Lf
        L39:
            X.5AZ r0 = r2.A0U
            java.lang.Integer r2 = r0.A06
            int r1 = r2.intValue()
            if (r1 == r3) goto L60
            r0 = 0
            if (r1 == r0) goto L60
            r0 = 2
            if (r1 == r0) goto L62
            r0 = 3
            if (r1 == r0) goto L62
            java.lang.String r1 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            java.lang.String r0 = X.AbstractC33633Etj.A00(r2)
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L5c:
            java.lang.Integer r6 = X.C05F.A0C
            r4 = r6
            goto L62
        L60:
            java.lang.Integer r6 = X.C05F.A00
        L62:
            r7.A05 = r6
            java.lang.Integer r0 = r5.A0F
            if (r0 != r4) goto L6b
            r5.A0H()
        L6b:
            r7.A0O(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121665fI.CpF(long):X.59W");
    }

    @Override // X.InterfaceC113395Ab
    public final void EJB() {
        this.A0J.A0I.A0Z(false, true, true);
    }

    @Override // X.InterfaceC1131359b
    public final void Eat(boolean z) {
        Boolean bool;
        AbstractC137606Lg A0V;
        C59S c59s = this.A0J.A0I.A0W;
        AbstractC137606Lg A0V2 = c59s.A04.A0V();
        if (A0V2 != null) {
            bool = Boolean.valueOf(((C59V) A0V2).A01);
        } else {
            bool = null;
        }
        if (!C14360o3.A0K(Boolean.valueOf(z), bool) && (A0V = c59s.A04.A0V()) != null) {
            ((C59V) A0V).A01 = z;
        }
    }

    @Override // X.InterfaceC113395Ab
    public final void requestLayout() {
        this.A0J.A0I.A0X(false);
    }

    @Override // X.InterfaceC1131659e
    public final int Cnj(int i) {
        A01();
        AbstractC137606Lg A0V = this.A0J.A0I.A0W.A04.A0V();
        C14360o3.A0A(A0V);
        return A0V.Cnj(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cnm(int i) {
        A01();
        AbstractC137606Lg A0V = this.A0J.A0I.A0W.A04.A0V();
        C14360o3.A0A(A0V);
        return A0V.Cnm(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cpe(int i) {
        A01();
        AbstractC137606Lg A0V = this.A0J.A0I.A0W.A04.A0V();
        C14360o3.A0A(A0V);
        return A0V.Cpe(i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cph(int i) {
        A01();
        AbstractC137606Lg A0V = this.A0J.A0I.A0W.A04.A0V();
        C14360o3.A0A(A0V);
        return A0V.Cph(i);
    }
}
