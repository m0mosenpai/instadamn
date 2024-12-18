package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC39971Ho3;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGAdScreenshotURLDataDict extends C17T implements IGAdScreenshotURLDataDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(93);

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final IGProjectPortalInfoDict BQS() {
        return (IGProjectPortalInfoDict) A05(1758667881, ImmutablePandoIGProjectPortalInfoDict.class);
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39971Ho3.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final Integer BDS() {
        return AbstractC37301Gc2.A0U(this);
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final Integer CHg() {
        return AbstractC37301Gc2.A0Z(this);
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final IGAdScreenshotURLDataDictImpl EuL() {
        IGProjectPortalInfoDictImpl iGProjectPortalInfoDictImpl;
        String A0i = A0i(1714924804);
        Integer A0U = AbstractC37301Gc2.A0U(this);
        IGProjectPortalInfoDict BQS = BQS();
        if (BQS != null) {
            iGProjectPortalInfoDictImpl = BQS.EvQ();
        } else {
            iGProjectPortalInfoDictImpl = null;
        }
        return new IGAdScreenshotURLDataDictImpl(iGProjectPortalInfoDictImpl, A0U, AbstractC37301Gc2.A0Z(this), A0i, A0V());
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final String getDominantColor() {
        return A0i(1714924804);
    }

    @Override // com.instagram.api.schemas.IGAdScreenshotURLDataDict
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
