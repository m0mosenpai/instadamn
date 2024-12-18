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
/* loaded from: classes3.dex */
public final class MediaNoteMimicryTrigger implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaNoteMimicryTrigger[] A03;
    public static final MediaNoteMimicryTrigger A04;
    public static final MediaNoteMimicryTrigger A05;
    public static final MediaNoteMimicryTrigger A06;
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
        MediaNoteMimicryTrigger mediaNoteMimicryTrigger = new MediaNoteMimicryTrigger("UNRECOGNIZED", 0, "MediaNoteMimicryTrigger_unspecified");
        A06 = mediaNoteMimicryTrigger;
        MediaNoteMimicryTrigger mediaNoteMimicryTrigger2 = new MediaNoteMimicryTrigger("DWELL_TRIGGER", 1, "dwell_trigger");
        A04 = mediaNoteMimicryTrigger2;
        MediaNoteMimicryTrigger mediaNoteMimicryTrigger3 = new MediaNoteMimicryTrigger("LIKE_TRIGGER", 2, "like_trigger");
        A05 = mediaNoteMimicryTrigger3;
        MediaNoteMimicryTrigger[] mediaNoteMimicryTriggerArr = {mediaNoteMimicryTrigger, mediaNoteMimicryTrigger2, mediaNoteMimicryTrigger3, new MediaNoteMimicryTrigger("ON_IMPRESSION", 3, "on_impression")};
        A03 = mediaNoteMimicryTriggerArr;
        A02 = AbstractC12190kN.A00(mediaNoteMimicryTriggerArr);
        MediaNoteMimicryTrigger[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MediaNoteMimicryTrigger mediaNoteMimicryTrigger4 : values) {
            linkedHashMap.put(mediaNoteMimicryTrigger4.A00, mediaNoteMimicryTrigger4);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(42);
    }

    public static MediaNoteMimicryTrigger valueOf(String str) {
        return (MediaNoteMimicryTrigger) Enum.valueOf(MediaNoteMimicryTrigger.class, str);
    }

    public static MediaNoteMimicryTrigger[] values() {
        return (MediaNoteMimicryTrigger[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaNoteMimicryTrigger(String str, int i, String str2) {
        this.A00 = str2;
    }
}
