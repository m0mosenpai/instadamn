package com.instagram.schools.management.data;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58323PtF;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: classes10.dex */
public final class UpdateGradYearResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtUpdateGraduation extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class User extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class ShowSchoolsBadge extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(AbstractC58319PtB.A0R(), AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94754Oe), "school_name"), AbstractC166987dD.A0i(c94754Oe, "school_name_abbreviation"), "graduation_year");
                }

                public ShowSchoolsBadge() {
                    super(1109422879);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ShowSchoolsBadge.class, "show_schools_badge", 1109422879);
            }

            public User() {
                super(491786776);
            }
        }

        public XdtUpdateGraduation() {
            super(374151420);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0W(AbstractC58323PtF.A0Q(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 491786776);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtUpdateGraduation.class, "xdt_update_graduation(input:$input)", 374151420);
    }

    public UpdateGradYearResponseImpl() {
        super(741590176);
    }
}
