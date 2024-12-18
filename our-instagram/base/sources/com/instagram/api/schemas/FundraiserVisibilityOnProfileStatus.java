package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FundraiserVisibilityOnProfileStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FundraiserVisibilityOnProfileStatus[] A03;
    public static final FundraiserVisibilityOnProfileStatus A04;
    public static final FundraiserVisibilityOnProfileStatus A05;
    public static final FundraiserVisibilityOnProfileStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus = new FundraiserVisibilityOnProfileStatus("UNRECOGNIZED", 0, "FundraiserVisibilityOnProfileStatus_unspecified");
        A06 = fundraiserVisibilityOnProfileStatus;
        FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus2 = new FundraiserVisibilityOnProfileStatus("HIDDEN", 1, "HIDDEN");
        A04 = fundraiserVisibilityOnProfileStatus2;
        FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus3 = new FundraiserVisibilityOnProfileStatus("SHOWN", 2, "SHOWN");
        A05 = fundraiserVisibilityOnProfileStatus3;
        FundraiserVisibilityOnProfileStatus[] fundraiserVisibilityOnProfileStatusArr = {fundraiserVisibilityOnProfileStatus, fundraiserVisibilityOnProfileStatus2, fundraiserVisibilityOnProfileStatus3};
        A03 = fundraiserVisibilityOnProfileStatusArr;
        A02 = AbstractC12190kN.A00(fundraiserVisibilityOnProfileStatusArr);
        FundraiserVisibilityOnProfileStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FundraiserVisibilityOnProfileStatus fundraiserVisibilityOnProfileStatus4 : values) {
            A18.put(fundraiserVisibilityOnProfileStatus4.A00, fundraiserVisibilityOnProfileStatus4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(88);
    }

    public static FundraiserVisibilityOnProfileStatus valueOf(String str) {
        return (FundraiserVisibilityOnProfileStatus) Enum.valueOf(FundraiserVisibilityOnProfileStatus.class, str);
    }

    public static FundraiserVisibilityOnProfileStatus[] values() {
        return (FundraiserVisibilityOnProfileStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FundraiserVisibilityOnProfileStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
