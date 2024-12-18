package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ThreadThemeType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ThreadThemeType[] A03;
    public static final ThreadThemeType A04;
    public static final ThreadThemeType A05;
    public static final ThreadThemeType A06;
    public static final ThreadThemeType A07;
    public static final ThreadThemeType A08;
    public static final ThreadThemeType A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ThreadThemeType threadThemeType = new ThreadThemeType("UNRECOGNIZED", 0, "ThreadThemeType_unspecified");
        A09 = threadThemeType;
        ThreadThemeType threadThemeType2 = new ThreadThemeType("AI_GENERATED_THEME", 1, "7");
        A04 = threadThemeType2;
        ThreadThemeType threadThemeType3 = new ThreadThemeType("COLOR_GRADIENT", 2, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A05 = threadThemeType3;
        ThreadThemeType threadThemeType4 = new ThreadThemeType("IGD_CHANNEL_CUSTOMIZED_THEME", 3, "5");
        A06 = threadThemeType4;
        ThreadThemeType threadThemeType5 = new ThreadThemeType("THEME", 4, "2");
        A07 = threadThemeType5;
        ThreadThemeType threadThemeType6 = new ThreadThemeType("THIRD_PARTY", 5, "3");
        A08 = threadThemeType6;
        ThreadThemeType[] threadThemeTypeArr = {threadThemeType, threadThemeType2, threadThemeType3, threadThemeType4, threadThemeType5, threadThemeType6};
        A03 = threadThemeTypeArr;
        A02 = AbstractC12190kN.A00(threadThemeTypeArr);
        ThreadThemeType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ThreadThemeType threadThemeType7 : values) {
            A18.put(threadThemeType7.A00, threadThemeType7);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(68);
    }

    public static ThreadThemeType valueOf(String str) {
        return (ThreadThemeType) Enum.valueOf(ThreadThemeType.class, str);
    }

    public static ThreadThemeType[] values() {
        return (ThreadThemeType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ThreadThemeType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
