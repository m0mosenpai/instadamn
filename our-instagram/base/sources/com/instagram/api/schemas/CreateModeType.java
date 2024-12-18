package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206149Aw;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class CreateModeType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ CreateModeType[] A03;
    public static final CreateModeType A04;
    public static final CreateModeType A05;
    public static final CreateModeType A06;
    public static final CreateModeType A07;
    public static final CreateModeType A08;
    public static final CreateModeType A09;
    public static final CreateModeType A0A;
    public static final CreateModeType A0B;
    public static final CreateModeType A0C;
    public static final CreateModeType A0D;
    public static final CreateModeType A0E;
    public static final CreateModeType A0F;
    public static final CreateModeType A0G;
    public static final CreateModeType A0H;
    public static final CreateModeType A0I;
    public static final CreateModeType A0J;
    public static final CreateModeType A0K;
    public static final CreateModeType A0L;
    public static final CreateModeType A0M;
    public static final CreateModeType A0N;
    public static final CreateModeType A0O;
    public static final CreateModeType A0P;
    public static final CreateModeType A0Q;
    public static final CreateModeType A0R;
    public static final CreateModeType A0S;
    public static final CreateModeType A0T;
    public static final CreateModeType A0U;
    public static final CreateModeType A0V;
    public static final CreateModeType A0W;
    public static final CreateModeType A0X;
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
        CreateModeType createModeType = new CreateModeType("UNRECOGNIZED", 0, "CreateModeType_unspecified");
        A0X = createModeType;
        CreateModeType createModeType2 = new CreateModeType("AR_EFFECT", 1, "AR_EFFECT");
        A04 = createModeType2;
        CreateModeType createModeType3 = new CreateModeType("AVATAR_BACKGROUND", 2, "AVATAR_BACKGROUND");
        A05 = createModeType3;
        CreateModeType createModeType4 = new CreateModeType("AVATAR_EFFECT", 3, "AVATAR_EFFECT");
        A06 = createModeType4;
        CreateModeType createModeType5 = new CreateModeType("AVATAR_PLACEHOLDER", 4, "AVATAR_PLACEHOLDER");
        A07 = createModeType5;
        CreateModeType createModeType6 = new CreateModeType("AVATAR_PRESET", 5, "AVATAR_PRESET");
        A08 = createModeType6;
        CreateModeType createModeType7 = new CreateModeType("BOOMERANG", 6, "BOOMERANG");
        A09 = createModeType7;
        CreateModeType createModeType8 = new CreateModeType("CARDS", 7, "CARDS");
        A0A = createModeType8;
        CreateModeType createModeType9 = new CreateModeType("CLIPS", 8, "CLIPS");
        A0B = createModeType9;
        CreateModeType createModeType10 = new CreateModeType("COUNTDOWN", 9, "COUNTDOWN");
        A0C = createModeType10;
        CreateModeType createModeType11 = new CreateModeType("DISCOVERY_SURFACE", 10, "DISCOVERY_SURFACE");
        A0D = createModeType11;
        CreateModeType createModeType12 = new CreateModeType("ELECTIONS", 11, "ELECTIONS");
        A0E = createModeType12;
        CreateModeType createModeType13 = new CreateModeType("EMPTY", 12, "EMPTY");
        A0F = createModeType13;
        CreateModeType createModeType14 = new CreateModeType("FILTER", 13, "FILTER");
        A0G = createModeType14;
        CreateModeType createModeType15 = new CreateModeType("GIFS", 14, "GIFS");
        A0H = createModeType15;
        CreateModeType createModeType16 = new CreateModeType("GROUP_POLL", 15, "GROUP_POLL");
        A0I = createModeType16;
        CreateModeType createModeType17 = new CreateModeType("HANDSFREE", 16, "HANDSFREE");
        A0J = createModeType17;
        CreateModeType createModeType18 = new CreateModeType("HAPPENING_NOW", 17, "HAPPENING_NOW");
        A0K = createModeType18;
        CreateModeType createModeType19 = new CreateModeType("LAST_CHANCE", 18, "LAST_CHANCE");
        A0L = createModeType19;
        CreateModeType createModeType20 = new CreateModeType("LAYOUT", 19, "LAYOUT");
        A0M = createModeType20;
        CreateModeType createModeType21 = new CreateModeType("LOADING_AR_EFFECT", 20, "LOADING_AR_EFFECT");
        A0N = createModeType21;
        CreateModeType createModeType22 = new CreateModeType("MEMORIES", 21, "MEMORIES");
        A0O = createModeType22;
        CreateModeType createModeType23 = new CreateModeType("MENTIONS", 22, "MENTIONS");
        A0P = createModeType23;
        CreateModeType createModeType24 = new CreateModeType("MUSIC", 23, "MUSIC");
        A0Q = createModeType24;
        CreateModeType createModeType25 = new CreateModeType("POLL", 24, "POLL");
        A0R = createModeType25;
        CreateModeType createModeType26 = new CreateModeType("QUESTIONS", 25, "QUESTIONS");
        A0S = createModeType26;
        CreateModeType createModeType27 = new CreateModeType("QUESTION_RESPONSES", 26, "QUESTION_RESPONSES");
        A0T = createModeType27;
        CreateModeType createModeType28 = new CreateModeType("QUIZ", 27, "QUIZ");
        A0U = createModeType28;
        CreateModeType createModeType29 = new CreateModeType("STOPMOTION", 28, "STOPMOTION");
        A0V = createModeType29;
        CreateModeType createModeType30 = new CreateModeType("TEMPLATES", 29, "TEMPLATES");
        A0W = createModeType30;
        CreateModeType createModeType31 = new CreateModeType(CredentialProviderBaseController.TYPE_TAG, 30, CredentialProviderBaseController.TYPE_TAG);
        CreateModeType[] createModeTypeArr = new CreateModeType[31];
        System.arraycopy(new CreateModeType[]{createModeType, createModeType2, createModeType3, createModeType4, createModeType5, createModeType6, createModeType7, createModeType8, createModeType9, createModeType10, createModeType11, createModeType12, createModeType13, createModeType14, createModeType15, createModeType16, createModeType17, createModeType18, createModeType19, createModeType20, createModeType21, createModeType22, createModeType23, createModeType24, createModeType25, createModeType26, createModeType27}, 0, createModeTypeArr, 0, 27);
        System.arraycopy(new CreateModeType[]{createModeType28, createModeType29, createModeType30, createModeType31}, 0, createModeTypeArr, 27, 4);
        A03 = createModeTypeArr;
        A02 = AbstractC12190kN.A00(createModeTypeArr);
        CreateModeType[] values = values();
        int A0L2 = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L2 < 16 ? 16 : A0L2);
        for (CreateModeType createModeType32 : values) {
            linkedHashMap.put(createModeType32.A00, createModeType32);
        }
        A01 = linkedHashMap;
        CREATOR = new C206149Aw(81);
    }

    public static CreateModeType valueOf(String str) {
        return (CreateModeType) Enum.valueOf(CreateModeType.class, str);
    }

    public static CreateModeType[] values() {
        return (CreateModeType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public CreateModeType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
