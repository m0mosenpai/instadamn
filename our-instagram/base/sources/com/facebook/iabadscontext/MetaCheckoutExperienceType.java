package com.facebook.iabadscontext;

import X.AbstractC12190kN;
import X.C63473SlE;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class MetaCheckoutExperienceType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ MetaCheckoutExperienceType[] A01;
    public static final MetaCheckoutExperienceType A02;
    public static final MetaCheckoutExperienceType A03;
    public static final MetaCheckoutExperienceType A04;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MetaCheckoutExperienceType metaCheckoutExperienceType = new MetaCheckoutExperienceType("UNSET_OR_UNRECOGNIZED_ENUM_VALUE", 0);
        A04 = metaCheckoutExperienceType;
        MetaCheckoutExperienceType metaCheckoutExperienceType2 = new MetaCheckoutExperienceType("BAU_WEB_CHECKOUT", 1);
        A02 = metaCheckoutExperienceType2;
        MetaCheckoutExperienceType metaCheckoutExperienceType3 = new MetaCheckoutExperienceType("ONSITE_SHOPIFY_SDK_CHECKOUT", 2);
        A03 = metaCheckoutExperienceType3;
        MetaCheckoutExperienceType[] metaCheckoutExperienceTypeArr = {metaCheckoutExperienceType, metaCheckoutExperienceType2, metaCheckoutExperienceType3};
        A01 = metaCheckoutExperienceTypeArr;
        A00 = AbstractC12190kN.A00(metaCheckoutExperienceTypeArr);
        CREATOR = C63473SlE.A01(16);
    }

    public static MetaCheckoutExperienceType valueOf(String str) {
        return (MetaCheckoutExperienceType) Enum.valueOf(MetaCheckoutExperienceType.class, str);
    }

    public static MetaCheckoutExperienceType[] values() {
        return (MetaCheckoutExperienceType[]) A01.clone();
    }

    public MetaCheckoutExperienceType(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
