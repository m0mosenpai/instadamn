package com.instagram.business.boost.mediapicker.model;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BoostMediaPickerTabType implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BoostMediaPickerTabType[] A02;
    public static final BoostMediaPickerTabType A03;
    public static final BoostMediaPickerTabType A04;
    public static final BoostMediaPickerTabType A05;
    public static final BoostMediaPickerTabType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this);
    }

    static {
        BoostMediaPickerTabType boostMediaPickerTabType = new BoostMediaPickerTabType("FEED", 0, "FEED");
        A04 = boostMediaPickerTabType;
        BoostMediaPickerTabType boostMediaPickerTabType2 = new BoostMediaPickerTabType("STORY", 1, "STORY");
        A06 = boostMediaPickerTabType2;
        BoostMediaPickerTabType boostMediaPickerTabType3 = new BoostMediaPickerTabType("CLIPS", 2, "CLIPS");
        A03 = boostMediaPickerTabType3;
        BoostMediaPickerTabType boostMediaPickerTabType4 = new BoostMediaPickerTabType("FEED_AB_TEST", 3, "FEED_AB_TEST");
        A05 = boostMediaPickerTabType4;
        BoostMediaPickerTabType[] boostMediaPickerTabTypeArr = {boostMediaPickerTabType, boostMediaPickerTabType2, boostMediaPickerTabType3, boostMediaPickerTabType4};
        A02 = boostMediaPickerTabTypeArr;
        A01 = AbstractC12190kN.A00(boostMediaPickerTabTypeArr);
        CREATOR = new C70220WId(28);
    }

    public static BoostMediaPickerTabType valueOf(String str) {
        return (BoostMediaPickerTabType) Enum.valueOf(BoostMediaPickerTabType.class, str);
    }

    public static BoostMediaPickerTabType[] values() {
        return (BoostMediaPickerTabType[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BoostMediaPickerTabType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
