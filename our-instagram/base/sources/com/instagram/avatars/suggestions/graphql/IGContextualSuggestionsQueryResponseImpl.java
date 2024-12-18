package com.instagram.avatars.suggestions.graphql;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58320PtC;
import X.C2JS;
import X.C2JT;
import X.C4OO;
import X.C4OU;
import X.C94754Oe;
import X.C95124Py;
import X.MSV;

/* loaded from: classes10.dex */
public final class IGContextualSuggestionsQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class XigContextualSuggestionsData extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class StickersRanking extends C2JS implements C2JT {

            /* loaded from: classes10.dex */
            public final class IntentRanking extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Stickers extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0a(RankedStickerImpl.class, "RankedSticker", -1231237410);
                    }

                    public Stickers() {
                        super(-57436586);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0X(C95124Py.A00, AbstractC166987dD.A0i(C94754Oe.A00, "intent"), AbstractC166987dD.A0h(C4OO.A02(), Stickers.class, "stickers", -57436586), "is_complete");
                }

                public IntentRanking() {
                    super(-1431638724);
                }
            }

            /* loaded from: classes10.dex */
            public final class PhraseRanking extends C2JS implements C2JT {

                /* loaded from: classes10.dex */
                public final class Stickers extends C2JS implements C2JT {
                    @Override // X.C2JS
                    public final C4OU modelSelectionSet() {
                        return AbstractC167017dG.A0a(RankedStickerImpl.class, "RankedSticker", -1231237410);
                    }

                    public Stickers() {
                        super(-332698846);
                    }
                }

                @Override // X.C2JS
                public final C4OU modelSelectionSet() {
                    return AbstractC167017dG.A0X(C95124Py.A00, AbstractC166987dD.A0i(C94754Oe.A00, "phrase"), AbstractC166987dD.A0h(C4OO.A02(), Stickers.class, "stickers", -332698846), "is_complete");
                }

                public PhraseRanking() {
                    super(1831790809);
                }
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC58320PtC.A0T(C4OO.A02(), AbstractC166987dD.A0h(C4OO.A02(), IntentRanking.class, AbstractC43591JPw.A00(1096), -1431638724), PhraseRanking.class, AbstractC43591JPw.A00(1242), 1831790809);
            }

            public StickersRanking() {
                super(-805091010);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0V(AbstractC166987dD.A0i(c94754Oe, AbstractC43591JPw.A00(1139)), AbstractC166987dD.A0i(c94754Oe, MSV.A00(110)), StickersRanking.class, AbstractC43591JPw.A00(1346), -805091010);
        }

        public XigContextualSuggestionsData() {
            super(1337481285);
        }
    }

    public final XigContextualSuggestionsData A0E() {
        return (XigContextualSuggestionsData) A03(XigContextualSuggestionsData.class, "xig_contextual_suggestions_data(avatar_config_hash:$avatar_config_hash,input:$query_params)", 1337481285);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC167017dG.A0b(XigContextualSuggestionsData.class, "xig_contextual_suggestions_data(avatar_config_hash:$avatar_config_hash,input:$query_params)", 1337481285);
    }

    public IGContextualSuggestionsQueryResponseImpl() {
        super(-1908940288);
    }
}
