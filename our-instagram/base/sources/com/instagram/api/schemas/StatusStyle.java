package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StatusStyle implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StatusStyle[] A03;
    public static final StatusStyle A04;
    public static final StatusStyle A05;
    public static final StatusStyle A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StatusStyle statusStyle = new StatusStyle("UNRECOGNIZED", 0, "StatusStyle_unspecified");
        A06 = statusStyle;
        StatusStyle statusStyle2 = new StatusStyle("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = statusStyle2;
        StatusStyle statusStyle3 = new StatusStyle("LOCATION", 2, "location");
        A05 = statusStyle3;
        StatusStyle[] statusStyleArr = {statusStyle, statusStyle2, statusStyle3, new StatusStyle("MUSIC", 3, "music")};
        A03 = statusStyleArr;
        A02 = AbstractC12190kN.A00(statusStyleArr);
        StatusStyle[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (StatusStyle statusStyle4 : values) {
            A18.put(statusStyle4.A00, statusStyle4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(8);
    }

    public static StatusStyle valueOf(String str) {
        return (StatusStyle) Enum.valueOf(StatusStyle.class, str);
    }

    public static StatusStyle[] values() {
        return (StatusStyle[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StatusStyle(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
