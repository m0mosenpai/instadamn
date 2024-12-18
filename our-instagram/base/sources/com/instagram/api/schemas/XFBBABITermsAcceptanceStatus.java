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
/* loaded from: classes7.dex */
public final class XFBBABITermsAcceptanceStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBBABITermsAcceptanceStatus[] A03;
    public static final XFBBABITermsAcceptanceStatus A04;
    public static final XFBBABITermsAcceptanceStatus A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XFBBABITermsAcceptanceStatus xFBBABITermsAcceptanceStatus = new XFBBABITermsAcceptanceStatus("UNRECOGNIZED", 0, "XFBBABITermsAcceptanceStatus_unspecified");
        A05 = xFBBABITermsAcceptanceStatus;
        XFBBABITermsAcceptanceStatus xFBBABITermsAcceptanceStatus2 = new XFBBABITermsAcceptanceStatus("ACCEPTED", 1, "ACCEPTED");
        A04 = xFBBABITermsAcceptanceStatus2;
        XFBBABITermsAcceptanceStatus[] xFBBABITermsAcceptanceStatusArr = {xFBBABITermsAcceptanceStatus, xFBBABITermsAcceptanceStatus2, new XFBBABITermsAcceptanceStatus("DECLINED", 2, "DECLINED")};
        A03 = xFBBABITermsAcceptanceStatusArr;
        A02 = AbstractC12190kN.A00(xFBBABITermsAcceptanceStatusArr);
        XFBBABITermsAcceptanceStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XFBBABITermsAcceptanceStatus xFBBABITermsAcceptanceStatus3 : values) {
            A18.put(xFBBABITermsAcceptanceStatus3.A00, xFBBABITermsAcceptanceStatus3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(94);
    }

    public static XFBBABITermsAcceptanceStatus valueOf(String str) {
        return (XFBBABITermsAcceptanceStatus) Enum.valueOf(XFBBABITermsAcceptanceStatus.class, str);
    }

    public static XFBBABITermsAcceptanceStatus[] values() {
        return (XFBBABITermsAcceptanceStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XFBBABITermsAcceptanceStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
