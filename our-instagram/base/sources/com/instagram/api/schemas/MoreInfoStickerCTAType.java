package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MoreInfoStickerCTAType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MoreInfoStickerCTAType[] A03;
    public static final MoreInfoStickerCTAType A04;
    public static final MoreInfoStickerCTAType A05;
    public static final MoreInfoStickerCTAType A06;
    public static final MoreInfoStickerCTAType A07;
    public static final MoreInfoStickerCTAType A08;
    public static final MoreInfoStickerCTAType A09;
    public static final MoreInfoStickerCTAType A0A;
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
        MoreInfoStickerCTAType moreInfoStickerCTAType = new MoreInfoStickerCTAType("UNRECOGNIZED", 0, "MoreInfoStickerCTAType_unspecified");
        A09 = moreInfoStickerCTAType;
        MoreInfoStickerCTAType moreInfoStickerCTAType2 = new MoreInfoStickerCTAType("CHIP", 1, "chip");
        A04 = moreInfoStickerCTAType2;
        MoreInfoStickerCTAType moreInfoStickerCTAType3 = new MoreInfoStickerCTAType("EXPANDED", 2, BaseViewManager.STATE_EXPANDED);
        A05 = moreInfoStickerCTAType3;
        MoreInfoStickerCTAType moreInfoStickerCTAType4 = new MoreInfoStickerCTAType("ONE_LINE", 3, "one_line");
        A06 = moreInfoStickerCTAType4;
        MoreInfoStickerCTAType moreInfoStickerCTAType5 = new MoreInfoStickerCTAType("ONE_LINE_RESIZABLE", 4, "one_line_resizable");
        A07 = moreInfoStickerCTAType5;
        MoreInfoStickerCTAType moreInfoStickerCTAType6 = new MoreInfoStickerCTAType("TWO_LINE", 5, "two_line");
        A08 = moreInfoStickerCTAType6;
        MoreInfoStickerCTAType moreInfoStickerCTAType7 = new MoreInfoStickerCTAType("WIDE_CTA", 6, "wide_cta");
        A0A = moreInfoStickerCTAType7;
        MoreInfoStickerCTAType[] moreInfoStickerCTATypeArr = {moreInfoStickerCTAType, moreInfoStickerCTAType2, moreInfoStickerCTAType3, moreInfoStickerCTAType4, moreInfoStickerCTAType5, moreInfoStickerCTAType6, moreInfoStickerCTAType7};
        A03 = moreInfoStickerCTATypeArr;
        A02 = AbstractC12190kN.A00(moreInfoStickerCTATypeArr);
        MoreInfoStickerCTAType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MoreInfoStickerCTAType moreInfoStickerCTAType8 : values) {
            linkedHashMap.put(moreInfoStickerCTAType8.A00, moreInfoStickerCTAType8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(55);
    }

    public static MoreInfoStickerCTAType valueOf(String str) {
        return (MoreInfoStickerCTAType) Enum.valueOf(MoreInfoStickerCTAType.class, str);
    }

    public static MoreInfoStickerCTAType[] values() {
        return (MoreInfoStickerCTAType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MoreInfoStickerCTAType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
