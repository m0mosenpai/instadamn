package com.instagram.adsdatapreferences.consentgrowth.controller;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C95124Py;

/* loaded from: classes11.dex */
public final class IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class UpdateIgOptOutFromThirdParty extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C95124Py.A00, "is_account_opt_out");
        }

        public UpdateIgOptOutFromThirdParty() {
            super(1014386575);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(UpdateIgOptOutFromThirdParty.class, "update_ig_opt_out_from_third_party(is_account_opt_out:$is_account_opt_out)", 1014386575);
    }

    public IGAdsPreferencesIsOptedOutFromThirdPartyMutationResponseImpl() {
        super(472966780);
    }
}
