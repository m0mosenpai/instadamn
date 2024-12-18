package com.instagram.camera.mpfacade;

import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.music.common.model.ARAudioEffectData;

/* loaded from: classes4.dex */
public final class CameraEffectFacadeIntf$State implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C70220WId(97);
    public final ARAudioEffectData A00;
    public final boolean A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public CameraEffectFacadeIntf$State(ARAudioEffectData aRAudioEffectData, boolean z) {
        this.A00 = aRAudioEffectData;
        this.A01 = z;
    }
}
