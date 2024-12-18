package com.instagram.reels.viewer.attribution.model;

import X.C102134ij;
import X.C9Ay;
import X.EnumC138476Pd;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.model.reels.ReelHeaderAttributionType;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* loaded from: classes3.dex */
public class ReelAttributionModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9Ay(59);
    public C102134ij A00;
    public EffectInfoAttributionConfiguration A01;
    public EnumC138476Pd A02;
    public MusicOverlayStickerModel A03;
    public String A04;
    public String A05;
    public final ReelHeaderAttributionType A06;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
    }

    public ReelAttributionModel(Parcel parcel) {
        this.A06 = (ReelHeaderAttributionType) parcel.readParcelable(ReelHeaderAttributionType.class.getClassLoader());
        this.A05 = parcel.readString();
        this.A01 = (EffectInfoAttributionConfiguration) parcel.readParcelable(EffectInfoAttributionConfiguration.class.getClassLoader());
    }

    public ReelAttributionModel(ReelHeaderAttributionType reelHeaderAttributionType) {
        this.A06 = reelHeaderAttributionType;
    }
}
