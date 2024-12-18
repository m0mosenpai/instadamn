package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BrandedContentAdsPaidPartnershipLabelRemovalOption implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BrandedContentAdsPaidPartnershipLabelRemovalOption[] A03;
    public static final BrandedContentAdsPaidPartnershipLabelRemovalOption A04;
    public static final BrandedContentAdsPaidPartnershipLabelRemovalOption A05;
    public static final BrandedContentAdsPaidPartnershipLabelRemovalOption A06;
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
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = new BrandedContentAdsPaidPartnershipLabelRemovalOption("UNRECOGNIZED", 0, "BrandedContentAdsPaidPartnershipLabelRemovalOption_unspecified");
        A06 = brandedContentAdsPaidPartnershipLabelRemovalOption;
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption2 = new BrandedContentAdsPaidPartnershipLabelRemovalOption("DUAL_HEADER_AND", 1, "dual_header_and");
        A04 = brandedContentAdsPaidPartnershipLabelRemovalOption2;
        BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption3 = new BrandedContentAdsPaidPartnershipLabelRemovalOption("DUAL_HEADER_WITH", 2, "dual_header_with");
        A05 = brandedContentAdsPaidPartnershipLabelRemovalOption3;
        BrandedContentAdsPaidPartnershipLabelRemovalOption[] brandedContentAdsPaidPartnershipLabelRemovalOptionArr = {brandedContentAdsPaidPartnershipLabelRemovalOption, brandedContentAdsPaidPartnershipLabelRemovalOption2, brandedContentAdsPaidPartnershipLabelRemovalOption3, new BrandedContentAdsPaidPartnershipLabelRemovalOption("SINGLE_HEADER", 3, "single_header")};
        A03 = brandedContentAdsPaidPartnershipLabelRemovalOptionArr;
        A02 = AbstractC12190kN.A00(brandedContentAdsPaidPartnershipLabelRemovalOptionArr);
        BrandedContentAdsPaidPartnershipLabelRemovalOption[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption4 : values) {
            linkedHashMap.put(brandedContentAdsPaidPartnershipLabelRemovalOption4.A00, brandedContentAdsPaidPartnershipLabelRemovalOption4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(55);
    }

    public static BrandedContentAdsPaidPartnershipLabelRemovalOption valueOf(String str) {
        return (BrandedContentAdsPaidPartnershipLabelRemovalOption) Enum.valueOf(BrandedContentAdsPaidPartnershipLabelRemovalOption.class, str);
    }

    public static BrandedContentAdsPaidPartnershipLabelRemovalOption[] values() {
        return (BrandedContentAdsPaidPartnershipLabelRemovalOption[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BrandedContentAdsPaidPartnershipLabelRemovalOption(String str, int i, String str2) {
        this.A00 = str2;
    }
}
