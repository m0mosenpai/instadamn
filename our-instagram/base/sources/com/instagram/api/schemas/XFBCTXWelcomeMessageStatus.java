package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class XFBCTXWelcomeMessageStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBCTXWelcomeMessageStatus[] A03;
    public static final XFBCTXWelcomeMessageStatus A04;
    public static final XFBCTXWelcomeMessageStatus A05;
    public static final XFBCTXWelcomeMessageStatus A06;
    public static final XFBCTXWelcomeMessageStatus A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus = new XFBCTXWelcomeMessageStatus("UNRECOGNIZED", 0, "XFBCTXWelcomeMessageStatus_unspecified");
        A06 = xFBCTXWelcomeMessageStatus;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus2 = new XFBCTXWelcomeMessageStatus("DEFAULT_WELCOME_MESSAGE_OPTED_IN", 1, "DEFAULT_WELCOME_MESSAGE_OPTED_IN");
        A04 = xFBCTXWelcomeMessageStatus2;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus3 = new XFBCTXWelcomeMessageStatus("DEFAULT_WELCOME_MESSAGE_OPTED_OUT", 2, "DEFAULT_WELCOME_MESSAGE_OPTED_OUT");
        A05 = xFBCTXWelcomeMessageStatus3;
        XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus4 = new XFBCTXWelcomeMessageStatus("WELCOME_MESSAGE_INELIGIBLE", 3, "WELCOME_MESSAGE_INELIGIBLE");
        A07 = xFBCTXWelcomeMessageStatus4;
        XFBCTXWelcomeMessageStatus[] xFBCTXWelcomeMessageStatusArr = {xFBCTXWelcomeMessageStatus, xFBCTXWelcomeMessageStatus2, xFBCTXWelcomeMessageStatus3, xFBCTXWelcomeMessageStatus4};
        A03 = xFBCTXWelcomeMessageStatusArr;
        A02 = AbstractC12190kN.A00(xFBCTXWelcomeMessageStatusArr);
        XFBCTXWelcomeMessageStatus[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus5 : values) {
            linkedHashMap.put(xFBCTXWelcomeMessageStatus5.A00, xFBCTXWelcomeMessageStatus5);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(95);
    }

    public static XFBCTXWelcomeMessageStatus valueOf(String str) {
        return (XFBCTXWelcomeMessageStatus) Enum.valueOf(XFBCTXWelcomeMessageStatus.class, str);
    }

    public static XFBCTXWelcomeMessageStatus[] values() {
        return (XFBCTXWelcomeMessageStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XFBCTXWelcomeMessageStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
