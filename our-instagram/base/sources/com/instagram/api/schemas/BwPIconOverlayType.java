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
public final class BwPIconOverlayType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BwPIconOverlayType[] A03;
    public static final BwPIconOverlayType A04;
    public static final BwPIconOverlayType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BwPIconOverlayType bwPIconOverlayType = new BwPIconOverlayType("UNRECOGNIZED", 0, "BwPIconOverlayType_unspecified");
        A05 = bwPIconOverlayType;
        BwPIconOverlayType bwPIconOverlayType2 = new BwPIconOverlayType("BWP_BADGE", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = bwPIconOverlayType2;
        BwPIconOverlayType[] bwPIconOverlayTypeArr = {bwPIconOverlayType, bwPIconOverlayType2, new BwPIconOverlayType("UNDEFINED", 2, "0")};
        A03 = bwPIconOverlayTypeArr;
        A02 = AbstractC12190kN.A00(bwPIconOverlayTypeArr);
        BwPIconOverlayType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BwPIconOverlayType bwPIconOverlayType3 : values) {
            A18.put(bwPIconOverlayType3.A00, bwPIconOverlayType3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(84);
    }

    public static BwPIconOverlayType valueOf(String str) {
        return (BwPIconOverlayType) Enum.valueOf(BwPIconOverlayType.class, str);
    }

    public static BwPIconOverlayType[] values() {
        return (BwPIconOverlayType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BwPIconOverlayType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
