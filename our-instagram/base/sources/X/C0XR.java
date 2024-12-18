package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {215, 417}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* renamed from: X.0XR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XR extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ InterfaceC19390xP A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XR(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, InterfaceC19390xP interfaceC19390xP) {
        super(3, interfaceC23621Ds);
        this.A05 = interfaceC16660sJ;
        this.A06 = interfaceC19390xP;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C0XR c0xr = new C0XR((InterfaceC23621Ds) obj3, this.A05, this.A06);
        c0xr.A03 = obj;
        c0xr.A04 = obj2;
        return c0xr.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a2 -> B:5:0x001c). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1JX r7 = X.C1JX.A02
            int r0 = r14.A00
            r6 = 2
            r12 = 0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto La5
            if (r0 == r5) goto L5a
            java.lang.Object r9 = r14.A01
            X.0ps r9 = (X.C15370ps) r9
            java.lang.Object r8 = r14.A04
            X.1Is r8 = (X.InterfaceC24751Is) r8
            java.lang.Object r3 = r14.A03
            X.0yQ r3 = (X.InterfaceC19960yQ) r3
            X.AbstractC09560e7.A00(r15)
        L1c:
            java.lang.Object r1 = r9.A00
            X.0zt r0 = X.AbstractC20780zy.A00
            if (r1 == r0) goto Lca
            X.0pT r2 = new X.0pT
            r2.<init>()
            if (r1 == 0) goto L6f
            X.0sJ r0 = r14.A05
            X.0zt r11 = X.AbstractC20780zy.A01
            if (r1 != r11) goto L30
            r1 = r4
        L30:
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r2.A00 = r0
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 < 0) goto Lc2
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 != 0) goto L6f
            java.lang.Object r0 = r9.A00
            if (r0 != r11) goto L49
            r0 = r4
        L49:
            r14.A03 = r3
            r14.A04 = r8
            r14.A01 = r9
            r14.A02 = r2
            r14.A00 = r5
            java.lang.Object r0 = r3.emit(r0, r14)
            if (r0 != r7) goto L6d
            return r7
        L5a:
            java.lang.Object r2 = r14.A02
            X.0pT r2 = (X.C15130pT) r2
            java.lang.Object r9 = r14.A01
            X.0ps r9 = (X.C15370ps) r9
            java.lang.Object r8 = r14.A04
            X.1Is r8 = (X.InterfaceC24751Is) r8
            java.lang.Object r3 = r14.A03
            X.0yQ r3 = (X.InterfaceC19960yQ) r3
            X.AbstractC09560e7.A00(r15)
        L6d:
            r9.A00 = r4
        L6f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C2QS.A05
            X.12W r0 = r14.getContext()
            X.2QS r10 = new X.2QS
            r10.<init>(r0)
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L88
            long r0 = r2.A00
            X.0Xi r2 = new X.0Xi
            r2.<init>(r4, r9, r3)
            X.AbstractC190108bT.A00(r2, r10, r0)
        L88:
            X.3EL r1 = r8.BYo()
            X.0Xf r0 = new X.0Xf
            r0.<init>(r4, r9, r3)
            r10.A06(r0, r1)
            r14.A03 = r3
            r14.A04 = r8
            r14.A01 = r9
            r14.A02 = r4
            r14.A00 = r6
            java.lang.Object r0 = X.C2QS.A03(r14, r10)
            if (r0 != r7) goto L1c
            return r7
        La5:
            X.AbstractC09560e7.A00(r15)
            java.lang.Object r2 = r14.A03
            X.19L r2 = (X.C19L) r2
            java.lang.Object r3 = r14.A04
            X.0yQ r3 = (X.InterfaceC19960yQ) r3
            X.0xP r1 = r14.A06
            X.0Xd r0 = new X.0Xd
            r0.<init>(r4, r1)
            X.1Is r8 = X.AbstractC71523Is.A04(r0, r2)
            X.0ps r9 = new X.0ps
            r9.<init>()
            goto L1c
        Lc2:
            java.lang.String r1 = "Debounce timeout should not be negative"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Lca:
            X.0eB r7 = X.C0eB.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
