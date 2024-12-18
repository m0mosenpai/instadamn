package com.instagram.videofeed.intf;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class VideoFeedType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ VideoFeedType[] A01;
    public static final VideoFeedType A02;
    public static final VideoFeedType A03;
    public static final VideoFeedType A04;
    public static final VideoFeedType A05;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this);
    }

    static {
        VideoFeedType videoFeedType = new VideoFeedType("EXPLORE_CHANNEL", 0);
        A02 = videoFeedType;
        VideoFeedType videoFeedType2 = new VideoFeedType("EXPLORE_MEDIA_VIDEO_CHAINING", 1);
        A04 = videoFeedType2;
        VideoFeedType videoFeedType3 = new VideoFeedType("EXPLORE_IGTV_PREVIEW", 2);
        A03 = videoFeedType3;
        VideoFeedType videoFeedType4 = new VideoFeedType("KEYWORD_CHANNEL", 3);
        A05 = videoFeedType4;
        VideoFeedType[] videoFeedTypeArr = {videoFeedType, videoFeedType2, videoFeedType3, videoFeedType4, new VideoFeedType("HASHTAG_CHANNEL", 4)};
        A01 = videoFeedTypeArr;
        A00 = AbstractC12190kN.A00(videoFeedTypeArr);
        CREATOR = new C55344OhA(29);
    }

    public static VideoFeedType valueOf(String str) {
        return (VideoFeedType) Enum.valueOf(VideoFeedType.class, str);
    }

    public static VideoFeedType[] values() {
        return (VideoFeedType[]) A01.clone();
    }

    public VideoFeedType(String str, int i) {
    }
}
