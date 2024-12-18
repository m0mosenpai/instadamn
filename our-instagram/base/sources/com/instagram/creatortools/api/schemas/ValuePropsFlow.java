package com.instagram.creatortools.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.LNM;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ValuePropsFlow implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ValuePropsFlow[] A03;
    public static final ValuePropsFlow A04;
    public static final ValuePropsFlow A05;
    public static final ValuePropsFlow A06;
    public static final ValuePropsFlow A07;
    public static final ValuePropsFlow A08;
    public static final ValuePropsFlow A09;
    public static final ValuePropsFlow A0A;
    public static final ValuePropsFlow A0B;
    public static final ValuePropsFlow A0C;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ValuePropsFlow valuePropsFlow = new ValuePropsFlow("UNRECOGNIZED", 0, "ValuePropsFlow_unspecified");
        A0C = valuePropsFlow;
        ValuePropsFlow valuePropsFlow2 = new ValuePropsFlow("PRODUCTS", 1, "products");
        A0A = valuePropsFlow2;
        ValuePropsFlow valuePropsFlow3 = new ValuePropsFlow("INSIGHTS", 2, "insights");
        A08 = valuePropsFlow3;
        ValuePropsFlow valuePropsFlow4 = new ValuePropsFlow("ACCOUNTS", 3, "accounts");
        A04 = valuePropsFlow4;
        ValuePropsFlow valuePropsFlow5 = new ValuePropsFlow("INSPIRATION", 4, "inspiration");
        A09 = valuePropsFlow5;
        ValuePropsFlow valuePropsFlow6 = new ValuePropsFlow("BONUSES", 5, "incentive_platform");
        A06 = valuePropsFlow6;
        ValuePropsFlow valuePropsFlow7 = new ValuePropsFlow("SUBSCRIPTION", 6, "fan_club_creator");
        A0B = valuePropsFlow7;
        ValuePropsFlow valuePropsFlow8 = new ValuePropsFlow("BADGES", 7, "badges_incentives");
        A05 = valuePropsFlow8;
        ValuePropsFlow valuePropsFlow9 = new ValuePropsFlow("CREATOR_MARKETPLACE", 8, "branded_content_deal_creator");
        A07 = valuePropsFlow9;
        ValuePropsFlow[] valuePropsFlowArr = {valuePropsFlow, valuePropsFlow2, valuePropsFlow3, valuePropsFlow4, valuePropsFlow5, valuePropsFlow6, valuePropsFlow7, valuePropsFlow8, valuePropsFlow9, new ValuePropsFlow("USER_PAY", 9, "user_pay")};
        A03 = valuePropsFlowArr;
        A02 = AbstractC12190kN.A00(valuePropsFlowArr);
        ValuePropsFlow[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ValuePropsFlow valuePropsFlow10 : values) {
            A18.put(valuePropsFlow10.A00, valuePropsFlow10);
        }
        A01 = A18;
        CREATOR = new LNM(89);
    }

    public static ValuePropsFlow valueOf(String str) {
        return (ValuePropsFlow) Enum.valueOf(ValuePropsFlow.class, str);
    }

    public static ValuePropsFlow[] values() {
        return (ValuePropsFlow[]) A03.clone();
    }

    public ValuePropsFlow(String str, int i, String str2) {
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
