package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class CollectionPrivacyModeEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CollectionPrivacyModeEnum[] A03;
    public static final CollectionPrivacyModeEnum A04;
    public static final CollectionPrivacyModeEnum A05;
    public static final CollectionPrivacyModeEnum A06;
    public static final CollectionPrivacyModeEnum A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CollectionPrivacyModeEnum collectionPrivacyModeEnum = new CollectionPrivacyModeEnum("UNRECOGNIZED", 0, "CollectionPrivacyModeEnum_unspecified");
        A07 = collectionPrivacyModeEnum;
        CollectionPrivacyModeEnum collectionPrivacyModeEnum2 = new CollectionPrivacyModeEnum("COLLABORATIVE", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = collectionPrivacyModeEnum2;
        CollectionPrivacyModeEnum collectionPrivacyModeEnum3 = new CollectionPrivacyModeEnum("PRIVATE", 2, "0");
        A05 = collectionPrivacyModeEnum3;
        CollectionPrivacyModeEnum collectionPrivacyModeEnum4 = new CollectionPrivacyModeEnum("PUBLIC", 3, "2");
        A06 = collectionPrivacyModeEnum4;
        CollectionPrivacyModeEnum[] collectionPrivacyModeEnumArr = {collectionPrivacyModeEnum, collectionPrivacyModeEnum2, collectionPrivacyModeEnum3, collectionPrivacyModeEnum4};
        A03 = collectionPrivacyModeEnumArr;
        A02 = AbstractC12190kN.A00(collectionPrivacyModeEnumArr);
        CollectionPrivacyModeEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (CollectionPrivacyModeEnum collectionPrivacyModeEnum5 : values) {
            A18.put(collectionPrivacyModeEnum5.A00, collectionPrivacyModeEnum5);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(23);
    }

    public static CollectionPrivacyModeEnum valueOf(String str) {
        return (CollectionPrivacyModeEnum) Enum.valueOf(CollectionPrivacyModeEnum.class, str);
    }

    public static CollectionPrivacyModeEnum[] values() {
        return (CollectionPrivacyModeEnum[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CollectionPrivacyModeEnum(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
