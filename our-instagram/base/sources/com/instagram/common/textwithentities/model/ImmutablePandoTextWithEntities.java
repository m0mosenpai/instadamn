package com.instagram.common.textwithentities.model;

import X.AbstractC136426Fv;
import X.AbstractC167007dF;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40570Hyq;
import X.C17T;
import X.C39305HXw;
import X.JCI;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ColorAtTextRangeDictIntf;
import com.instagram.api.schemas.ImmutablePandoColorAtTextRangeDict;
import com.instagram.api.schemas.ImmutablePandoInlineStyleAtRangeDict;
import com.instagram.api.schemas.ImmutablePandoRange;
import com.instagram.api.schemas.InlineStyleAtRangeDictIntf;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.RangeIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoTextWithEntities extends C17T implements TextWithEntitiesIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(30);

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final List ApN() {
        return A08(-1924319438, ImmutablePandoColorAtTextRangeDict.class);
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final List BHs() {
        return A08(-288113398, ImmutablePandoInlineStyleAtRangeDict.class);
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final LinkAction BNM() {
        return (LinkAction) A0N(1874837019, JCI.A00);
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final List Bk5() {
        return A08(-938283306, ImmutablePandoRange.class);
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40570Hyq.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final Long C8e() {
        return A0L(55126294);
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final TextWithEntities F4R() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List ApN = ApN();
        ArrayList arrayList3 = null;
        if (ApN != null) {
            arrayList = AbstractC167007dF.A0i(ApN);
            Iterator it = ApN.iterator();
            while (it.hasNext()) {
                arrayList.add(((ColorAtTextRangeDictIntf) it.next()).EsL());
            }
        } else {
            arrayList = null;
        }
        List BHs = BHs();
        if (BHs != null) {
            arrayList2 = AbstractC167007dF.A0i(BHs);
            Iterator it2 = BHs.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((InlineStyleAtRangeDictIntf) it2.next()).Evh());
            }
        } else {
            arrayList2 = null;
        }
        LinkAction BNM = BNM();
        List Bk5 = Bk5();
        if (Bk5 != null) {
            arrayList3 = AbstractC167007dF.A0i(Bk5);
            Iterator it3 = Bk5.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((RangeIntf) it3.next()).Eyy());
            }
        }
        return new TextWithEntities(BNM, A0L(55126294), A0X(), arrayList, arrayList2, arrayList3);
    }

    @Override // com.instagram.common.textwithentities.model.TextWithEntitiesIntf
    public final String getText() {
        return A0X();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
