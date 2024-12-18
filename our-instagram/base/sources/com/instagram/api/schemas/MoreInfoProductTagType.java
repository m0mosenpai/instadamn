package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MoreInfoProductTagType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MoreInfoProductTagType[] A03;
    public static final MoreInfoProductTagType A04;
    public static final MoreInfoProductTagType A05;
    public static final MoreInfoProductTagType A06;
    public static final MoreInfoProductTagType A07;
    public static final MoreInfoProductTagType A08;
    public static final MoreInfoProductTagType A09;
    public static final MoreInfoProductTagType A0A;
    public static final MoreInfoProductTagType A0B;
    public static final MoreInfoProductTagType A0C;
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
        MoreInfoProductTagType moreInfoProductTagType = new MoreInfoProductTagType("UNRECOGNIZED", 0, "MoreInfoProductTagType_unspecified");
        A0B = moreInfoProductTagType;
        MoreInfoProductTagType moreInfoProductTagType2 = new MoreInfoProductTagType("LINK_STICKER_ONLY", 1, "link_sticker_only");
        A04 = moreInfoProductTagType2;
        MoreInfoProductTagType moreInfoProductTagType3 = new MoreInfoProductTagType("MIDCARD_SMART_DESTINATION", 2, "midcard_smart_destination");
        A05 = moreInfoProductTagType3;
        MoreInfoProductTagType moreInfoProductTagType4 = new MoreInfoProductTagType("MIDCARD_TWO_TAP_TARGETS", 3, "midcard_two_tap_targets");
        A06 = moreInfoProductTagType4;
        MoreInfoProductTagType moreInfoProductTagType5 = new MoreInfoProductTagType("PILL", 4, "pill");
        A07 = moreInfoProductTagType5;
        MoreInfoProductTagType moreInfoProductTagType6 = new MoreInfoProductTagType("PRODUCT_NAME_CTA", 5, "product_name_cta");
        A08 = moreInfoProductTagType6;
        MoreInfoProductTagType moreInfoProductTagType7 = new MoreInfoProductTagType("PRODUCT_NAME_WITH_POST_TAP_CTA", 6, "product_name_with_post_tap_cta");
        A09 = moreInfoProductTagType7;
        MoreInfoProductTagType moreInfoProductTagType8 = new MoreInfoProductTagType("THUMBNAIL", 7, "thumbnail");
        A0A = moreInfoProductTagType8;
        MoreInfoProductTagType moreInfoProductTagType9 = new MoreInfoProductTagType("WIDE_CTA", 8, "wide_cta");
        A0C = moreInfoProductTagType9;
        MoreInfoProductTagType[] moreInfoProductTagTypeArr = {moreInfoProductTagType, moreInfoProductTagType2, moreInfoProductTagType3, moreInfoProductTagType4, moreInfoProductTagType5, moreInfoProductTagType6, moreInfoProductTagType7, moreInfoProductTagType8, moreInfoProductTagType9};
        A03 = moreInfoProductTagTypeArr;
        A02 = AbstractC12190kN.A00(moreInfoProductTagTypeArr);
        MoreInfoProductTagType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MoreInfoProductTagType moreInfoProductTagType10 : values) {
            linkedHashMap.put(moreInfoProductTagType10.A00, moreInfoProductTagType10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(53);
    }

    public static MoreInfoProductTagType valueOf(String str) {
        return (MoreInfoProductTagType) Enum.valueOf(MoreInfoProductTagType.class, str);
    }

    public static MoreInfoProductTagType[] values() {
        return (MoreInfoProductTagType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MoreInfoProductTagType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
