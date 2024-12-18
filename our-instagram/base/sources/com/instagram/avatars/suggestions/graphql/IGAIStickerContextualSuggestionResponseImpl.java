package com.instagram.avatars.suggestions.graphql;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58320PtC;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;

/* loaded from: classes10.dex */
public final class IGAIStickerContextualSuggestionResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XfbAiStickersContextualSuggestions extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Sticker extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0Y(c94754Oe, AbstractC166997dE.A0V(c94754Oe), "url");
            }

            public Sticker() {
                super(1652439996);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC58320PtC.A0W(AbstractC166987dD.A0i(C94754Oe.A00, "context"), Sticker.class, "sticker", 1652439996);
        }

        public XfbAiStickersContextualSuggestions() {
            super(-1228959536);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0W(C4OO.A02(), XfbAiStickersContextualSuggestions.class, AbstractC43591JPw.A00(1415), -1228959536);
    }

    public IGAIStickerContextualSuggestionResponseImpl() {
        super(1826815260);
    }
}
