package com.instagram.api.schemas;

import X.AbstractC37300Gc1;
import X.AbstractC39753HkP;
import X.C0T6;
import X.C14360o3;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class AudioFilterInfo extends C0T6 implements Parcelable, AudioFilterInfoIntf {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(63);
    public final AudioFilterType A00;

    public AudioFilterInfo(AudioFilterType audioFilterType) {
        C14360o3.A0B(audioFilterType, 1);
        this.A00 = audioFilterType;
    }

    @Override // com.instagram.api.schemas.AudioFilterInfoIntf
    public final AudioFilterInfo Er1() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AudioFilterInfo) && this.A00 == ((AudioFilterInfo) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    @Override // com.instagram.api.schemas.AudioFilterInfoIntf
    public final AudioFilterType B6T() {
        return this.A00;
    }

    @Override // com.instagram.api.schemas.AudioFilterInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAudioFilterInfo", AbstractC39753HkP.A00(this));
    }
}
