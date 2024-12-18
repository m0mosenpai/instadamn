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
public final class MediaGiftCountVisibilityState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaGiftCountVisibilityState[] A03;
    public static final MediaGiftCountVisibilityState A04;
    public static final MediaGiftCountVisibilityState A05;
    public static final MediaGiftCountVisibilityState A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaGiftCountVisibilityState mediaGiftCountVisibilityState = new MediaGiftCountVisibilityState("UNRECOGNIZED", 0, "MediaGiftCountVisibilityState_unspecified");
        A06 = mediaGiftCountVisibilityState;
        MediaGiftCountVisibilityState mediaGiftCountVisibilityState2 = new MediaGiftCountVisibilityState("DISABLED", 1, "disabled");
        A04 = mediaGiftCountVisibilityState2;
        MediaGiftCountVisibilityState mediaGiftCountVisibilityState3 = new MediaGiftCountVisibilityState("ENABLED", 2, "enabled");
        A05 = mediaGiftCountVisibilityState3;
        MediaGiftCountVisibilityState[] mediaGiftCountVisibilityStateArr = {mediaGiftCountVisibilityState, mediaGiftCountVisibilityState2, mediaGiftCountVisibilityState3};
        A03 = mediaGiftCountVisibilityStateArr;
        A02 = AbstractC12190kN.A00(mediaGiftCountVisibilityStateArr);
        MediaGiftCountVisibilityState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaGiftCountVisibilityState mediaGiftCountVisibilityState4 : values) {
            A18.put(mediaGiftCountVisibilityState4.A00, mediaGiftCountVisibilityState4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(83);
    }

    public static MediaGiftCountVisibilityState valueOf(String str) {
        return (MediaGiftCountVisibilityState) Enum.valueOf(MediaGiftCountVisibilityState.class, str);
    }

    public static MediaGiftCountVisibilityState[] values() {
        return (MediaGiftCountVisibilityState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaGiftCountVisibilityState(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
