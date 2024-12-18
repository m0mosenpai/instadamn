package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class BudgetRecommendationType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BudgetRecommendationType[] A03;
    public static final BudgetRecommendationType A04;
    public static final BudgetRecommendationType A05;
    public static final BudgetRecommendationType A06;
    public static final BudgetRecommendationType A07;
    public static final BudgetRecommendationType A08;
    public static final BudgetRecommendationType A09;
    public static final BudgetRecommendationType A0A;
    public static final BudgetRecommendationType A0B;
    public static final BudgetRecommendationType A0C;
    public static final BudgetRecommendationType A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BudgetRecommendationType budgetRecommendationType = new BudgetRecommendationType("UNRECOGNIZED", 0, "BudgetRecommendationType_unspecified");
        A0B = budgetRecommendationType;
        BudgetRecommendationType budgetRecommendationType2 = new BudgetRecommendationType("LOW_OUTCOME_BUDGET_WARNING", 1, "LOW_OUTCOME_BUDGET_WARNING");
        A04 = budgetRecommendationType2;
        BudgetRecommendationType budgetRecommendationType3 = new BudgetRecommendationType("MIN_CPC_SUGGESTION", 2, "MIN_CPC_SUGGESTION");
        A05 = budgetRecommendationType3;
        BudgetRecommendationType budgetRecommendationType4 = new BudgetRecommendationType("NO_CONVERSION_WARNING", 3, "NO_CONVERSION_WARNING");
        A06 = budgetRecommendationType4;
        BudgetRecommendationType budgetRecommendationType5 = new BudgetRecommendationType("RECOMMENDED_DEFAULT_BUDGET_CPA_BASED", 4, "RECOMMENDED_DEFAULT_BUDGET_CPA_BASED");
        A07 = budgetRecommendationType5;
        BudgetRecommendationType budgetRecommendationType6 = new BudgetRecommendationType("RECOMMENDED_DEFAULT_BUDGET_LEAD_GEN", 5, "RECOMMENDED_DEFAULT_BUDGET_LEAD_GEN");
        A08 = budgetRecommendationType6;
        BudgetRecommendationType budgetRecommendationType7 = new BudgetRecommendationType("RECOMMENDED_DEFAULT_BUDGET_PPP_BASED", 6, "RECOMMENDED_DEFAULT_BUDGET_PPP_BASED");
        A09 = budgetRecommendationType7;
        BudgetRecommendationType budgetRecommendationType8 = new BudgetRecommendationType("SIMILAR_ADVERTISER_BUDGET_RECOMMENDATION", 7, "SIMILAR_ADVERTISER_BUDGET_RECOMMENDATION");
        A0A = budgetRecommendationType8;
        BudgetRecommendationType budgetRecommendationType9 = new BudgetRecommendationType("ZERO_OUTCOME_BUDGET_WARNING", 8, "ZERO_OUTCOME_BUDGET_WARNING");
        A0C = budgetRecommendationType9;
        BudgetRecommendationType budgetRecommendationType10 = new BudgetRecommendationType("ZERO_OUTCOME_BUDGET_WARNING_TEST1", 9, "ZERO_OUTCOME_BUDGET_WARNING_TEST1");
        A0D = budgetRecommendationType10;
        BudgetRecommendationType[] budgetRecommendationTypeArr = {budgetRecommendationType, budgetRecommendationType2, budgetRecommendationType3, budgetRecommendationType4, budgetRecommendationType5, budgetRecommendationType6, budgetRecommendationType7, budgetRecommendationType8, budgetRecommendationType9, budgetRecommendationType10, new BudgetRecommendationType("ZERO_OUTCOME_BUDGET_WARNING_TEST2", 10, "ZERO_OUTCOME_BUDGET_WARNING_TEST2")};
        A03 = budgetRecommendationTypeArr;
        A02 = AbstractC12190kN.A00(budgetRecommendationTypeArr);
        BudgetRecommendationType[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (BudgetRecommendationType budgetRecommendationType11 : values) {
            linkedHashMap.put(budgetRecommendationType11.A00, budgetRecommendationType11);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(81);
    }

    public static BudgetRecommendationType valueOf(String str) {
        return (BudgetRecommendationType) Enum.valueOf(BudgetRecommendationType.class, str);
    }

    public static BudgetRecommendationType[] values() {
        return (BudgetRecommendationType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BudgetRecommendationType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
