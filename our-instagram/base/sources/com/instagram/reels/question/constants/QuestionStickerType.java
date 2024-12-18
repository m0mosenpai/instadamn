package com.instagram.reels.question.constants;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class QuestionStickerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ QuestionStickerType[] A03;
    public static final QuestionStickerType A04;
    public static final QuestionStickerType A05;
    public static final QuestionStickerType A06;
    public static final QuestionStickerType A07;
    public static final QuestionStickerType A08;
    public static final QuestionStickerType A09;
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
        QuestionStickerType questionStickerType = new QuestionStickerType("UNRECOGNIZED", 0, "QuestionStickerType_unspecified");
        A09 = questionStickerType;
        QuestionStickerType questionStickerType2 = new QuestionStickerType("ANON", 1, "anon");
        A04 = questionStickerType2;
        QuestionStickerType questionStickerType3 = new QuestionStickerType("LOCATION", 2, "location");
        A05 = questionStickerType3;
        QuestionStickerType questionStickerType4 = new QuestionStickerType("MUSIC", 3, "music");
        A06 = questionStickerType4;
        QuestionStickerType questionStickerType5 = new QuestionStickerType("PICS_PLEASE", 4, "pics_please");
        A07 = questionStickerType5;
        QuestionStickerType questionStickerType6 = new QuestionStickerType("TEXT", 5, "text");
        A08 = questionStickerType6;
        QuestionStickerType[] questionStickerTypeArr = {questionStickerType, questionStickerType2, questionStickerType3, questionStickerType4, questionStickerType5, questionStickerType6};
        A03 = questionStickerTypeArr;
        A02 = AbstractC12190kN.A00(questionStickerTypeArr);
        QuestionStickerType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (QuestionStickerType questionStickerType7 : values) {
            linkedHashMap.put(questionStickerType7.A00, questionStickerType7);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(57);
    }

    public static QuestionStickerType valueOf(String str) {
        return (QuestionStickerType) Enum.valueOf(QuestionStickerType.class, str);
    }

    public static QuestionStickerType[] values() {
        return (QuestionStickerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public QuestionStickerType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
