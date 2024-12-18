package com.instagram.genai.imageservice.download;

import X.AbstractC23641Du;
import X.C12L;
import X.InterfaceC23621Ds;
import X.PZQ;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes8.dex */
public final class GenAIImageDownloadUtil {
    public static final GenAIImageDownloadUtil A00 = new Object();

    public static final Object A01(UserSession userSession, ImageUrl imageUrl, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC23641Du.A00(interfaceC23621Ds, C12L.A00.CPG(1293268845, 3), new PZQ(imageUrl, userSession, null, null, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, X.Khu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r7, com.instagram.common.typedurl.ImageUrl r8, com.instagram.genai.imageservice.download.GenAIImageDownloadUtil r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 29
            boolean r0 = X.MAH.A01(r11, r3)
            if (r0 == 0) goto L60
            r5 = r11
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r6 = X.C1JX.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L66
            java.lang.Object r3 = r5.A01
            X.Khu r3 = (X.C46495Khu) r3
            X.AbstractC09560e7.A00(r0)
        L28:
            r1 = 0
            r3.A00 = r1
            return r0
        L2c:
            X.AbstractC09560e7.A00(r0)
            X.3Pr r2 = new X.3Pr
            r2.<init>()
            r0 = 0
            X.BJp r1 = new X.BJp
            r1.<init>(r2, r0)
            X.Khu r3 = new X.Khu
            r3.<init>()
            r3.A00 = r1
            X.1No r0 = X.C25821No.A00()
            X.1OG r0 = r0.A0J(r8, r10)
            r0.A05 = r7
            r0.A02(r1)
            X.2nt r0 = r0.A00()
            r0.E7X()
            r5.A01 = r3
            r5.A00 = r4
            java.lang.Object r0 = r2.A0E(r5)
            if (r0 != r6) goto L28
            return r6
        L60:
            X.MAH r5 = new X.MAH
            r5.<init>(r9, r11, r3)
            goto L16
        L66:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.download.GenAIImageDownloadUtil.A00(com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, com.instagram.genai.imageservice.download.GenAIImageDownloadUtil, java.lang.String, X.1Ds):java.lang.Object");
    }
}
