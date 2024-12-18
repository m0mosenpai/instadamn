package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class BwPPostClickLandingExperineceType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BwPPostClickLandingExperineceType[] A03;
    public static final BwPPostClickLandingExperineceType A04;
    public static final BwPPostClickLandingExperineceType A05;
    public static final BwPPostClickLandingExperineceType A06;
    public static final BwPPostClickLandingExperineceType A07;
    public static final BwPPostClickLandingExperineceType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType = new BwPPostClickLandingExperineceType("UNRECOGNIZED", 0, "BwPPostClickLandingExperineceType_unspecified");
        A08 = bwPPostClickLandingExperineceType;
        BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType2 = new BwPPostClickLandingExperineceType("BWI_STANDARD_IAB", 1, "4");
        A04 = bwPPostClickLandingExperineceType2;
        BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType3 = new BwPPostClickLandingExperineceType("CUSTOM_IAB_FOR_1P", 2, "2");
        A05 = bwPPostClickLandingExperineceType3;
        BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType4 = new BwPPostClickLandingExperineceType("CUSTOM_IAB_FOR_DTC", 3, "3");
        A06 = bwPPostClickLandingExperineceType4;
        BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType5 = new BwPPostClickLandingExperineceType("STANDARD_IAB", 4, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A07 = bwPPostClickLandingExperineceType5;
        BwPPostClickLandingExperineceType[] bwPPostClickLandingExperineceTypeArr = {bwPPostClickLandingExperineceType, bwPPostClickLandingExperineceType2, bwPPostClickLandingExperineceType3, bwPPostClickLandingExperineceType4, bwPPostClickLandingExperineceType5, new BwPPostClickLandingExperineceType("UNDEFINED", 5, "0")};
        A03 = bwPPostClickLandingExperineceTypeArr;
        A02 = AbstractC12190kN.A00(bwPPostClickLandingExperineceTypeArr);
        BwPPostClickLandingExperineceType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BwPPostClickLandingExperineceType bwPPostClickLandingExperineceType6 : values) {
            A18.put(bwPPostClickLandingExperineceType6.A00, bwPPostClickLandingExperineceType6);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(85);
    }

    public static BwPPostClickLandingExperineceType valueOf(String str) {
        return (BwPPostClickLandingExperineceType) Enum.valueOf(BwPPostClickLandingExperineceType.class, str);
    }

    public static BwPPostClickLandingExperineceType[] values() {
        return (BwPPostClickLandingExperineceType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BwPPostClickLandingExperineceType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
