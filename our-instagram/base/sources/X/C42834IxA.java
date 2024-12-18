package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.IxA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42834IxA implements InterfaceC57993Pnd {
    public final Fragment A00;
    public final UserSession A01;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // X.InterfaceC57993Pnd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DLr(X.InterfaceC104784ni r6, com.instagram.user.model.User r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            r4 = 1
            r2 = 0
            if (r6 == 0) goto L64
            com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles r1 = r6.Ayh()
            com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles r0 = com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles.A06
            if (r1 != r0) goto L5d
            java.lang.String r0 = "buy_on_instagram"
            r7 = r2
            r2 = r0
        L10:
            java.util.HashMap r3 = X.AbstractC166987dD.A1G()
            if (r8 == 0) goto L1b
            java.lang.String r0 = "offer_titles"
            r3.put(r0, r8)
        L1b:
            if (r9 == 0) goto L22
            java.lang.String r0 = "offer_terms"
            r3.put(r0, r9)
        L22:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "should_show_shop_eligible_products_button"
            r3.put(r0, r1)
            if (r2 == 0) goto L32
            java.lang.String r0 = "cta_button_destination"
            r3.put(r0, r2)
        L32:
            if (r7 == 0) goto L46
            java.lang.String r1 = r7.getId()
            java.lang.String r0 = "merchant_id"
            r3.put(r0, r1)
            java.lang.String r1 = r7.getUsername()
            java.lang.String r0 = "merchant_username"
            r3.put(r0, r1)
        L46:
            androidx.fragment.app.Fragment r2 = r5.A00
            r0 = 0
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C14360o3.A0C(r2, r0)
            X.2oe r2 = (X.AbstractC59962oe) r2
            com.instagram.common.session.UserSession r1 = r5.A01
            X.FPv r0 = new X.FPv
            r0.<init>(r2, r1, r3)
            r0.A00()
            return
        L5d:
            com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles r0 = com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles.A07
            if (r1 != r0) goto L64
            java.lang.String r2 = "storefront"
            goto L10
        L64:
            r4 = 0
            r7 = r2
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42834IxA.DLr(X.4ni, com.instagram.user.model.User, java.lang.String, java.lang.String):void");
    }

    public C42834IxA(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }
}
