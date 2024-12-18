package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MediaNoticeIcon implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaNoticeIcon[] A03;
    public static final MediaNoticeIcon A04;
    public static final MediaNoticeIcon A05;
    public static final MediaNoticeIcon A06;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MediaNoticeIcon mediaNoticeIcon = new MediaNoticeIcon("UNRECOGNIZED", 0, "MediaNoticeIcon_unspecified");
        A05 = mediaNoticeIcon;
        MediaNoticeIcon mediaNoticeIcon2 = new MediaNoticeIcon("INFO", 1, "info");
        A04 = mediaNoticeIcon2;
        MediaNoticeIcon mediaNoticeIcon3 = new MediaNoticeIcon("WARNING", 2, "warning");
        A06 = mediaNoticeIcon3;
        MediaNoticeIcon[] mediaNoticeIconArr = {mediaNoticeIcon, mediaNoticeIcon2, mediaNoticeIcon3};
        A03 = mediaNoticeIconArr;
        A02 = AbstractC12190kN.A00(mediaNoticeIconArr);
        MediaNoticeIcon[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MediaNoticeIcon mediaNoticeIcon4 : values) {
            A18.put(mediaNoticeIcon4.A00, mediaNoticeIcon4);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(87);
    }

    public static MediaNoticeIcon valueOf(String str) {
        return (MediaNoticeIcon) Enum.valueOf(MediaNoticeIcon.class, str);
    }

    public static MediaNoticeIcon[] values() {
        return (MediaNoticeIcon[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaNoticeIcon(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
