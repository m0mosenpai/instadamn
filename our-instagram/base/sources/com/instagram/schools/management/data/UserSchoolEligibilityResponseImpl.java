package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;
import X.C95124Py;
import X.MSV;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class UserSchoolEligibilityResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtUserSchoolEligibility extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class PreviousRegistrationAttemptInfo extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class School extends C2JS implements C2JT {
                public School() {
                    super(-2022516561);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0Z(AbstractC58318PtA.A0Q(), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW A0i = AbstractC166987dD.A0i(C94754Oe.A00, MSV.A00(271));
                C4OK A0O = AbstractC58318PtA.A0O(School.class, "school", -2022516561);
                C94894Ou c94894Ou = C94894Ou.A00;
                return AbstractC58320PtC.A0U(c94894Ou, A0i, A0O, AbstractC166987dD.A0i(c94894Ou, "graduation_year"), MSV.A00(1207));
            }

            public PreviousRegistrationAttemptInfo() {
                super(-1093949010);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0V(AbstractC166987dD.A0i(C94894Ou.A00, "user_verification_status"), AbstractC166987dD.A0i(C95124Py.A00, "user_eligibility_status"), PreviousRegistrationAttemptInfo.class, "previous_registration_attempt_info", -1093949010);
        }

        public XdtUserSchoolEligibility() {
            super(-505317559);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XdtUserSchoolEligibility.class, "xdt_user_school_eligibility(input:$input)", -505317559);
    }

    public UserSchoolEligibilityResponseImpl() {
        super(647906811);
    }
}
