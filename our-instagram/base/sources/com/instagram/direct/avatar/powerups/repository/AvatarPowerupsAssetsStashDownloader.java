package com.instagram.direct.avatar.powerups.repository;

import X.C1M7;
import X.C1MR;
import X.C7UQ;
import X.MOY;
import com.facebook.stash.core.FileStash;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class AvatarPowerupsAssetsStashDownloader implements MOY {
    public final FileStash A00;
    public final C7UQ A01;

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarPowerupsAssetsStashDownloader() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(3:18|19|(1:21))|14|15|16))|23|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // X.MOY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQE(X.C45097JxR r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 34
            boolean r0 = X.C29630D3l.A03(r10, r3)
            if (r0 == 0) goto L23
            r7 = r10
            X.D3l r7 = (X.C29630D3l) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L2f
            goto L2b
        L23:
            r0 = 42
            X.D3l r7 = new X.D3l
            r7.<init>(r8, r10, r3, r0)
            goto L16
        L2b:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L4f
            goto L4e
        L2f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L34:
            X.AbstractC09560e7.A00(r1)
            X.12L r0 = X.C12L.A00     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L4f
            r3 = 0
            X.0nZ r2 = X.AbstractC25231BEo.A0e(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L4f
            r1 = 38
            X.MBw r0 = new X.MBw     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L4f
            r0.<init>(r8, r9, r3, r1)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L4f
            r7.A00 = r4     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L4f
            java.lang.Object r0 = X.AbstractC23641Du.A00(r7, r2, r0)     // Catch: java.lang.Throwable -> L4f java.lang.Throwable -> L4f
            if (r0 != r6) goto L4e
            return r6
        L4e:
            r5 = 1
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsStashDownloader.AQE(X.JxR, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ AvatarPowerupsAssetsStashDownloader(FileStash fileStash, C7UQ c7uq, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C1MR A05 = C1M7.A01().A05(1522475227);
        C7UQ c7uq2 = new C7UQ(A05);
        this.A00 = A05;
        this.A01 = c7uq2;
    }
}
