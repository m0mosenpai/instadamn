package com.instagram.business.promote.model;

import X.AbstractC12190kN;
import X.AbstractC31175DnJ;
import X.C70220WId;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class BillingWizardName implements Parcelable {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BillingWizardName[] A02;
    public static final BillingWizardName A03;
    public static final BillingWizardName A04;
    public static final BillingWizardName A05;
    public static final BillingWizardName A06;
    public static final BillingWizardName A07;
    public static final BillingWizardName A08;
    public static final BillingWizardName A09;
    public static final BillingWizardName A0A;
    public static final BillingWizardName A0B;
    public static final BillingWizardName A0C;
    public static final BillingWizardName A0D;
    public static final BillingWizardName A0E;
    public static final BillingWizardName A0F;
    public static final BillingWizardName A0G;
    public static final BillingWizardName A0H;
    public static final BillingWizardName A0I;
    public static final BillingWizardName A0J;
    public static final BillingWizardName A0K;
    public static final BillingWizardName A0L;
    public static final BillingWizardName A0M;
    public static final BillingWizardName A0N;
    public static final BillingWizardName A0O;
    public static final BillingWizardName A0P;
    public static final BillingWizardName A0Q;
    public static final BillingWizardName A0R;
    public static final BillingWizardName A0S;
    public static final BillingWizardName A0T;
    public static final BillingWizardName A0U;
    public static final BillingWizardName A0V;
    public static final BillingWizardName A0W;
    public static final BillingWizardName A0X;
    public static final BillingWizardName A0Y;
    public static final BillingWizardName A0Z;
    public static final BillingWizardName A0a;
    public static final BillingWizardName A0b;
    public static final BillingWizardName A0c;
    public static final BillingWizardName A0d;
    public static final BillingWizardName A0e;
    public static final BillingWizardName A0f;
    public static final BillingWizardName A0g;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BillingWizardName billingWizardName = new BillingWizardName("ACTIVATE_CREDIT_CARD", 0, "ACTIVATE_CREDIT_CARD");
        A03 = billingWizardName;
        BillingWizardName billingWizardName2 = new BillingWizardName("ACTIVATE_CREDIT_CARD_DO_NOT_USE", 1, "ACTIVATE_CREDIT_CARD_DO_NOT_USE");
        A04 = billingWizardName2;
        BillingWizardName billingWizardName3 = new BillingWizardName("ADD_CREDIT_CARD", 2, "ADD_CREDIT_CARD");
        A05 = billingWizardName3;
        BillingWizardName billingWizardName4 = new BillingWizardName("ADD_FUNDS", 3, "ADD_FUNDS");
        A06 = billingWizardName4;
        BillingWizardName billingWizardName5 = new BillingWizardName("ADD_FUNDS_DO_NOT_USE", 4, "ADD_FUNDS_DO_NOT_USE");
        A07 = billingWizardName5;
        BillingWizardName billingWizardName6 = new BillingWizardName("ADD_PM", 5, "ADD_PM");
        A08 = billingWizardName6;
        BillingWizardName billingWizardName7 = new BillingWizardName("ADD_PM_DO_NOT_USE", 6, "ADD_PM_DO_NOT_USE");
        A09 = billingWizardName7;
        BillingWizardName billingWizardName8 = new BillingWizardName("AUTO", 7, "AUTO");
        A0A = billingWizardName8;
        BillingWizardName billingWizardName9 = new BillingWizardName("AUTO_DO_NOT_USE", 8, "AUTO_DO_NOT_USE");
        A0B = billingWizardName9;
        BillingWizardName billingWizardName10 = new BillingWizardName("BRAZIL_REFUND", 9, "BRAZIL_REFUND");
        A0C = billingWizardName10;
        BillingWizardName billingWizardName11 = new BillingWizardName("CHANGE_COUNTRY_CURRENCY", 10, "CHANGE_COUNTRY_CURRENCY");
        A0D = billingWizardName11;
        BillingWizardName billingWizardName12 = new BillingWizardName("CHANGE_COUNTRY_CURRENCY_DO_NOT_USE", 11, "CHANGE_COUNTRY_CURRENCY_DO_NOT_USE");
        A0E = billingWizardName12;
        BillingWizardName billingWizardName13 = new BillingWizardName("COLLECT_ACCOUNT_INFO", 12, "COLLECT_ACCOUNT_INFO");
        A0F = billingWizardName13;
        BillingWizardName billingWizardName14 = new BillingWizardName("COLLECT_ACCOUNT_INFO_DO_NOT_USE", 13, "COLLECT_ACCOUNT_INFO_DO_NOT_USE");
        A0G = billingWizardName14;
        BillingWizardName billingWizardName15 = new BillingWizardName("CREATE_BM_AD_ACCOUNT", 14, "CREATE_BM_AD_ACCOUNT");
        A0H = billingWizardName15;
        BillingWizardName billingWizardName16 = new BillingWizardName("CREATE_BM_AD_ACCOUNT_DO_NOT_USE", 15, "CREATE_BM_AD_ACCOUNT_DO_NOT_USE");
        A0I = billingWizardName16;
        BillingWizardName billingWizardName17 = new BillingWizardName("DEACTIVATE_AD_ACCOUNT", 16, "DEACTIVATE_AD_ACCOUNT");
        A0J = billingWizardName17;
        BillingWizardName billingWizardName18 = new BillingWizardName("DELETE_MI_SHARING", 17, "DELETE_MI_SHARING");
        A0K = billingWizardName18;
        BillingWizardName billingWizardName19 = new BillingWizardName("EDIT_CREDIT_CARD", 18, "EDIT_CREDIT_CARD");
        A0L = billingWizardName19;
        BillingWizardName billingWizardName20 = new BillingWizardName("EDIT_CREDIT_CARD_DO_NOT_USE", 19, "EDIT_CREDIT_CARD_DO_NOT_USE");
        A0M = billingWizardName20;
        BillingWizardName billingWizardName21 = new BillingWizardName("EDIT_MI_SHARING", 20, "EDIT_MI_SHARING");
        A0N = billingWizardName21;
        BillingWizardName billingWizardName22 = new BillingWizardName("EDIT_PRIMARY_PM", 21, "EDIT_PRIMARY_PM");
        A0O = billingWizardName22;
        BillingWizardName billingWizardName23 = new BillingWizardName("EDIT_PRIMARY_PM_DO_NOT_USE", 22, "EDIT_PRIMARY_PM_DO_NOT_USE");
        A0P = billingWizardName23;
        BillingWizardName billingWizardName24 = new BillingWizardName("MI_ONBOARDING", 23, "MI_ONBOARDING");
        A0Q = billingWizardName24;
        BillingWizardName billingWizardName25 = new BillingWizardName("MI_ONBOARDING_DO_NOT_USE", 24, "MI_ONBOARDING_DO_NOT_USE");
        A0R = billingWizardName25;
        BillingWizardName billingWizardName26 = new BillingWizardName("MI_TO_SELF_SERVE", 25, "MI_TO_SELF_SERVE");
        A0S = billingWizardName26;
        BillingWizardName billingWizardName27 = new BillingWizardName("MI_TO_SELF_SERVE_DO_NOT_USE", 26, "MI_TO_SELF_SERVE_DO_NOT_USE");
        A0T = billingWizardName27;
        BillingWizardName billingWizardName28 = new BillingWizardName(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 27, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A0U = billingWizardName28;
        BillingWizardName billingWizardName29 = new BillingWizardName("NONE_DO_NOT_USE", 28, "NONE_DO_NOT_USE");
        A0V = billingWizardName29;
        BillingWizardName billingWizardName30 = new BillingWizardName("PAY_NOW", 29, "PAY_NOW");
        A0W = billingWizardName30;
        BillingWizardName billingWizardName31 = new BillingWizardName("PAY_NOW_DO_NOT_USE", 30, "PAY_NOW_DO_NOT_USE");
        A0X = billingWizardName31;
        BillingWizardName billingWizardName32 = new BillingWizardName("RECEIVE_CREDIT_CARD", 31, "RECEIVE_CREDIT_CARD");
        A0Y = billingWizardName32;
        BillingWizardName billingWizardName33 = new BillingWizardName("RECEIVE_CREDIT_CARD_DO_NOT_USE", 32, "RECEIVE_CREDIT_CARD_DO_NOT_USE");
        A0Z = billingWizardName33;
        BillingWizardName billingWizardName34 = new BillingWizardName("REJECT_CREDIT_CARD", 33, "REJECT_CREDIT_CARD");
        A0a = billingWizardName34;
        BillingWizardName billingWizardName35 = new BillingWizardName("RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION", 34, "RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION");
        A0b = billingWizardName35;
        BillingWizardName billingWizardName36 = new BillingWizardName("RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION_DO_NOT_USE", 35, "RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION_DO_NOT_USE");
        A0c = billingWizardName36;
        BillingWizardName billingWizardName37 = new BillingWizardName("RESOLVE_PREAUTH_FRICTION", 36, "RESOLVE_PREAUTH_FRICTION");
        A0d = billingWizardName37;
        BillingWizardName billingWizardName38 = new BillingWizardName("REVOKE_CC_SHARING", 37, "REVOKE_CC_SHARING");
        A0e = billingWizardName38;
        BillingWizardName billingWizardName39 = new BillingWizardName("SHARE_CREDIT_CARD", 38, "SHARE_CREDIT_CARD");
        A0f = billingWizardName39;
        BillingWizardName billingWizardName40 = new BillingWizardName("SHARE_CREDIT_CARD_DO_NOT_USE", 39, "SHARE_CREDIT_CARD_DO_NOT_USE");
        A0g = billingWizardName40;
        BillingWizardName[] billingWizardNameArr = new BillingWizardName[41];
        System.arraycopy(new BillingWizardName[]{billingWizardName28, billingWizardName29, billingWizardName30, billingWizardName31, billingWizardName32, billingWizardName33, billingWizardName34, billingWizardName35, billingWizardName36, billingWizardName37, billingWizardName38, billingWizardName39, billingWizardName40, new BillingWizardName("UPDATE_ACCOUNT_SPEND_LIMIT", 40, "UPDATE_ACCOUNT_SPEND_LIMIT")}, AbstractC31175DnJ.A1b(new BillingWizardName[]{billingWizardName, billingWizardName2, billingWizardName3, billingWizardName4, billingWizardName5, billingWizardName6, billingWizardName7, billingWizardName8, billingWizardName9, billingWizardName10, billingWizardName11, billingWizardName12, billingWizardName13, billingWizardName14, billingWizardName15, billingWizardName16, billingWizardName17, billingWizardName18, billingWizardName19, billingWizardName20, billingWizardName21, billingWizardName22, billingWizardName23, billingWizardName24, billingWizardName25, billingWizardName26, billingWizardName27}, billingWizardNameArr) ? 1 : 0, billingWizardNameArr, 27, 14);
        A02 = billingWizardNameArr;
        A01 = AbstractC12190kN.A00(billingWizardNameArr);
        CREATOR = new C70220WId(49);
    }

    public static BillingWizardName valueOf(String str) {
        return (BillingWizardName) Enum.valueOf(BillingWizardName.class, str);
    }

    public static BillingWizardName[] values() {
        return (BillingWizardName[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BillingWizardName(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
