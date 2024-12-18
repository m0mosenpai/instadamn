package com.instagram.creator.agent.settings.summary;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class IGCreatorAISummaryViewMutationResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XigUpdateBioCreatorAgentPersona extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class CreatorAgentPersona extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "bio");
            }

            public CreatorAgentPersona() {
                super(260253895);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0b(CreatorAgentPersona.class, "creator_agent_persona", 260253895);
        }

        public XigUpdateBioCreatorAgentPersona() {
            super(-1931866927);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XigUpdateBioCreatorAgentPersona.class, "xig_update_bio_creator_agent_persona(data:$data)", -1931866927);
    }

    public IGCreatorAISummaryViewMutationResponseImpl() {
        super(-1777596999);
    }
}
