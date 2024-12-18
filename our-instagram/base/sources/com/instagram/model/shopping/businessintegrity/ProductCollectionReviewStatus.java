package com.instagram.model.shopping.businessintegrity;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProductCollectionReviewStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProductCollectionReviewStatus[] A03;
    public static final ProductCollectionReviewStatus A04;
    public static final ProductCollectionReviewStatus A05;
    public static final ProductCollectionReviewStatus A06;
    public static final ProductCollectionReviewStatus A07;
    public static final ProductCollectionReviewStatus A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProductCollectionReviewStatus productCollectionReviewStatus = new ProductCollectionReviewStatus("UNRECOGNIZED", 0, "ProductCollectionReviewStatus_unspecified");
        A08 = productCollectionReviewStatus;
        ProductCollectionReviewStatus productCollectionReviewStatus2 = new ProductCollectionReviewStatus("APPROVED", 1, "approved");
        A04 = productCollectionReviewStatus2;
        ProductCollectionReviewStatus productCollectionReviewStatus3 = new ProductCollectionReviewStatus("NO_REVIEW", 2, "");
        A05 = productCollectionReviewStatus3;
        ProductCollectionReviewStatus productCollectionReviewStatus4 = new ProductCollectionReviewStatus("OUTDATED", 3, "outdated");
        A06 = productCollectionReviewStatus4;
        ProductCollectionReviewStatus productCollectionReviewStatus5 = new ProductCollectionReviewStatus("PENDING", 4, "pending");
        A07 = productCollectionReviewStatus5;
        ProductCollectionReviewStatus[] productCollectionReviewStatusArr = {productCollectionReviewStatus, productCollectionReviewStatus2, productCollectionReviewStatus3, productCollectionReviewStatus4, productCollectionReviewStatus5, new ProductCollectionReviewStatus("REJECTED", 5, "rejected")};
        A03 = productCollectionReviewStatusArr;
        A02 = AbstractC12190kN.A00(productCollectionReviewStatusArr);
        ProductCollectionReviewStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProductCollectionReviewStatus productCollectionReviewStatus6 : values) {
            A18.put(productCollectionReviewStatus6.A00, productCollectionReviewStatus6);
        }
        A01 = A18;
        CREATOR = C41856IgA.A00(22);
    }

    public static ProductCollectionReviewStatus valueOf(String str) {
        return (ProductCollectionReviewStatus) Enum.valueOf(ProductCollectionReviewStatus.class, str);
    }

    public static ProductCollectionReviewStatus[] values() {
        return (ProductCollectionReviewStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProductCollectionReviewStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
