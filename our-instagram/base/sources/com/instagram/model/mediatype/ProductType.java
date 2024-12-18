package com.instagram.model.mediatype;

import X.C9Ay;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ProductType implements Parcelable {
    DIRECT_AUDIO("direct_audio"),
    FEED("feed"),
    IGTV("igtv"),
    LIVE("live"),
    LIVE_VOD("live_vod"),
    LONGFORM("longform"),
    NAMETAG("nametag"),
    PROFILE_PIC("profile_pic"),
    RAVEN("direct_story"),
    STORY("story"),
    SIDECAR("multipost"),
    MEMORY("memory"),
    AR_EFFECT_PREVIEW("ar_effect_preview"),
    CLIPS("clips"),
    UPCOMING_EVENT("upcoming_event"),
    FACEBOOK_VIDEO("facebook_video"),
    FEED_CAROUSEL("carousel_container"),
    AD("ad"),
    STORY_INTERACTION_RESPONSE("story_interaction_response"),
    PENDING_CAROUSEL_ITEM("pending_carousel_item"),
    EXPLORE_GRID("explore_shareable_grid"),
    PUBLIC_COLLECTION("public_collection"),
    REPOST_MEDIA_FACADE("repost_media_facade"),
    IG_REELS_AUDIO_AD("ig_reels_audio_ad"),
    CONTAINER("container"),
    UNKNOWN("unknown");

    public static final Map A01 = new HashMap();
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        for (ProductType productType : values()) {
            A01.put(productType.A00, productType);
        }
        CREATOR = new C9Ay(23);
    }

    ProductType(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
