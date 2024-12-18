package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AudienceGender implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ AudienceGender[] A02;
    public static final AudienceGender A03;
    public static final AudienceGender A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AudienceGender audienceGender = new AudienceGender("MALE", 0, "MALE");
        A04 = audienceGender;
        AudienceGender audienceGender2 = new AudienceGender("FEMALE", 1, "FEMALE");
        A03 = audienceGender2;
        AudienceGender[] audienceGenderArr = {audienceGender, audienceGender2};
        A02 = audienceGenderArr;
        A01 = AbstractC12190kN.A00(audienceGenderArr);
        CREATOR = new C70220WId(45);
    }

    public static AudienceGender valueOf(String str) {
        return (AudienceGender) Enum.valueOf(AudienceGender.class, str);
    }

    public static AudienceGender[] values() {
        return (AudienceGender[]) A02.clone();
    }

    public AudienceGender(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
