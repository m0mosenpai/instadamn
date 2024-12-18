package com.instagram.business.controller.datamodel;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C70220WId;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ConversionStep implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ConversionStep[] A02;
    public static final ConversionStep A03;
    public static final ConversionStep A04;
    public static final ConversionStep A05;
    public static final ConversionStep A06;
    public static final ConversionStep A07;
    public static final ConversionStep A08;
    public static final ConversionStep A09;
    public static final ConversionStep A0A;
    public static final ConversionStep A0B;
    public static final ConversionStep A0C;
    public static final ConversionStep A0D;
    public static final ConversionStep A0E;
    public static final ConversionStep A0F;
    public static final ConversionStep A0G;
    public static final ConversionStep A0H;
    public static final ConversionStep A0I;
    public static final ConversionStep A0J;
    public static final ConversionStep A0K;
    public static final ConversionStep A0L;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this);
    }

    static {
        ConversionStep conversionStep = new ConversionStep("RENEW", 0, "renew");
        A0G = conversionStep;
        ConversionStep conversionStep2 = new ConversionStep("INTRO", 1, "intro");
        A09 = conversionStep2;
        ConversionStep conversionStep3 = new ConversionStep("ACCOUNT_TYPE_SELECTION_V2", 2, "account_type_selection");
        A03 = conversionStep3;
        ConversionStep conversionStep4 = new ConversionStep("CREATOR_ACCOUNT_DESCRIPTION", 3, "creator_account_description");
        A06 = conversionStep4;
        ConversionStep conversionStep5 = new ConversionStep("CREATE_PAGE", 4, "create_page");
        A05 = conversionStep5;
        ConversionStep conversionStep6 = new ConversionStep("FACEBOOK_CONNECT", 5, "fb_account_selection");
        A08 = conversionStep6;
        ConversionStep conversionStep7 = new ConversionStep("PAGE_SELECTION", 6, "page_selection");
        A0C = conversionStep7;
        ConversionStep conversionStep8 = new ConversionStep("CHOOSE_CATEGORY", 7, "choose_category");
        A04 = conversionStep8;
        ConversionStep conversionStep9 = new ConversionStep("EDIT_CONTACT", 8, "edit_contact_info");
        A07 = conversionStep9;
        ConversionStep conversionStep10 = new ConversionStep("PROFESSIONAL_ACCOUNT_SELECTION", 9, "professional_account_selection");
        A0D = conversionStep10;
        ConversionStep conversionStep11 = new ConversionStep("REGULAR_SIGNUP_FLOW", 10, "regular_signup_flow");
        A0F = conversionStep11;
        ConversionStep conversionStep12 = new ConversionStep("SAVE_LOGIN_INFO", 11, "save_login_info");
        A0I = conversionStep12;
        ConversionStep conversionStep13 = new ConversionStep("SUGGEST_BUSINESS", 12, "suggest_business");
        A0J = conversionStep13;
        ConversionStep conversionStep14 = new ConversionStep("WHATS_APP_LINKING", 13, "whats_app_linking");
        A0L = conversionStep14;
        ConversionStep conversionStep15 = new ConversionStep("OPT_IN_EMAIL", 14, "opt_in_email");
        A0B = conversionStep15;
        ConversionStep conversionStep16 = new ConversionStep("SAFETY_STEP", 15, "safety_step");
        A0H = conversionStep16;
        ConversionStep conversionStep17 = new ConversionStep("ONBOARDING_CHECKLIST", 16, "onboarding_checklist");
        A0A = conversionStep17;
        ConversionStep conversionStep18 = new ConversionStep("PROFESSIONAL_DASHBOARD", 17, "professional_dashboard");
        A0E = conversionStep18;
        ConversionStep conversionStep19 = new ConversionStep("UNKNOWN", 18, "unknown");
        A0K = conversionStep19;
        ConversionStep[] conversionStepArr = {conversionStep, conversionStep2, conversionStep3, conversionStep4, conversionStep5, conversionStep6, conversionStep7, conversionStep8, conversionStep9, conversionStep10, conversionStep11, conversionStep12, conversionStep13, conversionStep14, conversionStep15, conversionStep16, conversionStep17, conversionStep18, conversionStep19};
        A02 = conversionStepArr;
        A01 = AbstractC12190kN.A00(conversionStepArr);
        CREATOR = new C70220WId(34);
    }

    public static ConversionStep valueOf(String str) {
        return (ConversionStep) Enum.valueOf(ConversionStep.class, str);
    }

    public static ConversionStep[] values() {
        return (ConversionStep[]) A02.clone();
    }

    public ConversionStep(String str, int i, String str2) {
        this.A00 = str2;
    }
}
