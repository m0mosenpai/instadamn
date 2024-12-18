package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PartnerProgramOnboardingSteps implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PartnerProgramOnboardingSteps[] A03;
    public static final PartnerProgramOnboardingSteps A04;
    public static final PartnerProgramOnboardingSteps A05;
    public static final PartnerProgramOnboardingSteps A06;
    public static final PartnerProgramOnboardingSteps A07;
    public static final PartnerProgramOnboardingSteps A08;
    public static final PartnerProgramOnboardingSteps A09;
    public static final PartnerProgramOnboardingSteps A0A;
    public static final PartnerProgramOnboardingSteps A0B;
    public static final PartnerProgramOnboardingSteps A0C;
    public static final PartnerProgramOnboardingSteps A0D;
    public static final PartnerProgramOnboardingSteps A0E;
    public static final PartnerProgramOnboardingSteps A0F;
    public static final PartnerProgramOnboardingSteps A0G;
    public static final PartnerProgramOnboardingSteps A0H;
    public static final PartnerProgramOnboardingSteps A0I;
    public static final PartnerProgramOnboardingSteps A0J;
    public static final PartnerProgramOnboardingSteps A0K;
    public static final PartnerProgramOnboardingSteps A0L;
    public static final PartnerProgramOnboardingSteps A0M;
    public static final PartnerProgramOnboardingSteps A0N;
    public static final PartnerProgramOnboardingSteps A0O;
    public static final PartnerProgramOnboardingSteps A0P;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps = new PartnerProgramOnboardingSteps("UNRECOGNIZED", 0, "PartnerProgramOnboardingSteps_unspecified");
        A0P = partnerProgramOnboardingSteps;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps2 = new PartnerProgramOnboardingSteps("ACCOUNT_REVIEW_PENDING", 1, "account_review_pending");
        A04 = partnerProgramOnboardingSteps2;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps3 = new PartnerProgramOnboardingSteps("AFFILIATE_CREATOR_PARTNERSHIP_MESSAGING_ONBOARDING", 2, "affiliate_creator_partnership_messaging_onboarding");
        A05 = partnerProgramOnboardingSteps3;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps4 = new PartnerProgramOnboardingSteps("BC_DEAL_BRAND_PARTNERSHIP_MESSAGES_SCREEN_SEEN", 3, "bc_deal_brand_partnership_messages_screen_seen");
        A06 = partnerProgramOnboardingSteps4;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps5 = new PartnerProgramOnboardingSteps("BC_DEAL_CREATOR_AUDIENCE_INTERESTS_SCREEN_SEEN", 4, "bc_deal_creator_audience_interests_screen_seen");
        A07 = partnerProgramOnboardingSteps5;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps6 = new PartnerProgramOnboardingSteps("BC_DEAL_CREATOR_PARTNERSHIP_MESSAGES_SCREEN_SEEN", 5, "bc_deal_creator_partnership_messages_screen_seen");
        A08 = partnerProgramOnboardingSteps6;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps7 = new PartnerProgramOnboardingSteps("BONUSES_UNAVAILABLE_SCREEN", 6, "bonuses_unavailable");
        A09 = partnerProgramOnboardingSteps7;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps8 = new PartnerProgramOnboardingSteps("BRANDED_CONTENT_DEAL_CREATOR_CONSENT_SCREEN", 7, "branded_content_deal_creator_consent_screen");
        A0A = partnerProgramOnboardingSteps8;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps9 = new PartnerProgramOnboardingSteps("BRANDED_CONTENT_DEAL_CREATOR_WISHLIST_SCREEN", 8, "branded_content_deal_creator_wishlist_screen");
        A0B = partnerProgramOnboardingSteps9;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps10 = new PartnerProgramOnboardingSteps("BRANDED_CONTENT_DEAL_ONBOARDING_COMPLETE_SCREEN", 9, "branded_content_deal_onboarding_complete_screen");
        A0C = partnerProgramOnboardingSteps10;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps11 = new PartnerProgramOnboardingSteps("CHECKLIST_SCREEN", 10, "checklist_screen");
        A0D = partnerProgramOnboardingSteps11;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps12 = new PartnerProgramOnboardingSteps("CONVERT_TO_PROFESSIONAL_SCREEN", 11, "convert_to_professional_screen");
        A0E = partnerProgramOnboardingSteps12;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps13 = new PartnerProgramOnboardingSteps("DEALS_ONBOARDING", 12, "deals_onboarding");
        A0F = partnerProgramOnboardingSteps13;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps14 = new PartnerProgramOnboardingSteps("DEFERRED_ONBOARDING_BASIC_INFO", 13, "deferred_onboarding_basic_info");
        A0G = partnerProgramOnboardingSteps14;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps15 = new PartnerProgramOnboardingSteps("DEFERRED_ONBOARDING_PAYOUTS", 14, "deferred_onboarding_payouts");
        A0H = partnerProgramOnboardingSteps15;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps16 = new PartnerProgramOnboardingSteps("FAN_CLUB_DETAILS", 15, "fan_club_details");
        A0I = partnerProgramOnboardingSteps16;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps17 = new PartnerProgramOnboardingSteps("FAN_CLUB_PRICING_LIST", 16, "fan_club_pricing_list");
        A0J = partnerProgramOnboardingSteps17;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps18 = new PartnerProgramOnboardingSteps("IGTV_ACCOUNT_LEVEL_MONETIZATION_TOGGLE", 17, "igtv_account_level_monetization_toggle");
        A0K = partnerProgramOnboardingSteps18;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps19 = new PartnerProgramOnboardingSteps("INCENTIVE_PROGRAM_DEALS_CONTRACT", 18, "incentive_program_deals_contract");
        A0L = partnerProgramOnboardingSteps19;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps20 = new PartnerProgramOnboardingSteps("PAYOUTS_ONBOARDING", 19, "payouts_onboarding");
        A0M = partnerProgramOnboardingSteps20;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps21 = new PartnerProgramOnboardingSteps("PREVIEW_SCREEN", 20, "preview_screen");
        A0N = partnerProgramOnboardingSteps21;
        PartnerProgramOnboardingSteps partnerProgramOnboardingSteps22 = new PartnerProgramOnboardingSteps("TERMS_AND_CONDITIONS", 21, "terms_and_conditions");
        A0O = partnerProgramOnboardingSteps22;
        PartnerProgramOnboardingSteps[] partnerProgramOnboardingStepsArr = {partnerProgramOnboardingSteps, partnerProgramOnboardingSteps2, partnerProgramOnboardingSteps3, partnerProgramOnboardingSteps4, partnerProgramOnboardingSteps5, partnerProgramOnboardingSteps6, partnerProgramOnboardingSteps7, partnerProgramOnboardingSteps8, partnerProgramOnboardingSteps9, partnerProgramOnboardingSteps10, partnerProgramOnboardingSteps11, partnerProgramOnboardingSteps12, partnerProgramOnboardingSteps13, partnerProgramOnboardingSteps14, partnerProgramOnboardingSteps15, partnerProgramOnboardingSteps16, partnerProgramOnboardingSteps17, partnerProgramOnboardingSteps18, partnerProgramOnboardingSteps19, partnerProgramOnboardingSteps20, partnerProgramOnboardingSteps21, partnerProgramOnboardingSteps22, new PartnerProgramOnboardingSteps("WELCOME_TO_PROGRAM", 22, "welcome_to_program")};
        A03 = partnerProgramOnboardingStepsArr;
        A02 = AbstractC12190kN.A00(partnerProgramOnboardingStepsArr);
        PartnerProgramOnboardingSteps[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (PartnerProgramOnboardingSteps partnerProgramOnboardingSteps23 : values) {
            A18.put(partnerProgramOnboardingSteps23.A00, partnerProgramOnboardingSteps23);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(28);
    }

    public static PartnerProgramOnboardingSteps valueOf(String str) {
        return (PartnerProgramOnboardingSteps) Enum.valueOf(PartnerProgramOnboardingSteps.class, str);
    }

    public static PartnerProgramOnboardingSteps[] values() {
        return (PartnerProgramOnboardingSteps[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PartnerProgramOnboardingSteps(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
