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
/* loaded from: classes3.dex */
public final class SuggestedUsersStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SuggestedUsersStyle[] A03;
    public static final SuggestedUsersStyle A04;
    public static final SuggestedUsersStyle A05;
    public static final SuggestedUsersStyle A06;
    public static final SuggestedUsersStyle A07;
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
        SuggestedUsersStyle suggestedUsersStyle = new SuggestedUsersStyle("UNRECOGNIZED", 0, "SuggestedUsersStyle_unspecified");
        A06 = suggestedUsersStyle;
        SuggestedUsersStyle suggestedUsersStyle2 = new SuggestedUsersStyle("EMBEDDED_WITH_CONTENT_THUMBNAIL", 1, "embedded_with_content_thumbnail");
        A04 = suggestedUsersStyle2;
        SuggestedUsersStyle suggestedUsersStyle3 = new SuggestedUsersStyle("NO_CONTENT_THUMBNAIL", 2, "no_content_thumbnail");
        A05 = suggestedUsersStyle3;
        SuggestedUsersStyle suggestedUsersStyle4 = new SuggestedUsersStyle("WITH_CONTENT_THUMBNAIL", 3, "with_content_thumbnail");
        A07 = suggestedUsersStyle4;
        SuggestedUsersStyle[] suggestedUsersStyleArr = {suggestedUsersStyle, suggestedUsersStyle2, suggestedUsersStyle3, suggestedUsersStyle4};
        A03 = suggestedUsersStyleArr;
        A02 = AbstractC12190kN.A00(suggestedUsersStyleArr);
        SuggestedUsersStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (SuggestedUsersStyle suggestedUsersStyle5 : values) {
            linkedHashMap.put(suggestedUsersStyle5.A00, suggestedUsersStyle5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(27);
    }

    public static SuggestedUsersStyle valueOf(String str) {
        return (SuggestedUsersStyle) Enum.valueOf(SuggestedUsersStyle.class, str);
    }

    public static SuggestedUsersStyle[] values() {
        return (SuggestedUsersStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public SuggestedUsersStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
