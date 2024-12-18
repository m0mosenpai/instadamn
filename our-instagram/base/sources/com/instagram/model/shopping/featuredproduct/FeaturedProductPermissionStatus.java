package com.instagram.model.shopping.featuredproduct;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FeaturedProductPermissionStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FeaturedProductPermissionStatus[] A03;
    public static final FeaturedProductPermissionStatus A04;
    public static final FeaturedProductPermissionStatus A05;
    public static final FeaturedProductPermissionStatus A06;
    public static final FeaturedProductPermissionStatus A07;
    public static final FeaturedProductPermissionStatus A08;
    public static final FeaturedProductPermissionStatus A09;
    public static final FeaturedProductPermissionStatus A0A;
    public static final FeaturedProductPermissionStatus A0B;
    public static final FeaturedProductPermissionStatus A0C;
    public static final FeaturedProductPermissionStatus A0D;
    public static final FeaturedProductPermissionStatus A0E;
    public static final FeaturedProductPermissionStatus A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    static {
        FeaturedProductPermissionStatus featuredProductPermissionStatus = new FeaturedProductPermissionStatus("UNRECOGNIZED", 0, "FeaturedProductPermissionStatus_unspecified");
        A0F = featuredProductPermissionStatus;
        FeaturedProductPermissionStatus featuredProductPermissionStatus2 = new FeaturedProductPermissionStatus("APPROVED", 1, "APPROVED");
        A04 = featuredProductPermissionStatus2;
        FeaturedProductPermissionStatus featuredProductPermissionStatus3 = new FeaturedProductPermissionStatus("CANCELED", 2, "CANCELED");
        A05 = featuredProductPermissionStatus3;
        FeaturedProductPermissionStatus featuredProductPermissionStatus4 = new FeaturedProductPermissionStatus("CANCELED_BY_EDIT", 3, "CANCELED_BY_EDIT");
        A06 = featuredProductPermissionStatus4;
        FeaturedProductPermissionStatus featuredProductPermissionStatus5 = new FeaturedProductPermissionStatus("CANCELED_BY_EXPIRATION", 4, "CANCELED_BY_EXPIRATION");
        A07 = featuredProductPermissionStatus5;
        FeaturedProductPermissionStatus featuredProductPermissionStatus6 = new FeaturedProductPermissionStatus("CANCELED_BY_MANUAL_QUALITY_AUDIT", 5, "CANCELED_BY_MANUAL_QUALITY_AUDIT");
        A08 = featuredProductPermissionStatus6;
        FeaturedProductPermissionStatus featuredProductPermissionStatus7 = new FeaturedProductPermissionStatus("DECLINED", 6, "DECLINED");
        A09 = featuredProductPermissionStatus7;
        FeaturedProductPermissionStatus featuredProductPermissionStatus8 = new FeaturedProductPermissionStatus("DECLINED_BY_AGE", 7, "DECLINED_BY_AGE");
        A0A = featuredProductPermissionStatus8;
        FeaturedProductPermissionStatus featuredProductPermissionStatus9 = new FeaturedProductPermissionStatus("DECLINED_BY_ASSOCIATED_USER", 8, "DECLINED_BY_ASSOCIATED_USER");
        A0B = featuredProductPermissionStatus9;
        FeaturedProductPermissionStatus featuredProductPermissionStatus10 = new FeaturedProductPermissionStatus("MEDIA_BI_REVIEW_PENDING", 9, "MEDIA_BI_REVIEW_PENDING");
        A0C = featuredProductPermissionStatus10;
        FeaturedProductPermissionStatus featuredProductPermissionStatus11 = new FeaturedProductPermissionStatus("MEDIA_BI_REVIEW_REJECTED", 10, "MEDIA_BI_REVIEW_REJECTED");
        A0D = featuredProductPermissionStatus11;
        FeaturedProductPermissionStatus featuredProductPermissionStatus12 = new FeaturedProductPermissionStatus("PENDING", 11, "PENDING");
        A0E = featuredProductPermissionStatus12;
        FeaturedProductPermissionStatus[] featuredProductPermissionStatusArr = {featuredProductPermissionStatus, featuredProductPermissionStatus2, featuredProductPermissionStatus3, featuredProductPermissionStatus4, featuredProductPermissionStatus5, featuredProductPermissionStatus6, featuredProductPermissionStatus7, featuredProductPermissionStatus8, featuredProductPermissionStatus9, featuredProductPermissionStatus10, featuredProductPermissionStatus11, featuredProductPermissionStatus12};
        A03 = featuredProductPermissionStatusArr;
        A02 = AbstractC12190kN.A00(featuredProductPermissionStatusArr);
        FeaturedProductPermissionStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (FeaturedProductPermissionStatus featuredProductPermissionStatus13 : values) {
            linkedHashMap.put(featuredProductPermissionStatus13.A00, featuredProductPermissionStatus13);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(34);
    }

    public static FeaturedProductPermissionStatus valueOf(String str) {
        return (FeaturedProductPermissionStatus) Enum.valueOf(FeaturedProductPermissionStatus.class, str);
    }

    public static FeaturedProductPermissionStatus[] values() {
        return (FeaturedProductPermissionStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FeaturedProductPermissionStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
