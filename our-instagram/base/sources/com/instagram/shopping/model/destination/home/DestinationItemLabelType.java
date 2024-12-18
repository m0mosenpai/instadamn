package com.instagram.shopping.model.destination.home;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C37324GcR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DestinationItemLabelType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DestinationItemLabelType[] A03;
    public static final DestinationItemLabelType A04;
    public static final DestinationItemLabelType A05;
    public static final DestinationItemLabelType A06;
    public static final DestinationItemLabelType A07;
    public static final DestinationItemLabelType A08;
    public static final DestinationItemLabelType A09;
    public static final DestinationItemLabelType A0A;
    public static final DestinationItemLabelType A0B;
    public static final DestinationItemLabelType A0C;
    public static final DestinationItemLabelType A0D;
    public static final DestinationItemLabelType A0E;
    public static final DestinationItemLabelType A0F;
    public static final DestinationItemLabelType A0G;
    public static final DestinationItemLabelType A0H;
    public static final DestinationItemLabelType A0I;
    public static final DestinationItemLabelType A0J;
    public static final DestinationItemLabelType A0K;
    public static final DestinationItemLabelType A0L;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        DestinationItemLabelType destinationItemLabelType = new DestinationItemLabelType("UNRECOGNIZED", 0, "DestinationItemLabelType_unspecified");
        A0J = destinationItemLabelType;
        DestinationItemLabelType destinationItemLabelType2 = new DestinationItemLabelType("ADD_TO_BAG", 1, "add_to_bag");
        A04 = destinationItemLabelType2;
        DestinationItemLabelType destinationItemLabelType3 = new DestinationItemLabelType("DROPS_LAUNCH_INFO", 2, "drops_launch_info");
        A05 = destinationItemLabelType3;
        DestinationItemLabelType destinationItemLabelType4 = new DestinationItemLabelType("FEATURED_PRODUCT_PERMISSION_STATUS", 3, "featured_product_permission_status");
        A06 = destinationItemLabelType4;
        DestinationItemLabelType destinationItemLabelType5 = new DestinationItemLabelType("FREE_SHIPPING", 4, "free_shipping");
        A07 = destinationItemLabelType5;
        DestinationItemLabelType destinationItemLabelType6 = new DestinationItemLabelType("IN_REVIEW", 5, "in_review");
        A08 = destinationItemLabelType6;
        DestinationItemLabelType destinationItemLabelType7 = new DestinationItemLabelType("LOW_STOCK", 6, "low_stock");
        A09 = destinationItemLabelType7;
        DestinationItemLabelType destinationItemLabelType8 = new DestinationItemLabelType("MERCHANT_NAME", 7, "merchant_name");
        A0A = destinationItemLabelType8;
        DestinationItemLabelType destinationItemLabelType9 = new DestinationItemLabelType("MERCHANT_NAME_AND_PRICE", 8, "merchant_name_and_price");
        A0B = destinationItemLabelType9;
        DestinationItemLabelType destinationItemLabelType10 = new DestinationItemLabelType("NOT_APPROVED", 9, "not_approved");
        A0C = destinationItemLabelType10;
        DestinationItemLabelType destinationItemLabelType11 = new DestinationItemLabelType("PER_UNIT_PRICE", 10, "per_unit_price");
        A0D = destinationItemLabelType11;
        DestinationItemLabelType destinationItemLabelType12 = new DestinationItemLabelType("PRICE", 11, "price");
        A0E = destinationItemLabelType12;
        DestinationItemLabelType destinationItemLabelType13 = new DestinationItemLabelType("PRODUCT_NAME", 12, "product_name");
        A0F = destinationItemLabelType13;
        DestinationItemLabelType destinationItemLabelType14 = new DestinationItemLabelType("PRODUCT_NAME_AND_PRICE", 13, "product_name_and_price");
        A0G = destinationItemLabelType14;
        DestinationItemLabelType destinationItemLabelType15 = new DestinationItemLabelType("RATING", 14, "rating");
        A0H = destinationItemLabelType15;
        DestinationItemLabelType destinationItemLabelType16 = new DestinationItemLabelType("SEPARATOR", 15, "separator");
        A0I = destinationItemLabelType16;
        DestinationItemLabelType destinationItemLabelType17 = new DestinationItemLabelType("VIEW_ON_WEBSITE", 16, "view_on_website");
        A0K = destinationItemLabelType17;
        DestinationItemLabelType destinationItemLabelType18 = new DestinationItemLabelType("VIEW_SIMILAR", 17, "view_similar");
        A0L = destinationItemLabelType18;
        DestinationItemLabelType[] destinationItemLabelTypeArr = {destinationItemLabelType, destinationItemLabelType2, destinationItemLabelType3, destinationItemLabelType4, destinationItemLabelType5, destinationItemLabelType6, destinationItemLabelType7, destinationItemLabelType8, destinationItemLabelType9, destinationItemLabelType10, destinationItemLabelType11, destinationItemLabelType12, destinationItemLabelType13, destinationItemLabelType14, destinationItemLabelType15, destinationItemLabelType16, destinationItemLabelType17, destinationItemLabelType18, new DestinationItemLabelType("VIEWED_TIMESTAMP", 18, "viewed_timestamp")};
        A03 = destinationItemLabelTypeArr;
        A02 = AbstractC12190kN.A00(destinationItemLabelTypeArr);
        DestinationItemLabelType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (DestinationItemLabelType destinationItemLabelType19 : values) {
            A18.put(destinationItemLabelType19.A00, destinationItemLabelType19);
        }
        A01 = A18;
        CREATOR = C37324GcR.A00(80);
    }

    public static DestinationItemLabelType valueOf(String str) {
        return (DestinationItemLabelType) Enum.valueOf(DestinationItemLabelType.class, str);
    }

    public static DestinationItemLabelType[] values() {
        return (DestinationItemLabelType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public DestinationItemLabelType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
