package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39951Hng;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoGrowthFrictionInterventionDetail extends C17T implements GrowthFrictionInterventionDetail {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(84);

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final List AjH() {
        return A0o(241352577, ImmutablePandoGrowthFrictionInterventionButton.class);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39951Hng.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String AYR() {
        return A0h(-1422950858);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String BJA() {
        return A0h(-912325901);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final GrowthFrictionInterventionDetailImpl Eu3() {
        String A0h = A0h(-1422950858);
        List AjH = AjH();
        ArrayList A0q = AbstractC167017dG.A0q(AjH);
        Iterator it = AjH.iterator();
        while (it.hasNext()) {
            A0q.add(((GrowthFrictionInterventionButton) it.next()).Eu1());
        }
        return new GrowthFrictionInterventionDetailImpl(A0h, A0h(-1724546052), A0h(-912325901), A0S(), A0V(), A0q);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String getDescription() {
        return A0h(-1724546052);
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String getTitle() {
        return A0S();
    }

    @Override // com.instagram.api.schemas.GrowthFrictionInterventionDetail
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
