package com.instagram.creator.agent.settings.summary;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58320PtC;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class IGCreatorAISummaryViewRegenerateQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class FetchIGUser extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class CreatorAi extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class Ai extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Persona extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        C94754Oe c94754Oe = C94754Oe.A00;
                        return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "regenerate_bio");
                    }

                    public Persona() {
                        super(1211462083);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0b(Persona.class, "persona", 1211462083);
                }

                public Ai() {
                    super(938486414);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(Ai.class, "ai", 938486414);
            }

            public CreatorAi() {
                super(-10673103);
            }
        }

        public FetchIGUser() {
            super(383887332);
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0W(AbstractC58320PtC.A0N(), CreatorAi.class, "creator_ai", -10673103);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(FetchIGUser.class, "fetch__IGUser(igid:$igid)", 383887332);
    }

    public IGCreatorAISummaryViewRegenerateQueryResponseImpl() {
        super(-1731258501);
    }
}
