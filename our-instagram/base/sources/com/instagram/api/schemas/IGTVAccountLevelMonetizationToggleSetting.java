package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC16850sd;
import X.C14360o3;
import X.C206159Ax;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IGTVAccountLevelMonetizationToggleSetting implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGTVAccountLevelMonetizationToggleSetting[] A03;
    public static final IGTVAccountLevelMonetizationToggleSetting A04;
    public static final IGTVAccountLevelMonetizationToggleSetting A05;
    public static final IGTVAccountLevelMonetizationToggleSetting A06;
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
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting = new IGTVAccountLevelMonetizationToggleSetting("UNRECOGNIZED", 0, "IGTVAccountLevelMonetizationToggleSetting_unspecified");
        A06 = iGTVAccountLevelMonetizationToggleSetting;
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting2 = new IGTVAccountLevelMonetizationToggleSetting("TOGGLED_OFF", 1, "toggled_off");
        A04 = iGTVAccountLevelMonetizationToggleSetting2;
        IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting3 = new IGTVAccountLevelMonetizationToggleSetting("TOGGLED_ON", 2, "toggled_on");
        A05 = iGTVAccountLevelMonetizationToggleSetting3;
        IGTVAccountLevelMonetizationToggleSetting[] iGTVAccountLevelMonetizationToggleSettingArr = {iGTVAccountLevelMonetizationToggleSetting, iGTVAccountLevelMonetizationToggleSetting2, iGTVAccountLevelMonetizationToggleSetting3};
        A03 = iGTVAccountLevelMonetizationToggleSettingArr;
        A02 = AbstractC12190kN.A00(iGTVAccountLevelMonetizationToggleSettingArr);
        IGTVAccountLevelMonetizationToggleSetting[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGTVAccountLevelMonetizationToggleSetting iGTVAccountLevelMonetizationToggleSetting4 : values) {
            linkedHashMap.put(iGTVAccountLevelMonetizationToggleSetting4.A00, iGTVAccountLevelMonetizationToggleSetting4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(26);
    }

    public static IGTVAccountLevelMonetizationToggleSetting valueOf(String str) {
        return (IGTVAccountLevelMonetizationToggleSetting) Enum.valueOf(IGTVAccountLevelMonetizationToggleSetting.class, str);
    }

    public static IGTVAccountLevelMonetizationToggleSetting[] values() {
        return (IGTVAccountLevelMonetizationToggleSetting[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGTVAccountLevelMonetizationToggleSetting(String str, int i, String str2) {
        this.A00 = str2;
    }
}
