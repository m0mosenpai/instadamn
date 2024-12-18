package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class AppColorMode implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ AppColorMode[] A03;
    public static final AppColorMode A04;
    public static final AppColorMode A05;
    public static final AppColorMode A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        AppColorMode appColorMode = new AppColorMode("UNRECOGNIZED", 0, "AppColorMode_unspecified");
        A06 = appColorMode;
        AppColorMode appColorMode2 = new AppColorMode("DARK", 1, "DARK");
        A04 = appColorMode2;
        AppColorMode appColorMode3 = new AppColorMode(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A05 = appColorMode3;
        AppColorMode[] appColorModeArr = {appColorMode, appColorMode2, appColorMode3, new AppColorMode("NORMAL", 3, "NORMAL")};
        A03 = appColorModeArr;
        A02 = AbstractC12190kN.A00(appColorModeArr);
        AppColorMode[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (AppColorMode appColorMode4 : values) {
            A18.put(appColorMode4.A00, appColorMode4);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(48);
    }

    public static AppColorMode valueOf(String str) {
        return (AppColorMode) Enum.valueOf(AppColorMode.class, str);
    }

    public static AppColorMode[] values() {
        return (AppColorMode[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public AppColorMode(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
