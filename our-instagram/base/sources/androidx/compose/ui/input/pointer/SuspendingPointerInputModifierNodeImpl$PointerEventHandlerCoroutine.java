package androidx.compose.ui.input.pointer;

import X.AbstractC114335Dx;
import X.AbstractC119105aS;
import X.AbstractC122655h0;
import X.AnonymousClass191;
import X.C119055aN;
import X.C12W;
import X.C1E2;
import X.C24891Jo;
import X.C57S;
import X.C59J;
import X.C5YB;
import X.C5YC;
import X.C6KL;
import X.C6KZ;
import X.EnumC25334BJd;
import X.InterfaceC1128957x;
import X.InterfaceC23621Ds;
import X.InterfaceC24901Jp;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine implements InterfaceC1128957x, InterfaceC23621Ds, C6KZ {
    public InterfaceC24901Jp A01;
    public final InterfaceC23621Ds A02;
    public final /* synthetic */ C6KL A04;
    public final /* synthetic */ C6KL A05;
    public EnumC25334BJd A00 = EnumC25334BJd.Main;
    public final C12W A03 = AnonymousClass191.A00;

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A05.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A05.B7e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.C6KZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FEC(X.InterfaceC23621Ds r13, X.InterfaceC16620sF r14, long r15) {
        /*
            r12 = this;
            r3 = 3
            boolean r0 = X.C9CY.A00(r13, r3)
            r7 = r12
            if (r0 == 0) goto L26
            r4 = r13
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L30
            java.lang.Object r2 = r4.A01
            X.195 r2 = (X.AnonymousClass195) r2
            goto L2c
        L26:
            X.9CY r4 = new X.9CY
            r4.<init>(r12, r13, r3)
            goto L16
        L2c:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L85
            goto L7f
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L38:
            X.AbstractC09560e7.A00(r1)
            r1 = 0
            r10 = r15
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 > 0) goto L5f
            X.1Jp r2 = r12.A01
            if (r2 == 0) goto L5f
            java.lang.String r1 = "Timed out waiting for "
            java.lang.String r0 = " ms"
            java.lang.String r0 = X.AnonymousClass001.A0e(r1, r0, r10)
            X.X2B r1 = new X.X2B
            r1.<init>(r0)
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.0e5 r0 = new X.0e5
            r0.<init>(r1)
            r2.resumeWith(r0)
        L5f:
            X.6KL r0 = r12.A04
            X.19L r2 = r0.A05()
            r8 = 0
            r9 = 2
            X.9Cw r6 = new X.9Cw
            r6.<init>(r7, r8, r9, r10)
            X.191 r1 = X.AnonymousClass191.A00
            java.lang.Integer r0 = X.C05F.A00
            X.1Dx r2 = X.AbstractC23641Du.A03(r0, r1, r6, r2)
            r4.A01 = r2     // Catch: java.lang.Throwable -> L85
            r4.A00 = r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = r14.invoke(r12, r4)     // Catch: java.lang.Throwable -> L85
            if (r1 != r5) goto L7f
            return r5
        L7f:
            X.X2C r0 = X.X2C.A00
            r2.AGH(r0)
            return r1
        L85:
            r1 = move-exception
            X.X2C r0 = X.X2C.A00
            r2.AGH(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.FEC(X.1Ds, X.0sF, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // X.C6KZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object FED(X.InterfaceC23621Ds r6, X.InterfaceC16620sF r7, long r8) {
        /*
            r5 = this;
            r3 = 7
            boolean r0 = X.MAQ.A02(r6, r3)
            if (r0 == 0) goto L21
            r4 = r6
            X.MAQ r4 = (X.MAQ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L2d
            goto L29
        L21:
            r0 = 42
            X.MAQ r4 = new X.MAQ
            r4.<init>(r5, r6, r3, r0)
            goto L15
        L29:
            X.AbstractC09560e7.A00(r3)     // Catch: X.X2B -> L41
            return r3
        L2d:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L35:
            X.AbstractC09560e7.A00(r3)
            r4.A00 = r0     // Catch: X.X2B -> L41
            java.lang.Object r3 = r5.FEC(r4, r7, r8)     // Catch: X.X2B -> L41
            if (r3 != r2) goto L42
            return r2
        L41:
            r3 = 0
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine.FED(X.1Ds, X.0sF, long):java.lang.Object");
    }

    public SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine(C6KL c6kl, InterfaceC23621Ds interfaceC23621Ds) {
        this.A04 = c6kl;
        this.A02 = interfaceC23621Ds;
        this.A05 = c6kl;
    }

    @Override // X.C6KZ
    public final Object AD8(EnumC25334BJd enumC25334BJd, InterfaceC23621Ds interfaceC23621Ds) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        this.A00 = enumC25334BJd;
        this.A01 = c24891Jo;
        return c24891Jo.A0E();
    }

    @Override // X.C6KZ
    public final long B3X() {
        C6KL c6kl = this.A04;
        long A04 = AbstractC119105aS.A04(c6kl, AbstractC114335Dx.A02(c6kl).A0B.BUC());
        long j = c6kl.A00;
        return C5YB.A00(Math.max(0.0f, C5YC.A02(A04) - ((int) (j >> 32))) / 2.0f, Math.max(0.0f, C5YC.A00(A04) - C119055aN.A00(j)) / 2.0f);
    }

    @Override // X.C6KZ
    public final C59J CFl() {
        return AbstractC114335Dx.A02(this.A04).A0B;
    }

    @Override // X.InterfaceC1128957x
    public final int EL8(float f) {
        return AbstractC119105aS.A01(this.A05, f);
    }

    @Override // X.C57y
    public final float EqG(long j) {
        return AbstractC122655h0.A00(this.A05, j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqH(float f) {
        return f / this.A05.Awk();
    }

    @Override // X.InterfaceC1128957x
    public final float EqI(int i) {
        return i / this.A05.Awk();
    }

    @Override // X.InterfaceC1128957x
    public final long EqJ(long j) {
        return AbstractC119105aS.A03(this.A05, j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqS(long j) {
        return AbstractC119105aS.A00(this.A05, j);
    }

    @Override // X.InterfaceC1128957x
    public final float EqT(float f) {
        return f * this.A05.Awk();
    }

    @Override // X.InterfaceC1128957x
    public final long F7k(long j) {
        return AbstractC119105aS.A04(this.A05, j);
    }

    @Override // X.C57y
    public final long F7l(float f) {
        return AbstractC122655h0.A01(this.A05, f);
    }

    @Override // X.InterfaceC1128957x
    public final long F7m(float f) {
        C6KL c6kl = this.A05;
        return c6kl.F7l(c6kl.EqH(f));
    }

    @Override // X.InterfaceC23621Ds
    public final C12W getContext() {
        return this.A03;
    }

    @Override // X.InterfaceC23621Ds
    public final void resumeWith(Object obj) {
        C57S c57s = this.A04.A07;
        synchronized (c57s) {
            c57s.A0B(this);
        }
        this.A02.resumeWith(obj);
    }
}
