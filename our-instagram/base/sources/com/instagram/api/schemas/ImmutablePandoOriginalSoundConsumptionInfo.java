package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC25234BEr;
import X.AbstractC25235BEs;
import X.AbstractC65737TtC;
import X.C17T;
import X.C38006Gns;
import X.C39307HXy;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class ImmutablePandoOriginalSoundConsumptionInfo extends C17T implements OriginalSoundConsumptionInfoIntf {
    public static final AbstractC136426Fv CREATOR = C39307HXy.A00(34);

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final MusicMuteAudioReason BvC() {
        return (MusicMuteAudioReason) A0N(-880361262, C38006Gns.A00);
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC65737TtC.A00(this));
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final String AyY() {
        return A0j(-1208870349);
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final OriginalSoundConsumptionInfo Exh() {
        String A0j = A0j(-1208870349);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1033668234);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(1915067790);
        return new OriginalSoundConsumptionInfo(BvC(), A0j, A0h(-567396441), booleanValueByHashCode, booleanValueByHashCode2);
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final String getShouldMuteAudioReason() {
        return A0h(-567396441);
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final boolean isBookmarked() {
        return getBooleanValueByHashCode(1033668234);
    }

    @Override // com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf
    public final boolean isTrendingInClips() {
        return getBooleanValueByHashCode(1915067790);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC25235BEs.A1E(parcel, this);
    }
}
