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
public final class MediaGiftingState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaGiftingState[] A03;
    public static final MediaGiftingState A04;
    public static final MediaGiftingState A05;
    public static final MediaGiftingState A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaGiftingState mediaGiftingState = new MediaGiftingState("UNRECOGNIZED", 0, "MediaGiftingState_unspecified");
        A06 = mediaGiftingState;
        MediaGiftingState mediaGiftingState2 = new MediaGiftingState("DISABLED", 1, "disabled");
        A04 = mediaGiftingState2;
        MediaGiftingState mediaGiftingState3 = new MediaGiftingState("ENABLED", 2, "enabled");
        A05 = mediaGiftingState3;
        MediaGiftingState[] mediaGiftingStateArr = {mediaGiftingState, mediaGiftingState2, mediaGiftingState3, new MediaGiftingState("NOT_APPLICABLE", 3, "not_applicable")};
        A03 = mediaGiftingStateArr;
        A02 = AbstractC12190kN.A00(mediaGiftingStateArr);
        MediaGiftingState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaGiftingState mediaGiftingState4 : values) {
            A18.put(mediaGiftingState4.A00, mediaGiftingState4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(84);
    }

    public static MediaGiftingState valueOf(String str) {
        return (MediaGiftingState) Enum.valueOf(MediaGiftingState.class, str);
    }

    public static MediaGiftingState[] values() {
        return (MediaGiftingState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaGiftingState(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
