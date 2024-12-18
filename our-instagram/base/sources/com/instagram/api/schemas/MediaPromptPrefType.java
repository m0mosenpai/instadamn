package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MediaPromptPrefType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaPromptPrefType[] A03;
    public static final MediaPromptPrefType A04;
    public static final MediaPromptPrefType A05;
    public static final MediaPromptPrefType A06;
    public static final MediaPromptPrefType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaPromptPrefType mediaPromptPrefType = new MediaPromptPrefType("UNRECOGNIZED", 0, "MediaPromptPrefType_unspecified");
        A07 = mediaPromptPrefType;
        MediaPromptPrefType mediaPromptPrefType2 = new MediaPromptPrefType("NOT_APPLICABLE", 1, "0");
        A04 = mediaPromptPrefType2;
        MediaPromptPrefType mediaPromptPrefType3 = new MediaPromptPrefType("OFF", 2, "2");
        A05 = mediaPromptPrefType3;
        MediaPromptPrefType mediaPromptPrefType4 = new MediaPromptPrefType("ON", 3, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A06 = mediaPromptPrefType4;
        MediaPromptPrefType[] mediaPromptPrefTypeArr = {mediaPromptPrefType, mediaPromptPrefType2, mediaPromptPrefType3, mediaPromptPrefType4};
        A03 = mediaPromptPrefTypeArr;
        A02 = AbstractC12190kN.A00(mediaPromptPrefTypeArr);
        MediaPromptPrefType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaPromptPrefType mediaPromptPrefType5 : values) {
            A18.put(mediaPromptPrefType5.A00, mediaPromptPrefType5);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(88);
    }

    public static MediaPromptPrefType valueOf(String str) {
        return (MediaPromptPrefType) Enum.valueOf(MediaPromptPrefType.class, str);
    }

    public static MediaPromptPrefType[] values() {
        return (MediaPromptPrefType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaPromptPrefType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
