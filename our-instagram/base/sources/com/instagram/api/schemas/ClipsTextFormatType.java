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
public final class ClipsTextFormatType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTextFormatType[] A03;
    public static final ClipsTextFormatType A04;
    public static final ClipsTextFormatType A05;
    public static final ClipsTextFormatType A06;
    public static final ClipsTextFormatType A07;
    public static final ClipsTextFormatType A08;
    public static final ClipsTextFormatType A09;
    public static final ClipsTextFormatType A0A;
    public static final ClipsTextFormatType A0B;
    public static final ClipsTextFormatType A0C;
    public static final ClipsTextFormatType A0D;
    public static final ClipsTextFormatType A0E;
    public static final ClipsTextFormatType A0F;
    public static final ClipsTextFormatType A0G;
    public static final ClipsTextFormatType A0H;
    public static final ClipsTextFormatType A0I;
    public static final ClipsTextFormatType A0J;
    public static final ClipsTextFormatType A0K;
    public static final ClipsTextFormatType A0L;
    public static final ClipsTextFormatType A0M;
    public static final ClipsTextFormatType A0N;
    public static final ClipsTextFormatType A0O;
    public static final ClipsTextFormatType A0P;
    public static final ClipsTextFormatType A0Q;
    public static final ClipsTextFormatType A0R;
    public static final ClipsTextFormatType A0S;
    public static final ClipsTextFormatType A0T;
    public static final ClipsTextFormatType A0U;
    public static final ClipsTextFormatType A0V;
    public static final ClipsTextFormatType A0W;
    public static final ClipsTextFormatType A0X;
    public static final ClipsTextFormatType A0Y;
    public static final ClipsTextFormatType A0Z;
    public static final ClipsTextFormatType A0a;
    public static final ClipsTextFormatType A0b;
    public static final ClipsTextFormatType A0c;
    public static final ClipsTextFormatType A0d;
    public static final ClipsTextFormatType A0e;
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
        ClipsTextFormatType clipsTextFormatType = new ClipsTextFormatType("UNRECOGNIZED", 0, "ClipsTextFormatType_unspecified");
        A0e = clipsTextFormatType;
        ClipsTextFormatType clipsTextFormatType2 = new ClipsTextFormatType("ALUMNI_SANS", 1, "alumni_sans");
        A04 = clipsTextFormatType2;
        ClipsTextFormatType clipsTextFormatType3 = new ClipsTextFormatType("AVENY", 2, "aveny");
        A05 = clipsTextFormatType3;
        ClipsTextFormatType clipsTextFormatType4 = new ClipsTextFormatType("BOLD_ITALIC", 3, "bold_italic");
        A06 = clipsTextFormatType4;
        ClipsTextFormatType clipsTextFormatType5 = new ClipsTextFormatType("CAPRASIMO", 4, "caprasimo");
        A07 = clipsTextFormatType5;
        ClipsTextFormatType clipsTextFormatType6 = new ClipsTextFormatType("CLASSIC", 5, "classic");
        A08 = clipsTextFormatType6;
        ClipsTextFormatType clipsTextFormatType7 = new ClipsTextFormatType("CLASSIC_V2", 6, "classic_v2");
        A09 = clipsTextFormatType7;
        ClipsTextFormatType clipsTextFormatType8 = new ClipsTextFormatType("DEFAULT", 7, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A0A = clipsTextFormatType8;
        ClipsTextFormatType clipsTextFormatType9 = new ClipsTextFormatType("DIRECTIONAL", 8, "directional");
        A0B = clipsTextFormatType9;
        ClipsTextFormatType clipsTextFormatType10 = new ClipsTextFormatType("DYNAPUFF", 9, "dynapuff");
        A0C = clipsTextFormatType10;
        ClipsTextFormatType clipsTextFormatType11 = new ClipsTextFormatType("ELEGANT", 10, "elegant");
        A0D = clipsTextFormatType11;
        ClipsTextFormatType clipsTextFormatType12 = new ClipsTextFormatType("HALLOWEEN", 11, "halloween");
        A0E = clipsTextFormatType12;
        ClipsTextFormatType clipsTextFormatType13 = new ClipsTextFormatType("HEPTA_SLAB", 12, "hepta_slab");
        A0F = clipsTextFormatType13;
        ClipsTextFormatType clipsTextFormatType14 = new ClipsTextFormatType("IG_BUBBLE", 13, "ig_bubble");
        A0G = clipsTextFormatType14;
        ClipsTextFormatType clipsTextFormatType15 = new ClipsTextFormatType("IG_CLASSIC", 14, "ig_classic");
        A0H = clipsTextFormatType15;
        ClipsTextFormatType clipsTextFormatType16 = new ClipsTextFormatType("IG_DECO", 15, "ig_deco");
        A0I = clipsTextFormatType16;
        ClipsTextFormatType clipsTextFormatType17 = new ClipsTextFormatType("IG_EDITOR", 16, "ig_editor");
        A0J = clipsTextFormatType17;
        ClipsTextFormatType clipsTextFormatType18 = new ClipsTextFormatType("IG_LITERATURE", 17, "ig_literature");
        A0K = clipsTextFormatType18;
        ClipsTextFormatType clipsTextFormatType19 = new ClipsTextFormatType("IG_POSTER", 18, "ig_poster");
        A0L = clipsTextFormatType19;
        ClipsTextFormatType clipsTextFormatType20 = new ClipsTextFormatType("IG_SIGNATURE", 19, "ig_signature");
        A0M = clipsTextFormatType20;
        ClipsTextFormatType clipsTextFormatType21 = new ClipsTextFormatType("IG_SQUEEZE", 20, "ig_squeeze");
        A0N = clipsTextFormatType21;
        ClipsTextFormatType clipsTextFormatType22 = new ClipsTextFormatType("LITERATURE", 21, "literature");
        A0O = clipsTextFormatType22;
        ClipsTextFormatType clipsTextFormatType23 = new ClipsTextFormatType("MEME", 22, "meme");
        A0P = clipsTextFormatType23;
        ClipsTextFormatType clipsTextFormatType24 = new ClipsTextFormatType("MODERN", 23, "modern");
        A0Q = clipsTextFormatType24;
        ClipsTextFormatType clipsTextFormatType25 = new ClipsTextFormatType("MODERN_REFRESHED", 24, "modern_refreshed");
        A0R = clipsTextFormatType25;
        ClipsTextFormatType clipsTextFormatType26 = new ClipsTextFormatType("MODERN_REFRESHED_V2", 25, "modern_refreshed_v2");
        A0S = clipsTextFormatType26;
        ClipsTextFormatType clipsTextFormatType27 = new ClipsTextFormatType("MODERN_V2", 26, "modern_v2");
        A0T = clipsTextFormatType27;
        ClipsTextFormatType clipsTextFormatType28 = new ClipsTextFormatType("MONO", 27, "mono");
        A0U = clipsTextFormatType28;
        ClipsTextFormatType clipsTextFormatType29 = new ClipsTextFormatType("NEON", 28, "neon");
        A0V = clipsTextFormatType29;
        ClipsTextFormatType clipsTextFormatType30 = new ClipsTextFormatType("NEON_V2", 29, "neon_v2");
        A0W = clipsTextFormatType30;
        ClipsTextFormatType clipsTextFormatType31 = new ClipsTextFormatType("POPPINS", 30, "poppins");
        A0X = clipsTextFormatType31;
        ClipsTextFormatType clipsTextFormatType32 = new ClipsTextFormatType("SCRIPT", 31, "script");
        A0Y = clipsTextFormatType32;
        ClipsTextFormatType clipsTextFormatType33 = new ClipsTextFormatType("SECRET_MEME", 32, "secret_meme");
        A0Z = clipsTextFormatType33;
        ClipsTextFormatType clipsTextFormatType34 = new ClipsTextFormatType("SPARK_APP", 33, "spark_app");
        A0a = clipsTextFormatType34;
        ClipsTextFormatType clipsTextFormatType35 = new ClipsTextFormatType("STRONG", 34, "strong");
        A0b = clipsTextFormatType35;
        ClipsTextFormatType clipsTextFormatType36 = new ClipsTextFormatType("STRONG_V2", 35, "strong_v2");
        A0c = clipsTextFormatType36;
        ClipsTextFormatType clipsTextFormatType37 = new ClipsTextFormatType("TYPEWRITER", 36, "typewriter");
        A0d = clipsTextFormatType37;
        ClipsTextFormatType clipsTextFormatType38 = new ClipsTextFormatType("TYPEWRITER_V2", 37, "typewriter_v2");
        ClipsTextFormatType[] clipsTextFormatTypeArr = new ClipsTextFormatType[38];
        System.arraycopy(new ClipsTextFormatType[]{clipsTextFormatType, clipsTextFormatType2, clipsTextFormatType3, clipsTextFormatType4, clipsTextFormatType5, clipsTextFormatType6, clipsTextFormatType7, clipsTextFormatType8, clipsTextFormatType9, clipsTextFormatType10, clipsTextFormatType11, clipsTextFormatType12, clipsTextFormatType13, clipsTextFormatType14, clipsTextFormatType15, clipsTextFormatType16, clipsTextFormatType17, clipsTextFormatType18, clipsTextFormatType19, clipsTextFormatType20, clipsTextFormatType21, clipsTextFormatType22, clipsTextFormatType23, clipsTextFormatType24, clipsTextFormatType25, clipsTextFormatType26, clipsTextFormatType27}, 0, clipsTextFormatTypeArr, 0, 27);
        System.arraycopy(new ClipsTextFormatType[]{clipsTextFormatType28, clipsTextFormatType29, clipsTextFormatType30, clipsTextFormatType31, clipsTextFormatType32, clipsTextFormatType33, clipsTextFormatType34, clipsTextFormatType35, clipsTextFormatType36, clipsTextFormatType37, clipsTextFormatType38}, 0, clipsTextFormatTypeArr, 27, 11);
        A03 = clipsTextFormatTypeArr;
        A02 = AbstractC12190kN.A00(clipsTextFormatTypeArr);
        ClipsTextFormatType[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (ClipsTextFormatType clipsTextFormatType39 : values) {
            linkedHashMap.put(clipsTextFormatType39.A00, clipsTextFormatType39);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(70);
    }

    public static ClipsTextFormatType valueOf(String str) {
        return (ClipsTextFormatType) Enum.valueOf(ClipsTextFormatType.class, str);
    }

    public static ClipsTextFormatType[] values() {
        return (ClipsTextFormatType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTextFormatType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
