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
public final class XDTTextPostAppAccountPrivacyOptions implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XDTTextPostAppAccountPrivacyOptions[] A03;
    public static final XDTTextPostAppAccountPrivacyOptions A04;
    public static final XDTTextPostAppAccountPrivacyOptions A05;
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
        XDTTextPostAppAccountPrivacyOptions xDTTextPostAppAccountPrivacyOptions = new XDTTextPostAppAccountPrivacyOptions("UNRECOGNIZED", 0, "XDTTextPostAppAccountPrivacyOptions_unspecified");
        A05 = xDTTextPostAppAccountPrivacyOptions;
        XDTTextPostAppAccountPrivacyOptions xDTTextPostAppAccountPrivacyOptions2 = new XDTTextPostAppAccountPrivacyOptions("PRIVATE", 1, "PRIVATE");
        A04 = xDTTextPostAppAccountPrivacyOptions2;
        XDTTextPostAppAccountPrivacyOptions[] xDTTextPostAppAccountPrivacyOptionsArr = {xDTTextPostAppAccountPrivacyOptions, xDTTextPostAppAccountPrivacyOptions2, new XDTTextPostAppAccountPrivacyOptions("PUBLIC", 2, "PUBLIC")};
        A03 = xDTTextPostAppAccountPrivacyOptionsArr;
        A02 = AbstractC12190kN.A00(xDTTextPostAppAccountPrivacyOptionsArr);
        XDTTextPostAppAccountPrivacyOptions[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (XDTTextPostAppAccountPrivacyOptions xDTTextPostAppAccountPrivacyOptions3 : values) {
            linkedHashMap.put(xDTTextPostAppAccountPrivacyOptions3.A00, xDTTextPostAppAccountPrivacyOptions3);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(40);
    }

    public static XDTTextPostAppAccountPrivacyOptions valueOf(String str) {
        return (XDTTextPostAppAccountPrivacyOptions) Enum.valueOf(XDTTextPostAppAccountPrivacyOptions.class, str);
    }

    public static XDTTextPostAppAccountPrivacyOptions[] values() {
        return (XDTTextPostAppAccountPrivacyOptions[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XDTTextPostAppAccountPrivacyOptions(String str, int i, String str2) {
        this.A00 = str2;
    }
}
