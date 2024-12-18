package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.AbstractC166997dE;
import X.AbstractC58320PtC;
import X.AbstractC65702TsY;
import X.AbstractC65703TsZ;
import X.AbstractC70143W6w;
import X.C14360o3;
import X.C2JS;
import X.C4OK;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C94774Oi;
import X.C95124Py;
import X.VFB;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl extends C2JS implements CreatorInspirationSignalsPlaygroundAudioPartMetadata2 {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -2113477131;

    /* loaded from: classes11.dex */
    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes11.dex */
    public final class IgArtist extends C2JS implements CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1202860027;

        /* loaded from: classes11.dex */
        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return IgArtist.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist
        public boolean isVerified() {
            return getCoercedBooleanField(2, "is_verified");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist
        public String getId() {
            return A07("strong_id__");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist
        public String getProfilePicUrl() {
            return A0A("profile_pic_url");
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist
        public boolean hasIsVerified() {
            return hasFieldValue("is_verified");
        }

        @Override // X.C2JS
        public C4OU modelSelectionSet() {
            C94754Oe c94754Oe = C94754Oe.A00;
            return AbstractC58320PtC.A0U(c94754Oe, AbstractC166997dE.A0V(c94754Oe), new C4OW(c94754Oe, AbstractC70143W6w.A00()), new C4OW(C95124Py.A00, "is_verified"), "profile_pic_url");
        }

        public IgArtist(int i) {
            super(i);
        }

        @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist
        public String getUsername() {
            return A08(AbstractC70143W6w.A00());
        }

        public IgArtist() {
            super(TYPE_TAG);
        }
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public String getDisplayArtist() {
        return AbstractC65702TsY.A0a(this, "display_artist", 1);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public String getDisplayTitle() {
        return AbstractC65702TsY.A0a(this, "display_title", 2);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public String getMusicCanonicalId() {
        return AbstractC65702TsY.A0a(this, "music_canonical_id", 6);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public String getThumbnailUri() {
        return AbstractC65702TsY.A0a(this, "thumbnail_uri", 7);
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public boolean hasIsBookmarked() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public boolean hasIsExplicit() {
        return true;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public boolean isBookmarked() {
        return getRequiredBooleanField(4, "is_bookmarked");
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public boolean isExplicit() {
        return getRequiredBooleanField(5, "is_explicit");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public VFB getAudioType() {
        Enum requiredEnumField = getRequiredEnumField(0, "audio_type", VFB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        C14360o3.A07(requiredEnumField);
        return (VFB) requiredEnumField;
    }

    @Override // com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundAudioPartMetadata2
    public CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist getIgArtist() {
        return (CreatorInspirationSignalsPlaygroundAudioPartMetadata2.IgArtist) getOptionalTreeField(3, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
    }

    @Override // X.C2JS
    public C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW A0e = AbstractC65703TsZ.A0e(c94754Oe);
        C4OW A0Z = AbstractC65703TsZ.A0Z(c94754Oe);
        C4OW c4ow = new C4OW(new C94774Oi(c94754Oe), "display_title");
        C4OK c4ok = new C4OK(IgArtist.class, "ig_artist", IgArtist.TYPE_TAG);
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{A0e, A0Z, c4ow, c4ok, AbstractC65703TsZ.A0i(c95124Py), AbstractC65703TsZ.A0G(c95124Py), AbstractC65703TsZ.A0a(c94754Oe), new C4OW(new C94774Oi(c94754Oe), "thumbnail_uri")});
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl() {
        super(TYPE_TAG);
    }
}
