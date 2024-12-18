package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HJq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39118HJq extends AbstractC64162vb {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C39125HJx A02;

    public C39118HJq(UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64952wt c64952wt, String str) {
        super(AbstractC37302Gc3.A0J(userSession));
        this.A01 = interfaceC60442pS;
        this.A00 = userSession;
        this.A02 = new C39125HJx(userSession, interfaceC60442pS, c64952wt, null, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r1 == null) goto L10;
     */
    @Override // X.AbstractC64162vb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A03(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            X.H7J r8 = (X.H7J) r8
            X.IEt r9 = (X.C41024IEt) r9
            X.AbstractC167017dG.A1N(r8, r9)
            com.instagram.model.shopping.productfeed.ProductFeedItem r3 = r8.A02
            java.lang.Integer r1 = r3.A06
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L76
            X.2pS r1 = r7.A01
            com.instagram.common.session.UserSession r0 = r7.A00
            int r6 = r9.A01
            int r5 = r9.A00
            X.0wW r1 = X.AbstractC12220kQ.A01(r1, r0)
            java.lang.String r0 = "instagram_collection_home_impression"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L76
            X.Epn r4 = X.EnumC33416Epn.A0C
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "collection_id"
            r2.AAP(r0, r1)
            java.lang.String r1 = r4.A00
            java.lang.String r0 = "collection_name"
            r2.AAP(r0, r1)
            X.AbstractC37301Gc2.A0x(r2, r6, r5)
            java.lang.String r1 = ""
            r0 = 904(0x388, float:1.267E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A9T(r0, r1)
            com.instagram.model.shopping.productfeed.ProductTile r0 = r3.A02
            if (r0 == 0) goto L4e
            com.instagram.user.model.Product r1 = r0.A07
            r0 = 1
            if (r1 != 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 456(0x1c8, float:6.39E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A7v(r0, r1)
            java.lang.String r0 = X.AbstractC37301Gc2.A0j(r3)
            java.lang.Long r0 = X.AbstractC166997dE.A0j(r0)
            X.AbstractC37300Gc1.A0i(r2, r0)
            X.AbstractC37302Gc3.A0t(r2)
            java.lang.String r1 = X.AbstractC37301Gc2.A0g(r2)
            java.lang.String r0 = "device_aspect_ratio_category"
            X.AbstractC25234BEr.A11(r2, r0, r1)
            r2.Cht()
        L76:
            X.HJx r0 = r7.A02
            r0.A03(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39118HJq.A03(java.lang.Object, java.lang.Object):void");
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        H7J h7j = (H7J) obj;
        C41024IEt c41024IEt = (C41024IEt) obj2;
        AbstractC167017dG.A1N(h7j, c41024IEt);
        this.A02.A04(c41024IEt, h7j);
    }
}
