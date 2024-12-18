package com.instagram.avatar.ui;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class UpdateProfilePicturePagerAdapter$UpdateProfileTabType implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ UpdateProfilePicturePagerAdapter$UpdateProfileTabType[] A02;
    public static final UpdateProfilePicturePagerAdapter$UpdateProfileTabType A03;
    public static final UpdateProfilePicturePagerAdapter$UpdateProfileTabType A04;
    public static final Parcelable.Creator CREATOR;
    public final int A00;

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
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType = new UpdateProfilePicturePagerAdapter$UpdateProfileTabType("UPDATE_PROFILE_PICTURE_TAB", 0, 0);
        A04 = updateProfilePicturePagerAdapter$UpdateProfileTabType;
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType2 = new UpdateProfilePicturePagerAdapter$UpdateProfileTabType("UPDATE_AVATAR_TAB", 1, 1);
        A03 = updateProfilePicturePagerAdapter$UpdateProfileTabType2;
        UpdateProfilePicturePagerAdapter$UpdateProfileTabType[] updateProfilePicturePagerAdapter$UpdateProfileTabTypeArr = {updateProfilePicturePagerAdapter$UpdateProfileTabType, updateProfilePicturePagerAdapter$UpdateProfileTabType2};
        A02 = updateProfilePicturePagerAdapter$UpdateProfileTabTypeArr;
        A01 = AbstractC12190kN.A00(updateProfilePicturePagerAdapter$UpdateProfileTabTypeArr);
        CREATOR = new C70220WId(10);
    }

    public static UpdateProfilePicturePagerAdapter$UpdateProfileTabType valueOf(String str) {
        return (UpdateProfilePicturePagerAdapter$UpdateProfileTabType) Enum.valueOf(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.class, str);
    }

    public static UpdateProfilePicturePagerAdapter$UpdateProfileTabType[] values() {
        return (UpdateProfilePicturePagerAdapter$UpdateProfileTabType[]) A02.clone();
    }

    public UpdateProfilePicturePagerAdapter$UpdateProfileTabType(String str, int i, int i2) {
        this.A00 = i2;
    }
}
