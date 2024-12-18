package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class ContentAppreciationDisclaimerType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContentAppreciationDisclaimerType[] A03;
    public static final ContentAppreciationDisclaimerType A04;
    public static final ContentAppreciationDisclaimerType A05;
    public static final ContentAppreciationDisclaimerType A06;
    public static final ContentAppreciationDisclaimerType A07;
    public static final ContentAppreciationDisclaimerType A08;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ContentAppreciationDisclaimerType contentAppreciationDisclaimerType = new ContentAppreciationDisclaimerType("UNRECOGNIZED", 0, "ContentAppreciationDisclaimerType_unspecified");
        A08 = contentAppreciationDisclaimerType;
        ContentAppreciationDisclaimerType contentAppreciationDisclaimerType2 = new ContentAppreciationDisclaimerType("NO_PAYOUT", 1, "no_payout");
        A04 = contentAppreciationDisclaimerType2;
        ContentAppreciationDisclaimerType contentAppreciationDisclaimerType3 = new ContentAppreciationDisclaimerType("PAYOUT", 2, "payout");
        A05 = contentAppreciationDisclaimerType3;
        ContentAppreciationDisclaimerType contentAppreciationDisclaimerType4 = new ContentAppreciationDisclaimerType("STAR_ELIGIBLE", 3, "star_eligible");
        A06 = contentAppreciationDisclaimerType4;
        ContentAppreciationDisclaimerType contentAppreciationDisclaimerType5 = new ContentAppreciationDisclaimerType("STAR_ONBOARDED", 4, "star_onboarded");
        A07 = contentAppreciationDisclaimerType5;
        ContentAppreciationDisclaimerType[] contentAppreciationDisclaimerTypeArr = {contentAppreciationDisclaimerType, contentAppreciationDisclaimerType2, contentAppreciationDisclaimerType3, contentAppreciationDisclaimerType4, contentAppreciationDisclaimerType5, new ContentAppreciationDisclaimerType("UNKNOWN", 5, "unknown")};
        A03 = contentAppreciationDisclaimerTypeArr;
        A02 = AbstractC12190kN.A00(contentAppreciationDisclaimerTypeArr);
        ContentAppreciationDisclaimerType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ContentAppreciationDisclaimerType contentAppreciationDisclaimerType6 : values) {
            A18.put(contentAppreciationDisclaimerType6.A00, contentAppreciationDisclaimerType6);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(31);
    }

    public static ContentAppreciationDisclaimerType valueOf(String str) {
        return (ContentAppreciationDisclaimerType) Enum.valueOf(ContentAppreciationDisclaimerType.class, str);
    }

    public static ContentAppreciationDisclaimerType[] values() {
        return (ContentAppreciationDisclaimerType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ContentAppreciationDisclaimerType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
