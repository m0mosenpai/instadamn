package com.instagram.creator.inspiration.repository.graphql;

import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.AbstractC65703TsZ;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OO;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94774Oi;
import X.C94894Ou;
import X.C95124Py;

/* loaded from: classes11.dex */
public final class AudioFragmentImpl extends C2JS implements C2JT {

    /* loaded from: classes11.dex */
    public final class Metadata extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C95124Py c95124Py = C95124Py.A00;
            return AbstractC58320PtC.A0U(C94894Ou.A00, AbstractC65703TsZ.A0i(c95124Py), new C4OW(C94754Oe.A00, "formatted_clips_media_count"), new C4OW(c95124Py, "is_trending_in_clips"), "trend_rank");
        }

        public Metadata() {
            super(1483975643);
        }
    }

    /* loaded from: classes11.dex */
    public final class OriginalSound extends C2JS implements C2JT {

        /* loaded from: classes11.dex */
        public final class AudioParts extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C4OW A0G = AbstractC65703TsZ.A0G(C95124Py.A00);
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0X(new C94774Oi(c94754Oe), A0G, AbstractC65703TsZ.A0Z(c94754Oe), "display_title");
            }

            public AudioParts() {
                super(1080001334);
            }
        }

        /* loaded from: classes10.dex */
        public final class IgArtist extends C2JS implements C2JT {
            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                C94754Oe c94754Oe = C94754Oe.A00;
                return AbstractC167017dG.A0X(c94754Oe, AbstractC166997dE.A0V(c94754Oe), AbstractC58322PtE.A0S(c94754Oe), "profile_pic_url");
            }

            public IgArtist() {
                super(-54680151);
            }
        }

        /* loaded from: classes11.dex */
        public final class ConsumptionInfo extends C2JS implements C2JT {
            public ConsumptionInfo() {
                super(-711392543);
            }

            @Override // X.C2JS
            public final C4OU modelSelectionSet() {
                return AbstractC167017dG.A0Z(AbstractC58319PtB.A0S(), "is_trending_in_clips");
            }
        }

        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0X = AbstractC65703TsZ.A0X(c94754Oe);
            C4OW A0P = AbstractC65703TsZ.A0P(c94754Oe);
            C4OK c4ok = new C4OK(C4OO.A01(), IgArtist.class, "ig_artist", -54680151);
            C4OW A0f = AbstractC65703TsZ.A0f(c94754Oe);
            C4OK c4ok2 = new C4OK(C4OO.A02(), AudioParts.class, "audio_parts", 1080001334);
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{A0X, A0P, c4ok, A0f, c4ok2, AbstractC65703TsZ.A0G(c95124Py), new C4OW(c94754Oe, "formatted_clips_media_count"), new C4OK(C4OO.A01(), ConsumptionInfo.class, "consumption_info", -711392543), AbstractC65703TsZ.A0M(c94754Oe), AbstractC65703TsZ.A0g(c94754Oe), new C4OW(C94894Ou.A00, "trend_rank"), new C4OW(c95124Py, "is_eligible_for_audio_effects")});
        }

        public OriginalSound() {
            super(-368279371);
        }
    }

    /* loaded from: classes11.dex */
    public final class Track extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            C4OW A0P = AbstractC58320PtC.A0P(c94754Oe);
            C4OW c4ow = new C4OW(c94754Oe, "audio_cluster_id");
            C4OW A0L = AbstractC58319PtB.A0L(c94754Oe);
            C4OW c4ow2 = new C4OW(c94754Oe, "display_artist");
            C4OW c4ow3 = new C4OW(c94754Oe, "cover_artwork_thumbnail_uri");
            C95124Py c95124Py = C95124Py.A00;
            return new C4OU(new C4OM[]{A0P, c4ow, A0L, c4ow2, c4ow3, AbstractC65703TsZ.A0G(c95124Py), new C4OW(c94754Oe, "progressive_download_url"), new C4OW(c94754Oe, "dash_manifest"), new C4OW(c94754Oe, "artist_id"), new C4OW(C94894Ou.A00(), "highlight_start_times_in_ms"), new C4OW(c94754Oe, "audio_asset_id"), AbstractC65703TsZ.A0W(c94754Oe), new C4OW(c95124Py, "is_eligible_for_audio_effects"), new C4OW(C94894Ou.A00, "duration_in_ms"), new C4OW(c95124Py, "has_lyrics"), AbstractC65703TsZ.A0V(c95124Py)});
        }

        public Track() {
            super(-1278535760);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58320PtC.A0V(new C4OK(Track.class, "track", -1278535760), new C4OK(OriginalSound.class, "original_sound", -368279371), Metadata.class, "metadata", 1483975643);
    }

    public AudioFragmentImpl() {
        super(-1423030943);
    }
}
