package com.instagram.model.coupon;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C55343Oh9;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class PromoteCouponType implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ PromoteCouponType[] A02;
    public static final PromoteCouponType A03;
    public static final PromoteCouponType A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    static {
        PromoteCouponType promoteCouponType = new PromoteCouponType("HERES_X", 0, "HERES_X");
        A03 = promoteCouponType;
        PromoteCouponType promoteCouponType2 = new PromoteCouponType("RECREATE_MIN_SPEND_X_TO_GET_Y", 1, "RECREATE_MIN_SPEND_X_TO_GET_Y");
        A04 = promoteCouponType2;
        PromoteCouponType[] promoteCouponTypeArr = {promoteCouponType, promoteCouponType2};
        A02 = promoteCouponTypeArr;
        A01 = AbstractC12190kN.A00(promoteCouponTypeArr);
        CREATOR = C55343Oh9.A00(59);
    }

    public static PromoteCouponType valueOf(String str) {
        return (PromoteCouponType) Enum.valueOf(PromoteCouponType.class, str);
    }

    public static PromoteCouponType[] values() {
        return (PromoteCouponType[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PromoteCouponType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
