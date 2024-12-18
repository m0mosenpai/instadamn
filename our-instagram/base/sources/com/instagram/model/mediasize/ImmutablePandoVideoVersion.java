package com.instagram.model.mediasize;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC37301Gc2;
import X.AbstractC37350Gcs;
import X.C17T;
import X.C39305HXw;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.DirectMediaFallbackUrlIntf;
import com.instagram.api.schemas.ImmutablePandoDirectMediaFallbackUrl;

/* loaded from: classes7.dex */
public final class ImmutablePandoVideoVersion extends C17T implements VideoVersionIntf {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(45);

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final DirectMediaFallbackUrlIntf B4E() {
        return (DirectMediaFallbackUrlIntf) A05(761243362, ImmutablePandoDirectMediaFallbackUrl.class);
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37350Gcs.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final String getId() {
        return A0i(3355);
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Integer BDS() {
        return AbstractC37301Gc2.A0U(this);
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Integer CBl() {
        return getOptionalIntValueByHashCode(3575610);
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Long CDQ() {
        return A0L(773655335);
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final Integer CHg() {
        return AbstractC37301Gc2.A0Z(this);
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final VideoVersion F5E() {
        DirectMediaFallbackUrl directMediaFallbackUrl;
        DirectMediaFallbackUrlIntf B4E = B4E();
        if (B4E != null) {
            directMediaFallbackUrl = B4E.Et7();
        } else {
            directMediaFallbackUrl = null;
        }
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1221029593);
        String A0i = A0i(3355);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(3575610);
        String A0i2 = A0i(116079);
        return new VideoVersion(directMediaFallbackUrl, optionalIntValueByHashCode, optionalIntValueByHashCode2, getOptionalIntValueByHashCode(113126854), A0L(773655335), A0i, A0i2);
    }

    @Override // com.instagram.model.mediasize.VideoVersionIntf
    public final String getUrl() {
        return A0V();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
