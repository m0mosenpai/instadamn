package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CheckoutStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CheckoutStyle[] A03;
    public static final CheckoutStyle A04;
    public static final CheckoutStyle A05;
    public static final CheckoutStyle A06;
    public static final CheckoutStyle A07;
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
        CheckoutStyle checkoutStyle = new CheckoutStyle("UNRECOGNIZED", 0, "CheckoutStyle_unspecified");
        A07 = checkoutStyle;
        CheckoutStyle checkoutStyle2 = new CheckoutStyle("EXTERNAL_LINK", 1, "external_link");
        A04 = checkoutStyle2;
        CheckoutStyle checkoutStyle3 = new CheckoutStyle("NATIVE_CHECKOUT", 2, "native_checkout");
        A05 = checkoutStyle3;
        CheckoutStyle checkoutStyle4 = new CheckoutStyle("OFFSITE_IAB_CHECKOUT", 3, "offsite_iab_checkout");
        A06 = checkoutStyle4;
        CheckoutStyle[] checkoutStyleArr = {checkoutStyle, checkoutStyle2, checkoutStyle3, checkoutStyle4};
        A03 = checkoutStyleArr;
        A02 = AbstractC12190kN.A00(checkoutStyleArr);
        CheckoutStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (CheckoutStyle checkoutStyle5 : values) {
            linkedHashMap.put(checkoutStyle5.A00, checkoutStyle5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(60);
    }

    public static CheckoutStyle valueOf(String str) {
        return (CheckoutStyle) Enum.valueOf(CheckoutStyle.class, str);
    }

    public static CheckoutStyle[] values() {
        return (CheckoutStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CheckoutStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
