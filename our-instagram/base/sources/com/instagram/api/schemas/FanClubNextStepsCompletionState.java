package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class FanClubNextStepsCompletionState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ FanClubNextStepsCompletionState[] A03;
    public static final FanClubNextStepsCompletionState A04;
    public static final FanClubNextStepsCompletionState A05;
    public static final FanClubNextStepsCompletionState A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        FanClubNextStepsCompletionState fanClubNextStepsCompletionState = new FanClubNextStepsCompletionState("UNRECOGNIZED", 0, "FanClubNextStepsCompletionState_unspecified");
        A06 = fanClubNextStepsCompletionState;
        FanClubNextStepsCompletionState fanClubNextStepsCompletionState2 = new FanClubNextStepsCompletionState("COMPLETED", 1, "completed");
        A04 = fanClubNextStepsCompletionState2;
        FanClubNextStepsCompletionState fanClubNextStepsCompletionState3 = new FanClubNextStepsCompletionState("HIDDEN", 2, "hidden");
        A05 = fanClubNextStepsCompletionState3;
        FanClubNextStepsCompletionState[] fanClubNextStepsCompletionStateArr = {fanClubNextStepsCompletionState, fanClubNextStepsCompletionState2, fanClubNextStepsCompletionState3, new FanClubNextStepsCompletionState("NOT_COMPLETED", 3, "not_completed")};
        A03 = fanClubNextStepsCompletionStateArr;
        A02 = AbstractC12190kN.A00(fanClubNextStepsCompletionStateArr);
        FanClubNextStepsCompletionState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (FanClubNextStepsCompletionState fanClubNextStepsCompletionState4 : values) {
            A18.put(fanClubNextStepsCompletionState4.A00, fanClubNextStepsCompletionState4);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(80);
    }

    public static FanClubNextStepsCompletionState valueOf(String str) {
        return (FanClubNextStepsCompletionState) Enum.valueOf(FanClubNextStepsCompletionState.class, str);
    }

    public static FanClubNextStepsCompletionState[] values() {
        return (FanClubNextStepsCompletionState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public FanClubNextStepsCompletionState(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
