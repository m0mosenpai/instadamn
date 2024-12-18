package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AdMetadataType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdMetadataType[] A03;
    public static final AdMetadataType A04;
    public static final AdMetadataType A05;
    public static final AdMetadataType A06;
    public static final AdMetadataType A07;
    public static final AdMetadataType A08;
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
        AdMetadataType adMetadataType = new AdMetadataType("UNRECOGNIZED", 0, "AdMetadataType_unspecified");
        A08 = adMetadataType;
        AdMetadataType adMetadataType2 = new AdMetadataType("DESTINATION_NAME", 1, "4");
        A04 = adMetadataType2;
        AdMetadataType adMetadataType3 = new AdMetadataType("NUMBER", 2, "0");
        A05 = adMetadataType3;
        AdMetadataType adMetadataType4 = new AdMetadataType("RATING", 3, "2");
        A06 = adMetadataType4;
        AdMetadataType adMetadataType5 = new AdMetadataType("STRING", 4, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A07 = adMetadataType5;
        AdMetadataType[] adMetadataTypeArr = {adMetadataType, adMetadataType2, adMetadataType3, adMetadataType4, adMetadataType5, new AdMetadataType("STRING_WITH_STRIKE", 5, "3")};
        A03 = adMetadataTypeArr;
        A02 = AbstractC12190kN.A00(adMetadataTypeArr);
        AdMetadataType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (AdMetadataType adMetadataType6 : values) {
            linkedHashMap.put(adMetadataType6.A00, adMetadataType6);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(43);
    }

    public static AdMetadataType valueOf(String str) {
        return (AdMetadataType) Enum.valueOf(AdMetadataType.class, str);
    }

    public static AdMetadataType[] values() {
        return (AdMetadataType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdMetadataType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
