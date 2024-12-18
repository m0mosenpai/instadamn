package com.instagram.creation.genai.magicmod.model;

import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;

/* loaded from: classes5.dex */
public final class MagicModLaunchParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LNM(71);
    public final CreationLayoutConfig A00;
    public final ExpanderConfig A01;
    public final MagicModPostCaptureTransform A02;
    public final MagicModTopicInfo A03;

    public MagicModLaunchParams(CreationLayoutConfig creationLayoutConfig, ExpanderConfig expanderConfig, MagicModPostCaptureTransform magicModPostCaptureTransform, MagicModTopicInfo magicModTopicInfo) {
        C14360o3.A0B(creationLayoutConfig, 2);
        this.A02 = magicModPostCaptureTransform;
        this.A00 = creationLayoutConfig;
        this.A03 = magicModTopicInfo;
        this.A01 = expanderConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        MagicModPostCaptureTransform magicModPostCaptureTransform = this.A02;
        if (magicModPostCaptureTransform == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            magicModPostCaptureTransform.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A00, i);
        MagicModTopicInfo magicModTopicInfo = this.A03;
        if (magicModTopicInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            magicModTopicInfo.writeToParcel(parcel, i);
        }
        ExpanderConfig expanderConfig = this.A01;
        if (expanderConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            expanderConfig.writeToParcel(parcel, i);
        }
    }
}
