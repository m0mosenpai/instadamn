package com.instagram.creation.capture.quickcapture.sundial.edit.nux;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EducationNuxType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EducationNuxType[] A01;
    public static final EducationNuxType A02;
    public static final Parcelable.Creator CREATOR;

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
        EducationNuxType educationNuxType = new EducationNuxType();
        A02 = educationNuxType;
        EducationNuxType[] educationNuxTypeArr = {educationNuxType};
        A01 = educationNuxTypeArr;
        A00 = AbstractC12190kN.A00(educationNuxTypeArr);
        CREATOR = LNM.A00(59);
    }

    public static EducationNuxType valueOf(String str) {
        return (EducationNuxType) Enum.valueOf(EducationNuxType.class, str);
    }

    public static EducationNuxType[] values() {
        return (EducationNuxType[]) A01.clone();
    }
}
