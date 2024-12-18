package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37304Gc5;
import X.AbstractC40129Hqw;
import X.C17T;
import X.C1DV;
import X.C1DY;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoOriginalityInfo extends C17T implements OriginalityInfo {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(37);
    public OriginalitySourceMediaInfo A00;

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityFollowButtonInfo B7H() {
        return (OriginalityFollowButtonInfo) A05(-1644347891, ImmutablePandoOriginalityFollowButtonInfo.class);
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalitySourceMediaInfo BZp() {
        OriginalitySourceMediaInfo originalitySourceMediaInfo = this.A00;
        if (originalitySourceMediaInfo == null) {
            return (OriginalitySourceMediaInfo) A05(1923742710, ImmutablePandoOriginalitySourceMediaInfo.class);
        }
        return originalitySourceMediaInfo;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40129Hqw.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final Boolean Akh() {
        return getOptionalBooleanValueByHashCode(386562054);
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityInfo E9W(C1DY c1dy) {
        OriginalitySourceMediaInfo BZp = BZp();
        if (BZp != null) {
            BZp.E9X(c1dy);
        } else {
            BZp = null;
        }
        this.A00 = BZp;
        return this;
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityInfoImpl Exl(C1DY c1dy) {
        OriginalityFollowButtonInfoImpl originalityFollowButtonInfoImpl;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(386562054);
        OriginalityFollowButtonInfo B7H = B7H();
        OriginalitySourceMediaInfoImpl originalitySourceMediaInfoImpl = null;
        if (B7H != null) {
            originalityFollowButtonInfoImpl = B7H.Exk();
        } else {
            originalityFollowButtonInfoImpl = null;
        }
        OriginalitySourceMediaInfo BZp = BZp();
        if (BZp != null) {
            originalitySourceMediaInfoImpl = BZp.Exn(c1dy);
        }
        return new OriginalityInfoImpl(originalityFollowButtonInfoImpl, originalitySourceMediaInfoImpl, optionalBooleanValueByHashCode);
    }

    @Override // com.instagram.api.schemas.OriginalityInfo
    public final OriginalityInfoImpl Exm(C1DV c1dv) {
        return Exl(AbstractC37304Gc5.A09(c1dv));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
