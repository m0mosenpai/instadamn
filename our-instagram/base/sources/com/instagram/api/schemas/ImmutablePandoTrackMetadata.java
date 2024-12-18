package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC40424HwF;
import X.C17T;
import X.C39305HXw;
import X.JC5;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class ImmutablePandoTrackMetadata extends C17T implements TrackMetadata {
    public static final AbstractC136426Fv CREATOR = C39305HXw.A00(14);

    @Override // com.instagram.api.schemas.TrackMetadata
    public final List AyW() {
        return A0p(1557415452, JC5.A00);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40424HwF.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Long AyX() {
        return A0L(-1208870349);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Integer Bg7() {
        return getOptionalIntValueByHashCode(-267229226);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Integer CAx() {
        return getOptionalIntValueByHashCode(513375630);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final Boolean Cer() {
        return getOptionalBooleanValueByHashCode(1915067790);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final TrackMetadataImpl F3Q() {
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1120317563);
        List AyW = AyW();
        return new TrackMetadataImpl(getOptionalBooleanValueByHashCode(1915067790), getOptionalIntValueByHashCode(-267229226), getOptionalIntValueByHashCode(513375630), A0L(-1208870349), A0i(1181455637), AyW, booleanValueByHashCode, getBooleanValueByHashCode(1033668234));
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final boolean getAllowMediaCreationWithMusic() {
        return getBooleanValueByHashCode(1120317563);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final String getFormattedClipsMediaCount() {
        return A0i(1181455637);
    }

    @Override // com.instagram.api.schemas.TrackMetadata
    public final boolean isBookmarked() {
        return getBooleanValueByHashCode(1033668234);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
