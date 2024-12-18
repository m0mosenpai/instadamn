package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProfileGridItemTypeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProfileGridItemTypeEnum[] A03;
    public static final ProfileGridItemTypeEnum A04;
    public static final ProfileGridItemTypeEnum A05;
    public static final ProfileGridItemTypeEnum A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProfileGridItemTypeEnum profileGridItemTypeEnum = new ProfileGridItemTypeEnum("UNRECOGNIZED", 0, "ProfileGridItemTypeEnum_unspecified");
        A06 = profileGridItemTypeEnum;
        ProfileGridItemTypeEnum profileGridItemTypeEnum2 = new ProfileGridItemTypeEnum("HIGHLIGHT", 1, "highlight");
        A04 = profileGridItemTypeEnum2;
        ProfileGridItemTypeEnum profileGridItemTypeEnum3 = new ProfileGridItemTypeEnum("MEDIA", 2, "media");
        A05 = profileGridItemTypeEnum3;
        ProfileGridItemTypeEnum[] profileGridItemTypeEnumArr = {profileGridItemTypeEnum, profileGridItemTypeEnum2, profileGridItemTypeEnum3};
        A03 = profileGridItemTypeEnumArr;
        A02 = AbstractC12190kN.A00(profileGridItemTypeEnumArr);
        ProfileGridItemTypeEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProfileGridItemTypeEnum profileGridItemTypeEnum4 : values) {
            A18.put(profileGridItemTypeEnum4.A00, profileGridItemTypeEnum4);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(73);
    }

    public static ProfileGridItemTypeEnum valueOf(String str) {
        return (ProfileGridItemTypeEnum) Enum.valueOf(ProfileGridItemTypeEnum.class, str);
    }

    public static ProfileGridItemTypeEnum[] values() {
        return (ProfileGridItemTypeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProfileGridItemTypeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
