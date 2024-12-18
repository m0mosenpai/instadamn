package com.instagram.reels.question.model.responsetype;

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
/* loaded from: classes4.dex */
public final class QuestionResponseType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ QuestionResponseType[] A03;
    public static final QuestionResponseType A04;
    public static final QuestionResponseType A05;
    public static final QuestionResponseType A06;
    public static final QuestionResponseType A07;
    public static final QuestionResponseType A08;
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
        QuestionResponseType questionResponseType = new QuestionResponseType("UNRECOGNIZED", 0, "QuestionResponseType_unspecified");
        A08 = questionResponseType;
        QuestionResponseType questionResponseType2 = new QuestionResponseType("LOCATION", 1, "location");
        A04 = questionResponseType2;
        QuestionResponseType questionResponseType3 = new QuestionResponseType("MEDIA", 2, "media");
        A05 = questionResponseType3;
        QuestionResponseType questionResponseType4 = new QuestionResponseType("MUSIC", 3, "music");
        A06 = questionResponseType4;
        QuestionResponseType questionResponseType5 = new QuestionResponseType("TEXT", 4, "text");
        A07 = questionResponseType5;
        QuestionResponseType[] questionResponseTypeArr = {questionResponseType, questionResponseType2, questionResponseType3, questionResponseType4, questionResponseType5};
        A03 = questionResponseTypeArr;
        A02 = AbstractC12190kN.A00(questionResponseTypeArr);
        QuestionResponseType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (QuestionResponseType questionResponseType6 : values) {
            linkedHashMap.put(questionResponseType6.A00, questionResponseType6);
        }
        A01 = linkedHashMap;
        CREATOR = new C9Ay(58);
    }

    public static QuestionResponseType valueOf(String str) {
        return (QuestionResponseType) Enum.valueOf(QuestionResponseType.class, str);
    }

    public static QuestionResponseType[] values() {
        return (QuestionResponseType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public QuestionResponseType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
