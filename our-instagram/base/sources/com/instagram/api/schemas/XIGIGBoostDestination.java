package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class XIGIGBoostDestination implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XIGIGBoostDestination[] A03;
    public static final XIGIGBoostDestination A04;
    public static final XIGIGBoostDestination A05;
    public static final XIGIGBoostDestination A06;
    public static final XIGIGBoostDestination A07;
    public static final XIGIGBoostDestination A08;
    public static final XIGIGBoostDestination A09;
    public static final XIGIGBoostDestination A0A;
    public static final XIGIGBoostDestination A0B;
    public static final XIGIGBoostDestination A0C;
    public static final XIGIGBoostDestination A0D;
    public static final XIGIGBoostDestination A0E;
    public static final XIGIGBoostDestination A0F;
    public static final XIGIGBoostDestination A0G;
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
        XIGIGBoostDestination xIGIGBoostDestination = new XIGIGBoostDestination("UNRECOGNIZED", 0, "XIGIGBoostDestination_unspecified");
        A0C = xIGIGBoostDestination;
        XIGIGBoostDestination xIGIGBoostDestination2 = new XIGIGBoostDestination("DIRECT_MESSAGE", 1, "DIRECT_MESSAGE");
        A04 = xIGIGBoostDestination2;
        XIGIGBoostDestination xIGIGBoostDestination3 = new XIGIGBoostDestination("DO_NOT_USE_WEBSITE_CLICKS_FIX", 2, "DO_NOT_USE_WEBSITE_CLICKS_FIX");
        A05 = xIGIGBoostDestination3;
        XIGIGBoostDestination xIGIGBoostDestination4 = new XIGIGBoostDestination("JOIN_BROADCAST_CHANNEL", 3, "JOIN_BROADCAST_CHANNEL");
        A06 = xIGIGBoostDestination4;
        XIGIGBoostDestination xIGIGBoostDestination5 = new XIGIGBoostDestination("LEAD_GENERATION", 4, "LEAD_GENERATION");
        A07 = xIGIGBoostDestination5;
        XIGIGBoostDestination xIGIGBoostDestination6 = new XIGIGBoostDestination("MULTI_DESTINATION_MESSAGE", 5, "MULTI_DESTINATION_MESSAGE");
        A08 = xIGIGBoostDestination6;
        XIGIGBoostDestination xIGIGBoostDestination7 = new XIGIGBoostDestination("OUTCOME_SALES", 6, "OUTCOME_SALES");
        A09 = xIGIGBoostDestination7;
        XIGIGBoostDestination xIGIGBoostDestination8 = new XIGIGBoostDestination("POST_ENGAGEMENT", 7, "POST_ENGAGEMENT");
        A0A = xIGIGBoostDestination8;
        XIGIGBoostDestination xIGIGBoostDestination9 = new XIGIGBoostDestination("PROFILE_VISITS", 8, "PROFILE_VISITS");
        A0B = xIGIGBoostDestination9;
        XIGIGBoostDestination xIGIGBoostDestination10 = new XIGIGBoostDestination("UNSELECTED", 9, "UNSELECTED");
        A0D = xIGIGBoostDestination10;
        XIGIGBoostDestination xIGIGBoostDestination11 = new XIGIGBoostDestination("WEBSITE_CLICK", 10, "WEBSITE_CLICK");
        A0E = xIGIGBoostDestination11;
        XIGIGBoostDestination xIGIGBoostDestination12 = new XIGIGBoostDestination("WEBSITE_CONVERSION", 11, "WEBSITE_CONVERSION");
        A0F = xIGIGBoostDestination12;
        XIGIGBoostDestination xIGIGBoostDestination13 = new XIGIGBoostDestination("WHATSAPP_MESSAGE", 12, "WHATSAPP_MESSAGE");
        A0G = xIGIGBoostDestination13;
        XIGIGBoostDestination[] xIGIGBoostDestinationArr = {xIGIGBoostDestination, xIGIGBoostDestination2, xIGIGBoostDestination3, xIGIGBoostDestination4, xIGIGBoostDestination5, xIGIGBoostDestination6, xIGIGBoostDestination7, xIGIGBoostDestination8, xIGIGBoostDestination9, xIGIGBoostDestination10, xIGIGBoostDestination11, xIGIGBoostDestination12, xIGIGBoostDestination13};
        A03 = xIGIGBoostDestinationArr;
        A02 = AbstractC12190kN.A00(xIGIGBoostDestinationArr);
        XIGIGBoostDestination[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (XIGIGBoostDestination xIGIGBoostDestination14 : values) {
            linkedHashMap.put(xIGIGBoostDestination14.A00, xIGIGBoostDestination14);
        }
        A01 = linkedHashMap;
        CREATOR = new C70220WId(1);
    }

    public static XIGIGBoostDestination valueOf(String str) {
        return (XIGIGBoostDestination) Enum.valueOf(XIGIGBoostDestination.class, str);
    }

    public static XIGIGBoostDestination[] values() {
        return (XIGIGBoostDestination[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XIGIGBoostDestination(String str, int i, String str2) {
        this.A00 = str2;
    }
}
