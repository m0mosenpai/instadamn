package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, 214, 215, 221}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0W7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0W7 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ InterfaceC19390xP A02;
    public final /* synthetic */ InterfaceC06180Ui A03;
    public final /* synthetic */ C10H A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W7(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP, InterfaceC06180Ui interfaceC06180Ui, C10H c10h) {
        super(2, interfaceC23621Ds);
        this.A04 = c10h;
        this.A02 = interfaceC19390xP;
        this.A03 = interfaceC06180Ui;
        this.A01 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C10H c10h = this.A04;
        return new C0W7(this.A01, interfaceC23621Ds, this.A02, this.A03, c10h);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0W7) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r7 = 4
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L65
            if (r0 != r3) goto L65
            X.AbstractC09560e7.A00(r9)
        L11:
            X.0xP r1 = r8.A02
            X.0Ui r0 = r8.A03
            r8.A00 = r4
        L17:
            java.lang.Object r0 = r1.collect(r0, r8)
        L1b:
            if (r0 != r6) goto L68
            return r6
        L1e:
            X.AbstractC09560e7.A00(r9)
            X.10H r1 = r8.A04
            X.10H r0 = X.C10I.A00
            if (r1 != r0) goto L2e
            X.0xP r1 = r8.A02
            X.0Ui r0 = r8.A03
            r8.A00 = r2
            goto L17
        L2e:
            X.10H r0 = X.C10I.A01
            r5 = 0
            if (r1 != r0) goto L47
            X.0Ui r0 = r8.A03
            X.0UO r1 = r0.C3V()
            X.0Wy r0 = new X.0Wy
            r0.<init>(r5)
            r8.A00 = r3
            java.lang.Object r0 = X.AbstractC209010m.A00(r8, r0, r1)
            if (r0 != r6) goto L11
            return r6
        L47:
            X.0Ui r4 = r8.A03
            X.0UO r0 = r4.C3V()
            X.0xP r0 = r1.AIW(r0)
            X.0xP r3 = X.C0ST.A01(r0)
            X.0xP r2 = r8.A02
            java.lang.Object r1 = r8.A01
            X.0WA r0 = new X.0WA
            r0.<init>(r1, r5, r2, r4)
            r8.A00 = r7
            java.lang.Object r0 = X.AbstractC18560vj.A00(r8, r0, r3)
            goto L1b
        L65:
            X.AbstractC09560e7.A00(r9)
        L68:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
