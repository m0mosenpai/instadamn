package com.instagram.model.showreelnative;

import X.AbstractC136426Fv;
import X.AbstractC167017dG;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.C17T;
import X.C39305HXw;
import X.I4P;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoIgShowreelNativeAnimation extends C17T implements IgShowreelNativeAnimationIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(76);

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final List Acz() {
        return A08(-2143919126, ImmutablePandoIgShowreelNativeAsset.class);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I4P.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String Abu() {
        return A0i(1884610515);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final List Acx() {
        return getOptionalStringListByHashCode(-1408207997);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String Anz() {
        return A0i(-173873537);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String Aqq() {
        return A0i(951530617);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final Integer BDS() {
        return AbstractC37301Gc2.A0U(this);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final String C5i() {
        return A0i(-180214992);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final Integer CHg() {
        return AbstractC37301Gc2.A0Z(this);
    }

    @Override // com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf
    public final IgShowreelNativeAnimation F6Z() {
        ArrayList arrayList;
        String A0i = A0i(1884610515);
        ImmutableList optionalStringListByHashCode = getOptionalStringListByHashCode(-1408207997);
        List Acz = Acz();
        if (Acz != null) {
            arrayList = AbstractC167017dG.A0q(Acz);
            Iterator it = Acz.iterator();
            while (it.hasNext()) {
                arrayList.add(((IgShowreelNativeAsset) it.next()).F6a());
            }
        } else {
            arrayList = null;
        }
        String A0i2 = A0i(-173873537);
        String A0i3 = A0i(951530617);
        return new IgShowreelNativeAnimation(AbstractC37301Gc2.A0U(this), AbstractC37301Gc2.A0Z(this), A0i, A0i2, A0i3, A0i(-180214992), optionalStringListByHashCode, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
