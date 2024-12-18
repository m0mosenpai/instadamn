package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.C17T;
import X.C39306HXx;
import X.C43239J9k;
import X.C43240J9l;
import X.C43241J9m;
import X.Ho6;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoIGAdsIABScreenshotDataDict extends C17T implements IGAdsIABScreenshotDataDict {
    public static final AbstractC136426Fv CREATOR = C39306HXx.A00(94);

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IABScreenshotEffectOnUserAction Bqq() {
        return (IABScreenshotEffectOnUserAction) A0N(2008461599, C43239J9k.A00);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IABScreenshotTransitionTime Bqt() {
        return (IABScreenshotTransitionTime) A0N(-1867449698, C43240J9l.A00);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IGAdsIABScreenshotVariant Bqv() {
        return (IGAdsIABScreenshotVariant) A0N(-1513523540, C43241J9m.A00);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Ho6.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float BQ3() {
        return A0K(983388894);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float BTx() {
        return A0K(-254701364);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float Bqr() {
        return A0K(960189328);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Float Bqs() {
        return A0K(-1409054167);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final String Bqu() {
        return A0i(-525510890);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final Boolean Bwb() {
        return getOptionalBooleanValueByHashCode(726605322);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final String C6H() {
        return A0i(-976216347);
    }

    @Override // com.instagram.api.schemas.IGAdsIABScreenshotDataDict
    public final IGAdsIABScreenshotDataDictImpl EuP() {
        Float A0K = A0K(983388894);
        Float A0K2 = A0K(-254701364);
        IABScreenshotEffectOnUserAction Bqq = Bqq();
        Float A0K3 = A0K(960189328);
        Float A0K4 = A0K(-1409054167);
        return new IGAdsIABScreenshotDataDictImpl(Bqq, Bqt(), Bqv(), getOptionalBooleanValueByHashCode(726605322), A0K, A0K2, A0K3, A0K4, A0i(-525510890), A0i(-976216347));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
