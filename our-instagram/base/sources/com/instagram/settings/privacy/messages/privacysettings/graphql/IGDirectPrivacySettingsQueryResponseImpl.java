package com.instagram.settings.privacy.messages.privacysettings.graphql;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C4OW;
import X.C94894Ou;
import X.C95124Py;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes4.dex */
public final class IGDirectPrivacySettingsQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes4.dex */
    public final class Viewer extends C2JS implements C2JT {

        /* loaded from: classes4.dex */
        public final class User extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C95124Py c95124Py = C95124Py.A00;
                C4OW A0i = AbstractC166987dD.A0i(c95124Py, "is_read_receipt_disabled");
                C4OW A0i2 = AbstractC166987dD.A0i(c95124Py, "is_typing_indicator_disabled");
                C94894Ou c94894Ou = C94894Ou.A00;
                return AbstractC167007dF.A0Q(A0i, A0i2, AbstractC166987dD.A0i(c94894Ou, "locked_threads_count"), AbstractC166987dD.A0i(c94894Ou, "disappearing_messages_expiry"));
            }

            public User() {
                super(510894145);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0b(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 510894145);
        }

        public Viewer() {
            super(1887838281);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(Viewer.class, "viewer", 1887838281);
    }

    public IGDirectPrivacySettingsQueryResponseImpl() {
        super(778330017);
    }
}
