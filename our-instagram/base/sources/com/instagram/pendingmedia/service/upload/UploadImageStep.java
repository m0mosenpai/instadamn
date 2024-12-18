package com.instagram.pendingmedia.service.upload;

import X.MQE;

/* loaded from: classes9.dex */
public final class UploadImageStep implements MQE {
    public final boolean A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.MQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F8t(X.OXD r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 19
            boolean r0 = X.PXA.A03(r9, r3)
            if (r0 == 0) goto L67
            r6 = r9
            X.PXA r6 = (X.PXA) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 != r4) goto L6c
            java.lang.Object r3 = r6.A02
            X.47Z r3 = (X.C47Z) r3
            java.lang.Object r8 = r6.A01
            X.OXD r8 = (X.OXD) r8
            X.AbstractC09560e7.A00(r1)
        L2c:
            boolean r0 = r1 instanceof X.NRL
            if (r0 == 0) goto L35
            X.3Du r0 = r8.A0D
            r0.EHr(r3)
        L35:
            return r1
        L36:
            X.AbstractC09560e7.A00(r1)
            X.47Z r3 = r8.A0C
            X.47k r2 = r3.A6J
            X.47k r1 = X.EnumC915447k.A09
            X.47k r0 = X.EnumC915447k.A02
            java.util.EnumSet r0 = java.util.EnumSet.of(r1, r0)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L71
            boolean r0 = r7.A00
            if (r0 == 0) goto L62
            com.instagram.pendingmedia.service.upload.ImageUploadUtil r1 = com.instagram.pendingmedia.service.upload.ImageUploadUtil.A00
            X.PXA.A01(r8, r3, r6, r4)
            X.NRM r0 = new X.NRM
            r0.<init>(r3)
            r8.A06 = r0
            java.lang.Object r1 = com.instagram.pendingmedia.service.upload.ImageUploadUtil.A02(r8, r1, r6)
            if (r1 != r5) goto L2c
            return r5
        L62:
            X.O3s r1 = com.instagram.pendingmedia.service.upload.ImageUploadUtil.A00(r8)
            goto L2c
        L67:
            X.PXA r6 = X.PXA.A00(r7, r9, r3)
            goto L16
        L6c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L71:
            X.NRK r1 = X.NRK.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.UploadImageStep.F8t(X.OXD, X.1Ds):java.lang.Object");
    }

    @Override // X.MQE
    public final String getName() {
        return "UploadImage";
    }

    public UploadImageStep(boolean z) {
        this.A00 = z;
    }

    public UploadImageStep() {
        this(false);
    }
}
