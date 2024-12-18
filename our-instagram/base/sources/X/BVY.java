package X;

import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

/* loaded from: classes5.dex */
public final class BVY implements C6M4 {
    public static final C5C7 A0b = C6M5.A00(BWG.A00, BW9.A00);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public InterfaceC30985Djh A0A;
    public InterfaceC74953Yl A0B;
    public InterfaceC74953Yl A0C;
    public InterfaceC1128957x A0D;
    public boolean A0E;
    public boolean A0F;
    public final C6M4 A0G;
    public final C5XO A0H;
    public final AwaitFirstLayoutModifier A0I;
    public final C6M8 A0J;
    public final C6MF A0K;
    public final C6MJ A0L;
    public final C6MH A0M;
    public final C25659BVv A0N;
    public final InterfaceC119545bC A0O;
    public final InterfaceC119545bC A0P;
    public final InterfaceC74953Yl A0Q;
    public final InterfaceC74953Yl A0R;
    public final InterfaceC74953Yl A0S;
    public final InterfaceC74953Yl A0T;
    public final InterfaceC74953Yl A0U;
    public final InterfaceC74953Yl A0V;
    public final InterfaceC74953Yl A0W;
    public final InterfaceC74953Yl A0X;
    public final InterfaceC74963Ym A0Y;
    public final InterfaceC74963Ym A0Z;
    public final InterfaceC118925a9 A0a;

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public BVY(InterfaceC16820sZ interfaceC16820sZ, float f, int i) {
        double d = f;
        if (-0.5d <= d && d <= 0.5d) {
            this.A0X = AbstractC25230BEn.A0U(AbstractC25225BEi.A0R(0L));
            this.A0J = new C25658BVu(this);
            this.A0N = new C25659BVv(this, f, i);
            this.A02 = i;
            this.A07 = Long.MAX_VALUE;
            this.A0G = new C6MA(DRS.A00(this, 49));
            this.A0E = true;
            this.A04 = -1;
            BVX bvx = AbstractC25656BVs.A00;
            C6M9 c6m9 = C6M9.A00;
            C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
            this.A0C = new ParcelableSnapshotMutableState(c6m9, bvx);
            this.A0D = AbstractC25656BVs.A01;
            this.A0H = new C5XN();
            this.A0O = new ParcelableSnapshotMutableIntState(-1);
            this.A0P = new ParcelableSnapshotMutableIntState(i);
            this.A0Y = DGT.A00(AbstractC74873Yc.A00(), this, 22);
            this.A0Z = DGT.A00(AbstractC74873Yc.A00(), this, 23);
            this.A0M = new C6MH(null);
            this.A0K = new C6MF();
            this.A0I = new Object();
            this.A0W = AbstractC25229BEm.A0R(null);
            this.A0a = new C25679BWp(this, 2);
            this.A09 = C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            this.A0L = new C6MJ();
            this.A0V = AbstractC25327BIw.A00();
            this.A0U = AbstractC25327BIw.A00();
            this.A0R = AbstractC25229BEm.A0R(false);
            this.A0Q = AbstractC25229BEm.A0R(false);
            this.A0T = AbstractC25229BEm.A0R(false);
            this.A0S = AbstractC25229BEm.A0R(false);
            this.A0B = AbstractC25229BEm.A0R(interfaceC16820sZ);
            return;
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0Z("currentPageOffsetFraction ", " is not within the range -0.5 to 0.5", f));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object A01(X.EnumC27348C5d r6, X.BVY r7, X.InterfaceC23621Ds r8, X.InterfaceC16620sF r9) {
        /*
            r5 = 2
            boolean r0 = X.MAL.A01(r8, r5)
            if (r0 == 0) goto L75
            r4 = r8
            X.MAL r4 = (X.MAL) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r2 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 == r0) goto L41
            if (r1 != r5) goto L7b
            java.lang.Object r7 = r4.A01
            X.BVY r7 = (X.BVY) r7
            X.AbstractC09560e7.A00(r2)
        L29:
            r1 = -1
            X.5bC r0 = r7.A0O
            r0.EWE(r1)
            X.0eB r0 = X.C0eB.A00
            return r0
        L32:
            X.AbstractC09560e7.A00(r2)
            X.AbstractC25235BEs.A1J(r7, r6, r9, r4, r0)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r7.A0I
            java.lang.Object r0 = r0.A00(r4)
            if (r0 != r3) goto L50
            return r3
        L41:
            java.lang.Object r9 = r4.A03
            X.0sF r9 = (X.InterfaceC16620sF) r9
            java.lang.Object r6 = r4.A02
            X.C5d r6 = (X.EnumC27348C5d) r6
            java.lang.Object r7 = r4.A01
            X.BVY r7 = (X.BVY) r7
            X.AbstractC09560e7.A00(r2)
        L50:
            X.6M4 r2 = r7.A0G
            boolean r0 = r2.CcT()
            if (r0 != 0) goto L65
            X.BVv r0 = r7.A0N
            X.5bC r0 = r0.A05
            int r1 = r0.BIi()
            X.5bC r0 = r7.A0P
            r0.EWE(r1)
        L65:
            r4.A01 = r7
            r0 = 0
            r4.A02 = r0
            r4.A03 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.EMA(r6, r4, r9)
            if (r0 != r3) goto L29
            return r3
        L75:
            X.MAL r4 = new X.MAL
            r4.<init>(r7, r8, r5)
            goto L15
        L7b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVY.A01(X.C5d, X.BVY, X.1Ds, X.0sF):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(X.C5Y6 r15, X.InterfaceC23621Ds r16, int r17) {
        /*
            r14 = this;
            r8 = r15
            r5 = r17
            r12 = 0
            r4 = r16
            boolean r0 = r4 instanceof X.C29626D3b
            if (r0 == 0) goto L91
            r3 = r4
            X.D3b r3 = (X.C29626D3b) r3
            int r2 = r3.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r3.A01 = r2
        L18:
            java.lang.Object r7 = r3.A04
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A01
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 == r6) goto L5c
            if (r0 != r4) goto L97
            X.AbstractC09560e7.A00(r7)
        L29:
            X.0eB r2 = X.C0eB.A00
        L2b:
            return r2
        L2c:
            X.AbstractC09560e7.A00(r7)
            X.BVv r1 = r14.A0N
            X.5bC r0 = r1.A05
            int r0 = r0.BIi()
            if (r5 != r0) goto L44
            X.57F r0 = r1.A04
            float r0 = r0.B72()
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L44
            goto L29
        L44:
            int r0 = r14.A04()
            if (r0 == 0) goto L29
            r3.A02 = r14
            r3.A03 = r15
            r3.A00 = r5
            r3.A01 = r6
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r14.A0I
            java.lang.Object r0 = r0.A00(r3)
            if (r0 == r2) goto L2b
            r1 = r14
            goto L69
        L5c:
            int r5 = r3.A00
            java.lang.Object r8 = r3.A03
            X.5Y6 r8 = (X.C5Y6) r8
            java.lang.Object r1 = r3.A02
            X.BVY r1 = (X.BVY) r1
            X.AbstractC09560e7.A00(r7)
        L69:
            int r13 = A00(r1, r5)
            int r0 = r1.A05()
            float r0 = (float) r0
            float r12 = r12 * r0
            X.6M8 r9 = r1.A0J
            r0 = 8
            X.DRy r11 = new X.DRy
            r11.<init>(r1, r0)
            r10 = 0
            r3.A02 = r10
            r3.A03 = r10
            r3.A01 = r4
            X.XPB r0 = X.AbstractC25656BVs.A01
            androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2 r7 = new androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Object r0 = r9.EMB(r3, r7)
            if (r0 != r2) goto L29
            return r2
        L91:
            X.D3b r3 = new X.D3b
            r3.<init>(r14, r4)
            goto L18
        L97:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BVY.A06(X.5Y6, X.1Ds, int):java.lang.Object");
    }

    @Override // X.C6M4
    public final Object EMA(EnumC27348C5d enumC27348C5d, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        return A01(enumC27348C5d, this, interfaceC23621Ds, interfaceC16620sF);
    }

    public final float A02() {
        InterfaceC1128957x interfaceC1128957x = this.A0D;
        XPB xpb = AbstractC25656BVs.A01;
        return Math.min(interfaceC1128957x.EqT(56.0f), AbstractC166987dD.A02(((BVX) this.A0C.getValue()).A05)) / ((BVX) r2.getValue()).A05;
    }

    public final int A03() {
        return this.A0N.A05.BIi();
    }

    public final int A04() {
        return AbstractC166987dD.A0H(AbstractC25226BEj.A1C(this.A0B.getValue()));
    }

    public final int A05() {
        InterfaceC74953Yl interfaceC74953Yl = this.A0C;
        return ((BVX) interfaceC74953Yl.getValue()).A05 + ((BVX) interfaceC74953Yl.getValue()).A06;
    }

    public final void A07(int i, float f) {
        C25659BVv c25659BVv = this.A0N;
        c25659BVv.A05.EWE(i);
        c25659BVv.A02.A00(i);
        c25659BVv.A04.EUc(f);
        c25659BVv.A00 = null;
        C59A c59a = (C59A) this.A0W.getValue();
        if (c59a != null) {
            c59a.AWW();
        }
    }

    public final void A08(BVX bvx, boolean z) {
        Object obj;
        int i;
        int i2;
        InterfaceC16660sJ interfaceC16660sJ;
        int A00;
        float A01;
        boolean z2;
        int i3;
        float f;
        InterfaceC30985Djh interfaceC30985Djh;
        InterfaceC30985Djh interfaceC30985Djh2;
        C25659BVv c25659BVv = this.A0N;
        if (z) {
            c25659BVv.A04.EUc(bvx.A00);
        } else {
            BWF bwf = bvx.A0B;
            if (bwf != null) {
                obj = bwf.A06;
            } else {
                obj = null;
            }
            c25659BVv.A00 = obj;
            if (c25659BVv.A01 || AbstractC166987dD.A1b(bvx.A0F)) {
                c25659BVv.A01 = true;
                if (bwf != null) {
                    i = bwf.A03;
                } else {
                    i = 0;
                }
                float f2 = bvx.A00;
                c25659BVv.A05.EWE(i);
                c25659BVv.A02.A00(i);
                c25659BVv.A04.EUc(f2);
            }
            if (this.A04 != -1) {
                List list = bvx.A0F;
                if (AbstractC166987dD.A1b(list)) {
                    if (this.A0F) {
                        i2 = ((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0K(list))).A03 + bvx.A04 + 1;
                    } else {
                        i2 = (((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0I(list))).A03 - bvx.A04) - 1;
                    }
                    if (this.A04 != i2) {
                        this.A04 = -1;
                        InterfaceC30985Djh interfaceC30985Djh3 = this.A0A;
                        if (interfaceC30985Djh3 != null) {
                            interfaceC30985Djh3.cancel();
                        }
                        this.A0A = null;
                    }
                }
            }
        }
        InterfaceC74953Yl interfaceC74953Yl = this.A0C;
        interfaceC74953Yl.Egh(bvx);
        AbstractC25227BEk.A1A(this.A0R, bvx.A02);
        BWF bwf2 = bvx.A0C;
        boolean z3 = false;
        if ((bwf2 != null && bwf2.A03 != 0) || bvx.A01 != 0) {
            z3 = true;
        }
        AbstractC25227BEk.A1A(this.A0Q, z3);
        if (bwf2 != null) {
            this.A02 = bwf2.A03;
        }
        this.A03 = bvx.A01;
        Snapshot A02 = C3Z5.A02();
        if (A02 != null) {
            interfaceC16660sJ = A02.A03();
        } else {
            interfaceC16660sJ = null;
        }
        Snapshot A03 = C3Z5.A03(A02);
        try {
            float f3 = this.A01;
            if (Math.abs(f3) > 0.5f && this.A0E) {
                C6M3 c6m3 = AbstractC25230BEn.A0S(interfaceC74953Yl).A09;
                C6M3 c6m32 = C6M3.Vertical;
                float signum = Math.signum(f3);
                InterfaceC74953Yl interfaceC74953Yl2 = this.A0X;
                long j = ((C119365at) interfaceC74953Yl2.getValue()).A00;
                if (c6m3 == c6m32) {
                    A01 = C119365at.A02(j);
                } else {
                    A01 = C119365at.A01(j);
                }
                if (signum == Math.signum(-A01) || (((int) C119365at.A01(((C119365at) interfaceC74953Yl2.getValue()).A00)) == 0 && ((int) C119365at.A02(((C119365at) interfaceC74953Yl2.getValue()).A00)) == 0)) {
                    float f4 = this.A01;
                    List list2 = bvx.A0F;
                    if (!list2.isEmpty()) {
                        if (f4 > 0.0f) {
                            z2 = true;
                            i3 = ((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0K(list2))).A03 + bvx.A04 + 1;
                        } else {
                            z2 = false;
                            i3 = (((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0I(list2))).A03 - bvx.A04) - 1;
                        }
                        if (i3 >= 0 && i3 < A04()) {
                            if (i3 != this.A04) {
                                if (this.A0F != z2 && (interfaceC30985Djh2 = this.A0A) != null) {
                                    interfaceC30985Djh2.cancel();
                                }
                                this.A0F = z2;
                                this.A04 = i3;
                                this.A0A = this.A0M.A00(i3, this.A09);
                            }
                            if (z2) {
                                f = (((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0K(list2))).A01 + (bvx.A05 + bvx.A06)) - bvx.A07;
                            } else {
                                f = bvx.A08 - ((BWF) ((InterfaceC30776DgD) AbstractC001800i.A0I(list2))).A01;
                                f4 = -f4;
                            }
                            if (f < f4 && (interfaceC30985Djh = this.A0A) != null) {
                                interfaceC30985Djh.Cmw();
                            }
                        }
                    }
                }
            }
            C3Z5.A06(A02, A03, interfaceC16660sJ);
            this.A07 = AbstractC25656BVs.A00(bvx, A04());
            int A04 = A04();
            C6M3 c6m33 = bvx.A09;
            C6M3 c6m34 = C6M3.Horizontal;
            long A0s = AbstractC25232BEp.A0s(bvx.A0J);
            if (c6m33 == c6m34) {
                A00 = AbstractC25225BEi.A06(A0s);
            } else {
                A00 = C119055aN.A00(A0s);
            }
            this.A08 = C17s.A03(bvx.A0A.E4p(A00, bvx.A05, -bvx.A08, bvx.A03, 0, A04), 0, A00);
        } catch (Throwable th) {
            C3Z5.A06(A02, A03, interfaceC16660sJ);
            throw th;
        }
    }

    @Override // X.C6M4
    public final float APr(float f) {
        return this.A0G.APr(f);
    }

    @Override // X.C6M4
    public final boolean Akm() {
        return AbstractC25230BEn.A1X(this.A0Q);
    }

    @Override // X.C6M4
    public final boolean Akn() {
        return AbstractC25230BEn.A1X(this.A0R);
    }

    @Override // X.C6M4
    public final boolean CcT() {
        return this.A0G.CcT();
    }

    public static final int A00(BVY bvy, int i) {
        if (bvy.A04() <= 0) {
            return 0;
        }
        return C17s.A03(i, 0, bvy.A04() - 1);
    }
}
