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
public final class XFBTargetingAutomationAdvantageAudienceStatus implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ XFBTargetingAutomationAdvantageAudienceStatus[] A03;
    public static final XFBTargetingAutomationAdvantageAudienceStatus A04;
    public static final XFBTargetingAutomationAdvantageAudienceStatus A05;
    public static final XFBTargetingAutomationAdvantageAudienceStatus A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus = new XFBTargetingAutomationAdvantageAudienceStatus("UNRECOGNIZED", 0, "XFBTargetingAutomationAdvantageAudienceStatus_unspecified");
        A06 = xFBTargetingAutomationAdvantageAudienceStatus;
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus2 = new XFBTargetingAutomationAdvantageAudienceStatus("OFF", 1, "OFF");
        A04 = xFBTargetingAutomationAdvantageAudienceStatus2;
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus3 = new XFBTargetingAutomationAdvantageAudienceStatus("ON", 2, "ON");
        A05 = xFBTargetingAutomationAdvantageAudienceStatus3;
        XFBTargetingAutomationAdvantageAudienceStatus[] xFBTargetingAutomationAdvantageAudienceStatusArr = {xFBTargetingAutomationAdvantageAudienceStatus, xFBTargetingAutomationAdvantageAudienceStatus2, xFBTargetingAutomationAdvantageAudienceStatus3};
        A03 = xFBTargetingAutomationAdvantageAudienceStatusArr;
        A02 = AbstractC12190kN.A00(xFBTargetingAutomationAdvantageAudienceStatusArr);
        XFBTargetingAutomationAdvantageAudienceStatus[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus4 : values) {
            A18.put(xFBTargetingAutomationAdvantageAudienceStatus4.A00, xFBTargetingAutomationAdvantageAudienceStatus4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(98);
    }

    public static XFBTargetingAutomationAdvantageAudienceStatus valueOf(String str) {
        return (XFBTargetingAutomationAdvantageAudienceStatus) Enum.valueOf(XFBTargetingAutomationAdvantageAudienceStatus.class, str);
    }

    public static XFBTargetingAutomationAdvantageAudienceStatus[] values() {
        return (XFBTargetingAutomationAdvantageAudienceStatus[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public XFBTargetingAutomationAdvantageAudienceStatus(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
