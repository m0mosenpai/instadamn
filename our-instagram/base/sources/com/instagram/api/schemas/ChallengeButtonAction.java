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
public final class ChallengeButtonAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ChallengeButtonAction[] A03;
    public static final ChallengeButtonAction A04;
    public static final ChallengeButtonAction A05;
    public static final ChallengeButtonAction A06;
    public static final ChallengeButtonAction A07;
    public static final ChallengeButtonAction A08;
    public static final ChallengeButtonAction A09;
    public static final ChallengeButtonAction A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ChallengeButtonAction challengeButtonAction = new ChallengeButtonAction("UNRECOGNIZED", 0, "ChallengeButtonAction_unspecified");
        A0A = challengeButtonAction;
        ChallengeButtonAction challengeButtonAction2 = new ChallengeButtonAction("CREATE_POST", 1, "create_post");
        A04 = challengeButtonAction2;
        ChallengeButtonAction challengeButtonAction3 = new ChallengeButtonAction("CREATE_REEL", 2, "create_reel");
        A05 = challengeButtonAction3;
        ChallengeButtonAction challengeButtonAction4 = new ChallengeButtonAction("CREATE_STORY", 3, "create_story");
        A06 = challengeButtonAction4;
        ChallengeButtonAction challengeButtonAction5 = new ChallengeButtonAction("DEEPLINK", 4, "deeplink");
        A07 = challengeButtonAction5;
        ChallengeButtonAction challengeButtonAction6 = new ChallengeButtonAction("END_CHALLENGE", 5, "end_challenge");
        A08 = challengeButtonAction6;
        ChallengeButtonAction challengeButtonAction7 = new ChallengeButtonAction("OPEN_DETAILS_BOTTOMSHEET", 6, "open_details_bottomsheet");
        A09 = challengeButtonAction7;
        ChallengeButtonAction[] challengeButtonActionArr = {challengeButtonAction, challengeButtonAction2, challengeButtonAction3, challengeButtonAction4, challengeButtonAction5, challengeButtonAction6, challengeButtonAction7, new ChallengeButtonAction("START_CHALLENGE", 7, "start_challenge")};
        A03 = challengeButtonActionArr;
        A02 = AbstractC12190kN.A00(challengeButtonActionArr);
        ChallengeButtonAction[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (ChallengeButtonAction challengeButtonAction8 : values) {
            linkedHashMap.put(challengeButtonAction8.A00, challengeButtonAction8);
        }
        A01 = linkedHashMap;
        CREATOR = new C63469Sl9(94);
    }

    public static ChallengeButtonAction valueOf(String str) {
        return (ChallengeButtonAction) Enum.valueOf(ChallengeButtonAction.class, str);
    }

    public static ChallengeButtonAction[] values() {
        return (ChallengeButtonAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ChallengeButtonAction(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
