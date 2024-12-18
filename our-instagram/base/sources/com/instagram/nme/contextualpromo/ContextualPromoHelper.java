package com.instagram.nme.contextualpromo;

import X.AbstractC25225BEi;
import X.AbstractC40691uc;
import X.C07X;
import X.C07Y;
import X.C19L;
import X.O8K;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ContextualPromoHelper {
    public final UserSession A00;
    public final ContextualPromoApi A01;
    public final ContextualPromoHelper$Companion$getDefaultImageFetcher$1 A02;
    public final O8K A03;

    public ContextualPromoHelper(UserSession userSession, C19L c19l) {
        ContextualPromoApi contextualPromoApi = new ContextualPromoApi(AbstractC40691uc.A01(userSession), AbstractC25225BEi.A07(AbstractC25225BEi.A0j(userSession, 1), userSession, 36610515979802734L));
        ContextualPromoHelper$Companion$getDefaultImageFetcher$1 contextualPromoHelper$Companion$getDefaultImageFetcher$1 = new ContextualPromoHelper$Companion$getDefaultImageFetcher$1(userSession);
        O8K o8k = new O8K(contextualPromoApi, c19l);
        this.A00 = userSession;
        this.A01 = contextualPromoApi;
        this.A02 = contextualPromoHelper$Companion$getDefaultImageFetcher$1;
        this.A03 = o8k;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bc -> B:11:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r25, X.InterfaceC23621Ds r26) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoHelper.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.EnumC53317Nht r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nme.contextualpromo.ContextualPromoHelper.A01(X.Nht, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public static ContextualPromoHelper A00(C07X c07x, UserSession userSession) {
        return new ContextualPromoHelper(userSession, C07Y.A00(c07x));
    }
}
