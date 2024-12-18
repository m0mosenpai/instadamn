package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC39966Hnv;
import X.C17T;
import X.C39306HXx;
import X.C43236J9h;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoIABPostClickDataDict extends C17T implements IABPostClickDataDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(88);

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final IGBWPIABPostClickDataExtensionDict AjM() {
        return (IGBWPIABPostClickDataExtensionDict) A05(-1299739516, ImmutablePandoIGBWPIABPostClickDataExtensionDict.class);
    }

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final List B15() {
        return A0p(1178408536, C43236J9h.A00);
    }

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39966Hnv.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IABPostClickDataDict
    public final IABPostClickDataDictImpl EuD() {
        IGBWPIABPostClickDataExtensionDictImpl iGBWPIABPostClickDataExtensionDictImpl;
        IGBWPIABPostClickDataExtensionDict AjM = AjM();
        if (AjM != null) {
            iGBWPIABPostClickDataExtensionDictImpl = AjM.EuT();
        } else {
            iGBWPIABPostClickDataExtensionDictImpl = null;
        }
        return new IABPostClickDataDictImpl(iGBWPIABPostClickDataExtensionDictImpl, B15());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
