package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.9Cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206669Cx extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206669Cx(LazyListState lazyListState, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A01 = 0;
        this.A03 = lazyListState;
        this.A02 = i;
        this.A00 = i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        int i2;
        switch (this.A01) {
            case 0:
                return new C206669Cx((LazyListState) this.A03, interfaceC23621Ds, this.A02, this.A00);
            case 1:
                return new C206669Cx(this.A03, interfaceC23621Ds, this.A02, 1);
            case 2:
                obj2 = this.A03;
                i = this.A02;
                i2 = 2;
                return new C206669Cx(obj2, interfaceC23621Ds, i, i2);
            default:
                obj2 = this.A03;
                i = this.A02;
                i2 = 3;
                return new C206669Cx(obj2, interfaceC23621Ds, i, i2);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C206669Cx) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0ps, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L3e;
                case 2: goto L95;
                default: goto L5;
            }
        L5:
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 != r2) goto L26
            X.AbstractC09560e7.A00(r9)
        L11:
            return r9
        L12:
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r0 = r8.A03
            X.2Od r0 = (X.C49222Od) r0
            X.2PV r1 = r0.A00
            int r0 = r8.A02
            r8.A00 = r2
            java.lang.Object r9 = r1.A01(r0, r8)
            if (r9 != r6) goto L11
            return r6
        L26:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L2e:
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r2 = r8.A03
            androidx.compose.foundation.lazy.LazyListState r2 = (androidx.compose.foundation.lazy.LazyListState) r2
            int r1 = r8.A02
            int r0 = r8.A00
            r2.A05(r1, r0)
            goto Lc5
        L3e:
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r7 = 1
            if (r0 == 0) goto L4f
            if (r0 == r7) goto Lc2
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L4f:
            X.AbstractC09560e7.A00(r9)
            X.0ps r5 = new X.0ps
            r5.<init>()
            int r0 = r8.A02
            long r0 = (long) r0
            java.lang.String r1 = android.text.format.DateUtils.formatElapsedTime(r0)
            r5.A00 = r1
            java.lang.String r3 = "00:"
            X.C14360o3.A06(r1)
            r4 = 0
            r0 = 0
            boolean r0 = X.AbstractC002300n.A0h(r1, r3, r0)
            if (r0 == 0) goto L81
            java.lang.Object r2 = r5.A00
            X.C14360o3.A06(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            X.11L r1 = new X.11L
            r1.<init>(r3)
            java.lang.String r0 = "0:"
            java.lang.String r0 = r1.A01(r2, r0)
            r5.A00 = r0
        L81:
            X.12L r0 = X.C12L.A00
            X.12T r3 = r0.A04
            java.lang.Object r2 = r8.A03
            r1 = 42
            X.PZJ r0 = new X.PZJ
            r0.<init>(r5, r2, r4, r1)
            r8.A00 = r7
            java.lang.Object r0 = X.AbstractC23641Du.A00(r8, r3, r0)
            goto Lbf
        L95:
            X.1JX r6 = X.C1JX.A02
            int r0 = r8.A00
            r5 = 1
            if (r0 == 0) goto La6
            if (r0 == r5) goto Lc2
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        La6:
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r0 = r8.A03
            X.8NF r0 = (X.C8NF) r0
            X.05A r4 = r0.A07
            int r3 = r8.A02
            java.lang.Integer r2 = X.C05F.A0N
            r1 = 0
            X.8NG r0 = new X.8NG
            r0.<init>(r2, r1, r3, r3)
            r8.A00 = r5
            java.lang.Object r0 = r4.emit(r0, r8)
        Lbf:
            if (r0 != r6) goto Lc5
            return r6
        Lc2:
            X.AbstractC09560e7.A00(r9)
        Lc5:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206669Cx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206669Cx(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A01 = i2;
        this.A02 = i;
        this.A03 = obj;
    }
}
