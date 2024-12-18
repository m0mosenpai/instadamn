package com.instagram.settings.privacy.messages.privacysettings.graphql;

import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C95124Py;

/* loaded from: classes10.dex */
public final class IGDirectPrivacySettingsTypingIndicatorMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XigSetTypingIndicatorDisabled extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Z(C95124Py.A00, "is_success");
        }

        public XigSetTypingIndicatorDisabled() {
            super(190828327);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XigSetTypingIndicatorDisabled.class, "xig_set_typing_indicator_disabled(is_disabled:$isDisabled)", 190828327);
    }

    public IGDirectPrivacySettingsTypingIndicatorMutationResponseImpl() {
        super(-537298301);
    }
}
