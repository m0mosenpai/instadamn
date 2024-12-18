package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerBottomCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerContextCTA;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalModel;
import com.instagram.api.schemas.ImmutablePandoCreatorViewerSignalWithInsightsInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HOO extends C17T implements JMS {
    public List A00;

    @Override // X.JMS
    public final CreatorViewerBottomCTA AhW() {
        return (CreatorViewerBottomCTA) A05(-1682227716, ImmutablePandoCreatorViewerBottomCTA.class);
    }

    @Override // X.JMS
    public final List AhY() {
        return A0o(1278576897, ImmutablePandoCreatorViewerBottomCTA.class);
    }

    @Override // X.JMS
    public final CreatorViewerContextCTA ArI() {
        return (CreatorViewerContextCTA) A05(-102533248, ImmutablePandoCreatorViewerContextCTA.class);
    }

    @Override // X.JMS
    public final List BxL() {
        return A0o(137058752, ImmutablePandoCreatorViewerSignalWithInsightsInfo.class);
    }

    @Override // X.JMS
    public final List BxN() {
        List list = this.A00;
        if (list == null) {
            return A0o(2088265419, ImmutablePandoCreatorViewerSignalModel.class);
        }
        return list;
    }

    @Override // X.JMS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39873HmM.A00(this));
    }

    @Override // X.JMS
    public final JMS E8x(C1DY c1dy) {
        List<CreatorViewerSignalModel> BxN = BxN();
        ArrayList A0q = AbstractC167017dG.A0q(BxN);
        for (CreatorViewerSignalModel creatorViewerSignalModel : BxN) {
            creatorViewerSignalModel.E90(c1dy);
            A0q.add(creatorViewerSignalModel);
        }
        this.A00 = A0q;
        return this;
    }

    @Override // X.JMS
    public final H30 Esp(C1DY c1dy) {
        CreatorViewerBottomCTAImpl creatorViewerBottomCTAImpl;
        CreatorViewerBottomCTA AhW = AhW();
        CreatorViewerContextCTAImpl creatorViewerContextCTAImpl = null;
        if (AhW != null) {
            creatorViewerBottomCTAImpl = AhW.Esl();
        } else {
            creatorViewerBottomCTAImpl = null;
        }
        List AhY = AhY();
        ArrayList A0i = AbstractC167007dF.A0i(AhY);
        Iterator it = AhY.iterator();
        while (it.hasNext()) {
            A0i.add(((CreatorViewerBottomCTA) it.next()).Esl());
        }
        CreatorViewerContextCTA ArI = ArI();
        if (ArI != null) {
            creatorViewerContextCTAImpl = ArI.Esm();
        }
        List BxL = BxL();
        ArrayList A0i2 = AbstractC167007dF.A0i(BxL);
        Iterator it2 = BxL.iterator();
        while (it2.hasNext()) {
            A0i2.add(((CreatorViewerSignalWithInsightsInfo) it2.next()).Et0());
        }
        List BxN = BxN();
        ArrayList A0i3 = AbstractC167007dF.A0i(BxN);
        Iterator it3 = BxN.iterator();
        while (it3.hasNext()) {
            A0i3.add(((CreatorViewerSignalModel) it3.next()).Esw(c1dy));
        }
        return new H30(creatorViewerBottomCTAImpl, creatorViewerContextCTAImpl, A0Y(), A0i, A0i2, A0i3);
    }

    @Override // X.JMS
    public final H30 Esq(C1DV c1dv) {
        return Esp(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.JMS
    public final String getTitle() {
        return A0Y();
    }
}
