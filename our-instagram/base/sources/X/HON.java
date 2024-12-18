package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.ImmutablePandoPopularReelWithFollowersInsightMetadata;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadataImpl;

/* loaded from: classes7.dex */
public final class HON extends C17T implements JLM {
    @Override // X.JLM
    public final CreatorViewerInsightCTA AtV() {
        return (CreatorViewerInsightCTA) A0N(98832, J9V.A00);
    }

    @Override // X.JLM
    public final CreatorViewerInsightType BIH() {
        return (CreatorViewerInsightType) A0M(-1011512447, J9W.A00);
    }

    @Override // X.JLM
    public final PopularReelWithFollowersInsightMetadata BeV() {
        return (PopularReelWithFollowersInsightMetadata) A05(1340568954, ImmutablePandoPopularReelWithFollowersInsightMetadata.class);
    }

    @Override // X.JLM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39872HmL.A00(this));
    }

    @Override // X.JLM
    public final C38713H2z Esn() {
        PopularReelWithFollowersInsightMetadataImpl popularReelWithFollowersInsightMetadataImpl;
        CreatorViewerInsightCTA AtV = AtV();
        CreatorViewerInsightType BIH = BIH();
        PopularReelWithFollowersInsightMetadata BeV = BeV();
        if (BeV != null) {
            popularReelWithFollowersInsightMetadataImpl = BeV.Ey4();
        } else {
            popularReelWithFollowersInsightMetadataImpl = null;
        }
        return new C38713H2z(AtV, BIH, popularReelWithFollowersInsightMetadataImpl, A0P());
    }

    @Override // X.JLM
    public final String getText() {
        return A0P();
    }
}
