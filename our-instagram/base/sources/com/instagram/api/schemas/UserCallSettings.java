package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class UserCallSettings implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UserCallSettings[] A03;
    public static final UserCallSettings A04;
    public static final UserCallSettings A05;
    public static final UserCallSettings A06;
    public static final UserCallSettings A07;
    public static final UserCallSettings A08;
    public static final UserCallSettings A09;
    public static final UserCallSettings A0A;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        UserCallSettings userCallSettings = new UserCallSettings("UNRECOGNIZED", 0, "UserCallSettings_unspecified");
        A0A = userCallSettings;
        UserCallSettings userCallSettings2 = new UserCallSettings("EVERYONE", 1, "everyone");
        A04 = userCallSettings2;
        UserCallSettings userCallSettings3 = new UserCallSettings("OFF", 2, "off");
        A05 = userCallSettings3;
        UserCallSettings userCallSettings4 = new UserCallSettings("PEOPLE_YOU_FOLLOW", 3, "people_you_follow");
        A06 = userCallSettings4;
        UserCallSettings userCallSettings5 = new UserCallSettings("PEOPLE_YOU_FOLLOW_WHO_FOLLOW_BACK", 4, "people_you_follow_who_follow_back");
        A07 = userCallSettings5;
        UserCallSettings userCallSettings6 = new UserCallSettings("PEOPLE_YOU_MESSAGE", 5, "people_you_message");
        A08 = userCallSettings6;
        UserCallSettings userCallSettings7 = new UserCallSettings("SPECIFIC_PEOPLE", 6, "specific_people");
        A09 = userCallSettings7;
        UserCallSettings[] userCallSettingsArr = {userCallSettings, userCallSettings2, userCallSettings3, userCallSettings4, userCallSettings5, userCallSettings6, userCallSettings7};
        A03 = userCallSettingsArr;
        A02 = AbstractC12190kN.A00(userCallSettingsArr);
        UserCallSettings[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UserCallSettings userCallSettings8 : values) {
            A18.put(userCallSettings8.A00, userCallSettings8);
        }
        A01 = A18;
        CREATOR = new C41857IgB(80);
    }

    public static UserCallSettings valueOf(String str) {
        return (UserCallSettings) Enum.valueOf(UserCallSettings.class, str);
    }

    public static UserCallSettings[] values() {
        return (UserCallSettings[]) A03.clone();
    }

    public UserCallSettings(String str, int i, String str2) {
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
