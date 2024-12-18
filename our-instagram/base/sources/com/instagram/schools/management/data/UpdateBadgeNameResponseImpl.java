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
public final class UpdateBadgeNameResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtUpdateBadgeName extends C2JS implements C2JT {

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
                    super(364802321);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(ShowSchoolsBadge.class, "show_schools_badge", 364802321);
            }

            public User() {
                super(-1624490405);
            }
        }

        public XdtUpdateBadgeName() {
            super(384275345);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0W(AbstractC58323PtF.A0Q(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -1624490405);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtUpdateBadgeName.class, "xdt_update_badge_name(input:$input)", 384275345);
    }

    public UpdateBadgeNameResponseImpl() {
        super(-888832041);
    }
}
