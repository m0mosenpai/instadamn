package androidx.compose.foundation.lazy;

import X.AbstractC001800i;
import X.AbstractC118405Xc;
import X.AbstractC118445Xg;
import X.AbstractC23641Du;
import X.AbstractC25327BIw;
import X.AbstractC74873Yc;
import X.AbstractC74903Yf;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.BG4;
import X.BJ8;
import X.C0eB;
import X.C118475Xj;
import X.C137036Ig;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C206669Cx;
import X.C206929Dx;
import X.C207079Em;
import X.C3Z5;
import X.C59A;
import X.C5C7;
import X.C5XN;
import X.C5XO;
import X.C5Y2;
import X.C6IE;
import X.C6IF;
import X.C6IG;
import X.C6II;
import X.C6IJ;
import X.C6IK;
import X.C6IL;
import X.C6IM;
import X.C6IN;
import X.C6IO;
import X.C6IQ;
import X.C6IR;
import X.C6M4;
import X.C6M5;
import X.C6M9;
import X.C6MA;
import X.C6MF;
import X.C6MH;
import X.C6MJ;
import X.EnumC27348C5d;
import X.InterfaceC09390do;
import X.InterfaceC1128957x;
import X.InterfaceC118485Xk;
import X.InterfaceC118925a9;
import X.InterfaceC137046Ii;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC30985Djh;
import X.InterfaceC74953Yl;
import X.PZA;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

/* loaded from: classes3.dex */
public final class LazyListState implements C6M4 {
    public static final C5C7 A0O = C6M5.A00(C6IJ.A00, C6II.A00);
    public float A00;
    public C5Y2 A01;
    public C6IF A02;
    public C59A A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public final C5XO A07;
    public final C6IR A08;
    public final C6IL A09;
    public final C6IM A0A;
    public final AwaitFirstLayoutModifier A0B;
    public final C6MF A0C;
    public final C6IO A0D;
    public final C6MJ A0E;
    public final C6MH A0F;
    public final InterfaceC74953Yl A0G;
    public final InterfaceC74953Yl A0H;
    public final InterfaceC74953Yl A0I;
    public final InterfaceC74953Yl A0J;
    public final InterfaceC74953Yl A0K;
    public final InterfaceC118925a9 A0L;
    public final C6M4 A0M;
    public final C6IN A0N;

    public final Object A04(InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        Object EMA = EMA(EnumC27348C5d.Default, interfaceC23621Ds, new C206669Cx(this, (InterfaceC23621Ds) null, i, i2));
        if (EMA != C1JX.A02) {
            return C0eB.A00;
        }
        return EMA;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
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
            r5 = 2
            boolean r0 = X.C206489Cf.A00(r8, r5)
            if (r0 == 0) goto L5e
            r4 = r8
            X.9Cf r4 = (X.C206489Cf) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A04
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L38
            if (r0 == r1) goto L28
            if (r0 != r5) goto L64
            X.AbstractC09560e7.A00(r3)
        L25:
            X.0eB r2 = X.C0eB.A00
        L27:
            return r2
        L28:
            java.lang.Object r9 = r4.A03
            X.0sF r9 = (X.InterfaceC16620sF) r9
            java.lang.Object r7 = r4.A02
            X.C5d r7 = (X.EnumC27348C5d) r7
            java.lang.Object r0 = r4.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.AbstractC09560e7.A00(r3)
            goto L4c
        L38:
            X.AbstractC09560e7.A00(r3)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.A0B
            r4.A01 = r6
            r4.A02 = r7
            r4.A03 = r9
            r4.A00 = r1
            java.lang.Object r0 = r0.A00(r4)
            if (r0 == r2) goto L27
            r0 = r6
        L4c:
            X.6M4 r1 = r0.A0M
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A03 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.EMA(r7, r4, r9)
            if (r0 != r2) goto L25
            return r2
        L5e:
            X.9Cf r4 = new X.9Cf
            r4.<init>(r6, r8, r5)
            goto L15
        L64:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.EMA(X.C5d, X.1Ds, X.0sF):java.lang.Object");
    }

    public final int A00() {
        return this.A0A.A03.BIi();
    }

    public final int A01() {
        return this.A0A.A04.BIi();
    }

    public final C6IG A02() {
        return (C6IG) this.A0I.getValue();
    }

    public final Object A03(InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        C6IN c6in = this.A0N;
        Object EMB = c6in.EMB(interfaceC23621Ds, new LazyAnimateScrollKt$animateScrollToItem$2(c6in, ((C6IF) this.A0I.getValue()).A0C, null, i, i2, 100));
        C1JX c1jx = C1JX.A02;
        if (EMB != c1jx) {
            EMB = C0eB.A00;
        }
        if (EMB != c1jx) {
            return C0eB.A00;
        }
        return EMB;
    }

    public final void A05(int i, int i2) {
        C6IM c6im = this.A0A;
        if (c6im.A03.BIi() != i || c6im.A04.BIi() != i2) {
            this.A0D.A06();
        }
        C6IM.A00(c6im, i, i2);
        c6im.A00 = null;
        C59A c59a = this.A03;
        if (c59a != null) {
            c59a.AWW();
        }
    }

    public final void A06(C6IF c6if, boolean z, boolean z2) {
        Object obj;
        int i;
        InterfaceC16660sJ interfaceC16660sJ;
        if (!z) {
            if (this.A04) {
                this.A02 = c6if;
                return;
            }
        } else {
            this.A04 = true;
        }
        C137036Ig c137036Ig = c6if.A0B;
        boolean z3 = false;
        if ((c137036Ig != null && c137036Ig.A07 != 0) || c6if.A01 != 0) {
            z3 = true;
        }
        this.A0G.Egh(Boolean.valueOf(z3));
        this.A0H.Egh(Boolean.valueOf(c6if.A02));
        this.A00 -= c6if.A00;
        this.A0I.Egh(c6if);
        C6IM c6im = this.A0A;
        if (z2) {
            int i2 = c6if.A01;
            if (i2 >= 0.0f) {
                c6im.A04.EWE(i2);
            } else {
                throw new IllegalStateException(AnonymousClass001.A0I("scrollOffset should be non-negative (", ')', i2));
            }
        } else {
            if (c137036Ig != null) {
                obj = c137036Ig.A0B;
            } else {
                obj = null;
            }
            c6im.A00 = obj;
            if (c6im.A01 || c6if.A06 > 0) {
                c6im.A01 = true;
                int i3 = c6if.A01;
                int i4 = 0;
                if (i3 >= 0.0f) {
                    if (c137036Ig != null) {
                        i4 = c137036Ig.A07;
                    }
                    C6IM.A00(c6im, i4, i3);
                } else {
                    throw new IllegalStateException(AnonymousClass001.A0I("scrollOffset should be non-negative (", ')', i3));
                }
            }
            if (this.A05) {
                C6IK c6ik = (C6IK) this.A09;
                if (c6ik.A00 != -1) {
                    List list = c6if.A0D;
                    if (!list.isEmpty()) {
                        if (c6ik.A02) {
                            i = ((C137036Ig) ((InterfaceC137046Ii) AbstractC001800i.A0K(list))).A07 + 1;
                        } else {
                            i = ((C137036Ig) ((InterfaceC137046Ii) AbstractC001800i.A0I(list))).A07 - 1;
                        }
                        if (c6ik.A00 != i) {
                            c6ik.A00 = -1;
                            InterfaceC30985Djh interfaceC30985Djh = c6ik.A01;
                            if (interfaceC30985Djh != null) {
                                interfaceC30985Djh.cancel();
                            }
                            c6ik.A01 = null;
                        }
                    }
                }
            }
        }
        if (z) {
            float f = c6if.A03;
            InterfaceC1128957x interfaceC1128957x = c6if.A0C;
            C19L c19l = c6if.A0E;
            C6IF c6if2 = C6IE.A00;
            if (f > interfaceC1128957x.EqT(1.0f)) {
                Snapshot A02 = C3Z5.A02();
                if (A02 != null) {
                    interfaceC16660sJ = A02.A03();
                } else {
                    interfaceC16660sJ = null;
                }
                Snapshot A03 = C3Z5.A03(A02);
                try {
                    float floatValue = ((Number) this.A01.A05.getValue()).floatValue();
                    C5Y2 c5y2 = this.A01;
                    if (c5y2.A03) {
                        this.A01 = BG4.A01(c5y2, floatValue - f, 0.0f, 30);
                        AbstractC23641Du.A05(AnonymousClass191.A00, new PZA(this, (InterfaceC23621Ds) null, 8), c19l);
                    } else {
                        this.A01 = new C5Y2(null, AbstractC118445Xg.A02, Float.valueOf(-f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                        AbstractC23641Du.A05(AnonymousClass191.A00, new PZA(this, (InterfaceC23621Ds) null, 9), c19l);
                    }
                } finally {
                    C3Z5.A06(A02, A03, interfaceC16660sJ);
                }
            }
        }
        this.A06++;
    }

    @Override // X.C6M4
    public final float APr(float f) {
        return this.A0M.APr(f);
    }

    @Override // X.C6M4
    public final boolean Akm() {
        return ((Boolean) this.A0G.getValue()).booleanValue();
    }

    @Override // X.C6M4
    public final boolean Akn() {
        return ((Boolean) this.A0H.getValue()).booleanValue();
    }

    @Override // X.C6M4
    public final boolean CcT() {
        return this.A0M.CcT();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyListState(C6IL c6il, int i, int i2) {
        this.A09 = c6il;
        this.A0A = new C6IM(i, i2);
        this.A0N = new C6IN(this);
        C6IF c6if = C6IE.A00;
        C6M9 c6m9 = C6M9.A00;
        C14360o3.A0C(c6m9, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A0I = new ParcelableSnapshotMutableState(c6m9, c6if);
        this.A07 = new C5XN();
        this.A0M = new C6MA(new C206929Dx(this, 18));
        this.A05 = true;
        this.A0L = new BJ8(this);
        this.A0B = new Object();
        this.A0D = new C6IO();
        this.A0C = new C6MF();
        this.A0F = new C6MH(new C207079Em(this, i, 0));
        this.A08 = new C6IQ(this);
        this.A0E = new C6MJ();
        this.A0J = AbstractC25327BIw.A00();
        this.A0H = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), false);
        this.A0G = new ParcelableSnapshotMutableState(AbstractC74873Yc.A00(), false);
        this.A0K = AbstractC25327BIw.A00();
        InterfaceC118485Xk interfaceC118485Xk = AbstractC118445Xg.A02;
        Float valueOf = Float.valueOf(0.0f);
        this.A01 = new C5Y2((AbstractC118405Xc) ((C118475Xj) interfaceC118485Xk).A01.invoke(valueOf), interfaceC118485Xk, valueOf, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6IL, X.6IK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LazyListState() {
        /*
            r3 = this;
            r2 = 0
            X.6IK r1 = new X.6IK
            r1.<init>()
            r0 = -1
            r1.A00 = r0
            r3.<init>(r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.<init>():void");
    }
}
