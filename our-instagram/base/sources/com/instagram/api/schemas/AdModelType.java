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
/* loaded from: classes5.dex */
public final class AdModelType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdModelType[] A03;
    public static final AdModelType A04;
    public static final AdModelType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdModelType adModelType = new AdModelType("UNRECOGNIZED", 0, "AdModelType_unspecified");
        A05 = adModelType;
        AdModelType adModelType2 = new AdModelType("NESTED", 1, "nested");
        A04 = adModelType2;
        AdModelType[] adModelTypeArr = {adModelType, adModelType2, new AdModelType("SIBLING", 2, "sibling")};
        A03 = adModelTypeArr;
        A02 = AbstractC12190kN.A00(adModelTypeArr);
        AdModelType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AdModelType adModelType3 : values) {
            A18.put(adModelType3.A00, adModelType3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(36);
    }

    public static AdModelType valueOf(String str) {
        return (AdModelType) Enum.valueOf(AdModelType.class, str);
    }

    public static AdModelType[] values() {
        return (AdModelType[]) A03.clone();
    }

    public AdModelType(String str, int i, String str2) {
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
