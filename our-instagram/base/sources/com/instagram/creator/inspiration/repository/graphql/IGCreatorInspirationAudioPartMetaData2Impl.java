package com.instagram.creator.inspiration.repository.graphql;

import X.AbstractC166997dE;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC65703TsZ;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94774Oi;
import X.C95124Py;

/* loaded from: classes11.dex */
public final class IGCreatorInspirationAudioPartMetaData2Impl extends C2JS implements C2JT {

    /* loaded from: classes10.dex */
    public final class IgArtist extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(c94754Oe, AbstractC166997dE.A0V(c94754Oe), AbstractC58322PtE.A0S(c94754Oe), AbstractC58319PtB.A0P(C95124Py.A00), "profile_pic_url");
        }

        public IgArtist() {
            super(1193361057);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0e = AbstractC65703TsZ.A0e(c94754Oe);
        C4OW A0Z = AbstractC65703TsZ.A0Z(c94754Oe);
        C4OW c4ow = new C4OW(new C94774Oi(c94754Oe), "display_title");
        C4OK c4ok = new C4OK(IgArtist.class, "ig_artist", 1193361057);
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{A0e, A0Z, c4ow, c4ok, AbstractC65703TsZ.A0i(c95124Py), AbstractC65703TsZ.A0G(c95124Py), AbstractC65703TsZ.A0a(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "thumbnail_uri")});
    }

    public IGCreatorInspirationAudioPartMetaData2Impl() {
        super(787776735);
    }
}
