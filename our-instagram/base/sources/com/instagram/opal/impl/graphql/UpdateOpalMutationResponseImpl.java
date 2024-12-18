package com.instagram.opal.impl.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58321PtD;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import X.MSV;

/* loaded from: classes10.dex */
public final class UpdateOpalMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XdtUpdateOpal extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Opal extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class OpalInfo extends C2JS implements C2JT {
                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    C94754Oe c94754Oe = C94754Oe.A00;
                    return AbstractC167017dG.A0X(c94754Oe, AbstractC58321PtD.A0U(c94754Oe), AbstractC166987dD.A0i(c94754Oe, "bio"), "profile_picture_url");
                }

                public OpalInfo() {
                    super(-480358044);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(OpalInfo.class, "opal_info", -480358044);
            }

            public Opal() {
                super(1857650734);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58319PtB.A0T(AbstractC58319PtB.A0D(AbstractC166987dD.A0j(c94754Oe)), AbstractC166987dD.A0i(AbstractC166987dD.A0j(c94754Oe), "error_message"), AbstractC166987dD.A0h(C4OO.A01(), Opal.class, "opal", 1857650734));
        }

        public XdtUpdateOpal() {
            super(935844365);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A01(), XdtUpdateOpal.class, MSV.A00(1758), 935844365);
    }

    public UpdateOpalMutationResponseImpl() {
        super(-2036426954);
    }
}
