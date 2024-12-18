package com.instagram.shopping.repository.mediafeed;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.C008002u;
import X.C05A;
import X.C16930sl;
import X.C1DW;
import X.C38321qM;
import X.C3XH;
import X.E72;
import X.InterfaceC19390xP;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes7.dex */
public final class FeaturedProductsMediaFeedRepository {
    public final InterfaceC19390xP A00;
    public final UserSession A01;
    public final String A02;
    public final C05A A03;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 9
            boolean r0 = X.C57146PWy.A01(r7, r3)
            if (r0 == 0) goto L73
            r5 = r7
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L73
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L5e
            if (r0 != r3) goto L86
            java.lang.Object r1 = r5.A01
            com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository r1 = (com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository) r1
            X.AbstractC09560e7.A00(r2)
        L28:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L55
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.HAF r0 = (X.HAF) r0
            X.05A r5 = r1.A03
            java.lang.Object r1 = r5.getValue()
            X.E72 r1 = (X.E72) r1
            X.IFQ r0 = r0.A00
            if (r0 == 0) goto L7c
            java.util.List r4 = r0.A00
            if (r4 == 0) goto L79
            boolean r3 = r0.A01
            boolean r2 = r1.A02
            r1 = 10
            X.E72 r0 = new X.E72
            r0.<init>(r4, r1, r3, r2)
            r5.Egh(r0)
        L52:
            X.0eB r4 = X.C0eB.A00
        L54:
            return r4
        L55:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L52
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5e:
            X.AbstractC09560e7.A00(r2)
            com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi r2 = com.instagram.shopping.repository.featuredproducts.FeaturedProductsMediaApi.A00
            com.instagram.common.session.UserSession r1 = r6.A01
            java.lang.String r0 = r6.A02
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r2 = r2.A00(r1, r0, r5)
            if (r2 == r4) goto L54
            r1 = r6
            goto L28
        L73:
            X.PWy r5 = new X.PWy
            r5.<init>(r6, r7, r3)
            goto L16
        L79:
            java.lang.String r0 = "mediaFeed"
            goto L7e
        L7c:
            java.lang.String r0 = "pivotItems"
        L7e:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L86:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.shopping.repository.mediafeed.FeaturedProductsMediaFeedRepository.A00(X.1Ds):java.lang.Object");
    }

    public FeaturedProductsMediaFeedRepository(UserSession userSession, String str, String str2, boolean z) {
        List list;
        boolean A1V = AbstractC167007dF.A1V(str);
        this.A01 = userSession;
        this.A02 = str;
        if (z) {
            C38321qM A02 = C1DW.A00(userSession).A02(str2 != null ? str2 : str);
            if (A02 != null) {
                list = AbstractC166987dD.A1J(C3XH.A01(A02));
                C008002u A1H = AbstractC25225BEi.A1H(new E72(list, 10, A1V, false));
                this.A03 = A1H;
                this.A00 = AbstractC208910l.A02(A1H);
            }
        }
        list = C16930sl.A00;
        C008002u A1H2 = AbstractC25225BEi.A1H(new E72(list, 10, A1V, false));
        this.A03 = A1H2;
        this.A00 = AbstractC208910l.A02(A1H2);
    }
}
