package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ShoppingOnboardingState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ShoppingOnboardingState[] A03;
    public static final ShoppingOnboardingState A04;
    public static final ShoppingOnboardingState A05;
    public static final ShoppingOnboardingState A06;
    public static final ShoppingOnboardingState A07;
    public static final ShoppingOnboardingState A08;
    public static final ShoppingOnboardingState A09;
    public static final ShoppingOnboardingState A0A;
    public static final ShoppingOnboardingState A0B;
    public static final ShoppingOnboardingState A0C;
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
        ShoppingOnboardingState shoppingOnboardingState = new ShoppingOnboardingState("UNRECOGNIZED", 0, "ShoppingOnboardingState_unspecified");
        A0C = shoppingOnboardingState;
        ShoppingOnboardingState shoppingOnboardingState2 = new ShoppingOnboardingState("DISABLED", 1, "disabled");
        A04 = shoppingOnboardingState2;
        ShoppingOnboardingState shoppingOnboardingState3 = new ShoppingOnboardingState("IN_REVIEW", 2, "in_review");
        A05 = shoppingOnboardingState3;
        ShoppingOnboardingState shoppingOnboardingState4 = new ShoppingOnboardingState("NOT_APPROVED", 3, "not_approved");
        A06 = shoppingOnboardingState4;
        ShoppingOnboardingState shoppingOnboardingState5 = new ShoppingOnboardingState("NOT_STARTED", 4, "not_started");
        A07 = shoppingOnboardingState5;
        ShoppingOnboardingState shoppingOnboardingState6 = new ShoppingOnboardingState("ONBOARDED", 5, "onboarded");
        A08 = shoppingOnboardingState6;
        ShoppingOnboardingState shoppingOnboardingState7 = new ShoppingOnboardingState("ONBOARDED_COLLAB_BRAND", 6, "onboarded_collab_brand");
        A09 = shoppingOnboardingState7;
        ShoppingOnboardingState shoppingOnboardingState8 = new ShoppingOnboardingState("ONBOARDED_CREATOR_AS_MARKETER", 7, "onboarded_creator_as_marketer");
        A0A = shoppingOnboardingState8;
        ShoppingOnboardingState shoppingOnboardingState9 = new ShoppingOnboardingState("ONBOARDED_CREATOR_AS_SELLER", 8, "onboarded_creator_as_seller");
        A0B = shoppingOnboardingState9;
        ShoppingOnboardingState[] shoppingOnboardingStateArr = {shoppingOnboardingState, shoppingOnboardingState2, shoppingOnboardingState3, shoppingOnboardingState4, shoppingOnboardingState5, shoppingOnboardingState6, shoppingOnboardingState7, shoppingOnboardingState8, shoppingOnboardingState9, new ShoppingOnboardingState("SANDBOX", 9, "sandbox")};
        A03 = shoppingOnboardingStateArr;
        A02 = AbstractC12190kN.A00(shoppingOnboardingStateArr);
        ShoppingOnboardingState[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ShoppingOnboardingState shoppingOnboardingState10 : values) {
            linkedHashMap.put(shoppingOnboardingState10.A00, shoppingOnboardingState10);
        }
        A01 = linkedHashMap;
        CREATOR = new C206139Av(7);
    }

    public static ShoppingOnboardingState valueOf(String str) {
        return (ShoppingOnboardingState) Enum.valueOf(ShoppingOnboardingState.class, str);
    }

    public static ShoppingOnboardingState[] values() {
        return (ShoppingOnboardingState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ShoppingOnboardingState(String str, int i, String str2) {
        this.A00 = str2;
    }
}
