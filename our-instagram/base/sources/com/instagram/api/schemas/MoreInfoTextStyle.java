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
/* loaded from: classes2.dex */
public final class MoreInfoTextStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MoreInfoTextStyle[] A03;
    public static final MoreInfoTextStyle A04;
    public static final MoreInfoTextStyle A05;
    public static final MoreInfoTextStyle A06;
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
        MoreInfoTextStyle moreInfoTextStyle = new MoreInfoTextStyle("UNRECOGNIZED", 0, "MoreInfoTextStyle_unspecified");
        A05 = moreInfoTextStyle;
        MoreInfoTextStyle moreInfoTextStyle2 = new MoreInfoTextStyle("NO_USERNAME_NO_COUNT", 1, "no_username_no_count");
        A04 = moreInfoTextStyle2;
        MoreInfoTextStyle moreInfoTextStyle3 = new MoreInfoTextStyle("USERNAME_ONLY", 2, "username_only");
        A06 = moreInfoTextStyle3;
        MoreInfoTextStyle[] moreInfoTextStyleArr = {moreInfoTextStyle, moreInfoTextStyle2, moreInfoTextStyle3, new MoreInfoTextStyle("USERNAME_WITH_COUNT", 3, "username_with_count")};
        A03 = moreInfoTextStyleArr;
        A02 = AbstractC12190kN.A00(moreInfoTextStyleArr);
        MoreInfoTextStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MoreInfoTextStyle moreInfoTextStyle4 : values) {
            linkedHashMap.put(moreInfoTextStyle4.A00, moreInfoTextStyle4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(56);
    }

    public static MoreInfoTextStyle valueOf(String str) {
        return (MoreInfoTextStyle) Enum.valueOf(MoreInfoTextStyle.class, str);
    }

    public static MoreInfoTextStyle[] values() {
        return (MoreInfoTextStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MoreInfoTextStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
