package X;

import com.instagram.direct.securityalert.data.SecurityAlertRepository;

/* loaded from: classes8.dex */
public final class MBV extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public long A02;
    public final int A03 = 0;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBV(C49496Lu9 c49496Lu9, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = c49496Lu9;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            return new MBV((SecurityAlertRepository) this.A04, interfaceC23621Ds, this.A00, this.A02);
        }
        return new MBV((C49496Lu9) this.A04, interfaceC23621Ds);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:14:0x003f). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A03
            if (r0 == 0) goto L31
            X.1JX r3 = X.C1JX.A02
            int r0 = r10.A01
            r1 = 1
            if (r0 == 0) goto Lf
            X.AbstractC09560e7.A00(r11)
        Le:
            return r11
        Lf:
            X.AbstractC09560e7.A00(r11)
            java.lang.Object r0 = r10.A04
            com.instagram.direct.securityalert.data.SecurityAlertRepository r0 = (com.instagram.direct.securityalert.data.SecurityAlertRepository) r0
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r5 = r0.A02
            long r8 = r10.A02
            int r7 = r10.A00
            r10.A01 = r1
            X.12L r0 = X.C12L.A00
            r6 = 0
            X.0nZ r0 = X.AbstractC25231BEo.A0e(r0)
            X.MBs r4 = new X.MBs
            r4.<init>(r5, r6, r7, r8)
            java.lang.Object r11 = X.AbstractC23641Du.A00(r10, r0, r4)
            if (r11 != r3) goto Le
            return r3
        L31:
            X.1JX r3 = X.C1JX.A02
            int r0 = r10.A01
            r6 = 1
            if (r0 == 0) goto L51
            int r5 = r10.A00
            long r1 = r10.A02
            X.AbstractC09560e7.A00(r11)
        L3f:
            java.lang.Object r4 = r10.A04
            X.Lu9 r4 = (X.C49496Lu9) r4
            java.lang.Integer r0 = X.C05F.A00
            r4.A00(r5, r0)
            int r5 = r5 + 1
            r0 = 91
            if (r5 < r0) goto L57
            X.0eB r3 = X.C0eB.A00
            return r3
        L51:
            X.AbstractC09560e7.A00(r11)
            r1 = 44
            r5 = 1
        L57:
            r10.A02 = r1
            r10.A00 = r5
            r10.A01 = r6
            java.lang.Object r0 = X.AbstractC89993zf.A01(r10, r1)
            if (r0 != r3) goto L3f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBV) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBV(SecurityAlertRepository securityAlertRepository, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A04 = securityAlertRepository;
        this.A02 = j;
        this.A00 = i;
    }
}
