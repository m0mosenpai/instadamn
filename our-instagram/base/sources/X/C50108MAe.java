package X;

/* renamed from: X.MAe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50108MAe extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50108MAe(InterfaceC23621Ds interfaceC23621Ds, int i, long j, long j2) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = j;
        this.A03 = j2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        long j = this.A02;
        long j2 = this.A03;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C50108MAe(interfaceC23621Ds, i, j, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r2 = r14.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r14.A00
            r7 = 1
            if (r2 == 0) goto L22
            if (r0 != 0) goto L35
            X.AbstractC09560e7.A00(r15)
            com.instagram.preferences.device.AppRestartLoggerPrefs r0 = com.instagram.preferences.device.AppRestartLoggerPrefs.A00
            long r3 = r14.A02
            long r5 = r14.A03
            X.MHv r2 = new X.MHv
            r2.<init>(r3, r5, r7)
        L19:
            r14.A00 = r7
            java.lang.Object r0 = r0.A02(r14, r2)
            if (r0 != r1) goto L38
            return r1
        L22:
            if (r0 != 0) goto L35
            X.AbstractC09560e7.A00(r15)
            com.instagram.preferences.device.AppRestartLoggerPrefs r0 = com.instagram.preferences.device.AppRestartLoggerPrefs.A00
            long r9 = r14.A02
            long r11 = r14.A03
            r13 = 0
            X.MHv r2 = new X.MHv
            r8 = r2
            r8.<init>(r9, r11, r13)
            goto L19
        L35:
            X.AbstractC09560e7.A00(r15)
        L38:
            X.0eB r1 = X.C0eB.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50108MAe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50108MAe) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
