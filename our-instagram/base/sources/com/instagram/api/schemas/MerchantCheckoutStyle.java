package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class MerchantCheckoutStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MerchantCheckoutStyle[] A03;
    public static final MerchantCheckoutStyle A04;
    public static final MerchantCheckoutStyle A05;
    public static final MerchantCheckoutStyle A06;
    public static final MerchantCheckoutStyle A07;
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
        MerchantCheckoutStyle merchantCheckoutStyle = new MerchantCheckoutStyle("UNRECOGNIZED", 0, "MerchantCheckoutStyle_unspecified");
        A07 = merchantCheckoutStyle;
        MerchantCheckoutStyle merchantCheckoutStyle2 = new MerchantCheckoutStyle("CHECKOUT", 1, "checkout");
        A04 = merchantCheckoutStyle2;
        MerchantCheckoutStyle merchantCheckoutStyle3 = new MerchantCheckoutStyle("MULTI_ITEM_CHECKOUT", 2, "multi_item_checkout");
        A05 = merchantCheckoutStyle3;
        MerchantCheckoutStyle merchantCheckoutStyle4 = new MerchantCheckoutStyle(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, NetInfoModule.CONNECTION_TYPE_NONE);
        A06 = merchantCheckoutStyle4;
        MerchantCheckoutStyle[] merchantCheckoutStyleArr = {merchantCheckoutStyle, merchantCheckoutStyle2, merchantCheckoutStyle3, merchantCheckoutStyle4};
        A03 = merchantCheckoutStyleArr;
        A02 = AbstractC12190kN.A00(merchantCheckoutStyleArr);
        MerchantCheckoutStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MerchantCheckoutStyle merchantCheckoutStyle5 : values) {
            linkedHashMap.put(merchantCheckoutStyle5.A00, merchantCheckoutStyle5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(48);
    }

    public static MerchantCheckoutStyle valueOf(String str) {
        return (MerchantCheckoutStyle) Enum.valueOf(MerchantCheckoutStyle.class, str);
    }

    public static MerchantCheckoutStyle[] values() {
        return (MerchantCheckoutStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MerchantCheckoutStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}