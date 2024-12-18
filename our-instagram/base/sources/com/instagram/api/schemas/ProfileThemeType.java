package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ProfileThemeType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ProfileThemeType[] A03;
    public static final ProfileThemeType A04;
    public static final ProfileThemeType A05;
    public static final ProfileThemeType A06;
    public static final ProfileThemeType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ProfileThemeType profileThemeType = new ProfileThemeType("UNRECOGNIZED", 0, "ProfileThemeType_unspecified");
        A07 = profileThemeType;
        ProfileThemeType profileThemeType2 = new ProfileThemeType("COLOR_GRADIENT", 1, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A04 = profileThemeType2;
        ProfileThemeType profileThemeType3 = new ProfileThemeType("CUSTOM_IMAGE", 2, "3");
        A05 = profileThemeType3;
        ProfileThemeType profileThemeType4 = new ProfileThemeType(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, "0");
        A06 = profileThemeType4;
        ProfileThemeType[] profileThemeTypeArr = {profileThemeType, profileThemeType2, profileThemeType3, profileThemeType4, new ProfileThemeType("THEME", 4, "2")};
        A03 = profileThemeTypeArr;
        A02 = AbstractC12190kN.A00(profileThemeTypeArr);
        ProfileThemeType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ProfileThemeType profileThemeType5 : values) {
            A18.put(profileThemeType5.A00, profileThemeType5);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(75);
    }

    public static ProfileThemeType valueOf(String str) {
        return (ProfileThemeType) Enum.valueOf(ProfileThemeType.class, str);
    }

    public static ProfileThemeType[] values() {
        return (ProfileThemeType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ProfileThemeType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
