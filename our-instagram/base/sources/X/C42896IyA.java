package X;

/* renamed from: X.IyA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42896IyA implements InterfaceC43413JGd {
    public final /* synthetic */ HCO A00;

    public C42896IyA(HCO hco) {
        this.A00 = hco;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r0.A00 == X.EnumC39617HeR.A04) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    @Override // X.InterfaceC43413JGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DbQ() {
        /*
            r8 = this;
            X.HCO r5 = r8.A00
            boolean r0 = r5.A09
            if (r0 == 0) goto L3d
            X.0cb r1 = X.C17060sy.A01
            X.0do r0 = r5.A0M
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r1, r0)
            boolean r0 = r0.A1O()
            if (r0 == 0) goto L3d
            X.GtM r0 = X.AbstractC37301Gc2.A0P(r5)
            X.2GT r1 = r0.A01
            X.Gjy r0 = X.AbstractC37302Gc3.A0N(r1)
            java.util.Set r0 = r0.A06
            boolean r0 = X.AbstractC31171DnF.A1b(r0)
            if (r0 == 0) goto L54
            X.Gjy r0 = X.AbstractC37302Gc3.A0N(r1)
            com.instagram.model.shopping.ProductSource r0 = r0.A00
            if (r0 == 0) goto L54
            X.Gjy r0 = X.AbstractC37302Gc3.A0N(r1)
            com.instagram.model.shopping.ProductSource r0 = r0.A00
            X.C14360o3.A0A(r0)
            X.HeR r1 = r0.A00
            X.HeR r0 = X.EnumC39617HeR.A04
            if (r1 != r0) goto L54
        L3d:
            r7 = 0
        L3e:
            X.0do r1 = r5.A0M
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r1)
            boolean r6 = X.AbstractC199308rX.A00(r0)
            if (r7 != 0) goto L56
            if (r6 != 0) goto L56
            java.lang.String r1 = "MultiProductPickerFragment"
            java.lang.String r0 = "Product source row clicked with no product source type enabled"
            X.C0w9.A03(r1, r0)
            return
        L54:
            r7 = 1
            goto L3e
        L56:
            X.1XJ r3 = X.C1XJ.A00
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r1)
            java.lang.String r0 = "multi_product_search"
            X.IMY r4 = r3.A0A(r2, r1, r0)
            r4.A06 = r7
            r4.A08 = r7
            r4.A07 = r6
            X.Hdu r0 = r5.A06
            if (r0 != 0) goto L7a
            java.lang.String r0 = "surface"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L7a:
            r4.A01 = r0
            X.GtM r0 = X.AbstractC37301Gc2.A0P(r5)
            X.2GT r1 = r0.A01
            X.Gjy r0 = X.AbstractC37302Gc3.A0N(r1)
            com.instagram.model.shopping.ProductSource r3 = r0.A00
            if (r3 == 0) goto Lb2
            X.Gjy r0 = X.AbstractC37302Gc3.A0N(r1)
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto Laf
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r2 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
        L94:
            X.Gjy r0 = X.AbstractC37302Gc3.A0N(r1)
            java.lang.String r1 = r0.A01
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = new com.instagram.shopping.model.productsource.ProductSourceOverrideState
            r0.<init>(r3, r2, r1)
        L9f:
            r4.A02 = r0
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A03 = r0
            r4.A00 = r5
            r4.A00()
            return
        Laf:
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r2 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.NONE
            goto L94
        Lb2:
            r0 = 0
            goto L9f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42896IyA.DbQ():void");
    }
}
