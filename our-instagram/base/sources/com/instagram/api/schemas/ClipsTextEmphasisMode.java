package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ClipsTextEmphasisMode implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTextEmphasisMode[] A03;
    public static final ClipsTextEmphasisMode A04;
    public static final ClipsTextEmphasisMode A05;
    public static final ClipsTextEmphasisMode A06;
    public static final ClipsTextEmphasisMode A07;
    public static final ClipsTextEmphasisMode A08;
    public static final ClipsTextEmphasisMode A09;
    public static final ClipsTextEmphasisMode A0A;
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
        ClipsTextEmphasisMode clipsTextEmphasisMode = new ClipsTextEmphasisMode("UNRECOGNIZED", 0, "ClipsTextEmphasisMode_unspecified");
        A0A = clipsTextEmphasisMode;
        ClipsTextEmphasisMode clipsTextEmphasisMode2 = new ClipsTextEmphasisMode("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = clipsTextEmphasisMode2;
        ClipsTextEmphasisMode clipsTextEmphasisMode3 = new ClipsTextEmphasisMode("DEFAULT_OUTLINES", 2, "default_outlines");
        A05 = clipsTextEmphasisMode3;
        ClipsTextEmphasisMode clipsTextEmphasisMode4 = new ClipsTextEmphasisMode("DISABLED", 3, "disabled");
        A06 = clipsTextEmphasisMode4;
        ClipsTextEmphasisMode clipsTextEmphasisMode5 = new ClipsTextEmphasisMode("FROSTED", 4, "frosted");
        A07 = clipsTextEmphasisMode5;
        ClipsTextEmphasisMode clipsTextEmphasisMode6 = new ClipsTextEmphasisMode("INVERTED", 5, "inverted");
        A08 = clipsTextEmphasisMode6;
        ClipsTextEmphasisMode clipsTextEmphasisMode7 = new ClipsTextEmphasisMode("INVERTED_OUTLINES", 6, "inverted_outlines");
        A09 = clipsTextEmphasisMode7;
        ClipsTextEmphasisMode[] clipsTextEmphasisModeArr = {clipsTextEmphasisMode, clipsTextEmphasisMode2, clipsTextEmphasisMode3, clipsTextEmphasisMode4, clipsTextEmphasisMode5, clipsTextEmphasisMode6, clipsTextEmphasisMode7};
        A03 = clipsTextEmphasisModeArr;
        A02 = AbstractC12190kN.A00(clipsTextEmphasisModeArr);
        ClipsTextEmphasisMode[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (ClipsTextEmphasisMode clipsTextEmphasisMode8 : values) {
            linkedHashMap.put(clipsTextEmphasisMode8.A00, clipsTextEmphasisMode8);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(69);
    }

    public static ClipsTextEmphasisMode valueOf(String str) {
        return (ClipsTextEmphasisMode) Enum.valueOf(ClipsTextEmphasisMode.class, str);
    }

    public static ClipsTextEmphasisMode[] values() {
        return (ClipsTextEmphasisMode[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTextEmphasisMode(String str, int i, String str2) {
        this.A00 = str2;
    }
}
