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
public final class XFBFXIGPCEntryPoint implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBFXIGPCEntryPoint[] A03;
    public static final XFBFXIGPCEntryPoint A04;
    public static final XFBFXIGPCEntryPoint A05;
    public static final XFBFXIGPCEntryPoint A06;
    public static final XFBFXIGPCEntryPoint A07;
    public static final XFBFXIGPCEntryPoint A08;
    public static final XFBFXIGPCEntryPoint A09;
    public static final XFBFXIGPCEntryPoint A0A;
    public static final XFBFXIGPCEntryPoint A0B;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = new XFBFXIGPCEntryPoint("UNRECOGNIZED", 0, "XFBFXIGPCEntryPoint_unspecified");
        A0B = xFBFXIGPCEntryPoint;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint2 = new XFBFXIGPCEntryPoint("BLOCKING_INTERSTITIAL", 1, "BLOCKING_INTERSTITIAL");
        A04 = xFBFXIGPCEntryPoint2;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint3 = new XFBFXIGPCEntryPoint("FORCED_DEPRECATION", 2, "FORCED_DEPRECATION");
        A05 = xFBFXIGPCEntryPoint3;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint4 = new XFBFXIGPCEntryPoint("LOGIN_INFO", 3, "LOGIN_INFO");
        A06 = xFBFXIGPCEntryPoint4;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint5 = new XFBFXIGPCEntryPoint("LOGIN_MAINFEED_QP", 4, "LOGIN_MAINFEED_QP");
        A07 = xFBFXIGPCEntryPoint5;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint6 = new XFBFXIGPCEntryPoint("LOGIN_NOTIFICATION", 5, "LOGIN_NOTIFICATION");
        A08 = xFBFXIGPCEntryPoint6;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint7 = new XFBFXIGPCEntryPoint("SWITCHER_MAINFEED_QP", 6, "SWITCHER_MAINFEED_QP");
        A09 = xFBFXIGPCEntryPoint7;
        XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint8 = new XFBFXIGPCEntryPoint("SWITCHER_NOTIFICATION", 7, "SWITCHER_NOTIFICATION");
        A0A = xFBFXIGPCEntryPoint8;
        XFBFXIGPCEntryPoint[] xFBFXIGPCEntryPointArr = {xFBFXIGPCEntryPoint, xFBFXIGPCEntryPoint2, xFBFXIGPCEntryPoint3, xFBFXIGPCEntryPoint4, xFBFXIGPCEntryPoint5, xFBFXIGPCEntryPoint6, xFBFXIGPCEntryPoint7, xFBFXIGPCEntryPoint8};
        A03 = xFBFXIGPCEntryPointArr;
        A02 = AbstractC12190kN.A00(xFBFXIGPCEntryPointArr);
        XFBFXIGPCEntryPoint[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint9 : values) {
            A18.put(xFBFXIGPCEntryPoint9.A00, xFBFXIGPCEntryPoint9);
        }
        A01 = A18;
        CREATOR = new C41857IgB(96);
    }

    public static XFBFXIGPCEntryPoint valueOf(String str) {
        return (XFBFXIGPCEntryPoint) Enum.valueOf(XFBFXIGPCEntryPoint.class, str);
    }

    public static XFBFXIGPCEntryPoint[] values() {
        return (XFBFXIGPCEntryPoint[]) A03.clone();
    }

    public XFBFXIGPCEntryPoint(String str, int i, String str2) {
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
