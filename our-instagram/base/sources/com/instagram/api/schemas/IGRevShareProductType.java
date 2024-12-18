package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IGRevShareProductType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGRevShareProductType[] A03;
    public static final IGRevShareProductType A04;
    public static final IGRevShareProductType A05;
    public static final IGRevShareProductType A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        IGRevShareProductType iGRevShareProductType = new IGRevShareProductType("UNRECOGNIZED", 0, "IGRevShareProductType_unspecified");
        A06 = iGRevShareProductType;
        IGRevShareProductType iGRevShareProductType2 = new IGRevShareProductType("PROFILE_ADS", 1, "profile_ads");
        A04 = iGRevShareProductType2;
        IGRevShareProductType iGRevShareProductType3 = new IGRevShareProductType("REELS_OVERLAY_ADS", 2, "reels_overlay_ads");
        A05 = iGRevShareProductType3;
        IGRevShareProductType[] iGRevShareProductTypeArr = {iGRevShareProductType, iGRevShareProductType2, iGRevShareProductType3};
        A03 = iGRevShareProductTypeArr;
        A02 = AbstractC12190kN.A00(iGRevShareProductTypeArr);
        IGRevShareProductType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (IGRevShareProductType iGRevShareProductType4 : values) {
            A18.put(iGRevShareProductType4.A00, iGRevShareProductType4);
        }
        A01 = A18;
        CREATOR = new C41858IgC(50);
    }

    public static IGRevShareProductType valueOf(String str) {
        return (IGRevShareProductType) Enum.valueOf(IGRevShareProductType.class, str);
    }

    public static IGRevShareProductType[] values() {
        return (IGRevShareProductType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGRevShareProductType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
