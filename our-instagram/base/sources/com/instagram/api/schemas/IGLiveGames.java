package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IGLiveGames implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveGames[] A03;
    public static final IGLiveGames A04;
    public static final IGLiveGames A05;
    public static final IGLiveGames A06;
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
        IGLiveGames iGLiveGames = new IGLiveGames("UNRECOGNIZED", 0, "IGLiveGames_unspecified");
        A06 = iGLiveGames;
        IGLiveGames iGLiveGames2 = new IGLiveGames("CLOSE_UP", 1, "close_up");
        A04 = iGLiveGames2;
        IGLiveGames iGLiveGames3 = new IGLiveGames("THIS_OR_THAT", 2, "this_or_that");
        A05 = iGLiveGames3;
        IGLiveGames[] iGLiveGamesArr = {iGLiveGames, iGLiveGames2, iGLiveGames3, new IGLiveGames("TRIVIA", 3, "trivia")};
        A03 = iGLiveGamesArr;
        A02 = AbstractC12190kN.A00(iGLiveGamesArr);
        IGLiveGames[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGLiveGames iGLiveGames4 : values) {
            linkedHashMap.put(iGLiveGames4.A00, iGLiveGames4);
        }
        A01 = linkedHashMap;
        CREATOR = new C41858IgC(37);
    }

    public static IGLiveGames valueOf(String str) {
        return (IGLiveGames) Enum.valueOf(IGLiveGames.class, str);
    }

    public static IGLiveGames[] values() {
        return (IGLiveGames[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveGames(String str, int i, String str2) {
        this.A00 = str2;
    }
}
