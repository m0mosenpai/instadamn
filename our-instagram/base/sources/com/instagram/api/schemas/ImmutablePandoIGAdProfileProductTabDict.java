package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC33698Eum;
import X.C14360o3;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39306HXx;
import X.GVD;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ImmutablePandoIGAdProfileProductTabDict extends C17T implements IGAdProfileProductTabDict {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(92);
    public List A00;

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabDictImpl EuK(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return EuJ(new C1DY(c1dv, 6, false));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabFeatureModeEnum B5K() {
        return (IGAdProfileProductTabFeatureModeEnum) A0N(1209000268, GVD.A00);
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final List BhR() {
        List list = this.A00;
        if (list == null) {
            return A08(-1003761308, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33698Eum.A00(this));
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final Boolean BUz() {
        return getOptionalBooleanValueByHashCode(1635664600);
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final Boolean Cay() {
        return getOptionalBooleanValueByHashCode(-223460414);
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabDict E9A(C1DY c1dy) {
        ArrayList arrayList;
        List<ProductDetailsProductItemDictIntf> BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            for (ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf : BhR) {
                productDetailsProductItemDictIntf.ECE(c1dy);
                arrayList.add(productDetailsProductItemDictIntf);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // com.instagram.api.schemas.IGAdProfileProductTabDict
    public final IGAdProfileProductTabDictImpl EuJ(C1DY c1dy) {
        ArrayList arrayList;
        IGAdProfileProductTabFeatureModeEnum B5K = B5K();
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-223460414);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1635664600);
        List BhR = BhR();
        if (BhR != null) {
            arrayList = AbstractC167017dG.A0q(BhR);
            Iterator it = BhR.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductDetailsProductItemDictIntf) it.next()).F7S(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new IGAdProfileProductTabDictImpl(B5K, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
