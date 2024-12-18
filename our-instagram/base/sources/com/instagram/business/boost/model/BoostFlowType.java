package com.instagram.business.boost.model;

import X.AbstractC12190kN;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class BoostFlowType implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BoostFlowType[] A02;
    public static final BoostFlowType A03;
    public static final BoostFlowType A04;
    public static final BoostFlowType A05;
    public static final BoostFlowType A06;
    public static final BoostFlowType A07;
    public static final BoostFlowType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BoostFlowType boostFlowType = new BoostFlowType("ORIGINAL", 0, "original");
        A07 = boostFlowType;
        BoostFlowType boostFlowType2 = new BoostFlowType("DRAFT", 1, "draft");
        A05 = boostFlowType2;
        BoostFlowType boostFlowType3 = new BoostFlowType("BOOST_AGAIN", 2, "boost_again");
        A04 = boostFlowType3;
        BoostFlowType boostFlowType4 = new BoostFlowType("SHARESHEET", 3, "sharesheet");
        A08 = boostFlowType4;
        BoostFlowType boostFlowType5 = new BoostFlowType("MEDIA_PICKER", 4, "media_picker");
        A06 = boostFlowType5;
        BoostFlowType boostFlowType6 = new BoostFlowType("AB_TESTING_PICKER", 5, "ab_testing_picker");
        A03 = boostFlowType6;
        BoostFlowType[] boostFlowTypeArr = {boostFlowType, boostFlowType2, boostFlowType3, boostFlowType4, boostFlowType5, boostFlowType6};
        A02 = boostFlowTypeArr;
        A01 = AbstractC12190kN.A00(boostFlowTypeArr);
        CREATOR = new C70220WId(30);
    }

    public static BoostFlowType valueOf(String str) {
        return (BoostFlowType) Enum.valueOf(BoostFlowType.class, str);
    }

    public static BoostFlowType[] values() {
        return (BoostFlowType[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BoostFlowType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
