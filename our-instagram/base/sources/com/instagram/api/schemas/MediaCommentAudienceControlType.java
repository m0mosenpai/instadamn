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
public final class MediaCommentAudienceControlType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MediaCommentAudienceControlType[] A03;
    public static final MediaCommentAudienceControlType A04;
    public static final MediaCommentAudienceControlType A05;
    public static final MediaCommentAudienceControlType A06;
    public static final MediaCommentAudienceControlType A07;
    public static final MediaCommentAudienceControlType A08;
    public static final MediaCommentAudienceControlType A09;
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
        MediaCommentAudienceControlType mediaCommentAudienceControlType = new MediaCommentAudienceControlType("UNRECOGNIZED", 0, "MediaCommentAudienceControlType_unspecified");
        A09 = mediaCommentAudienceControlType;
        MediaCommentAudienceControlType mediaCommentAudienceControlType2 = new MediaCommentAudienceControlType("EVERYONE", 1, "any");
        A05 = mediaCommentAudienceControlType2;
        MediaCommentAudienceControlType mediaCommentAudienceControlType3 = new MediaCommentAudienceControlType("ESTABLISHED_FOLLOWERS", 2, "established");
        A04 = mediaCommentAudienceControlType3;
        MediaCommentAudienceControlType mediaCommentAudienceControlType4 = new MediaCommentAudienceControlType("PEOPLE_FOLLOW_ME", 3, "follower");
        A06 = mediaCommentAudienceControlType4;
        MediaCommentAudienceControlType mediaCommentAudienceControlType5 = new MediaCommentAudienceControlType("PEOPLE_I_FOLLOW", 4, "following");
        A07 = mediaCommentAudienceControlType5;
        MediaCommentAudienceControlType mediaCommentAudienceControlType6 = new MediaCommentAudienceControlType("PEOPLE_I_FOLLOW_AND_PEOPLE_FOLLOW_ME", 5, "following_and_follower");
        A08 = mediaCommentAudienceControlType6;
        MediaCommentAudienceControlType[] mediaCommentAudienceControlTypeArr = {mediaCommentAudienceControlType, mediaCommentAudienceControlType2, mediaCommentAudienceControlType3, mediaCommentAudienceControlType4, mediaCommentAudienceControlType5, mediaCommentAudienceControlType6, new MediaCommentAudienceControlType("UNKNOWN", 6, "unknown")};
        A03 = mediaCommentAudienceControlTypeArr;
        A02 = AbstractC12190kN.A00(mediaCommentAudienceControlTypeArr);
        MediaCommentAudienceControlType[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (MediaCommentAudienceControlType mediaCommentAudienceControlType7 : values) {
            linkedHashMap.put(mediaCommentAudienceControlType7.A00, mediaCommentAudienceControlType7);
        }
        A01 = linkedHashMap;
        CREATOR = new C206159Ax(39);
    }

    public static MediaCommentAudienceControlType valueOf(String str) {
        return (MediaCommentAudienceControlType) Enum.valueOf(MediaCommentAudienceControlType.class, str);
    }

    public static MediaCommentAudienceControlType[] values() {
        return (MediaCommentAudienceControlType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public MediaCommentAudienceControlType(String str, int i, String str2) {
        this.A00 = str2;
    }
}
