package com.instagram.model.mediatype;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CTAStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CTAStyle[] A03;
    public static final CTAStyle A04;
    public static final CTAStyle A05;
    public static final CTAStyle A06;
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
        CTAStyle cTAStyle = new CTAStyle("UNRECOGNIZED", 0, "CTAStyle_unspecified");
        A06 = cTAStyle;
        CTAStyle cTAStyle2 = new CTAStyle("BAR_CTA", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = cTAStyle2;
        CTAStyle cTAStyle3 = new CTAStyle("CLIENT_DEFAULT", 2, "0");
        A05 = cTAStyle3;
        CTAStyle[] cTAStyleArr = {cTAStyle, cTAStyle2, cTAStyle3, new CTAStyle("COLLECTION_TRANSLUCENT_CTA", 3, "2")};
        A03 = cTAStyleArr;
        A02 = AbstractC12190kN.A00(cTAStyleArr);
        CTAStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CTAStyle cTAStyle4 : values) {
            linkedHashMap.put(cTAStyle4.A00, cTAStyle4);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(22);
    }

    public static CTAStyle valueOf(String str) {
        return (CTAStyle) Enum.valueOf(CTAStyle.class, str);
    }

    public static CTAStyle[] values() {
        return (CTAStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CTAStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
