package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class INLINE_SURVEY_QUESTION_TYPES implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ INLINE_SURVEY_QUESTION_TYPES[] A03;
    public static final INLINE_SURVEY_QUESTION_TYPES A04;
    public static final INLINE_SURVEY_QUESTION_TYPES A05;
    public static final INLINE_SURVEY_QUESTION_TYPES A06;
    public static final INLINE_SURVEY_QUESTION_TYPES A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = new INLINE_SURVEY_QUESTION_TYPES("UNRECOGNIZED", 0, "INLINE_SURVEY_QUESTION_TYPES_unspecified");
        A07 = inline_survey_question_types;
        INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types2 = new INLINE_SURVEY_QUESTION_TYPES("COMMENT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A04 = inline_survey_question_types2;
        INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types3 = new INLINE_SURVEY_QUESTION_TYPES("MULTIPLE", 2, "multiple");
        A05 = inline_survey_question_types3;
        INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types4 = new INLINE_SURVEY_QUESTION_TYPES("SINGLE", 3, "single");
        A06 = inline_survey_question_types4;
        INLINE_SURVEY_QUESTION_TYPES[] inline_survey_question_typesArr = {inline_survey_question_types, inline_survey_question_types2, inline_survey_question_types3, inline_survey_question_types4};
        A03 = inline_survey_question_typesArr;
        A02 = AbstractC12190kN.A00(inline_survey_question_typesArr);
        INLINE_SURVEY_QUESTION_TYPES[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types5 : values) {
            A18.put(inline_survey_question_types5.A00, inline_survey_question_types5);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(51);
    }

    public static INLINE_SURVEY_QUESTION_TYPES valueOf(String str) {
        return (INLINE_SURVEY_QUESTION_TYPES) Enum.valueOf(INLINE_SURVEY_QUESTION_TYPES.class, str);
    }

    public static INLINE_SURVEY_QUESTION_TYPES[] values() {
        return (INLINE_SURVEY_QUESTION_TYPES[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public INLINE_SURVEY_QUESTION_TYPES(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
