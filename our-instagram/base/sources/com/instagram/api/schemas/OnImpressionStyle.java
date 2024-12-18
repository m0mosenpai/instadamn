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
public final class OnImpressionStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ OnImpressionStyle[] A03;
    public static final OnImpressionStyle A04;
    public static final OnImpressionStyle A05;
    public static final OnImpressionStyle A06;
    public static final OnImpressionStyle A07;
    public static final OnImpressionStyle A08;
    public static final OnImpressionStyle A09;
    public static final OnImpressionStyle A0A;
    public static final OnImpressionStyle A0B;
    public static final OnImpressionStyle A0C;
    public static final OnImpressionStyle A0D;
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
        OnImpressionStyle onImpressionStyle = new OnImpressionStyle("UNRECOGNIZED", 0, "OnImpressionStyle_unspecified");
        A0D = onImpressionStyle;
        OnImpressionStyle onImpressionStyle2 = new OnImpressionStyle("DUAL_BINARY", 1, "dual_binary");
        A04 = onImpressionStyle2;
        OnImpressionStyle onImpressionStyle3 = new OnImpressionStyle("DUAL_CTA", 2, "dual_cta");
        A05 = onImpressionStyle3;
        OnImpressionStyle onImpressionStyle4 = new OnImpressionStyle("DUAL_HAIRLINE", 3, "dual_hairline");
        A06 = onImpressionStyle4;
        OnImpressionStyle onImpressionStyle5 = new OnImpressionStyle("DUAL_HAIRLINE_QUESTION", 4, "dual_hairline_question");
        A07 = onImpressionStyle5;
        OnImpressionStyle onImpressionStyle6 = new OnImpressionStyle("MINIMAL", 5, "minimal");
        A08 = onImpressionStyle6;
        OnImpressionStyle onImpressionStyle7 = new OnImpressionStyle("NEGATIVE_CTA", 6, "negative_cta");
        A09 = onImpressionStyle7;
        OnImpressionStyle onImpressionStyle8 = new OnImpressionStyle("NEGATIVE_HAIRLINE", 7, "negative_hairline");
        A0A = onImpressionStyle8;
        OnImpressionStyle onImpressionStyle9 = new OnImpressionStyle("UNIFIED", 8, "unified");
        A0B = onImpressionStyle9;
        OnImpressionStyle onImpressionStyle10 = new OnImpressionStyle("UNIFIED_NO_SUBTEXT", 9, "unified_no_subtext");
        A0C = onImpressionStyle10;
        OnImpressionStyle[] onImpressionStyleArr = {onImpressionStyle, onImpressionStyle2, onImpressionStyle3, onImpressionStyle4, onImpressionStyle5, onImpressionStyle6, onImpressionStyle7, onImpressionStyle8, onImpressionStyle9, onImpressionStyle10};
        A03 = onImpressionStyleArr;
        A02 = AbstractC12190kN.A00(onImpressionStyleArr);
        OnImpressionStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (OnImpressionStyle onImpressionStyle11 : values) {
            linkedHashMap.put(onImpressionStyle11.A00, onImpressionStyle11);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(69);
    }

    public static OnImpressionStyle valueOf(String str) {
        return (OnImpressionStyle) Enum.valueOf(OnImpressionStyle.class, str);
    }

    public static OnImpressionStyle[] values() {
        return (OnImpressionStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public OnImpressionStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
