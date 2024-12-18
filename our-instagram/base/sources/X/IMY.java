package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;

/* loaded from: classes7.dex */
public final class IMY {
    public Fragment A00;
    public EnumC39584Hdu A01;
    public ProductSourceOverrideState A02;
    public Integer A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final FragmentActivity A09;
    public final UserSession A0A;
    public final String A0B;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00() {
        /*
            r5 = this;
            boolean r0 = r5.A06
            r1 = 0
            if (r0 != 0) goto L14
            boolean r0 = r5.A08
            if (r0 != 0) goto L14
            boolean r0 = r5.A07
            if (r0 != 0) goto L14
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L14:
            android.os.Bundle r4 = X.AbstractC166987dD.A0b()
            java.lang.String r0 = r5.A0B
            X.AbstractC37300Gc1.A0c(r4, r0)
            java.lang.Integer r0 = r5.A03
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            java.lang.String r0 = "should_return_result"
            r4.putBoolean(r0, r1)
            java.lang.String r1 = r5.A04
            java.lang.String r0 = "brand_selection_entry_point"
            r4.putString(r0, r1)
            r1 = 0
            java.lang.String r0 = "entry_point"
            r4.putString(r0, r1)
            java.lang.String r0 = r5.A05
            java.lang.String r2 = "waterfall_id"
            r4.putString(r2, r0)
            boolean r1 = r5.A06
            java.lang.String r0 = "show_brands_tab"
            r4.putBoolean(r0, r1)
            boolean r1 = r5.A08
            java.lang.String r0 = "show_collections_tab"
            r4.putBoolean(r0, r1)
            boolean r1 = r5.A07
            java.lang.String r0 = "show_catalogs_tab"
            r4.putBoolean(r0, r1)
            com.instagram.shopping.model.productsource.ProductSourceOverrideState r1 = r5.A02
            java.lang.String r0 = "product_source_override_state"
            r4.putParcelable(r0, r1)
            X.Hdu r0 = r5.A01
            if (r0 == 0) goto Lc1
            java.lang.String r1 = r0.name()
        L5f:
            java.lang.String r0 = "surface"
            r4.putString(r0, r1)
            boolean r1 = r5.A06
            boolean r0 = r5.A08
            if (r1 != 0) goto La7
            if (r0 != 0) goto La0
            boolean r0 = r5.A07
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L77
            r4.putString(r2, r0)
        L77:
            r1 = 0
            java.lang.String r0 = "is_onboarding"
            r4.putBoolean(r0, r1)
            com.instagram.common.session.UserSession r2 = r5.A0A
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r5.A09
            r0 = 5326(0x14ce, float:7.463E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.6XJ r2 = X.AbstractC31171DnF.A0L(r3, r4, r2, r1, r0)
        L8d:
            java.lang.Integer r0 = r5.A03
            if (r0 == 0) goto Lca
            androidx.fragment.app.Fragment r1 = r5.A00
            if (r1 == 0) goto Lc3
            X.C14360o3.A0A(r0)
            int r0 = r0.intValue()
            r2.A0D(r1, r0)
            return
        La0:
            boolean r0 = r5.A07
            if (r0 != 0) goto Lbe
            java.lang.String r2 = "shopping_collection_selection"
            goto Lb3
        La7:
            if (r0 != 0) goto Lbe
            boolean r0 = r5.A07
            if (r0 != 0) goto Lbe
            r0 = 5325(0x14cd, float:7.462E-42)
        Laf:
            java.lang.String r2 = X.AbstractC111324zv.A00(r0)
        Lb3:
            com.instagram.common.session.UserSession r1 = r5.A0A
            java.lang.Class<com.instagram.modal.ModalActivity> r0 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r5.A09
            X.6XJ r2 = X.AbstractC31171DnF.A0L(r3, r4, r1, r0, r2)
            goto L8d
        Lbe:
            r0 = 5339(0x14db, float:7.482E-42)
            goto Laf
        Lc1:
            r1 = 0
            goto L5f
        Lc3:
            java.lang.String r0 = "At least one of handlingFragment and handlingActivity should be not null!"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        Lca:
            r2.A0C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IMY.A00():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r1.A01(r4).A1N() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public IMY(androidx.fragment.app.FragmentActivity r3, com.instagram.common.session.UserSession r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.A09 = r3
            r2.A0A = r4
            r2.A0B = r5
            X.0cb r1 = X.C17060sy.A01
            com.instagram.user.model.User r0 = r1.A01(r4)
            boolean r0 = r0.A1O()
            if (r0 != 0) goto L20
            com.instagram.user.model.User r0 = r1.A01(r4)
            boolean r1 = r0.A1N()
            r0 = 0
            if (r1 == 0) goto L21
        L20:
            r0 = 1
        L21:
            r2.A06 = r0
            r2.A08 = r0
            boolean r0 = X.AbstractC199308rX.A00(r4)
            r2.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IMY.<init>(androidx.fragment.app.FragmentActivity, com.instagram.common.session.UserSession, java.lang.String):void");
    }
}
