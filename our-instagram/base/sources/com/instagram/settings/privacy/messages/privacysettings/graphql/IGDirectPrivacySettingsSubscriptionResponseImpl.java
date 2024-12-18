package com.instagram.settings.privacy.messages.privacysettings.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class IGDirectPrivacySettingsSubscriptionResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XigDirectPrivacySettingsSubscribe extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC167017dG.A0Y(c95124Py, AbstractC166987dD.A0i(c95124Py, "read_receipts_disabled"), "typing_indicator_disabled");
        }

        public XigDirectPrivacySettingsSubscribe() {
            super(1243648941);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XigDirectPrivacySettingsSubscribe.class, "xig_direct_privacy_settings_subscribe", 1243648941);
    }

    public IGDirectPrivacySettingsSubscriptionResponseImpl() {
        super(29923216);
    }
}
