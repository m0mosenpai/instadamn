package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ConfirmationTitleStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ConfirmationTitleStyle[] A03;
    public static final ConfirmationTitleStyle A04;
    public static final ConfirmationTitleStyle A05;
    public static final ConfirmationTitleStyle A06;
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
        ConfirmationTitleStyle confirmationTitleStyle = new ConfirmationTitleStyle("UNRECOGNIZED", 0, "ConfirmationTitleStyle_unspecified");
        A06 = confirmationTitleStyle;
        ConfirmationTitleStyle confirmationTitleStyle2 = new ConfirmationTitleStyle("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = confirmationTitleStyle2;
        ConfirmationTitleStyle confirmationTitleStyle3 = new ConfirmationTitleStyle("LARGE_LEFT", 2, "large_left");
        A05 = confirmationTitleStyle3;
        ConfirmationTitleStyle[] confirmationTitleStyleArr = {confirmationTitleStyle, confirmationTitleStyle2, confirmationTitleStyle3};
        A03 = confirmationTitleStyleArr;
        A02 = AbstractC12190kN.A00(confirmationTitleStyleArr);
        ConfirmationTitleStyle[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ConfirmationTitleStyle confirmationTitleStyle4 : values) {
            linkedHashMap.put(confirmationTitleStyle4.A00, confirmationTitleStyle4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(78);
    }

    public static ConfirmationTitleStyle valueOf(String str) {
        return (ConfirmationTitleStyle) Enum.valueOf(ConfirmationTitleStyle.class, str);
    }

    public static ConfirmationTitleStyle[] values() {
        return (ConfirmationTitleStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ConfirmationTitleStyle(String str, int i, String str2) {
        this.A00 = str2;
    }
}
