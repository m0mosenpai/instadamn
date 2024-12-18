package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class TextAppShareIgDirectContactRecommendationEntityType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ TextAppShareIgDirectContactRecommendationEntityType[] A03;
    public static final TextAppShareIgDirectContactRecommendationEntityType A04;
    public static final TextAppShareIgDirectContactRecommendationEntityType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        TextAppShareIgDirectContactRecommendationEntityType textAppShareIgDirectContactRecommendationEntityType = new TextAppShareIgDirectContactRecommendationEntityType("UNRECOGNIZED", 0, "TextAppShareIgDirectContactRecommendationEntityType_unspecified");
        A05 = textAppShareIgDirectContactRecommendationEntityType;
        TextAppShareIgDirectContactRecommendationEntityType textAppShareIgDirectContactRecommendationEntityType2 = new TextAppShareIgDirectContactRecommendationEntityType("THREAD", 1, "thread");
        A04 = textAppShareIgDirectContactRecommendationEntityType2;
        TextAppShareIgDirectContactRecommendationEntityType[] textAppShareIgDirectContactRecommendationEntityTypeArr = {textAppShareIgDirectContactRecommendationEntityType, textAppShareIgDirectContactRecommendationEntityType2, new TextAppShareIgDirectContactRecommendationEntityType("USER", 2, PublicKeyCredentialControllerUtility.JSON_KEY_USER)};
        A03 = textAppShareIgDirectContactRecommendationEntityTypeArr;
        A02 = AbstractC12190kN.A00(textAppShareIgDirectContactRecommendationEntityTypeArr);
        TextAppShareIgDirectContactRecommendationEntityType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (TextAppShareIgDirectContactRecommendationEntityType textAppShareIgDirectContactRecommendationEntityType3 : values) {
            A18.put(textAppShareIgDirectContactRecommendationEntityType3.A00, textAppShareIgDirectContactRecommendationEntityType3);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(52);
    }

    public static TextAppShareIgDirectContactRecommendationEntityType valueOf(String str) {
        return (TextAppShareIgDirectContactRecommendationEntityType) Enum.valueOf(TextAppShareIgDirectContactRecommendationEntityType.class, str);
    }

    public static TextAppShareIgDirectContactRecommendationEntityType[] values() {
        return (TextAppShareIgDirectContactRecommendationEntityType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public TextAppShareIgDirectContactRecommendationEntityType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
