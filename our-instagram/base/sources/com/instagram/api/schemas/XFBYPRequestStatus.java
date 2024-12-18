package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class XFBYPRequestStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBYPRequestStatus[] A03;
    public static final XFBYPRequestStatus A04;
    public static final XFBYPRequestStatus A05;
    public static final XFBYPRequestStatus A06;
    public static final XFBYPRequestStatus A07;
    public static final XFBYPRequestStatus A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XFBYPRequestStatus xFBYPRequestStatus = new XFBYPRequestStatus("UNRECOGNIZED", 0, "XFBYPRequestStatus_unspecified");
        A08 = xFBYPRequestStatus;
        XFBYPRequestStatus xFBYPRequestStatus2 = new XFBYPRequestStatus("ACCEPTED", 1, "ACCEPTED");
        A04 = xFBYPRequestStatus2;
        XFBYPRequestStatus xFBYPRequestStatus3 = new XFBYPRequestStatus("CANCELED", 2, "CANCELED");
        A05 = xFBYPRequestStatus3;
        XFBYPRequestStatus xFBYPRequestStatus4 = new XFBYPRequestStatus("PENDING", 3, "PENDING");
        A06 = xFBYPRequestStatus4;
        XFBYPRequestStatus xFBYPRequestStatus5 = new XFBYPRequestStatus("REJECTED", 4, "REJECTED");
        A07 = xFBYPRequestStatus5;
        XFBYPRequestStatus[] xFBYPRequestStatusArr = {xFBYPRequestStatus, xFBYPRequestStatus2, xFBYPRequestStatus3, xFBYPRequestStatus4, xFBYPRequestStatus5};
        A03 = xFBYPRequestStatusArr;
        A02 = AbstractC12190kN.A00(xFBYPRequestStatusArr);
        XFBYPRequestStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XFBYPRequestStatus xFBYPRequestStatus6 : values) {
            A18.put(xFBYPRequestStatus6.A00, xFBYPRequestStatus6);
        }
        A01 = A18;
        CREATOR = new C41857IgB(99);
    }

    public static XFBYPRequestStatus valueOf(String str) {
        return (XFBYPRequestStatus) Enum.valueOf(XFBYPRequestStatus.class, str);
    }

    public static XFBYPRequestStatus[] values() {
        return (XFBYPRequestStatus[]) A03.clone();
    }

    public XFBYPRequestStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
