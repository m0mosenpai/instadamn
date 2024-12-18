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
public final class ConfirmationStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ConfirmationStyle[] A03;
    public static final ConfirmationStyle A04;
    public static final ConfirmationStyle A05;
    public static final ConfirmationStyle A06;
    public static final ConfirmationStyle A07;
    public static final ConfirmationStyle A08;
    public static final ConfirmationStyle A09;
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
        ConfirmationStyle confirmationStyle = new ConfirmationStyle("UNRECOGNIZED", 0, "ConfirmationStyle_unspecified");
        A09 = confirmationStyle;
        ConfirmationStyle confirmationStyle2 = new ConfirmationStyle("ACTION_SHEET", 1, "action_sheet");
        A04 = confirmationStyle2;
        ConfirmationStyle confirmationStyle3 = new ConfirmationStyle("BOTTOMSHEET", 2, "bottomsheet");
        A05 = confirmationStyle3;
        ConfirmationStyle confirmationStyle4 = new ConfirmationStyle("TOAST", 3, "toast");
        A06 = confirmationStyle4;
        ConfirmationStyle confirmationStyle5 = new ConfirmationStyle("TOMBSTONE_V1", 4, "tombstone_v1");
        A07 = confirmationStyle5;
        ConfirmationStyle confirmationStyle6 = new ConfirmationStyle("TOMBSTONE_V2", 5, "tombstone_v2");
        A08 = confirmationStyle6;
        ConfirmationStyle[] confirmationStyleArr = {confirmationStyle, confirmationStyle2, confirmationStyle3, confirmationStyle4, confirmationStyle5, confirmationStyle6};
        A03 = confirmationStyleArr;
        A02 = AbstractC12190kN.A00(confirmationStyleArr);
        ConfirmationStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ConfirmationStyle confirmationStyle7 : values) {
            linkedHashMap.put(confirmationStyle7.A00, confirmationStyle7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(77);
    }

    public static ConfirmationStyle valueOf(String str) {
        return (ConfirmationStyle) Enum.valueOf(ConfirmationStyle.class, str);
    }

    public static ConfirmationStyle[] values() {
        return (ConfirmationStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ConfirmationStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
