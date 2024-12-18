package androidx.compose.ui.input.nestedscroll;

import X.BFZ;
import X.C119365at;
import X.C19L;
import X.C58J;
import X.C5E5;
import X.InterfaceC1130758u;

/* loaded from: classes3.dex */
public final class NestedScrollNode extends C58J implements InterfaceC1130758u, C5E5 {
    public C5E5 A00;
    public NestedScrollDispatcher A01;
    public final Object A02;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.C5E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DZz(X.InterfaceC23621Ds r12, long r13, long r15) {
        /*
            r11 = this;
            r7 = r13
            r9 = r15
            boolean r0 = r12 instanceof X.C9HH
            if (r0 == 0) goto L7e
            r6 = r12
            X.9HH r6 = (X.C9HH) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r6.A00 = r2
        L14:
            java.lang.Object r4 = r6.A04
            X.1JX r3 = X.C1JX.A02
            int r1 = r6.A00
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L41
            if (r1 == r0) goto L35
            if (r1 != r2) goto L84
            long r0 = r6.A01
            X.AbstractC09560e7.A00(r4)
        L27:
            X.BFb r4 = (X.C25242BFb) r4
            long r2 = r4.A00
        L2b:
            long r0 = X.C25242BFb.A03(r0, r2)
            X.BFb r3 = new X.BFb
            r3.<init>(r0)
        L34:
            return r3
        L35:
            long r9 = r6.A02
            long r7 = r6.A01
            java.lang.Object r5 = r6.A03
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r5 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r5
            X.AbstractC09560e7.A00(r4)
            goto L55
        L41:
            X.AbstractC09560e7.A00(r4)
            X.5E5 r5 = r11.A00
            r6.A03 = r11
            r6.A01 = r13
            r6.A02 = r15
            r6.A00 = r0
            java.lang.Object r4 = r5.DZz(r6, r7, r9)
            if (r4 == r3) goto L34
            r5 = r11
        L55:
            X.BFb r4 = (X.C25242BFb) r4
            long r0 = r4.A00
            boolean r4 = r5.A08
            if (r4 == 0) goto L7b
            X.58u r5 = X.BFZ.A01(r5)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r5 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r5
            if (r5 == 0) goto L7b
            long r7 = X.C25242BFb.A03(r7, r0)
            long r9 = X.C25242BFb.A02(r9, r0)
            r4 = 0
            r6.A03 = r4
            r6.A01 = r0
            r6.A00 = r2
            java.lang.Object r4 = r5.DZz(r6, r7, r9)
            if (r4 != r3) goto L27
            return r3
        L7b:
            r2 = 0
            goto L2b
        L7e:
            X.9HH r6 = new X.9HH
            r6.<init>(r11, r12)
            goto L14
        L84:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.DZz(X.1Ds, long, long):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r1 == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @Override // X.C5E5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Da5(X.InterfaceC23621Ds r10, long r11) {
        /*
            r9 = this;
            r3 = 1
            boolean r0 = X.C206439Ca.A00(r10, r3)
            if (r0 == 0) goto L77
            r7 = r10
            X.9Ca r7 = (X.C206439Ca) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r1 = r7.A03
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r6 = 2
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L35
            if (r0 != r6) goto L7d
            long r3 = r7.A01
            X.AbstractC09560e7.A00(r1)
        L27:
            X.BFb r1 = (X.C25242BFb) r1
            long r0 = r1.A00
            long r1 = X.C25242BFb.A03(r3, r0)
            X.BFb r0 = new X.BFb
            r0.<init>(r1)
            return r0
        L35:
            long r11 = r7.A01
            java.lang.Object r0 = r7.A02
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            X.AbstractC09560e7.A00(r1)
            goto L5b
        L3f:
            X.AbstractC09560e7.A00(r1)
            boolean r0 = r9.A08
            if (r0 == 0) goto L73
            X.58u r0 = X.BFZ.A01(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode) r0
            if (r0 == 0) goto L73
            r7.A02 = r9
            r7.A01 = r11
            r7.A00 = r3
            java.lang.Object r1 = r0.Da5(r7, r11)
            if (r1 == r8) goto L72
            r0 = r9
        L5b:
            X.BFb r1 = (X.C25242BFb) r1
            long r3 = r1.A00
        L5f:
            X.5E5 r5 = r0.A00
            long r1 = X.C25242BFb.A02(r11, r3)
            r0 = 0
            r7.A02 = r0
            r7.A01 = r3
            r7.A00 = r6
            java.lang.Object r1 = r5.Da5(r7, r1)
            if (r1 != r8) goto L27
        L72:
            return r8
        L73:
            r3 = 0
            r0 = r9
            goto L5f
        L77:
            X.9Ca r7 = new X.9Ca
            r7.<init>(r9, r10, r3)
            goto L15
        L7d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.Da5(X.1Ds, long):java.lang.Object");
    }

    public static final C19L A00(NestedScrollNode nestedScrollNode) {
        C19L c19l;
        NestedScrollNode nestedScrollNode2;
        if ((!nestedScrollNode.A08 || (nestedScrollNode2 = (NestedScrollNode) BFZ.A01(nestedScrollNode)) == null || (c19l = A00(nestedScrollNode2)) == null) && (c19l = nestedScrollNode.A01.A02) == null) {
            throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
        return c19l;
    }

    @Override // X.InterfaceC1130758u
    public final Object CAp() {
        return "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // X.C5E5
    public final long Da2(long j, long j2, int i) {
        long j3;
        NestedScrollNode nestedScrollNode;
        long Da2 = this.A00.Da2(j, j2, i);
        if (this.A08 && (nestedScrollNode = (NestedScrollNode) BFZ.A01(this)) != null) {
            j3 = nestedScrollNode.Da2(C119365at.A07(j, Da2), C119365at.A06(j2, Da2), i);
        } else {
            j3 = 0;
        }
        return C119365at.A07(Da2, j3);
    }

    @Override // X.C5E5
    public final long DaA(long j, int i) {
        long j2;
        NestedScrollNode nestedScrollNode;
        if (this.A08 && (nestedScrollNode = (NestedScrollNode) BFZ.A01(this)) != null) {
            j2 = nestedScrollNode.DaA(j, i);
        } else {
            j2 = 0;
        }
        return C119365at.A07(j2, this.A00.DaA(C119365at.A06(j, j2), i));
    }

    public NestedScrollNode(C5E5 c5e5, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A00 = c5e5;
        this.A01 = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.A02 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }
}
