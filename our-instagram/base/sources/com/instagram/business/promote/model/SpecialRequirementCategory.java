package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class SpecialRequirementCategory implements Parcelable {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SpecialRequirementCategory[] A03;
    public static final SpecialRequirementCategory A04;
    public static final SpecialRequirementCategory A05;
    public static final SpecialRequirementCategory A06;
    public static final SpecialRequirementCategory A07;
    public static final SpecialRequirementCategory A08;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A01);
    }

    static {
        SpecialRequirementCategory specialRequirementCategory = new SpecialRequirementCategory(0, -1, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A07 = specialRequirementCategory;
        SpecialRequirementCategory specialRequirementCategory2 = new SpecialRequirementCategory(1, 2131970946, "CREDIT", "CREDIT");
        A04 = specialRequirementCategory2;
        SpecialRequirementCategory specialRequirementCategory3 = new SpecialRequirementCategory(2, 2131970949, "EMPLOYMENT", "EMPLOYMENT");
        A05 = specialRequirementCategory3;
        SpecialRequirementCategory specialRequirementCategory4 = new SpecialRequirementCategory(3, 2131970952, "HOUSING", "HOUSING");
        A06 = specialRequirementCategory4;
        SpecialRequirementCategory specialRequirementCategory5 = new SpecialRequirementCategory(4, 2131970955, "POLITICAL", "ISSUES_ELECTIONS_POLITICS");
        A08 = specialRequirementCategory5;
        SpecialRequirementCategory[] specialRequirementCategoryArr = {specialRequirementCategory, specialRequirementCategory2, specialRequirementCategory3, specialRequirementCategory4, specialRequirementCategory5};
        A03 = specialRequirementCategoryArr;
        A02 = AbstractC12190kN.A00(specialRequirementCategoryArr);
        CREATOR = new C70220WId(87);
    }

    public static SpecialRequirementCategory valueOf(String str) {
        return (SpecialRequirementCategory) Enum.valueOf(SpecialRequirementCategory.class, str);
    }

    public static SpecialRequirementCategory[] values() {
        return (SpecialRequirementCategory[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A01;
    }

    public SpecialRequirementCategory(int i, int i2, String str, String str2) {
        this.A01 = str2;
        this.A00 = i2;
    }
}
