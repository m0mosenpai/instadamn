package com.instagram.creator.agent.settings.summary;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C2JS;
import X.C2JT;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class IGCreatorAISummaryQueryResponseImpl extends C2JS implements C2JT {

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
                        return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "bio");
                    }

                    public Persona() {
                        super(-1584022921);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0b(Persona.class, "persona", -1584022921);
                }

                public Ai() {
                    super(1573602634);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0b(Ai.class, "ai", 1573602634);
            }

            public CreatorAi() {
                super(1928901240);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0b(CreatorAi.class, "creator_ai", 1928901240);
        }

        public FetchIGUser() {
            super(254180558);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(FetchIGUser.class, "fetch__IGUser(igid:$igid)", 254180558);
    }

    public IGCreatorAISummaryQueryResponseImpl() {
        super(-1454498102);
    }
}
