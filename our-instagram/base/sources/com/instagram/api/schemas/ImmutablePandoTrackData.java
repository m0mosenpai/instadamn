package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.C14360o3;
import X.C17T;
import X.C206129Au;
import X.JRD;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* loaded from: classes3.dex */
public final class ImmutablePandoTrackData extends C17T implements TrackData {
    public static final AbstractC136426Fv CREATOR = new C206129Au(3);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final LyricsIntf BPT() {
        return (LyricsIntf) A05(-1087772684, ImmutablePandoLyrics.class);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(JRD.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getId() {
        return A0h(3355);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final ImageUrl AsE() {
        return A0A(-22609914);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final ImageUrl AsF() {
        return A09(-45086183);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String AvV() {
        return A0i(-220872642);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Integer Azi() {
        return getOptionalIntValueByHashCode(55068821);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Boolean BC4() {
        return getOptionalBooleanValueByHashCode(1988432185);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final List BE6() {
        return getOptionalIntListByHashCode(-1755167329);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String Bkl() {
        return A0i(527639047);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String BqC() {
        return A0i(932670004);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String CHM() {
        return A0i(-310659645);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Boolean CT1() {
        return getOptionalBooleanValueByHashCode(1470663792);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final Boolean CTb() {
        return getOptionalBooleanValueByHashCode(-512645821);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final TrackDataImpl F3P() {
        Lyrics lyrics;
        boolean booleanValueByHashCode = getBooleanValueByHashCode(1545396879);
        String A0i = A0i(574519571);
        String A0i2 = A0i(-2061768941);
        String A0i3 = A0i(1025801609);
        ImageUrl A0A = A0A(-22609914);
        ImageUrl A09 = A09(-45086183);
        String A0i4 = A0i(-220872642);
        String A0i5 = A0i(1128191036);
        String A0i6 = A0i(1258734948);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(55068821);
        String A0i7 = A0i(682262252);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(1988432185);
        ImmutableList optionalIntListByHashCode = getOptionalIntListByHashCode(-1755167329);
        String A0h = A0h(3355);
        String A0i8 = A0i(1357418199);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(1470663792);
        Boolean optionalBooleanValueByHashCode3 = getOptionalBooleanValueByHashCode(-512645821);
        boolean booleanValueByHashCode2 = getBooleanValueByHashCode(1630845353);
        LyricsIntf BPT = BPT();
        if (BPT != null) {
            lyrics = BPT.EwA();
        } else {
            lyrics = null;
        }
        return new TrackDataImpl(lyrics, A0A, A09, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalBooleanValueByHashCode3, optionalIntValueByHashCode, A0i, A0i2, A0i3, A0i4, A0i5, A0i6, A0i7, A0h, A0i8, A0i(1436807532), A0i(527639047), A0i(932670004), A0i(-2060497896), A0i(110371416), A0i(-310659645), optionalIntListByHashCode, booleanValueByHashCode, booleanValueByHashCode2);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final boolean getAllowsSaving() {
        return getBooleanValueByHashCode(1545396879);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getArtistId() {
        return A0i(574519571);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getAudioAssetId() {
        return A0i(-2061768941);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getAudioClusterId() {
        return A0i(1025801609);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getDashManifest() {
        return A0i(1128191036);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getDisplayArtist() {
        return A0i(1258734948);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getFastStartProgressiveDownloadUrl() {
        return A0i(682262252);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getIgUsername() {
        return A0i(1357418199);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getProgressiveDownloadUrl() {
        return A0i(1436807532);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getSubtitle() {
        return A0i(-2060497896);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final String getTitle() {
        return A0i(110371416);
    }

    @Override // com.instagram.api.schemas.TrackData
    public final boolean isExplicit() {
        return getBooleanValueByHashCode(1630845353);
    }
}
