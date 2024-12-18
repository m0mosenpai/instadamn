package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C14360o3;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C95124Py;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class CheckOTPCodeResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtCheckOtpCode extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class User extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class ShowSchoolsBadge extends C2JS implements C2JT {
                public ShowSchoolsBadge() {
                    super(-996463979);
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C4OW A0i = AbstractC166987dD.A0i(AbstractC58319PtB.A0R(), "graduation_year");
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(c94754Oe, A0i, AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94754Oe), "school_name"), "school_name_abbreviation");
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ShowSchoolsBadge.class, "show_schools_badge", -996463979);
            }

            public User() {
                super(-292801757);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC167007dF.A0Q(AbstractC166987dD.A0i(c94754Oe, "affiliation_id"), AbstractC166987dD.A0i(C95124Py.A00, "is_valid"), AbstractC166987dD.A0i(c94754Oe, "error"), AbstractC58318PtA.A0O(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -292801757));
        }

        public XdtCheckOtpCode() {
            super(-1567452650);
        }
    }

    public final XdtCheckOtpCode A0E() {
        C2JS A05 = A05(XdtCheckOtpCode.class, "xdt_check_otp_code(input:$input)", -1567452650);
        C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.schools.management.data.CheckOTPCodeResponseImpl.XdtCheckOtpCode");
        return (XdtCheckOtpCode) A05;
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtCheckOtpCode.class, "xdt_check_otp_code(input:$input)", -1567452650);
    }

    public CheckOTPCodeResponseImpl() {
        super(-1486915539);
    }
}
