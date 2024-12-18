package androidx.compose.foundation.lazy.staggeredgrid;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25327BIw;
import X.AbstractC74903Yf;
import X.C0eB;
import X.C14360o3;
import X.C1JX;
import X.C25344BJn;
import X.C25679BWp;
import X.C28282CdU;
import X.C28356CfG;
import X.C28755Cmn;
import X.C28761Cmt;
import X.C28837Co7;
import X.C3Z5;
import X.C57155PYz;
import X.C59A;
import X.C5C7;
import X.C5XN;
import X.C5XO;
import X.C6IO;
import X.C6M4;
import X.C6M5;
import X.C6M9;
import X.C6MA;
import X.C6MF;
import X.C6MH;
import X.C6MJ;
import X.CNH;
import X.DJI;
import X.DRS;
import X.DZP;
import X.EnumC27348C5d;
import X.InterfaceC09390do;
import X.InterfaceC118925a9;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC30773DgA;
import X.InterfaceC30985Djh;
import X.InterfaceC74953Yl;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class LazyStaggeredGridState implements C6M4 {
    public static final C5C7 A0M = C6M5.A00(DJI.A00, DZP.A00);
    public float A00;
    public int A01;
    public C59A A02;
    public int A03;
    public boolean A04;
    public final C6M4 A05;
    public final C5XO A06;
    public final AwaitFirstLayoutModifier A07;
    public final C6MF A08;
    public final C6IO A09;
    public final C6MJ A0A;
    public final C6MH A0B;
    public final C28282CdU A0C;
    public final C28356CfG A0D;
    public final InterfaceC74953Yl A0E;
    public final InterfaceC74953Yl A0F;
    public final InterfaceC74953Yl A0G;
    public final InterfaceC74953Yl A0H;
    public final InterfaceC74953Yl A0I;
    public final InterfaceC118925a9 A0J;
    public final Map A0K;
    public final C28755Cmn A0L;

    public final Object A01(int i, InterfaceC23621Ds interfaceC23621Ds) {
        Object EMA = EMA(EnumC27348C5d.Default, interfaceC23621Ds, new C57155PYz(this, null, i, 0, 2));
        if (EMA != C1JX.A02) {
            return C0eB.A00;
        }
        return EMA;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.C6M4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object EMA(X.EnumC27348C5d r7, X.InterfaceC23621Ds r8, X.InterfaceC16620sF r9) {
        /*
            r6 = this;
            r5 = 1
            boolean r0 = X.MAL.A01(r8, r5)
            if (r0 == 0) goto L59
            r4 = r8
            X.MAL r4 = (X.MAL) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            if (r0 == 0) goto L38
            if (r0 == r5) goto L28
            if (r0 != r2) goto L5f
            X.AbstractC09560e7.A00(r1)
        L25:
            X.0eB r3 = X.C0eB.A00
        L27:
            return r3
        L28:
            java.lang.Object r9 = r4.A03
            X.0sF r9 = (X.InterfaceC16620sF) r9
            java.lang.Object r7 = r4.A02
            X.C5d r7 = (X.EnumC27348C5d) r7
            java.lang.Object r0 = r4.A01
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState) r0
            X.AbstractC09560e7.A00(r1)
            goto L47
        L38:
            X.AbstractC09560e7.A00(r1)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.A07
            X.AbstractC25235BEs.A1J(r6, r7, r9, r4, r5)
            java.lang.Object r0 = r0.A00(r4)
            if (r0 == r3) goto L27
            r0 = r6
        L47:
            X.6M4 r1 = r0.A05
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A03 = r0
            r4.A00 = r2
            java.lang.Object r0 = r1.EMA(r7, r4, r9)
            if (r0 != r3) goto L25
            return r3
        L59:
            X.MAL r4 = new X.MAL
            r4.<init>(r6, r8, r5)
            goto L15
        L5f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.EMA(X.C5d, X.1Ds, X.0sF):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r10 >= r13.A06) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r3 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r8.contains(r3) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r8.add(r3);
        r2 = r14.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r2.containsKey(r3) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r13.A0C.A00(r10) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r5 == 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r1 = r7.A00;
        r0 = r5 - 1;
        r1 = (r1[r0] + r6[r0]) - r1[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        if (r13.A0A != X.C6M3.Vertical) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        r0 = X.AbstractC119035aK.A01(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        r2.put(r3, r14.A0B.A00(r10, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        r0 = X.AbstractC119035aK.A00(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        r1 = r6[r0];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C28837Co7 r13, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r14, float r15) {
        /*
            boolean r0 = r14.A04
            if (r0 == 0) goto Ld2
            java.util.List r1 = r13.A0D
            boolean r0 = r1.isEmpty()
            r9 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto Ld2
            r0 = 0
            int r0 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r0 >= 0) goto La4
            r12 = 1
            java.lang.Object r0 = X.AbstractC001800i.A0K(r1)
        L19:
            X.Cmt r0 = (X.C28761Cmt) r0
            int r10 = r0.A07
            int r0 = r14.A01
            if (r10 == r0) goto Ld2
            r14.A01 = r10
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            X.CPq r7 = r13.A0B
            int[] r6 = r7.A01
            int r5 = r6.length
            r4 = 0
        L2e:
            if (r4 >= r5) goto Lab
            X.CdU r3 = r14.A0C
            if (r12 == 0) goto L4d
            int r10 = r10 + 1
            int r2 = r3.A00
            int[] r0 = r3.A01
            int r0 = r0.length
            int r2 = r2 + r0
        L3c:
            if (r10 >= r2) goto L52
            int r1 = r3.A01(r10)
            if (r1 == r4) goto L53
            r0 = -1
            if (r1 == r0) goto L53
            r0 = -2
            if (r1 == r0) goto L53
            int r10 = r10 + 1
            goto L3c
        L4d:
            int r10 = r3.A02(r10, r4)
            goto L53
        L52:
            r10 = r2
        L53:
            if (r10 < 0) goto Lab
            int r0 = r13.A06
            if (r10 >= r0) goto Lab
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            boolean r0 = r8.contains(r3)
            if (r0 != 0) goto Lab
            r8.add(r3)
            java.util.Map r2 = r14.A0K
            boolean r0 = r2.containsKey(r3)
            if (r0 != 0) goto L99
            X.CTX r0 = r13.A0C
            boolean r1 = r0.A00(r10)
            r0 = r4
            if (r1 == 0) goto La1
            r0 = 0
            if (r5 == r9) goto La1
            int[] r1 = r7.A00
            r11 = r1[r0]
            int r0 = r5 - r9
            r1 = r1[r0]
            r0 = r6[r0]
            int r1 = r1 + r0
            int r1 = r1 - r11
        L86:
            X.6M3 r11 = r13.A0A
            X.6M3 r0 = X.C6M3.Vertical
            if (r11 != r0) goto L9c
            long r0 = X.AbstractC119035aK.A01(r1)
        L90:
            X.6MH r11 = r14.A0B
            X.Djh r0 = r11.A00(r10, r0)
            r2.put(r3, r0)
        L99:
            int r4 = r4 + 1
            goto L2e
        L9c:
            long r0 = X.AbstractC119035aK.A00(r1)
            goto L90
        La1:
            r1 = r6[r0]
            goto L86
        La4:
            r12 = 0
            java.lang.Object r0 = X.AbstractC001800i.A0I(r1)
            goto L19
        Lab:
            java.util.Map r0 = r14.A0K
            java.util.Iterator r2 = X.AbstractC166997dE.A15(r0)
        Lb1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Ld2
            java.util.Map$Entry r1 = X.AbstractC166987dD.A1K(r2)
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto Lb1
            java.lang.Object r0 = r1.getValue()
            X.Djh r0 = (X.InterfaceC30985Djh) r0
            r0.cancel()
            r2.remove()
            goto Lb1
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A00(X.Co7, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4.A06.BIi() != r11) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(int r10, int r11) {
        /*
            r9 = this;
            X.CfG r4 = r9.A0D
            X.5bC r2 = r4.A05
            int r0 = r2.BIi()
            r7 = 0
            if (r0 != r10) goto L14
            X.5bC r0 = r4.A06
            int r0 = r0.BIi()
            r5 = 0
            if (r0 == r11) goto L1a
        L14:
            r5 = 1
            X.6IO r0 = r9.A09
            r0.A06()
        L1a:
            X.3Yl r0 = r9.A0G
            java.lang.Object r8 = r0.getValue()
            X.Co7 r8 = (X.C28837Co7) r8
            int[] r0 = X.CNH.A01
            java.util.List r3 = r8.A0D
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L81
            java.lang.Object r0 = X.AbstractC001800i.A0I(r3)
            X.DgA r0 = (X.InterfaceC30773DgA) r0
            X.Cmt r0 = (X.C28761Cmt) r0
            int r1 = r0.A07
            java.lang.Object r0 = X.AbstractC001800i.A0K(r3)
            X.DgA r0 = (X.InterfaceC30773DgA) r0
            X.Cmt r0 = (X.C28761Cmt) r0
            int r0 = r0.A07
            if (r10 > r0) goto L81
            if (r1 > r10) goto L81
            r0 = 1
            X.BQa r1 = new X.BQa
            r1.<init>(r10, r0)
            int r0 = r3.size()
            int r0 = X.AbstractC16960so.A1L(r3, r1, r0)
            java.lang.Object r1 = X.AbstractC001800i.A0O(r3, r0)
            X.DgA r1 = (X.InterfaceC30773DgA) r1
            if (r1 == 0) goto L81
            if (r5 == 0) goto L81
            X.6M3 r3 = r8.A0A
            X.6M3 r0 = X.C6M3.Vertical
            X.Cmt r1 = (X.C28761Cmt) r1
            long r1 = r1.A03
            if (r3 != r0) goto L7d
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
        L6c:
            int r5 = (int) r1
            int r5 = r5 + r11
            int[] r3 = r8.A02
            int r2 = r3.length
            int[] r1 = new int[r2]
        L73:
            if (r7 >= r2) goto Lbc
            r0 = r3[r7]
            int r0 = r0 + r5
            r1[r7] = r0
            int r7 = r7 + 1
            goto L73
        L7d:
            r0 = 32
            long r1 = r1 >> r0
            goto L6c
        L81:
            X.0sF r3 = r4.A07
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            int[] r0 = r4.A02
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r3.invoke(r1, r0)
            int[] r5 = (int[]) r5
            int r3 = r5.length
            int[] r1 = new int[r3]
            r0 = 0
        L98:
            if (r0 >= r3) goto L9f
            r1[r0] = r11
            int r0 = r0 + 1
            goto L98
        L9f:
            r4.A02 = r5
            int r0 = X.C28356CfG.A00(r5)
            r2.EWE(r0)
            r4.A03 = r1
            int r1 = X.C28356CfG.A01(r5, r1)
            X.5bC r0 = r4.A06
            r0.EWE(r1)
            X.6M7 r0 = r4.A04
            r0.A00(r10)
            r0 = 0
            r4.A00 = r0
            goto Lc9
        Lbc:
            r4.A03 = r1
            int[] r0 = r4.A02
            int r1 = X.C28356CfG.A01(r0, r1)
            X.5bC r0 = r4.A06
            r0.EWE(r1)
        Lc9:
            X.59A r0 = r9.A02
            if (r0 == 0) goto Ld0
            r0.AWW()
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.A02(int, int):void");
    }

    public final void A03(C28837Co7 c28837Co7, boolean z) {
        InterfaceC16660sJ interfaceC16660sJ;
        Object obj;
        Object obj2;
        this.A00 -= c28837Co7.A00;
        this.A0G.Egh(c28837Co7);
        C28356CfG c28356CfG = this.A0D;
        if (z) {
            int[] iArr = c28837Co7.A02;
            c28356CfG.A03 = iArr;
            c28356CfG.A06.EWE(C28356CfG.A01(c28356CfG.A02, iArr));
        } else {
            int[] iArr2 = c28837Co7.A0F;
            int A00 = C28356CfG.A00(iArr2);
            List list = c28837Co7.A0D;
            int size = list.size();
            int i = 0;
            while (true) {
                interfaceC16660sJ = null;
                if (i < size) {
                    obj = list.get(i);
                    if (((C28761Cmt) obj).A07 == A00) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C28761Cmt c28761Cmt = (C28761Cmt) obj;
            if (c28761Cmt != null) {
                obj2 = c28761Cmt.A0D;
            } else {
                obj2 = null;
            }
            c28356CfG.A00 = obj2;
            c28356CfG.A04.A00(A00);
            if (c28356CfG.A01 || c28837Co7.A06 > 0) {
                c28356CfG.A01 = true;
                Snapshot A02 = C3Z5.A02();
                if (A02 != null) {
                    interfaceC16660sJ = A02.A03();
                }
                Snapshot A03 = C3Z5.A03(A02);
                try {
                    int[] iArr3 = c28837Co7.A02;
                    c28356CfG.A02 = iArr2;
                    c28356CfG.A05.EWE(C28356CfG.A00(iArr2));
                    c28356CfG.A03 = iArr3;
                    c28356CfG.A06.EWE(C28356CfG.A01(iArr2, iArr3));
                } finally {
                    C3Z5.A06(A02, A03, interfaceC16660sJ);
                }
            }
            if (this.A01 != -1 && AbstractC166987dD.A1b(list)) {
                int i2 = ((C28761Cmt) ((InterfaceC30773DgA) AbstractC001800i.A0I(list))).A07;
                int i3 = ((C28761Cmt) ((InterfaceC30773DgA) AbstractC001800i.A0K(list))).A07;
                int i4 = this.A01;
                if (i2 > i4 || i4 > i3) {
                    this.A01 = -1;
                    Map map = this.A0K;
                    Iterator A16 = AbstractC166997dE.A16(map);
                    while (A16.hasNext()) {
                        ((InterfaceC30985Djh) A16.next()).cancel();
                    }
                    map.clear();
                }
            }
        }
        boolean z2 = false;
        if (c28837Co7.A0F[0] != 0 || c28837Co7.A02[0] > 0) {
            z2 = true;
        }
        AbstractC25227BEk.A1A(this.A0E, z2);
        AbstractC25227BEk.A1A(this.A0F, c28837Co7.A01);
        this.A03++;
    }

    @Override // X.C6M4
    public final float APr(float f) {
        return this.A05.APr(f);
    }

    @Override // X.C6M4
    public final boolean Akm() {
        return AbstractC25230BEn.A1X(this.A0E);
    }

    @Override // X.C6M4
    public final boolean Akn() {
        return AbstractC25230BEn.A1X(this.A0F);
    }

    @Override // X.C6M4
    public final boolean CcT() {
        return this.A05.CcT();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        this.A0D = new C28356CfG(new C25344BJn(this, 0), iArr, iArr2);
        C28837Co7 c28837Co7 = CNH.A00;
        C6M9 c6m9 = C6M9.A00;
        C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A0G = new ParcelableSnapshotMutableState(c6m9, c28837Co7);
        this.A0C = new C28282CdU();
        this.A0F = AbstractC25229BEm.A0R(false);
        this.A0E = AbstractC25229BEm.A0R(false);
        this.A0L = new C28755Cmn(this);
        this.A0J = new C25679BWp(this, 1);
        this.A07 = new Object();
        this.A08 = new C6MF();
        this.A04 = true;
        this.A0B = new C6MH(null);
        this.A05 = new C6MA(DRS.A00(this, 48));
        this.A01 = -1;
        this.A0K = AbstractC166987dD.A1I();
        this.A06 = new C5XN();
        this.A0A = new C6MJ();
        this.A09 = new C6IO();
        this.A0I = AbstractC25327BIw.A00();
        this.A0H = AbstractC25327BIw.A00();
    }
}
