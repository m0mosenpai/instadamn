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
/* loaded from: classes.dex */
public final class SellerShoppableFeedType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SellerShoppableFeedType[] A03;
    public static final SellerShoppableFeedType A04;
    public static final SellerShoppableFeedType A05;
    public static final SellerShoppableFeedType A06;
    public static final SellerShoppableFeedType A07;
    public static final SellerShoppableFeedType A08;
    public static final SellerShoppableFeedType A09;
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
        SellerShoppableFeedType sellerShoppableFeedType = new SellerShoppableFeedType("UNRECOGNIZED", 0, "SellerShoppableFeedType_unspecified");
        A08 = sellerShoppableFeedType;
        SellerShoppableFeedType sellerShoppableFeedType2 = new SellerShoppableFeedType("MINI_SHOP", 1, "mini_shop");
        A04 = sellerShoppableFeedType2;
        SellerShoppableFeedType sellerShoppableFeedType3 = new SellerShoppableFeedType("MINI_SHOP_WAVE_2", 2, "mini_shop_wave_2");
        A05 = sellerShoppableFeedType3;
        SellerShoppableFeedType sellerShoppableFeedType4 = new SellerShoppableFeedType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, NetInfoModule.CONNECTION_TYPE_NONE);
        A06 = sellerShoppableFeedType4;
        SellerShoppableFeedType sellerShoppableFeedType5 = new SellerShoppableFeedType("PROFILE_SHOP", 4, "profile_shop");
        A07 = sellerShoppableFeedType5;
        SellerShoppableFeedType sellerShoppableFeedType6 = new SellerShoppableFeedType("ZERO_MOBILE_CENTER", 5, "zero_mobile_center");
        A09 = sellerShoppableFeedType6;
        SellerShoppableFeedType[] sellerShoppableFeedTypeArr = {sellerShoppableFeedType, sellerShoppableFeedType2, sellerShoppableFeedType3, sellerShoppableFeedType4, sellerShoppableFeedType5, sellerShoppableFeedType6};
        A03 = sellerShoppableFeedTypeArr;
        A02 = AbstractC12190kN.A00(sellerShoppableFeedTypeArr);
        SellerShoppableFeedType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (SellerShoppableFeedType sellerShoppableFeedType7 : values) {
            linkedHashMap.put(sellerShoppableFeedType7.A00, sellerShoppableFeedType7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(5);
    }

    public static SellerShoppableFeedType valueOf(String str) {
        return (SellerShoppableFeedType) Enum.valueOf(SellerShoppableFeedType.class, str);
    }

    public static SellerShoppableFeedType[] values() {
        return (SellerShoppableFeedType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SellerShoppableFeedType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
