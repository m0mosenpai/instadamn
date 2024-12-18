package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MiniShopSellerOnboardingStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MiniShopSellerOnboardingStatus[] A03;
    public static final MiniShopSellerOnboardingStatus A04;
    public static final MiniShopSellerOnboardingStatus A05;
    public static final MiniShopSellerOnboardingStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MiniShopSellerOnboardingStatus miniShopSellerOnboardingStatus = new MiniShopSellerOnboardingStatus("UNRECOGNIZED", 0, "MiniShopSellerOnboardingStatus_unspecified");
        A06 = miniShopSellerOnboardingStatus;
        MiniShopSellerOnboardingStatus miniShopSellerOnboardingStatus2 = new MiniShopSellerOnboardingStatus("ELIGIBLE", 1, "eligible");
        A04 = miniShopSellerOnboardingStatus2;
        MiniShopSellerOnboardingStatus miniShopSellerOnboardingStatus3 = new MiniShopSellerOnboardingStatus("INELIGIBLE", 2, "ineligible");
        A05 = miniShopSellerOnboardingStatus3;
        MiniShopSellerOnboardingStatus[] miniShopSellerOnboardingStatusArr = {miniShopSellerOnboardingStatus, miniShopSellerOnboardingStatus2, miniShopSellerOnboardingStatus3, new MiniShopSellerOnboardingStatus("ONBOARDED", 3, "onboarded")};
        A03 = miniShopSellerOnboardingStatusArr;
        A02 = AbstractC12190kN.A00(miniShopSellerOnboardingStatusArr);
        MiniShopSellerOnboardingStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MiniShopSellerOnboardingStatus miniShopSellerOnboardingStatus4 : values) {
            A18.put(miniShopSellerOnboardingStatus4.A00, miniShopSellerOnboardingStatus4);
        }
        A01 = A18;
        CREATOR = new C41855Ig9(1);
    }

    public static MiniShopSellerOnboardingStatus valueOf(String str) {
        return (MiniShopSellerOnboardingStatus) Enum.valueOf(MiniShopSellerOnboardingStatus.class, str);
    }

    public static MiniShopSellerOnboardingStatus[] values() {
        return (MiniShopSellerOnboardingStatus[]) A03.clone();
    }

    public MiniShopSellerOnboardingStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
