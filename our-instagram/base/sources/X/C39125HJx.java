package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HJx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39125HJx extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C64952wt A02;
    public final C41223IMo A03;
    public final String A04;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (X.I9E.A00(r3.A01.A0C, r3.A0P) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e3, code lost:
    
        if (r1 != null) goto L34;
     */
    @Override // X.AbstractC64162vb
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C41024IEt r15, X.H7J r16) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39125HJx.A03(X.IEt, X.H7J):void");
    }

    public C39125HJx(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64952wt c64952wt, C41223IMo c41223IMo, String str) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A00 = userSession;
        this.A02 = c64952wt;
        this.A04 = str;
        this.A01 = interfaceC60442pS;
        this.A03 = c41223IMo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (X.I9E.A00(r2.A01.A0C, r2.A0P) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r1 != null) goto L21;
     */
    @Override // X.AbstractC64162vb
    /* renamed from: A06, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(X.C41024IEt r11, X.H7J r12) {
        /*
            r10 = this;
            X.AbstractC167017dG.A1N(r12, r11)
            X.2pS r0 = r10.A01
            r3 = 0
            java.lang.String r0 = r0.getModuleName()
            boolean r0 = X.I6P.A00(r0)
            if (r0 != 0) goto Lbd
            com.instagram.model.shopping.productfeed.ProductFeedItem r8 = r12.A02
            com.instagram.user.model.Product r2 = r8.A02()
            com.instagram.model.shopping.productfeed.ProductTile r0 = r8.A02
            if (r0 == 0) goto L1e
            com.instagram.api.schemas.FBProductItemDetailsDict r3 = X.AbstractC41709Idf.A01(r0)
        L1e:
            if (r2 == 0) goto L37
            java.lang.String r1 = r12.A05
            java.lang.String r0 = "saved_products_collection"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L37
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r0.A0C
            boolean r0 = r2.A0P
            boolean r0 = X.I9E.A00(r1, r0)
            r7 = 1
            if (r0 != 0) goto L38
        L37:
            r7 = 0
        L38:
            X.GzB r0 = r12.A03
            java.lang.String r6 = r0.A03
            X.9C2 r5 = r0.A00
            java.lang.String r4 = r0.A02
            if (r2 != 0) goto L44
            if (r3 == 0) goto Lbd
        L44:
            X.2wt r2 = r10.A02
            int r1 = r11.A01
            int r0 = r11.A00
            X.IGs r3 = new X.IGs
            r3.<init>(r8, r2, r1, r0)
            java.lang.String r2 = r12.A05
            if (r2 == 0) goto L5a
            X.1Mh r1 = r3.A01
            java.lang.String r0 = "submodule"
            r1.A0R(r0, r2)
        L5a:
            if (r7 == 0) goto Lbe
            java.lang.String r1 = "add_to_bag"
        L5e:
            X.1Mh r0 = r3.A01
            r0.A0j(r1)
        L63:
            java.lang.Long r9 = r12.A00
            if (r9 == 0) goto L7f
            long r7 = r9.longValue()
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L7f
            X.1Mh r0 = r3.A01
            X.4SX r2 = new X.4SX
            r2.<init>(r9)
            java.lang.String r1 = "shop_linked_creator_id"
            X.0Ai r0 = r0.A00
            r0.AAK(r2, r1)
        L7f:
            X.2wt r0 = r3.A02
            if (r6 == 0) goto L93
            X.1Mh r2 = r3.A01
            r2.A0l(r6)
            com.instagram.common.session.UserSession r0 = r0.A02
            java.lang.String r1 = X.AbstractC41071vF.A0I(r0, r6)
            java.lang.String r0 = "tracking_token"
            r2.A0R(r0, r1)
        L93:
            if (r5 == 0) goto La7
            X.1Mh r2 = r3.A01
            java.lang.Object r1 = r5.A00
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.String r0 = "carousel_index"
            r2.A0Q(r0, r1)
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "carousel_media_id"
            r2.A0R(r0, r1)
        La7:
            if (r4 == 0) goto Lb0
            X.1Mh r1 = r3.A01
            java.lang.String r0 = "content_type"
            r1.A0R(r0, r4)
        Lb0:
            X.1Mh r0 = r3.A00
            boolean r0 = X.AbstractC25226BEj.A1Z(r0)
            if (r0 == 0) goto Lbd
            X.1Mh r0 = r3.A01
            r0.Cht()
        Lbd:
            return
        Lbe:
            com.instagram.model.shopping.productfeed.ProductTile r0 = r8.A02
            java.lang.String r1 = X.AbstractC41711Idh.A02(r0)
            if (r1 == 0) goto L63
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39125HJx.A04(X.IEt, X.H7J):void");
    }
}
