package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ProductReviewStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductReviewStatus[] A03;
    public static final ProductReviewStatus A04;
    public static final ProductReviewStatus A05;
    public static final ProductReviewStatus A06;
    public static final ProductReviewStatus A07;
    public static final ProductReviewStatus A08;
    public static final ProductReviewStatus A09;
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
        ProductReviewStatus productReviewStatus = new ProductReviewStatus("UNRECOGNIZED", 0, "ProductReviewStatus_unspecified");
        A09 = productReviewStatus;
        ProductReviewStatus productReviewStatus2 = new ProductReviewStatus("APPROVED", 1, "approved");
        A04 = productReviewStatus2;
        ProductReviewStatus productReviewStatus3 = new ProductReviewStatus("NO_REVIEW", 2, "");
        A05 = productReviewStatus3;
        ProductReviewStatus productReviewStatus4 = new ProductReviewStatus("OUTDATED", 3, "outdated");
        A06 = productReviewStatus4;
        ProductReviewStatus productReviewStatus5 = new ProductReviewStatus("PENDING", 4, "pending");
        A07 = productReviewStatus5;
        ProductReviewStatus productReviewStatus6 = new ProductReviewStatus("REJECTED", 5, "rejected");
        A08 = productReviewStatus6;
        ProductReviewStatus[] productReviewStatusArr = {productReviewStatus, productReviewStatus2, productReviewStatus3, productReviewStatus4, productReviewStatus5, productReviewStatus6};
        A03 = productReviewStatusArr;
        A02 = AbstractC12190kN.A00(productReviewStatusArr);
        ProductReviewStatus[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ProductReviewStatus productReviewStatus7 : values) {
            linkedHashMap.put(productReviewStatus7.A00, productReviewStatus7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(85);
    }

    public static ProductReviewStatus valueOf(String str) {
        return (ProductReviewStatus) Enum.valueOf(ProductReviewStatus.class, str);
    }

    public static ProductReviewStatus[] values() {
        return (ProductReviewStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductReviewStatus(String str, int i, String str2) {
        this.A00 = str2;
    }
}
