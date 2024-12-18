package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class BrandedContentBrandTaggingRequestApprovalStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BrandedContentBrandTaggingRequestApprovalStatus[] A03;
    public static final BrandedContentBrandTaggingRequestApprovalStatus A04;
    public static final BrandedContentBrandTaggingRequestApprovalStatus A05;
    public static final BrandedContentBrandTaggingRequestApprovalStatus A06;
    public static final BrandedContentBrandTaggingRequestApprovalStatus A07;
    public static final BrandedContentBrandTaggingRequestApprovalStatus A08;
    public static final BrandedContentBrandTaggingRequestApprovalStatus A09;
    public static final BrandedContentBrandTaggingRequestApprovalStatus A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus = new BrandedContentBrandTaggingRequestApprovalStatus("UNRECOGNIZED", 0, "BrandedContentBrandTaggingRequestApprovalStatus_unspecified");
        A0A = brandedContentBrandTaggingRequestApprovalStatus;
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus2 = new BrandedContentBrandTaggingRequestApprovalStatus("REQUEST_CANCELLED_BY_CREATOR", 1, "request_cancelled_by_creator");
        A04 = brandedContentBrandTaggingRequestApprovalStatus2;
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus3 = new BrandedContentBrandTaggingRequestApprovalStatus("REQUEST_DECLINED", 2, "request_declined");
        A05 = brandedContentBrandTaggingRequestApprovalStatus3;
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus4 = new BrandedContentBrandTaggingRequestApprovalStatus("REQUEST_LIMIT_REACHED", 3, "request_limit_reached");
        A06 = brandedContentBrandTaggingRequestApprovalStatus4;
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus5 = new BrandedContentBrandTaggingRequestApprovalStatus("REQUEST_ONCE_GRANTED", 4, "request_once_granted");
        A07 = brandedContentBrandTaggingRequestApprovalStatus5;
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus6 = new BrandedContentBrandTaggingRequestApprovalStatus("REQUEST_PENDING", 5, "request_pending");
        A08 = brandedContentBrandTaggingRequestApprovalStatus6;
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus7 = new BrandedContentBrandTaggingRequestApprovalStatus("REQUEST_REJECTED_BY_BRAND", 6, "request_rejected_by_brand");
        A09 = brandedContentBrandTaggingRequestApprovalStatus7;
        BrandedContentBrandTaggingRequestApprovalStatus[] brandedContentBrandTaggingRequestApprovalStatusArr = {brandedContentBrandTaggingRequestApprovalStatus, brandedContentBrandTaggingRequestApprovalStatus2, brandedContentBrandTaggingRequestApprovalStatus3, brandedContentBrandTaggingRequestApprovalStatus4, brandedContentBrandTaggingRequestApprovalStatus5, brandedContentBrandTaggingRequestApprovalStatus6, brandedContentBrandTaggingRequestApprovalStatus7};
        A03 = brandedContentBrandTaggingRequestApprovalStatusArr;
        A02 = AbstractC12190kN.A00(brandedContentBrandTaggingRequestApprovalStatusArr);
        BrandedContentBrandTaggingRequestApprovalStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus8 : values) {
            A18.put(brandedContentBrandTaggingRequestApprovalStatus8.A00, brandedContentBrandTaggingRequestApprovalStatus8);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(77);
    }

    public static BrandedContentBrandTaggingRequestApprovalStatus valueOf(String str) {
        return (BrandedContentBrandTaggingRequestApprovalStatus) Enum.valueOf(BrandedContentBrandTaggingRequestApprovalStatus.class, str);
    }

    public static BrandedContentBrandTaggingRequestApprovalStatus[] values() {
        return (BrandedContentBrandTaggingRequestApprovalStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BrandedContentBrandTaggingRequestApprovalStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
