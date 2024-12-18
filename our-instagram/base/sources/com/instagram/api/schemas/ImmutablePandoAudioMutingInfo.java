package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC65728Tt3;
import X.C14360o3;
import X.C17T;
import X.C39306HXx;
import X.J94;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class ImmutablePandoAudioMutingInfo extends C17T implements AudioMutingInfoIntf {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(13);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final MusicMuteAudioReason BVu() {
        return (MusicMuteAudioReason) A0N(-1619042518, J94.A00);
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC65728Tt3.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final boolean AbC() {
        return getBooleanValueByHashCode(-330398791);
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final boolean BVt() {
        return getBooleanValueByHashCode(1595120176);
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final String BVv() {
        return A0h(87336860);
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final boolean Bwc() {
        return getBooleanValueByHashCode(9716456);
    }

    @Override // com.instagram.api.schemas.AudioMutingInfoIntf
    public final AudioMutingInfo Er4() {
        return new AudioMutingInfo(BVu(), A0h(87336860), getBooleanValueByHashCode(-330398791), getBooleanValueByHashCode(1595120176), getBooleanValueByHashCode(9716456));
    }
}
