package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ChallengeState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ChallengeState[] A03;
    public static final ChallengeState A04;
    public static final ChallengeState A05;
    public static final ChallengeState A06;
    public static final ChallengeState A07;
    public static final ChallengeState A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ChallengeState challengeState = new ChallengeState("UNRECOGNIZED", 0, "ChallengeState_unspecified");
        A08 = challengeState;
        ChallengeState challengeState2 = new ChallengeState("COMPLETED", 1, "completed");
        A04 = challengeState2;
        ChallengeState challengeState3 = new ChallengeState("MISSED", 2, "missed");
        A05 = challengeState3;
        ChallengeState challengeState4 = new ChallengeState("NOT_STARTED", 3, "not_started");
        A06 = challengeState4;
        ChallengeState challengeState5 = new ChallengeState("STARTED", 4, "started");
        A07 = challengeState5;
        ChallengeState[] challengeStateArr = {challengeState, challengeState2, challengeState3, challengeState4, challengeState5};
        A03 = challengeStateArr;
        A02 = AbstractC12190kN.A00(challengeStateArr);
        ChallengeState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ChallengeState challengeState6 : values) {
            A18.put(challengeState6.A00, challengeState6);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(98);
    }

    public static ChallengeState valueOf(String str) {
        return (ChallengeState) Enum.valueOf(ChallengeState.class, str);
    }

    public static ChallengeState[] values() {
        return (ChallengeState[]) A03.clone();
    }

    public ChallengeState(String str, int i, String str2) {
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
