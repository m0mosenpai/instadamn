package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ListeningNowState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ListeningNowState[] A03;
    public static final ListeningNowState A04;
    public static final ListeningNowState A05;
    public static final ListeningNowState A06;
    public static final ListeningNowState A07;
    public static final ListeningNowState A08;
    public static final ListeningNowState A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ListeningNowState listeningNowState = new ListeningNowState("UNRECOGNIZED", 0, "ListeningNowState_unspecified");
        A09 = listeningNowState;
        ListeningNowState listeningNowState2 = new ListeningNowState("ERROR", 1, "ERROR");
        A04 = listeningNowState2;
        ListeningNowState listeningNowState3 = new ListeningNowState("EXPIRED", 2, "EXPIRED");
        A05 = listeningNowState3;
        ListeningNowState listeningNowState4 = new ListeningNowState("LISTENING_INVALID_SONG", 3, "LISTENING_INVALID_SONG");
        A06 = listeningNowState4;
        ListeningNowState listeningNowState5 = new ListeningNowState("LISTENING_VALID_SONG", 4, "LISTENING_VALID_SONG");
        A07 = listeningNowState5;
        ListeningNowState listeningNowState6 = new ListeningNowState("NOT_LISTENING", 5, "NOT_LISTENING");
        A08 = listeningNowState6;
        ListeningNowState[] listeningNowStateArr = {listeningNowState, listeningNowState2, listeningNowState3, listeningNowState4, listeningNowState5, listeningNowState6};
        A03 = listeningNowStateArr;
        A02 = AbstractC12190kN.A00(listeningNowStateArr);
        ListeningNowState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ListeningNowState listeningNowState7 : values) {
            A18.put(listeningNowState7.A00, listeningNowState7);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(73);
    }

    public static ListeningNowState valueOf(String str) {
        return (ListeningNowState) Enum.valueOf(ListeningNowState.class, str);
    }

    public static ListeningNowState[] values() {
        return (ListeningNowState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ListeningNowState(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
