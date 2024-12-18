package androidx.compose.foundation.gestures;

import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.C05F;
import X.C0eB;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C206659Cw;
import X.C206929Dx;
import X.C5AY;
import X.C5DX;
import X.C5XN;
import X.C5XO;
import X.C6KL;
import X.C6KM;
import X.C6KW;
import X.C6KX;
import X.C6M3;
import X.C6NT;
import X.C9D3;
import X.C9DH;
import X.EnumC25334BJd;
import X.EnumC27348C5d;
import X.InterfaceC1129458d;
import X.InterfaceC137936Mt;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.Y8N;
import X.Y8O;

/* loaded from: classes3.dex */
public abstract class DragGestureNode extends C5AY implements C5DX, InterfaceC1129458d {
    public C6M3 A00;
    public InterfaceC16660sJ A01;
    public InterfaceC24731Iq A02;
    public boolean A03;
    public boolean A04;
    public Y8N A05;
    public C5XO A06;
    public C6KM A07;
    public final InterfaceC16660sJ A08 = new C206929Dx(this, 9);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Dg2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C25298BHs r7, androidx.compose.foundation.gestures.DragGestureNode r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = 1
            boolean r0 = X.C206489Cf.A00(r9, r6)
            if (r0 == 0) goto L7b
            r5 = r9
            X.9Cf r5 = (X.C206489Cf) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r2 = r5.A04
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 2
            if (r0 == 0) goto L3b
            if (r0 == r6) goto L58
            if (r0 != r3) goto L81
            java.lang.Object r1 = r5.A03
            X.Y8N r1 = (X.Y8N) r1
            java.lang.Object r7 = r5.A02
            X.BHs r7 = (X.C25298BHs) r7
            java.lang.Object r8 = r5.A01
            androidx.compose.foundation.gestures.DragGestureNode r8 = (androidx.compose.foundation.gestures.DragGestureNode) r8
            X.AbstractC09560e7.A00(r2)
        L31:
            r8.A05 = r1
            long r0 = r7.A00
            r8.A0J(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L3b:
            X.AbstractC09560e7.A00(r2)
            X.Y8N r2 = r8.A05
            if (r2 == 0) goto L63
            X.5XO r1 = r8.A06
            if (r1 == 0) goto L63
            X.Y8O r0 = new X.Y8O
            r0.<init>(r2)
            r5.A01 = r8
            r5.A02 = r7
            r5.A00 = r6
            java.lang.Object r0 = r1.ARN(r0, r5)
            if (r0 != r4) goto L63
            return r4
        L58:
            java.lang.Object r7 = r5.A02
            X.BHs r7 = (X.C25298BHs) r7
            java.lang.Object r8 = r5.A01
            androidx.compose.foundation.gestures.DragGestureNode r8 = (androidx.compose.foundation.gestures.DragGestureNode) r8
            X.AbstractC09560e7.A00(r2)
        L63:
            X.Y8N r1 = new X.Y8N
            r1.<init>()
            X.5XO r0 = r8.A06
            if (r0 == 0) goto L31
            r5.A01 = r8
            r5.A02 = r7
            r5.A03 = r1
            r5.A00 = r3
            java.lang.Object r0 = r0.ARN(r1, r5)
            if (r0 != r4) goto L31
            return r4
        L7b:
            X.9Cf r5 = new X.9Cf
            r5.<init>(r8, r9, r6)
            goto L15
        L81:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A00(X.BHs, androidx.compose.foundation.gestures.DragGestureNode, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(X.BG2 r6, androidx.compose.foundation.gestures.DragGestureNode r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 0
            boolean r0 = X.C206459Cc.A00(r8, r3)
            if (r0 == 0) goto L53
            r5 = r8
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L59
            java.lang.Object r6 = r5.A02
            X.BG2 r6 = (X.BG2) r6
            java.lang.Object r7 = r5.A01
            androidx.compose.foundation.gestures.DragGestureNode r7 = (androidx.compose.foundation.gestures.DragGestureNode) r7
            X.AbstractC09560e7.A00(r1)
        L2b:
            r0 = 0
            r7.A05 = r0
        L2e:
            long r0 = r6.A00
            r7.A0K(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L36:
            X.AbstractC09560e7.A00(r1)
            X.Y8N r2 = r7.A05
            if (r2 == 0) goto L2e
            X.5XO r1 = r7.A06
            if (r1 == 0) goto L2b
            X.XMo r0 = new X.XMo
            r0.<init>(r2)
            r5.A01 = r7
            r5.A02 = r6
            r5.A00 = r3
            java.lang.Object r0 = r1.ARN(r0, r5)
            if (r0 != r4) goto L2b
            return r4
        L53:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r7, r8, r3)
            goto L15
        L59:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A01(X.BG2, androidx.compose.foundation.gestures.DragGestureNode, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(androidx.compose.foundation.gestures.DragGestureNode r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 0
            boolean r0 = X.C9CY.A00(r7, r3)
            if (r0 == 0) goto L4d
            r5 = r7
            X.9CY r5 = (X.C9CY) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L53
            java.lang.Object r6 = r5.A01
            androidx.compose.foundation.gestures.DragGestureNode r6 = (androidx.compose.foundation.gestures.DragGestureNode) r6
            X.AbstractC09560e7.A00(r1)
        L27:
            r0 = 0
            r6.A05 = r0
        L2a:
            r0 = 0
            r6.A0K(r0)
            X.0eB r0 = X.C0eB.A00
            return r0
        L32:
            X.AbstractC09560e7.A00(r1)
            X.Y8N r2 = r6.A05
            if (r2 == 0) goto L2a
            X.5XO r1 = r6.A06
            if (r1 == 0) goto L27
            X.Y8O r0 = new X.Y8O
            r0.<init>(r2)
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = r1.ARN(r0, r5)
            if (r0 != r4) goto L27
            return r4
        L4d:
            X.9CY r5 = new X.9CY
            r5.<init>(r6, r7, r3)
            goto L15
        L53:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A02(androidx.compose.foundation.gestures.DragGestureNode, X.1Ds):java.lang.Object");
    }

    public Object A0H(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        ScrollingLogic scrollingLogic = ((C6NT) this).A09;
        Object A03 = scrollingLogic.A03(EnumC27348C5d.UserInput, interfaceC23621Ds, new C9DH(scrollingLogic, interfaceC16620sF, (InterfaceC23621Ds) null, 2));
        if (A03 != C1JX.A02) {
            return C0eB.A00;
        }
        return A03;
    }

    public void A0J(long j) {
    }

    public void A0K(long j) {
        C6NT c6nt = (C6NT) this;
        C19L c19l = (C19L) c6nt.A0A.A01.invoke();
        if (c19l != null) {
            C206659Cw c206659Cw = new C206659Cw(c6nt, null, 0, j);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206659Cw, c19l);
            return;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public boolean A0M() {
        InterfaceC137936Mt interfaceC137936Mt;
        ScrollingLogic scrollingLogic = ((C6NT) this).A09;
        if (!scrollingLogic.A05.CcT() && ((interfaceC137936Mt = scrollingLogic.A01) == null || !interfaceC137936Mt.CWK())) {
            return false;
        }
        return true;
    }

    public final void A0I() {
        Y8N y8n = this.A05;
        if (y8n != null) {
            C5XO c5xo = this.A06;
            if (c5xo != null) {
                ((C5XN) c5xo).A00.F8m(new Y8O(y8n));
            }
            this.A05 = null;
        }
    }

    public final void A0L(C6M3 c6m3, C5XO c5xo, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        this.A01 = interfaceC16660sJ;
        if (this.A03 != z) {
            this.A03 = z;
            if (!z) {
                A0I();
                C6KM c6km = this.A07;
                if (c6km != null) {
                    A0G(c6km);
                }
                this.A07 = null;
            }
            z2 = true;
        }
        if (!C14360o3.A0K(this.A06, c5xo)) {
            A0I();
            this.A06 = c5xo;
        }
        if (this.A00 != c6m3) {
            this.A00 = c6m3;
        } else if (!z2) {
            return;
        }
        C6KM c6km2 = this.A07;
        if (c6km2 != null) {
            c6km2.EJp();
        }
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean COp() {
        return false;
    }

    @Override // X.C5DX
    /* renamed from: D1u */
    public final void E0S() {
        C6KM c6km = this.A07;
        if (c6km != null) {
            c6km.E0S();
        }
    }

    public void DZQ(C6KW c6kw, EnumC25334BJd enumC25334BJd, long j) {
        if (this.A03 && this.A07 == null) {
            C9D3 c9d3 = new C9D3(this, null, 4);
            C6KW c6kw2 = C6KX.A00;
            C6KL c6kl = new C6KL(null, null, c9d3);
            A0F(c6kl);
            this.A07 = c6kl;
        }
        C6KM c6km = this.A07;
        if (c6km != null) {
            c6km.DZQ(c6kw, enumC25334BJd, j);
        }
    }

    @Override // X.C5DX
    public final /* synthetic */ boolean Ehx() {
        return false;
    }

    public DragGestureNode(C6M3 c6m3, C5XO c5xo, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        this.A00 = c6m3;
        this.A01 = interfaceC16660sJ;
        this.A03 = z;
        this.A06 = c5xo;
    }
}
