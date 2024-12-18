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
/* loaded from: classes5.dex */
public final class ContentAppreciationLoggingOnboardingStatusEnum implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ContentAppreciationLoggingOnboardingStatusEnum[] A03;
    public static final ContentAppreciationLoggingOnboardingStatusEnum A04;
    public static final ContentAppreciationLoggingOnboardingStatusEnum A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ContentAppreciationLoggingOnboardingStatusEnum contentAppreciationLoggingOnboardingStatusEnum = new ContentAppreciationLoggingOnboardingStatusEnum("UNRECOGNIZED", 0, "ContentAppreciationLoggingOnboardingStatusEnum_unspecified");
        A05 = contentAppreciationLoggingOnboardingStatusEnum;
        ContentAppreciationLoggingOnboardingStatusEnum contentAppreciationLoggingOnboardingStatusEnum2 = new ContentAppreciationLoggingOnboardingStatusEnum("ONBOARDED", 1, "onboarded");
        A04 = contentAppreciationLoggingOnboardingStatusEnum2;
        ContentAppreciationLoggingOnboardingStatusEnum[] contentAppreciationLoggingOnboardingStatusEnumArr = {contentAppreciationLoggingOnboardingStatusEnum, contentAppreciationLoggingOnboardingStatusEnum2, new ContentAppreciationLoggingOnboardingStatusEnum("NOT_ONBOARDED", 2, "not_onboarded")};
        A03 = contentAppreciationLoggingOnboardingStatusEnumArr;
        A02 = AbstractC12190kN.A00(contentAppreciationLoggingOnboardingStatusEnumArr);
        ContentAppreciationLoggingOnboardingStatusEnum[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ContentAppreciationLoggingOnboardingStatusEnum contentAppreciationLoggingOnboardingStatusEnum3 : values) {
            A18.put(contentAppreciationLoggingOnboardingStatusEnum3.A00, contentAppreciationLoggingOnboardingStatusEnum3);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(34);
    }

    public static ContentAppreciationLoggingOnboardingStatusEnum valueOf(String str) {
        return (ContentAppreciationLoggingOnboardingStatusEnum) Enum.valueOf(ContentAppreciationLoggingOnboardingStatusEnum.class, str);
    }

    public static ContentAppreciationLoggingOnboardingStatusEnum[] values() {
        return (ContentAppreciationLoggingOnboardingStatusEnum[]) A03.clone();
    }

    public ContentAppreciationLoggingOnboardingStatusEnum(String str, int i, String str2) {
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
