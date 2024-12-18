package X;

/* renamed from: X.IyB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42897IyB implements InterfaceC43413JGd {
    public final /* synthetic */ HCL A00;

    public C42897IyB(HCL hcl) {
        this.A00 = hcl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r1 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a7, code lost:
    
        if (r1 != false) goto L50;
     */
    @Override // X.InterfaceC43413JGd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DbQ() {
        /*
            r7 = this;
            X.HCL r2 = r7.A00
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            java.lang.String r6 = "productSourceOverrideState"
            if (r0 == 0) goto Lcb
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r3 = r0.A01
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r0 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.NONE
            if (r3 == r0) goto L27
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r0 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
            if (r3 == r0) goto L27
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L22
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto Lcb
            com.instagram.model.shopping.ProductSource r0 = r0.A00
            r3.A00(r1, r0)
            return
        L22:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L27:
            X.1XJ r5 = X.C1XJ.A00
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0do r4 = r2.A0N
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r4)
            java.lang.String r0 = "product_search"
            X.IMY r3 = r5.A0A(r3, r1, r0)
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r0 = r2.A08
            if (r0 == 0) goto Lc9
            boolean r0 = r0.A0A
            if (r0 == 0) goto L64
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r0, r4)
            boolean r0 = r0.A1O()
            if (r0 == 0) goto L64
            boolean r0 = X.HCL.A02(r2)
            if (r0 != 0) goto L64
            java.lang.String r1 = X.AbstractC31173DnH.A0t(r4)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r0.A02
            boolean r1 = X.C14360o3.A0K(r1, r0)
            r0 = 1
            if (r1 == 0) goto L65
        L64:
            r0 = 0
        L65:
            r3.A06 = r0
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r5 = r2.A09
            if (r5 == 0) goto Lcb
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r1 = r5.A01
            com.instagram.shopping.model.productsource.ProductSourceOverrideStatus r0 = com.instagram.shopping.model.productsource.ProductSourceOverrideStatus.ALREADY_TAGGED
            if (r1 != r0) goto Lc0
            com.instagram.model.shopping.ProductSource r0 = r5.A00
            if (r0 == 0) goto Lc0
            X.HeR r1 = r0.A00
            X.HeR r0 = X.EnumC39617HeR.A04
            if (r1 == r0) goto Lc0
            r0 = 0
        L7c:
            r3.A07 = r0
            com.instagram.shopping.intf.productpicker.ProductPickerArguments r0 = r2.A08
            if (r0 == 0) goto Lc9
            boolean r0 = r0.A0A
            if (r0 == 0) goto La9
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r0, r4)
            boolean r0 = r0.A1O()
            if (r0 == 0) goto La9
            boolean r0 = X.HCL.A02(r2)
            if (r0 != 0) goto La9
            java.lang.String r1 = X.AbstractC31173DnH.A0t(r4)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r0.A02
            boolean r1 = X.C14360o3.A0K(r1, r0)
            r0 = 1
            if (r1 == 0) goto Laa
        La9:
            r0 = 0
        Laa:
            r3.A08 = r0
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r0 = r2.A09
            if (r0 == 0) goto Lcb
            r3.A02 = r0
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A03 = r0
            r3.A00 = r2
            r3.A00()
            return
        Lc0:
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r4)
            boolean r0 = X.AbstractC199308rX.A00(r0)
            goto L7c
        Lc9:
            java.lang.String r6 = "arguments"
        Lcb:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42897IyB.DbQ():void");
    }
}
