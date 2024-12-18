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
/* loaded from: classes6.dex */
public final class InstagramProductTaggabilityState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ InstagramProductTaggabilityState[] A03;
    public static final InstagramProductTaggabilityState A04;
    public static final InstagramProductTaggabilityState A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        InstagramProductTaggabilityState instagramProductTaggabilityState = new InstagramProductTaggabilityState("UNRECOGNIZED", 0, "InstagramProductTaggabilityState_unspecified");
        A05 = instagramProductTaggabilityState;
        InstagramProductTaggabilityState instagramProductTaggabilityState2 = new InstagramProductTaggabilityState("TAGGABLE", 1, "TAGGABLE");
        A04 = instagramProductTaggabilityState2;
        InstagramProductTaggabilityState[] instagramProductTaggabilityStateArr = {instagramProductTaggabilityState, instagramProductTaggabilityState2, new InstagramProductTaggabilityState("UNTAGGABLE", 2, "UNTAGGABLE")};
        A03 = instagramProductTaggabilityStateArr;
        A02 = AbstractC12190kN.A00(instagramProductTaggabilityStateArr);
        InstagramProductTaggabilityState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (InstagramProductTaggabilityState instagramProductTaggabilityState3 : values) {
            A18.put(instagramProductTaggabilityState3.A00, instagramProductTaggabilityState3);
        }
        A01 = A18;
        CREATOR = new C41858IgC(59);
    }

    public static InstagramProductTaggabilityState valueOf(String str) {
        return (InstagramProductTaggabilityState) Enum.valueOf(InstagramProductTaggabilityState.class, str);
    }

    public static InstagramProductTaggabilityState[] values() {
        return (InstagramProductTaggabilityState[]) A03.clone();
    }

    public InstagramProductTaggabilityState(String str, int i, String str2) {
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
