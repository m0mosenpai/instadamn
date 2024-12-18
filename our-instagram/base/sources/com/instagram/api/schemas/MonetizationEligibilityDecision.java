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
public final class MonetizationEligibilityDecision implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MonetizationEligibilityDecision[] A03;
    public static final MonetizationEligibilityDecision A04;
    public static final MonetizationEligibilityDecision A05;
    public static final MonetizationEligibilityDecision A06;
    public static final MonetizationEligibilityDecision A07;
    public static final MonetizationEligibilityDecision A08;
    public static final MonetizationEligibilityDecision A09;
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
        MonetizationEligibilityDecision monetizationEligibilityDecision = new MonetizationEligibilityDecision("UNRECOGNIZED", 0, "MonetizationEligibilityDecision_unspecified");
        A09 = monetizationEligibilityDecision;
        MonetizationEligibilityDecision monetizationEligibilityDecision2 = new MonetizationEligibilityDecision("AT_RISK_OF_BECOMING_INELIGIBLE", 1, "at_risk_of_becoming_ineligible");
        A04 = monetizationEligibilityDecision2;
        MonetizationEligibilityDecision monetizationEligibilityDecision3 = new MonetizationEligibilityDecision("ELIGIBLE", 2, "eligible");
        A05 = monetizationEligibilityDecision3;
        MonetizationEligibilityDecision monetizationEligibilityDecision4 = new MonetizationEligibilityDecision("ELIGIBLE_PENDING_OPT_IN", 3, "eligible_pending_opt_in");
        A06 = monetizationEligibilityDecision4;
        MonetizationEligibilityDecision monetizationEligibilityDecision5 = new MonetizationEligibilityDecision("NOT_ELIGIBLE", 4, "not_eligible");
        A07 = monetizationEligibilityDecision5;
        MonetizationEligibilityDecision monetizationEligibilityDecision6 = new MonetizationEligibilityDecision("NOT_PAYOUTS_ELIGIBLE", 5, "not_payouts_eligible");
        A08 = monetizationEligibilityDecision6;
        MonetizationEligibilityDecision[] monetizationEligibilityDecisionArr = {monetizationEligibilityDecision, monetizationEligibilityDecision2, monetizationEligibilityDecision3, monetizationEligibilityDecision4, monetizationEligibilityDecision5, monetizationEligibilityDecision6, new MonetizationEligibilityDecision("TEMPORARILY_INELIGIBLE", 6, "temporarily_ineligible")};
        A03 = monetizationEligibilityDecisionArr;
        A02 = AbstractC12190kN.A00(monetizationEligibilityDecisionArr);
        MonetizationEligibilityDecision[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MonetizationEligibilityDecision monetizationEligibilityDecision7 : values) {
            linkedHashMap.put(monetizationEligibilityDecision7.A00, monetizationEligibilityDecision7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(50);
    }

    public static MonetizationEligibilityDecision valueOf(String str) {
        return (MonetizationEligibilityDecision) Enum.valueOf(MonetizationEligibilityDecision.class, str);
    }

    public static MonetizationEligibilityDecision[] values() {
        return (MonetizationEligibilityDecision[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MonetizationEligibilityDecision(String str, int i, String str2) {
        this.A00 = str2;
    }
}
