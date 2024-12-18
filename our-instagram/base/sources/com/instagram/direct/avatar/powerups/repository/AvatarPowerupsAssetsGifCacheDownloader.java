package com.instagram.direct.avatar.powerups.repository;

import X.AbstractC25225BEi;
import X.C14360o3;
import X.C7UR;
import X.C7US;
import X.MOY;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class AvatarPowerupsAssetsGifCacheDownloader implements MOY {
    public final UserSession A00;
    public final C7UR A01;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(3:14|15|16)(2:11|12))(2:17|18))(5:27|28|(1:30)|35|(1:33)(1:34))|19|(2:21|(4:23|(1:25)|15|16))|26|(0)|15|16))|37|6|7|(0)(0)|19|(0)|26|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r0 == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[Catch: M9p -> 0x00a0, TryCatch #0 {M9p -> 0x00a0, blocks: (B:14:0x002a, B:18:0x006d, B:19:0x0070, B:21:0x0087, B:26:0x009b, B:28:0x003f, B:30:0x0052, B:35:0x0064), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.MOY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQE(X.C45097JxR r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 6
            boolean r0 = X.MAK.A01(r11, r3)
            if (r0 == 0) goto L24
            r7 = r11
            X.MAK r7 = (X.MAK) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r7.A00 = r2
        L15:
            java.lang.Object r2 = r7.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r7.A00
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L3c
            if (r0 == r5) goto L33
            if (r0 != r8) goto L2e
            goto L2a
        L24:
            X.MAK r7 = new X.MAK
            r7.<init>(r9, r11, r3)
            goto L15
        L2a:
            X.AbstractC09560e7.A00(r2)     // Catch: X.C50101M9p -> La0
            goto La1
        L2e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L33:
            java.lang.Object r10 = r7.A02
            X.JxR r10 = (X.C45097JxR) r10
            java.lang.Object r1 = r7.A01
            com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader r1 = (com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader) r1
            goto L6d
        L3c:
            X.AbstractC09560e7.A00(r2)
            java.lang.Object r0 = r10.A02     // Catch: X.C50101M9p -> La0
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0     // Catch: X.C50101M9p -> La0
            java.lang.String r4 = X.AbstractC43592JPx.A0w(r0)     // Catch: X.C50101M9p -> La0
            X.AbstractC31172DnG.A1V(r9, r10, r7, r5)     // Catch: X.C50101M9p -> La0
            X.7UR r3 = r9.A01     // Catch: X.C50101M9p -> La0
            boolean r0 = r3.A07(r4)     // Catch: X.C50101M9p -> La0
            if (r0 != 0) goto L64
            X.3yw r2 = X.JQ0.A0r(r7)     // Catch: X.C50101M9p -> La0
            r1 = 0
            X.Ltg r0 = new X.Ltg     // Catch: X.C50101M9p -> La0
            r0.<init>(r1, r2)     // Catch: X.C50101M9p -> La0
            r3.A05(r0, r4)     // Catch: X.C50101M9p -> La0
            java.lang.Object r0 = r2.A00()     // Catch: X.C50101M9p -> La0
            goto L67
        L64:
            X.0eB r0 = X.C0eB.A00     // Catch: X.C50101M9p -> La0
            goto L69
        L67:
            if (r0 != r6) goto L64
        L69:
            if (r0 == r6) goto La5
            r1 = r9
            goto L70
        L6d:
            X.AbstractC09560e7.A00(r2)     // Catch: X.C50101M9p -> La0
        L70:
            java.lang.Object r0 = r10.A03     // Catch: X.C50101M9p -> La0
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0     // Catch: X.C50101M9p -> La0
            java.lang.String r4 = X.AbstractC43592JPx.A0w(r0)     // Catch: X.C50101M9p -> La0
            r0 = 0
            r7.A01 = r0     // Catch: X.C50101M9p -> La0
            r7.A02 = r0     // Catch: X.C50101M9p -> La0
            r7.A00 = r8     // Catch: X.C50101M9p -> La0
            X.7UR r3 = r1.A01     // Catch: X.C50101M9p -> La0
            boolean r0 = r3.A07(r4)     // Catch: X.C50101M9p -> La0
            if (r0 != 0) goto L9b
            X.3yw r2 = X.JQ0.A0r(r7)     // Catch: X.C50101M9p -> La0
            r1 = 0
            X.Ltg r0 = new X.Ltg     // Catch: X.C50101M9p -> La0
            r0.<init>(r1, r2)     // Catch: X.C50101M9p -> La0
            r3.A05(r0, r4)     // Catch: X.C50101M9p -> La0
            java.lang.Object r0 = r2.A00()     // Catch: X.C50101M9p -> La0
            if (r0 != r6) goto L9b
            goto L9d
        L9b:
            X.0eB r0 = X.C0eB.A00     // Catch: X.C50101M9p -> La0
        L9d:
            if (r0 != r6) goto La1
            return r6
        La0:
            r5 = 0
        La1:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
        La5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader.AQE(X.JxR, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ AvatarPowerupsAssetsGifCacheDownloader(UserSession userSession) {
        C7UR c7ur = C7UR.A0A;
        C7UR A00 = C7US.A00(AbstractC25225BEi.A0F(userSession));
        C14360o3.A0B(A00, 2);
        this.A00 = userSession;
        this.A01 = A00;
    }
}
