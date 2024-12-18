package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerInsightCTA;
import com.instagram.api.schemas.CreatorViewerInsightType;
import com.instagram.api.schemas.PopularReelWithFollowersInsightMetadata;

/* renamed from: X.H2z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38713H2z extends C0T6 implements JLM {
    public final CreatorViewerInsightCTA A00;
    public final CreatorViewerInsightType A01;
    public final PopularReelWithFollowersInsightMetadata A02;
    public final String A03;

    public C38713H2z(CreatorViewerInsightCTA creatorViewerInsightCTA, CreatorViewerInsightType creatorViewerInsightType, PopularReelWithFollowersInsightMetadata popularReelWithFollowersInsightMetadata, String str) {
        AbstractC167007dF.A1F(creatorViewerInsightType, 2, str);
        this.A00 = creatorViewerInsightCTA;
        this.A01 = creatorViewerInsightType;
        this.A02 = popularReelWithFollowersInsightMetadata;
        this.A03 = str;
    }

    @Override // X.JLM
    public final C38713H2z Esn() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38713H2z) {
                C38713H2z c38713H2z = (C38713H2z) obj;
                if (this.A00 != c38713H2z.A00 || this.A01 != c38713H2z.A01 || !C14360o3.A0K(this.A02, c38713H2z.A02) || !C14360o3.A0K(this.A03, c38713H2z.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLM
    public final CreatorViewerInsightCTA AtV() {
        return this.A00;
    }

    @Override // X.JLM
    public final CreatorViewerInsightType BIH() {
        return this.A01;
    }

    @Override // X.JLM
    public final PopularReelWithFollowersInsightMetadata BeV() {
        return this.A02;
    }

    @Override // X.JLM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerInsight", AbstractC39872HmL.A00(this));
    }

    @Override // X.JLM
    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, (AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }
}
