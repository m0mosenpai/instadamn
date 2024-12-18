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
/* loaded from: classes7.dex */
public final class UpcomingEventStickerSource implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UpcomingEventStickerSource[] A03;
    public static final UpcomingEventStickerSource A04;
    public static final UpcomingEventStickerSource A05;
    public static final UpcomingEventStickerSource A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        UpcomingEventStickerSource upcomingEventStickerSource = new UpcomingEventStickerSource("UNRECOGNIZED", 0, "UpcomingEventStickerSource_unspecified");
        A06 = upcomingEventStickerSource;
        UpcomingEventStickerSource upcomingEventStickerSource2 = new UpcomingEventStickerSource("FEED_RESHARE", 1, "feed_reshare");
        A04 = upcomingEventStickerSource2;
        UpcomingEventStickerSource upcomingEventStickerSource3 = new UpcomingEventStickerSource("STICKER_TRAY", 2, "sticker_tray");
        A05 = upcomingEventStickerSource3;
        UpcomingEventStickerSource[] upcomingEventStickerSourceArr = {upcomingEventStickerSource, upcomingEventStickerSource2, upcomingEventStickerSource3};
        A03 = upcomingEventStickerSourceArr;
        A02 = AbstractC12190kN.A00(upcomingEventStickerSourceArr);
        UpcomingEventStickerSource[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UpcomingEventStickerSource upcomingEventStickerSource4 : values) {
            A18.put(upcomingEventStickerSource4.A00, upcomingEventStickerSource4);
        }
        A01 = A18;
        CREATOR = C41857IgB.A00(76);
    }

    public static UpcomingEventStickerSource valueOf(String str) {
        return (UpcomingEventStickerSource) Enum.valueOf(UpcomingEventStickerSource.class, str);
    }

    public static UpcomingEventStickerSource[] values() {
        return (UpcomingEventStickerSource[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UpcomingEventStickerSource(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
