package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SponsoredAdsDisclaimerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SponsoredAdsDisclaimerType[] A03;
    public static final SponsoredAdsDisclaimerType A04;
    public static final SponsoredAdsDisclaimerType A05;
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
        SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType = new SponsoredAdsDisclaimerType("UNRECOGNIZED", 0, "SponsoredAdsDisclaimerType_unspecified");
        A05 = sponsoredAdsDisclaimerType;
        SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType2 = new SponsoredAdsDisclaimerType("BASIC_ADS", 1, "basic_ads");
        A04 = sponsoredAdsDisclaimerType2;
        SponsoredAdsDisclaimerType[] sponsoredAdsDisclaimerTypeArr = {sponsoredAdsDisclaimerType, sponsoredAdsDisclaimerType2};
        A03 = sponsoredAdsDisclaimerTypeArr;
        A02 = AbstractC12190kN.A00(sponsoredAdsDisclaimerTypeArr);
        SponsoredAdsDisclaimerType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType3 : values) {
            linkedHashMap.put(sponsoredAdsDisclaimerType3.A00, sponsoredAdsDisclaimerType3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(10);
    }

    public static SponsoredAdsDisclaimerType valueOf(String str) {
        return (SponsoredAdsDisclaimerType) Enum.valueOf(SponsoredAdsDisclaimerType.class, str);
    }

    public static SponsoredAdsDisclaimerType[] values() {
        return (SponsoredAdsDisclaimerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SponsoredAdsDisclaimerType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
