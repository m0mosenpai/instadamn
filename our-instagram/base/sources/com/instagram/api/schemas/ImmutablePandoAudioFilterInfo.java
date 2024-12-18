package com.instagram.api.schemas;

import X.AbstractC136426Fv;
import X.AbstractC39753HkP;
import X.B93;
import X.C14360o3;
import X.C17T;
import X.C39306HXx;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes3.dex */
public final class ImmutablePandoAudioFilterInfo extends C17T implements AudioFilterInfoIntf {
    public static final AbstractC136426Fv CREATOR = new C39306HXx(12);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    @Override // com.instagram.api.schemas.AudioFilterInfoIntf
    public final AudioFilterType B6T() {
        return (AudioFilterType) A0M(-889919583, B93.A00);
    }

    @Override // com.instagram.api.schemas.AudioFilterInfoIntf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(AbstractC39753HkP.A00(this), this);
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    @Override // com.instagram.api.schemas.AudioFilterInfoIntf
    public final AudioFilterInfo Er1() {
        return new AudioFilterInfo(B6T());
    }
}
