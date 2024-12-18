package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.59U, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C59U extends C59V implements InterfaceC1131459c, InterfaceC1131559d, C59D {
    public float A00;
    public C119515b8 A02;
    public GraphicsLayer A03;
    public InterfaceC119205ac A04;
    public C5AI A05;
    public C59U A06;
    public C59U A07;
    public InterfaceC119265ai A08;
    public InterfaceC1128957x A09;
    public InterfaceC16660sJ A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public AnonymousClass583 A0F;
    public Map A0G;
    public final AnonymousClass599 A0H;
    public static final InterfaceC16660sJ A0P = C1131859g.A00;
    public static final InterfaceC16660sJ A0O = C1131959h.A00;
    public static final C1132059i A0K = new C1132059i();
    public static final C5AI A0L = new C5AI();
    public static final float[] A0Q = C5AJ.A06();
    public static final C5AL A0M = new C5AL() { // from class: X.5AK
        @Override // X.C5AL
        public final boolean Eim(AnonymousClass599 anonymousClass599) {
            return true;
        }

        @Override // X.C5AL
        public final void AHK(C5BP c5bp, AnonymousClass599 anonymousClass599, long j, boolean z, boolean z2) {
            C59S c59s = anonymousClass599.A0W;
            C59U c59u = c59s.A04;
            float[] fArr = C59U.A0Q;
            c59s.A04.A0h(c5bp, C59U.A0M, c59u.A0R(j), z, z2);
        }

        @Override // X.C5AL
        public final int ASv() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v3, types: [X.57S] */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v6, types: [X.57S] */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r8v0, types: [X.58J] */
        /* JADX WARN: Type inference failed for: r8v1, types: [X.58J] */
        /* JADX WARN: Type inference failed for: r8v10 */
        /* JADX WARN: Type inference failed for: r8v11 */
        /* JADX WARN: Type inference failed for: r8v3 */
        /* JADX WARN: Type inference failed for: r8v4, types: [X.58J] */
        /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v6 */
        /* JADX WARN: Type inference failed for: r8v7 */
        /* JADX WARN: Type inference failed for: r8v8 */
        /* JADX WARN: Type inference failed for: r8v9 */
        @Override // X.C5AL
        public final boolean COq(C58J c58j) {
            ?? r4 = 0;
            while (c58j != 0) {
                if (c58j instanceof C5DX) {
                    if (((C5DX) c58j).COp()) {
                        return true;
                    }
                } else if ((c58j.A01 & 16) != 0 && (c58j instanceof C5AY)) {
                    C58J c58j2 = c58j.A00;
                    int i = 0;
                    r4 = r4;
                    c58j = c58j;
                    while (c58j2 != null) {
                        if ((c58j2.A01 & 16) != 0) {
                            i++;
                            r4 = r4;
                            if (i == 1) {
                                c58j = c58j2;
                            } else {
                                if (r4 == 0) {
                                    r4 = new C57S(new C58J[16]);
                                }
                                if (c58j != 0) {
                                    r4.A09(c58j);
                                    c58j = 0;
                                }
                                r4.A09(c58j2);
                            }
                        }
                        c58j2 = c58j2.A02;
                        r4 = r4;
                        c58j = c58j;
                    }
                    if (i == 1) {
                    }
                }
                c58j = AbstractC114335Dx.A00(r4);
            }
            return false;
        }
    };
    public static final C5AL A0N = new C5AL() { // from class: X.5AM
        @Override // X.C5AL
        public final boolean COq(C58J c58j) {
            return false;
        }

        @Override // X.C5AL
        public final void AHK(C5BP c5bp, AnonymousClass599 anonymousClass599, long j, boolean z, boolean z2) {
            C59S c59s = anonymousClass599.A0W;
            C59U c59u = c59s.A04;
            float[] fArr = C59U.A0Q;
            c59s.A04.A0h(c5bp, C59U.A0N, c59u.A0R(j), true, z2);
        }

        @Override // X.C5AL
        public final int ASv() {
            return 8;
        }

        @Override // X.C5AL
        public final boolean Eim(AnonymousClass599 anonymousClass599) {
            C113505An A0C = anonymousClass599.A0C();
            boolean z = false;
            if (A0C != null && A0C.A00) {
                z = true;
            }
            return !z;
        }
    };
    public float A0E = 0.8f;
    public long A01 = 0;
    public final InterfaceC16620sF A0J = new C206989Ed(this, 10);
    public final InterfaceC16820sZ A0I = new C9EV(this, 28);

    public static final void A03(C58J c58j, C5BP c5bp, C5AL c5al, C59U c59u, float f, long j, boolean z, boolean z2) {
        if (c58j == null) {
            c59u.A0g(c5bp, c5al, j, z, z2);
        } else {
            c5bp.A02(c58j, new C72077XMv(c58j, c5bp, c5al, c59u, f, j, z, z2), f, z2);
        }
    }

    public static final void A04(C58J c58j, C5BP c5bp, C5AL c5al, C59U c59u, float f, long j, boolean z, boolean z2) {
        if (c58j == null) {
            c59u.A0g(c5bp, c5al, j, z, z2);
            return;
        }
        if (c5al.COq(c58j)) {
            YL0 yl0 = new YL0(c58j, c5bp, c5al, c59u, f, j, z, z2);
            int i = c5bp.A00;
            int size = c5bp.size() - 1;
            if (i == size) {
                c5bp.A02(c58j, yl0, f, z2);
                if (c5bp.A00 + 1 != c5bp.size() - 1) {
                    return;
                }
                C5BP.A01(c5bp);
                return;
            }
            long A00 = C5BP.A00(c5bp);
            c5bp.A00 = size;
            c5bp.A02(c58j, yl0, f, z2);
            int i2 = c5bp.A00 + 1;
            int size2 = c5bp.size();
            if (i2 < size2 - 1 && AbstractC25296BHp.A00(A00, C5BP.A00(c5bp)) > 0) {
                int i3 = i + 1;
                Object[] objArr = c5bp.A04;
                AbstractC06960Yn.A0W(objArr, objArr, i3, i2, size2);
                long[] jArr = c5bp.A03;
                System.arraycopy(jArr, i2, jArr, i3, c5bp.size() - i2);
                c5bp.A00 = ((c5bp.size() + i) - c5bp.A00) - 1;
            }
            C5BP.A01(c5bp);
            c5bp.A00 = i;
            return;
        }
        A04(AbstractC25295BHo.A00(c58j, c5al.ASv()), c5bp, c5al, c59u, f, j, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if ((r5.A00 & 16) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if ((r5.A01 & 16) == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r8 = r5;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if ((r8 instanceof X.C5DX) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (((X.C5DX) r8).Ehx() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r8 = X.AbstractC114335Dx.A00(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        if (r8 == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if ((r8.A01 & 16) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if ((r8 instanceof X.C5AY) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        r2 = r8.A00;
        r1 = 0;
        r4 = r4;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        if ((r2.A01 & 16) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        r1 = r1 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        if (r1 != 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
    
        r2 = r2.A02;
        r4 = r4;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
    
        if (r4 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        r4 = new X.C57S(new X.C58J[16]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
    
        if (r8 == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008c, code lost:
    
        r4.A09(r8);
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
    
        r4.A09(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
    
        if (r1 != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
    
        r5 = r5.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a0, code lost:
    
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [X.58J] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C58J r11, X.C5BP r12, X.C5AL r13, X.C59U r14, long r15, boolean r17, boolean r18) {
        /*
            r9 = r11
            r10 = r12
            r11 = r13
            r12 = r14
            r13 = r15
            r15 = r17
            r1 = r18
            if (r9 != 0) goto L15
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = r13
            r7 = r15
            r8 = r1
            r2.A0g(r3, r4, r5, r7, r8)
        L14:
            return
        L15:
            X.XMt r8 = new X.XMt
            r16 = r1
            r8.<init>(r9, r10, r11, r12, r13, r15, r16)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.A02(r9, r8, r0, r1)
            X.59U r1 = r9.A05
            r7 = 0
            if (r1 == 0) goto L14
            r6 = 16
            X.0vq r0 = X.AbstractC114275Dr.A00
            X.58J r1 = A01(r1, r7)
            if (r1 == 0) goto La3
            boolean r0 = r1.A08
            if (r0 == 0) goto La3
            X.58J r5 = r1.A03
            boolean r0 = r5.A08
            if (r0 != 0) goto L44
            java.lang.String r0 = "visitLocalDescendants called on an unattached node"
            X.AbstractC28290Cdc.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L44:
            int r0 = r5.A00
            r0 = r0 & 16
            if (r0 == 0) goto La3
        L4a:
            int r0 = r5.A01
            r0 = r0 & 16
            if (r0 == 0) goto L9e
            r9 = 0
            r8 = r5
            r4 = r9
        L53:
            boolean r0 = r8 instanceof X.C5DX
            r3 = 1
            if (r0 == 0) goto L61
            X.5DX r8 = (X.C5DX) r8
            boolean r0 = r8.Ehx()
            if (r0 == 0) goto L94
            return
        L61:
            int r0 = r8.A01
            r0 = r0 & 16
            if (r0 == 0) goto L94
            boolean r0 = r8 instanceof X.C5AY
            if (r0 == 0) goto L94
            r0 = r8
            X.5AY r0 = (X.C5AY) r0
            X.58J r2 = r0.A00
            r1 = 0
        L71:
            if (r2 == 0) goto L99
            int r0 = r2.A01
            r0 = r0 & 16
            if (r0 == 0) goto L7e
            int r1 = r1 + 1
            if (r1 != r3) goto L81
            r8 = r2
        L7e:
            X.58J r2 = r2.A02
            goto L71
        L81:
            if (r4 != 0) goto L8a
            X.58J[] r0 = new X.C58J[r6]
            X.57S r4 = new X.57S
            r4.<init>(r0)
        L8a:
            if (r8 == 0) goto L90
            r4.A09(r8)
            r8 = r9
        L90:
            r4.A09(r2)
            goto L7e
        L94:
            X.58J r8 = X.AbstractC114335Dx.A00(r4)
            goto L9b
        L99:
            if (r1 != r3) goto L94
        L9b:
            if (r8 == 0) goto L9e
            goto L53
        L9e:
            X.58J r5 = r5.A02
            if (r5 == 0) goto La3
            goto L4a
        La3:
            r10.A02 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59U.A05(X.58J, X.5BP, X.5AL, X.59U, long, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [X.58J] */
    public static final void A07(AnonymousClass585 anonymousClass585, GraphicsLayer graphicsLayer, C59U c59u) {
        C5AY A0U = c59u.A0U(4);
        if (A0U == 0) {
            c59u.A0d(anonymousClass585, graphicsLayer);
            return;
        }
        C1128757v c1128757v = ((AndroidComposeView) C59M.A00(c59u.A0H)).A0Z;
        long A01 = AbstractC119215ad.A01(((C59W) c59u).A03);
        ?? r0 = 0;
        do {
            if (A0U instanceof InterfaceC113445Ag) {
                c1128757v.A00(anonymousClass585, graphicsLayer, (InterfaceC113445Ag) A0U, c59u, A01);
            } else if ((A0U.A01 & 4) != 0 && (A0U instanceof C5AY)) {
                C58J c58j = A0U.A00;
                int i = 0;
                r0 = r0;
                A0U = A0U;
                while (c58j != null) {
                    if ((c58j.A01 & 4) != 0) {
                        i++;
                        r0 = r0;
                        if (i == 1) {
                            A0U = c58j;
                        } else {
                            if (r0 == 0) {
                                r0 = new C57S(new C58J[16]);
                            }
                            if (A0U != 0) {
                                r0.A09(A0U);
                                A0U = 0;
                            }
                            r0.A09(c58j);
                        }
                    }
                    c58j = c58j.A02;
                    r0 = r0;
                    A0U = A0U;
                }
                if (i == 1) {
                }
            }
            A0U = AbstractC114335Dx.A00(r0);
        } while (A0U != 0);
    }

    public static final void A08(GraphicsLayer graphicsLayer, C59U c59u, InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        if (graphicsLayer != null) {
            if (interfaceC16660sJ == null) {
                if (c59u.A03 != graphicsLayer) {
                    c59u.A03 = null;
                    c59u.A0i(null, false);
                    c59u.A03 = graphicsLayer;
                }
                if (c59u.A08 == null) {
                    AnonymousClass599 anonymousClass599 = c59u.A0H;
                    InterfaceC1128457r A00 = C59M.A00(anonymousClass599);
                    InterfaceC16620sF interfaceC16620sF = c59u.A0J;
                    InterfaceC16820sZ interfaceC16820sZ = c59u.A0I;
                    InterfaceC119265ai AMT = A00.AMT(graphicsLayer, interfaceC16820sZ, interfaceC16620sF);
                    AMT.EK5(((C59W) c59u).A03);
                    AMT.Cpt(j);
                    c59u.A08 = AMT;
                    anonymousClass599.A0K = true;
                    interfaceC16820sZ.invoke();
                }
            } else {
                AbstractC28290Cdc.A00("both ways to create layers shouldn't be used together");
                throw C00O.createAndThrow();
            }
        } else {
            if (c59u.A03 != null) {
                c59u.A03 = null;
                c59u.A0i(null, false);
            }
            c59u.A0i(interfaceC16660sJ, false);
        }
        if (c59u.A01 != j) {
            c59u.A01 = j;
            AnonymousClass599 anonymousClass5992 = c59u.A0H;
            anonymousClass5992.A0U.A0J.A0M();
            InterfaceC119265ai interfaceC119265ai = c59u.A08;
            if (interfaceC119265ai != null) {
                interfaceC119265ai.Cpt(j);
            } else {
                C59U c59u2 = c59u.A07;
                if (c59u2 != null) {
                    c59u2.A0X();
                }
            }
            C59V.A0D(c59u);
            InterfaceC1128457r interfaceC1128457r = anonymousClass5992.A0A;
            if (interfaceC1128457r != null) {
                interfaceC1128457r.DOd(anonymousClass5992);
            }
        }
        c59u.A00 = f;
        if (!((C59V) c59u).A02) {
            C59V.A0C(c59u, new C119245ag(c59u.A0N(), c59u));
        }
    }

    private final void A0B(C59U c59u, float[] fArr) {
        C59U c59u2 = this;
        while (!C14360o3.A0K(c59u2, c59u)) {
            InterfaceC119265ai interfaceC119265ai = c59u2.A08;
            if (interfaceC119265ai != null) {
                interfaceC119265ai.F8K(fArr);
            }
            if (c59u2.A01 != 0) {
                float[] fArr2 = A0Q;
                C5AJ.A02(fArr2);
                C5AJ.A04(fArr2, (int) (r3 >> 32), (int) (r3 & 4294967295L));
                C5AJ.A05(fArr, fArr2);
            }
            c59u2 = c59u2.A07;
            C14360o3.A0A(c59u2);
        }
    }

    @Override // X.C59W
    public void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        A08(graphicsLayer, this, null, f, j);
    }

    @Override // X.C59W
    public void A0K(InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        A08(null, this, interfaceC16660sJ, f, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r6.A0F != r3.A0D) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0i(X.InterfaceC16660sJ r7, boolean r8) {
        /*
            r6 = this;
            r4 = 0
            if (r7 == 0) goto L11
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r6.A03
            if (r0 == 0) goto L11
            java.lang.String r0 = "layerBlock can't be provided when explicitLayer is provided"
            X.AbstractC28290Cdc.A00(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L11:
            X.599 r3 = r6.A0H
            if (r8 != 0) goto L2a
            X.0sJ r0 = r6.A0A
            if (r0 != r7) goto L2a
            X.57x r1 = r6.A09
            X.57x r0 = r3.A0C
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L2a
            X.583 r1 = r6.A0F
            X.583 r0 = r3.A0D
            r5 = 0
            if (r1 == r0) goto L2b
        L2a:
            r5 = 1
        L2b:
            X.57x r0 = r3.A0C
            r6.A09 = r0
            X.583 r0 = r3.A0D
            r6.A0F = r0
            X.57r r1 = r3.A0A
            r0 = 0
            if (r1 == 0) goto L39
            r0 = 1
        L39:
            r2 = 0
            if (r0 == 0) goto L6d
            if (r7 == 0) goto L6d
            r6.A0A = r7
            X.5ai r0 = r6.A08
            if (r0 != 0) goto L66
            X.57r r1 = X.C59M.A00(r3)
            X.0sF r0 = r6.A0J
            X.0sZ r4 = r6.A0I
            X.5ai r2 = r1.AMT(r2, r4, r0)
            long r0 = r6.A03
            r2.EK5(r0)
            long r0 = r6.A01
            r2.Cpt(r0)
            r6.A08 = r2
            r0 = 1
            A09(r6, r0)
            r3.A0K = r0
            r4.invoke()
        L65:
            return
        L66:
            if (r5 == 0) goto L65
            r0 = 1
            A09(r6, r0)
            return
        L6d:
            r6.A0A = r2
            X.5ai r0 = r6.A08
            if (r0 == 0) goto L8d
            r0.destroy()
            r0 = 1
            r3.A0K = r0
            X.0sZ r0 = r6.A0I
            r0.invoke()
            X.58J r0 = r6.A0T()
            boolean r0 = r0.A08
            if (r0 == 0) goto L8d
            X.57r r0 = r3.A0A
            if (r0 == 0) goto L8d
            r0.DOd(r3)
        L8d:
            r6.A08 = r2
            r6.A0C = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59U.A0i(X.0sJ, boolean):void");
    }

    @Override // X.InterfaceC1131459c
    public final long Chl(InterfaceC1131459c interfaceC1131459c, long j) {
        return Chm(interfaceC1131459c, j, true);
    }

    @Override // X.InterfaceC1131459c
    public final long Chm(InterfaceC1131459c interfaceC1131459c, long j, boolean z) {
        if (interfaceC1131459c instanceof C119505b7) {
            ((C119505b7) interfaceC1131459c).A00.A04.A0Y();
            return interfaceC1131459c.Chm(this, j ^ (-9223372034707292160L), true) ^ (-9223372034707292160L);
        }
        C59U A02 = A02(interfaceC1131459c);
        A02.A0Y();
        C59U A0W = A0W(A02);
        while (A02 != A0W) {
            j = A02.A0S(j);
            A02 = A02.A07;
            C14360o3.A0A(A02);
        }
        return A00(A0W, j);
    }

    private final long A00(C59U c59u, long j) {
        if (c59u == this) {
            return j;
        }
        C59U c59u2 = this.A07;
        if (c59u2 != null && !C14360o3.A0K(c59u, c59u2)) {
            return A0R(c59u2.A00(c59u, j));
        }
        return A0R(j);
    }

    public static final C58J A01(C59U c59u, boolean z) {
        C58J A0T;
        C59S c59s = c59u.A0H.A0W;
        if (c59s.A04 == c59u) {
            return c59s.A02;
        }
        C59U c59u2 = c59u.A07;
        if (z) {
            if (c59u2 == null || (A0T = c59u2.A0T()) == null) {
                return null;
            }
            return A0T.A02;
        }
        if (c59u2 == null) {
            return null;
        }
        return c59u2.A0T();
    }

    public static final C59U A02(InterfaceC1131459c interfaceC1131459c) {
        C119505b7 c119505b7;
        C59U c59u;
        if (!(interfaceC1131459c instanceof C119505b7) || (c119505b7 = (C119505b7) interfaceC1131459c) == null || (c59u = c119505b7.A00.A04) == null) {
            C14360o3.A0C(interfaceC1131459c, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            return (C59U) interfaceC1131459c;
        }
        return c59u;
    }

    private final void A06(C119515b8 c119515b8, C59U c59u, boolean z) {
        if (c59u != this) {
            C59U c59u2 = this.A07;
            if (c59u2 != null) {
                c59u2.A06(c119515b8, c59u, z);
            }
            long j = this.A01;
            float f = (int) (j >> 32);
            c119515b8.A01 -= f;
            c119515b8.A02 -= f;
            float f2 = (int) (j & 4294967295L);
            c119515b8.A03 -= f2;
            c119515b8.A00 -= f2;
            InterfaceC119265ai interfaceC119265ai = this.A08;
            if (interfaceC119265ai != null) {
                interfaceC119265ai.Cmr(c119515b8, true);
                if (this.A0B && z) {
                    long j2 = ((C59W) this).A03;
                    c119515b8.A00(0.0f, 0.0f, (int) (j2 >> 32), C119055aN.A00(j2));
                }
            }
        }
    }

    public static final void A09(C59U c59u, boolean z) {
        InterfaceC1128457r interfaceC1128457r;
        if (c59u.A03 == null) {
            InterfaceC119265ai interfaceC119265ai = c59u.A08;
            if (interfaceC119265ai != null) {
                InterfaceC16660sJ interfaceC16660sJ = c59u.A0A;
                if (interfaceC16660sJ != null) {
                    C1132059i c1132059i = A0K;
                    c1132059i.Ed7(1.0f);
                    c1132059i.Ed8(1.0f);
                    c1132059i.EPa(1.0f);
                    c1132059i.EgF(0.0f);
                    c1132059i.EgG(0.0f);
                    c1132059i.Edo(0.0f);
                    long j = AbstractC1132259k.A00;
                    c1132059i.EPf(j);
                    c1132059i.Eeg(j);
                    c1132059i.Ecv(0.0f);
                    c1132059i.Ecw(0.0f);
                    c1132059i.Ecx(0.0f);
                    c1132059i.EQp(8.0f);
                    c1132059i.EgB(C5AD.A01);
                    c1132059i.Edp(C5AF.A00);
                    c1132059i.ERU(false);
                    c1132059i.EcY(null);
                    c1132059i.ERu(0);
                    c1132059i.A0D = 9205357640488583168L;
                    c1132059i.A0G = null;
                    c1132059i.A0B = 0;
                    AnonymousClass599 anonymousClass599 = c59u.A0H;
                    c1132059i.A0J = anonymousClass599.A0C;
                    c1132059i.A0K = anonymousClass599.A0D;
                    c1132059i.A0D = AbstractC119215ad.A01(((C59W) c59u).A03);
                    ((AndroidComposeView) C59M.A00(anonymousClass599)).A0b.A00(c59u, new C9EV(interfaceC16660sJ, 29), A0P);
                    C5AI c5ai = c59u.A05;
                    if (c5ai == null) {
                        c5ai = new C5AI();
                        c59u.A05 = c5ai;
                    }
                    c5ai.A04 = c1132059i.A05;
                    c5ai.A05 = c1132059i.A06;
                    c5ai.A06 = c1132059i.A08;
                    c5ai.A07 = c1132059i.A09;
                    c5ai.A01 = c1132059i.A02;
                    c5ai.A02 = c1132059i.A03;
                    c5ai.A03 = c1132059i.A04;
                    c5ai.A00 = c1132059i.A01;
                    c5ai.A08 = c1132059i.A0F;
                    interfaceC119265ai.FBI(c1132059i);
                    c59u.A0B = c1132059i.A0L;
                    c59u.A0E = c1132059i.A00;
                    if (z && (interfaceC1128457r = anonymousClass599.A0A) != null) {
                        interfaceC1128457r.DOd(anonymousClass599);
                        return;
                    }
                    return;
                }
                AbstractC28290Cdc.A02("updateLayerParameters requires a non-null layerBlock");
            } else if (c59u.A0A == null) {
                return;
            } else {
                AbstractC28290Cdc.A01("null layer with a non-null layerBlock");
            }
            throw C00O.createAndThrow();
        }
    }

    public final long A0R(long j) {
        long j2 = this.A01;
        long A00 = AbstractC119395aw.A00(C119365at.A01(j) - ((int) (j2 >> 32)), C119365at.A02(j) - ((int) (j2 & 4294967295L)));
        InterfaceC119265ai interfaceC119265ai = this.A08;
        if (interfaceC119265ai != null) {
            return interfaceC119265ai.Cms(A00, true);
        }
        return A00;
    }

    public final long A0S(long j) {
        InterfaceC119265ai interfaceC119265ai = this.A08;
        if (interfaceC119265ai != null) {
            j = interfaceC119265ai.Cms(j, false);
        }
        long j2 = this.A01;
        return AbstractC119395aw.A00(C119365at.A01(j) + ((int) (j2 >> 32)), C119365at.A02(j) + ((int) (j2 & 4294967295L)));
    }

    public final C58J A0T() {
        if (this instanceof C118815Zd) {
            return ((C58J) ((C118815Zd) this).A01).A03;
        }
        return ((C59T) this).A01;
    }

    public final C58J A0U(int i) {
        C18630vq c18630vq = AbstractC114275Dr.A00;
        boolean z = false;
        if ((128 & i) != 0) {
            z = true;
        }
        C58J A0T = A0T();
        if (z || (A0T = A0T.A04) != null) {
            for (C58J A01 = A01(this, z); A01 != null && (A01.A00 & i) != 0; A01 = A01.A02) {
                if ((A01.A01 & i) != 0) {
                    return A01;
                }
                if (A01 == A0T) {
                    break;
                }
            }
        }
        return null;
    }

    public final AbstractC137606Lg A0V() {
        if (this instanceof C118815Zd) {
            return ((C118815Zd) this).A02;
        }
        return ((C59T) this).A00;
    }

    public final C59U A0W(C59U c59u) {
        AnonymousClass599 anonymousClass599 = c59u.A0H;
        AnonymousClass599 anonymousClass5992 = anonymousClass599;
        AnonymousClass599 anonymousClass5993 = this.A0H;
        AnonymousClass599 anonymousClass5994 = anonymousClass5993;
        if (anonymousClass599 == anonymousClass5993) {
            C58J A0T = c59u.A0T();
            C58J c58j = A0T().A03;
            if (!c58j.A08) {
                AbstractC28290Cdc.A01("visitLocalAncestors called on an unattached node");
                throw C00O.createAndThrow();
            }
            while (true) {
                c58j = c58j.A04;
                if (c58j != null) {
                    if ((c58j.A01 & 2) != 0 && c58j == A0T) {
                        return c59u;
                    }
                } else {
                    return this;
                }
            }
        } else {
            while (anonymousClass5992.A00 > anonymousClass5993.A00) {
                anonymousClass5992 = anonymousClass5992.A0B();
                C14360o3.A0A(anonymousClass5992);
            }
            while (anonymousClass5994.A00 > anonymousClass5992.A00) {
                anonymousClass5994 = anonymousClass5994.A0B();
                C14360o3.A0A(anonymousClass5994);
            }
            while (anonymousClass5992 != anonymousClass5994) {
                anonymousClass5992 = anonymousClass5992.A0B();
                anonymousClass5994 = anonymousClass5994.A0B();
                if (anonymousClass5992 == null || anonymousClass5994 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (anonymousClass5994 == anonymousClass5993) {
                return this;
            }
            if (anonymousClass5992 != anonymousClass599) {
                return anonymousClass5992.A0W.A06;
            }
            return c59u;
        }
    }

    public final void A0X() {
        InterfaceC119265ai interfaceC119265ai = this.A08;
        if (interfaceC119265ai != null) {
            interfaceC119265ai.invalidate();
            return;
        }
        C59U c59u = this.A07;
        if (c59u == null) {
            return;
        }
        c59u.A0X();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Y() {
        /*
            r4 = this;
            X.599 r0 = r4.A0H
            X.5AZ r1 = r0.A0U
            X.599 r0 = r1.A0I
            X.5AZ r0 = r0.A0U
            java.lang.Integer r3 = r0.A06
            java.lang.Integer r0 = X.C05F.A0C
            r2 = 1
            if (r3 == r0) goto L13
            java.lang.Integer r0 = X.C05F.A0N
            if (r3 != r0) goto L2a
        L13:
            X.5Aa r0 = r1.A0J
            boolean r0 = r0.A0H
            if (r0 == 0) goto L51
            boolean r0 = r1.A08
            if (r0 == r2) goto L2a
            r1.A08 = r2
            boolean r0 = r1.A07
        L21:
            if (r0 != 0) goto L2a
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A01(r0)
        L2a:
            java.lang.Integer r0 = X.C05F.A0N
            if (r3 != r0) goto L47
            X.5fI r0 = r1.A05
            if (r0 == 0) goto L48
            boolean r0 = r0.A0A
            if (r0 != r2) goto L48
            boolean r0 = r1.A0D
            if (r0 == r2) goto L47
            r1.A0D = r2
            boolean r0 = r1.A0C
        L3e:
            if (r0 != 0) goto L47
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A02(r0)
        L47:
            return
        L48:
            boolean r0 = r1.A0C
            if (r0 == r2) goto L47
            r1.A0C = r2
            boolean r0 = r1.A0D
            goto L3e
        L51:
            boolean r0 = r1.A07
            if (r0 == r2) goto L2a
            r1.A07 = r2
            boolean r0 = r1.A08
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59U.A0Y():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x007d, code lost:
    
        if (r2 == 1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z() {
        /*
            r13 = this;
            r12 = 128(0x80, float:1.8E-43)
            X.0vq r0 = X.AbstractC114275Dr.A00
            r10 = 1
            X.58J r0 = A01(r13, r10)
            if (r0 == 0) goto L8f
            X.58J r0 = r0.A03
            int r0 = r0.A00
            r0 = r0 & r12
            if (r0 == 0) goto L8f
            androidx.compose.runtime.snapshots.Snapshot r9 = X.C3Z5.A02()
            r11 = 0
            if (r9 == 0) goto L22
            X.0sJ r8 = r9.A03()
        L1d:
            androidx.compose.runtime.snapshots.Snapshot r7 = X.C3Z5.A03(r9)
            goto L24
        L22:
            r8 = r11
            goto L1d
        L24:
            X.58J r6 = r13.A0T()     // Catch: java.lang.Throwable -> L87
            X.58J r5 = A01(r13, r10)     // Catch: java.lang.Throwable -> L87
        L2c:
            if (r5 == 0) goto L8c
            int r0 = r5.A00     // Catch: java.lang.Throwable -> L87
            r0 = r0 & r12
            if (r0 == 0) goto L8c
            int r0 = r5.A01     // Catch: java.lang.Throwable -> L87
            r0 = r0 & r12
            if (r0 == 0) goto L82
            r0 = r11
            r4 = r5
        L3a:
            boolean r1 = r4 instanceof X.C5DZ     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L4a
            X.5DZ r4 = (X.C5DZ) r4     // Catch: java.lang.Throwable -> L87
            long r1 = r13.A03     // Catch: java.lang.Throwable -> L87
            r4.Def(r1)     // Catch: java.lang.Throwable -> L87
        L45:
            X.58J r4 = X.AbstractC114335Dx.A00(r0)     // Catch: java.lang.Throwable -> L87
            goto L7f
        L4a:
            int r1 = r4.A01     // Catch: java.lang.Throwable -> L87
            r1 = r1 & r12
            if (r1 == 0) goto L45
            boolean r1 = r4 instanceof X.C5AY     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L45
            r1 = r4
            X.5AY r1 = (X.C5AY) r1     // Catch: java.lang.Throwable -> L87
            X.58J r3 = r1.A00     // Catch: java.lang.Throwable -> L87
            r2 = 0
        L59:
            if (r3 == 0) goto L7d
            int r1 = r3.A01     // Catch: java.lang.Throwable -> L87
            r1 = r1 & r12
            if (r1 == 0) goto L7a
            int r2 = r2 + 1
            if (r2 != r10) goto L66
            r4 = r3
            goto L7a
        L66:
            if (r0 != 0) goto L71
            r0 = 16
            X.58J[] r1 = new X.C58J[r0]     // Catch: java.lang.Throwable -> L87
            X.57S r0 = new X.57S     // Catch: java.lang.Throwable -> L87
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L87
        L71:
            if (r4 == 0) goto L77
            r0.A09(r4)     // Catch: java.lang.Throwable -> L87
            r4 = r11
        L77:
            r0.A09(r3)     // Catch: java.lang.Throwable -> L87
        L7a:
            X.58J r3 = r3.A02     // Catch: java.lang.Throwable -> L87
            goto L59
        L7d:
            if (r2 != r10) goto L45
        L7f:
            if (r4 == 0) goto L82
            goto L3a
        L82:
            if (r5 == r6) goto L8c
            X.58J r5 = r5.A02     // Catch: java.lang.Throwable -> L87
            goto L2c
        L87:
            r0 = move-exception
            X.C3Z5.A06(r9, r7, r8)
            throw r0
        L8c:
            X.C3Z5.A06(r9, r7, r8)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59U.A0Z():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.58J] */
    public final void A0a() {
        C18630vq c18630vq = AbstractC114275Dr.A00;
        C58J A0T = A0T();
        for (C58J A01 = A01(this, true); A01 != null && (A01.A00 & 128) != 0; A01 = A01.A02) {
            if ((A01.A01 & 128) != 0) {
                C5AY c5ay = A01;
                ?? r0 = 0;
                do {
                    if (c5ay instanceof C5DZ) {
                        ((C5DZ) c5ay).DYp(this);
                    } else if ((c5ay.A01 & 128) != 0 && (c5ay instanceof C5AY)) {
                        C58J c58j = c5ay.A00;
                        int i = 0;
                        r0 = r0;
                        c5ay = c5ay;
                        while (c58j != null) {
                            if ((c58j.A01 & 128) != 0) {
                                i++;
                                r0 = r0;
                                if (i == 1) {
                                    c5ay = c58j;
                                } else {
                                    if (r0 == 0) {
                                        r0 = new C57S(new C58J[16]);
                                    }
                                    if (c5ay != 0) {
                                        r0.A09(c5ay);
                                        c5ay = 0;
                                    }
                                    r0.A09(c58j);
                                }
                            }
                            c58j = c58j.A02;
                            r0 = r0;
                            c5ay = c5ay;
                        }
                        if (i == 1) {
                        }
                    }
                    c5ay = AbstractC114335Dx.A00(r0);
                } while (c5ay != 0);
            }
            if (A01 == A0T) {
                return;
            }
        }
    }

    public final void A0b() {
        if (this.A08 != null) {
            if (this.A03 != null) {
                this.A03 = null;
            }
            A0i(null, false);
            this.A0H.A0Y(false);
        }
    }

    public final void A0c(C119515b8 c119515b8, boolean z, boolean z2) {
        InterfaceC119265ai interfaceC119265ai = this.A08;
        if (interfaceC119265ai != null) {
            if (this.A0B) {
                if (z2) {
                    long F7k = this.A09.F7k(this.A0H.A0B.BUC());
                    float A02 = C5YC.A02(F7k) / 2.0f;
                    float A00 = C5YC.A00(F7k) / 2.0f;
                    long j = ((C59W) this).A03;
                    c119515b8.A00(-A02, -A00, ((int) (j >> 32)) + A02, C119055aN.A00(j) + A00);
                } else if (z) {
                    long j2 = ((C59W) this).A03;
                    c119515b8.A00(0.0f, 0.0f, (int) (j2 >> 32), C119055aN.A00(j2));
                }
                if (c119515b8.A01 >= c119515b8.A02 || c119515b8.A03 >= c119515b8.A00) {
                    return;
                }
            }
            interfaceC119265ai.Cmr(c119515b8, false);
        }
        long j3 = this.A01;
        float f = (int) (j3 >> 32);
        c119515b8.A01 += f;
        c119515b8.A02 += f;
        float f2 = (int) (j3 & 4294967295L);
        c119515b8.A03 += f2;
        c119515b8.A00 += f2;
    }

    public final void A0d(AnonymousClass585 anonymousClass585, GraphicsLayer graphicsLayer) {
        C5AO c5ao;
        if (this instanceof C118815Zd) {
            C59U c59u = this.A06;
            C14360o3.A0A(c59u);
            c59u.A0e(anonymousClass585, graphicsLayer);
            if (((AndroidComposeView) C59M.A00(this.A0H)).A0A) {
                c5ao = C118815Zd.A03;
            } else {
                return;
            }
        } else {
            AnonymousClass599 anonymousClass599 = this.A0H;
            InterfaceC1128457r A00 = C59M.A00(anonymousClass599);
            C57S A09 = anonymousClass599.A09();
            int i = A09.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = A09.A02;
                do {
                    AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                    if (anonymousClass5992.A0U.A0J.A0F) {
                        anonymousClass5992.A0W.A04.A0e(anonymousClass585, graphicsLayer);
                    }
                    i2++;
                } while (i2 < i);
            }
            if (!((AndroidComposeView) A00).A0A) {
                return;
            } else {
                c5ao = C59T.A02;
            }
        }
        long j = ((C59W) this).A03;
        anonymousClass585.AQz(c5ao, 0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, C119055aN.A00(j) - 0.5f);
    }

    public final void A0e(AnonymousClass585 anonymousClass585, GraphicsLayer graphicsLayer) {
        InterfaceC119265ai interfaceC119265ai = this.A08;
        if (interfaceC119265ai != null) {
            interfaceC119265ai.AQq(anonymousClass585, graphicsLayer);
            return;
        }
        long j = this.A01;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        anonymousClass585.F8X(f, f2);
        A07(anonymousClass585, graphicsLayer, this);
        anonymousClass585.F8X(-f, -f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.58J] */
    public final void A0f(InterfaceC119205ac interfaceC119205ac) {
        C59U c59u;
        InterfaceC119205ac interfaceC119205ac2 = this.A04;
        if (interfaceC119205ac != interfaceC119205ac2) {
            this.A04 = interfaceC119205ac;
            if (interfaceC119205ac2 == null || interfaceC119205ac.getWidth() != interfaceC119205ac2.getWidth() || interfaceC119205ac.getHeight() != interfaceC119205ac2.getHeight()) {
                int width = interfaceC119205ac.getWidth();
                int height = interfaceC119205ac.getHeight();
                InterfaceC119265ai interfaceC119265ai = this.A08;
                if (interfaceC119265ai != null) {
                    interfaceC119265ai.EK5(AbstractC119215ad.A00(width, height));
                } else if (this.A0H.A0U.A0J.A0F && (c59u = this.A07) != null) {
                    c59u.A0X();
                }
                A0H(AbstractC119215ad.A00(width, height));
                if (this.A0A != null) {
                    A09(this, false);
                }
                C18630vq c18630vq = AbstractC114275Dr.A00;
                C58J c58j = A0T().A04;
                if (c58j != null) {
                    for (C58J A01 = A01(this, false); A01 != null && (A01.A00 & 4) != 0; A01 = A01.A02) {
                        if ((A01.A01 & 4) != 0) {
                            C5AY c5ay = A01;
                            ?? r0 = 0;
                            do {
                                if (c5ay instanceof InterfaceC113445Ag) {
                                    ((InterfaceC113445Ag) c5ay).DRD();
                                } else if ((c5ay.A01 & 4) != 0 && (c5ay instanceof C5AY)) {
                                    C58J c58j2 = c5ay.A00;
                                    int i = 0;
                                    r0 = r0;
                                    c5ay = c5ay;
                                    while (c58j2 != null) {
                                        if ((c58j2.A01 & 4) != 0) {
                                            i++;
                                            r0 = r0;
                                            if (i == 1) {
                                                c5ay = c58j2;
                                            } else {
                                                if (r0 == 0) {
                                                    r0 = new C57S(new C58J[16]);
                                                }
                                                if (c5ay != 0) {
                                                    r0.A09(c5ay);
                                                    c5ay = 0;
                                                }
                                                r0.A09(c58j2);
                                            }
                                        }
                                        c58j2 = c58j2.A02;
                                        r0 = r0;
                                        c5ay = c5ay;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                c5ay = AbstractC114335Dx.A00(r0);
                            } while (c5ay != 0);
                        }
                        if (A01 == c58j) {
                            break;
                        }
                    }
                }
                AnonymousClass599 anonymousClass599 = this.A0H;
                InterfaceC1128457r interfaceC1128457r = anonymousClass599.A0A;
                if (interfaceC1128457r != null) {
                    interfaceC1128457r.DOd(anonymousClass599);
                }
            }
            Map map = this.A0G;
            if ((map != null && !map.isEmpty()) || (!interfaceC119205ac.Aaw().isEmpty())) {
                Map Aaw = interfaceC119205ac.Aaw();
                if (!C14360o3.A0K(Aaw, this.A0G)) {
                    this.A0H.A0U.A0J.A0O.A04();
                    Map map2 = this.A0G;
                    if (map2 == null) {
                        map2 = new LinkedHashMap();
                        this.A0G = map2;
                    }
                    map2.clear();
                    map2.putAll(Aaw);
                }
            }
        }
    }

    public final void A0g(C5BP c5bp, C5AL c5al, long j, boolean z, boolean z2) {
        InterfaceC119265ai interfaceC119265ai;
        boolean z3 = z2;
        if (this instanceof C59T) {
            AnonymousClass599 anonymousClass599 = this.A0H;
            if (c5al.Eim(anonymousClass599)) {
                if (!AbstractC119395aw.A01(j) || ((interfaceC119265ai = this.A08) != null && this.A0B && !interfaceC119265ai.CWG(j))) {
                    if (!z) {
                        return;
                    }
                    float A0P2 = A0P(j, this.A09.F7k(anonymousClass599.A0B.BUC()));
                    if (Float.isInfinite(A0P2) || Float.isNaN(A0P2)) {
                        return;
                    } else {
                        z3 = false;
                    }
                }
                int i = c5bp.A00;
                C57S A09 = anonymousClass599.A09();
                int i2 = A09.A00;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    Object[] objArr = A09.A02;
                    do {
                        AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i3];
                        if (anonymousClass5992.A0U.A0J.A0F) {
                            c5al.AHK(c5bp, anonymousClass5992, j, z, z3);
                            long A00 = C5BP.A00(c5bp);
                            if (Float.intBitsToFloat((int) (A00 >> 32)) < 0.0f && ((int) (A00 & 4294967295L)) != 0) {
                                if (!c5bp.A02) {
                                    break;
                                } else {
                                    c5bp.A00 = c5bp.size() - 1;
                                }
                            }
                        }
                        i3--;
                    } while (i3 >= 0);
                }
                c5bp.A00 = i;
                return;
            }
            return;
        }
        C59U c59u = this.A06;
        if (c59u == null) {
            return;
        }
        c59u.A0h(c5bp, c5al, c59u.A0R(j), z, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (X.AbstractC25296BHp.A00(X.C5BP.A00(r16), (r0 & 4294967295L) | (r2 << 32)) > 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0h(X.C5BP r16, X.C5AL r17, long r18, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59U.A0h(X.5BP, X.5AL, long, boolean, boolean):void");
    }

    public final boolean A0j() {
        if (this.A08 != null && this.A0E <= 0.0f) {
            return true;
        }
        C59U c59u = this.A07;
        if (c59u != null) {
            return c59u.A0j();
        }
        return false;
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A0H.A0C.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A0H.A0C.B7e();
    }

    @Override // X.InterfaceC1131459c
    public final long Bxd() {
        return ((C59W) this).A03;
    }

    @Override // X.C59D
    public final boolean CfU() {
        if (this.A08 != null && !this.A0D && this.A0H.A0A != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1131459c
    public final void F8S(float[] fArr) {
        InterfaceC1128457r A00 = C59M.A00(this.A0H);
        A0B(A02(AbstractC119495b6.A02(this)), fArr);
        AndroidComposeView androidComposeView = (AndroidComposeView) A00;
        AndroidComposeView.A0C(androidComposeView);
        C5AJ.A05(fArr, androidComposeView.A0p);
        long j = androidComposeView.A02;
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        float[] fArr2 = androidComposeView.A0o;
        C5AJ.A02(fArr2);
        C5AJ.A04(fArr2, A01, A02);
        C5BB.A01(fArr, fArr2);
    }

    @Override // X.InterfaceC1131259a
    public final AnonymousClass583 getLayoutDirection() {
        return this.A0H.A0D;
    }

    public C59U(AnonymousClass599 anonymousClass599) {
        this.A0H = anonymousClass599;
        this.A09 = anonymousClass599.A0C;
        this.A0F = anonymousClass599.A0D;
    }

    private final void A0A(C59U c59u, float[] fArr) {
        if (!C14360o3.A0K(c59u, this)) {
            C59U c59u2 = this.A07;
            C14360o3.A0A(c59u2);
            c59u2.A0A(c59u, fArr);
            if (this.A01 != 0) {
                float[] fArr2 = A0Q;
                C5AJ.A02(fArr2);
                C5AJ.A04(fArr2, -((int) (r3 >> 32)), -((int) (r3 & 4294967295L)));
                C5AJ.A05(fArr, fArr2);
            }
            InterfaceC119265ai interfaceC119265ai = this.A08;
            if (interfaceC119265ai != null) {
                interfaceC119265ai.COz(fArr);
            }
        }
    }

    public final float A0P(long j, long j2) {
        float A0G;
        float A0F;
        if (A0G() < C5YC.A02(j2) || A0F() < C5YC.A00(j2)) {
            long A0Q2 = A0Q(j2);
            float A02 = C5YC.A02(A0Q2);
            float A00 = C5YC.A00(A0Q2);
            float A01 = C119365at.A01(j);
            if (A01 < 0.0f) {
                A0G = -A01;
            } else {
                A0G = A01 - A0G();
            }
            float max = Math.max(0.0f, A0G);
            float A022 = C119365at.A02(j);
            if (A022 < 0.0f) {
                A0F = -A022;
            } else {
                A0F = A022 - A0F();
            }
            long A002 = AbstractC119395aw.A00(max, Math.max(0.0f, A0F));
            if ((A02 > 0.0f || A00 > 0.0f) && C119365at.A01(A002) <= A02 && C119365at.A02(A002) <= A00) {
                float intBitsToFloat = Float.intBitsToFloat((int) (A002 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (A002 & 4294967295L));
                return (intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2);
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long A0Q(long j) {
        return C5YB.A00(Math.max(0.0f, (C5YC.A02(j) - A0G()) / 2.0f), Math.max(0.0f, (C5YC.A00(j) - A0F()) / 2.0f));
    }

    @Override // X.InterfaceC1131459c
    public final InterfaceC1131459c BbN() {
        if (!A0T().A08) {
            AbstractC28290Cdc.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw C00O.createAndThrow();
        }
        A0Y();
        return this.A0H.A0W.A04.A07;
    }

    @Override // X.InterfaceC1131459c
    public final boolean CQ7() {
        return A0T().A08;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [X.5b8, java.lang.Object] */
    @Override // X.InterfaceC1131459c
    public final C114205Dh Chk(InterfaceC1131459c interfaceC1131459c, boolean z) {
        String obj;
        if (!A0T().A08) {
            obj = "LayoutCoordinate operations are only valid when isAttached is true";
        } else if (!interfaceC1131459c.CQ7()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LayoutCoordinates ");
            sb.append(interfaceC1131459c);
            sb.append(" is not attached!");
            obj = sb.toString();
        } else {
            C59U A02 = A02(interfaceC1131459c);
            A02.A0Y();
            C59U A0W = A0W(A02);
            C119515b8 c119515b8 = this.A02;
            C119515b8 c119515b82 = c119515b8;
            if (c119515b8 == null) {
                ?? obj2 = new Object();
                obj2.A01 = 0.0f;
                obj2.A03 = 0.0f;
                obj2.A02 = 0.0f;
                obj2.A00 = 0.0f;
                this.A02 = obj2;
                c119515b82 = obj2;
            }
            c119515b82.A01 = 0.0f;
            c119515b82.A03 = 0.0f;
            long Bxd = interfaceC1131459c.Bxd();
            c119515b82.A02 = (int) (Bxd >> 32);
            c119515b82.A00 = C119055aN.A00(Bxd);
            C59U c59u = A02;
            while (c59u != A0W) {
                c59u.A0c(c119515b82, z, false);
                if (c119515b82.A01 < c119515b82.A02 && c119515b82.A03 < c119515b82.A00) {
                    C59U c59u2 = c59u.A07;
                    C14360o3.A0A(c59u2);
                    c59u = c59u2;
                } else {
                    return C114205Dh.A04;
                }
            }
            A06(c119515b82, A0W, z);
            return new C114205Dh(c119515b82.A01, c119515b82.A03, c119515b82.A02, c119515b82.A00);
        }
        AbstractC28290Cdc.A01(obj);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1131459c
    public final long Chn(long j) {
        if (!A0T().A08) {
            AbstractC28290Cdc.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw C00O.createAndThrow();
        }
        A0Y();
        C59U c59u = this;
        do {
            j = c59u.A0S(j);
            c59u = c59u.A07;
        } while (c59u != null);
        return j;
    }

    @Override // X.InterfaceC1131459c
    public final long Chp(long j) {
        long Chn = Chn(j);
        AndroidComposeView androidComposeView = (AndroidComposeView) C59M.A00(this.A0H);
        AndroidComposeView.A0C(androidComposeView);
        return C5AJ.A00(androidComposeView.A0p, Chn);
    }

    @Override // X.InterfaceC1131459c
    public final long EM9(long j) {
        if (!A0T().A08) {
            AbstractC28290Cdc.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw C00O.createAndThrow();
        }
        return Chm(AbstractC119495b6.A02(this), C59M.A00(this.A0H).EM9(j), true);
    }

    @Override // X.InterfaceC1131459c
    public final void F8P(InterfaceC1131459c interfaceC1131459c, float[] fArr) {
        C59U A02 = A02(interfaceC1131459c);
        A02.A0Y();
        C59U A0W = A0W(A02);
        C5AJ.A02(fArr);
        A02.A0B(A0W, fArr);
        A0A(A0W, fArr);
    }

    @Override // X.InterfaceC1131459c
    public final long FE8(long j) {
        if (!A0T().A08) {
            AbstractC28290Cdc.A01("LayoutCoordinate operations are only valid when isAttached is true");
            throw C00O.createAndThrow();
        }
        InterfaceC1131459c A02 = AbstractC119495b6.A02(this);
        AndroidComposeView androidComposeView = (AndroidComposeView) C59M.A00(this.A0H);
        AndroidComposeView.A0C(androidComposeView);
        return Chm(A02, C119365at.A06(C5AJ.A00(androidComposeView.A0q, j), A02.Chn(0L)), true);
    }
}
