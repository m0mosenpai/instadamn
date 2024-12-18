package com.instagram.avatars.suggestions.graphql;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC43591JPw;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AbstractC58323PtF;
import X.C173847oc;
import X.C2JS;
import X.C2JT;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94894Ou;

/* loaded from: classes10.dex */
public final class RankedStickerImpl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class InlineXIGRankedAvatarSticker extends C2JS implements C2JT {

        /* loaded from: classes10.dex */
        public final class Sticker extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                C4OW A0V = AbstractC166997dE.A0V(c94754Oe);
                C4OW A0i = AbstractC166987dD.A0i(c94754Oe, "cdn_url");
                C4OW A0i2 = AbstractC166987dD.A0i(c94754Oe, "template");
                C4OW A0i3 = AbstractC166987dD.A0i(c94754Oe, "file_format");
                C4OW A0i4 = AbstractC166987dD.A0i(c94754Oe, "instruction_key_id");
                C94894Ou c94894Ou = C94894Ou.A00;
                return AbstractC166987dD.A0k(new C4OM[]{A0V, A0i, A0i2, A0i3, A0i4, AbstractC58319PtB.A0M(c94894Ou), AbstractC58319PtB.A0N(c94894Ou), AbstractC166987dD.A0i(c94894Ou, "fps"), AbstractC166987dD.A0i(c94754Oe, "accessibility_label"), AbstractC166987dD.A0i(c94754Oe, "media_type"), AbstractC166987dD.A0i(c94894Ou, "number_of_avatars"), AbstractC166987dD.A0i(C94754Oe.A01(), "tags")});
            }

            public Sticker() {
                super(1928639229);
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            return AbstractC167017dG.A0Y(C173847oc.A00, AbstractC58318PtA.A0O(Sticker.class, "sticker", 1928639229), "weight");
        }

        public InlineXIGRankedAvatarSticker() {
            super(1297693564);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58323PtF.A0Z(AbstractC58318PtA.A0M(InlineXIGRankedAvatarSticker.class, "InlineXIGRankedAvatarSticker", 1297693564), AbstractC43591JPw.A00(732));
    }

    public RankedStickerImpl() {
        super(-1231237410);
    }
}
