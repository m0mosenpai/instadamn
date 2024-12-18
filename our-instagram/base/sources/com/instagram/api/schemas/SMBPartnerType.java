package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SMBPartnerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SMBPartnerType[] A03;
    public static final SMBPartnerType A04;
    public static final SMBPartnerType A05;
    public static final SMBPartnerType A06;
    public static final SMBPartnerType A07;
    public static final SMBPartnerType A08;
    public static final SMBPartnerType A09;
    public static final SMBPartnerType A0A;
    public static final SMBPartnerType A0B;
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
        SMBPartnerType sMBPartnerType = new SMBPartnerType("UNRECOGNIZED", 0, "SMBPartnerType_unspecified");
        A0B = sMBPartnerType;
        SMBPartnerType sMBPartnerType2 = new SMBPartnerType("BOOK_NOW", 1, "book_now");
        A04 = sMBPartnerType2;
        SMBPartnerType sMBPartnerType3 = new SMBPartnerType("DONATION", 2, "donation");
        A05 = sMBPartnerType3;
        SMBPartnerType sMBPartnerType4 = new SMBPartnerType("FOOD_DELIVERY", 3, "food_delivery");
        A06 = sMBPartnerType4;
        SMBPartnerType sMBPartnerType5 = new SMBPartnerType("GET_QUOTE", 4, "get_quote");
        A07 = sMBPartnerType5;
        SMBPartnerType sMBPartnerType6 = new SMBPartnerType("GET_TICKETS", 5, "get_tickets");
        A08 = sMBPartnerType6;
        SMBPartnerType sMBPartnerType7 = new SMBPartnerType("GIFT_CARD", 6, "gift_card");
        A09 = sMBPartnerType7;
        SMBPartnerType sMBPartnerType8 = new SMBPartnerType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 7, "");
        A0A = sMBPartnerType8;
        SMBPartnerType[] sMBPartnerTypeArr = {sMBPartnerType, sMBPartnerType2, sMBPartnerType3, sMBPartnerType4, sMBPartnerType5, sMBPartnerType6, sMBPartnerType7, sMBPartnerType8, new SMBPartnerType("RESERVE", 8, "reserve")};
        A03 = sMBPartnerTypeArr;
        A02 = AbstractC12190kN.A00(sMBPartnerTypeArr);
        SMBPartnerType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (SMBPartnerType sMBPartnerType9 : values) {
            linkedHashMap.put(sMBPartnerType9.A00, sMBPartnerType9);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(3);
    }

    public static SMBPartnerType valueOf(String str) {
        return (SMBPartnerType) Enum.valueOf(SMBPartnerType.class, str);
    }

    public static SMBPartnerType[] values() {
        return (SMBPartnerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SMBPartnerType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
