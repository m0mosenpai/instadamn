package com.instagram.music.common.model;

import X.C14360o3;
import X.C41856IgA;
import X.EnumC185288Jt;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class MusicModelEffectPair implements Parcelable {
    public static final C41856IgA CREATOR = C41856IgA.A00(81);
    public MusicAssetModel A01 = null;
    public EnumC185288Jt A00 = null;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        EnumC185288Jt enumC185288Jt = this.A00;
        if (enumC185288Jt != null) {
            str = enumC185288Jt.name();
        } else {
            str = null;
        }
        parcel.writeString(str);
    }
}
