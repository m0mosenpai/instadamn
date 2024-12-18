package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class AdsMessageExtensionType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AdsMessageExtensionType[] A03;
    public static final AdsMessageExtensionType A04;
    public static final AdsMessageExtensionType A05;
    public static final AdsMessageExtensionType A06;
    public static final AdsMessageExtensionType A07;
    public static final AdsMessageExtensionType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AdsMessageExtensionType adsMessageExtensionType = new AdsMessageExtensionType("UNRECOGNIZED", 0, "AdsMessageExtensionType_unspecified");
        A07 = adsMessageExtensionType;
        AdsMessageExtensionType adsMessageExtensionType2 = new AdsMessageExtensionType("INSTAGRAM_MESSAGE", 1, "INSTAGRAM_MESSAGE");
        A04 = adsMessageExtensionType2;
        AdsMessageExtensionType adsMessageExtensionType3 = new AdsMessageExtensionType("MESSENGER", 2, "MESSENGER");
        A05 = adsMessageExtensionType3;
        AdsMessageExtensionType adsMessageExtensionType4 = new AdsMessageExtensionType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A06 = adsMessageExtensionType4;
        AdsMessageExtensionType adsMessageExtensionType5 = new AdsMessageExtensionType("WHATSAPP", 4, "WHATSAPP");
        A08 = adsMessageExtensionType5;
        AdsMessageExtensionType[] adsMessageExtensionTypeArr = {adsMessageExtensionType, adsMessageExtensionType2, adsMessageExtensionType3, adsMessageExtensionType4, adsMessageExtensionType5, new AdsMessageExtensionType("WHATSAPP_FACEBOOK_PAGE", 5, "WHATSAPP_FACEBOOK_PAGE")};
        A03 = adsMessageExtensionTypeArr;
        A02 = AbstractC12190kN.A00(adsMessageExtensionTypeArr);
        AdsMessageExtensionType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (AdsMessageExtensionType adsMessageExtensionType6 : values) {
            linkedHashMap.put(adsMessageExtensionType6.A00, adsMessageExtensionType6);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(40);
    }

    public static AdsMessageExtensionType valueOf(String str) {
        return (AdsMessageExtensionType) Enum.valueOf(AdsMessageExtensionType.class, str);
    }

    public static AdsMessageExtensionType[] values() {
        return (AdsMessageExtensionType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AdsMessageExtensionType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
