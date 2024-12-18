package com.instagram.nme.contextualpromo;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class ContextualPromoHelper$Companion$getDefaultImageFetcher$1 {
    public final /* synthetic */ UserSession A00;

    public ContextualPromoHelper$Companion$getDefaultImageFetcher$1(UserSession userSession) {
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 16
            boolean r0 = X.PX5.A02(r9, r3)
            if (r0 == 0) goto L59
            r6 = r9
            X.PX5 r6 = (X.PX5) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto L61
            X.AbstractC09560e7.A00(r1)
        L25:
            X.C9i r1 = (X.AbstractC27440C9i) r1
            boolean r0 = r1 instanceof X.C27230Bzp
            if (r0 == 0) goto L32
            X.Bzp r1 = (X.C27230Bzp) r1
            X.3Pe r0 = r1.A00
            android.graphics.Bitmap r4 = r0.A01
        L31:
            return r4
        L32:
            boolean r0 = r1 instanceof X.C27229Bzo
            if (r0 != 0) goto L31
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L3b:
            X.AbstractC09560e7.A00(r1)
            if (r8 == 0) goto L31
            com.instagram.common.session.UserSession r2 = r7.A00
            android.util.LruCache r0 = X.AbstractC08820cl.A00
            android.net.Uri r1 = android.net.Uri.parse(r8)
            X.C14360o3.A07(r1)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC81033jX.A00(r1, r0, r0)
            r6.A00 = r3
            java.lang.Object r1 = com.instagram.genai.imageservice.download.GenAIImageDownloadUtil.A01(r2, r0, r6)
            if (r1 != r5) goto L25
            return r5
        L59:
            r0 = 42
            X.PX5 r6 = new X.PX5
            r6.<init>(r7, r9, r3, r0)
            goto L16
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoHelper$Companion$getDefaultImageFetcher$1.A00(java.lang.String, X.1Ds):java.lang.Object");
    }
}
