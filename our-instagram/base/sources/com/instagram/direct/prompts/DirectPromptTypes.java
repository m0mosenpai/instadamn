package com.instagram.direct.prompts;

import X.AbstractC12190kN;
import X.C14360o3;
import X.C206139Av;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class DirectPromptTypes implements Parcelable {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ DirectPromptTypes[] A03;
    public static final DirectPromptTypes A04;
    public static final DirectPromptTypes A05;
    public static final DirectPromptTypes A06;
    public static final DirectPromptTypes A07;
    public static final DirectPromptTypes A08;
    public static final DirectPromptTypes A09;
    public static final DirectPromptTypes A0A;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final String A01;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(name());
    }

    static {
        DirectPromptTypes directPromptTypes = new DirectPromptTypes("UNKNOWN", 0, 0, "unknown");
        A0A = directPromptTypes;
        DirectPromptTypes directPromptTypes2 = new DirectPromptTypes("ADD_YOURS", 1, 148, "add_yours");
        A04 = directPromptTypes2;
        DirectPromptTypes directPromptTypes3 = new DirectPromptTypes("QUESTIONS", 2, 150, "questions");
        A07 = directPromptTypes3;
        DirectPromptTypes directPromptTypes4 = new DirectPromptTypes("SHARED_STACK", 3, 153, "shared_stack");
        A09 = directPromptTypes4;
        DirectPromptTypes directPromptTypes5 = new DirectPromptTypes("ROLL_CALL", 4, 154, "roll_call");
        A08 = directPromptTypes5;
        DirectPromptTypes directPromptTypes6 = new DirectPromptTypes("CHALLENGES", 5, 162, "challenges");
        A05 = directPromptTypes6;
        DirectPromptTypes directPromptTypes7 = new DirectPromptTypes("DAILY_PROMPT", 6, 163, "daily_prompt");
        A06 = directPromptTypes7;
        DirectPromptTypes[] directPromptTypesArr = {directPromptTypes, directPromptTypes2, directPromptTypes3, directPromptTypes4, directPromptTypes5, directPromptTypes6, directPromptTypes7};
        A03 = directPromptTypesArr;
        A02 = AbstractC12190kN.A00(directPromptTypesArr);
        CREATOR = new C206139Av(86);
    }

    public static DirectPromptTypes valueOf(String str) {
        return (DirectPromptTypes) Enum.valueOf(DirectPromptTypes.class, str);
    }

    public static DirectPromptTypes[] values() {
        return (DirectPromptTypes[]) A03.clone();
    }

    public DirectPromptTypes(String str, int i, int i2, String str2) {
        this.A00 = i2;
        this.A01 = str2;
    }
}
