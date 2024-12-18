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
public final class IGLiveBadgeSettings implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ IGLiveBadgeSettings[] A03;
    public static final IGLiveBadgeSettings A04;
    public static final IGLiveBadgeSettings A05;
    public static final IGLiveBadgeSettings A06;
    public static final IGLiveBadgeSettings A07;
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
        IGLiveBadgeSettings iGLiveBadgeSettings = new IGLiveBadgeSettings("UNRECOGNIZED", 0, "IGLiveBadgeSettings_unspecified");
        A06 = iGLiveBadgeSettings;
        IGLiveBadgeSettings iGLiveBadgeSettings2 = new IGLiveBadgeSettings("OFF", 1, "off");
        A04 = iGLiveBadgeSettings2;
        IGLiveBadgeSettings iGLiveBadgeSettings3 = new IGLiveBadgeSettings("ON", 2, "on");
        A05 = iGLiveBadgeSettings3;
        IGLiveBadgeSettings iGLiveBadgeSettings4 = new IGLiveBadgeSettings("UNSET", 3, "");
        A07 = iGLiveBadgeSettings4;
        IGLiveBadgeSettings[] iGLiveBadgeSettingsArr = {iGLiveBadgeSettings, iGLiveBadgeSettings2, iGLiveBadgeSettings3, iGLiveBadgeSettings4};
        A03 = iGLiveBadgeSettingsArr;
        A02 = AbstractC12190kN.A00(iGLiveBadgeSettingsArr);
        IGLiveBadgeSettings[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (IGLiveBadgeSettings iGLiveBadgeSettings5 : values) {
            linkedHashMap.put(iGLiveBadgeSettings5.A00, iGLiveBadgeSettings5);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(17);
    }

    public static IGLiveBadgeSettings valueOf(String str) {
        return (IGLiveBadgeSettings) Enum.valueOf(IGLiveBadgeSettings.class, str);
    }

    public static IGLiveBadgeSettings[] values() {
        return (IGLiveBadgeSettings[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public IGLiveBadgeSettings(String str, int i, String str2) {
        this.A00 = str2;
    }
}
