package com.instagram.schools.management.data;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C14360o3;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C95124Py;
import X.MSV;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class SchoolSettingsResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtSchoolSettings extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class BadgeVisibilityMenuItems extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(c94754Oe, AbstractC166987dD.A0i(c94754Oe, "setting"), DevServerEntity.COLUMN_DESCRIPTION);
            }

            public BadgeVisibilityMenuItems() {
                super(-1240993684);
            }
        }

        /* loaded from: classes10.dex */
        public final class School extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC58319PtB.A0U(AbstractC58321PtD.A0U(c94754Oe), AbstractC166987dD.A0i(c94754Oe, ServerW3CShippingAddressConstants.CITY), AbstractC166987dD.A0i(c94754Oe, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE), AbstractC166987dD.A0i(c94754Oe, "county"), AbstractC166987dD.A0i(C94754Oe.A00(), "badge_names"));
            }

            public School() {
                super(1515139856);
            }
        }

        public final School A0E() {
            C2JS A05 = A05(School.class, "school", 1515139856);
            C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.schools.management.data.SchoolSettingsResponseImpl.XdtSchoolSettings.School");
            return (School) A05;
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C4OK A0h = AbstractC166987dD.A0h(C4OO.A01(), School.class, "school", 1515139856);
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0i = AbstractC166987dD.A0i(c94754Oe, MSV.A00(1565));
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC166987dD.A0k(new C4OM[]{A0h, A0i, AbstractC166987dD.A0i(c95124Py, MSV.A00(1012)), AbstractC166987dD.A0i(c95124Py, MSV.A00(1011)), AbstractC166987dD.A0i(c94754Oe, MSV.A00(1583)), AbstractC166987dD.A0i(c94754Oe, "selected_grad_year"), AbstractC166987dD.A0i(c94754Oe, AbstractC111324zv.A00(124)), AbstractC166987dD.A0i(c94754Oe, MSV.A00(392)), AbstractC166987dD.A0h(C4OO.A00(), BadgeVisibilityMenuItems.class, MSV.A00(976), -1240993684)});
        }

        public XdtSchoolSettings() {
            super(-152575241);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XdtSchoolSettings.class, MSV.A00(1751), -152575241);
    }

    public SchoolSettingsResponseImpl() {
        super(122164409);
    }
}
