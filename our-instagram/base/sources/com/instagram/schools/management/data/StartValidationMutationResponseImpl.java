package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class StartValidationMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtStartValidation extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Schools extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58319PtB.A0U(AbstractC166997dE.A0V(c94754Oe), AbstractC58321PtD.A0U(c94754Oe), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.CITY), AbstractC166987dD.A0i(c94754Oe, "county"), AbstractC166987dD.A0i(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE));
            }

            public Schools() {
                super(-140705577);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167017dG.A0X(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "affiliation_id"), AbstractC166987dD.A0h(C4OO.A00(), Schools.class, "schools", -140705577), "error");
        }

        public XdtStartValidation() {
            super(-865944271);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtStartValidation.class, "xdt_start_validation(input:$input)", -865944271);
    }

    public StartValidationMutationResponseImpl() {
        super(290096273);
    }
}
