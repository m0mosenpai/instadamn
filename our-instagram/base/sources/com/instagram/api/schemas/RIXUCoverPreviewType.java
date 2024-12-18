package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class RIXUCoverPreviewType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ RIXUCoverPreviewType[] A03;
    public static final RIXUCoverPreviewType A04;
    public static final RIXUCoverPreviewType A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        RIXUCoverPreviewType rIXUCoverPreviewType = new RIXUCoverPreviewType("UNRECOGNIZED", 0, "RIXUCoverPreviewType_unspecified");
        A05 = rIXUCoverPreviewType;
        RIXUCoverPreviewType rIXUCoverPreviewType2 = new RIXUCoverPreviewType("BOOMERANG", 1, "boomerang");
        A04 = rIXUCoverPreviewType2;
        RIXUCoverPreviewType[] rIXUCoverPreviewTypeArr = {rIXUCoverPreviewType, rIXUCoverPreviewType2, new RIXUCoverPreviewType("VIDEO", 2, MediaStreamTrack.VIDEO_TRACK_KIND)};
        A03 = rIXUCoverPreviewTypeArr;
        A02 = AbstractC12190kN.A00(rIXUCoverPreviewTypeArr);
        RIXUCoverPreviewType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (RIXUCoverPreviewType rIXUCoverPreviewType3 : values) {
            A18.put(rIXUCoverPreviewType3.A00, rIXUCoverPreviewType3);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(82);
    }

    public static RIXUCoverPreviewType valueOf(String str) {
        return (RIXUCoverPreviewType) Enum.valueOf(RIXUCoverPreviewType.class, str);
    }

    public static RIXUCoverPreviewType[] values() {
        return (RIXUCoverPreviewType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public RIXUCoverPreviewType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
