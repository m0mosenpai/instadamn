package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class XDTTextAppQuoteAttachmentEligibility implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XDTTextAppQuoteAttachmentEligibility[] A03;
    public static final XDTTextAppQuoteAttachmentEligibility A04;
    public static final XDTTextAppQuoteAttachmentEligibility A05;
    public static final XDTTextAppQuoteAttachmentEligibility A06;
    public static final XDTTextAppQuoteAttachmentEligibility A07;
    public static final XDTTextAppQuoteAttachmentEligibility A08;
    public static final XDTTextAppQuoteAttachmentEligibility A09;
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
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility = new XDTTextAppQuoteAttachmentEligibility("UNRECOGNIZED", 0, "XDTTextAppQuoteAttachmentEligibility_unspecified");
        A09 = xDTTextAppQuoteAttachmentEligibility;
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility2 = new XDTTextAppQuoteAttachmentEligibility("ALLOWED", 1, "allowed");
        A04 = xDTTextAppQuoteAttachmentEligibility2;
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility3 = new XDTTextAppQuoteAttachmentEligibility("ATTACHMENT_NOT_SUPPORTED", 2, "attachment_not_supported");
        A05 = xDTTextAppQuoteAttachmentEligibility3;
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility4 = new XDTTextAppQuoteAttachmentEligibility("AUTHOR_LIMITED_QUOTE", 3, "author_limited_quote");
        A06 = xDTTextAppQuoteAttachmentEligibility4;
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility5 = new XDTTextAppQuoteAttachmentEligibility("CAROUSEL_NOT_ALLOWED", 4, "carousel_not_allowed");
        A07 = xDTTextAppQuoteAttachmentEligibility5;
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility6 = new XDTTextAppQuoteAttachmentEligibility("NOT_APPLICABLE", 5, "not_applicable");
        A08 = xDTTextAppQuoteAttachmentEligibility6;
        XDTTextAppQuoteAttachmentEligibility[] xDTTextAppQuoteAttachmentEligibilityArr = {xDTTextAppQuoteAttachmentEligibility, xDTTextAppQuoteAttachmentEligibility2, xDTTextAppQuoteAttachmentEligibility3, xDTTextAppQuoteAttachmentEligibility4, xDTTextAppQuoteAttachmentEligibility5, xDTTextAppQuoteAttachmentEligibility6};
        A03 = xDTTextAppQuoteAttachmentEligibilityArr;
        A02 = AbstractC12190kN.A00(xDTTextAppQuoteAttachmentEligibilityArr);
        XDTTextAppQuoteAttachmentEligibility[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility7 : values) {
            linkedHashMap.put(xDTTextAppQuoteAttachmentEligibility7.A00, xDTTextAppQuoteAttachmentEligibility7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(39);
    }

    public static XDTTextAppQuoteAttachmentEligibility valueOf(String str) {
        return (XDTTextAppQuoteAttachmentEligibility) Enum.valueOf(XDTTextAppQuoteAttachmentEligibility.class, str);
    }

    public static XDTTextAppQuoteAttachmentEligibility[] values() {
        return (XDTTextAppQuoteAttachmentEligibility[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XDTTextAppQuoteAttachmentEligibility(String str, int i, String str2) {
        this.A00 = str2;
    }
}
