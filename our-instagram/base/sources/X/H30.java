package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import java.util.List;

/* loaded from: classes7.dex */
public final class H30 extends C0T6 implements JMS {
    public final CreatorViewerBottomCTA A00;
    public final CreatorViewerContextCTA A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;

    public H30(CreatorViewerBottomCTA creatorViewerBottomCTA, CreatorViewerContextCTA creatorViewerContextCTA, String str, List list, List list2, List list3) {
        AbstractC25233BEq.A0x(2, list, list2, list3);
        this.A00 = creatorViewerBottomCTA;
        this.A03 = list;
        this.A01 = creatorViewerContextCTA;
        this.A04 = list2;
        this.A05 = list3;
        this.A02 = str;
    }

    @Override // X.JMS
    public final H30 Esp(C1DY c1dy) {
        return this;
    }

    @Override // X.JMS
    public final H30 Esq(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H30) {
                H30 h30 = (H30) obj;
                if (!C14360o3.A0K(this.A00, h30.A00) || !C14360o3.A0K(this.A03, h30.A03) || !C14360o3.A0K(this.A01, h30.A01) || !C14360o3.A0K(this.A04, h30.A04) || !C14360o3.A0K(this.A05, h30.A05) || !C14360o3.A0K(this.A02, h30.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMS
    public final CreatorViewerBottomCTA AhW() {
        return this.A00;
    }

    @Override // X.JMS
    public final List AhY() {
        return this.A03;
    }

    @Override // X.JMS
    public final CreatorViewerContextCTA ArI() {
        return this.A01;
    }

    @Override // X.JMS
    public final List BxL() {
        return this.A04;
    }

    @Override // X.JMS
    public final List BxN() {
        return this.A05;
    }

    @Override // X.JMS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCreatorViewerInsightV2", AbstractC39873HmM.A00(this));
    }

    @Override // X.JMS
    public final String getTitle() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, (AbstractC166997dE.A0J(this.A03, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC25227BEk.A07(this.A02);
    }

    @Override // X.JMS
    public final JMS E8x(C1DY c1dy) {
        return this;
    }
}
